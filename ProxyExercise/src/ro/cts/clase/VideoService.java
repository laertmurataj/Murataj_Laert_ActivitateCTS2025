package ro.cts.clase;

public class VideoService implements IVideoService{
    @Override
    public void watch(String videoname, boolean isPremiumUser) {
        System.out.println("Video: "+videoname+"\nIs Premium User: "+isPremiumUser);
    }
}
