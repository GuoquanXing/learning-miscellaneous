public class TodoItem {

    private long id;
    private String desc;
    private boolean ticked = false;

    public TodoItem(int id, String desc){
        this.setId(id);
        this.setDesc(desc);
        this.setTicked(false);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean isTicked() {
        return ticked;
    }

    public void setTicked(boolean ticked) {
        this.ticked = ticked;
    }
}
