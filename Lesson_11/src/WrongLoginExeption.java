public class WrongLoginExeption extends RuntimeException {
    private String login;

    public WrongLoginExeption(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
