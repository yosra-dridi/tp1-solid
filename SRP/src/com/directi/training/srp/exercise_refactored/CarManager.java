package com.directi.training.srp.exercise_refactored;

/**
 *  To respect the SRP, we delegate each job(dao, formatting, analyzing) that CarManager had previously to another class
 * 
 *  So now the only job of the car manager is to orchestrate what other classes related to the car class do 
 *    
 *  @author yosra
 */

public class CarManager
{
	// The job of treating data in the DAO layer was delegated to the CarDao class
    private final ICarDao _carDao;
    
    // CarFormatter takes care of formatting data of a car object
    private final ICarFormatter _carFormatter;
    
    // CarAnalyzer is responsible of analyzing data dealing with cars (including rating cars : best car, ...)
    private final ICarAnalyzer _carAnalyzer;

    public CarManager(ICarDao carDao, ICarFormatter carFormatter, ICarAnalyzer carAnalyzer)
    {
        _carDao = carDao;
        _carFormatter = carFormatter;
        _carAnalyzer = carAnalyzer;
    }


	/**
	 *  All what the car manager has to do now is to call the appropriate methods of the CarDao, the CarFormatter and the CarAnalyzer
	 */
    
    public Car getCarById(final String carId)
    {
        return _carDao.findById(carId);
    }

    public String getCarsNames()
    {
        return _carFormatter.getCarsNames(_carDao.findAll());
    }

    public Car getBestCar()
    {
        return _carAnalyzer.getBestCar(_carDao.findAll());
    }
}
