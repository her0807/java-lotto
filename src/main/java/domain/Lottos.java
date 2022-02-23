package domain;

import java.util.List;

public class Lottos {
	private final List<Lotto> lottos;

	public Lottos(List<Lotto> lottos) {
		this.lottos = lottos;
	}


	@Override
	public String toString() {
		return "Lottos{" +
			lottos +
			'}';
	}
}
