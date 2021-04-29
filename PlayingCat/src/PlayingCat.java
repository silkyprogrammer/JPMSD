public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean playing = false;
        if ((summer) && (temperature<25)){
            playing=false;
        }else if ((summer) && (temperature > 45)) {
            playing = false;
        }else if (!(summer) && (temperature>=25 && temperature<=35)){
            playing = true;
        }else if ((summer) && (temperature>=25 && temperature<=45)){
            playing = true;
        }
        return playing;
    }
}
