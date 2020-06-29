import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class Manager extends Employee{
    private List<String> documents;
    public Manager(String name, List<String> Documents){
        super(name);
        this.documents = Documents;
    }

    /**
     * @return the documents
     */
    private List<String> getDocuments() {
        return documents;
    }

    /**
     * @param documents the documents to set
     */
    private void setDocuments(List<String> documents) {
        this.documents = documents;
    }
    
    public String ToString(){
        return super.ToString() + System.getProperty("line.separator") + String.join(System.getProperty("line.separator"), this.documents);
    }
}
