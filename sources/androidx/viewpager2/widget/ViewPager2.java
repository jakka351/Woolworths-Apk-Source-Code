package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.StatefulAdapter;
import androidx.viewpager2.widget.ScrollEventAdapter;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class ViewPager2 extends ViewGroup {
    public final Rect d;
    public final Rect e;
    public final CompositeOnPageChangeCallback f;
    public int g;
    public boolean h;
    public final RecyclerView.AdapterDataObserver i;
    public LinearLayoutManager j;
    public int k;
    public Parcelable l;
    public RecyclerView m;
    public PagerSnapHelper n;
    public ScrollEventAdapter o;
    public CompositeOnPageChangeCallback p;
    public FakeDrag q;
    public PageTransformerAdapter r;
    public RecyclerView.ItemAnimator s;
    public boolean t;
    public boolean u;
    public int v;
    public PageAwareAccessibilityProvider w;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$4, reason: invalid class name */
    class AnonymousClass4 implements RecyclerView.OnChildAttachStateChangeListener {
        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void b(View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void c(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    public abstract class AccessibilityProvider {
    }

    public class BasicAccessibilityProvider extends AccessibilityProvider {
    }

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            a();
        }
    }

    public class LinearLayoutManagerImpl extends LinearLayoutManager {
        public LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean B0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public final void R0(RecyclerView.State state, int[] iArr) {
            ViewPager2 viewPager2 = ViewPager2.this;
            int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.R0(state, iArr);
                return;
            }
            int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void g0(RecyclerView.Recycler recycler, RecyclerView.State state, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g0(recycler, state, accessibilityNodeInfoCompat);
            ViewPager2.this.w.getClass();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final void i0(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int iO;
            ViewPager2 viewPager2 = ViewPager2.this;
            int iO2 = 0;
            if (viewPager2.getOrientation() == 1) {
                viewPager2.j.getClass();
                iO = RecyclerView.LayoutManager.O(view);
            } else {
                iO = 0;
            }
            if (viewPager2.getOrientation() == 0) {
                viewPager2.j.getClass();
                iO2 = RecyclerView.LayoutManager.O(view);
            }
            accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(iO, 1, iO2, 1, false, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
        public final boolean v0(RecyclerView.Recycler recycler, RecyclerView.State state, int i, Bundle bundle) {
            ViewPager2.this.w.getClass();
            return super.v0(recycler, state, i, bundle);
        }
    }

    @IntRange
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OffscreenPageLimit {
    }

    public static abstract class OnPageChangeCallback {
        public void a(int i) {
        }

        public void b(float f, int i, int i2) {
        }

        public void c(int i) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface Orientation {
    }

    public class PageAwareAccessibilityProvider extends AccessibilityProvider {

        /* renamed from: a, reason: collision with root package name */
        public final AccessibilityViewCommand f3839a = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean b(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.u) {
                    viewPager2.f(currentItem, true);
                }
                return true;
            }
        };
        public final AccessibilityViewCommand b = new AccessibilityViewCommand() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.2
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean b(View view) {
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.u) {
                    viewPager2.f(currentItem, true);
                }
                return true;
            }
        };
        public RecyclerView.AdapterDataObserver c;

        public PageAwareAccessibilityProvider() {
        }

        public final void a() {
            int i;
            int i2 = R.id.accessibilityActionPageLeft;
            ViewPager2 viewPager2 = ViewPager2.this;
            ViewCompat.w(R.id.accessibilityActionPageLeft, viewPager2);
            ViewCompat.t(0, viewPager2);
            ViewCompat.w(R.id.accessibilityActionPageRight, viewPager2);
            ViewCompat.t(0, viewPager2);
            ViewCompat.w(R.id.accessibilityActionPageUp, viewPager2);
            ViewCompat.t(0, viewPager2);
            ViewCompat.w(R.id.accessibilityActionPageDown, viewPager2);
            ViewCompat.t(0, viewPager2);
            if (viewPager2.getAdapter() == null || (i = viewPager2.getAdapter().i()) == 0 || !viewPager2.u) {
                return;
            }
            int orientation = viewPager2.getOrientation();
            AccessibilityViewCommand accessibilityViewCommand = this.b;
            AccessibilityViewCommand accessibilityViewCommand2 = this.f3839a;
            if (orientation != 0) {
                if (viewPager2.g < i - 1) {
                    ViewCompat.x(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageDown, (CharSequence) null), null, accessibilityViewCommand2);
                }
                if (viewPager2.g > 0) {
                    ViewCompat.x(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(R.id.accessibilityActionPageUp, (CharSequence) null), null, accessibilityViewCommand);
                    return;
                }
                return;
            }
            boolean zB = viewPager2.b();
            int i3 = zB ? 16908360 : 16908361;
            if (zB) {
                i2 = 16908361;
            }
            if (viewPager2.g < i - 1) {
                ViewCompat.x(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i3, (CharSequence) null), null, accessibilityViewCommand2);
            }
            if (viewPager2.g > 0) {
                ViewCompat.x(viewPager2, new AccessibilityNodeInfoCompat.AccessibilityActionCompat(i2, (CharSequence) null), null, accessibilityViewCommand);
            }
        }
    }

    public interface PageTransformer {
        void a(View view, float f);
    }

    public class PagerSnapHelperImpl extends PagerSnapHelper {
        public PagerSnapHelperImpl() {
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public final View f(RecyclerView.LayoutManager layoutManager) {
            ScrollEventAdapter scrollEventAdapter = ViewPager2.this.q.f3832a;
            return super.f(layoutManager);
        }
    }

    public class RecyclerViewImpl extends RecyclerView {
        public RecyclerViewImpl(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.w.getClass();
            return super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            ViewPager2 viewPager2 = ViewPager2.this;
            accessibilityEvent.setFromIndex(viewPager2.g);
            accessibilityEvent.setToIndex(viewPager2.g);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.u && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.u && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ScrollState {
    }

    public static class SmoothScrollToPosition implements Runnable {
        public final int d;
        public final RecyclerView e;

        public SmoothScrollToPosition(int i, RecyclerView recyclerView) {
            this.d = i;
            this.e = recyclerView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.e.s0(this.d);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new CompositeOnPageChangeCallback();
        this.h = false;
        this.i = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void a() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.h = true;
                viewPager2.o.l = true;
            }
        };
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        a(context, null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        this.w = new PageAwareAccessibilityProvider();
        RecyclerViewImpl recyclerViewImpl = new RecyclerViewImpl(context);
        this.m = recyclerViewImpl;
        recyclerViewImpl.setId(View.generateViewId());
        this.m.setDescendantFocusability(131072);
        LinearLayoutManagerImpl linearLayoutManagerImpl = new LinearLayoutManagerImpl(context);
        this.j = linearLayoutManagerImpl;
        this.m.setLayoutManager(linearLayoutManagerImpl);
        this.m.setScrollingTouchSlop(1);
        int[] iArr = androidx.viewpager2.R.styleable.f3822a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        ViewCompat.z(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
            this.m.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.m.j(new AnonymousClass4());
            ScrollEventAdapter scrollEventAdapter = new ScrollEventAdapter(this);
            this.o = scrollEventAdapter;
            this.q = new FakeDrag(scrollEventAdapter);
            PagerSnapHelperImpl pagerSnapHelperImpl = new PagerSnapHelperImpl();
            this.n = pagerSnapHelperImpl;
            pagerSnapHelperImpl.b(this.m);
            this.m.k(this.o);
            CompositeOnPageChangeCallback compositeOnPageChangeCallback = new CompositeOnPageChangeCallback();
            this.p = compositeOnPageChangeCallback;
            this.o.f3834a = compositeOnPageChangeCallback;
            OnPageChangeCallback onPageChangeCallback = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.2
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void a(int i) {
                    if (i == 0) {
                        ViewPager2.this.h();
                    }
                }

                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void c(int i) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    if (viewPager2.g != i) {
                        viewPager2.g = i;
                        viewPager2.w.a();
                    }
                }
            };
            OnPageChangeCallback onPageChangeCallback2 = new OnPageChangeCallback() { // from class: androidx.viewpager2.widget.ViewPager2.3
                @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
                public final void c(int i) {
                    ViewPager2 viewPager2 = ViewPager2.this;
                    viewPager2.clearFocus();
                    if (viewPager2.hasFocus()) {
                        viewPager2.m.requestFocus(2);
                    }
                }
            };
            compositeOnPageChangeCallback.f3831a.add(onPageChangeCallback);
            this.p.f3831a.add(onPageChangeCallback2);
            final PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.w;
            RecyclerView recyclerView = this.m;
            pageAwareAccessibilityProvider.getClass();
            recyclerView.setImportantForAccessibility(2);
            pageAwareAccessibilityProvider.c = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.PageAwareAccessibilityProvider.3
                @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public final void a() {
                    PageAwareAccessibilityProvider.this.a();
                }
            };
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.getImportantForAccessibility() == 0) {
                viewPager2.setImportantForAccessibility(1);
            }
            CompositeOnPageChangeCallback compositeOnPageChangeCallback2 = this.p;
            compositeOnPageChangeCallback2.f3831a.add(this.f);
            PageTransformerAdapter pageTransformerAdapter = new PageTransformerAdapter(this.j);
            this.r = pageTransformerAdapter;
            this.p.f3831a.add(pageTransformerAdapter);
            RecyclerView recyclerView2 = this.m;
            attachViewToParent(recyclerView2, 0, recyclerView2.getLayoutParams());
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean b() {
        return this.j.b.getLayoutDirection() == 1;
    }

    public final void c(OnPageChangeCallback onPageChangeCallback) {
        this.f.f3831a.add(onPageChangeCallback);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.m.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.m.canScrollVertically(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d() {
        RecyclerView.Adapter adapter;
        if (this.k == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.l;
        if (parcelable != null) {
            if (adapter instanceof StatefulAdapter) {
                ((StatefulAdapter) adapter).d(parcelable);
            }
            this.l = null;
        }
        int iMax = Math.max(0, Math.min(this.k, adapter.i() - 1));
        this.g = iMax;
        this.k = -1;
        this.m.o0(iMax);
        this.w.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).d;
            sparseArray.put(this.m.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        d();
    }

    public final void e(int i, boolean z) {
        ScrollEventAdapter scrollEventAdapter = this.q.f3832a;
        f(i, z);
    }

    public final void f(int i, boolean z) {
        OnPageChangeCallback onPageChangeCallback;
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter == null) {
            if (this.k != -1) {
                this.k = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.i() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i, 0), adapter.i() - 1);
        int i2 = this.g;
        if (iMin == i2 && this.o.f == 0) {
            return;
        }
        if (iMin == i2 && z) {
            return;
        }
        double d = i2;
        this.g = iMin;
        this.w.a();
        ScrollEventAdapter scrollEventAdapter = this.o;
        if (scrollEventAdapter.f != 0) {
            scrollEventAdapter.g();
            ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.g;
            d = scrollEventValues.f3835a + scrollEventValues.b;
        }
        ScrollEventAdapter scrollEventAdapter2 = this.o;
        scrollEventAdapter2.getClass();
        scrollEventAdapter2.e = z ? 2 : 3;
        boolean z2 = scrollEventAdapter2.i != iMin;
        scrollEventAdapter2.i = iMin;
        scrollEventAdapter2.e(2);
        if (z2 && (onPageChangeCallback = scrollEventAdapter2.f3834a) != null) {
            onPageChangeCallback.c(iMin);
        }
        if (!z) {
            this.m.o0(iMin);
            return;
        }
        double d2 = iMin;
        if (Math.abs(d2 - d) <= 3.0d) {
            this.m.s0(iMin);
            return;
        }
        this.m.o0(d2 > d ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.m;
        recyclerView.post(new SmoothScrollToPosition(iMin, recyclerView));
    }

    public final void g(OnPageChangeCallback onPageChangeCallback) {
        this.f.f3831a.remove(onPageChangeCallback);
    }

    @Override // android.view.ViewGroup, android.view.View
    @RequiresApi
    public CharSequence getAccessibilityClassName() {
        this.w.getClass();
        this.w.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        return this.m.getAdapter();
    }

    public int getCurrentItem() {
        return this.g;
    }

    public int getItemDecorationCount() {
        return this.m.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.v;
    }

    public int getOrientation() {
        return this.j.p == 1 ? 1 : 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.m;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.o.f;
    }

    public final void h() {
        PagerSnapHelper pagerSnapHelper = this.n;
        if (pagerSnapHelper == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewF = pagerSnapHelper.f(this.j);
        if (viewF == null) {
            return;
        }
        this.j.getClass();
        int iO = RecyclerView.LayoutManager.O(viewF);
        if (iO != this.g && getScrollState() == 0) {
            this.p.c(iO);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int i3;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.w;
        pageAwareAccessibilityProvider.getClass();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
        ViewPager2 viewPager2 = ViewPager2.this;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().i();
            i2 = 1;
        } else {
            i2 = viewPager2.getAdapter().i();
            i = 1;
        }
        accessibilityNodeInfoCompat.n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(i, i2, 0));
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (i3 = adapter.i()) == 0 || !viewPager2.u) {
            return;
        }
        if (viewPager2.g > 0) {
            accessibilityNodeInfoCompat.a(8192);
        }
        if (viewPager2.g < i3 - 1) {
            accessibilityNodeInfoCompat.a(4096);
        }
        accessibilityNodeInfoCompat.q(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int paddingLeft = getPaddingLeft();
        Rect rect = this.d;
        rect.left = paddingLeft;
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.e;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.m.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.h) {
            h();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.m, i, i2);
        int measuredWidth = this.m.getMeasuredWidth();
        int measuredHeight = this.m.getMeasuredHeight();
        int measuredState = this.m.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.k = savedState.e;
        this.l = savedState.f;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.d = this.m.getId();
        int i = this.k;
        if (i == -1) {
            i = this.g;
        }
        savedState.e = i;
        Parcelable parcelable = this.l;
        if (parcelable != null) {
            savedState.f = parcelable;
            return savedState;
        }
        Object adapter = this.m.getAdapter();
        if (adapter instanceof StatefulAdapter) {
            savedState.f = ((StatefulAdapter) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        this.w.getClass();
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.w;
        ViewPager2 viewPager2 = ViewPager2.this;
        if (i != 8192 && i != 4096) {
            throw new IllegalStateException();
        }
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        ViewPager2 viewPager22 = ViewPager2.this;
        if (viewPager22.u) {
            viewPager22.f(currentItem, true);
        }
        return true;
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.m.getAdapter();
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider = this.w;
        if (adapter2 != null) {
            adapter2.F(pageAwareAccessibilityProvider.c);
        } else {
            pageAwareAccessibilityProvider.getClass();
        }
        RecyclerView.AdapterDataObserver adapterDataObserver = this.i;
        if (adapter2 != null) {
            adapter2.F(adapterDataObserver);
        }
        this.m.setAdapter(adapter);
        this.g = 0;
        d();
        PageAwareAccessibilityProvider pageAwareAccessibilityProvider2 = this.w;
        pageAwareAccessibilityProvider2.a();
        if (adapter != null) {
            adapter.D(pageAwareAccessibilityProvider2.c);
        }
        if (adapter != null) {
            adapter.D(adapterDataObserver);
        }
    }

    public void setCurrentItem(int i) {
        e(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.w.a();
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.v = i;
        this.m.requestLayout();
    }

    public void setOrientation(int i) {
        this.j.t1(i);
        this.w.a();
    }

    public void setPageTransformer(@Nullable PageTransformer pageTransformer) {
        if (pageTransformer != null) {
            if (!this.t) {
                this.s = this.m.getItemAnimator();
                this.t = true;
            }
            this.m.setItemAnimator(null);
        } else if (this.t) {
            this.m.setItemAnimator(this.s);
            this.s = null;
            this.t = false;
        }
        PageTransformerAdapter pageTransformerAdapter = this.r;
        if (pageTransformer == pageTransformerAdapter.b) {
            return;
        }
        pageTransformerAdapter.b = pageTransformer;
        if (pageTransformer == null) {
            return;
        }
        ScrollEventAdapter scrollEventAdapter = this.o;
        scrollEventAdapter.g();
        ScrollEventAdapter.ScrollEventValues scrollEventValues = scrollEventAdapter.g;
        double d = scrollEventValues.f3835a + scrollEventValues.b;
        int i = (int) d;
        float f = (float) (d - i);
        this.r.b(f, i, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.u = z;
        this.w.a();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;
        public int e;
        public Parcelable f;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeParcelable(this.f, i);
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel, null);
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                savedState.f = parcel.readParcelable(null);
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState(parcel, classLoader);
                savedState.d = parcel.readInt();
                savedState.e = parcel.readInt();
                savedState.f = parcel.readParcelable(classLoader);
                return savedState;
            }
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new CompositeOnPageChangeCallback();
        this.h = false;
        this.i = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void a() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.h = true;
                viewPager2.o.l = true;
            }
        };
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        a(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new Rect();
        this.e = new Rect();
        this.f = new CompositeOnPageChangeCallback();
        this.h = false;
        this.i = new DataSetChangeObserver() { // from class: androidx.viewpager2.widget.ViewPager2.1
            @Override // androidx.viewpager2.widget.ViewPager2.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void a() {
                ViewPager2 viewPager2 = ViewPager2.this;
                viewPager2.h = true;
                viewPager2.o.l = true;
            }
        };
        this.k = -1;
        this.s = null;
        this.t = false;
        this.u = true;
        this.v = -1;
        a(context, attributeSet);
    }
}
