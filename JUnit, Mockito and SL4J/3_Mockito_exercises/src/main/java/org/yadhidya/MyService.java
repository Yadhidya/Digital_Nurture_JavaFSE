package org.yadhidya;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api)
    {
        this.api=api;
    }

    public  String fetchData(){
        return  api.getdata();
    }
    public String getUser(int id) {
        return api.findUser(id);
    }
    public void execute() {

        api.send();

    }
}
