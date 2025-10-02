package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuView;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class MenuAdapter extends BaseAdapter {
    public final MenuBuilder d;
    public int e = -1;
    public boolean f;
    public final boolean g;
    public final LayoutInflater h;
    public final int i;

    public MenuAdapter(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.g = z;
        this.h = layoutInflater;
        this.d = menuBuilder;
        this.i = i;
        a();
    }

    public final void a() {
        MenuBuilder menuBuilder = this.d;
        MenuItemImpl menuItemImpl = menuBuilder.w;
        if (menuItemImpl != null) {
            menuBuilder.j();
            ArrayList arrayList = menuBuilder.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((MenuItemImpl) arrayList.get(i)) == menuItemImpl) {
                    this.e = i;
                    return;
                }
            }
        }
        this.e = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final MenuItemImpl getItem(int i) {
        ArrayList arrayListM;
        boolean z = this.g;
        MenuBuilder menuBuilder = this.d;
        if (z) {
            menuBuilder.j();
            arrayListM = menuBuilder.j;
        } else {
            arrayListM = menuBuilder.m();
        }
        int i2 = this.e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (MenuItemImpl) arrayListM.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListM;
        boolean z = this.g;
        MenuBuilder menuBuilder = this.d;
        if (z) {
            menuBuilder.j();
            arrayListM = menuBuilder.j;
        } else {
            arrayListM = menuBuilder.m();
        }
        return this.e < 0 ? arrayListM.size() : arrayListM.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.h.inflate(this.i, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.d.n() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        MenuView.ItemView itemView = (MenuView.ItemView) view;
        if (this.f) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
