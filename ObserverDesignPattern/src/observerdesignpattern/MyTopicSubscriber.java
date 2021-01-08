/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerdesignpattern;

/**
 *
 * @author Rabi Siddique
 */
public class MyTopicSubscriber implements Observer{
    
    private String name;
    private Subject topic;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }
    

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+" No New Message");
        }
        else{
            System.out.println(name+" Consuming Message"+msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
    
}
