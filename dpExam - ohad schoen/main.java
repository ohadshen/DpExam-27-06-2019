import ExtraEx2.Riddle2;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) throws OperationNotSupportedException {
//        // Ex1 - State
//        Context shipGame = new Context();
//
//        System.out.println(shipGame);
//        shipGame.makeTurn();
//        System.out.println(shipGame);
//        shipGame.getHurt();
//        shipGame.makeTurn();
//        System.out.println(shipGame);
//        shipGame.makeTurn();
//        System.out.println(shipGame);
//        shipGame.makeTurn();
//        System.out.println(shipGame);
//        shipGame.makeTurn();
//        System.out.println(shipGame);


//        // Ex2 - Composite
////        Component composite1 = new Composite();
////        Component composite2 = new Composite();
////        Component composite3 = new Composite();
////        Component component1 = new Leaf(4);
////        Component component3 = new Leaf(4);
////        Component component4 = new Leaf(4);
////        Component component6 = new Leaf(2);
////
////        composite1.add(composite2);
////        composite1.add(component1);
////
////        composite2.add(composite3);
////        composite2.add(component3);
////
////        composite3.add(component4);
////        composite3.add(component6);
////
////        System.out.println(composite1.getSum());
////        System.out.println(((Composite) composite1).doesAllEven());

//        // Ex3 - Proxy
//        ProxyCar pCar = new ProxyCar(new Car());
//        pCar.showFeul();
//        pCar.showLocation();

//        // Ex4 - Iterator and Strategy
//        int[] arr = new int[]{3,5,2,1,4,6};
//        ISort sort = new BubbleSort();
//        MyNumbers myNumbers = new MyNumbers(sort, arr);
//
//        Scanner scanner = new Scanner(System.in);
//        int input = Integer.parseInt(scanner.next());
//        if(input == 1) {
//            myNumbers.sort();
//        } else if(input == 2){
//            myNumbers.mulArrayByTwo();
//        }
//
//        for (Object myNumber : myNumbers) {
//            System.out.println(myNumber);
//        }

//        // Ex5 - ILogBuilder and LoggerDecorator
//
//        ILogger basicLogger = new BasicLogBuilder().build();
//        ILogger errorLogger = new ErrorLogBuilder().build();
//        ILogger fatalLogger = new FatalLogBuilder().build();
//
//        basicLogger.updateLog("basic");
//        errorLogger.updateLog("error");
//        fatalLogger.updateLog("fatal");

//        // Ex6 - Factory
//        NumbersList numbersList = new NumbersList();
//        numbersList.getNumberToCreates().add(new NumberToCreate(2,4));
//        numbersList.getNumberToCreates().add(new NumberToCreate(3,5));
//        numbersList.getNumberToCreates().add(new NumberToCreate(5,2));
//
//
//        for (NumberToCreate numberToCreate : numbersList.getNumberToCreates()) {
//            System.out.println(NumbersFactory.createNumber(numberToCreate));
//        }

//        // Ex7 - Mediator
//        WhatsappMediator whatsappMediator = new WhatsappMediator();
//        User firstUser = new User(whatsappMediator,123, "kobi");
//        User secondUser = new User(whatsappMediator, 234, "avi");
//        User thirdUser = new User(whatsappMediator,456, "moshe");
//        User fourthUser = new User(whatsappMediator,567, "aviva");
//
//        whatsappMediator.addUser(firstUser);
//        whatsappMediator.addUser(secondUser);
//        whatsappMediator.addUser(thirdUser);
//        whatsappMediator.addUser(fourthUser);
//
//        firstUser.sendRoomMessage("hello everyone :)");
//        secondUser.sendPersonalMessage(123,"hiiii kobi");
//        fourthUser.sendRoomMessage("stop spamming!!!!!");

//        // Ex8 - Template
//        TemplateTrain powerExersice = new PowerTrain();
//        TemplateTrain legsExersice = new LegsTrain();
//        powerExersice.run();
//        legsExersice.run();

//        // Ex9 - Abstract factory
//        CarPartsFactoryBase hybridCarPartsFactory = new HybridCarPartsFactory();
//        CarPartsFactoryBase regularCarPartsFactory = new RegularCarPartsFactory();
//        List<CarPart> hybridParts;
//        List<CarPart> regularParts;
//
//        hybridParts = hybridCarPartsFactory.createCarParts();
//        regularParts = regularCarPartsFactory.createCarParts();

//        // Ex10 - Decorator
//        IWindow iWindow = new LightEffect(
//                                new ShadowEffect(
//                                        new ThreeDimantionsEffect(
//                                                new BasicWindow())));
//
//        iWindow.operateWindow();

//        // ExtraEx2
//        List<String> wordsToFind = Arrays.asList("hello", "ohad", "bob");
//        List<String> words = Arrays.asList("hollehad", "bobhad", "ohad");
//
//        Riddle2.printWordsOccurence(words, wordsToFind);

    }
}
