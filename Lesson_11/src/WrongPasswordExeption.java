public class WrongPasswordExeption extends RuntimeException {
    private String password;
    private String confirmPassword;

    public WrongPasswordExeption(String message, String password, String confirmPassword) {
        super(message);
        this.password = password;
        this.confirmPassword = confirmPassword;
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