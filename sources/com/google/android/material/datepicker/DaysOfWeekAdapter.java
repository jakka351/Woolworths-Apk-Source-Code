package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.woolworths.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes6.dex */
class DaysOfWeekAdapter extends BaseAdapter {
    public final Calendar d;
    public final int e;
    public final int f;

    public DaysOfWeekAdapter() {
        Calendar calendarG = UtcDates.g(null);
        this.d = calendarG;
        this.e = calendarG.getMaximum(7);
        this.f = calendarG.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f;
        int i3 = this.e;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.d;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, 4, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public DaysOfWeekAdapter(int i) {
        Calendar calendarG = UtcDates.g(null);
        this.d = calendarG;
        this.e = calendarG.getMaximum(7);
        this.f = i;
    }
}
