
public class CustomerRepositoryImpl implements CustomerRepository {
    
    @Override
    public String findCustomerById(int id) {

        if(id == 101) {
            return "Sanjay";
        } else if(id == 102) {
            return "Kumar";
        }
        return "Customer not find";
    }
}
