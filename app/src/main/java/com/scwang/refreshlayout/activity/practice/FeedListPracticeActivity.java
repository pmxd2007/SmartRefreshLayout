package com.scwang.refreshlayout.activity.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.scwang.refreshlayout.R;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

/**
 * 微博列表
 */
public class FeedListPracticeActivity extends AppCompatActivity {

    private static boolean isFirstEnter = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_feedlist);

        final Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        final RefreshLayout refreshLayout = findViewById(R.id.refreshLayout);
        if (isFirstEnter) {
            isFirstEnter = false;
            refreshLayout.autoRefresh();
        }
    }

}
