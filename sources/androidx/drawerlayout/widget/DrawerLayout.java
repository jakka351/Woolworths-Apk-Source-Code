package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class DrawerLayout extends ViewGroup implements Openable {
    public static final int[] G = {R.attr.colorPrimaryDark};
    public static final int[] H = {R.attr.layout_gravity};
    public static final boolean I;
    public static final boolean J;
    public static final boolean K;
    public WindowInsets A;
    public boolean B;
    public final ArrayList C;
    public Rect D;
    public Matrix E;
    public final AccessibilityViewCommand F;
    public final ChildAccessibilityDelegate d;
    public float e;
    public final int f;
    public int g;
    public float h;
    public final Paint i;
    public final ViewDragHelper j;
    public final ViewDragHelper k;
    public final ViewDragCallback l;
    public final ViewDragCallback m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public DrawerListener v;
    public ArrayList w;
    public float x;
    public float y;
    public Drawable z;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$2, reason: invalid class name */
    public class AnonymousClass2 implements View.OnApplyWindowInsetsListener {
        @Override // android.view.View.OnApplyWindowInsetsListener
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            DrawerLayout drawerLayout = (DrawerLayout) view;
            boolean z = false;
            boolean z2 = windowInsets.getSystemWindowInsetTop() > 0;
            drawerLayout.A = windowInsets;
            drawerLayout.B = z2;
            if (!z2 && drawerLayout.getBackground() == null) {
                z = true;
            }
            drawerLayout.setWillNotDraw(z);
            drawerLayout.requestLayout();
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        public final Rect d = new Rect();

        public AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return this.f2466a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            accessibilityEvent.getText();
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewF = drawerLayout.f();
            if (viewF == null) {
                return true;
            }
            int i = drawerLayout.i(viewF);
            drawerLayout.getClass();
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            Gravity.getAbsoluteGravity(i, drawerLayout.getLayoutDirection());
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            boolean z = DrawerLayout.I;
            View.AccessibilityDelegate accessibilityDelegate = this.f2466a;
            if (z) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            } else {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoObtain);
                accessibilityNodeInfoCompat.c = -1;
                accessibilityNodeInfo.setSource(view);
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                Object parentForAccessibility = view.getParentForAccessibility();
                if (parentForAccessibility instanceof View) {
                    accessibilityNodeInfoCompat.b = -1;
                    accessibilityNodeInfo.setParent((View) parentForAccessibility);
                }
                Rect rect = this.d;
                accessibilityNodeInfoObtain.getBoundsInScreen(rect);
                accessibilityNodeInfoCompat.k(rect);
                accessibilityNodeInfo.setVisibleToUser(accessibilityNodeInfoObtain.isVisibleToUser());
                accessibilityNodeInfo.setPackageName(accessibilityNodeInfoObtain.getPackageName());
                accessibilityNodeInfoCompat.l(accessibilityNodeInfoObtain.getClassName());
                accessibilityNodeInfoCompat.p(accessibilityNodeInfoObtain.getContentDescription());
                accessibilityNodeInfo.setEnabled(accessibilityNodeInfoObtain.isEnabled());
                accessibilityNodeInfo.setFocused(accessibilityNodeInfoObtain.isFocused());
                accessibilityNodeInfoCompat.j(accessibilityNodeInfoObtain.isAccessibilityFocused());
                accessibilityNodeInfo.setSelected(accessibilityNodeInfoObtain.isSelected());
                accessibilityNodeInfoCompat.a(accessibilityNodeInfoObtain.getActions());
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.k(childAt)) {
                        accessibilityNodeInfo.addChild(childAt);
                    }
                }
            }
            accessibilityNodeInfoCompat.l("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfo.setFocusable(false);
            accessibilityNodeInfo.setFocused(false);
            accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.e);
            accessibilityNodeInfoCompat.i(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.I || DrawerLayout.k(view)) {
                return this.f2466a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    public static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.f2508a;
            this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (DrawerLayout.k(view)) {
                return;
            }
            accessibilityNodeInfoCompat.b = -1;
            accessibilityNodeInfo.setParent(null);
        }
    }

    public interface DrawerListener {
        void a(float f);

        void b(View view);

        void c(View view);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f2687a;
        public float b;
        public boolean c;
        public int d;

        public LayoutParams(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2687a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.H);
            this.f2687a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int f;
        public int g;
        public int h;
        public int i;
        public int j;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.f = 0;
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
        }
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public final void a(float f) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void b(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void c(View view) {
        }
    }

    public class ViewDragCallback extends ViewDragHelper.Callback {
        public final int c;
        public ViewDragHelper d;
        public final Runnable e = new Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.1
            @Override // java.lang.Runnable
            public final void run() {
                View viewE;
                int width;
                ViewDragCallback viewDragCallback = ViewDragCallback.this;
                DrawerLayout drawerLayout = DrawerLayout.this;
                int i = viewDragCallback.d.o;
                int i2 = viewDragCallback.c;
                boolean z = i2 == 3;
                if (z) {
                    viewE = drawerLayout.e(3);
                    width = (viewE != null ? -viewE.getWidth() : 0) + i;
                } else {
                    viewE = drawerLayout.e(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewE != null) {
                    if (((!z || viewE.getLeft() >= width) && (z || viewE.getLeft() <= width)) || drawerLayout.h(viewE) != 0) {
                        return;
                    }
                    LayoutParams layoutParams = (LayoutParams) viewE.getLayoutParams();
                    viewDragCallback.d.v(viewE, width, viewE.getTop());
                    layoutParams.c = true;
                    drawerLayout.invalidate();
                    View viewE2 = drawerLayout.e(i2 == 3 ? 5 : 3);
                    if (viewE2 != null) {
                        drawerLayout.c(viewE2, true);
                    }
                    if (drawerLayout.u) {
                        return;
                    }
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        drawerLayout.getChildAt(i3).dispatchTouchEvent(motionEventObtain);
                    }
                    motionEventObtain.recycle();
                    drawerLayout.u = true;
                }
            }
        };

        public ViewDragCallback(int i) {
            this.c = i;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i, int i2) {
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = drawerLayout.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            if (DrawerLayout.n(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeDragStarted(int i, int i2) {
            int i3 = i & 1;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = i3 == 1 ? drawerLayout.e(3) : drawerLayout.e(5);
            if (viewE == null || drawerLayout.h(viewE) != 0) {
                return;
            }
            this.d.c(i2, viewE);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean onEdgeLock(int i) {
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onEdgeTouched(int i, int i2) {
            DrawerLayout.this.postDelayed(this.e, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewCaptured(View view, int i) {
            ((LayoutParams) view.getLayoutParams()).c = false;
            int i2 = this.c == 3 ? 5 : 3;
            DrawerLayout drawerLayout = DrawerLayout.this;
            View viewE = drawerLayout.e(i2);
            if (viewE != null) {
                drawerLayout.c(viewE, true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i) {
            DrawerLayout.this.u(i, this.d.t);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            float width2 = (drawerLayout.b(3, view) ? i + width : drawerLayout.getWidth() - i) / width;
            drawerLayout.r(view, width2);
            view.setVisibility(width2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f, float f2) {
            int i;
            int[] iArr = DrawerLayout.G;
            float f3 = ((LayoutParams) view.getLayoutParams()).b;
            int width = view.getWidth();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.b(3, view)) {
                i = (f > BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && f3 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = drawerLayout.getWidth();
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && f3 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.d.t(i, view.getTop());
            drawerLayout.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i) {
            if (!DrawerLayout.n(view)) {
                return false;
            }
            int i2 = this.c;
            DrawerLayout drawerLayout = DrawerLayout.this;
            return drawerLayout.b(i2, view) && drawerLayout.h(view) == 0;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        I = true;
        J = true;
        K = i >= 29;
    }

    public DrawerLayout(@NonNull Context context) {
        this(context, null);
    }

    public static String j(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    public static boolean k(View view) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return (view.getImportantForAccessibility() == 4 || view.getImportantForAccessibility() == 2) ? false : true;
    }

    public static boolean l(View view) {
        return ((LayoutParams) view.getLayoutParams()).f2687a == 0;
    }

    public static boolean m(View view) {
        if (n(view)) {
            return (((LayoutParams) view.getLayoutParams()).d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean n(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f2687a;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public static boolean o(View view) {
        if (n(view)) {
            return ((LayoutParams) view.getLayoutParams()).b > BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final void a(DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.w == null) {
            this.w = new ArrayList();
        }
        this.w.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.C;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (!n(childAt)) {
                arrayList2.add(childAt);
            } else if (m(childAt)) {
                childAt.addFocusables(arrayList, i, i2);
                z = true;
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        View childAt;
        super.addView(view, i, layoutParams);
        int childCount = getChildCount();
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                childAt = null;
                break;
            }
            childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).d & 1) == 1) {
                break;
            } else {
                i2++;
            }
        }
        if (childAt != null || n(view)) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.setImportantForAccessibility(4);
        } else {
            WeakHashMap weakHashMap2 = ViewCompat.f2488a;
            view.setImportantForAccessibility(1);
        }
        if (I) {
            return;
        }
        ViewCompat.A(view, this.d);
    }

    public final boolean b(int i, View view) {
        return (i(view) & i) == i;
    }

    public final void c(View view, boolean z) {
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.p) {
            layoutParams.b = BitmapDescriptorFactory.HUE_RED;
            layoutParams.d = 0;
        } else if (z) {
            layoutParams.d |= 4;
            if (b(3, view)) {
                this.j.v(view, -view.getWidth(), view.getTop());
            } else {
                this.k.v(view, getWidth(), view.getTop());
            }
        } else {
            float f = ((LayoutParams) view.getLayoutParams()).b;
            float width = view.getWidth();
            int i = ((int) (width * BitmapDescriptorFactory.HUE_RED)) - ((int) (f * width));
            if (!b(3, view)) {
                i = -i;
            }
            view.offsetLeftAndRight(i);
            r(view, BitmapDescriptorFactory.HUE_RED);
            u(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i).getLayoutParams()).b);
        }
        this.h = fMax;
        boolean zH = this.j.h();
        boolean zH2 = this.k.h();
        if (zH || zH2) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            postInvalidateOnAnimation();
        }
    }

    public final void d(boolean z) {
        int childCount = getChildCount();
        boolean zV = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (n(childAt) && (!z || layoutParams.c)) {
                zV |= b(3, childAt) ? this.j.v(childAt, -childAt.getWidth(), childAt.getTop()) : this.k.v(childAt, getWidth(), childAt.getTop());
                layoutParams.c = false;
            }
        }
        ViewDragCallback viewDragCallback = this.l;
        DrawerLayout.this.removeCallbacks(viewDragCallback.e);
        ViewDragCallback viewDragCallback2 = this.m;
        DrawerLayout.this.removeCallbacks(viewDragCallback2.e);
        if (zV) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean zDispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.h <= BitmapDescriptorFactory.HUE_RED) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (this.D == null) {
                this.D = new Rect();
            }
            childAt.getHitRect(this.D);
            if (this.D.contains((int) x, (int) y) && !l(childAt)) {
                if (childAt.getMatrix().isIdentity()) {
                    float scrollX = getScrollX() - childAt.getLeft();
                    float scrollY = getScrollY() - childAt.getTop();
                    motionEvent.offsetLocation(scrollX, scrollY);
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                    motionEvent.offsetLocation(-scrollX, -scrollY);
                } else {
                    float scrollX2 = getScrollX() - childAt.getLeft();
                    float scrollY2 = getScrollY() - childAt.getTop();
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(scrollX2, scrollY2);
                    Matrix matrix = childAt.getMatrix();
                    if (!matrix.isIdentity()) {
                        if (this.E == null) {
                            this.E = new Matrix();
                        }
                        matrix.invert(this.E);
                        motionEventObtain.transform(this.E);
                    }
                    zDispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEventObtain);
                    motionEventObtain.recycle();
                }
                if (zDispatchGenericMotionEvent) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        Drawable background;
        int height = getHeight();
        boolean zL = l(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i = 0;
        if (zL) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && (background = childAt.getBackground()) != null && background.getOpacity() == -1 && n(childAt) && childAt.getHeight() >= height) {
                    if (b(3, childAt)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        float f = this.h;
        if (f > BitmapDescriptorFactory.HUE_RED && zL) {
            int i4 = this.g;
            Paint paint = this.i;
            paint.setColor((((int) ((((-16777216) & i4) >>> 24) * f)) << 24) | (i4 & 16777215));
            canvas.drawRect(i, BitmapDescriptorFactory.HUE_RED, width, getHeight(), paint);
        }
        return zDrawChild;
    }

    public final View e(int i) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection()) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((i(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (n(childAt) && o(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(int i) {
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int layoutDirection = getLayoutDirection();
        if (i == 3) {
            int i2 = this.q;
            if (i2 != 3) {
                return i2;
            }
            int i3 = layoutDirection == 0 ? this.s : this.t;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        }
        if (i == 5) {
            int i4 = this.r;
            if (i4 != 3) {
                return i4;
            }
            int i5 = layoutDirection == 0 ? this.t : this.s;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        if (i == 8388611) {
            int i6 = this.s;
            if (i6 != 3) {
                return i6;
            }
            int i7 = layoutDirection == 0 ? this.q : this.r;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        }
        if (i != 8388613) {
            return 0;
        }
        int i8 = this.t;
        if (i8 != 3) {
            return i8;
        }
        int i9 = layoutDirection == 0 ? this.r : this.q;
        if (i9 != 3) {
            return i9;
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.f2687a = 0;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams(layoutParams2);
            layoutParams3.f2687a = 0;
            layoutParams3.f2687a = layoutParams2.f2687a;
            return layoutParams3;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            layoutParams4.f2687a = 0;
            return layoutParams4;
        }
        LayoutParams layoutParams5 = new LayoutParams(layoutParams);
        layoutParams5.f2687a = 0;
        return layoutParams5;
    }

    public float getDrawerElevation() {
        return J ? this.e : BitmapDescriptorFactory.HUE_RED;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.z;
    }

    public final int h(View view) {
        if (n(view)) {
            return g(((LayoutParams) view.getLayoutParams()).f2687a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public final int i(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).f2687a;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        return Gravity.getAbsoluteGravity(i, getLayoutDirection());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.B || this.z == null) {
            return;
        }
        WindowInsets windowInsets = this.A;
        int systemWindowInsetTop = windowInsets != null ? windowInsets.getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.z.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.z.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r8.j
            boolean r2 = r1.u(r9)
            androidx.customview.widget.ViewDragHelper r3 = r8.k
            boolean r3 = r3.u(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L65
            if (r0 == r3) goto L5e
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L5e
            goto L63
        L1e:
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = r4
        L22:
            if (r0 >= r9) goto L63
            int r5 = r1.k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L5b
            float[] r5 = r1.f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.g
            r6 = r6[r0]
            float[] r7 = r1.e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L5b
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r9 = r8.l
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r9 = r9.e
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r9 = r8.m
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            java.lang.Runnable r9 = r9.e
            r0.removeCallbacks(r9)
            goto L63
        L5b:
            int r0 = r0 + 1
            goto L22
        L5e:
            r8.d(r3)
            r8.u = r4
        L63:
            r9 = r4
            goto L8b
        L65:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.x = r0
            r8.y = r9
            float r5 = r8.h
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L88
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.j(r0, r9)
            if (r9 == 0) goto L88
            boolean r9 = l(r9)
            if (r9 == 0) goto L88
            r9 = r3
            goto L89
        L88:
            r9 = r4
        L89:
            r8.u = r4
        L8b:
            if (r2 != 0) goto Lae
            if (r9 != 0) goto Lae
            int r9 = r8.getChildCount()
            r0 = r4
        L94:
            if (r0 >= r9) goto La8
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            boolean r1 = r1.c
            if (r1 == 0) goto La5
            goto Lae
        La5:
            int r0 = r0 + 1
            goto L94
        La8:
            boolean r9 = r8.u
            if (r9 == 0) goto Lad
            goto Lae
        Lad:
            return r4
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || f() == null) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View viewF = f();
        if (viewF != null && h(viewF) == 0) {
            d(false);
        }
        return viewF != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.o = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (l(childAt)) {
                    int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i8, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b(3, childAt)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i6 - r11) / f3;
                        i5 = i6 - ((int) (layoutParams.b * f3));
                    }
                    boolean z3 = f != layoutParams.b ? z2 : false;
                    int i9 = layoutParams.f2687a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i11 < i12) {
                            i11 = i12;
                        } else {
                            int i13 = i11 + measuredHeight;
                            int i14 = i10 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i13 > i14) {
                                i11 = i14 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                    } else if (i9 != 80) {
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i5, i15, measuredWidth + i5, measuredHeight + i15);
                    } else {
                        int i16 = i4 - i2;
                        childAt.layout(i5, (i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i16 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z3) {
                        r(childAt, f);
                    }
                    int i17 = layoutParams.b > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i17) {
                        childAt.setVisibility(i17);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (K && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets insetsG = WindowInsetsCompat.s(null, rootWindowInsets).g();
            ViewDragHelper viewDragHelper = this.j;
            viewDragHelper.o = Math.max(viewDragHelper.p, insetsG.f2430a);
            ViewDragHelper viewDragHelper2 = this.k;
            viewDragHelper2.o = Math.max(viewDragHelper2.p, insetsG.c);
        }
        this.o = false;
        this.p = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View viewE;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        int i = savedState.f;
        if (i != 0 && (viewE = e(i)) != null) {
            p(viewE);
        }
        int i2 = savedState.g;
        if (i2 != 3) {
            q(i2, 3);
        }
        int i3 = savedState.h;
        if (i3 != 3) {
            q(i3, 5);
        }
        int i4 = savedState.i;
        if (i4 != 3) {
            q(i4, 8388611);
        }
        int i5 = savedState.j;
        if (i5 != 3) {
            q(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        if (J) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        getLayoutDirection();
        getLayoutDirection();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = 0;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.d;
            boolean z = i2 == 1;
            boolean z2 = i2 == 2;
            if (z || z2) {
                savedState.f = layoutParams.f2687a;
                break;
            }
        }
        savedState.g = this.q;
        savedState.h = this.r;
        savedState.i = this.s;
        savedState.j = this.t;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            androidx.customview.widget.ViewDragHelper r0 = r6.j
            r0.n(r7)
            androidx.customview.widget.ViewDragHelper r1 = r6.k
            r1.n(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L70
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            return r3
        L1a:
            r6.d(r3)
            r6.u = r2
            return r3
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.j(r4, r5)
            if (r4 == 0) goto L6b
            boolean r4 = l(r4)
            if (r4 == 0) goto L6b
            float r4 = r6.x
            float r1 = r1 - r4
            float r4 = r6.y
            float r7 = r7 - r4
            int r0 = r0.b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L6b
            int r7 = r6.getChildCount()
            r0 = r2
        L4c:
            if (r0 >= r7) goto L61
            android.view.View r1 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r4 = r4.d
            r4 = r4 & r3
            if (r4 != r3) goto L5e
            goto L62
        L5e:
            int r0 = r0 + 1
            goto L4c
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L6b
            int r7 = r6.h(r1)
            r0 = 2
            if (r7 != r0) goto L6c
        L6b:
            r2 = r3
        L6c:
            r6.d(r2)
            return r3
        L70:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.x = r0
            r6.y = r7
            r6.u = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        if (!n(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (this.p) {
            layoutParams.b = 1.0f;
            layoutParams.d = 1;
            t(view, true);
            s(view);
        } else {
            layoutParams.d |= 2;
            if (b(3, view)) {
                this.j.v(view, 0, view.getTop());
            } else {
                this.k.v(view, getWidth() - view.getWidth(), view.getTop());
            }
        }
        invalidate();
    }

    public final void q(int i, int i2) {
        View viewE;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        if (i2 == 3) {
            this.q = i;
        } else if (i2 == 5) {
            this.r = i;
        } else if (i2 == 8388611) {
            this.s = i;
        } else if (i2 == 8388613) {
            this.t = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.j : this.k).b();
        }
        if (i != 1) {
            if (i == 2 && (viewE = e(absoluteGravity)) != null) {
                p(viewE);
                return;
            }
            return;
        }
        View viewE2 = e(absoluteGravity);
        if (viewE2 != null) {
            c(viewE2, true);
        }
    }

    public final void r(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f == layoutParams.b) {
            return;
        }
        layoutParams.b = f;
        ArrayList arrayList = this.w;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.w.get(size)).a(f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            d(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.o) {
            return;
        }
        super.requestLayout();
    }

    public final void s(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.n;
        ViewCompat.w(accessibilityActionCompat.a(), view);
        ViewCompat.t(0, view);
        if (!m(view) || h(view) == 2) {
            return;
        }
        ViewCompat.x(view, accessibilityActionCompat, null, this.F);
    }

    public void setDrawerElevation(float f) {
        this.e = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (n(childAt)) {
                ViewCompat.F(childAt, this.e);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        ArrayList arrayList;
        DrawerListener drawerListener2 = this.v;
        if (drawerListener2 != null && (arrayList = this.w) != null) {
            arrayList.remove(drawerListener2);
        }
        if (drawerListener != null) {
            a(drawerListener);
        }
        this.v = drawerListener;
    }

    public void setDrawerLockMode(int i) {
        q(i, 3);
        q(i, 5);
    }

    public void setScrimColor(@ColorInt int i) {
        this.g = i;
        invalidate();
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.z = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        this.z = new ColorDrawable(i);
        invalidate();
    }

    public final void t(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || n(childAt)) && !(z && childAt == view)) {
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                childAt.setImportantForAccessibility(4);
            } else {
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                childAt.setImportantForAccessibility(1);
            }
        }
    }

    public final void u(int i, View view) {
        int i2;
        View rootView;
        int i3 = this.j.f2544a;
        int i4 = this.k.f2544a;
        if (i3 == 1 || i4 == 1) {
            i2 = 1;
        } else {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).b;
            if (f == BitmapDescriptorFactory.HUE_RED) {
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if ((layoutParams.d & 1) == 1) {
                    layoutParams.d = 0;
                    ArrayList arrayList = this.w;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((DrawerListener) this.w.get(size)).c(view);
                        }
                    }
                    t(view, false);
                    s(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                if ((layoutParams2.d & 1) == 0) {
                    layoutParams2.d = 1;
                    ArrayList arrayList2 = this.w;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((DrawerListener) this.w.get(size2)).b(view);
                        }
                    }
                    t(view, true);
                    s(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.n) {
            this.n = i2;
            ArrayList arrayList3 = this.w;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((DrawerListener) this.w.get(size3)).getClass();
                }
            }
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.drawerLayoutStyle);
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ChildAccessibilityDelegate();
        this.g = -1728053248;
        this.i = new Paint();
        this.p = true;
        this.q = 3;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.F = new AccessibilityViewCommand() { // from class: androidx.drawerlayout.widget.DrawerLayout.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean b(View view) {
                if (!DrawerLayout.m(view)) {
                    return false;
                }
                DrawerLayout drawerLayout = DrawerLayout.this;
                if (drawerLayout.h(view) == 2) {
                    return false;
                }
                drawerLayout.c(view, true);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        ViewDragCallback viewDragCallback = new ViewDragCallback(3);
        this.l = viewDragCallback;
        ViewDragCallback viewDragCallback2 = new ViewDragCallback(5);
        this.m = viewDragCallback2;
        ViewDragHelper viewDragHelperI = ViewDragHelper.i(this, 1.0f, viewDragCallback);
        this.j = viewDragHelperI;
        viewDragHelperI.q = 1;
        viewDragHelperI.n = f2;
        viewDragCallback.d = viewDragHelperI;
        ViewDragHelper viewDragHelperI2 = ViewDragHelper.i(this, 1.0f, viewDragCallback2);
        this.k = viewDragHelperI2;
        viewDragHelperI2.q = 2;
        viewDragHelperI2.n = f2;
        viewDragCallback2.d = viewDragHelperI2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(1);
        ViewCompat.A(this, new AccessibilityDelegate());
        setMotionEventSplittingEnabled(false);
        if (getFitsSystemWindows()) {
            setOnApplyWindowInsetsListener(new AnonymousClass2());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(G);
            try {
                this.z = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.f2686a, i, 0);
        try {
            if (typedArrayObtainStyledAttributes2.hasValue(0)) {
                this.e = typedArrayObtainStyledAttributes2.getDimension(0, BitmapDescriptorFactory.HUE_RED);
            } else {
                this.e = getResources().getDimension(com.woolworths.R.dimen.def_drawer_elevation);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.C = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setStatusBarBackground(int i) {
        this.z = i != 0 ? getContext().getDrawable(i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
