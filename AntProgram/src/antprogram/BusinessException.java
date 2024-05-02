/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

/**
 *
 * @author fatma
 */
    public class BusinessException extends Exception{
    
    
     public BusinessException(String message) {
        super(message);
    }
     public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
}
