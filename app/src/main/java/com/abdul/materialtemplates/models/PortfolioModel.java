package com.abdul.materialtemplates.models;

public class PortfolioModel {
    private String id;
    private String name;
    private int source;
    
    public PortfolioModel(String id, String name, int source) {
        this.id = id;
        this.name = name;
        this.source = source;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getSource() {
        return source;
    }
    
    public void setSource(int source) {
        this.source = source;
    }
}
