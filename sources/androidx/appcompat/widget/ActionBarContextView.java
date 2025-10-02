package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.AbsActionBarView;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;

@RestrictTo
/* loaded from: classes2.dex */
public class ActionBarContextView extends AbsActionBarView {
    public CharSequence l;
    public CharSequence m;
    public View n;
    public View o;
    public View p;
    public LinearLayout q;
    public TextView r;
    public TextView s;
    public final int t;
    public final int u;
    public boolean v;
    public final int w;

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    public final void e(final ActionMode actionMode) {
        View view = this.n;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.w, (ViewGroup) this, false);
            this.n = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.n);
        }
        View viewFindViewById = this.n.findViewById(R.id.action_mode_close_button);
        this.o = viewFindViewById;
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ActionBarContextView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Callback.g(view2);
                try {
                    actionMode.c();
                } finally {
                    Callback.h();
                }
            }
        });
        MenuBuilder menuBuilderE = actionMode.e();
        ActionMenuPresenter actionMenuPresenter = this.g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.x;
            if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
                actionButtonSubmenu.j.dismiss();
            }
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.g = actionMenuPresenter2;
        actionMenuPresenter2.p = true;
        actionMenuPresenter2.q = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilderE.c(this.g, this.e);
        ActionMenuPresenter actionMenuPresenter3 = this.g;
        MenuView menuView = actionMenuPresenter3.k;
        if (menuView == null) {
            MenuView menuView2 = (MenuView) actionMenuPresenter3.g.inflate(actionMenuPresenter3.i, (ViewGroup) this, false);
            actionMenuPresenter3.k = menuView2;
            menuView2.a(actionMenuPresenter3.f);
            actionMenuPresenter3.f(true);
        }
        MenuView menuView3 = actionMenuPresenter3.k;
        if (menuView != menuView3) {
            ((ActionMenuView) menuView3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) menuView3;
        this.f = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f, layoutParams);
    }

    public final void f() {
        if (this.q == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.q = linearLayout;
            this.r = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.s = (TextView) this.q.findViewById(R.id.action_bar_subtitle);
            int i = this.t;
            if (i != 0) {
                this.r.setTextAppearance(getContext(), i);
            }
            int i2 = this.u;
            if (i2 != 0) {
                this.s.setTextAppearance(getContext(), i2);
            }
        }
        this.r.setText(this.l);
        this.s.setText(this.m);
        boolean zIsEmpty = TextUtils.isEmpty(this.l);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.m);
        this.s.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.q.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.q.getParent() == null) {
            addView(this.q);
        }
    }

    public final void g() {
        removeAllViews();
        this.p = null;
        this.f = null;
        this.g = null;
        View view = this.o;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.i != null ? this.d.b : getVisibility();
    }

    public int getContentHeight() {
        return this.h;
    }

    public CharSequence getSubtitle() {
        return this.m;
    }

    public CharSequence getTitle() {
        return this.l;
    }

    public final ViewPropertyAnimatorCompat h(int i, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.i;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.b();
        }
        AbsActionBarView.VisibilityAnimListener visibilityAnimListener = this.d;
        if (i != 0) {
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.b(this);
            viewPropertyAnimatorCompatB.a(BitmapDescriptorFactory.HUE_RED);
            viewPropertyAnimatorCompatB.c(j);
            AbsActionBarView.this.i = viewPropertyAnimatorCompatB;
            visibilityAnimListener.b = i;
            viewPropertyAnimatorCompatB.d(visibilityAnimListener);
            return viewPropertyAnimatorCompatB;
        }
        if (getVisibility() != 0) {
            setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB2 = ViewCompat.b(this);
        viewPropertyAnimatorCompatB2.a(1.0f);
        viewPropertyAnimatorCompatB2.c(j);
        AbsActionBarView.this.i = viewPropertyAnimatorCompatB2;
        visibilityAnimListener.b = i;
        viewPropertyAnimatorCompatB2.d(visibilityAnimListener);
        return viewPropertyAnimatorCompatB2;
    }

    public final boolean i() {
        ActionMenuPresenter actionMenuPresenter = this.g;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.r();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.g;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.o();
            ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = this.g.x;
            if (actionButtonSubmenu == null || !actionButtonSubmenu.b()) {
                return;
            }
            actionButtonSubmenu.j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = getLayoutDirection() == 1;
        int paddingRight = z2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.n;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            int i5 = z2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z2 ? paddingRight - i5 : paddingRight + i5;
            int iD = i7 + AbsActionBarView.d(i7, paddingTop, paddingTop2, this.n, z2);
            paddingRight = z2 ? iD - i6 : iD + i6;
        }
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, this.q, z2);
        }
        View view2 = this.p;
        if (view2 != null) {
            AbsActionBarView.d(paddingRight, paddingTop, paddingTop2, view2, z2);
        }
        int paddingLeft = z2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null) {
            AbsActionBarView.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !z2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.h;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.n;
        if (view != null) {
            int iC = AbsActionBarView.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.n.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbsActionBarView.c(this.f, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.q;
        if (linearLayout != null && this.p == null) {
            if (this.v) {
                this.q.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.q.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.q.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbsActionBarView.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.p;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.p.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.h > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // androidx.appcompat.widget.AbsActionBarView
    public void setContentHeight(int i) {
        this.h = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.p;
        if (view2 != null) {
            removeView(view2);
        }
        this.p = view;
        if (view != null && (linearLayout = this.q) != null) {
            removeView(linearLayout);
            this.q = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.m = charSequence;
        f();
    }

    public void setTitle(CharSequence charSequence) {
        this.l = charSequence;
        f();
        ViewCompat.C(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.v) {
            requestLayout();
        }
        this.v = z;
    }

    @Override // androidx.appcompat.widget.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.d, i, 0);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        setBackground(tintTypedArray.b(0));
        this.t = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.h = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.w = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        tintTypedArray.g();
    }
}
