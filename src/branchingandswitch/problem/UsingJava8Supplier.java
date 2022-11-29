package branchingandswitch.problem;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

class PlayerSupplier {
	private static final Map<String, Supplier<Player>> PLAYER_SUPPLIER;

	static {
		final Map<String, Supplier<Player>> players = new HashMap<>();
		players.put("TENNIS", TennisPlayer::new);
		players.put("FOOTBALL", FootballPlayer::new);
		players.put("SNOOKER", SnookerPlayer::new);

		PLAYER_SUPPLIER = Collections.unmodifiableMap(players);
	}

	public Player supplyPlayer(String playerType) {
		Supplier<Player> player = PLAYER_SUPPLIER.get(playerType);

		if (player == null) {
			throw new IllegalArgumentException("Invalid player type: " + playerType);
		}

		return player.get();
	}
}

public class UsingJava8Supplier {

	public static void main(String[] args) {
		PlayerSupplier playerSupplier = new PlayerSupplier();
		Player snookerPlayer = playerSupplier.supplyPlayer("SNOOKER");
	}

}
