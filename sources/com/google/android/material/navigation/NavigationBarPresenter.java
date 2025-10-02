package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

@RestrictTo
/* loaded from: classes6.dex */
public class NavigationBarPresenter implements MenuPresenter {
    public NavigationBarMenuView d;
    public boolean e;
    public int f;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;
        public ParcelableSparseArray e;

        /* renamed from: com.google.android.material.navigation.NavigationBarPresenter$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.d = parcel.readInt();
                savedState.e = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        SavedState savedState = new SavedState();
        savedState.d = this.d.getSelectedItemId();
        SparseArray<BadgeDrawable> badgeDrawables = this.d.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            BadgeDrawable badgeDrawableValueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.h.f14518a : null);
        }
        savedState.e = parcelableSparseArray;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean e(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        AutoTransition autoTransition;
        if (this.e) {
            return;
        }
        if (z) {
            this.d.b();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.d;
        MenuBuilder menuBuilder = navigationBarMenuView.H;
        if (menuBuilder == null || navigationBarMenuView.i == null) {
            return;
        }
        int size = menuBuilder.f.size();
        if (size != navigationBarMenuView.i.length) {
            navigationBarMenuView.b();
            return;
        }
        int i = navigationBarMenuView.j;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = navigationBarMenuView.H.getItem(i2);
            if (item.isChecked()) {
                navigationBarMenuView.j = item.getItemId();
                navigationBarMenuView.k = i2;
            }
        }
        if (i != navigationBarMenuView.j && (autoTransition = navigationBarMenuView.d) != null) {
            TransitionManager.a(navigationBarMenuView, autoTransition);
        }
        boolean zF = NavigationBarMenuView.f(navigationBarMenuView.h, navigationBarMenuView.H.m().size());
        for (int i3 = 0; i3 < size; i3++) {
            navigationBarMenuView.G.e = true;
            navigationBarMenuView.i[i3].setLabelVisibilityMode(navigationBarMenuView.h);
            navigationBarMenuView.i[i3].setShifting(zF);
            navigationBarMenuView.i[i3].c((MenuItemImpl) navigationBarMenuView.H.getItem(i3));
            navigationBarMenuView.G.e = false;
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final int getId() {
        return this.f;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void h(Context context, MenuBuilder menuBuilder) {
        this.d.H = menuBuilder;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean k(MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.d;
            SavedState savedState = (SavedState) parcelable;
            int i = savedState.d;
            int size = navigationBarMenuView.H.f.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = navigationBarMenuView.H.getItem(i2);
                if (i == item.getItemId()) {
                    navigationBarMenuView.j = i;
                    navigationBarMenuView.k = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.d.getContext();
            ParcelableSparseArray parcelableSparseArray = savedState.e;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(iKeyAt, state != null ? new BadgeDrawable(context, state) : null);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.d;
            SparseArray sparseArray2 = navigationBarMenuView2.v;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (BadgeDrawable) sparseArray.get(iKeyAt2));
                }
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.i;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray2.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        return false;
    }
}
