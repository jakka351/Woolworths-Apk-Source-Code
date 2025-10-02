package androidx.coordinatorlayout.widget;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import io.jsonwebtoken.JwtParser;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {
    public static final Pools.SynchronizedPool A;
    public static final String w;
    public static final Class[] x;
    public static final ThreadLocal y;
    public static final Comparator z;
    public final ArrayList d;
    public final DirectedAcyclicGraph e;
    public final ArrayList f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public boolean j;
    public boolean k;
    public final int[] l;
    public View m;
    public View n;
    public OnPreDrawListener o;
    public boolean p;
    public WindowInsetsCompat q;
    public boolean r;
    public Drawable s;
    public ViewGroup.OnHierarchyChangeListener t;
    public OnApplyWindowInsetsListener u;
    public final NestedScrollingParentHelper v;

    public interface AttachedBehavior {
        Behavior getBehavior();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean g(Rect rect, View view) {
            return false;
        }

        public boolean h(View view, View view2) {
            return false;
        }

        public void i(LayoutParams layoutParams) {
        }

        public boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void l() {
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            return false;
        }

        public boolean p(View view) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
            iArr[0] = iArr[0] + i2;
            iArr[1] = iArr[1] + i3;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            return false;
        }

        public void t(View view, Parcelable parcelable) {
        }

        public Parcelable u(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
            return false;
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        }

        public boolean x(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DispatchChangeEvent {
    }

    public class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.u(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.t;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        public OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.u(0);
            return true;
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public SparseArray f;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1, reason: invalid class name */
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
            int i = parcel.readInt();
            int[] iArr = new int[i];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f = new SparseArray(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.f.append(iArr[i2], parcelableArray[i2]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.f;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.f.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.f.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    public static class ViewElevationComparator implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            float fR = ViewCompat.r(view);
            float fR2 = ViewCompat.r(view2);
            if (fR > fR2) {
                return -1;
            }
            return fR < fR2 ? 1 : 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        w = r0 != null ? r0.getName() : null;
        z = new ViewElevationComparator();
        x = new Class[]{Context.class, AttributeSet.class};
        y = new ThreadLocal();
        A = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void A(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.i;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.offsetLeftAndRight(i - i2);
            layoutParams.i = i;
        }
    }

    public static void B(int i, View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i2 = layoutParams.j;
        if (i2 != i) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.offsetTopAndBottom(i - i2);
            layoutParams.j = i;
        }
    }

    public static Rect e() {
        Rect rect = (Rect) A.a();
        return rect == null ? new Rect() : rect;
    }

    public static void q(int i, Rect rect, Rect rect2, LayoutParams layoutParams, int i2, int i3) {
        int i4 = layoutParams.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = layoutParams.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        int iWidth = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            iWidth -= i2 / 2;
        } else if (i6 != 5) {
            iWidth -= i2;
        }
        if (i7 == 16) {
            iHeight -= i3 / 2;
        } else if (i7 != 80) {
            iHeight -= i3;
        }
        rect2.set(iWidth, iHeight, i2 + iWidth, i3 + iHeight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static LayoutParams s(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.b) {
            if (view instanceof AttachedBehavior) {
                Behavior behavior = ((AttachedBehavior) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.b(behavior);
                layoutParams.b = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.b((Behavior) defaultBehavior.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                }
            }
            layoutParams.b = true;
        }
        return layoutParams;
    }

    public final void C() {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (!getFitsSystemWindows()) {
            ViewCompat.I(this, null);
            return;
        }
        if (this.u == null) {
            this.u = new OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                    if (!Objects.equals(coordinatorLayout.q, windowInsetsCompat)) {
                        coordinatorLayout.q = windowInsetsCompat;
                        boolean z2 = windowInsetsCompat.k() > 0;
                        coordinatorLayout.r = z2;
                        coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
                        if (!windowInsetsCompat.p()) {
                            int childCount = coordinatorLayout.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = coordinatorLayout.getChildAt(i);
                                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                                if (childAt.getFitsSystemWindows() && ((LayoutParams) childAt.getLayoutParams()).f2382a != null && windowInsetsCompat.p()) {
                                    break;
                                }
                            }
                        }
                        coordinatorLayout.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            };
        }
        ViewCompat.I(this, this.u);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f2382a;
        if (behavior != null) {
            behavior.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final void f(LayoutParams layoutParams, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i + iMax, i2 + iMax2);
    }

    public final void g(View view) {
        List list = (List) this.e.b.get(view);
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            View view2 = (View) list.get(i);
            Behavior behavior = ((LayoutParams) view2.getLayoutParams()).f2382a;
            if (behavior != null) {
                behavior.j(this, view2, view);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        y();
        return Collections.unmodifiableList(this.d);
    }

    @RestrictTo
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.q;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.v.a();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.s;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        this.v.c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.a(i)) {
                Behavior behavior = layoutParams.f2382a;
                if (behavior != null) {
                    behavior.w(this, childAt, view, i);
                }
                if (i == 0) {
                    layoutParams.m = false;
                } else if (i == 1) {
                    layoutParams.n = false;
                }
                layoutParams.o = false;
            }
        }
        this.n = null;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        this.v.b(i, i2);
        this.n = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        n(view, i, i2, i3, i4, 0, this.i);
    }

    public final void k(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            p(rect, view);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i3) && (behavior = layoutParams.f2382a) != null) {
                    int[] iArr2 = this.h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.q(this, childAt, view, i, i2, iArr2, i3);
                    iMax = i > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i2 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z2) {
            u(1);
        }
    }

    public final ArrayList m(View view) {
        SimpleArrayMap simpleArrayMap = this.e.b;
        int size = simpleArrayMap.getSize();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) simpleArrayMap.valueAt(i);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(simpleArrayMap.keyAt(i));
            }
        }
        ArrayList arrayList3 = this.g;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        int iMax = 0;
        int iMax2 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(i5) && (behavior = layoutParams.f2382a) != null) {
                    int[] iArr2 = this.h;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.r(this, childAt, i2, i3, i4, iArr2);
                    iMax = i3 > 0 ? Math.max(iMax, iArr2[0]) : Math.min(iMax, iArr2[0]);
                    iMax2 = i4 > 0 ? Math.max(iMax2, iArr2[1]) : Math.min(iMax2, iArr2[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            u(1);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behavior = layoutParams.f2382a;
                if (behavior != null) {
                    boolean zV = behavior.v(this, childAt, view, view2, i, i2);
                    z2 |= zV;
                    if (i2 == 0) {
                        layoutParams.m = zV;
                    } else if (i2 == 1) {
                        layoutParams.n = zV;
                    }
                } else if (i2 == 0) {
                    layoutParams.m = false;
                } else if (i2 == 1) {
                    layoutParams.n = false;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z(false);
        if (this.p) {
            if (this.o == null) {
                this.o = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.o);
        }
        if (this.q == null) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (getFitsSystemWindows()) {
                ViewCompat.y(this);
            }
        }
        this.k = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z(false);
        if (this.p && this.o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.o);
        }
        View view = this.n;
        if (view != null) {
            h(0, view);
        }
        this.k = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.r || this.s == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.q;
        int iK = windowInsetsCompat != null ? windowInsetsCompat.k() : 0;
        if (iK > 0) {
            this.s.setBounds(0, 0, getWidth(), iK);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z(true);
        }
        boolean zX = x(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zX;
        }
        z(true);
        return zX;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        Behavior behavior;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((LayoutParams) view.getLayoutParams()).f2382a) == null || !behavior.n(this, view, layoutDirection))) {
                v(layoutDirection, view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0)) {
                    Behavior behavior = layoutParams.f2382a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean zP = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.a(0) && (behavior = layoutParams.f2382a) != null) {
                    zP |= behavior.p(view);
                }
            }
        }
        return zP;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        l(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        j(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        i(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        SparseArray sparseArray = savedState.f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = s(childAt).f2382a;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.t(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableU;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f2382a;
            if (id != -1 && behavior != null && (parcelableU = behavior.u(childAt)) != null) {
                sparseArray.append(id, parcelableU);
            }
        }
        savedState.f = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        h(0, view);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
  0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0022, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.m
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.x(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2a
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.m
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f2382a
            if (r6 == 0) goto L15
            android.view.View r7 = r0.m
            boolean r6 = r6.x(r0, r7, r1)
        L2a:
            android.view.View r7 = r0.m
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L54
            r1 = 3
            if (r2 != r1) goto L53
            goto L54
        L53:
            return r6
        L54:
            r0.z(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(Rect rect, View view) {
        ThreadLocal threadLocal = ViewGroupUtils.f2384a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = ViewGroupUtils.f2384a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        ViewGroupUtils.a(this, view, matrix);
        ThreadLocal threadLocal3 = ViewGroupUtils.b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int r(int i) {
        int[] iArr = this.l;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        Behavior behavior = ((LayoutParams) view.getLayoutParams()).f2382a;
        if (behavior == null || !behavior.s(this, view, rect, z2)) {
            return super.requestChildRectangleOnScreen(view, rect, z2);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.j) {
            return;
        }
        z(false);
        this.j = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        C();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.t = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                Drawable drawable3 = this.s;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.s;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.s.setVisible(z2, false);
    }

    public final boolean t(View view, int i, int i2) {
        Pools.SynchronizedPool synchronizedPool = A;
        Rect rectE = e();
        p(rectE, view);
        try {
            return rectE.contains(i, i2);
        } finally {
            rectE.setEmpty();
            synchronizedPool.b(rectE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(int r23) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u(int):void");
    }

    public final void v(int i, View view) {
        Rect rectE;
        Rect rectE2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        View view2 = layoutParams.k;
        if (view2 == null && layoutParams.f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        Pools.SynchronizedPool synchronizedPool = A;
        if (view2 != null) {
            rectE = e();
            rectE2 = e();
            try {
                p(rectE, view2);
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                q(i, rectE, rectE2, layoutParams2, measuredWidth, measuredHeight);
                f(layoutParams2, rectE2, measuredWidth, measuredHeight);
                view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
                return;
            } finally {
                rectE.setEmpty();
                synchronizedPool.b(rectE);
                rectE2.setEmpty();
                synchronizedPool.b(rectE2);
            }
        }
        int i2 = layoutParams.e;
        if (i2 < 0) {
            LayoutParams layoutParams3 = (LayoutParams) view.getLayoutParams();
            rectE = e();
            rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
            if (this.q != null) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                    rectE.left = this.q.i() + rectE.left;
                    rectE.top = this.q.k() + rectE.top;
                    rectE.right -= this.q.j();
                    rectE.bottom -= this.q.h();
                }
            }
            rectE2 = e();
            int i3 = layoutParams3.c;
            if ((i3 & 7) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
            return;
        }
        LayoutParams layoutParams4 = (LayoutParams) view.getLayoutParams();
        int i4 = layoutParams4.c;
        if (i4 == 0) {
            i4 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i == 1) {
            i2 = width - i2;
        }
        int iR = r(i2) - measuredWidth2;
        if (i5 == 1) {
            iR += measuredWidth2 / 2;
        } else if (i5 == 5) {
            iR += measuredWidth2;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, Math.min(iR, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) layoutParams4).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    public final void w(int i, int i2, int i3, View view) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    public final boolean x(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator comparator = z;
        if (comparator != null) {
            Collections.sort(arrayList, comparator);
        }
        int size = arrayList.size();
        MotionEvent motionEventObtain = null;
        boolean zM = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) arrayList.get(i3);
            Behavior behavior = ((LayoutParams) view.getLayoutParams()).f2382a;
            if (zM && actionMasked != 0) {
                if (behavior != null) {
                    if (motionEventObtain == null) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                    if (i == 0) {
                        behavior.m(this, view, motionEventObtain);
                    } else if (i == 1) {
                        behavior.x(this, view, motionEventObtain);
                    }
                }
            } else if (!zM && behavior != null) {
                if (i == 0) {
                    zM = behavior.m(this, view, motionEvent);
                } else if (i == 1) {
                    zM = behavior.x(this, view, motionEvent);
                }
                if (zM) {
                    this.m = view;
                }
            }
        }
        arrayList.clear();
        return zM;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.y():void");
    }

    public final void z(boolean z2) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            Behavior behavior = ((LayoutParams) childAt.getLayoutParams()).f2382a;
            if (behavior != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                if (z2) {
                    behavior.m(this, childAt, motionEventObtain);
                } else {
                    behavior.x(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((LayoutParams) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.m = null;
        this.j = false;
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i);
        this.d = new ArrayList();
        this.e = new DirectedAcyclicGraph();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new int[2];
        this.i = new int[2];
        this.v = new NestedScrollingParentHelper();
        int[] iArr = androidx.coordinatorlayout.R.styleable.f2381a;
        if (i == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 2132084192);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i == 0) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, 0, 2132084192);
            coordinatorLayout = this;
            context2 = context;
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, iArr, attributeSet, typedArray, i, 0);
        }
        int resourceId = typedArray.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            coordinatorLayout.l = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                coordinatorLayout.l[i2] = (int) (r10[i2] * f);
            }
        }
        coordinatorLayout.s = typedArray.getDrawable(1);
        typedArray.recycle();
        C();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public Behavior f2382a;
        public boolean b;
        public final int c;
        public int d;
        public final int e;
        public final int f;
        public int g;
        public int h;
        public int i;
        public int j;
        public View k;
        public View l;
        public boolean m;
        public boolean n;
        public boolean o;
        public final Rect p;

        public LayoutParams() {
            super(-2, -2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public final boolean a(int i) {
            if (i == 0) {
                return this.m;
            }
            if (i != 1) {
                return false;
            }
            return this.n;
        }

        public final void b(Behavior behavior) {
            Behavior behavior2 = this.f2382a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.l();
                }
                this.f2382a = behavior;
                this.b = true;
                if (behavior != null) {
                    behavior.i(this);
                }
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
            Behavior behavior;
            super(context, attributeSet);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.coordinatorlayout.R.styleable.b);
            this.c = typedArrayObtainStyledAttributes.getInteger(0, 0);
            this.f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            this.d = typedArrayObtainStyledAttributes.getInteger(2, 0);
            this.e = typedArrayObtainStyledAttributes.getInteger(6, -1);
            this.g = typedArrayObtainStyledAttributes.getInt(5, 0);
            this.h = typedArrayObtainStyledAttributes.getInt(4, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
            this.b = zHasValue;
            if (zHasValue) {
                String string = typedArrayObtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.w;
                if (TextUtils.isEmpty(string)) {
                    behavior = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.w;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + JwtParser.SEPARATOR_CHAR + string;
                        }
                    }
                    try {
                        ThreadLocal threadLocal = CoordinatorLayout.y;
                        Map map = (Map) threadLocal.get();
                        if (map == null) {
                            map = new HashMap();
                            threadLocal.set(map);
                        }
                        Constructor<?> constructor = (Constructor) map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.x);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        behavior = (Behavior) constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(a.A("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f2382a = behavior;
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior2 = this.f2382a;
            if (behavior2 != null) {
                behavior2.i(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.p = new Rect();
        }
    }
}
