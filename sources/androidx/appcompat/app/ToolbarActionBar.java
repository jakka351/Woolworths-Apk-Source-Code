package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
class ToolbarActionBar extends ActionBar {

    /* renamed from: a, reason: collision with root package name */
    public final ToolbarWidgetWrapper f107a;
    public final Window.Callback b;
    public final ToolbarMenuCallback c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList g = new ArrayList();
    public final Runnable h = new Runnable() { // from class: androidx.appcompat.app.ToolbarActionBar.1
        @Override // java.lang.Runnable
        public final void run() {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            Window.Callback callback = toolbarActionBar.b;
            Menu menuE = toolbarActionBar.E();
            MenuBuilder menuBuilder = menuE instanceof MenuBuilder ? (MenuBuilder) menuE : null;
            if (menuBuilder != null) {
                menuBuilder.B();
            }
            try {
                menuE.clear();
                if (!callback.onCreatePanelMenu(0, menuE) || !callback.onPreparePanel(0, null, menuE)) {
                    menuE.clear();
                }
                if (menuBuilder != null) {
                    menuBuilder.A();
                }
            } catch (Throwable th) {
                if (menuBuilder != null) {
                    menuBuilder.A();
                }
                throw th;
            }
        }
    };
    public final Toolbar.OnMenuItemClickListener i;

    public final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        public boolean d;

        public ActionMenuPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void c(MenuBuilder menuBuilder, boolean z) {
            if (this.d) {
                return;
            }
            this.d = true;
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            toolbarActionBar.f107a.n();
            toolbarActionBar.b.onPanelClosed(108, menuBuilder);
            this.d = false;
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean d(MenuBuilder menuBuilder) {
            ToolbarActionBar.this.b.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public final class MenuBuilderCallback implements MenuBuilder.Callback {
        public MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public final void b(MenuBuilder menuBuilder) {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            Window.Callback callback = toolbarActionBar.b;
            if (toolbarActionBar.f107a.f194a.q()) {
                callback.onPanelClosed(108, menuBuilder);
            } else if (callback.onPreparePanel(0, null, menuBuilder)) {
                callback.onMenuOpened(108, menuBuilder);
            }
        }
    }

    public class ToolbarMenuCallback implements AppCompatDelegateImpl.ActionBarMenuCallback {
        public ToolbarMenuCallback() {
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public final void a(int i) {
            if (i == 0) {
                ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
                if (toolbarActionBar.d) {
                    return;
                }
                toolbarActionBar.f107a.l = true;
                toolbarActionBar.d = true;
            }
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.ActionBarMenuCallback
        public final View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(ToolbarActionBar.this.f107a.f194a.getContext());
            }
            return null;
        }
    }

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        Toolbar.OnMenuItemClickListener onMenuItemClickListener = new Toolbar.OnMenuItemClickListener() { // from class: androidx.appcompat.app.ToolbarActionBar.2
            @Override // androidx.appcompat.widget.Toolbar.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return ToolbarActionBar.this.b.onMenuItemSelected(0, menuItem);
            }
        };
        this.i = onMenuItemClickListener;
        toolbar.getClass();
        ToolbarWidgetWrapper toolbarWidgetWrapper = new ToolbarWidgetWrapper(toolbar, false);
        this.f107a = toolbarWidgetWrapper;
        callback.getClass();
        this.b = callback;
        toolbarWidgetWrapper.k = callback;
        toolbar.setOnMenuItemClickListener(onMenuItemClickListener);
        toolbarWidgetWrapper.setWindowTitle(charSequence);
        this.c = new ToolbarMenuCallback();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void A(CharSequence charSequence) {
        this.f107a.setTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void B(CharSequence charSequence) {
        this.f107a.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void C() {
        this.f107a.setVisibility(0);
    }

    public final Menu E() {
        boolean z = this.e;
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f107a;
        if (!z) {
            ActionMenuPresenterCallback actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            MenuBuilderCallback menuBuilderCallback = new MenuBuilderCallback();
            Toolbar toolbar = toolbarWidgetWrapper.f194a;
            toolbar.Q = actionMenuPresenterCallback;
            toolbar.R = menuBuilderCallback;
            ActionMenuView actionMenuView = toolbar.d;
            if (actionMenuView != null) {
                actionMenuView.x = actionMenuPresenterCallback;
                actionMenuView.y = menuBuilderCallback;
            }
            this.e = true;
        }
        return toolbarWidgetWrapper.f194a.getMenu();
    }

    public final void F(int i, int i2) {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f107a;
        toolbarWidgetWrapper.i((i & i2) | ((~i2) & toolbarWidgetWrapper.b));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean e() {
        return this.f107a.d();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean f() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f107a;
        if (!toolbarWidgetWrapper.f194a.m()) {
            return false;
        }
        toolbarWidgetWrapper.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void g(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ActionBar.OnMenuVisibilityListener) arrayList.get(i)).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int h() {
        return this.f107a.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context i() {
        return this.f107a.f194a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final CharSequence j() {
        return this.f107a.f194a.getTitle();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void k() {
        this.f107a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean l() {
        ToolbarWidgetWrapper toolbarWidgetWrapper = this.f107a;
        Toolbar toolbar = toolbarWidgetWrapper.f194a;
        Runnable runnable = this.h;
        toolbar.removeCallbacks(runnable);
        Toolbar toolbar2 = toolbarWidgetWrapper.f194a;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        toolbar2.postOnAnimation(runnable);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m() {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n() {
        this.f107a.f194a.removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean o(int i, KeyEvent keyEvent) {
        Menu menuE = E();
        if (menuE == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean q() {
        return this.f107a.f194a.w();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void r(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void s(boolean z) {
        F(z ? 4 : 0, 4);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void t() {
        F(2, 2);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void u() {
        F(0, 8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void v(int i) {
        this.f107a.k(i);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void w(String str) {
        this.f107a.j(str);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void x(Drawable drawable) {
        this.f107a.s(drawable);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void y() {
        this.f107a.o(null);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void z(boolean z) {
    }
}
