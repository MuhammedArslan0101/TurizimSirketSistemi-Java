/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Muhammed ARSLAN
 */
public class Document {
    private int doc_id ;
    private String name ;
    private String type ;
    private String path ; 

    public Document() {
    }

    public Document(int doc_id, String name, String type, String path) {
        this.doc_id = doc_id;
        this.name = name;
        this.type = type;
        this.path = path;
    }

    public int getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(int doc_id) {
        this.doc_id = doc_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Document{" + "doc_id=" + doc_id + ", name=" + name + ", type=" + type + ", path=" + path + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.doc_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Document other = (Document) obj;
        if (this.doc_id != other.doc_id) {
            return false;
        }
        return true;
    }
    
    
    
    
}
