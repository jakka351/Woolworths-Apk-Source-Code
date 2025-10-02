package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.datepicker.MaterialCalendar;
import com.woolworths.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
class YearGridAdapter extends RecyclerView.Adapter<ViewHolder> {
    public final MaterialCalendar g;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f14571a;

        public ViewHolder(TextView textView) {
            super(textView);
            this.f14571a = textView;
        }
    }

    public YearGridAdapter(MaterialCalendar materialCalendar) {
        this.g = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.g.i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        MaterialCalendar materialCalendar = this.g;
        final int i2 = materialCalendar.g.d.f + i;
        TextView textView = ((ViewHolder) viewHolder).f14571a;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(UtcDates.f().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        CalendarStyle calendarStyle = materialCalendar.k;
        Calendar calendarF = UtcDates.f();
        CalendarItemStyle calendarItemStyle = calendarF.get(1) == i2 ? calendarStyle.f : calendarStyle.d;
        Iterator it = materialCalendar.f.z0().iterator();
        while (it.hasNext()) {
            calendarF.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarF.get(1) == i2) {
                calendarItemStyle = calendarStyle.e;
            }
        }
        calendarItemStyle.b(textView);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.YearGridAdapter.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MaterialCalendar materialCalendar2 = YearGridAdapter.this.g;
                Callback.g(view);
                try {
                    Month monthA = Month.a(i2, materialCalendar2.i.e);
                    Calendar calendar = monthA.d;
                    CalendarConstraints calendarConstraints = materialCalendar2.g;
                    Month month = calendarConstraints.e;
                    Month month2 = calendarConstraints.d;
                    if (calendar.compareTo(month2.d) < 0) {
                        monthA = month2;
                    } else if (calendar.compareTo(month.d) > 0) {
                        monthA = month;
                    }
                    materialCalendar2.I1(monthA);
                    materialCalendar2.Q1(MaterialCalendar.CalendarSelector.d);
                } finally {
                    Callback.h();
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        return new ViewHolder((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
