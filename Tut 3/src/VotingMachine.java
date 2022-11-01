public class VotingMachine {
    //method - clear machine state  / to vote for labour / to vote for conservative /
    // to get the number of votes for each of the two parties.

    private int vote;
    private int labourVote;
    private int conservativeVote;

    int[] votes = {};

    public int getVote() {
        return vote;
    }

    public int getLabourVote() {
        return getLabourVote();
    }

    public int getConservativeVote() {
        return conservativeVote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }

    public void setLabour(String labour) {
        this.labourVote = labourVote;
    }

    public void setConservative(String conservative) {
        this.conservativeVote = conservativeVote;
    }

    public void ClearMachineState(){
        this.conservativeVote = 0;
        this.labourVote = 0;

    }

    public void ToVoteLabour(){

    }

    public void ToVoteConservative(){

    }

    public void ToGetNumberOfVotes(){
        System.out.println("Number Of Votes For Labour: ");
        System.out.println("Number Of Votes For Conservative: ");
    }
}
