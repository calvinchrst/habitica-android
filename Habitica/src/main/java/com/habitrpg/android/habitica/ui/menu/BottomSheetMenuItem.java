package com.habitrpg.android.habitica.ui.menu;

import com.habitrpg.android.habitica.R;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BottomSheetMenuItem {

    private String title;
    private Boolean isDestructive;

    public BottomSheetMenuItem(String title) {
        this.title = title;
        this.isDestructive = false;
    }

    public BottomSheetMenuItem(String title, Boolean isDestructive) {
        this.title = title;
        this.isDestructive = isDestructive;
    }

    public View inflate(Context context, LayoutInflater inflater, ViewGroup contentView) {
        LinearLayout menuItemView = (LinearLayout) inflater.inflate(R.layout.menu_bottom_sheet_item, contentView, false);
        TextView textView = (TextView) menuItemView.findViewById(R.id.textView);
        textView.setText(this.title);
        if (this.isDestructive) {
            textView.setTextColor(ContextCompat.getColor(context, R.color.worse_50));
        }
        return menuItemView;
    }
}