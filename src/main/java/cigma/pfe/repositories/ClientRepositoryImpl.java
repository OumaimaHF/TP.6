package cigma.pfe.controllers.repositories;

import cigma.pfe.models.Client;

public class ClientRepositoryImpl implements ClientRepository {
    @Override
    public Client save(Client clt)
    {
        System.out.println("DAO Layer : ClientRepositoryImpl Level");
        return null;

    }
    public ClientRepositoryImpl()
    {
        System.out.println("Call ClientRepositoryImpl ..");
    }
}