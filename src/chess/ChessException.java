package chess;

import boardgame.BoardException;

public class ChessException extends BoardException {

	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_RESET = "\u001B[0m";
	
	private static final long serialVersionUID = 1L;
	
	public ChessException(String msg) {
		super(ANSI_RED + msg + ANSI_RESET);
	}

}
