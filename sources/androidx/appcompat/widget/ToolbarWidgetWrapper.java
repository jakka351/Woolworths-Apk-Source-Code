package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.ActionMenuItem;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.ExpandedActionViewMenuPresenter;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RestrictTo
/* loaded from: classes2.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* renamed from: a, reason: collision with root package name */
    public final Toolbar f194a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public final CharSequence i;
    public CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ActionMenuPresenter m;
    public final int n;
    public final Drawable o;

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.f194a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayF = TintTypedArray.f(toolbar.getContext(), null, R.styleable.f88a, com.woolworths.R.attr.actionBarStyle, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        int i = 15;
        this.o = tintTypedArrayF.b(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = tintTypedArrayF.b(20);
            if (drawableB != null) {
                o(drawableB);
            }
            Drawable drawableB2 = tintTypedArrayF.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                s(drawable);
            }
            i(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                i(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                toolbar.d();
                toolbar.w.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = toolbar.getContext();
                toolbar.o = resourceId2;
                AppCompatTextView appCompatTextView = toolbar.e;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.p = resourceId3;
                AppCompatTextView appCompatTextView2 = toolbar.f;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        tintTypedArrayF.g();
        if (com.woolworths.R.string.abc_action_bar_up_description != this.n) {
            this.n = com.woolworths.R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                k(this.n);
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.1
            public final ActionMenuItem d;

            {
                Context context3 = ToolbarWidgetWrapper.this.f194a.getContext();
                CharSequence charSequence = ToolbarWidgetWrapper.this.h;
                ActionMenuItem actionMenuItem = new ActionMenuItem();
                actionMenuItem.e = 4096;
                actionMenuItem.g = 4096;
                actionMenuItem.l = null;
                actionMenuItem.m = null;
                actionMenuItem.n = false;
                actionMenuItem.o = false;
                actionMenuItem.p = 16;
                actionMenuItem.i = context3;
                actionMenuItem.f131a = charSequence;
                this.d = actionMenuItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Callback.g(view2);
                try {
                    ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
                    Window.Callback callback = toolbarWidgetWrapper.k;
                    if (callback != null && toolbarWidgetWrapper.l) {
                        callback.onMenuItemSelected(0, this.d);
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        });
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean a() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f194a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.d) != null && actionMenuView.v;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean b() {
        return this.f194a.w();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean c() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f194a.d;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null || !actionMenuPresenter.p()) ? false : true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void collapseActionView() {
        Toolbar.ExpandedActionViewMenuPresenter expandedActionViewMenuPresenter = this.f194a.P;
        MenuItemImpl menuItemImpl = expandedActionViewMenuPresenter == null ? null : expandedActionViewMenuPresenter.e;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean d() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f194a.d;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null || !actionMenuPresenter.o()) ? false : true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void e(Menu menu, MenuPresenter.Callback callback) {
        ActionMenuPresenter actionMenuPresenter = this.m;
        Toolbar toolbar = this.f194a;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.m = actionMenuPresenter2;
            actionMenuPresenter2.l = com.woolworths.R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.m;
        actionMenuPresenter3.h = callback;
        MenuBuilder menuBuilder = (MenuBuilder) menu;
        if (menuBuilder == null && toolbar.d == null) {
            return;
        }
        toolbar.f();
        MenuBuilder menuBuilder2 = toolbar.d.s;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.s(toolbar.O);
            menuBuilder2.s(toolbar.P);
        }
        if (toolbar.P == null) {
            toolbar.P = toolbar.new ExpandedActionViewMenuPresenter();
        }
        actionMenuPresenter3.u = true;
        if (menuBuilder != null) {
            menuBuilder.c(actionMenuPresenter3, toolbar.m);
            menuBuilder.c(toolbar.P, toolbar.m);
        } else {
            actionMenuPresenter3.h(toolbar.m, null);
            toolbar.P.h(toolbar.m, null);
            actionMenuPresenter3.f(true);
            toolbar.P.f(true);
        }
        toolbar.d.setPopupTheme(toolbar.n);
        toolbar.d.setPresenter(actionMenuPresenter3);
        toolbar.O = actionMenuPresenter3;
        toolbar.x();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void f() {
        this.l = true;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean g() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f194a.d;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null) {
            return false;
        }
        return actionMenuPresenter.y != null || actionMenuPresenter.p();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final Context getContext() {
        return this.f194a.getContext();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final CharSequence getTitle() {
        return this.f194a.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final boolean h() {
        return this.f194a.m();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void i(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f194a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    v();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                w();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void j(CharSequence charSequence) {
        this.j = charSequence;
        v();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void k(int i) {
        j(i == 0 ? null : this.f194a.getContext().getString(i));
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void l() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void m(boolean z) {
        this.f194a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void n() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f194a.d;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.w) == null) {
            return;
        }
        actionMenuPresenter.o();
        ActionMenuPresenter.ActionButtonSubmenu actionButtonSubmenu = actionMenuPresenter.x;
        if (actionButtonSubmenu == null || !actionButtonSubmenu.b()) {
            return;
        }
        actionButtonSubmenu.j.dismiss();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void o(Drawable drawable) {
        this.e = drawable;
        w();
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void p() {
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final int q() {
        return this.b;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void s(Drawable drawable) {
        this.f = drawable;
        int i = this.b & 4;
        Toolbar toolbar = this.f194a;
        if (i == 0) {
            toolbar.setNavigationIcon((Drawable) null);
            return;
        }
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(int i) {
        setIcon(i != 0 ? AppCompatResources.b(i, this.f194a.getContext()) : null);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setTitle(CharSequence charSequence) {
        this.g = true;
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.f194a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                ViewCompat.C(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setVisibility(int i) {
        this.f194a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.g) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.f194a;
            toolbar.setTitle(charSequence);
            if (this.g) {
                ViewCompat.C(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final ViewPropertyAnimatorCompat t(final int i, long j) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatB = ViewCompat.b(this.f194a);
        viewPropertyAnimatorCompatB.a(i == 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        viewPropertyAnimatorCompatB.c(j);
        viewPropertyAnimatorCompatB.d(new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ToolbarWidgetWrapper.2

            /* renamed from: a, reason: collision with root package name */
            public boolean f195a = false;

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void d() {
                if (this.f195a) {
                    return;
                }
                ToolbarWidgetWrapper.this.f194a.setVisibility(i);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void e() {
                ToolbarWidgetWrapper.this.f194a.setVisibility(0);
            }

            @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
            public final void f() {
                this.f195a = true;
            }
        });
        return viewPropertyAnimatorCompatB;
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void u(int i) {
        o(i != 0 ? AppCompatResources.b(i, this.f194a.getContext()) : null);
    }

    public final void v() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.f194a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void w() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.f194a.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.DecorToolbar
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        w();
    }
}
