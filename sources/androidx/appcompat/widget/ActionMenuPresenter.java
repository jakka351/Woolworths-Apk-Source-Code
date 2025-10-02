package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopup;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.ActionProvider;
import com.woolworths.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    public final PopupPresenterCallback A;
    public int B;
    public OverflowMenuButton m;
    public Drawable n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public final SparseBooleanArray v;
    public OverflowPopup w;
    public ActionButtonSubmenu x;
    public OpenOverflowRunnable y;
    public ActionMenuPopupCallback z;

    public class ActionButtonSubmenu extends MenuPopupHelper {
        public ActionButtonSubmenu(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, subMenuBuilder, false);
            if ((subMenuBuilder.B.x & 32) != 32) {
                View view2 = ActionMenuPresenter.this.m;
                this.f = view2 == null ? (View) ActionMenuPresenter.this.k : view2;
            }
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.A;
            this.i = popupPresenterCallback;
            MenuPopup menuPopup = this.j;
            if (menuPopup != null) {
                menuPopup.j(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.x = null;
            actionMenuPresenter.B = 0;
            super.c();
        }
    }

    public class ActionMenuPopupCallback extends ActionMenuItemView.PopupCallback {
        public ActionMenuPopupCallback() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public final ShowableListMenu a() {
            ActionButtonSubmenu actionButtonSubmenu = ActionMenuPresenter.this.x;
            if (actionButtonSubmenu != null) {
                return actionButtonSubmenu.a();
            }
            return null;
        }
    }

    public class OpenOverflowRunnable implements Runnable {
        public final OverflowPopup d;

        public OpenOverflowRunnable(OverflowPopup overflowPopup) {
            this.d = overflowPopup;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MenuBuilder.Callback callback;
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.f;
            if (menuBuilder != null && (callback = menuBuilder.e) != null) {
                callback.b(menuBuilder);
            }
            View view = (View) actionMenuPresenter.k;
            if (view != null && view.getWindowToken() != null) {
                OverflowPopup overflowPopup = this.d;
                if (overflowPopup.b()) {
                    actionMenuPresenter.w = overflowPopup;
                } else if (overflowPopup.f != null) {
                    overflowPopup.e(0, 0, false, false);
                    actionMenuPresenter.w = overflowPopup;
                }
            }
            actionMenuPresenter.y = null;
        }
    }

    public class OverflowMenuButton extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {
        public OverflowMenuButton(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.Api26Impl.a(this, getContentDescription());
            setOnTouchListener(new ForwardingListener(this) { // from class: androidx.appcompat.widget.ActionMenuPresenter.OverflowMenuButton.1
                @Override // androidx.appcompat.widget.ForwardingListener
                public final ShowableListMenu c() {
                    OverflowPopup overflowPopup = ActionMenuPresenter.this.w;
                    if (overflowPopup == null) {
                        return null;
                    }
                    return overflowPopup.a();
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean d() {
                    ActionMenuPresenter.this.r();
                    return true;
                }

                @Override // androidx.appcompat.widget.ForwardingListener
                public final boolean e() {
                    ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                    if (actionMenuPresenter.y != null) {
                        return false;
                    }
                    actionMenuPresenter.o();
                    return true;
                }
            });
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.r();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class OverflowPopup extends MenuPopupHelper {
        public OverflowPopup(Context context, MenuBuilder menuBuilder, View view) {
            super(R.attr.actionOverflowMenuStyle, 0, context, view, menuBuilder, true);
            this.g = 8388613;
            PopupPresenterCallback popupPresenterCallback = ActionMenuPresenter.this.A;
            this.i = popupPresenterCallback;
            MenuPopup menuPopup = this.j;
            if (menuPopup != null) {
                menuPopup.j(popupPresenterCallback);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void c() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            MenuBuilder menuBuilder = actionMenuPresenter.f;
            if (menuBuilder != null) {
                menuBuilder.d(true);
            }
            actionMenuPresenter.w = null;
            super.c();
        }
    }

    public class PopupPresenterCallback implements MenuPresenter.Callback {
        public PopupPresenterCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void c(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof SubMenuBuilder) {
                ((SubMenuBuilder) menuBuilder).A.l().d(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.h;
            if (callback != null) {
                callback.c(menuBuilder, z);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean d(MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == actionMenuPresenter.f) {
                return false;
            }
            actionMenuPresenter.B = ((SubMenuBuilder) menuBuilder).B.f135a;
            MenuPresenter.Callback callback = actionMenuPresenter.h;
            if (callback != null) {
                return callback.d(menuBuilder);
            }
            return false;
        }
    }

    @SuppressLint
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public int d;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.d = parcel.readInt();
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
        }
    }

    public ActionMenuPresenter(Context context) {
        this.d = context;
        this.g = LayoutInflater.from(context);
        this.i = R.layout.abc_action_menu_layout;
        this.j = R.layout.abc_action_menu_item_layout;
        this.v = new SparseBooleanArray();
        this.A = new PopupPresenterCallback();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void a(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.c(menuItemImpl);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.k);
        if (this.z == null) {
            this.z = new ActionMenuPopupCallback();
        }
        actionMenuItemView.setPopupCallback(this.z);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean b(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.m) {
            return false;
        }
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void c(MenuBuilder menuBuilder, boolean z) {
        o();
        ActionButtonSubmenu actionButtonSubmenu = this.x;
        if (actionButtonSubmenu != null && actionButtonSubmenu.b()) {
            actionButtonSubmenu.j.dismiss();
        }
        super.c(menuBuilder, z);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable d() {
        SavedState savedState = new SavedState();
        savedState.d = this.B;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void f(boolean z) {
        ArrayList arrayList;
        super.f(z);
        ((View) this.k).requestLayout();
        MenuBuilder menuBuilder = this.f;
        boolean z2 = false;
        if (menuBuilder != null) {
            menuBuilder.j();
            ArrayList arrayList2 = menuBuilder.i;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ActionProvider actionProvider = ((MenuItemImpl) arrayList2.get(i)).A;
                if (actionProvider != null) {
                    actionProvider.f2468a = this;
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f;
        if (menuBuilder2 != null) {
            menuBuilder2.j();
            arrayList = menuBuilder2.j;
        } else {
            arrayList = null;
        }
        if (this.p && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !((MenuItemImpl) arrayList.get(0)).C;
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.m == null) {
                this.m = new OverflowMenuButton(this.d);
            }
            ViewGroup viewGroup = (ViewGroup) this.m.getParent();
            if (viewGroup != this.k) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.m);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.k;
                OverflowMenuButton overflowMenuButton = this.m;
                actionMenuView.getClass();
                ActionMenuView.LayoutParams layoutParamsJ = ActionMenuView.j();
                layoutParamsJ.f142a = true;
                actionMenuView.addView(overflowMenuButton, layoutParamsJ);
            }
        } else {
            OverflowMenuButton overflowMenuButton2 = this.m;
            if (overflowMenuButton2 != null) {
                Object parent = overflowMenuButton2.getParent();
                Object obj = this.k;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.m);
                }
            }
        }
        ((ActionMenuView) this.k).setOverflowReserved(this.p);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean g() {
        int size;
        ArrayList arrayListM;
        int i;
        boolean z;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.f;
        if (menuBuilder != null) {
            arrayListM = menuBuilder.m();
            size = arrayListM.size();
        } else {
            size = 0;
            arrayListM = null;
        }
        int i2 = actionMenuPresenter.t;
        int i3 = actionMenuPresenter.s;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.k;
        int i4 = 0;
        boolean z2 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            i = 2;
            z = true;
            if (i4 >= size) {
                break;
            }
            MenuItemImpl menuItemImpl = (MenuItemImpl) arrayListM.get(i4);
            int i7 = menuItemImpl.y;
            if ((i7 & 2) == 2) {
                i5++;
            } else if ((i7 & 1) == 1) {
                i6++;
            } else {
                z2 = true;
            }
            if (actionMenuPresenter.u && menuItemImpl.C) {
                i2 = 0;
            }
            i4++;
        }
        if (actionMenuPresenter.p && (z2 || i6 + i5 > i2)) {
            i2--;
        }
        int i8 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.v;
        sparseBooleanArray.clear();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            MenuItemImpl menuItemImpl2 = (MenuItemImpl) arrayListM.get(i9);
            int i11 = menuItemImpl2.y;
            boolean z3 = (i11 & 2) == i ? z : false;
            int i12 = menuItemImpl2.b;
            if (z3) {
                View viewI = actionMenuPresenter.i(menuItemImpl2, null, viewGroup);
                viewI.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewI.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i10 == 0) {
                    i10 = measuredWidth;
                }
                if (i12 != 0) {
                    sparseBooleanArray.put(i12, z);
                }
                menuItemImpl2.g(z);
            } else if ((i11 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i12);
                boolean z5 = ((i8 > 0 || z4) && i3 > 0) ? z : false;
                if (z5) {
                    View viewI2 = actionMenuPresenter.i(menuItemImpl2, null, viewGroup);
                    viewI2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewI2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i10 == 0) {
                        i10 = measuredWidth2;
                    }
                    z5 &= i3 + i10 > 0;
                }
                if (z5 && i12 != 0) {
                    sparseBooleanArray.put(i12, true);
                } else if (z4) {
                    sparseBooleanArray.put(i12, false);
                    for (int i13 = 0; i13 < i9; i13++) {
                        MenuItemImpl menuItemImpl3 = (MenuItemImpl) arrayListM.get(i13);
                        if (menuItemImpl3.b == i12) {
                            if ((menuItemImpl3.x & 32) == 32) {
                                i8++;
                            }
                            menuItemImpl3.g(false);
                        }
                    }
                }
                if (z5) {
                    i8--;
                }
                menuItemImpl2.g(z5);
            } else {
                menuItemImpl2.g(false);
                i9++;
                i = 2;
                actionMenuPresenter = this;
                z = true;
            }
            i9++;
            i = 2;
            actionMenuPresenter = this;
            z = true;
        }
        return z;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void h(Context context, MenuBuilder menuBuilder) {
        super.h(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicyA = ActionBarPolicy.a(context);
        if (!this.q) {
            this.p = true;
        }
        this.r = actionBarPolicyA.f123a.getResources().getDisplayMetrics().widthPixels / 2;
        this.t = actionBarPolicyA.b();
        int measuredWidth = this.r;
        if (this.p) {
            if (this.m == null) {
                OverflowMenuButton overflowMenuButton = new OverflowMenuButton(this.d);
                this.m = overflowMenuButton;
                if (this.o) {
                    overflowMenuButton.setImageDrawable(this.n);
                    this.n = null;
                    this.o = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.m.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.m.getMeasuredWidth();
        } else {
            this.m = null;
        }
        this.s = measuredWidth;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View i(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.e()) {
            actionView = super.i(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof ActionMenuView.LayoutParams)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void l(Parcelable parcelable) {
        int i;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).d) > 0 && (menuItemFindItem = this.f.findItem(i)) != null) {
            m((SubMenuBuilder) menuItemFindItem.getSubMenu());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean m(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (true) {
                MenuBuilder menuBuilder = subMenuBuilder2.A;
                if (menuBuilder == this.f) {
                    break;
                }
                subMenuBuilder2 = (SubMenuBuilder) menuBuilder;
            }
            MenuItemImpl menuItemImpl = subMenuBuilder2.B;
            ViewGroup viewGroup = (ViewGroup) this.k;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == menuItemImpl) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.B = subMenuBuilder.B.f135a;
                int size = subMenuBuilder.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = subMenuBuilder.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                ActionButtonSubmenu actionButtonSubmenu = new ActionButtonSubmenu(this.e, subMenuBuilder, view);
                this.x = actionButtonSubmenu;
                actionButtonSubmenu.d(z);
                ActionButtonSubmenu actionButtonSubmenu2 = this.x;
                if (!actionButtonSubmenu2.b()) {
                    if (actionButtonSubmenu2.f == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    actionButtonSubmenu2.e(0, 0, false, false);
                }
                super.m(subMenuBuilder);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean n(MenuItemImpl menuItemImpl) {
        return (menuItemImpl.x & 32) == 32;
    }

    public final boolean o() {
        Object obj;
        OpenOverflowRunnable openOverflowRunnable = this.y;
        if (openOverflowRunnable != null && (obj = this.k) != null) {
            ((View) obj).removeCallbacks(openOverflowRunnable);
            this.y = null;
            return true;
        }
        OverflowPopup overflowPopup = this.w;
        if (overflowPopup == null) {
            return false;
        }
        if (overflowPopup.b()) {
            overflowPopup.j.dismiss();
        }
        return true;
    }

    public final boolean p() {
        OverflowPopup overflowPopup = this.w;
        return overflowPopup != null && overflowPopup.b();
    }

    public final void q(boolean z) {
        if (z) {
            super.m(null);
            return;
        }
        MenuBuilder menuBuilder = this.f;
        if (menuBuilder != null) {
            menuBuilder.d(false);
        }
    }

    public final boolean r() {
        MenuBuilder menuBuilder;
        if (!this.p || p() || (menuBuilder = this.f) == null || this.k == null || this.y != null) {
            return false;
        }
        menuBuilder.j();
        if (menuBuilder.j.isEmpty()) {
            return false;
        }
        OpenOverflowRunnable openOverflowRunnable = new OpenOverflowRunnable(new OverflowPopup(this.e, this.f, this.m));
        this.y = openOverflowRunnable;
        ((View) this.k).post(openOverflowRunnable);
        return true;
    }
}
