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
public class Client {
    
     public static void main(String[] args){
        Blog newArticle = new Blog();
        
        Observer obj1 = new BlogObserver("UserA");
        Observer obj2 = new BlogObserver("UserB");
        Observer obj3 = new BlogObserver("UserC");
        
        //Registering the users
        newArticle.register(obj1);
        newArticle.register(obj2);
        newArticle.register(obj3);
        
        //Setting the subject for the users
        obj1.setSubject(newArticle);
        obj2.setSubject(newArticle);
        obj3.setSubject(newArticle);
        
        //When no article is posted and there is nothing to update
        obj1.update();
        
        //New Article posted and all the users notified
        newArticle.postBlog("I posted an Article");
        
        //Removing User 3 and posting a new article
        newArticle.unregister(obj3);
        
        //Only users A and users B will be notified because user C is removed
        newArticle.postBlog("Another Article");
        
        
    }
    
}
