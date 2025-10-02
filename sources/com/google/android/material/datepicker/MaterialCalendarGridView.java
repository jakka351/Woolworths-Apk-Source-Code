package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class MaterialCalendarGridView extends GridView {
    public final Calendar d;
    public final boolean e;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$1, reason: invalid class name */
    public class AnonymousClass1 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            accessibilityNodeInfoCompat.n(null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    public final MonthAdapter a() {
        return (MonthAdapter) super.getAdapter();
    }

    public final View c(int i) {
        return getChildAt(i - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final Adapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((MonthAdapter) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iA;
        int width;
        int iA2;
        int width2;
        int i;
        int width3;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter monthAdapter = (MonthAdapter) super.getAdapter();
        DateSelector dateSelector = monthAdapter.e;
        Month month = monthAdapter.d;
        CalendarStyle calendarStyle = monthAdapter.g;
        int iMax = Math.max(monthAdapter.a(), materialCalendarGridView.getFirstVisiblePosition());
        int iMin = Math.min(monthAdapter.d(), materialCalendarGridView.getLastVisiblePosition());
        Long item = monthAdapter.getItem(iMax);
        Long item2 = monthAdapter.getItem(iMin);
        Iterator it = dateSelector.R1().iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            Object obj = pair.f2463a;
            Object obj2 = pair.b;
            if (obj == null) {
                materialCalendarGridView = this;
            } else if (obj2 != null) {
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Long l2 = (Long) obj2;
                long jLongValue2 = l2.longValue();
                if (item == null || item2 == null || l.longValue() > item2.longValue() || l2.longValue() < item.longValue()) {
                    materialCalendarGridView = this;
                    month = month;
                    it = it;
                    monthAdapter = monthAdapter;
                } else {
                    boolean zH = ViewUtils.h(materialCalendarGridView);
                    long jLongValue3 = item.longValue();
                    Calendar calendar = materialCalendarGridView.d;
                    if (jLongValue < jLongValue3) {
                        width = iMax % month.g == 0 ? 0 : !zH ? materialCalendarGridView.c(iMax - 1).getRight() : materialCalendarGridView.c(iMax - 1).getLeft();
                        iA = iMax;
                    } else {
                        calendar.setTimeInMillis(jLongValue);
                        iA = monthAdapter.a() + (calendar.get(5) - 1);
                        View viewC = materialCalendarGridView.c(iA);
                        width = (viewC.getWidth() / 2) + viewC.getLeft();
                    }
                    if (jLongValue2 > item2.longValue()) {
                        width2 = (iMin + 1) % month.g == 0 ? materialCalendarGridView.getWidth() : !zH ? materialCalendarGridView.c(iMin).getRight() : materialCalendarGridView.c(iMin).getLeft();
                        iA2 = iMin;
                    } else {
                        calendar.setTimeInMillis(jLongValue2);
                        iA2 = monthAdapter.a() + (calendar.get(5) - 1);
                        View viewC2 = materialCalendarGridView.c(iA2);
                        width2 = (viewC2.getWidth() / 2) + viewC2.getLeft();
                    }
                    int itemId = (int) monthAdapter.getItemId(iA);
                    Iterator it2 = it;
                    Month month2 = month;
                    int itemId2 = (int) monthAdapter.getItemId(iA2);
                    while (itemId <= itemId2) {
                        int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                        MonthAdapter monthAdapter2 = monthAdapter;
                        int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                        View viewC3 = materialCalendarGridView.c(numColumns);
                        int top = viewC3.getTop() + calendarStyle.f14563a.f14562a.top;
                        int i2 = itemId2;
                        int bottom = viewC3.getBottom() - calendarStyle.f14563a.f14562a.bottom;
                        if (zH) {
                            int i3 = iA2 > numColumns2 ? 0 : width2;
                            int width4 = numColumns > iA ? getWidth() : width;
                            i = i3;
                            width3 = width4;
                        } else {
                            i = numColumns > iA ? 0 : width;
                            width3 = iA2 > numColumns2 ? getWidth() : width2;
                        }
                        canvas.drawRect(i, top, width3, bottom, calendarStyle.h);
                        itemId++;
                        materialCalendarGridView = this;
                        monthAdapter = monthAdapter2;
                        itemId2 = i2;
                    }
                    materialCalendarGridView = this;
                    month = month2;
                    it = it2;
                }
            }
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((MonthAdapter) super.getAdapter()).d());
        } else if (i == 130) {
            setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((MonthAdapter) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((MonthAdapter) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.e) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((MonthAdapter) super.getAdapter()).a()) {
            super.setSelection(((MonthAdapter) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = UtcDates.g(null);
        if (MaterialDatePicker.R1(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(com.woolworths.R.id.cancel_button);
            setNextFocusRightId(com.woolworths.R.id.confirm_button);
        }
        this.e = MaterialDatePicker.R1(com.woolworths.R.attr.nestedScrollable, getContext());
        ViewCompat.A(this, new AnonymousClass1());
    }
}
