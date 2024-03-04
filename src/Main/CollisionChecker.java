package Main;

import entity.entity;

public class CollisionChecker {

    GamePanel gp;

    public CollisionChecker(GamePanel gp) {

        this.gp = gp;

    }

    public void checkTile(entity Entity) {

        int entityLeftMapX = Entity.x + Entity.solidArea.x;
        int entityRightMapX = Entity.x + Entity.solidArea.x + Entity.solidArea.width;
        int entityTopMapY = Entity.y + Entity.solidArea.y;
        int entityBottomMapY = Entity.y + Entity.solidArea.y + Entity.solidArea.height;

        int entityLeftCol = entityLeftMapX / gp.tileSize;
        int entityRightCol = entityRightMapX / gp.tileSize;
        int entityTopRow = entityTopMapY / gp.tileSize;
        int entityBottomRow = entityBottomMapY / gp.tileSize;

        int tileNum1, tileNum2;

        switch (Entity.direction) {

            case "up":
                entityTopRow = (entityTopMapY - Entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];

                if (gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    Entity.collisionOn = true;
                }
                break;

            case "down":
                entityBottomRow = (entityBottomMapY + Entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if (gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    Entity.collisionOn = true;
                }
                break;

            case "left":
                entityLeftCol = (entityLeftMapX - Entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityLeftCol][entityBottomRow];

                if (gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    Entity.collisionOn = true;
                }
                break;

            case "right":
                entityRightCol = (entityRightMapX + Entity.speed) / gp.tileSize;
                tileNum1 = gp.tileM.mapTileNum[entityRightCol][entityTopRow];
                tileNum2 = gp.tileM.mapTileNum[entityRightCol][entityBottomRow];

                if (gp.tileM.tile[tileNum1].collision == true || gp.tileM.tile[tileNum2].collision == true) {
                    Entity.collisionOn = true;
                }
                break;

        }

    }}

//    public int checkObject(entity Entity, boolean player) {
//
//        int index = 999;
//
//        for (int i = 0; i < gp.obj.length; i++) {
//
//            if (gp.obj[i] != null) {
//
//                //get entitys solid area position
//                Entity.solidArea.x = Entity.screenX + Entity.solidArea.x;
//                Entity.solidArea.y = Entity.screenY + Entity.solidArea.y;
//
//                //get objects solid area position
//                gp.obj[i].solidArea.x = gp.obj[i].mapX + gp.obj[i].solidArea.x;
//                gp.obj[i].solidArea.y = gp.obj[i].mapY + gp.obj[i].solidArea.y;
//
//                switch (Entity.direction) {
//
//                    case "up":
//                        Entity.solidArea.y -= Entity.speed;
//
//                        if (Entity.solidArea.intersects(gp.obj[i].solidArea)) {
//                            System.out.println("up collision");
//                        }
//
//                        break;
//
//                    case "down":
//
//                        Entity.solidArea.y += Entity.speed;
//
//                        if (Entity.solidArea.intersects(gp.obj[i].solidArea)) {
//                            System.out.println("up collision");
//                        }
//                        break;
//
//                    case "left":
//
//                        Entity.solidArea.x -= Entity.speed;
//
//                        if (Entity.solidArea.intersects(gp.obj[i].solidArea)) {
//                            System.out.println("up collision");
//                        }
//
//                        break;
//
//                    case "right":
//
//                        Entity.solidArea.x += Entity.speed;
//
//                        if (Entity.solidArea.intersects(gp.obj[i].solidArea)) {
//                            System.out.println("up collision");
//                        }
//
//                        break;
//
//                }
//
//            }
//
//            Entity.solidArea.x = Entity.solidAreaDefaultX;
//            Entity.solidArea.x = Entity.solidAreaDefaultX;
//
//            if (this.gp.obj[i] != null) {
//                System.out.println("not null");
//                gp.obj[i].solidArea.x = gp.obj[i].solidAreaDefaultX;
//                gp.obj[i].solidArea.y = gp.obj[i].solidAreaDefaultY;
//
//            }
//
//        }
//
//        return index;

//    }
//
//}
