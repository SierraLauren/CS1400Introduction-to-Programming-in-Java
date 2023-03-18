
import java.util.Scanner;
public class TikTakToe2 {
    private String[] local = new String[9];

    TikTakToe2()
    {
    	local[0] = "-";
        local[1] = "-";
        local[2] = "-";
        local[3] = "-";
        local[4] = "-";
        local[5] = "-";
        local[6] = "-";
        local[7] = "-";
        local[8] = "-";
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
    	
    	System.out.println( "-------------" + "\n" + "| " + local[0] +
    			" | " + local[1] + " | " + local[2] + " |" + "\n" + 
    			"-------------" + "\n" + "| " + local[3] + " | " + 
    			local[4] + " | " + local[5] + " |" + "\n" + "-------------"
    			+ "\n" + "| " + local[6] + " | " + local[7] + " | " + local[8]
    			+ " |" + "\n");
    		
    }//end method gameBoard

    public void change( int row, int col, String turn )
    {
        switch (row)
        {
            case (1):
                switch (col){
                    case(1): if( local[0].equals("-") ){local[0] = turn;};
                    break;
                    case(2): if( local[1].equals("-") ){local[1] = turn;};
                    break;
                    case(3): if( local[2].equals("-") ){local[2] = turn;};
                    break;
                }//end switch
            break;
            case(2):
                switch (col){
                    case(1): if( local[3].equals("-") ){local[3] = turn;};
                    break;
                    case(2): if( local[4].equals("-") ){local[4] = turn;};
                    break;
                    case(3): if( local[5].equals("-") ){local[5] = turn;};
                    break;
                }//end switch
            break;
            case(3):
                switch (col){
                    case(1): if( local[6].equals("-") ){local[6] = turn;};
                    break;
                    case(2): if( local[7].equals("-") ){local[7] = turn;};
                    break;
                    case(3): if( local[8].equals("-") ){local[8] = turn;};
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
            if( local[0].equals( turn ) && local[1].equals( turn ) && local[2].equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local[3].equals( turn ) && local[4].equals( turn ) && local[5].equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local[6].equals( turn ) && local[7].equals( turn ) && local[8].equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local[0].equals( turn ) && local[4].equals( turn ) && local[8].equals( turn ) ){
                isWinner = true;
            }//end if 
            if( local[2].equals( turn ) && local[4].equals( turn ) && local[6].equals( turn ) ){
                isWinner = true;
            }//end if 
        }//end for 
        return isWinner;
    }//end method winner
}//end 