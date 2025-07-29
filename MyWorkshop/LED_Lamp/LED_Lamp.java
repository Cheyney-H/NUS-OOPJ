public class LED_Lamp{

    private boolean redOn = false;
    private boolean greenOn = false;
    private boolean blueOn = false;

    public void showLight(int lightIdx){
        if (redOn){
            redOn = false;
        }
        if (greenOn){
            greenOn = false;
        }
        if (blueOn){
            blueOn = false;
        }

        switch (lightIdx){
            case 0:
                redOn = true;
                System.out.println("Light is now red");
                break;
            case 1:
                greenOn = true;
                System.out.println("Light is now green");
                break;
            case 2:
                blueOn = true;
                System.out.println("Light is now blue");
                break;
            default:
                System.out.println("Error!! Expects 0, 1 or 2.");
                break;
        }
    }
// or use if-else sentence
/*
        if (lightIdx == 0){
            redOn = true;
            System.out.println("Light is now red");
        }else if (lightIdx == 1){
            greenOn = true;
            System.out.println("Light is now green");
        }else if (lightIdx == 2){
            blueOn = true;
            System.out.println("Light is now blue");
            break;
        }else{
            System.out.println("Error!! Expects 0, 1 or 2.");
        }
*/
    public static void main(String[] args){
        LED_Lamp lamp = new LED_Lamp();

        lamp.showLight(0);
        lamp.showLight(1);
        lamp.showLight(2);
        lamp.showLight(3);
    }
}