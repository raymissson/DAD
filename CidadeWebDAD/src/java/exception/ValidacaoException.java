/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import javax.ejb.ApplicationException;

/**
 *
 * @author Raymison
 */
@ApplicationException(rollback = true)
public class ValidacaoException extends Exception{
    public ValidacaoException(String msg){
        super(msg);
    }
}
