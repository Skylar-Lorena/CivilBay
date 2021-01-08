import android.content.Context;
import android.widget.ArrayAdapter;

public class CivilBayArrayAadapter extends ArrayAdapter {
    private Context mContext;
    private String[] companies;
    private String[] skills;

    public CivilBayArrayAadapter(Context mContext, int resource, String[] mRestaurants, String[] mCuisines) {
        super(mContext, resource);
        this.mContext = mContext;
        this.companies = companies;
        this.skills = skills;
    }
}