class Computer{
    public void playMusic(){
        System.out.println("Music is playing...");
    }
    public String getMeAPen(int cost){
        if(cost>=10){
            return "Pen";
        }else{
            return "Nothing";
        }
    }
}
class Methods{
    public static void main(String [] args){
        Computer comp = new Computer();
        comp.playMusic();
        String result = comp.getMeAPen(10);
        System.out.println(result);
    }
}