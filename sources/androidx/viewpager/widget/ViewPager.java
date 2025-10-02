package androidx.viewpager.widget;

import YU.a;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class ViewPager extends ViewGroup {
    public static final int[] d0 = {R.attr.layout_gravity};
    public static final Comparator e0 = new AnonymousClass1();
    public static final Interpolator f0 = new AnonymousClass2();
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public float F;
    public float G;
    public float H;
    public float I;
    public int J;
    public VelocityTracker K;
    public int L;
    public int M;
    public int N;
    public int O;
    public EdgeEffect P;
    public EdgeEffect Q;
    public boolean R;
    public boolean S;
    public int T;
    public ArrayList U;
    public OnPageChangeListener V;
    public OnPageChangeListener W;
    public ArrayList a0;
    public final Runnable b0;
    public int c0;
    public int d;
    public final ArrayList e;
    public final ItemInfo f;
    public final Rect g;
    public PagerAdapter h;
    public int i;
    public int j;
    public Parcelable k;
    public ClassLoader l;
    public Scroller m;
    public boolean n;
    public PagerObserver o;
    public int p;
    public Drawable q;
    public int r;
    public int s;
    public float t;
    public float u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public int z;

    /* renamed from: androidx.viewpager.widget.ViewPager$1, reason: invalid class name */
    public static class AnonymousClass1 implements Comparator<ItemInfo> {
        @Override // java.util.Comparator
        public final int compare(ItemInfo itemInfo, ItemInfo itemInfo2) {
            return itemInfo.b - itemInfo2.b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$2, reason: invalid class name */
    public static class AnonymousClass2 implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() throws Resources.NotFoundException {
            ViewPager viewPager = ViewPager.this;
            viewPager.setScrollState(0);
            viewPager.r();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    public static class ItemInfo {

        /* renamed from: a, reason: collision with root package name */
        public Object f3819a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3820a;
        public final int b;
        public float c;
        public boolean d;
        public int e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.c = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.d0);
            this.b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public class MyAccessibilityDelegate extends AccessibilityDelegateCompat {
        public MyAccessibilityDelegate() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
        @Override // androidx.core.view.AccessibilityDelegateCompat
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
            /*
                r2 = this;
                super.c(r3, r4)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r3 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r3 = r3.getName()
                r4.setClassName(r3)
                androidx.viewpager.widget.ViewPager r3 = androidx.viewpager.widget.ViewPager.this
                androidx.viewpager.widget.PagerAdapter r0 = r3.h
                if (r0 == 0) goto L1a
                int r0 = r0.g()
                r1 = 1
                if (r0 <= r1) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                r4.setScrollable(r1)
                int r0 = r4.getEventType()
                r1 = 4096(0x1000, float:5.74E-42)
                if (r0 != r1) goto L3b
                androidx.viewpager.widget.PagerAdapter r0 = r3.h
                if (r0 == 0) goto L3b
                int r0 = r0.g()
                r4.setItemCount(r0)
                int r0 = r3.i
                r4.setFromIndex(r0)
                int r3 = r3.i
                r4.setToIndex(r3)
            L3b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.MyAccessibilityDelegate.c(android.view.View, android.view.accessibility.AccessibilityEvent):void");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
            accessibilityNodeInfoCompat.l(ViewPager.class.getName());
            ViewPager viewPager = ViewPager.this;
            PagerAdapter pagerAdapter = viewPager.h;
            accessibilityNodeInfoCompat.q(pagerAdapter != null && pagerAdapter.g() > 1);
            if (viewPager.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.a(4096);
            }
            if (viewPager.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.a(8192);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean g(View view, int i, Bundle bundle) throws Resources.NotFoundException {
            if (super.g(view, i, bundle)) {
                return true;
            }
            ViewPager viewPager = ViewPager.this;
            if (i == 4096) {
                if (!viewPager.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager.setCurrentItem(viewPager.i + 1);
                return true;
            }
            if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.i - 1);
            return true;
        }
    }

    public interface OnAdapterChangeListener {
        void d(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);
    }

    public interface OnPageChangeListener {
        void a(int i);

        void b(int i);

        void c(float f, int i, int i2);
    }

    public interface PageTransformer {
    }

    public class PagerObserver extends DataSetObserver {
        public PagerObserver() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() throws Resources.NotFoundException {
            ViewPager.this.f();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() throws Resources.NotFoundException {
            ViewPager.this.f();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int f;
        public Parcelable g;
        public final ClassLoader h;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$1, reason: invalid class name */
        public static class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f = parcel.readInt();
            this.g = parcel.readParcelable(classLoader);
            this.h = classLoader;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            return a.m(sb, this.f, "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeParcelable(this.g, i);
        }
    }

    public static class SimpleOnPageChangeListener implements OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void a(int i) {
            Callback.r();
            try {
            } finally {
                Callback.s();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void c(float f, int i, int i2) {
        }
    }

    public static class ViewPositionComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.f3820a;
            return z != layoutParams2.f3820a ? z ? 1 : -1 : layoutParams.e - layoutParams2.e;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.e = new ArrayList();
        this.f = new ItemInfo();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.R = true;
        this.b0 = new AnonymousClass3();
        this.c0 = 0;
        l();
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (!(view instanceof ViewGroup)) {
            return z ? false : false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int scrollX = view.getScrollX();
        int scrollY = view.getScrollY();
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            int i5 = i2 + scrollX;
            if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                break;
            }
        }
        if (z || !view.canScrollHorizontally(-i)) {
        }
        return true;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.x != z) {
            this.x = z;
        }
    }

    public final ItemInfo a(int i, int i2) {
        ItemInfo itemInfo = new ItemInfo();
        itemInfo.b = i;
        itemInfo.f3819a = this.h.h(this, i);
        this.h.getClass();
        itemInfo.d = 1.0f;
        ArrayList arrayList = this.e;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(itemInfo);
            return itemInfo;
        }
        arrayList.add(i2, itemInfo);
        return itemInfo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ItemInfo itemInfoI;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (itemInfoI = i(childAt)) != null && itemInfoI.b == this.i) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        ItemInfo itemInfoI;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (itemInfoI = i(childAt)) != null && itemInfoI.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean z = layoutParams2.f3820a | (view.getClass().getAnnotation(DecorView.class) != null);
        layoutParams2.f3820a = z;
        if (!this.w) {
            super.addView(view, i, layoutParams);
        } else {
            if (z) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            layoutParams2.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void b(OnPageChangeListener onPageChangeListener) {
        if (this.U == null) {
            this.U = new ArrayList();
        }
        this.U.add(onPageChangeListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(int r8) throws android.content.res.Resources.NotFoundException {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto Lb3
            if (r1 == r0) goto Lb3
            android.graphics.Rect r6 = r7.g
            if (r8 != r5) goto L97
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L91
            if (r4 < r5) goto L91
            int r0 = r7.i
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.y = r3
            r7.w(r0, r3, r2, r3)
            goto Lce
        L91:
            boolean r0 = r1.requestFocus()
        L95:
            r3 = r0
            goto Lcf
        L97:
            if (r8 != r4) goto Lcf
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lae
            if (r2 > r3) goto Lae
            boolean r0 = r7.o()
            goto L95
        Lae:
            boolean r0 = r1.requestFocus()
            goto L95
        Lb3:
            if (r8 == r5) goto Lc2
            if (r8 != r2) goto Lb8
            goto Lc2
        Lb8:
            if (r8 == r4) goto Lbd
            r0 = 2
            if (r8 != r0) goto Lcf
        Lbd:
            boolean r3 = r7.o()
            goto Lcf
        Lc2:
            int r0 = r7.i
            if (r0 <= 0) goto Lcd
            int r0 = r0 - r2
            r7.y = r3
            r7.w(r0, r3, r2, r3)
            goto Lce
        Lcd:
            r2 = r3
        Lce:
            r3 = r2
        Lcf:
            if (r3 == 0) goto Ld8
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld8:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.t)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.u));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() throws Resources.NotFoundException {
        this.n = true;
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!p(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) throws android.content.res.Resources.NotFoundException {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.c(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r6 = r5.c(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.o()
            goto L62
        L41:
            r6 = 66
            boolean r6 = r5.c(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.i
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.y = r2
            r5.w(r6, r2, r1, r2)
            r6 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r6 = r5.c(r6)
            goto L62
        L61:
            r6 = r2
        L62:
            if (r6 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        ItemInfo itemInfoI;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (itemInfoI = i(childAt)) != null && itemInfoI.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.h) != null && pagerAdapter.g() > 1)) {
            if (!this.P.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.t * width);
                this.P.setSize(height, width);
                zDraw = this.P.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.Q.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.u + 1.0f)) * width2);
                this.Q.setSize(height2, width2);
                zDraw |= this.Q.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.P.finish();
            this.Q.finish();
        }
        if (zDraw) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.q;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) throws Resources.NotFoundException {
        boolean z2 = this.c0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.m.isFinished()) {
                this.m.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.m.getCurrX();
                int currY = this.m.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        p(currX);
                    }
                }
            }
        }
        this.y = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                break;
            }
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i);
            if (itemInfo.c) {
                itemInfo.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.b0;
            if (!z) {
                ((AnonymousClass3) runnable).run();
            } else {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                postOnAnimation(runnable);
            }
        }
    }

    public final void f() throws Resources.NotFoundException {
        int iG = this.h.g();
        this.d = iG;
        ArrayList arrayList = this.e;
        boolean z = arrayList.size() < (this.z * 2) + 1 && arrayList.size() < iG;
        int i = this.i;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i2);
            PagerAdapter pagerAdapter = this.h;
            Object obj = itemInfo.f3819a;
            pagerAdapter.getClass();
        }
        Collections.sort(arrayList, e0);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                if (!layoutParams.f3820a) {
                    layoutParams.c = BitmapDescriptorFactory.HUE_RED;
                }
            }
            w(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        OnPageChangeListener onPageChangeListener = this.V;
        if (onPageChangeListener != null) {
            onPageChangeListener.a(i);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.U.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.a(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.W;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.a(i);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.c = BitmapDescriptorFactory.HUE_RED;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.h;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.p;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final ItemInfo i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                return null;
            }
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i);
            if (this.h.i(view, itemInfo.f3819a)) {
                return itemInfo;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.viewpager.widget.ViewPager.ItemInfo j() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.p
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList r10 = r13.e
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            androidx.viewpager.widget.ViewPager$ItemInfo r11 = (androidx.viewpager.widget.ViewPager.ItemInfo) r11
            if (r9 != 0) goto L4c
            int r12 = r11.b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r13.f
            r4.e = r1
            r4.b = r6
            androidx.viewpager.widget.PagerAdapter r1 = r13.h
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.e
            float r4 = r6.d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L59
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L72
        L59:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L71
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L65
            goto L71
        L65:
            int r4 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r0
            goto L22
        L71:
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.j():androidx.viewpager.widget.ViewPager$ItemInfo");
    }

    public final ItemInfo k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                return null;
            }
            ItemInfo itemInfo = (ItemInfo) arrayList.get(i2);
            if (itemInfo.b == i) {
                return itemInfo;
            }
            i2++;
        }
    }

    public final void l() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, f0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.P = new EdgeEffect(context);
        this.Q = new EdgeEffect(context);
        this.N = (int) (25.0f * f);
        this.O = (int) (2.0f * f);
        this.C = (int) (f * 16.0f);
        ViewCompat.A(this, new MyAccessibilityDelegate());
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        ViewCompat.I(this, new OnApplyWindowInsetsListener() { // from class: androidx.viewpager.widget.ViewPager.4
            public final Rect d = new Rect();

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat windowInsetsCompatU = ViewCompat.u(view, windowInsetsCompat);
                if (windowInsetsCompatU.p()) {
                    return windowInsetsCompatU;
                }
                int i = windowInsetsCompatU.i();
                Rect rect = this.d;
                rect.left = i;
                rect.top = windowInsetsCompatU.k();
                rect.right = windowInsetsCompatU.j();
                rect.bottom = windowInsetsCompatU.h();
                ViewPager viewPager = ViewPager.this;
                int childCount = viewPager.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    WindowInsetsCompat windowInsetsCompatD = ViewCompat.d(viewPager.getChildAt(i2), windowInsetsCompatU);
                    rect.left = Math.min(windowInsetsCompatD.i(), rect.left);
                    rect.top = Math.min(windowInsetsCompatD.k(), rect.top);
                    rect.right = Math.min(windowInsetsCompatD.j(), rect.right);
                    rect.bottom = Math.min(windowInsetsCompatD.h(), rect.bottom);
                }
                int i3 = rect.left;
                int i4 = rect.top;
                int i5 = rect.right;
                int i6 = rect.bottom;
                WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder(windowInsetsCompatU);
                builder.b(Insets.c(i3, i4, i5, i6));
                return builder.a();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(float r13, int r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.T
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6c
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6c
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.f3820a
            if (r10 != 0) goto L2c
            goto L69
        L2c:
            int r9 = r9.b
            r9 = r9 & 7
            if (r9 == r2) goto L50
            r10 = 3
            if (r9 == r10) goto L4a
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5d
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
        L46:
            r11 = r9
            r9 = r3
            r3 = r11
            goto L5d
        L4a:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5d
        L50:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
            goto L46
        L5d:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L68
            r8.offsetLeftAndRight(r3)
        L68:
            r3 = r9
        L69:
            int r7 = r7 + 1
            goto L1b
        L6c:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.V
            if (r0 == 0) goto L73
            r0.c(r13, r14, r15)
        L73:
            java.util.ArrayList r0 = r12.U
            if (r0 == 0) goto L8d
            int r0 = r0.size()
        L7b:
            if (r1 >= r0) goto L8d
            java.util.ArrayList r3 = r12.U
            java.lang.Object r3 = r3.get(r1)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r3 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r3
            if (r3 == 0) goto L8a
            r3.c(r13, r14, r15)
        L8a:
            int r1 = r1 + 1
            goto L7b
        L8d:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r12.W
            if (r0 == 0) goto L94
            r0.c(r13, r14, r15)
        L94:
            r12.S = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.m(float, int, int):void");
    }

    public final void n(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(i);
            this.J = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean o() throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.h;
        if (pagerAdapter == null || this.i >= pagerAdapter.g() - 1) {
            return false;
        }
        int i = this.i + 1;
        this.y = false;
        w(i, 0, true, false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.b0);
        Scroller scroller = this.m;
        if (scroller != null && !scroller.isFinished()) {
            this.m.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.p <= 0 || this.q == null) {
            return;
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2.size() <= 0 || this.h == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.p / width;
        int i3 = 0;
        ItemInfo itemInfo = (ItemInfo) arrayList2.get(0);
        float f3 = itemInfo.e;
        int size = arrayList2.size();
        int i4 = itemInfo.b;
        int i5 = ((ItemInfo) arrayList2.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i = itemInfo.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                itemInfo = (ItemInfo) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = itemInfo.e;
                float f5 = itemInfo.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.h.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.p + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.q.setBounds(Math.round(f), this.r, Math.round(this.p + f), this.s);
                this.q.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) throws Resources.NotFoundException {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            u();
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.H = x;
            this.F = x;
            float y = motionEvent.getY();
            this.I = y;
            this.G = y;
            this.J = motionEvent.getPointerId(0);
            this.B = false;
            this.n = true;
            this.m.computeScrollOffset();
            if (this.c0 != 2 || Math.abs(this.m.getFinalX() - this.m.getCurrX()) <= this.O) {
                e(false);
                this.A = false;
            } else {
                this.m.abortAnimation();
                this.y = false;
                r();
                this.A = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.J;
            if (i != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f = x2 - this.F;
                float fAbs = Math.abs(f);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.I);
                if (f != BitmapDescriptorFactory.HUE_RED) {
                    float f2 = this.F;
                    if ((f2 >= this.D || f <= BitmapDescriptorFactory.HUE_RED) && ((f2 <= getWidth() - this.D || f >= BitmapDescriptorFactory.HUE_RED) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.F = x2;
                        this.G = y2;
                        this.B = true;
                        return false;
                    }
                }
                float f3 = this.E;
                if (fAbs > f3 && fAbs * 0.5f > fAbs2) {
                    this.A = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.H;
                    float f5 = this.E;
                    this.F = f > BitmapDescriptorFactory.HUE_RED ? f4 + f5 : f4 - f5;
                    this.G = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > f3) {
                    this.B = true;
                }
                if (this.A && q(x2)) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            n(motionEvent);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.f3820a) {
                int i6 = layoutParams2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.w = true;
        r();
        this.w = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.f3820a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.c), 1073741824), this.v);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        ItemInfo itemInfoI;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (itemInfoI = i(childAt)) != null && itemInfoI.b == this.i && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) throws Resources.NotFoundException {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        ClassLoader classLoader = savedState.h;
        super.onRestoreInstanceState(savedState.d);
        PagerAdapter pagerAdapter = this.h;
        if (pagerAdapter != null) {
            pagerAdapter.j(savedState.g, classLoader);
            w(savedState.f, 0, false, true);
        } else {
            this.j = savedState.f;
            this.k = savedState.g;
            this.l = classLoader;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = this.i;
        PagerAdapter pagerAdapter = this.h;
        if (pagerAdapter != null) {
            savedState.g = pagerAdapter.k();
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.p;
            t(i, i3, i5, i5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i) {
        if (this.e.size() == 0) {
            if (!this.R) {
                this.S = false;
                m(BitmapDescriptorFactory.HUE_RED, 0, 0);
                if (!this.S) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        ItemInfo itemInfoJ = j();
        int clientWidth = getClientWidth();
        int i2 = this.p;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = itemInfoJ.b;
        float f2 = ((i / f) - itemInfoJ.e) / (itemInfoJ.d + (i2 / f));
        this.S = false;
        m(f2, i4, (int) (i3 * f2));
        if (this.S) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean q(float f) {
        boolean z;
        boolean z2;
        float f2 = this.F - f;
        this.F = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.t * clientWidth;
        float f4 = this.u * clientWidth;
        ArrayList arrayList = this.e;
        boolean z3 = false;
        ItemInfo itemInfo = (ItemInfo) arrayList.get(0);
        ItemInfo itemInfo2 = (ItemInfo) a.c(1, arrayList);
        if (itemInfo.b != 0) {
            f3 = itemInfo.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (itemInfo2.b != this.h.g() - 1) {
            f4 = itemInfo2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.P.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.Q.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.F = (scrollX - i) + this.F;
        scrollTo(i, getScrollY());
        p(i);
        return z3;
    }

    public final void r() throws Resources.NotFoundException {
        s(this.i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0061, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3 A[PHI: r7 r11 r15
  0x00c3: PHI (r7v16 int) = (r7v15 int), (r7v5 int), (r7v19 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r11v32 int) = (r11v1 int), (r11v31 int), (r11v35 int) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]
  0x00c3: PHI (r15v6 float) = (r15v4 float), (r15v5 float), (r15v3 float) binds: [B:62:0x00e7, B:59:0x00d3, B:50:0x00ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145 A[PHI: r3 r12
  0x0145: PHI (r3v20 float) = (r3v18 float), (r3v19 float), (r3v17 float) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]
  0x0145: PHI (r12v25 int) = (r12v23 int), (r12v24 int), (r12v22 int) binds: [B:96:0x016c, B:93:0x0156, B:86:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r18) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.s(int):void");
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) throws Resources.NotFoundException {
        ArrayList arrayList = this.e;
        PagerAdapter pagerAdapter2 = this.h;
        if (pagerAdapter2 != null) {
            synchronized (pagerAdapter2) {
                pagerAdapter2.e = null;
            }
            this.h.m(this);
            for (int i = 0; i < arrayList.size(); i++) {
                ItemInfo itemInfo = (ItemInfo) arrayList.get(i);
                PagerAdapter pagerAdapter3 = this.h;
                int i2 = itemInfo.b;
                pagerAdapter3.e(this, itemInfo.f3819a);
            }
            this.h.f();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((LayoutParams) getChildAt(i3).getLayoutParams()).f3820a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.i = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter4 = this.h;
        this.h = pagerAdapter;
        this.d = 0;
        if (pagerAdapter != null) {
            if (this.o == null) {
                this.o = new PagerObserver();
            }
            PagerAdapter pagerAdapter5 = this.h;
            PagerObserver pagerObserver = this.o;
            synchronized (pagerAdapter5) {
                pagerAdapter5.e = pagerObserver;
            }
            this.y = false;
            boolean z = this.R;
            this.R = true;
            this.d = this.h.g();
            if (this.j >= 0) {
                this.h.j(this.k, this.l);
                w(this.j, 0, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (z) {
                requestLayout();
            } else {
                r();
            }
        }
        ArrayList arrayList2 = this.a0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.a0.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((OnAdapterChangeListener) this.a0.get(i4)).d(this, pagerAdapter4, pagerAdapter);
        }
    }

    public void setCurrentItem(int i) throws Resources.NotFoundException {
        this.y = false;
        w(i, 0, !this.R, false);
    }

    public void setOffscreenPageLimit(int i) throws Resources.NotFoundException {
        if (i < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            i = 1;
        }
        if (i != this.z) {
            this.z = i;
            r();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.V = onPageChangeListener;
    }

    public void setPageMargin(int i) throws Resources.NotFoundException {
        int i2 = this.p;
        this.p = i;
        int width = getWidth();
        t(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.q = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.c0 == i) {
            return;
        }
        this.c0 = i;
        OnPageChangeListener onPageChangeListener = this.V;
        if (onPageChangeListener != null) {
            onPageChangeListener.b(i);
        }
        ArrayList arrayList = this.U;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                OnPageChangeListener onPageChangeListener2 = (OnPageChangeListener) this.U.get(i2);
                if (onPageChangeListener2 != null) {
                    onPageChangeListener2.b(i);
                }
            }
        }
        OnPageChangeListener onPageChangeListener3 = this.W;
        if (onPageChangeListener3 != null) {
            onPageChangeListener3.b(i);
        }
    }

    public final void t(int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        if (i2 > 0 && !this.e.isEmpty()) {
            if (!this.m.isFinished()) {
                this.m.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
                return;
            }
        }
        ItemInfo itemInfoK = k(this.i);
        int iMin = (int) ((itemInfoK != null ? Math.min(itemInfoK.e, this.u) : BitmapDescriptorFactory.HUE_RED) * ((i - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            e(false);
            scrollTo(iMin, getScrollY());
        }
    }

    public final boolean u() {
        this.J = -1;
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
        this.P.onRelease();
        this.Q.onRelease();
        return this.P.isFinished() || this.Q.isFinished();
    }

    public final void v(int i, int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        int scrollX;
        int iAbs;
        ItemInfo itemInfoK = k(i);
        int iMax = itemInfoK != null ? (int) (Math.max(this.t, Math.min(itemInfoK.e, this.u)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                g(i);
            }
            e(false);
            scrollTo(iMax, 0);
            p(iMax);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.m;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.n ? this.m.getCurrX() : this.m.getStartX();
                this.m.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = iMax - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                r();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float fSin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int iAbs2 = Math.abs(i2);
                if (iAbs2 > 0) {
                    iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                } else {
                    this.h.getClass();
                    iAbs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.p)) + 1.0f) * 100.0f);
                }
                int iMin = Math.min(iAbs, 600);
                this.n = false;
                this.m.startScroll(i3, scrollY, i4, i5, iMin);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.q;
    }

    public final void w(int i, int i2, boolean z, boolean z2) throws Resources.NotFoundException {
        PagerAdapter pagerAdapter = this.h;
        if (pagerAdapter == null || pagerAdapter.g() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.e;
        if (!z2 && this.i == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.h.g()) {
            i = this.h.g() - 1;
        }
        int i3 = this.z;
        int i4 = this.i;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((ItemInfo) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.i != i;
        if (!this.R) {
            s(i);
            v(i, i2, z, z3);
        } else {
            this.i = i;
            if (z3) {
                g(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@DrawableRes int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new ArrayList();
        this.f = new ItemInfo();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.t = -3.4028235E38f;
        this.u = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.R = true;
        this.b0 = new AnonymousClass3();
        this.c0 = 0;
        l();
    }
}
