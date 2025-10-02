package androidx.appcompat.view.menu;

import YU.a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo
/* loaded from: classes2.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {
    public final MenuBuilder A;
    public final MenuItemImpl B;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.A = menuBuilder;
        this.B = menuItemImpl;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean e(MenuItemImpl menuItemImpl) {
        return this.A.e(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean f(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.f(menuBuilder, menuItem) || this.A.f(menuBuilder, menuItem);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean g(MenuItemImpl menuItemImpl) {
        return this.A.g(menuItemImpl);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final String k() {
        MenuItemImpl menuItemImpl = this.B;
        int i = menuItemImpl != null ? menuItemImpl.f135a : 0;
        if (i == 0) {
            return null;
        }
        return a.d(i, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final MenuBuilder l() {
        return this.A.l();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean n() {
        return this.A.n();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean o() {
        return this.A.o();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final boolean p() {
        return this.A.p();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.A.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        y(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        y(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        y(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.B.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.A.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final void x(MenuBuilder.Callback callback) {
        throw null;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        y(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        y(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.B.setIcon(i);
        return this;
    }
}
