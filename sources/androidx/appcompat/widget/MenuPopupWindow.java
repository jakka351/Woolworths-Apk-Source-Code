package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes2.dex */
public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    public static final Method G;
    public MenuItemHoverListener F;

    @RequiresApi
    public static class Api23Impl {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    @RestrictTo
    public static class MenuDropDownListView extends DropDownListView {
        public final int p;
        public final int q;
        public MenuItemHoverListener r;
        public MenuItemImpl s;

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.p = 21;
                this.q = 22;
            } else {
                this.p = 22;
                this.q = 21;
            }
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.view.View
        public final boolean onHoverEvent(MotionEvent motionEvent) {
            MenuAdapter menuAdapter;
            int headersCount;
            int iPointToPosition;
            int i;
            if (this.r != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                } else {
                    menuAdapter = (MenuAdapter) adapter;
                    headersCount = 0;
                }
                MenuItemImpl item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i);
                MenuItemImpl menuItemImpl = this.s;
                if (menuItemImpl != item) {
                    MenuBuilder menuBuilder = menuAdapter.d;
                    if (menuItemImpl != null) {
                        this.r.h(menuBuilder, menuItemImpl);
                    }
                    this.s = item;
                    if (item != null) {
                        this.r.k(menuBuilder, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.p) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i != this.q) {
                return super.onKeyDown(i, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter) adapter).d.d(false);
            return true;
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.r = menuItemHoverListener;
        }

        @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                G = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void h(MenuBuilder menuBuilder, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.F;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.h(menuBuilder, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.MenuItemHoverListener
    public final void k(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        MenuItemHoverListener menuItemHoverListener = this.F;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.k(menuBuilder, menuItemImpl);
        }
    }

    @Override // androidx.appcompat.widget.ListPopupWindow
    public final DropDownListView q(Context context, boolean z) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    public final void s() {
        Api23Impl.a(this.C, null);
    }

    public final void t() {
        Api23Impl.b(this.C, null);
    }

    public final void u() {
        int i = Build.VERSION.SDK_INT;
        PopupWindow popupWindow = this.C;
        if (i > 28) {
            Api29Impl.a(popupWindow, false);
            return;
        }
        Method method = G;
        if (method != null) {
            try {
                method.invoke(popupWindow, Boolean.FALSE);
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
