package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes2.dex */
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public Runnable d;
    public final LinearLayoutCompat e;
    public AppCompatSpinner f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public int k;

    public class TabAdapter extends BaseAdapter {
        public TabAdapter() {
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return ScrollingTabContainerView.this.e.getChildCount();
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return ((TabView) ScrollingTabContainerView.this.e.getChildAt(i)).d;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                TabView tabView = (TabView) view;
                tabView.d = (ActionBar.Tab) getItem(i);
                tabView.a();
                return view;
            }
            ActionBar.Tab tab = (ActionBar.Tab) getItem(i);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            TabView tabView2 = scrollingTabContainerView.new TabView(scrollingTabContainerView.getContext(), tab);
            tabView2.setBackgroundDrawable(null);
            tabView2.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView.j));
            return tabView2;
        }
    }

    public class TabClickListener implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    public class TabView extends LinearLayout {
        public ActionBar.Tab d;
        public AppCompatTextView e;
        public View f;

        public TabView(Context context, ActionBar.Tab tab) {
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.d = tab;
            TintTypedArray tintTypedArrayF = TintTypedArray.f(context, null, iArr, R.attr.actionBarTabStyle, 0);
            if (tintTypedArrayF.b.hasValue(0)) {
                setBackgroundDrawable(tintTypedArrayF.b(0));
            }
            tintTypedArrayF.g();
            setGravity(8388627);
            a();
        }

        public final void a() {
            this.d.getClass();
            View view = this.f;
            if (view != null) {
                removeView(view);
                this.f = null;
            }
            if (TextUtils.isEmpty(null)) {
                AppCompatTextView appCompatTextView = this.e;
                if (appCompatTextView != null) {
                    appCompatTextView.setVisibility(8);
                    this.e.setText((CharSequence) null);
                }
            } else {
                if (this.e == null) {
                    AppCompatTextView appCompatTextView2 = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatTextView2.setLayoutParams(layoutParams);
                    addView(appCompatTextView2);
                    this.e = appCompatTextView2;
                }
                this.e.setText((CharSequence) null);
                this.e.setVisibility(0);
            }
            TooltipCompat.Api26Impl.a(this, null);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
            if (scrollingTabContainerView.h > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = scrollingTabContainerView.h;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class VisibilityAnimListener extends AnimatorListenerAdapter {
        public boolean d = false;

        public VisibilityAnimListener() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.d = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.d) {
                return;
            }
            ScrollingTabContainerView.this.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.d = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView(@NonNull Context context) {
        super(context);
        new VisibilityAnimListener();
        setHorizontalScrollBarEnabled(false);
        ActionBarPolicy actionBarPolicyA = ActionBarPolicy.a(context);
        setContentHeight(actionBarPolicyA.c());
        this.i = actionBarPolicyA.f123a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        this.e = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    public final void a() {
        AppCompatSpinner appCompatSpinner = this.f;
        if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
            return;
        }
        removeView(this.f);
        addView(this.e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionBarPolicy actionBarPolicyA = ActionBarPolicy.a(getContext());
        setContentHeight(actionBarPolicyA.c());
        this.i = actionBarPolicyA.f123a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        Callback.l(view);
        try {
            ((TabView) view).d.a();
            throw null;
        } catch (Throwable th) {
            Callback.m();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        LinearLayoutCompat linearLayoutCompat = this.e;
        int childCount = linearLayoutCompat.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.h = -1;
        } else {
            if (childCount > 2) {
                this.h = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.h = View.MeasureSpec.getSize(i) / 2;
            }
            this.h = Math.min(this.h, this.i);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (z || !this.g) {
            a();
        } else {
            linearLayoutCompat.measure(0, iMakeMeasureSpec);
            if (linearLayoutCompat.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                AppCompatSpinner appCompatSpinner = this.f;
                if (appCompatSpinner == null || appCompatSpinner.getParent() != this) {
                    if (this.f == null) {
                        AppCompatSpinner appCompatSpinner2 = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner2.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
                        appCompatSpinner2.setOnItemSelectedListener(this);
                        this.f = appCompatSpinner2;
                    }
                    removeView(linearLayoutCompat);
                    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f.getAdapter() == null) {
                        this.f.setAdapter((SpinnerAdapter) new TabAdapter());
                    }
                    Runnable runnable = this.d;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.d = null;
                    }
                    this.f.setSelection(this.k);
                }
            } else {
                a();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.k);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.g = z;
    }

    public void setContentHeight(int i) {
        this.j = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.k = i;
        LinearLayoutCompat linearLayoutCompat = this.e;
        int childCount = linearLayoutCompat.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = linearLayoutCompat.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = linearLayoutCompat.getChildAt(i);
                Runnable runnable = this.d;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                Runnable runnable2 = new Runnable() { // from class: androidx.appcompat.widget.ScrollingTabContainerView.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = childAt2;
                        int left = view.getLeft();
                        ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                        scrollingTabContainerView.smoothScrollTo(left - ((scrollingTabContainerView.getWidth() - view.getWidth()) / 2), 0);
                        scrollingTabContainerView.d = null;
                    }
                };
                this.d = runnable2;
                post(runnable2);
            }
            i2++;
        }
        AppCompatSpinner appCompatSpinner = this.f;
        if (appCompatSpinner == null || i < 0) {
            return;
        }
        appCompatSpinner.setSelection(i);
    }
}
