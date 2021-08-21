package entities;

public class StorageShelf extends Entity {
    private final String[] itemUID;
    //Location

    public StorageShelf(String entityID, String[] itemUID){
        this.entityID=entityID;
        this.itemUID=itemUID;
        eType = EntityType.STORAGESHELF;
    }

    public String[] getItemUID() {
        return itemUID;
    }
}
