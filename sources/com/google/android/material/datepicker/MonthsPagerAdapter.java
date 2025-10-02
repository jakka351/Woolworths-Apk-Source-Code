package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.datepicker.MaterialCalendar;
import com.woolworths.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes6.dex */
class MonthsPagerAdapter extends RecyclerView.Adapter<ViewHolder> {
    public final CalendarConstraints g;
    public final DateSelector h;
    public final DayViewDecorator i;
    public final MaterialCalendar.AnonymousClass3 j;
    public final int k;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public final TextView f14569a;
        public final MaterialCalendarGridView b;

        public ViewHolder(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f14569a = textView;
            ViewCompat.B(textView, true);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    public MonthsPagerAdapter(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, MaterialCalendar.AnonymousClass3 anonymousClass3) {
        Month month = calendarConstraints.d;
        Month month2 = calendarConstraints.e;
        Month month3 = calendarConstraints.g;
        if (month.d.compareTo(month3.d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (month3.d.compareTo(month2.d) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.k = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * MonthAdapter.j) + (MaterialDatePicker.R1(android.R.attr.windowFullscreen, contextThemeWrapper) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.g = calendarConstraints;
        this.h = dateSelector;
        this.i = dayViewDecorator;
        this.j = anonymousClass3;
        E(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.g.j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long j(int i) {
        Calendar calendarC = UtcDates.c(this.g.d.d);
        calendarC.add(2, i);
        return new Month(calendarC).d.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = (ViewHolder) viewHolder;
        CalendarConstraints calendarConstraints = this.g;
        Calendar calendarC = UtcDates.c(calendarConstraints.d.d);
        calendarC.add(2, i);
        Month month = new Month(calendarC);
        viewHolder2.f14569a.setText(month.c());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) viewHolder2.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !month.equals(materialCalendarGridView.a().d)) {
            MonthAdapter monthAdapter = new MonthAdapter(month, this.h, calendarConstraints, this.i);
            materialCalendarGridView.setNumColumns(month.g);
            materialCalendarGridView.setAdapter((ListAdapter) monthAdapter);
        } else {
            materialCalendarGridView.invalidate();
            MonthAdapter monthAdapterA = materialCalendarGridView.a();
            DateSelector dateSelector = monthAdapterA.e;
            Iterator it = monthAdapterA.f.iterator();
            while (it.hasNext()) {
                monthAdapterA.f(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.z0().iterator();
                while (it2.hasNext()) {
                    monthAdapterA.f(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                monthAdapterA.f = dateSelector.z0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.google.android.material.datepicker.MonthsPagerAdapter.1
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                Callback.j(view);
                try {
                    MonthAdapter monthAdapterA2 = materialCalendarGridView2.a();
                    if (i2 >= monthAdapterA2.a() && i2 <= monthAdapterA2.d()) {
                        MonthsPagerAdapter.this.j.a(materialCalendarGridView2.a().getItem(i2).longValue());
                    }
                    Callback.k();
                } catch (Throwable th) {
                    Callback.k();
                    throw th;
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.R1(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            return new ViewHolder(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, this.k));
        return new ViewHolder(linearLayout, true);
    }
}
