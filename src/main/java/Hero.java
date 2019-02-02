import java.util.List;
import java.util.ArrayList;

public class Hero {
    private String mName;
    private int mAge;
    private String mPower;
    private String mWeakness;
    private int mId;
    private static List<Hero> heroList = new ArrayList<Hero>();

    public Hero(String name, int age, String power, String weakness) {
        mName = name;
        mAge = age;
        mPower = power;
        mWeakness = weakness;
        mId = heroList.size();
    }

    public String getName() {
        return mName;
    }

    public int getAge() {
        return mAge;
    }

    public String getPower() {
        return mPower;
    }

    public String getWeakness() {
        return mWeakness;
    }

    public int getId() {
        return mId;
    }

    public static List<Hero> all() {
        return heroList;
    }
}