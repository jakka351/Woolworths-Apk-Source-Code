package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class ListMenuPresenter implements MenuPresenter, AdapterView.OnItemClickListener {
    public Context d;
    public LayoutInflater e;
    public MenuBuilder f;
    public ExpandedMenuView g;
    public MenuPresenter.Callback h;
    public MenuAdapter i;

    public class MenuAdapter extends BaseAdapter {
        public int d = -1;

        public MenuAdapter() {
            a();
        }

        public final void a() {
            MenuBuilder menuBuilder = ListMenuPresenter.this.f;
            MenuItemImpl menuItemImpl = menuBuilder.w;
            if (menuItemImpl != null) {
                menuBuilder.j();
                ArrayList arrayList = menuBuilder.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((MenuItemImpl) arrayList.get(i)) == menuItemImpl) {
                        this.d = i;
                        return;
                    }
                }
            }
            this.d = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MenuItemImpl getItem(int i) {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuBuilder menuBuilder = listMenuPresenter.f;
            menuBuilder.j();
            ArrayList arrayList = menuBuilder.j;
            listMenuPresenter.getClass();
            int i2 = this.d;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return (MenuItemImpl) arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            ListMenuPresenter listMenuPresenter = ListMenuPresenter.this;
            MenuBuilder menuBuilder = listMenuPresenter.f;
            menuBuilder.j();
            int size = menuBuilder.j.size();
            listMenuPresenter.getClass();
            return this.d < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = ListMenuPresenter.this.e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((MenuView.ItemView) view).c(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public ListMenuPresenter(Context context) {
        this.d = context;
        this.e = LayoutInflater.from(context);
    }

    public final ListAdapter a() {
        if (this.i == null) {
            this.i = new MenuAdapter();
        }
        return this.i;
    }

    public final MenuView b(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (ExpandedMenuView) this.e.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.i == null) {
                this.i = new MenuAdapter();
            }
            this.g.setAdapter((ListAdapter) this.i);
            this.g.setOnItemClickListener(this);
        }
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
        MenuPresenter.Callback callback = this.h;
        if (callback != null) {
            callback.c(menuBuilder, z);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        if (this.g == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.g;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        MenuAdapter menuAdapter = this.i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(Context context, MenuBuilder menuBuilder) {
        if (this.d != null) {
            this.d = context;
            if (this.e == null) {
                this.e = LayoutInflater.from(context);
            }
        }
        this.f = menuBuilder;
        MenuAdapter menuAdapter = this.i;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void j(MenuPresenter.Callback callback) {
        this.h = callback;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean k(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.g.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        MenuDialogHelper menuDialogHelper = new MenuDialogHelper();
        menuDialogHelper.d = subMenuBuilder;
        AlertDialog.Builder builder = new AlertDialog.Builder(subMenuBuilder.f134a);
        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(builder.getContext());
        menuDialogHelper.f = listMenuPresenter;
        listMenuPresenter.h = menuDialogHelper;
        subMenuBuilder.b(listMenuPresenter);
        builder.setAdapter(menuDialogHelper.f.a(), menuDialogHelper);
        View view = subMenuBuilder.o;
        if (view != null) {
            builder.setCustomTitle(view);
        } else {
            builder.setIcon(subMenuBuilder.n).setTitle(subMenuBuilder.m);
        }
        builder.setOnKeyListener(menuDialogHelper);
        AlertDialog alertDialogCreate = builder.create();
        menuDialogHelper.e = alertDialogCreate;
        alertDialogCreate.setOnDismissListener(menuDialogHelper);
        WindowManager.LayoutParams attributes = menuDialogHelper.e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        menuDialogHelper.e.show();
        MenuPresenter.Callback callback = this.h;
        if (callback == null) {
            return true;
        }
        callback.d(subMenuBuilder);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Callback.j(view);
        try {
            this.f.r(this.i.getItem(i), this, 0);
        } finally {
            Callback.k();
        }
    }
}
