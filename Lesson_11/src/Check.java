public class Check {
    private String login;
    private String password;
    private String confirmPassword;

    public static void checkLogin(String login) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginExeption("Login must includes less then 20 symbols", login);
            }
            if (login.contains(" ")) {
                throw new WrongLoginExeption("Login must not includes space", login);
            }
        } catch (WrongLoginExeption exeption) {
            System.out.println(exeption.getMessage() + ". Login: " + exeption.getLogin());
        }
    }

    public static void checkPassword(String password, String confirmPassword) {
        try {
            if (password.length() > 20) {
                throw new WrongPasswordExeption("Password must includes less then 20 symbols", password, confirmPassword);
            }
            if (password.contains(" ")) {
                throw new WrongPasswordExeption("Password must not includes space", password, confirmPassword);
            }
            boolean ch = false;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    ch = true;
                }
            }
            if (!ch) {
                throw new WrongPasswordExeption("Password must includes number", password, confirmPassword);
            }
            try {
                if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordExeption("Password and confirmPassword should be same", password, confirmPassword);
                }
            } catch (WrongPasswordExeption exeption) {
                System.out.println(exeption.getMessage() + ". Password: " + exeption.getPassword() + ". Confirm the password: " + exeption.getConfirmPassword());
            }
        } catch (WrongPasswordExeption exeption) {
            System.out.println(exeption.getMessage() + ". Password: " + exeption.getPassword());
        }
    }

    public Check(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
