/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagittest;

/**
 *
 * @author Owner
 */
public class Hello implements HelloInterface{
    @Override
    public String sayHello(String sHelloString){
        
        if ( (sHelloString == null) || (sHelloString.length() == 0)) {
            throw new IllegalArgumentException();
        }
        return "Hello " + sHelloString;
    }
}
