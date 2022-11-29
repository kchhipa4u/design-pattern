package branchingandswitch.problem;

interface Player{
	
}

class TennisPlayer implements Player {}
class FootballPlayer implements Player {}
class SnookerPlayer implements Player {}

class PlayerCreator {
	   public Player createPlayer(PlayerSwitch playerType)
	         { switch (playerType) {
	      case TENNIS:
	         return new TennisPlayer();
	      case FOOTBALL:
	         return new FootballPlayer();
	      case SNOOKER:
	         return new SnookerPlayer();

	      default:
	         throw new IllegalArgumentException("Invalid player type: "
	            + playerType);
	      }
	   }
	}
enum PlayerSwitch { TENNIS,
   FOOTBALL, SNOOKER
}

public class PlayerSwitchClient{
	public static void main(String[] args) {
		PlayerCreator playerCreator = new PlayerCreator();
		Player tennisPlayer =
		   playerCreator.createPlayer(PlayerSwitch.TENNIS);
	}
}

