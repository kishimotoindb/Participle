package com.example.root.participle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
 * 分词相关
 *
 * 问题列表:
 * 1.FirstLetterUtil.java 试用
 *
 */

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tvLabel)
    TextView mTvLabel;
    @Bind(R.id.btn_first_letter_util)
    Button mBtnFirstLetterUtil;
    @Bind(R.id.activity_main)
    LinearLayout mActivityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_first_letter_util})
    public void onClick(View view) {
//        String s = FirstLetterUtil.getFirstLetter("崔海辰"); // s="CHC"
        String s = FirstLetterUtil.getFirstLetter("cuihaichen"); //s=CUIHAICHEN
        mTvLabel.setText(s);
    }
}
