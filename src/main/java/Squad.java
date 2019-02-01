public class Squad{
    public String mName;
    public int mSize;
    public String mCause;

    public Squad(String name, int size, String cause){
        mName = name;
        mSize = size;
        mCause = cause;
    }
    public String getName(){
        return mName;
    }
    public int getSize(){
        return mSize;
    }
    public String getCause(){
        return mCause;
    }
}