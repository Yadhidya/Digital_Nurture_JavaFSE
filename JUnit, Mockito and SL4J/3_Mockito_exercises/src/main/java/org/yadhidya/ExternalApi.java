package org.yadhidya;

public interface ExternalApi
{
    String getdata();
    String findUser(int id);
    void send();

    void login();
    void fetch();
    void logout();
    void delete();
}
