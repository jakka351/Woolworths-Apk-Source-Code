package androidx.appcompat.view.menu;

import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes2.dex */
public interface MenuView {

    public interface ItemView {
        void c(MenuItemImpl menuItemImpl);

        MenuItemImpl getItemData();
    }

    void a(MenuBuilder menuBuilder);
}
