package cigma.pfe.controllers.services;
import cigma.pfe.controllers.repositories.ClientRepository;
import cigma.pfe.models.Client;

public class ClientServiceImpl implements ClientService
{
    ClientRepository clientRepository;
    @Override
    public Client save(Client clt)
    {
        System.out.println(" Service Layer : ClientServiceImpl Level..");
        return clientRepository.save(clt);
    }
    public ClientServiceImpl()
    {
        System.out.println("Call ClientServiceImpl ..");
    }
}