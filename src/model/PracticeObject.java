/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * 
 * @author Julian Markowskyj <julian.markowskyj at gmail.com>
 */
public class PracticeObject {
    private int id;
    private String description;
    private int idType;

    public PracticeObject() {
    }

    public PracticeObject(int id, String description, int idType) {
        this.id = id;
        this.description = description;
        this.idType = idType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    @Override
    public String toString() {
        return description;
    }
    
    
    
}
