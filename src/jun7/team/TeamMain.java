package jun7.team;

public class TeamMain {
    public static void main(String[] args) {

        TeamDetails td = new TeamDetails("DharmikPatel","dharmik@patel.com","P@ssword",80000);
        System.out.println(td);

        System.out.println(td.getPlayerUserName());
        System.out.println(td.getPlayerEmail());

        td.playerLogin("DharmikPatel","P@ssword");

        td.setPlayerPassword("newPasssword");

        td.playerLogin("DharmikPatel","P@ssword");
        td.playerLogin("DharmikPatel","newPasssword");

    }
}
