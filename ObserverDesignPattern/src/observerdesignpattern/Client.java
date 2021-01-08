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

//The Observer Pattern defines a one to many relationship between a set of objects
//When the state of one object(subject) changes , all of its dependents are notified
//The dependent objects are called the observer



public class Client {
    
    public static void main(String[] args){
        MyTopic topic = new MyTopic();
        
        Observer obj1 = new MyTopicSubscriber("Obj1");
        Observer obj2 = new MyTopicSubscriber("Obj2");
        Observer obj3 = new MyTopicSubscriber("Obj3");
        
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);
        
        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);
        
        obj1.update();
        
        topic.postMessage("New Message");
        
    }
    
    
}
