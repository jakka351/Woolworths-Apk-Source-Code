package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public abstract class BaseMenuPresenter implements MenuPresenter {
    public Context d;
    public Context e;
    public MenuBuilder f;
    public LayoutInflater g;
    public MenuPresenter.Callback h;
    public int i;
    public int j;
    public MenuView k;
    public int l;

    public abstract void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView);

    public boolean b(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void c(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.h;
        if (callback != null) {
            callback.c(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void f(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.k;
        if (viewGroup == null) {
            return;
        }
        MenuBuilder menuBuilder = this.f;
        int i = 0;
        if (menuBuilder != null) {
            menuBuilder.j();
            ArrayList arrayListM = this.f.m();
            int size = arrayListM.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListM.get(i3);
                if (n(menuItemImpl)) {
                    View childAt = viewGroup.getChildAt(i2);
                    MenuItemImpl itemData = childAt instanceof MenuView.ItemView ? ((MenuView.ItemView) childAt).getItemData() : null;
                    View viewI = i(menuItemImpl, childAt, viewGroup);
                    if (menuItemImpl != itemData) {
                        viewI.setPressed(false);
                        viewI.jumpDrawablesToCurrentState();
                    }
                    if (viewI != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) viewI.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(viewI);
                        }
                        ((ViewGroup) this.k).addView(viewI, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!b(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.l;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void h(Context context, MenuBuilder menuBuilder) {
        this.e = context;
        LayoutInflater.from(context);
        this.f = menuBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View i(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        MenuView.ItemView itemView = view instanceof MenuView.ItemView ? (MenuView.ItemView) view : (MenuView.ItemView) this.g.inflate(this.j, viewGroup, false);
        a(menuItemImpl, itemView);
        return (View) itemView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean k(MenuItemImpl menuItemImpl) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.MenuBuilder] */
    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean m(SubMenuBuilder subMenuBuilder) {
        MenuPresenter.Callback callback = this.h;
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        if (callback == null) {
            return false;
        }
        if (subMenuBuilder == null) {
            subMenuBuilder2 = this.f;
        }
        return callback.d(subMenuBuilder2);
    }

    public boolean n(MenuItemImpl menuItemImpl) {
        return true;
    }
}
