package springhibernateswingcrud;
// Generated Mar 15, 2017 10:08:42 PM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String pass;

    public Login() {
    }

    public Login(Integer id) {
        this.id = id;
    }

    public Login(String name, String pass) {
       this.name = name;
       this.pass = pass;
    }

    public Login(Integer id, String name, String pass) {
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", name=" + name + ", pass=" + pass + '}';
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    
    



}


