public class Tree extends GameObject{

    public Tree(String Type) {
        super(Type);}


    @Override
    public String getMessage(){
        return "Dont shoot me asshole";
    };

    public String toString(){
        return "Tree";
    }
}