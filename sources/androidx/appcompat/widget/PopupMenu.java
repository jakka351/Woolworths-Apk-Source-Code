package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class PopupMenu {

    /* renamed from: a, reason: collision with root package name */
    public final MenuBuilder f179a;
    public final View b;
    public final MenuPopupHelper c;
    public au.com.woolworths.shop.lists.ui.shoppinglist.main.d d;

    /* renamed from: androidx.appcompat.widget.PopupMenu$3, reason: invalid class name */
    class AnonymousClass3 extends ForwardingListener {
        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu c() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean d() {
            throw null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean e() {
            throw null;
        }
    }

    public interface OnDismissListener {
    }

    public interface OnMenuItemClickListener {
    }

    public PopupMenu(ContextThemeWrapper contextThemeWrapper, View view) {
        this.b = view;
        MenuBuilder menuBuilder = new MenuBuilder(contextThemeWrapper);
        this.f179a = menuBuilder;
        menuBuilder.e = new MenuBuilder.Callback() { // from class: androidx.appcompat.widget.PopupMenu.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public final boolean a(MenuBuilder menuBuilder2, MenuItem item) {
                au.com.woolworths.shop.lists.ui.shoppinglist.main.d dVar = PopupMenu.this.d;
                if (dVar == null) {
                    return false;
                }
                ShoppingListDetailsActivity shoppingListDetailsActivity = (ShoppingListDetailsActivity) dVar.e;
                ProductItemUiModel productItemUiModel = dVar.d;
                int i = ShoppingListDetailsActivity.R;
                Intrinsics.h(item, "item");
                int itemId = item.getItemId();
                if (itemId == R.id.copy) {
                    shoppingListDetailsActivity.R4().v(productItemUiModel);
                    return true;
                }
                if (itemId == R.id.copy_to_watchlist) {
                    shoppingListDetailsActivity.R4().w4(productItemUiModel);
                    return true;
                }
                if (itemId == R.id.delete) {
                    shoppingListDetailsActivity.R4().W0(productItemUiModel);
                    return true;
                }
                if (itemId != R.id.open_value_swaps) {
                    throw new IllegalArgumentException(YU.a.d(item.getItemId(), "Unexpected menu item ID: "));
                }
                shoppingListDetailsActivity.R4().n5(productItemUiModel);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public final void b(MenuBuilder menuBuilder2) {
            }
        };
        MenuPopupHelper menuPopupHelper = new MenuPopupHelper(0, R.style.PopupMenuOffset, contextThemeWrapper, view, menuBuilder, false);
        this.c = menuPopupHelper;
        menuPopupHelper.g = 8388613;
        menuPopupHelper.k = new PopupWindow.OnDismissListener() { // from class: androidx.appcompat.widget.PopupMenu.2
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                PopupMenu.this.getClass();
            }
        };
    }
}
