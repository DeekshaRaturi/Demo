package aavin.com.testing;

/**
 * Created by deeksha.raturi on 10-08-2017.
 */

public class Model {

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    private String Id;
    private String Name;


    public Model(){

    }

     public Model(String Id,String Name){
         this.Id=Id;
         this.Name=Name;
     }
}
