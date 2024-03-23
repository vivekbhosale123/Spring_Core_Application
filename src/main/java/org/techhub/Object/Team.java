package org.techhub.Object;

import org.springframework.beans.factory.annotation.Autowired;

public class Team {
   @Autowired
   private Player player;
   public void setTeam(Player player)
   {
	   this.player=player;
   }
   public void show()
   {
	   System.out.println(player.getId()+"\t"+player.getName()+"\t"+player.getPrice());
   }
}
