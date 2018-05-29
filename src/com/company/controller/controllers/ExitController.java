package com.company.controller.controllers;

import com.company.controller.BaseController;

public class ExitController implements BaseController {

    @Override
    public void process() {
        System.out.println("Bye!");
        System.exit(0);
    }
}
