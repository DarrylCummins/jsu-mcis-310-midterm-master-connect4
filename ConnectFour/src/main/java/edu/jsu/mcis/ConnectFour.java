package edu.jsu.mcis;

public class ConnectFour {
    public enum Token { RED, BLACK, EMPTY }
    public enum Result { NONE, RED_WIN, BLACK_WIN, TIE }
    public static final int COLUMNS = 7;
    private final int ROWS = 6;
    private Token[][] board;
    private boolean redTurn;
    
    public ConnectFour() {
        board = new Token[ROWS][COLUMNS];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                board[i][j] = Token.EMPTY;
            }
        }
        redTurn = true;
    }
    
    public Token getTopOfColumn(int col) {
		if(board[0][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[0][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else if(board[1][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[1][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else if(board[2][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[2][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else if(board[3][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[3][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else if(board[4][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[4][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else if(board[5][col] == Token.RED)
		{
			return Token.RED;
		}
		else if(board[5][col] == Token.BLACK)
		{
			return Token.BLACK;
		}
		else return Token.EMPTY;
    }
    
    public int getHeightOfColumn(int col) {
		if(board[0][col] == Token.RED || board[0][col] == Token.BLACK)
		{
			return 6;
		}
		else if(board[1][col] == Token.RED || board[1][col] == Token.BLACK)
		{
			return 5;
		}
		else if(board[2][col] == Token.RED || board[2][col] == Token.BLACK)
		{
			return 4;
		}
		else if(board[3][col] == Token.RED || board[3][col] == Token.BLACK)
		{
			return 3;
		}
		else if(board[4][col] == Token.RED || board[4][col] == Token.BLACK)
		{
			return 2;
		}
		else if(board[5][col] == Token.RED || board[5][col] == Token.BLACK)
		{
			return 1;
		}
		else return 0;
    }
    
    public boolean dropTokenInColumn(int col) {
		if(board[5][col] == Token.EMPTY)
		{
			if(redTurn) board[5][col] = Token.RED;
			else board[5][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		if(board[4][col] == Token.EMPTY)
		{
			if(redTurn) board[4][col] = Token.RED;
			else board[4][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		if(board[3][col] == Token.EMPTY)
		{
			if(redTurn) board[3][col] = Token.RED;
			else board[3][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		if(board[2][col] == Token.EMPTY)
		{
			if(redTurn) board[2][col] = Token.RED;
			else board[2][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		if(board[1][col] == Token.EMPTY)
		{
			if(redTurn) board[1][col] = Token.RED;
			else board[1][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		if(board[0][col] == Token.EMPTY)
		{
			if(redTurn) board[0][col] = Token.RED;
			else board[0][col] = Token.BLACK;
			redTurn = !redTurn;
			return true;
		}
		return false;
    }
    
    public Result getResult() {
		for(int i = 0; i < 7; i++)
		{
			if(doesRedWinVerticallyInColumn(i))
			{
				return Result.RED_WIN;
			}
			if(doesBlackWinHorizontallyInRow(i))
			{
				return Result.BLACK_WIN;
			}
		}
		return Result.TIE;
    }
    
    
    // Here are a couple of private methods to give you
    // an idea of a more clever way to determine winners.
    private boolean doesRedWinVerticallyInColumn(int col) {
        String columnString = makeStringFromColumn(col);
        return (columnString.indexOf("RRRR") >= 0);
    }
	private boolean doesBlackWinHorizontallyInRow(int row) {
        String rowString = makeStringFromRow(row);
        return (rowString.indexOf("BBBB") >= 0);
    }
    
    private String makeStringFromColumn(int col) {
        String s = "";
        for(int row = 0; row < ROWS; row++) {
            if(board[row][col] == Token.RED) s += "R";
            else if(board[row][col] == Token.BLACK) s += "B";
            else s += " "; 
        }
        return s;
    }
	private String makeStringFromRow(int row) {
        String s = "";
        for(int col = 0; col < 7; col++) {
            if(board[row][col] == Token.RED) s += "R";
            else if(board[row][col] == Token.BLACK) s += "B";
            else s += " "; 
        }
        return s;
    }
}












