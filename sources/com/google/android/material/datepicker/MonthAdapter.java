package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.core.util.Pair;
import com.woolworths.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes6.dex */
class MonthAdapter extends BaseAdapter {
    public static final int j = UtcDates.g(null).getMaximum(4);
    public static final int k = (UtcDates.g(null).getMaximum(7) + UtcDates.g(null).getMaximum(5)) - 1;
    public final Month d;
    public final DateSelector e;
    public Collection f;
    public CalendarStyle g;
    public final CalendarConstraints h;
    public final DayViewDecorator i;

    public MonthAdapter(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.d = month;
        this.e = dateSelector;
        this.h = calendarConstraints;
        this.i = dayViewDecorator;
        this.f = dateSelector.z0();
    }

    public final int a() {
        int firstDayOfWeek = this.h.h;
        Month month = this.d;
        Calendar calendar = month.d;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + month.g : i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > d()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarC = UtcDates.c(this.d.d);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int d() {
        return (a() + this.d.h) - 1;
    }

    public final void e(TextView textView, long j2, int i) {
        boolean z;
        boolean z2;
        CalendarItemStyle calendarItemStyle;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z3 = true;
        boolean z4 = UtcDates.f().getTimeInMillis() == j2;
        DateSelector dateSelector = this.e;
        Iterator it = dateSelector.R1().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            Object obj = ((Pair) it.next()).f2463a;
            if (obj != null && ((Long) obj).longValue() == j2) {
                z = true;
                break;
            }
        }
        Iterator it2 = dateSelector.R1().iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = false;
                break;
            }
            Object obj2 = ((Pair) it2.next()).b;
            if (obj2 != null && ((Long) obj2).longValue() == j2) {
                z2 = true;
                break;
            }
        }
        Calendar calendarF = UtcDates.f();
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j2);
        String str = calendarF.get(1) == calendarG.get(1) ? UtcDates.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j2)) : UtcDates.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j2));
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (this.h.f.d0(j2)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.z0().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z3 = false;
                    break;
                } else {
                    if (UtcDates.a(j2) == UtcDates.a(((Long) it3.next()).longValue())) {
                        break;
                    }
                }
            }
            textView.setSelected(z3);
            calendarItemStyle = z3 ? this.g.b : UtcDates.f().getTimeInMillis() == j2 ? this.g.c : this.g.f14563a;
        } else {
            textView.setEnabled(false);
            calendarItemStyle = this.g.g;
        }
        if (this.i == null || i == -1) {
            calendarItemStyle.b(textView);
            return;
        }
        int i2 = this.d.f;
        calendarItemStyle.b(textView);
        textView.setCompoundDrawables(null, null, null, null);
        textView.setContentDescription(str);
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j2) {
        Month monthB = Month.b(j2);
        Month month = this.d;
        if (monthB.equals(month)) {
            Calendar calendarC = UtcDates.c(month.d);
            calendarC.setTimeInMillis(j2);
            int i = calendarC.get(5);
            e((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (i - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j2, i);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return k;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.d.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            com.google.android.material.datepicker.CalendarStyle r1 = r5.g
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.CalendarStyle r1 = new com.google.android.material.datepicker.CalendarStyle
            r1.<init>(r0)
            r5.g = r1
        Lf:
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L27
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131559150(0x7f0d02ee, float:1.8743636E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r7 = r5.a()
            int r7 = r6 - r7
            if (r7 < 0) goto L5d
            com.google.android.material.datepicker.Month r8 = r5.d
            int r2 = r8.h
            if (r7 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L66
        L5d:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            long r1 = r6.longValue()
            r5.e(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MonthAdapter.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
