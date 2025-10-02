package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.MenuPopupWindow;
import com.woolworths.R;

/* loaded from: classes2.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, MenuPresenter, View.OnKeyListener {
    public final Context e;
    public final MenuBuilder f;
    public final MenuAdapter g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;
    public final MenuPopupWindow l;
    public PopupWindow.OnDismissListener o;
    public View p;
    public View q;
    public MenuPresenter.Callback r;
    public ViewTreeObserver s;
    public boolean t;
    public boolean u;
    public int v;
    public boolean x;
    public final ViewTreeObserver.OnGlobalLayoutListener m = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            MenuPopupWindow menuPopupWindow = standardMenuPopup.l;
            if (!standardMenuPopup.b() || menuPopupWindow.B) {
                return;
            }
            View view = standardMenuPopup.q;
            if (view == null || !view.isShown()) {
                standardMenuPopup.dismiss();
            } else {
                menuPopupWindow.a();
            }
        }
    };
    public final View.OnAttachStateChangeListener n = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
            ViewTreeObserver viewTreeObserver = standardMenuPopup.s;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    standardMenuPopup.s = view.getViewTreeObserver();
                }
                standardMenuPopup.s.removeGlobalOnLayoutListener(standardMenuPopup.m);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    public int w = 0;

    public StandardMenuPopup(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        this.e = context;
        this.f = menuBuilder;
        this.h = z;
        this.g = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.j = i;
        this.k = i2;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.p = view;
        this.l = new MenuPopupWindow(context, null, i, i2);
        menuBuilder.c(this, context);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.t || (view = this.p) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.q = view;
        MenuPopupWindow menuPopupWindow = this.l;
        PopupWindow popupWindow = menuPopupWindow.C;
        PopupWindow popupWindow2 = menuPopupWindow.C;
        popupWindow.setOnDismissListener(this);
        menuPopupWindow.s = this;
        menuPopupWindow.B = true;
        popupWindow2.setFocusable(true);
        View view2 = this.q;
        boolean z = this.s == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.s = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.m);
        }
        view2.addOnAttachStateChangeListener(this.n);
        menuPopupWindow.r = view2;
        menuPopupWindow.o = this.w;
        boolean z2 = this.u;
        Context context = this.e;
        MenuAdapter menuAdapter = this.g;
        if (!z2) {
            this.v = MenuPopup.o(menuAdapter, context, this.i);
            this.u = true;
        }
        menuPopupWindow.r(this.v);
        popupWindow2.setInputMethodMode(2);
        Rect rect = this.d;
        menuPopupWindow.A = rect != null ? new Rect(rect) : null;
        menuPopupWindow.a();
        DropDownListView dropDownListView = menuPopupWindow.f;
        dropDownListView.setOnKeyListener(this);
        if (this.x) {
            MenuBuilder menuBuilder = this.f;
            if (menuBuilder.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.m);
                }
                frameLayout.setEnabled(false);
                dropDownListView.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.o(menuAdapter);
        menuPopupWindow.a();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final boolean b() {
        return !this.t && this.l.C.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.f) {
            return;
        }
        dismiss();
        MenuPresenter.Callback callback = this.r;
        if (callback != null) {
            callback.c(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final void dismiss() {
        if (b()) {
            this.l.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        this.u = false;
        MenuAdapter menuAdapter = this.g;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public final ListView i() {
        return this.l.f;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void j(MenuPresenter.Callback callback) {
        this.r = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            MenuPopupHelper menuPopupHelper = new MenuPopupHelper(this.j, this.k, this.e, this.q, subMenuBuilder, this.h);
            MenuPresenter.Callback callback = this.r;
            menuPopupHelper.i = callback;
            MenuPopup menuPopup = menuPopupHelper.j;
            if (menuPopup != null) {
                menuPopup.j(callback);
            }
            int size = subMenuBuilder.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = subMenuBuilder.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            menuPopupHelper.d(z);
            menuPopupHelper.k = this.o;
            this.o = null;
            this.f.d(false);
            MenuPopupWindow menuPopupWindow = this.l;
            int width = menuPopupWindow.i;
            int iG = menuPopupWindow.g();
            if ((Gravity.getAbsoluteGravity(this.w, this.p.getLayoutDirection()) & 7) == 5) {
                width += this.p.getWidth();
            }
            if (!menuPopupHelper.b()) {
                if (menuPopupHelper.f != null) {
                    menuPopupHelper.e(width, iG, true, true);
                }
            }
            MenuPresenter.Callback callback2 = this.r;
            if (callback2 != null) {
                callback2.d(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void n(MenuBuilder menuBuilder) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.t = true;
        this.f.d(true);
        ViewTreeObserver viewTreeObserver = this.s;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.s = this.q.getViewTreeObserver();
            }
            this.s.removeGlobalOnLayoutListener(this.m);
            this.s = null;
        }
        this.q.removeOnAttachStateChangeListener(this.n);
        PopupWindow.OnDismissListener onDismissListener = this.o;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void p(View view) {
        this.p = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void q(boolean z) {
        this.g.f = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void r(int i) {
        this.w = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void s(int i) {
        this.l.i = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.o = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void u(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public final void v(int i) {
        this.l.d(i);
    }
}
