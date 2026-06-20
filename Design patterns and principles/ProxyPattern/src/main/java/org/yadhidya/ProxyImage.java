package org.yadhidya;

import java.util.HashMap;
import java.util.Map;

public class ProxyImage implements Image{
    Image realimage;
    Map<String,Image> cache;

    ProxyImage(){
        cache=new HashMap<>();
    }
    public void display(String url)
    {
        if(cache.containsKey(url))
        {
            System.out.println("Cahed :");
            cache.get(url).display(url);
        }
        else {
            realimage=new RealImage();
            cache.put(url,realimage);
            cache.get(url).display(url);
        }
    }
}
