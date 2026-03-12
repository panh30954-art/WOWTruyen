package org.example.services;

import org.example.model.user.User;

public interface IRegisterSevice {
    void register(User user, String confirmPassword);
}
