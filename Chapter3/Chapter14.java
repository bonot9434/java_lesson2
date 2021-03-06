package practice;

import java.utils.ArrayList;
import java.utils.List;

public class Chapter14 {
  public static void main(String[] args) {
    List<Character> party = new ArrayList<Character>();
    party.add(new Soldier);
    party.add(new Playboy);

    Chapter14.partyAttack(party);
  }

  public static void main(List<Character> party) {
    for (Character character : party) {
      int hp = character.attack();
      System.out.println("ヒットポイント" + hp);
    }
  }
}