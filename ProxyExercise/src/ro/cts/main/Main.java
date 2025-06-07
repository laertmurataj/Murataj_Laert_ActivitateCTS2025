package ro.cts.main;

import ro.cts.clase.IVideoService;
import ro.cts.clase.ProxyVideoService;
import ro.cts.clase.VideoService;


public class Main {
    public static void main(String[] args) {
        IVideoService videoService = new VideoService();
//        videoService.watch("Noizy",false);

        IVideoService proxy = new ProxyVideoService(videoService);
        proxy.watch("Dafina",false);


        }
    }
