import java.util.*;

public class Driver {
  public static void main(String[] args) {
    System.out.println("------------");
    System.out.println("| WELCOME! |");
    System.out.println("------------");
    System.out.println("\nThis program will sequentially output each conlusion based on the given knowledge base and query:");
    System.out.println("\nTo begin, press enter.\nAfter each conclusion prints, press enter to advance to the next.");
    
    Scanner scan = new Scanner(System.in);
    scan.nextLine();
     
    System.out.println("-----------------------------------------------------");
    System.out.println("Output for Modus Ponens - Entails and Resolution:\n");
    ModusPonensDriver();
    System.out.println("-----------------------------------------------------\n");
    
    System.out.println("Press enter");
    scan.nextLine();
    
    System.out.println("-----------------------------------------------------");
    System.out.println("Output for Wumpus World - Entails and Resolution:\n");
    WumpusWorldDriver();
    System.out.println("-----------------------------------------------------\n");
    
    System.out.println("Press enter");
    scan.nextLine();
    
    System.out.println("-----------------------------------------------------");
    System.out.println("Output for Horn Clauses - Entails and Resolution:\n");
    HornClauseDriver();
    System.out.println("-----------------------------------------------------\n");
    
    System.out.println("Press enter");
    scan.nextLine();
    
    System.out.println("-----------------------------------------------------");
    System.out.println("Output for Liars & Truth Tellers - Part a:\n");
    ResolutionLTTDriver();
    System.out.println("-----------------------------------------------------\n");
    
    System.out.println("Press enter");
    scan.nextLine();
    
    System.out.println("-----------------------------------------------------");
    System.out.println("Output for Liars & Truth Tellers - Part b:\n");
    ResolutionLTTbDriver();
    System.out.println("-----------------------------------------------------\n");
    
     System.out.println("-----------------------------------------------------");
    System.out.println("Output for Advanced Liars & Truth Tellers");
    ResolutionBLTDriver();
    System.out.println("-----------------------------------------------------\n");
    
    scan.close();
  }
  
  public static void HornClauseDriver() {
    HornClausesKB hc = new HornClausesKB();
    hc.HCDriver();
  }
  
  public static void WumpusWorldDriver() {
    WumpusWorldKB ww = new WumpusWorldKB();
    ww.WPDriver();
  }
  
  public static void ModusPonensDriver() {
    ModusPonensKB mp = new ModusPonensKB();
    mp.MPDriver();
  }
  
  public static void ResolutionBLTDriver() {
    BigLandTTKB BL = new BigLandTTKB();
    BL.BLDriver();
  }
  
  public static void ResolutionLTTDriver() {
    LandTTKB L = new LandTTKB();    
    L.LDriver();
  }  
  
  public static void ResolutionLTTbDriver() {
    LandTTbKB Lb = new LandTTbKB();
    Lb.LbDriver();
  }
  
}