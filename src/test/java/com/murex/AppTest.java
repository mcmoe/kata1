package com.murex;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Test;

import com.murex.account.Account;
import com.murex.account.AccountCreationService;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        LocalDate localDate = LocalDate.of(1979, 4, 10);
        try {
            Account account =  new AccountCreationService().createNewAccount("John", "Smith", 1234567891234L, localDate);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        assertTrue( true );
    }
}
