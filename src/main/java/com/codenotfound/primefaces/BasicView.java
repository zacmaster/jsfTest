package com.codenotfound.primefaces;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ApplicationScoped
@ManagedBean
public class BasicView {
     
    private String text;
    
    private ArrayList<String> list;
    
    
    @PostConstruct
    public void init() {
    	
    	
    	list = new ArrayList<>();
    	list.add("word 1");
    	list.add("word 2");
    	list.add("word 3");
    	list.add("word 4");
    	
    }
    
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
    public void addElement(){
    	if(this.text != null && !this.text.equals("")) {
    		this.list.add(text);
    		this.text = "";
    	}
    }
	public ArrayList<String> getList() {
		return list;
	}

	public void setList(ArrayList<String> list) {
		this.list = list;
	}
	
	
    
    
}