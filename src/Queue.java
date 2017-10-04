import com.sun.istack.internal.Nullable;

/**
 * Created by flux
 */

class Queue {

    private Integer[] mArray;
    private Integer mIndex;
    private Integer mSize;

    public Queue(Integer size) {
        mArray = new Integer[size];
        mSize = size;
        mIndex = -1;
    }

    public boolean push(Integer value) {
        if (mIndex == mSize - 1) {
            System.out.println("Error pushing");
            return false;
        }
        System.out.println("Push " + String.valueOf(value) + " into mArray[" + String.valueOf((mIndex + 1)) + "]");
        mArray[++mIndex] = value;
        return true;
    }

    @Nullable
    public Integer pop() {
//        return mIndex == -1 ? null : mArray[mIndex--];
        if(mIndex == -1){
            System.out.println("Error poping");
            return null;
        }
        Integer temp = mArray[mIndex--];
        System.out.println("Pop " + String.valueOf(temp) + " from mArray[" + String.valueOf((mIndex + 1)) + "]");
        return temp;
    }

    public Integer getSize() {
        return mSize;
    }
    
    public Integer popElementByIndex(Integer index){
/**
 *Вытаскивает элемент, который идёт index по счёту
 */
        mIndex -= index;
        return pop();
    }

    @Nullable
        public Integer findElementByValue(Integer value){
        for (int i = 0; i < mSize; i++) {
            if(value == mArray[i]){
                System.out.println("Complete find " + String.valueOf(value));
                mIndex = i;
                return mIndex;
            }
        }
        System.out.println("Error find");
        return null;
    }

    @Nullable
    public Integer findPopElementByValue(Integer value) {
        Integer temp;
        boolean bool = true;
        while(true){
            temp = pop();
            if (temp == null){
                System.out.println("Error findPop");
                return null;
            }
            else if(temp == value){
                System.out.println("Complete find " + String.valueOf(temp));
                return temp;
            }
        }
    }

    public boolean isEmpty(){
        return mIndex == -1;
    }

    public void clear(){
        mIndex = -1;
    }

    public void resize(Integer size){
        mArray = new Integer[size];
        mSize = size;
        mIndex = -1;
    }

}