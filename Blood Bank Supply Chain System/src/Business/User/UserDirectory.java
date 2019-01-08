/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import java.util.ArrayList;

/**
 *
 * @author barua
 */
public class UserDirectory {

    ArrayList<User> userDirectory;

    public UserDirectory() {

        userDirectory = new ArrayList<>();
    }

    public ArrayList<User> getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(ArrayList<User> userDirectory) {
        this.userDirectory = userDirectory;
    }

    public User addUser(String emailId) {
        if (checkIfEmailidExist(emailId)) {
            return null;
        } else {
            User user = new User();
            userDirectory.add(user);
            return user;
        }
    }

    public boolean checkIfEmailidExist(String emailId) {
        for (User user : userDirectory) {
            if (user.getEmailId().equals(emailId)) {
                return true;
            }
        }
        return false;
    }

    public User authenticateUser(String emailId, String password) {
        for (User user : userDirectory) {
            if (user.getEmailId().equals(emailId) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

}
