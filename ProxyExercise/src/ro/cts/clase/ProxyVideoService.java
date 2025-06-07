package ro.cts.clase;

public class ProxyVideoService implements IVideoService{
    private IVideoService iVideoService;
    public ProxyVideoService(IVideoService iVideoService){
        this.iVideoService = iVideoService;
    }
    @Override
    public void watch(String videoname, boolean isPremiumUser) {
        if(isPremiumUser == true){
            this.iVideoService.watch(videoname,isPremiumUser);
        }else{
            System.out.println("Not a premium user");
        }

    }
}
