package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void isAgeMore18True() {
        //GIVEN
        User user = new User(1, "Миша", 25, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isAgeMore18();
        //THEN
        Assertions.assertTrue(result);
    }
    @Test
    void isAgeMore18False() {
        //GIVEN
        User user = new User(1, "Оля", 17, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isAgeMore18();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isUserManTrue() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserMan();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isUserManFalse() {
        //GIVEN
        User user = new User (1, "Катя", 32, "woman","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserMan();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isUserWomanTrue() {
        //GIVEN
        User user = new User (1, "Катя", 32, "woman","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserWoman();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isUserWomanFalse() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserWoman();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isUserFioStartWithTrue() {
        //GIVEN
        User user = new User (1, "Миша", 32, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserFioStartWith();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isUserFioStartWithFalse() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isUserFioStartWith();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAddressEndWithTrue() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Латвийская");
        //WHEN
        boolean result = user.isAddressEndWith();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isAddressEndWithFalse() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Воровского");
        //WHEN
        boolean result = user.isAddressEndWith();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAddressHaveTrue() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Екатеринбург, ул. Воровского");
        //WHEN
        boolean result = user.isAddressHave();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isAddressHaveFalse() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Берлин, ул. Воровского");
        //WHEN
        boolean result = user.isAddressHave();
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isAgeHonestTrue() {
        //GIVEN
        User user = new User (1, "Катя", 32, "man","Берлин, ул. Воровского");
        //WHEN
        boolean result = user.isAgeHonest();
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isAgeHonestFalse() {
        //GIVEN
        User user = new User (1, "Катя", 31, "man","Берлин, ул. Воровского");
        //WHEN
        boolean result = user.isAgeHonest();
        //THEN
        Assertions.assertFalse(result);
    }



}
