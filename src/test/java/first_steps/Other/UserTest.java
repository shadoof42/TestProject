package first_steps.Other;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 17.02.2016.
 */
public class UserTest{
    @Test
    public void testEquals() throws Exception {
        User user = new User("1","1");
        assertEquals(user,user);
    }
//    @Test
//    public void testHashCode() throws Exception {
//
//    }

    @Test
    public void testEquals1() throws Exception {
        User user1 = new User("2","1");
        User user = new User("2","1");
        assertEquals(user1,user);
    }

//    @Test
//    public void testHashCode1() throws Exception {
//
//    }
}
/**
 * 2520440
 * 2522574 нту
 * сергей тиханский
 * 89103449262
 * протоколы
 * ntc55@sozvezdie.su
 */