from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "ABR093"
    car.driver = "Hugo"
    print(vars(car))

    carDos = Car()
    carDos.license = "ABR314"
    carDos.driver = "Marta"
    print(vars(carDos))
