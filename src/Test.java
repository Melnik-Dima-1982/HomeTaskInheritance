import Text.*;
import Aircraft.*;
import Avto.*;
import Planet.*;
import State.*;


import java.awt.*;

public class Test {
    public static void main(String[] args) {
        makeText();
//        makeModelsCar();
//        makeAircraft();
//        makeState();
//        makePlanet();
    }

    public static void makeText() {
        Word word1 = null;
        Word word2 = null;
        Word word3 = null;
        Word word4 = null;
        Word word5 = null;
        Word word6 = null;
        Word word7 = null;
        try {
            word1 = new Word("We");
            word2 = new Word("are");
            word3 = new Word("learning");
            word4 = new Word("Java");
            word5 = new Word("learned");
            word6 = new Word("is");
            word7 = new Word("by us");

        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }
        Word[] mass1words = {word1, word2, word3, word4};
        Word [] mass2words = {word4, word6, word5, word7};

        Sentence sentence1 = null;
        Sentence sentence2 = null;
        try {
            sentence1 = new Sentence(mass1words);
            sentence2 = new Sentence(mass2words);
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }
        Sentence [] massSentences = {sentence1, sentence2};

        Text text = null;
        try {
            text = new Text(massSentences);
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(sentence1.makeSentence());
        System.out.println(sentence2.makeSentence());
        System.out.println(text.toString());
    }

    public static void makeModelsCar() {
        WareHouse volvoWareHouse = new WareHouse();
        Wheel wheel = null;
        Engine engine = null;
        Volvo volvoV40 = null;
        try {
            wheel = new Wheel(15, false);
            engine = new Engine(3, 280, "gasoline");
            volvoV40 = new Volvo(volvoWareHouse.takeEngine(), volvoWareHouse.takeWheel(), Color.BLACK, VolvoModels.V_40);
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }
//        volvoV40.carMove();
//        volvoV40.changeWheel();


        System.out.println(wheel.toString());
        System.out.println(engine.toString());
    }

    public static void makeAircraft() {
        Chassis smallAirCraftChassis = null;
        CraftEngine smallAirCraftEngine = null;
        Wing smallAirCraftWing = null;

        try {
            smallAirCraftChassis = new Chassis(35);
            smallAirCraftEngine = new CraftEngine(600, 3000);
            smallAirCraftWing = new Wing(10, 5);
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }

        SmallAirCraft Jac_40 = null;
        try {
            Jac_40 = new SmallAirCraft(3, smallAirCraftChassis, smallAirCraftEngine, smallAirCraftWing, "ЯК - 40");
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(Jac_40.toString());
        Jac_40.makeRoute("Moscow", "London");
        Jac_40.fly();

    }

    public static void makeState() {

        City[] citiesBrestDistrict = new City[2];//массив городов Брестского района
        City[] citiesBaranovichiDistrict = new City[2];//массив городов Барановического района
        City[] citiesKobrinDistrict = new City[5];//массив городов Кобринского района

        District[] districtsBrestArea = new District[3];//массив районов бресткой области
        District[] districtsVitebskArea = new District[1];

        Area[] belarusAreas = new Area[6];//массив областей БЕЛАРУСИ

        try {

            citiesBrestDistrict[0] = new City("Аркадия", 0.1);
            citiesBrestDistrict[1] = new City("Гута", 0.21);

            citiesBaranovichiDistrict[0] = new City("Ара́бовщина ", 0.535);
            citiesBaranovichiDistrict[1] = new City("Бриксичи  ", 0.075);

            citiesKobrinDistrict[0] = new City("Бе́льск ", 0.578);
            citiesKobrinDistrict[1] = new City("Гирск ", 0.131);

            districtsBrestArea[0] = new District("Брестский район", 1.544, citiesBrestDistrict);
            districtsBrestArea[1] = new District("Барановичский район", 2.172, citiesBaranovichiDistrict);
            districtsBrestArea[2] = new District("Кобринский район", 2.172, citiesKobrinDistrict);
            //ДАЛЬШЕ АНАЛОГИЧНО НЕОБХОДИМО СОЗДАТЬ РАЙОНЫ ВИТЕБСКОЙ И ДР.ОБЛАСТЕЙ
            //НЕ ДОПИСАНО, ЧТО БЫ НЕ ЗАГРУЖАТЬ КОД

            belarusAreas[0] = new Area("Бресткая", 2.3, districtsBrestArea);
            belarusAreas[1] = new Area("Витебская", 6.480, districtsVitebskArea);

        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }

        State belarusState = null;

        try {
            belarusState = new State("Беларусь", belarusAreas, "Минск");
        } catch (InvalidParamException e) {
            e.printStackTrace();
        }

        System.out.println(belarusState.toString());
    }

    public static void makePlanet() {
        Island Sumatra = null;
        Island Java = null;
        Ocean PacificOcean = null;
        Ocean AtlanticOcean = null;
        Mainland Africa = null;
        Mainland Australia = null;
        try {
            Sumatra = new Island("Sumatra", 473000);
            Java = new Island("Java", 132000);

            PacificOcean = new Ocean("Pacific ocean", 169.2, 710);
            AtlanticOcean = new Ocean("Atlantic Ocean", 91.6, 329.7);

            Africa = new Mainland("Africa", 30.3);
            Australia = new Mainland("Australia", 7.66);

        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }

        Island[] EarthIslands = {Sumatra, Java};
        Ocean[] EarthOceans = {PacificOcean, AtlanticOcean};
        Mainland[] EarthMainlands = {Africa, Australia};

        Planet Earth = null;
        try {
            Earth = new Planet("Earth", EarthMainlands, EarthOceans, EarthIslands);
        } catch (InvalidParamException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Earth.toString());
        System.out.println(Africa.toString() + '\n' + Australia.toString());
        System.out.println(PacificOcean.toString() + '\n' + AtlanticOcean.toString());
        System.out.println(Sumatra.toString() + '\n' + Java.toString());
    }
}
