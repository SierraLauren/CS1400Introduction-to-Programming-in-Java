
import java.util.Scanner;
public class TikTakToe {
    private String local1;
    private String local2;
    private String local3;
    private String local4;
    private String local5;
    private String local6;
    private String local7;
    private String local8;
    private String local9;

    TikTakToe()
    {
    	local1 = "-";
        local2 = "-";
        local3 = "-";
        local4 = "-";
        local5 = "-";
        local6 = "-";
        local7 = "-";
        local8 = "-";
        local9 = "-";
    }//end zero-arg constructor
    
    public void main(){
        
        Scanner input = new Scanner( System.in );
        System.out.println( "Let's play tik tak toe! " + "\n" +
             "Here is your game board");
        gameBoard();

        int row = 0;
        int col = 0;
        int counter = 0;
        String turn = "o";

        while ( !winner() || counter == 9 )
        {
            counter++;
            if( counter % 2 == 0 )
            {
                turn = "x";
            }//end if
            else
            {
            	turn = "o";
            }//end else
            
            System.out.println( "Row of choice:");
            row = input.nextInt();
            System.out.println( "Colum of choice:");
            col = input.nextInt();

            change( row, col, turn);
            
            gameBoard();
        }//end while
        
        System.out.println( "Game Over!" );

        input.close();
    }//end method main

    public void gameBoard( )
    {
    	
    	System.out.println( "-------------" + "\n" + "| " + local1 +
    			" | " + local2 + " | " + local3 + " |" + "\n" + 
    			"-------------" + "\n" + "| " + local4 + " | " + 
    			local5 + " | " + local6 + " |" + "\n" + "-------------"
    			+ "\n" + "| " + local7 + " | " + local8 + " | " + local9
    			+ " |" + "\n");
    		
    }//end method gameBoard

    public void change( int row, int col, String turn )
    {
        switch (row)
        {
            case (1):
                switch (col){
                    case(1): if( local1.equals("-") ){local1 = turn;};
                    break;
                    case(2): if( local2.equals("-") ){local2 = turn;};
                    break;
                    case(3): if( local3.equals("-") ){local3 = turn;};
                    break;
                }//end switch
            break;
            case(2):
                switch (col){
                    case(1): if( local4.equals("-") ){local4 = turn;};
                    break;
                    case(2): if( local5.equals("-") ){local5 = turn;};
                    break;
                    case(3): if( local6.equals("-") ){local6 = turn;};
                    break;
                }//end switch
            break;
            case(3):
                switch (col){
                    case(1): if( local7.equals("-") ){local7 = turn;};
                    break;
                    case(2): if( local8.equals("-") ){local8 = turn;};
                    break;
                    case(3): if( local9.equals("-") ){local9 = turn;};
                    break;
                }//end switch
            break;
        }//end switch

    }//end method change

    public boolean winner()
    {
        boolean isWinner = false;
        String turn = "o";

        for( int index = 0; index < 2; index++ )
        {
            if( index == 1){
                turn = "x";
            }//end if 
            if( local1.equals( turn ) && local2.equals( turn ) && local3.equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local4.equals( turn ) && local5.equals( turn ) && local6.equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local7.equals( turn ) && local8.equals( turn ) && local9.equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local1.equals( turn ) && local5.equals( turn ) && local9.equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local3.equals( turn ) && local5.equals( turn ) && local7.equals( turn ) ){
                isWinner = true;
            }//end if 
        }//end for 
        return isWinner;
    }//end method winner
}//end 