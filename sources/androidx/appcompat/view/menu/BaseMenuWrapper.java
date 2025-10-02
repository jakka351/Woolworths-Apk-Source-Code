package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* loaded from: classes2.dex */
abstract class BaseMenuWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final Context f132a;
    public SimpleArrayMap b;
    public SimpleArrayMap c;

    public BaseMenuWrapper(Context context) {
        this.f132a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.b == null) {
            this.b = new SimpleArrayMap(0);
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f132a, supportMenuItem);
        this.b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.c == null) {
            this.c = new SimpleArrayMap(0);
        }
        SubMenu subMenu2 = (SubMenu) this.c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f132a, supportSubMenu);
        this.c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
