

public class Book {


    public void attachUser (User user){
        this.user = user;
    }

    public void detachUser(){
        this.user = null;
    }
}
