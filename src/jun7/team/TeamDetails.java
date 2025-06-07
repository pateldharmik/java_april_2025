package jun7.team;

public class TeamDetails {

    private String playerUserName;
    private String playerEmail;
    private String playerPassword;
    private double playerSalary;

    public TeamDetails(String playerUserName, String playerEmail, String playerPassword, double playerSalary) {
        this.playerUserName = playerUserName;
        this.playerEmail = playerEmail;
        this.playerPassword = playerPassword;
        this.playerSalary = playerSalary;
    }

    public String getPlayerUserName() {
        return playerUserName;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerPassword(String playerPassword) {
        this.playerPassword = playerPassword;
    }

    public void playerLogin(String playerUserName, String playerPassword) {
        if (playerUserName.equals(this.playerUserName) && playerPassword.equals(this.playerPassword)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("You have not successfully logged in!");
        }

    }

    @Override
    public String toString() {
        return "TeamDetails{" +
                "playerUserName='" + playerUserName + '\'' +
                ", playerEmail='" + playerEmail + '\'' +
                ", playerPassword='" + playerPassword + '\'' +
                '}';
    }
}
