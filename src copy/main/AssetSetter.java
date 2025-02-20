package main;

import object.Obj_Chest;
import object.Obj_Door;
import object.Obj_Key;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp){
        this.gp = gp;
    }

    public void setObject(){
        gp.obj[0] = new Obj_Key();
        gp.obj[0].worldX = 23 * gp.tileSize;
        gp.obj[0].worldY = 7 * gp.tileSize;

        gp.obj[1] = new Obj_Key();
        gp.obj[1].worldX = 23 * gp.tileSize;
        gp.obj[1].worldY = 40 *gp.tileSize;

        gp.obj[2] = new Obj_Door();
        gp.obj[2].worldX = 10 * gp.tileSize;
        gp.obj[2].worldY = 11 *gp.tileSize;

        gp.obj[3] = new Obj_Chest();
        gp.obj[3].worldX = 10 * gp.tileSize;
        gp.obj[3].worldY = 7 *gp.tileSize;
    }
}
