package com.example.recyclerviewall;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatTextView;

public class CustomTextView extends AppCompatTextView {

    private static final String TAG = "CustomTextView";
    private Context mContext;
    
    public CustomTextView(Context context) {
        super(context);
        mContext = context;
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setCustomFont(context, attrs);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
        setCustomFont(context, attrs);
    }

    private void setCustomFont(Context context, AttributeSet attrs) {
        TypedArray customFontTypedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);

        String customFont = customFontTypedArray.getString(R.styleable.CustomTextView_font_family);
        Typeface typeface;
        typeface = Typeface.createFromAsset(context.getAssets(), customFont);
        setTypeface(typeface);
        customFontTypedArray.recycle();
    }
}
