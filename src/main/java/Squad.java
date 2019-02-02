import java.util.List;
import java.util.ArrayList;

public class Squad {
    public String mName;
    public int mSize;
    public String mCause;
    private static List<Squad> squadList = new ArrayList<Squad>();
    private List<Hero> mHeroes;
    private int mId;

    public Squad(String name, int size, String cause) {
        mName = name;
        mSize = size;
        mCause = cause;
        mHeroes = new ArrayList<Hero>();
        mId = squadList.size();
    }

    public String getName() {
        return mName;
    }

    public int getSize() {
        return mSize;
    }

    public String getCause() {
        return mCause;
    }

    public static void clear() {
        squadList.clear();
    }

    public static List<Squad> all() {
        return squadList;
    }

    public static Squad find(int id) {
        return squadList.get(id - 1);
    }

    public int getId() {
        return mId;
    }

    public void addHero(Hero hero){
        mHeroes.add(hero);
      }
      public List<Hero> getHeros() {
       return mHeroes;
     }

}