package org.core;

import java.util.ArrayList;
import java.util.List;

public class QueryResults {

	private ArrayList<QueryResult> cheapiest = new ArrayList<QueryResult>();
	private int results;

	/**
	 * Kostruktor
	 * 
	 * @param numberOfResults
	 */
	public QueryResults(int numberOfResults) {
		this.results = numberOfResults;
	}

	/**
	 * Pobierz wyniki
	 * 
	 * @return
	 */
	public List<QueryResult> getResults() {
		return cheapiest.size() > results ? cheapiest.subList(0, results)
				: cheapiest;
	}

	/**
	 * Dodaj nowy wynik
	 * 
	 * @param result
	 */
	public void addResult(QueryResult result) {
		if (!isQueryEunique(result))
			return;

		int positionForQuery = -1;

		for (int idx = 0; idx < cheapiest.size(); ++idx) {
			if (cheapiest.get(idx).price() >= result.price()) {
				positionForQuery = idx;
				break;
			}
		}
		if (positionForQuery >= 0) {
			cheapiest.add(positionForQuery, result);
		} else {
			cheapiest.add(result);
		}
	}

	private boolean isQueryEunique(QueryResult newQueryResult) {
		for (QueryResult queryResult : cheapiest) {
			if (newQueryResult.equals(queryResult)) {
				return false;
			}
		}
		return true;
	}
}