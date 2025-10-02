package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import com.woolworths.R;

/* loaded from: classes2.dex */
abstract class AbsActionBarView extends ViewGroup {
    public final VisibilityAnimListener d;
    public final Context e;
    public ActionMenuView f;
    public ActionMenuPresenter g;
    public int h;
    public ViewPropertyAnimatorCompat i;
    public boolean j;
    public boolean k;

    /* renamed from: androidx.appcompat.widget.AbsActionBarView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public class VisibilityAnimListener implements ViewPropertyAnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public boolean f139a = false;
        public int b;

        public VisibilityAnimListener() {
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void d() {
            if (this.f139a) {
                return;
            }
            AbsActionBarView absActionBarView = AbsActionBarView.this;
            absActionBarView.i = null;
            AbsActionBarView.super.setVisibility(this.b);
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void e() {
            AbsActionBarView.super.setVisibility(0);
            this.f139a = false;
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListener
        public final void f() {
            this.f139a = true;
        }
    }

    public AbsActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new VisibilityAnimListener();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.e = context;
        } else {
            this.e = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int d(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int iD = YU.a.D(i3, measuredHeight, 2, i2);
        if (z) {
            view.layout(i - measuredWidth, iD, i, measuredHeight + iD);
        } else {
            view.layout(i, iD, i + measuredWidth, measuredHeight + iD);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, androidx.appcompat.R.styleable.f88a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.t = ActionBarPolicy.a(actionMenuPresenter.e).b();
            MenuBuilder menuBuilder = actionMenuPresenter.f;
            if (menuBuilder != null) {
                menuBuilder.q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.k = false;
        }
        if (!this.k) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.k = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.k = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.j = false;
        }
        if (!this.j) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.j = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.j = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.i;
            if (viewPropertyAnimatorCompat != null) {
                viewPropertyAnimatorCompat.b();
            }
            super.setVisibility(i);
        }
    }
}
