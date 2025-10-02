package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes6.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    public int e;
    public DateSelector f;
    public CalendarConstraints g;
    public DayViewDecorator h;
    public Month i;
    public CalendarSelector j;
    public CalendarStyle k;
    public RecyclerView l;
    public RecyclerView m;
    public View n;
    public View o;
    public View p;
    public View q;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$1, reason: invalid class name */
    class AnonymousClass1 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            accessibilityNodeInfoCompat.n(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$3, reason: invalid class name */
    class AnonymousClass3 implements OnDayClickListener {
        public AnonymousClass3() {
        }

        public final void a(long j) {
            MaterialCalendar materialCalendar = MaterialCalendar.this;
            if (materialCalendar.g.f.d0(j)) {
                materialCalendar.f.V0(j);
                Iterator it = materialCalendar.d.iterator();
                while (it.hasNext()) {
                    ((OnSelectionChangedListener) it.next()).b(materialCalendar.f.T0());
                }
                materialCalendar.m.getAdapter().l();
                RecyclerView recyclerView = materialCalendar.l;
                if (recyclerView != null) {
                    recyclerView.getAdapter().l();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.MaterialCalendar$4, reason: invalid class name */
    class AnonymousClass4 extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            accessibilityNodeInfoCompat.q(false);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CalendarSelector {
        public static final CalendarSelector d;
        public static final CalendarSelector e;
        public static final /* synthetic */ CalendarSelector[] f;

        static {
            CalendarSelector calendarSelector = new CalendarSelector("DAY", 0);
            d = calendarSelector;
            CalendarSelector calendarSelector2 = new CalendarSelector("YEAR", 1);
            e = calendarSelector2;
            f = new CalendarSelector[]{calendarSelector, calendarSelector2};
        }

        public static CalendarSelector valueOf(String str) {
            return (CalendarSelector) Enum.valueOf(CalendarSelector.class, str);
        }

        public static CalendarSelector[] values() {
            return (CalendarSelector[]) f.clone();
        }
    }

    public interface OnDayClickListener {
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public final void E1(OnSelectionChangedListener onSelectionChangedListener) {
        this.d.add(onSelectionChangedListener);
    }

    public final void I1(Month month) {
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.m.getAdapter();
        final int iD = monthsPagerAdapter.g.d.d(month);
        int iD2 = iD - monthsPagerAdapter.g.d.d(this.i);
        boolean z = Math.abs(iD2) > 3;
        boolean z2 = iD2 > 0;
        this.i = month;
        if (z && z2) {
            this.m.o0(iD - 3);
            this.m.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.m.s0(iD);
                }
            });
        } else if (!z) {
            this.m.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.m.s0(iD);
                }
            });
        } else {
            this.m.o0(iD + 3);
            this.m.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.11
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialCalendar.this.m.s0(iD);
                }
            });
        }
    }

    public final void Q1(CalendarSelector calendarSelector) {
        this.j = calendarSelector;
        if (calendarSelector == CalendarSelector.e) {
            this.l.getLayoutManager().E0(this.i.f - ((YearGridAdapter) this.l.getAdapter()).g.g.d.f);
            this.p.setVisibility(0);
            this.q.setVisibility(8);
            this.n.setVisibility(8);
            this.o.setVisibility(8);
            return;
        }
        if (calendarSelector == CalendarSelector.d) {
            this.p.setVisibility(8);
            this.q.setVisibility(0);
            this.n.setVisibility(0);
            this.o.setVisibility(0);
            I1(this.i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.e = bundle.getInt("THEME_RES_ID_KEY");
        this.f = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.g = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.h = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.i = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Resources.NotFoundException {
        int i;
        final int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.e);
        this.k = new CalendarStyle(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.g.d;
        if (MaterialDatePicker.R1(R.attr.windowFullscreen, contextThemeWrapper)) {
            i = com.woolworths.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = com.woolworths.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = requireContext().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(com.woolworths.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(com.woolworths.R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = MonthAdapter.j;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(com.woolworths.R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(com.woolworths.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(com.woolworths.R.id.mtrl_calendar_days_of_week);
        ViewCompat.A(gridView, new AnonymousClass1());
        int i4 = this.g.h;
        gridView.setAdapter((ListAdapter) (i4 > 0 ? new DaysOfWeekAdapter(i4) : new DaysOfWeekAdapter()));
        gridView.setNumColumns(month.g);
        gridView.setEnabled(false);
        this.m = (RecyclerView) viewInflate.findViewById(com.woolworths.R.id.mtrl_calendar_months);
        getContext();
        this.m.setLayoutManager(new SmoothCalendarLayoutManager(i2) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void R0(RecyclerView.State state, int[] iArr) {
                int i5 = i2;
                MaterialCalendar materialCalendar = MaterialCalendar.this;
                if (i5 == 0) {
                    iArr[0] = materialCalendar.m.getWidth();
                    iArr[1] = materialCalendar.m.getWidth();
                } else {
                    iArr[0] = materialCalendar.m.getHeight();
                    iArr[1] = materialCalendar.m.getHeight();
                }
            }
        });
        this.m.setTag("MONTHS_VIEW_GROUP_TAG");
        final MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f, this.g, this.h, new AnonymousClass3());
        this.m.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(com.woolworths.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(com.woolworths.R.id.mtrl_calendar_year_selector_frame);
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.l.setLayoutManager(new GridLayoutManager(integer, 1));
            this.l.setAdapter(new YearGridAdapter(this));
            this.l.i(new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.5

                /* renamed from: a, reason: collision with root package name */
                public final Calendar f14565a = UtcDates.g(null);
                public final Calendar b = UtcDates.g(null);

                @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                public final void g(Canvas canvas, RecyclerView recyclerView2, RecyclerView.State state) {
                    if ((recyclerView2.getAdapter() instanceof YearGridAdapter) && (recyclerView2.getLayoutManager() instanceof GridLayoutManager)) {
                        YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView2.getAdapter();
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView2.getLayoutManager();
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        Iterator it = materialCalendar.f.R1().iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            Object obj = pair.f2463a;
                            Object obj2 = pair.b;
                            if (obj != null && obj2 != null) {
                                long jLongValue = ((Long) obj).longValue();
                                Calendar calendar = this.f14565a;
                                calendar.setTimeInMillis(jLongValue);
                                long jLongValue2 = ((Long) obj2).longValue();
                                Calendar calendar2 = this.b;
                                calendar2.setTimeInMillis(jLongValue2);
                                int i5 = calendar.get(1) - yearGridAdapter.g.g.d.f;
                                int i6 = calendar2.get(1) - yearGridAdapter.g.g.d.f;
                                View viewU = gridLayoutManager.u(i5);
                                View viewU2 = gridLayoutManager.u(i6);
                                int i7 = gridLayoutManager.F;
                                int i8 = i5 / i7;
                                int i9 = i6 / i7;
                                for (int i10 = i8; i10 <= i9; i10++) {
                                    View viewU3 = gridLayoutManager.u(gridLayoutManager.F * i10);
                                    if (viewU3 != null) {
                                        int top = viewU3.getTop() + materialCalendar.k.d.f14562a.top;
                                        int bottom = viewU3.getBottom() - materialCalendar.k.d.f14562a.bottom;
                                        canvas.drawRect((i10 != i8 || viewU == null) ? 0 : (viewU.getWidth() / 2) + viewU.getLeft(), top, (i10 != i9 || viewU2 == null) ? recyclerView2.getWidth() : (viewU2.getWidth() / 2) + viewU2.getLeft(), bottom, materialCalendar.k.h);
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
        if (viewInflate.findViewById(com.woolworths.R.id.month_navigation_fragment_toggle) != null) {
            final MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(com.woolworths.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            ViewCompat.A(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
                    this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    accessibilityNodeInfo.setHintText(materialCalendar.q.getVisibility() == 0 ? materialCalendar.getString(com.woolworths.R.string.mtrl_picker_toggle_to_year_selection) : materialCalendar.getString(com.woolworths.R.string.mtrl_picker_toggle_to_day_selection));
                }
            });
            View viewFindViewById = viewInflate.findViewById(com.woolworths.R.id.month_navigation_previous);
            this.n = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(com.woolworths.R.id.month_navigation_next);
            this.o = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.p = viewInflate.findViewById(com.woolworths.R.id.mtrl_calendar_year_selector_frame);
            this.q = viewInflate.findViewById(com.woolworths.R.id.mtrl_calendar_day_selector_frame);
            Q1(CalendarSelector.d);
            materialButton.setText(this.i.c());
            this.m.k(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void a(int i5, RecyclerView recyclerView2) {
                    if (i5 == 0) {
                        recyclerView2.announceForAccessibility(materialButton.getText());
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public final void d(RecyclerView recyclerView2, int i5, int i6) {
                    CalendarConstraints calendarConstraints = monthsPagerAdapter.g;
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    int iB1 = i5 < 0 ? ((LinearLayoutManager) materialCalendar.m.getLayoutManager()).b1() : ((LinearLayoutManager) materialCalendar.m.getLayoutManager()).d1();
                    Calendar calendarC = UtcDates.c(calendarConstraints.d.d);
                    calendarC.add(2, iB1);
                    materialCalendar.i = new Month(calendarC);
                    Calendar calendarC2 = UtcDates.c(calendarConstraints.d.d);
                    calendarC2.add(2, iB1);
                    materialButton.setText(new Month(calendarC2).c());
                }
            });
            materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Callback.g(view);
                    try {
                        MaterialCalendar materialCalendar = MaterialCalendar.this;
                        CalendarSelector calendarSelector = CalendarSelector.d;
                        CalendarSelector calendarSelector2 = materialCalendar.j;
                        CalendarSelector calendarSelector3 = CalendarSelector.e;
                        if (calendarSelector2 == calendarSelector3) {
                            materialCalendar.Q1(calendarSelector);
                        } else if (calendarSelector2 == calendarSelector) {
                            materialCalendar.Q1(calendarSelector3);
                        }
                    } finally {
                        Callback.h();
                    }
                }
            });
            this.o.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    Callback.g(view);
                    try {
                        int iB1 = ((LinearLayoutManager) materialCalendar.m.getLayoutManager()).b1() + 1;
                        if (iB1 < materialCalendar.m.getAdapter().i()) {
                            Calendar calendarC = UtcDates.c(monthsPagerAdapter.g.d.d);
                            calendarC.add(2, iB1);
                            materialCalendar.I1(new Month(calendarC));
                        }
                        Callback.h();
                    } catch (Throwable th) {
                        Callback.h();
                        throw th;
                    }
                }
            });
            this.n.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MaterialCalendar materialCalendar = MaterialCalendar.this;
                    Callback.g(view);
                    try {
                        int iD1 = ((LinearLayoutManager) materialCalendar.m.getLayoutManager()).d1() - 1;
                        if (iD1 >= 0) {
                            Calendar calendarC = UtcDates.c(monthsPagerAdapter.g.d.d);
                            calendarC.add(2, iD1);
                            materialCalendar.I1(new Month(calendarC));
                        }
                        Callback.h();
                    } catch (Throwable th) {
                        Callback.h();
                        throw th;
                    }
                }
            });
        }
        if (!MaterialDatePicker.R1(R.attr.windowFullscreen, contextThemeWrapper)) {
            new PagerSnapHelper().b(this.m);
        }
        this.m.o0(monthsPagerAdapter.g.d.d(this.i));
        ViewCompat.A(this.m, new AnonymousClass4());
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.e);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.g);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.h);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.i);
    }
}
