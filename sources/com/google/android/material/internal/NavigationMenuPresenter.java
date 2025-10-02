package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public class NavigationMenuPresenter implements MenuPresenter {
    public int B;
    public int C;
    public int D;
    public NavigationMenuView d;
    public LinearLayout e;
    public MenuBuilder f;
    public int g;
    public NavigationMenuAdapter h;
    public LayoutInflater i;
    public ColorStateList k;
    public ColorStateList n;
    public ColorStateList o;
    public Drawable p;
    public RippleDrawable q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public boolean z;
    public int j = 0;
    public int l = 0;
    public boolean m = true;
    public boolean A = true;
    public int E = -1;
    public final View.OnClickListener F = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            Callback.g(view);
            try {
                boolean z = true;
                navigationMenuPresenter.n(true);
                MenuItemImpl itemData = ((NavigationMenuItemView) view).getItemData();
                boolean zR = navigationMenuPresenter.f.r(itemData, navigationMenuPresenter, 0);
                if (itemData != null && itemData.isCheckable() && zR) {
                    navigationMenuPresenter.h.H(itemData);
                } else {
                    z = false;
                }
                navigationMenuPresenter.n(false);
                if (z) {
                    navigationMenuPresenter.f(false);
                }
                Callback.h();
            } catch (Throwable th) {
                Callback.h();
                throw th;
            }
        }
    };

    public static class HeaderViewHolder extends ViewHolder {
    }

    public class NavigationMenuAdapter extends RecyclerView.Adapter<ViewHolder> {
        public final ArrayList g = new ArrayList();
        public MenuItemImpl h;
        public boolean i;

        public NavigationMenuAdapter() {
            G();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void C(RecyclerView.ViewHolder viewHolder) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            if (viewHolder2 instanceof NormalViewHolder) {
                NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder2.itemView;
                FrameLayout frameLayout = navigationMenuItemView.D;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                navigationMenuItemView.C.setCompoundDrawables(null, null, null, null);
            }
        }

        public final void G() {
            boolean z;
            if (this.i) {
                return;
            }
            this.i = true;
            ArrayList arrayList = this.g;
            arrayList.clear();
            arrayList.add(new NavigationMenuHeaderItem());
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int size = navigationMenuPresenter.f.m().size();
            boolean z2 = false;
            int i = -1;
            int i2 = 0;
            boolean z3 = false;
            int size2 = 0;
            while (i2 < size) {
                MenuItemImpl menuItemImpl = (MenuItemImpl) navigationMenuPresenter.f.m().get(i2);
                if (menuItemImpl.isChecked()) {
                    H(menuItemImpl);
                }
                if (menuItemImpl.isCheckable()) {
                    menuItemImpl.f(z2);
                }
                if (menuItemImpl.hasSubMenu()) {
                    SubMenuBuilder subMenuBuilder = menuItemImpl.o;
                    if (subMenuBuilder.hasVisibleItems()) {
                        if (i2 != 0) {
                            arrayList.add(new NavigationMenuSeparatorItem(navigationMenuPresenter.D, z2 ? 1 : 0));
                        }
                        arrayList.add(new NavigationMenuTextItem(menuItemImpl));
                        int size3 = subMenuBuilder.size();
                        int i3 = z2 ? 1 : 0;
                        int i4 = i3;
                        while (i3 < size3) {
                            MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenuBuilder.getItem(i3);
                            if (menuItemImpl2.isVisible()) {
                                if (i4 == 0 && menuItemImpl2.getIcon() != null) {
                                    i4 = 1;
                                }
                                if (menuItemImpl2.isCheckable()) {
                                    menuItemImpl2.f(z2);
                                }
                                if (menuItemImpl.isChecked()) {
                                    H(menuItemImpl);
                                }
                                arrayList.add(new NavigationMenuTextItem(menuItemImpl2));
                            }
                            i3++;
                            z2 = false;
                        }
                        if (i4 != 0) {
                            int size4 = arrayList.size();
                            for (int size5 = arrayList.size(); size5 < size4; size5++) {
                                ((NavigationMenuTextItem) arrayList.get(size5)).b = true;
                            }
                        }
                    }
                    z = true;
                } else {
                    int i5 = menuItemImpl.b;
                    if (i5 != i) {
                        size2 = arrayList.size();
                        z3 = menuItemImpl.getIcon() != null;
                        if (i2 != 0) {
                            size2++;
                            int i6 = navigationMenuPresenter.D;
                            arrayList.add(new NavigationMenuSeparatorItem(i6, i6));
                        }
                    } else {
                        if (!z3 && menuItemImpl.getIcon() != null) {
                            int size6 = arrayList.size();
                            for (int i7 = size2; i7 < size6; i7++) {
                                ((NavigationMenuTextItem) arrayList.get(i7)).b = true;
                            }
                            z = true;
                            z3 = true;
                        }
                        NavigationMenuTextItem navigationMenuTextItem = new NavigationMenuTextItem(menuItemImpl);
                        navigationMenuTextItem.b = z3;
                        arrayList.add(navigationMenuTextItem);
                        i = i5;
                    }
                    z = true;
                    NavigationMenuTextItem navigationMenuTextItem2 = new NavigationMenuTextItem(menuItemImpl);
                    navigationMenuTextItem2.b = z3;
                    arrayList.add(navigationMenuTextItem2);
                    i = i5;
                }
                i2++;
                z2 = false;
            }
            this.i = z2 ? 1 : 0;
        }

        public final void H(MenuItemImpl menuItemImpl) {
            if (this.h == menuItemImpl || !menuItemImpl.isCheckable()) {
                return;
            }
            MenuItemImpl menuItemImpl2 = this.h;
            if (menuItemImpl2 != null) {
                menuItemImpl2.setChecked(false);
            }
            this.h = menuItemImpl;
            menuItemImpl.setChecked(true);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int i() {
            return this.g.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final long j(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int k(int i) {
            NavigationMenuItem navigationMenuItem = (NavigationMenuItem) this.g.get(i);
            if (navigationMenuItem instanceof NavigationMenuSeparatorItem) {
                return 2;
            }
            if (navigationMenuItem instanceof NavigationMenuHeaderItem) {
                return 3;
            }
            if (navigationMenuItem instanceof NavigationMenuTextItem) {
                return ((NavigationMenuTextItem) navigationMenuItem).f14598a.hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void v(RecyclerView.ViewHolder viewHolder, final int i) {
            ViewHolder viewHolder2 = (ViewHolder) viewHolder;
            int iK = k(i);
            ArrayList arrayList = this.g;
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (iK != 0) {
                final boolean z = true;
                if (iK != 1) {
                    if (iK != 2) {
                        return;
                    }
                    NavigationMenuSeparatorItem navigationMenuSeparatorItem = (NavigationMenuSeparatorItem) arrayList.get(i);
                    viewHolder2.itemView.setPadding(navigationMenuPresenter.v, navigationMenuSeparatorItem.f14597a, navigationMenuPresenter.w, navigationMenuSeparatorItem.b);
                    return;
                }
                TextView textView = (TextView) viewHolder2.itemView;
                textView.setText(((NavigationMenuTextItem) arrayList.get(i)).f14598a.e);
                textView.setTextAppearance(navigationMenuPresenter.j);
                textView.setPadding(navigationMenuPresenter.x, textView.getPaddingTop(), navigationMenuPresenter.y, textView.getPaddingBottom());
                ColorStateList colorStateList = navigationMenuPresenter.k;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                }
                ViewCompat.A(textView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                    @Override // androidx.core.view.AccessibilityDelegateCompat
                    public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
                        NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                        int i2 = i;
                        int i3 = i2;
                        for (int i4 = 0; i4 < i2; i4++) {
                            if (navigationMenuPresenter2.h.k(i4) == 2 || navigationMenuPresenter2.h.k(i4) == 3) {
                                i3--;
                            }
                        }
                        accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(i3, 1, 1, 1, z, view.isSelected()));
                    }
                });
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) viewHolder2.itemView;
            navigationMenuItemView.setIconTintList(navigationMenuPresenter.o);
            navigationMenuItemView.setTextAppearance(navigationMenuPresenter.l);
            ColorStateList colorStateList2 = navigationMenuPresenter.n;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = navigationMenuPresenter.p;
            Drawable drawableNewDrawable = drawable != null ? drawable.getConstantState().newDrawable() : null;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            navigationMenuItemView.setBackground(drawableNewDrawable);
            RippleDrawable rippleDrawable = navigationMenuPresenter.q;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            NavigationMenuTextItem navigationMenuTextItem = (NavigationMenuTextItem) arrayList.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(navigationMenuTextItem.b);
            int i2 = navigationMenuPresenter.r;
            int i3 = navigationMenuPresenter.s;
            navigationMenuItemView.setPadding(i2, i3, i2, i3);
            navigationMenuItemView.setIconPadding(navigationMenuPresenter.t);
            if (navigationMenuPresenter.z) {
                navigationMenuItemView.setIconSize(navigationMenuPresenter.u);
            }
            navigationMenuItemView.setMaxLines(navigationMenuPresenter.B);
            MenuItemImpl menuItemImpl = navigationMenuTextItem.f14598a;
            navigationMenuItemView.B = navigationMenuPresenter.m;
            navigationMenuItemView.c(menuItemImpl);
            final boolean z2 = false;
            ViewCompat.A(navigationMenuItemView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.internal.NavigationMenuPresenter.NavigationMenuAdapter.1
                @Override // androidx.core.view.AccessibilityDelegateCompat
                public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    this.f2466a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f2508a);
                    NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
                    int i22 = i;
                    int i32 = i22;
                    for (int i4 = 0; i4 < i22; i4++) {
                        if (navigationMenuPresenter2.h.k(i4) == 2 || navigationMenuPresenter2.h.k(i4) == 3) {
                            i32--;
                        }
                    }
                    accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(i32, 1, 1, 1, z2, view.isSelected()));
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            if (i == 0) {
                LayoutInflater layoutInflater = navigationMenuPresenter.i;
                View.OnClickListener onClickListener = navigationMenuPresenter.F;
                NormalViewHolder normalViewHolder = new NormalViewHolder(layoutInflater.inflate(R.layout.design_navigation_item, viewGroup, false));
                normalViewHolder.itemView.setOnClickListener(onClickListener);
                return normalViewHolder;
            }
            if (i == 1) {
                return new SubheaderViewHolder(navigationMenuPresenter.i.inflate(R.layout.design_navigation_item_subheader, viewGroup, false));
            }
            if (i == 2) {
                return new SeparatorViewHolder(navigationMenuPresenter.i.inflate(R.layout.design_navigation_item_separator, viewGroup, false));
            }
            if (i != 3) {
                return null;
            }
            return new HeaderViewHolder(navigationMenuPresenter.e);
        }
    }

    public static class NavigationMenuHeaderItem implements NavigationMenuItem {
    }

    public interface NavigationMenuItem {
    }

    public static class NavigationMenuSeparatorItem implements NavigationMenuItem {

        /* renamed from: a, reason: collision with root package name */
        public final int f14597a;
        public final int b;

        public NavigationMenuSeparatorItem(int i, int i2) {
            this.f14597a = i;
            this.b = i2;
        }
    }

    public static class NavigationMenuTextItem implements NavigationMenuItem {

        /* renamed from: a, reason: collision with root package name */
        public final MenuItemImpl f14598a;
        public boolean b;

        public NavigationMenuTextItem(MenuItemImpl menuItemImpl) {
            this.f14598a = menuItemImpl;
        }
    }

    public class NavigationMenuViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {
        public NavigationMenuViewAccessibilityDelegate(RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
        public final void d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.d(view, accessibilityNodeInfoCompat);
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            int i = 0;
            for (int i2 = 0; i2 < navigationMenuPresenter.h.g.size(); i2++) {
                int iK = navigationMenuPresenter.h.k(i2);
                if (iK == 0 || iK == 1) {
                    i++;
                }
            }
            accessibilityNodeInfoCompat.n(new AccessibilityNodeInfoCompat.CollectionInfoCompat(AccessibilityNodeInfo.CollectionInfo.obtain(i, 1, false)));
        }
    }

    public static class NormalViewHolder extends ViewHolder {
    }

    public static class SeparatorViewHolder extends ViewHolder {
    }

    public static class SubheaderViewHolder extends ViewHolder {
    }

    public static abstract class ViewHolder extends RecyclerView.ViewHolder {
    }

    public final MenuItemImpl a() {
        return this.h.h;
    }

    public final MenuView b(ViewGroup viewGroup) {
        if (this.d == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.i.inflate(R.layout.design_navigation_menu, viewGroup, false);
            this.d = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new NavigationMenuViewAccessibilityDelegate(this.d));
            if (this.h == null) {
                NavigationMenuAdapter navigationMenuAdapter = new NavigationMenuAdapter();
                this.h = navigationMenuAdapter;
                navigationMenuAdapter.E(true);
            }
            int i = this.E;
            if (i != -1) {
                this.d.setOverScrollMode(i);
            }
            LinearLayout linearLayout = (LinearLayout) this.i.inflate(R.layout.design_navigation_item_header, (ViewGroup) this.d, false);
            this.e = linearLayout;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            linearLayout.setImportantForAccessibility(2);
            this.d.setAdapter(this.h);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        Bundle bundle = new Bundle();
        if (this.d != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.d.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        NavigationMenuAdapter navigationMenuAdapter = this.h;
        if (navigationMenuAdapter != null) {
            ArrayList arrayList = navigationMenuAdapter.g;
            Bundle bundle2 = new Bundle();
            MenuItemImpl menuItemImpl = navigationMenuAdapter.h;
            if (menuItemImpl != null) {
                bundle2.putInt("android:menu:checked", menuItemImpl.f135a);
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                NavigationMenuItem navigationMenuItem = (NavigationMenuItem) arrayList.get(i);
                if (navigationMenuItem instanceof NavigationMenuTextItem) {
                    MenuItemImpl menuItemImpl2 = ((NavigationMenuTextItem) navigationMenuItem).f14598a;
                    View actionView = menuItemImpl2 != null ? menuItemImpl2.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray2.put(menuItemImpl2.f135a, parcelableSparseArray);
                    }
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.e != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.e.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.h;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.G();
            navigationMenuAdapter.l();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(Context context, MenuBuilder menuBuilder) {
        this.i = LayoutInflater.from(context);
        this.f = menuBuilder;
        this.D = context.getResources().getDimensionPixelOffset(R.dimen.design_navigation_separator_vertical_padding);
    }

    public final void i(MenuItemImpl menuItemImpl) {
        this.h.H(menuItemImpl);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean k(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.d.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                NavigationMenuAdapter navigationMenuAdapter = this.h;
                ArrayList arrayList = navigationMenuAdapter.g;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    navigationMenuAdapter.i = true;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        NavigationMenuItem navigationMenuItem = (NavigationMenuItem) arrayList.get(i2);
                        if (navigationMenuItem instanceof NavigationMenuTextItem) {
                            MenuItemImpl menuItemImpl2 = ((NavigationMenuTextItem) navigationMenuItem).f14598a;
                            if (menuItemImpl2.f135a == i) {
                                navigationMenuAdapter.H(menuItemImpl2);
                                break;
                            }
                        }
                        i2++;
                    }
                    navigationMenuAdapter.i = false;
                    navigationMenuAdapter.G();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        NavigationMenuItem navigationMenuItem2 = (NavigationMenuItem) arrayList.get(i3);
                        if ((navigationMenuItem2 instanceof NavigationMenuTextItem) && (actionView = (menuItemImpl = ((NavigationMenuTextItem) navigationMenuItem2).f14598a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(menuItemImpl.f135a)) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.e.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public final void n(boolean z) {
        NavigationMenuAdapter navigationMenuAdapter = this.h;
        if (navigationMenuAdapter != null) {
            navigationMenuAdapter.i = z;
        }
    }
}
