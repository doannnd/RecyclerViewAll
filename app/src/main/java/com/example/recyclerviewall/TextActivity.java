package com.example.recyclerviewall;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TextActivity extends AppCompatActivity {

    @BindView(R.id.tv_hello)
    TextView tvHello;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        ButterKnife.bind(this);

        /**
         * set color nè
         */
        String textData = tvHello.getText().toString();
        Spannable spannable = new SpannableString(textData);
//        spannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorAccent)),
//                0, textData.length(),
//                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

//        spannable.setSpan(new StrikethroughSpan(),
//                0, 4,
//                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

//        spannable.setSpan(new UnderlineSpan(),
//                0, 4,
//               Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);



        /**
         * gạch ngang văn bản nè
         */

        /**
         * cách 1 nè gạch ngang toàn bộ văn bản
         */
        //tvHello.setPaintFlags(tvHello.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        tvHello.setText(spannable);

        /**
         * cách mà gạch ngang một phần văn bản nè,
         */


    }
}
