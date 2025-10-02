package com.google.android.material.navigation;

import YU.a;
import android.content.Context;
import android.view.SubMenu;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.camera.core.impl.b;

@RestrictTo
/* loaded from: classes6.dex */
public final class NavigationBarMenu extends MenuBuilder {
    public final Class A;
    public final int B;

    public NavigationBarMenu(Context context, Class cls, int i) {
        super(context);
        this.A = cls;
        this.B = i;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder
    public final MenuItemImpl a(int i, int i2, int i3, CharSequence charSequence) {
        int size = this.f.size() + 1;
        int i4 = this.B;
        if (size > i4) {
            String simpleName = this.A.getSimpleName();
            throw new IllegalArgumentException(a.o(b.u("Maximum number of items supported by ", i4, simpleName, " is ", ". Limit can be checked with "), simpleName, "#getMaxItemCount()"));
        }
        B();
        MenuItemImpl menuItemImplA = super.a(i, i2, i3, charSequence);
        menuItemImplA.f(true);
        A();
        return menuItemImplA;
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.A.getSimpleName().concat(" does not support submenus"));
    }
}
