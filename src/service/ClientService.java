package service;

import entity.Client;

public class ClientService {
    private final int N=100;
    private Client[] Tclient= new Client[N];
    private int nbreClient;
    public ClientService(){
        nbreClient = 0;
    }

    public boolean addClient(Client client){
        if (nbreClient<=N){
            Tclient[nbreClient]=client;
            nbreClient++;
            return true;
        }
        return false;
    }

    public Client serchClientByTel(String tel){
        Client client=new Client();
        for (int i=0;i<nbreClient;i++){
            if (Tclient[i].equals(client)){
                return Tclient[i];
            }
        }
        return null;
    }
}
