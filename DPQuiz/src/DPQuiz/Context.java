/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DPQuiz;

public class Context {
    
    
     Themes themeVar;
    
    Context(Themes themeVar)
    {
        this.themeVar=themeVar;
    }
    
    
    
        void decide(String decision)
    {
        if(decision.equals("morning"))
        {
            themeVar.morningTheme();
        }
         if(decision.equals("evening"))
        {
            themeVar.eveningTheme();
        }
          if(decision.equals("night"))
        {
            themeVar.nightTheme();
        }
    }
    
}
