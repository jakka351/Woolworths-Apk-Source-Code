package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo
/* loaded from: classes2.dex */
public interface MenuItemHoverListener {
    void h(MenuBuilder menuBuilder, MenuItem menuItem);

    void k(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl);
}
