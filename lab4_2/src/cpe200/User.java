package cpe200;

/**
 * Created by pruet on 6/9/2559.
 */
public class User {
    private String userName;
    private String password;

    public User() {
    }

    public User(String username,String password){
        setUserName(username);
        setPassword(password);
        }


    public boolean setUserName(String name) {
        String checkn = "^[A-Za-z][a-zA-Z0-9]{7}$";
        if (name.matches(checkn)){
            userName = name;
            return true;
        }else  return false;
    }

    public boolean setPassword(String name) {
        String checkpw = "^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]))([A-Za-z0-9]){12,}$";
        if(name.matches(checkpw)){
            password = name;
            return true;
        }else  return false;
    }

    public String getUserName() {
        return userName;

    }

    public String getPassword() {
        return password;
    }
}
