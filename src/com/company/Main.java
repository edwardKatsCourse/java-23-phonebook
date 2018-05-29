package com.company;

import com.company.controller.BaseController;
import com.company.controller.ControllerType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * Phonebook
         * 1. Input new contact
         * 2. Input validation (exception handling)
         * 3. Menu
         * 4. Search
         * 5. Order
         */

        menu();
    }

    public static void menu() {
        while (true) {
            ControllerType.printInto();
            Integer menu = new Scanner(System.in).nextInt();

            ControllerType controllerType = ControllerType.getById(menu);
            if (controllerType == null) {
                //Entering here in case of there is no such option or
                //user has chosen to quit!!
                continue;
            }

            BaseController controller = controllerType.getController();
            controller.process();
        }

    }
}
