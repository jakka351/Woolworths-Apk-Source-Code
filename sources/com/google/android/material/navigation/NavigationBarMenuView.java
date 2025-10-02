package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.content.ContextCompat;
import androidx.core.util.Pools;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.transition.AutoTransition;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.TextScale;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import java.util.HashSet;
import java.util.WeakHashMap;

@RestrictTo
/* loaded from: classes6.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements MenuView {
    public static final int[] I = {R.attr.state_checked};
    public static final int[] J = {-16842910};
    public int A;
    public int B;
    public int C;
    public ShapeAppearanceModel D;
    public boolean E;
    public ColorStateList F;
    public NavigationBarPresenter G;
    public MenuBuilder H;
    public final AutoTransition d;
    public final View.OnClickListener e;
    public final Pools.SynchronizedPool f;
    public final SparseArray g;
    public int h;
    public NavigationBarItemView[] i;
    public int j;
    public int k;
    public ColorStateList l;
    public int m;
    public ColorStateList n;
    public final ColorStateList o;
    public int p;
    public int q;
    public boolean r;
    public Drawable s;
    public ColorStateList t;
    public int u;
    public final SparseArray v;
    public int w;
    public int x;
    public int y;
    public boolean z;

    public NavigationBarMenuView(@NonNull Context context) {
        super(context);
        this.f = new Pools.SynchronizedPool(5);
        this.g = new SparseArray(5);
        this.j = 0;
        this.k = 0;
        this.v = new SparseArray(5);
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = false;
        this.o = c();
        if (isInEditMode()) {
            this.d = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.d = autoTransition;
            autoTransition.V(0);
            autoTransition.J(MotionUtils.c(getContext(), com.woolworths.R.attr.motionDurationMedium4, getResources().getInteger(com.woolworths.R.integer.material_motion_duration_long_1)));
            autoTransition.L(MotionUtils.d(getContext(), com.woolworths.R.attr.motionEasingStandard, AnimationUtils.b));
            autoTransition.R(new TextScale());
        }
        this.e = new View.OnClickListener() { // from class: com.google.android.material.navigation.NavigationBarMenuView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    MenuItemImpl itemData = ((NavigationBarItemView) view).getItemData();
                    NavigationBarMenuView navigationBarMenuView = NavigationBarMenuView.this;
                    if (!navigationBarMenuView.H.r(itemData, navigationBarMenuView.G, 0)) {
                        itemData.setChecked(true);
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        };
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(1);
    }

    public static boolean f(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    private NavigationBarItemView getNewItem() {
        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) this.f.a();
        return navigationBarItemView == null ? e(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(@NonNull NavigationBarItemView navigationBarItemView) {
        BadgeDrawable badgeDrawable;
        int id = navigationBarItemView.getId();
        if (id == -1 || (badgeDrawable = (BadgeDrawable) this.v.get(id)) == null) {
            return;
        }
        navigationBarItemView.setBadge(badgeDrawable);
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public final void a(MenuBuilder menuBuilder) {
        this.H = menuBuilder;
    }

    public final void b() {
        removeAllViews();
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                if (navigationBarItemView != null) {
                    this.f.b(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.q;
                    if (navigationBarItemView.I != null) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            BadgeDrawable badgeDrawable = navigationBarItemView.I;
                            if (badgeDrawable != null) {
                                if (badgeDrawable.d() != null) {
                                    badgeDrawable.d().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(badgeDrawable);
                                }
                            }
                        }
                        navigationBarItemView.I = null;
                    }
                    navigationBarItemView.w = null;
                    navigationBarItemView.C = BitmapDescriptorFactory.HUE_RED;
                    navigationBarItemView.d = false;
                }
            }
        }
        if (this.H.f.size() == 0) {
            this.j = 0;
            this.k = 0;
            this.i = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.H.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.H.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.v;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.i = new NavigationBarItemView[this.H.f.size()];
        boolean zF = f(this.h, this.H.m().size());
        for (int i3 = 0; i3 < this.H.f.size(); i3++) {
            this.G.e = true;
            this.H.getItem(i3).setCheckable(true);
            this.G.e = false;
            NavigationBarItemView newItem = getNewItem();
            this.i[i3] = newItem;
            newItem.setIconTintList(this.l);
            newItem.setIconSize(this.m);
            newItem.setTextColor(this.o);
            newItem.setTextAppearanceInactive(this.p);
            newItem.setTextAppearanceActive(this.q);
            newItem.setTextAppearanceActiveBoldEnabled(this.r);
            newItem.setTextColor(this.n);
            int i4 = this.w;
            if (i4 != -1) {
                newItem.setItemPaddingTop(i4);
            }
            int i5 = this.x;
            if (i5 != -1) {
                newItem.setItemPaddingBottom(i5);
            }
            int i6 = this.y;
            if (i6 != -1) {
                newItem.setActiveIndicatorLabelPadding(i6);
            }
            newItem.setActiveIndicatorWidth(this.A);
            newItem.setActiveIndicatorHeight(this.B);
            newItem.setActiveIndicatorMarginHorizontal(this.C);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.E);
            newItem.setActiveIndicatorEnabled(this.z);
            Drawable drawable = this.s;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.u);
            }
            newItem.setItemRippleColor(this.t);
            newItem.setShifting(zF);
            newItem.setLabelVisibilityMode(this.h);
            MenuItemImpl menuItemImpl = (MenuItemImpl) this.H.getItem(i3);
            newItem.c(menuItemImpl);
            newItem.setItemPosition(i3);
            int i7 = menuItemImpl.f135a;
            newItem.setOnTouchListener((View.OnTouchListener) this.g.get(i7));
            newItem.setOnClickListener(this.e);
            int i8 = this.j;
            if (i8 != 0 && i7 == i8) {
                this.k = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.H.f.size() - 1, this.k);
        this.k = iMin;
        this.H.getItem(iMin).setChecked(true);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = ContextCompat.c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.woolworths.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = I;
        int[] iArr2 = ViewGroup.EMPTY_STATE_SET;
        int[] iArr3 = J;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListC.getColorForState(iArr3, defaultColor), i, defaultColor});
    }

    public final MaterialShapeDrawable d() {
        if (this.D == null || this.F == null) {
            return null;
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.D);
        materialShapeDrawable.m(this.F);
        return materialShapeDrawable;
    }

    public abstract NavigationBarItemView e(Context context);

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.y;
    }

    public SparseArray<BadgeDrawable> getBadgeDrawables() {
        return this.v;
    }

    @Nullable
    public ColorStateList getIconTintList() {
        return this.l;
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.F;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.z;
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.B;
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.C;
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.D;
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.A;
    }

    @Nullable
    public Drawable getItemBackground() {
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        return (navigationBarItemViewArr == null || navigationBarItemViewArr.length <= 0) ? this.s : navigationBarItemViewArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.u;
    }

    @Dimension
    public int getItemIconSize() {
        return this.m;
    }

    @Px
    public int getItemPaddingBottom() {
        return this.x;
    }

    @Px
    public int getItemPaddingTop() {
        return this.w;
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.t;
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.q;
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.p;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.n;
    }

    public int getLabelVisibilityMode() {
        return this.h;
    }

    @Nullable
    public MenuBuilder getMenu() {
        return this.H;
    }

    public int getSelectedItemId() {
        return this.j;
    }

    public int getSelectedItemPosition() {
        return this.k;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, this.H.m().size(), 1));
    }

    public void setActiveIndicatorLabelPadding(@Px int i) {
        this.y = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorLabelPadding(i);
            }
        }
    }

    public void setIconTintList(@Nullable ColorStateList colorStateList) {
        this.l = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.F = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.z = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.B = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.C = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.E = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.D = shapeAppearanceModel;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.A = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.s = drawable;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.u = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@Dimension int i) {
        this.m = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@Px int i) {
        this.x = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@Px int i) {
        this.w = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.t = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        this.q = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.n;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        this.r = z;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceActiveBoldEnabled(z);
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        this.p = i;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.n;
                if (colorStateList != null) {
                    navigationBarItemView.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.n = colorStateList;
        NavigationBarItemView[] navigationBarItemViewArr = this.i;
        if (navigationBarItemViewArr != null) {
            for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                navigationBarItemView.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.h = i;
    }

    public void setPresenter(@NonNull NavigationBarPresenter navigationBarPresenter) {
        this.G = navigationBarPresenter;
    }
}
