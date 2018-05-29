package com.company.controller;

import com.company.controller.controllers.ExistingContactController;
import com.company.controller.controllers.ExitController;
import com.company.controller.controllers.NewContactController;
import com.company.controller.controllers.SearchController;

public enum ControllerType {

    NEW_CONTACT(1, NewContactController.class, "New contact"),
    EXISTING_CONTACTS(2, ExistingContactController.class, "See existing"),
    SEARCH_CONTACT(3, SearchController.class, "Search"),
    EXIT(4, ExitController.class, "Exit")
    ;


    private Integer menuId;
    private Class<? extends BaseController> controllerClass;
    private String friendlyName;

    ControllerType(Integer menuId,
                   Class<? extends BaseController> controllerClass,
                   String friendlyName) {

        this.menuId = menuId;
        this.controllerClass = controllerClass;
        this.friendlyName = friendlyName;
    }

    public Class<? extends BaseController> getControllerClass() {
        return controllerClass;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public String getFriendlyName() {
        return friendlyName;
    }

    public BaseController getController() {
        try {
            return getControllerClass().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("EVERYTHING IS BROKEN!!!");
            throw new RuntimeException(e);
        }
    }

    public static ControllerType getById(Integer id) {
        if (id == null) {
            return null;
        }

        for (ControllerType controllerType : values()) {
            if (controllerType.getMenuId().equals(id)) {
                return controllerType;
            }
        }
        return null;
    }

    public static void printInto() {
        System.out.println("Choose option: ");
        for (ControllerType controllerType : values()) {
            System.out.printf("%s. %s%n",
                    controllerType.getMenuId(),
                    controllerType.getFriendlyName());
        }
    }

}
