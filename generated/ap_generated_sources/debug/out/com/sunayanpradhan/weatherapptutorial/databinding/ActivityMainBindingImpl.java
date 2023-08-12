package com.sunayanpradhan.weatherapptutorial.databinding;
import com.sunayanpradhan.weatherapptutorial.R;
import com.sunayanpradhan.weatherapptutorial.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 1);
        sViewsWithIds.put(R.id.city_search, 2);
        sViewsWithIds.put(R.id.current_location, 3);
        sViewsWithIds.put(R.id.root_layout, 4);
        sViewsWithIds.put(R.id.date_time, 5);
        sViewsWithIds.put(R.id.min_temp, 6);
        sViewsWithIds.put(R.id.max_temp, 7);
        sViewsWithIds.put(R.id.temp, 8);
        sViewsWithIds.put(R.id.feels_like, 9);
        sViewsWithIds.put(R.id.weather_img, 10);
        sViewsWithIds.put(R.id.weather_title, 11);
        sViewsWithIds.put(R.id.options_layout, 12);
        sViewsWithIds.put(R.id.pressure_layout, 13);
        sViewsWithIds.put(R.id.pressure_img, 14);
        sViewsWithIds.put(R.id.pressure_value, 15);
        sViewsWithIds.put(R.id.humidity_layout, 16);
        sViewsWithIds.put(R.id.humidity_img, 17);
        sViewsWithIds.put(R.id.humidity_value, 18);
        sViewsWithIds.put(R.id.wind_layout, 19);
        sViewsWithIds.put(R.id.wind_img, 20);
        sViewsWithIds.put(R.id.wind_value, 21);
        sViewsWithIds.put(R.id.sunrise_layout, 22);
        sViewsWithIds.put(R.id.sunrise_img, 23);
        sViewsWithIds.put(R.id.sunrise_value, 24);
        sViewsWithIds.put(R.id.sunset_layout, 25);
        sViewsWithIds.put(R.id.sunset_img, 26);
        sViewsWithIds.put(R.id.sunset_value, 27);
        sViewsWithIds.put(R.id.temp_f_layout, 28);
        sViewsWithIds.put(R.id.temp_f, 29);
        sViewsWithIds.put(R.id.temp_f_value, 30);
        sViewsWithIds.put(R.id.ground_layout, 31);
        sViewsWithIds.put(R.id.ground_img, 32);
        sViewsWithIds.put(R.id.ground_value, 33);
        sViewsWithIds.put(R.id.sea_layout, 34);
        sViewsWithIds.put(R.id.sea_img, 35);
        sViewsWithIds.put(R.id.sea_value, 36);
        sViewsWithIds.put(R.id.country_layout, 37);
        sViewsWithIds.put(R.id.country, 38);
        sViewsWithIds.put(R.id.country_value, 39);
        sViewsWithIds.put(R.id.progress_bar, 40);
        sViewsWithIds.put(R.id.banner_ads, 41);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 42, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[1]
            , (com.google.android.gms.ads.AdView) bindings[41]
            , (android.widget.EditText) bindings[2]
            , (android.widget.ImageView) bindings[38]
            , (android.widget.LinearLayout) bindings[37]
            , (android.widget.TextView) bindings[39]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[9]
            , (android.widget.ImageView) bindings[32]
            , (android.widget.LinearLayout) bindings[31]
            , (android.widget.TextView) bindings[33]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.ProgressBar) bindings[40]
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.ImageView) bindings[35]
            , (android.widget.LinearLayout) bindings[34]
            , (android.widget.TextView) bindings[36]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.LinearLayout) bindings[22]
            , (android.widget.TextView) bindings[24]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.LinearLayout) bindings[28]
            , (android.widget.TextView) bindings[30]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.TextView) bindings[21]
            );
        this.mainLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}