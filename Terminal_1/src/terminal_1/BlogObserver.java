/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terminal_1;

/**
 *
 * @author Rabi Siddique
 */
public class BlogObserver implements Observer {
    
    private String name;
    private Subject blog;

    public BlogObserver(String name) {
        this.name = name;
    }
    

    @Override
    public void update() {
        String msg = (String) blog.getUpdate(this);
        if(msg == null){
            System.out.println(name+" No New Article Posted");
        }
        else{
            System.out.println(name+" Notified about the New Article:"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.blog = sub;
    }
    
    
}
