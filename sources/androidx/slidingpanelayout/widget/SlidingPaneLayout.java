package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

/* loaded from: classes2.dex */
public class SlidingPaneLayout extends ViewGroup implements Openable {
    public static final boolean B;
    public FoldingFeatureObserver A;
    public int d;
    public int e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public View i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public int n;
    public float o;
    public float p;
    public final CopyOnWriteArrayList q;
    public PanelSlideListener r;
    public final ViewDragHelper s;
    public boolean t;
    public boolean u;
    public final Rect v;
    public final ArrayList w;
    public int x;
    public FoldingFeature y;
    public final FoldingFeatureObserver.OnFoldingFeatureChangeListener z;

    /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$1, reason: invalid class name */
    public class AnonymousClass1 implements FoldingFeatureObserver.OnFoldingFeatureChangeListener {
        public AnonymousClass1() {
        }
    }

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final Rect d = new Rect();

        public AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
            Rect rect = this.d;
            accessibilityNodeInfoObtain.getBoundsInScreen(rect);
            accessibilityNodeInfoCompat.k(rect);
            accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
            accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
            accessibilityNodeInfoCompat.l(accessibilityNodeInfoObtain.getClassName());
            accessibilityNodeInfoCompat.p(accessibilityNodeInfoObtain.getContentDescription());
            accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
            accessibilityNodeInfoCompat.m(accessibilityNodeInfoObtain.isClickable());
            accessibilityNodeInfo.setFocusable(accessibilityNodeInfoObtain.isFocusable());
            accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
            accessibilityNodeInfoCompat.j(accessibilityNodeInfoObtain.isAccessibilityFocused());
            accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
            accessibilityNodeInfo.setLongClickable(accessibilityNodeInfoObtain.isLongClickable());
            accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
            accessibilityNodeInfo.setMovementGranularities(accessibilityNodeInfoObtain.getMovementGranularities());
            accessibilityNodeInfoCompat.l("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            accessibilityNodeInfoCompat.c = -1;
            accessibilityNodeInfo.setSource(view);
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                accessibilityNodeInfoCompat.b = -1;
                accessibilityNodeInfo.setParent((View) parentForAccessibility);
            }
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = slidingPaneLayout.getChildAt(i);
                if (!slidingPaneLayout.b(childAt) && childAt.getVisibility() == 0) {
                    childAt.setImportantForAccessibility(1);
                    accessibilityNodeInfo.addChild(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.b(view)) {
                return false;
            }
            return this.f2466a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    public class DisableLayerRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class DragHelperCallback extends ViewDragHelper.Callback {
        public DragHelperCallback() {
        }

        public final boolean a() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.m || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (slidingPaneLayout.d() && slidingPaneLayout.getLockMode() == 1) {
                return false;
            }
            return slidingPaneLayout.d() || slidingPaneLayout.getLockMode() != 2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.i.getLayoutParams();
            if (!slidingPaneLayout.c()) {
                int paddingLeft = slidingPaneLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i, paddingLeft), slidingPaneLayout.l + paddingLeft);
            }
            int width = slidingPaneLayout.getWidth() - (slidingPaneLayout.i.getWidth() + (slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i, width), width - slidingPaneLayout.l);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            return SlidingPaneLayout.this.l;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.s.c(i2, slidingPaneLayout.i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i, int i2) {
            if (a()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.s.c(i2, slidingPaneLayout.i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            int childCount = slidingPaneLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = slidingPaneLayout.getChildAt(i2);
                if (childAt.getVisibility() == 4) {
                    childAt.setVisibility(0);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            CopyOnWriteArrayList copyOnWriteArrayList = slidingPaneLayout.q;
            if (slidingPaneLayout.s.f2544a == 0) {
                if (slidingPaneLayout.j != 1.0f) {
                    View view = slidingPaneLayout.i;
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((PanelSlideListener) it.next()).b(view);
                    }
                    slidingPaneLayout.sendAccessibilityEvent(32);
                    slidingPaneLayout.t = true;
                    return;
                }
                slidingPaneLayout.h(slidingPaneLayout.i);
                View view2 = slidingPaneLayout.i;
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((PanelSlideListener) it2.next()).c(view2);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                slidingPaneLayout.t = false;
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.i == null) {
                slidingPaneLayout.j = BitmapDescriptorFactory.HUE_RED;
            } else {
                boolean zC = slidingPaneLayout.c();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.i.getLayoutParams();
                int width = slidingPaneLayout.i.getWidth();
                if (zC) {
                    i = (slidingPaneLayout.getWidth() - i) - width;
                }
                float paddingRight = (i - ((zC ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (zC ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.l;
                slidingPaneLayout.j = paddingRight;
                if (slidingPaneLayout.n != 0) {
                    slidingPaneLayout.f(paddingRight);
                }
                View view2 = slidingPaneLayout.i;
                Iterator it = slidingPaneLayout.q.iterator();
                while (it.hasNext()) {
                    ((PanelSlideListener) it.next()).a(view2);
                }
            }
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.c()) {
                int paddingRight = slidingPaneLayout.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && slidingPaneLayout.j > 0.5f)) {
                    paddingRight += slidingPaneLayout.l;
                }
                paddingLeft = (slidingPaneLayout.getWidth() - paddingRight) - slidingPaneLayout.i.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + slidingPaneLayout.getPaddingLeft();
                if (f > BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && slidingPaneLayout.j > 0.5f)) {
                    paddingLeft += slidingPaneLayout.l;
                }
            }
            slidingPaneLayout.s.t(paddingLeft, view.getTop());
            slidingPaneLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i) {
            if (a()) {
                return ((LayoutParams) view.getLayoutParams()).b;
            }
            return false;
        }
    }

    public interface PanelSlideListener {
        void a(View view);

        void b(View view);

        void c(View view);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean f;
        public int g;

        /* renamed from: androidx.slidingpanelayout.widget.SlidingPaneLayout$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel) {
            super(parcel, null);
            this.f = parcel.readInt() != 0;
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g);
        }
    }

    public static class SimplePanelSlideListener implements PanelSlideListener {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void a(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void b(View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.PanelSlideListener
        public final void c(View view) {
        }
    }

    public static class TouchBlocker extends FrameLayout {
        @Override // android.view.View
        public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        B = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private Insets getSystemGestureInsets() {
        WindowInsetsCompat windowInsetsCompatN;
        if (!B || (windowInsetsCompatN = ViewCompat.n(this)) == null) {
            return null;
        }
        return windowInsetsCompatN.g();
    }

    private void setFoldingFeatureObserver(FoldingFeatureObserver foldingFeatureObserver) {
        this.A = foldingFeatureObserver;
        foldingFeatureObserver.getClass();
        FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = this.z;
        Intrinsics.h(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        foldingFeatureObserver.d = onFoldingFeatureChangeListener;
    }

    public final boolean a() {
        if (!this.h) {
            this.t = false;
        }
        if (!this.u && !g(1.0f)) {
            return false;
        }
        this.t = false;
        return true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() != 1) {
            super.addView(view, i, layoutParams);
            return;
        }
        TouchBlocker touchBlocker = new TouchBlocker(view.getContext());
        touchBlocker.addView(view);
        super.addView(touchBlocker, i, layoutParams);
    }

    public final boolean b(View view) {
        if (view == null) {
            return false;
        }
        return this.h && ((LayoutParams) view.getLayoutParams()).c && this.j > BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean c() {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        ViewDragHelper viewDragHelper = this.s;
        if (viewDragHelper.h()) {
            if (!this.h) {
                viewDragHelper.a();
            } else {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                postInvalidateOnAnimation();
            }
        }
    }

    public final boolean d() {
        return !this.h || this.j == BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int right;
        super.draw(canvas);
        Drawable drawable = c() ? this.g : this.f;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (c()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zC = c() ^ d();
        ViewDragHelper viewDragHelper = this.s;
        if (zC) {
            viewDragHelper.q = 1;
            Insets systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                viewDragHelper.o = Math.max(viewDragHelper.p, systemGestureInsets.f2430a);
            }
        } else {
            viewDragHelper.q = 2;
            Insets systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                viewDragHelper.o = Math.max(viewDragHelper.p, systemGestureInsets2.c);
            }
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.h && !layoutParams.b && this.i != null) {
            Rect rect = this.v;
            canvas.getClipBounds(rect);
            if (c()) {
                rect.left = Math.max(rect.left, this.i.getRight());
            } else {
                rect.right = Math.min(rect.right, this.i.getLeft());
            }
            canvas.clipRect(rect);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    public final void e() {
        if (!this.h) {
            this.t = true;
        }
        if (this.u || g(BitmapDescriptorFactory.HUE_RED)) {
            this.t = true;
        }
    }

    public final void f(float f) {
        boolean zC = c();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != this.i) {
                float f2 = 1.0f - this.k;
                int i2 = this.n;
                this.k = f;
                int i3 = ((int) (f2 * i2)) - ((int) ((1.0f - f) * i2));
                if (zC) {
                    i3 = -i3;
                }
                childAt.offsetLeftAndRight(i3);
            }
        }
    }

    public final boolean g(float f) {
        int paddingLeft;
        if (this.h) {
            boolean zC = c();
            LayoutParams layoutParams = (LayoutParams) this.i.getLayoutParams();
            if (zC) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                paddingLeft = (int) (getWidth() - (((f * this.l) + paddingRight) + this.i.getWidth()));
            } else {
                paddingLeft = (int) ((f * this.l) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
            }
            View view = this.i;
            if (this.s.v(view, paddingLeft, view.getTop())) {
                int childCount = getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    if (childAt.getVisibility() == 4) {
                        childAt.setVisibility(0);
                    }
                }
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                postInvalidateOnAnimation();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f3763a = BitmapDescriptorFactory.HUE_RED;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams2 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams2.f3763a = BitmapDescriptorFactory.HUE_RED;
            return layoutParams2;
        }
        LayoutParams layoutParams3 = new LayoutParams(layoutParams);
        layoutParams3.f3763a = BitmapDescriptorFactory.HUE_RED;
        return layoutParams3;
    }

    @ColorInt
    @Deprecated
    public int getCoveredFadeColor() {
        return this.e;
    }

    public final int getLockMode() {
        return this.x;
    }

    @Px
    public int getParallaxDistance() {
        return this.n;
    }

    @ColorInt
    @Deprecated
    public int getSliderFadeColor() {
        return this.d;
    }

    public final void h(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        boolean z;
        View view2 = view;
        boolean zC = c();
        int width = zC ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zC ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view2.isOpaque()) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount && (childAt = getChildAt(i)) != view2) {
            if (childAt.getVisibility() == 8) {
                z = zC;
            } else {
                z = zC;
                childAt.setVisibility((Math.max(zC ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zC ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i++;
            view2 = view;
            zC = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        Activity activity;
        super.onAttachedToWindow();
        this.u = true;
        if (this.A != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                FoldingFeatureObserver foldingFeatureObserver = this.A;
                foldingFeatureObserver.getClass();
                Job job = foldingFeatureObserver.c;
                if (job != null) {
                    ((JobSupport) job).cancel((CancellationException) null);
                }
                foldingFeatureObserver.c = BuildersKt.c(CoroutineScopeKt.a(ExecutorsKt.a(foldingFeatureObserver.b)), null, null, new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(foldingFeatureObserver, activity, null), 3);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Job job;
        super.onDetachedFromWindow();
        this.u = true;
        FoldingFeatureObserver foldingFeatureObserver = this.A;
        if (foldingFeatureObserver != null && (job = foldingFeatureObserver.c) != null) {
            ((JobSupport) job).cancel((CancellationException) null);
        }
        ArrayList arrayList = this.w;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            ((DisableLayerRunnable) arrayList.get(0)).getClass();
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = this.h;
        ViewDragHelper viewDragHelper = this.s;
        if (!z2 && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            viewDragHelper.getClass();
            this.t = ViewDragHelper.m(childAt, x, y);
        }
        if (!this.h || (this.m && actionMasked != 0)) {
            viewDragHelper.b();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            viewDragHelper.b();
            return false;
        }
        if (actionMasked == 0) {
            this.m = false;
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.o = x2;
            this.p = y2;
            viewDragHelper.getClass();
            if (ViewDragHelper.m(this.i, (int) x2, (int) y2) && b(this.i)) {
                z = true;
            }
            return !viewDragHelper.u(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            float fAbs = Math.abs(x3 - this.o);
            float fAbs2 = Math.abs(y3 - this.p);
            if (fAbs > viewDragHelper.b && fAbs2 > fAbs) {
                viewDragHelper.b();
                this.m = true;
                return false;
            }
        }
        z = false;
        if (viewDragHelper.u(motionEvent)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0089 A[PHI: r17
  0x0089: PHI (r17v3 float) = (r17v1 float), (r17v4 float) binds: [B:19:0x007f, B:21:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        if (savedState.f) {
            e();
        } else {
            a();
        }
        this.t = savedState.f;
        setLockMode(savedState.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = this.h ? d() : this.t;
        savedState.g = this.x;
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.u = true;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.h) {
            return super.onTouchEvent(motionEvent);
        }
        ViewDragHelper viewDragHelper = this.s;
        viewDragHelper.n(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.o = x;
            this.p = y;
            return true;
        }
        if (actionMasked == 1 && b(this.i)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.o;
            float f2 = y2 - this.p;
            int i = viewDragHelper.b;
            if ((f2 * f2) + (f * f) < i * i && ViewDragHelper.m(this.i, (int) x2, (int) y2)) {
                a();
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (view.getParent() instanceof TouchBlocker) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.h) {
            return;
        }
        this.t = view == this.i;
    }

    @Deprecated
    public void setCoveredFadeColor(@ColorInt int i) {
        this.e = i;
    }

    public final void setLockMode(int i) {
        this.x = i;
    }

    @Deprecated
    public void setPanelSlideListener(@Nullable PanelSlideListener panelSlideListener) {
        PanelSlideListener panelSlideListener2 = this.r;
        CopyOnWriteArrayList copyOnWriteArrayList = this.q;
        if (panelSlideListener2 != null) {
            copyOnWriteArrayList.remove(panelSlideListener2);
        }
        if (panelSlideListener != null) {
            copyOnWriteArrayList.add(panelSlideListener);
        }
        this.r = panelSlideListener;
    }

    public void setParallaxDistance(@Px int i) {
        this.n = i;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@Nullable Drawable drawable) {
        this.f = drawable;
    }

    public void setShadowDrawableRight(@Nullable Drawable drawable) {
        this.g = drawable;
    }

    @Deprecated
    public void setShadowResource(@DrawableRes int i) {
        setShadowDrawableLeft(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(getContext().getDrawable(i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(getContext().getDrawable(i));
    }

    @Deprecated
    public void setSliderFadeColor(@ColorInt int i) {
        this.d = i;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int[] d = {R.attr.layout_weight};

        /* renamed from: a, reason: collision with root package name */
        public float f3763a;
        public boolean b;
        public boolean c;

        public LayoutParams(int i) {
            super(i, -1);
            this.f3763a = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3763a = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d);
            this.f3763a = typedArrayObtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        this.j = 1.0f;
        this.q = new CopyOnWriteArrayList();
        this.u = true;
        this.v = new Rect();
        this.w = new ArrayList();
        this.z = new AnonymousClass1();
        float f = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        ViewCompat.A(this, new AccessibilityDelegate());
        setImportantForAccessibility(1);
        ViewDragHelper viewDragHelperI = ViewDragHelper.i(this, 0.5f, new DragHelperCallback());
        this.s = viewDragHelperI;
        viewDragHelperI.n = f * 400.0f;
        setFoldingFeatureObserver(new FoldingFeatureObserver(WindowInfoTracker.a(context), ContextCompat.d(context)));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
