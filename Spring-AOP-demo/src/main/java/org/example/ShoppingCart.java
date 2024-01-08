package org.example;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {



    //Various aspects can be as that are below:
    //->Logging
    //->Authorization and Authentication
    //->Sanitize the data
    public void checkOut(String s)
    {
        System.out.println("Checking out from Shopping Cart... ");
    }

    public int quantity()
    {
        return 3;
    }
}

