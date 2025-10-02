package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

@SuppressLint
@RestrictTo
/* loaded from: classes2.dex */
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {
    public static final int[] F = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public static final WindowInsetsCompat G;
    public static final Rect H;
    public final AnimatorListenerAdapter A;
    public final Runnable B;
    public final Runnable C;
    public final NestedScrollingParentHelper D;
    public final NoSystemUiLayoutFlagView E;
    public int d;
    public int e;
    public ContentFrameLayout f;
    public ActionBarContainer g;
    public DecorToolbar h;
    public Drawable i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public final Rect p;
    public final Rect q;
    public final Rect r;
    public final Rect s;
    public WindowInsetsCompat t;
    public WindowInsetsCompat u;
    public WindowInsetsCompat v;
    public WindowInsetsCompat w;
    public ActionBarVisibilityCallback x;
    public OverScroller y;
    public ViewPropertyAnimator z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.z = actionBarOverlayLayout.g.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(actionBarOverlayLayout.A);
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.q();
            actionBarOverlayLayout.z = actionBarOverlayLayout.g.animate().translationY(-actionBarOverlayLayout.g.getHeight()).setListener(actionBarOverlayLayout.A);
        }
    }

    public interface ActionBarVisibilityCallback {
        void a();

        void b();

        void c();

        void d(boolean z);

        void onWindowVisibilityChanged(int i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public final int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    static {
        WindowInsetsCompat.Builder builder = new WindowInsetsCompat.Builder();
        builder.b(Insets.c(0, 1, 0, 1));
        G = builder.a();
        H = new Rect();
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    public static boolean p(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean a() {
        s();
        return this.h.a();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean b() {
        s();
        return this.h.b();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean c() {
        s();
        return this.h.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean d() {
        s();
        return this.h.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.i != null) {
            if (this.g.getVisibility() == 0) {
                translationY = (int) (this.g.getTranslationY() + this.g.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.i.setBounds(0, translationY, getWidth(), this.i.getIntrinsicHeight() + translationY);
            this.i.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void e(Menu menu, MenuPresenter.Callback callback) {
        s();
        this.h.e(menu, callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void f() {
        s();
        this.h.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final boolean g() {
        s();
        return this.h.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.D.a();
    }

    public CharSequence getTitle() {
        s();
        return this.h.getTitle();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void h(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void j(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void k(int i) {
        s();
        if (i == 2) {
            this.h.l();
        } else if (i == 5) {
            this.h.r();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void l(View view, int i, int i2, int[] iArr, int i3) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public final void m() {
        s();
        this.h.n();
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void n(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        j(view, i, i2, i3, i4, i5);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        WindowInsetsCompat windowInsetsCompatS = WindowInsetsCompat.s(this, windowInsets);
        boolean zP = p(this.g, new Rect(windowInsetsCompatS.i(), windowInsetsCompatS.k(), windowInsetsCompatS.j(), windowInsetsCompatS.h()), false);
        Rect rect = this.p;
        ViewCompat.c(this, windowInsetsCompatS, rect);
        WindowInsetsCompat windowInsetsCompatN = windowInsetsCompatS.n(rect.left, rect.top, rect.right, rect.bottom);
        this.t = windowInsetsCompatN;
        boolean z = true;
        if (!this.u.equals(windowInsetsCompatN)) {
            this.u = this.t;
            zP = true;
        }
        Rect rect2 = this.q;
        if (rect2.equals(rect)) {
            z = zP;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return windowInsetsCompatS.a().c().b().r();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        ViewCompat.y(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.l || !z) {
            return false;
        }
        this.y.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.y.getFinalY() > this.g.getHeight()) {
            q();
            ((AnonymousClass3) this.C).run();
        } else {
            q();
            ((AnonymousClass2) this.B).run();
        }
        this.m = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.n + i2;
        this.n = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        this.D.f2480a = i;
        this.n = getActionBarHideOffset();
        q();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.x;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.g.getVisibility() != 0) {
            return false;
        }
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.l || this.m) {
            return;
        }
        if (this.n <= this.g.getHeight()) {
            q();
            postDelayed(this.B, 600L);
        } else {
            q();
            postDelayed(this.C, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        s();
        int i2 = this.o ^ i;
        this.o = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.x;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.d(!z2);
            if (z || !z2) {
                this.x.a();
            } else {
                this.x.b();
            }
        }
        if ((i2 & 256) == 0 || this.x == null) {
            return;
        }
        ViewCompat.y(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.e = i;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.x;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i);
        }
    }

    public final void q() {
        removeCallbacks(this.B);
        removeCallbacks(this.C);
        ViewPropertyAnimator viewPropertyAnimator = this.z;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(F);
        this.d = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.i = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.y = new OverScroller(context);
    }

    public final void s() {
        DecorToolbar wrapper;
        if (this.f == null) {
            this.f = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.g = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof DecorToolbar) {
                wrapper = (DecorToolbar) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.h = wrapper;
        }
    }

    public void setActionBarHideOffset(int i) {
        q();
        this.g.setTranslationY(-Math.max(0, Math.min(i, this.g.getHeight())));
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.x = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.x.onWindowVisibilityChanged(this.e);
            int i = this.o;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                ViewCompat.y(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.k = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.l) {
            this.l = z;
            if (z) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        s();
        this.h.setIcon(i);
    }

    public void setLogo(int i) {
        s();
        this.h.u(i);
    }

    public void setOverlayMode(boolean z) {
        this.j = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.h.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.h.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.b;
        this.t = windowInsetsCompat;
        this.u = windowInsetsCompat;
        this.v = windowInsetsCompat;
        this.w = windowInsetsCompat;
        this.A = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.m = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.z = null;
                actionBarOverlayLayout.m = false;
            }
        };
        this.B = new AnonymousClass2();
        this.C = new AnonymousClass3();
        r(context);
        this.D = new NestedScrollingParentHelper();
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        noSystemUiLayoutFlagView.setWillNotDraw(true);
        this.E = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.h.setIcon(drawable);
    }
}
