import Back_End_Stuff.Answer;
import GUI.TextScrollPane;
import Playable.Beings;
import Playable.Player;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 * Created by Arale on 4/16/2016.
 */

public class CrawlMain  extends Application{
    static Answer answer = new Answer();
    double width = 300;
    double height = 600;
    static Scanner scan  = new Scanner(System.in);
    static Player player = new Player();
    static String startGame;
    static String choice;

    public static void main (String[] args){
        Answer answer = new Answer();
        answer.insertAnswer("YES", true);
        answer.insertAnswer("Y", true);
        answer.insertAnswer("NO", false);
        answer.insertAnswer("N", false);
        answer.insertAnswer("P", false);
        answer.insertAnswer("X", false);
        answer.insertAnswer("1", false);

        System.out.println("Crawl\n");
        System.out.println("Do you wish to enter the realm of Crawl?" +
                "\nYes or No");
        startGame = scan.nextLine();
        if(Answer.checkPositive(answer.getAnswers(), startGame )){
            System.out.println("Welcome to the world of Crawl.");
            System.out.println("\nTell me about yourself.");
            changeName();
            chooseBeing();
        }else if (!(Answer.checkNegative(answer.getAnswers(), startGame))){
            System.out.println("You turn around and leave.");
        } else{
            System.out.println("Asshole");
        }
        launch(args);

    }

    public static void changeName(){
        System.out.println("What do you call yourself?");
        player.setName(scan.nextLine());

    }

    public static void chooseBeing(){
        System.out.println("Choose your being:" +
                "\n\tA.I.: Artificial Intelligence." +
                "\n\tAw: Godlike being." +
                "\n\tHuman: Average human being." +
                "\n\tMeta-human: More than your average human being." +
                "\n\tReptilian: Cold blooded reptile humanoid." +
                "\n\tSilician: Silicon based life form." +
                "\n\tPlantae: Plant like humanoid.");

        choice = scan.nextLine();
        switch (choice){
            case "A.I.": case"AI" : case "a.i.": case"ai":
                player.setBeing(Beings.AI);
                break;
            case "Aw" :case "AW" :case "aw" :case "aW" :
                player.setBeing(Beings.AW);
                break;
            case "Human" :case "HUMAN" :case "human" :
                player.setBeing(Beings.HUMAN);
                break;
            case "Meta-human" :
                player.setBeing(Beings.METAHUMAN);
                break;
            case "Reptilian" :
                player.setBeing(Beings.REPTILIAN);
                break;
            case "Siliccian" :
                player.setBeing(Beings.SCILICCIAN);
                break;
            case "Plantae" :
                player.setBeing(Beings.PLANTAE);
                break;
            default:
                System.out.println("Hmm... let's try that again.");
                chooseBeing();

        }
    }

    public static void chooseAttributes(){
        System.out.println("Choose your attributes:" +
                "\n\tA.I.: Artificial Intelligence." +
                "\n\tAw: Godlike being." +
                "\n\tHuman: Average human being." +
                "\n\tMeta-human: More than your average human being." +
                "\n\tReptilian: Cold blooded reptile humanoid." +
                "\n\tSilician: Silicon based life form." +
                "\n\tPlantae: Plant like humanoid.");

        choice = scan.nextLine();
        switch (choice){
            case "A.I.": case"AI" : case "a.i.": case"ai":
                player.setBeing(Beings.AI);
                break;
            case "Aw" :case "AW" :case "aw" :case "aW" :
                player.setBeing(Beings.AW);
                break;
            case "Human" :case "HUMAN" :case "human" :
                player.setBeing(Beings.HUMAN);
                break;
            case "Meta-human" :
                player.setBeing(Beings.METAHUMAN);
                break;
            case "Reptilian" :
                player.setBeing(Beings.REPTILIAN);
                break;
            case "Siliccian" :
                player.setBeing(Beings.SCILICCIAN);
                break;
            case "Plantae" :
                player.setBeing(Beings.PLANTAE);
                break;
            default:
                System.out.println("Hmm... let's try that again.");
                chooseBeing();

        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        //Left Pane
        Label textTest = new Label();
        textTest.setText("This is the begining of a story. Feel free to navigate and\n " +
                        "investigate your surrounding. Use your will to move around \n" +
                        "and expand your knowledge of this world to make progress.\n");

        TextScrollPane textScrollPane = new TextScrollPane(width,height);
        Pane leftPane = new Pane();
        leftPane.getChildren().addAll(textTest, textScrollPane);
        //Typical stage and scene setup
        BorderPane mainPane = new BorderPane();
        mainPane.setLeft(leftPane);
        mainPane.setCenter(new Text("This is the begining of a story. Feel free to navigate and\n " +
                                    "investigate your surrounding. Use your will to move around \n" +
                                    "and expand your knowledge of this world to make progress.\n"));

        Scene scene = new Scene(mainPane, 780,800);
        primaryStage.setTitle("Crawl");
        primaryStage.setScene(scene);
        primaryStage.show();
        width = scene.getWidth();
        height = scene.getHeight();

    }

    public void checkStatus (){
        System.out.println(player.getConstitution());
    }


}
