package branchingandswitch.problem;

/**
 * @author Kanhaiya
 * 
 * most Java compilers will generate more efficient bytecode for this implementation than for an if-else-if chain. 
 *
 */
public enum PlayerTypes {
	TENNIS {
		@Override
		public Player createPlayer() {
			return new TennisPlayer();
		}
	},
	FOOTBALL {
		@Override
		public Player createPlayer() {
			return new FootballPlayer();
		}
	},
	SNOOKER {
		@Override
		public Player createPlayer() {
			return new SnookerPlayer();
		}
	};

	public abstract Player createPlayer();
}