package es.upm.miw.iwvg_devops.code;

import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserIdBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fraction -> fraction.getNumerator()<fraction.getDenominator()))
                .map(User::getId);
    }

    Stream<String> findUserFamilyNameInitialBySomeProperFraction(){
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(fraction -> fraction.getNumerator()<fraction.getDenominator()))
                .map(User::getFamilyName);
    }

    public Stream<Double> findDecimalFractionByUserName(String name){
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal);
    }

    public Stream<String> findUserFamilyNameByUserNameDistinct(String userName) {
        return new UsersDatabase().findAll()
                .filter(user -> userName.equals(user.getName()))
                .map(User::getFamilyName)
                .distinct();
    }

    }
