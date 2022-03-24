
public interface ICarDao {
    Car findById(String carId);
    List<Car> findAll();
}