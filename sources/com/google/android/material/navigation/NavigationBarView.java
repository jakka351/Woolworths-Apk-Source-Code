package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public abstract class NavigationBarView extends FrameLayout {
    public final NavigationBarMenu d;
    public final NavigationBarMenuView e;
    public final NavigationBarPresenter f;
    public SupportMenuInflater g;
    public OnItemSelectedListener h;
    public OnItemReselectedListener i;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface LabelVisibility {
    }

    public interface OnItemReselectedListener {
        void d(MenuItem menuItem);
    }

    public interface OnItemSelectedListener {
        boolean a(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Bundle f;

        /* renamed from: com.google.android.material.navigation.NavigationBarView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f);
        }
    }

    public NavigationBarView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(MaterialThemeOverlay.a(context, attributeSet, i, i2), attributeSet, i);
        NavigationBarPresenter navigationBarPresenter = new NavigationBarPresenter();
        navigationBarPresenter.e = false;
        this.f = navigationBarPresenter;
        Context context2 = getContext();
        TintTypedArray tintTypedArrayE = ThemeEnforcement.e(context2, attributeSet, R.styleable.P, i, i2, 12, 10);
        NavigationBarMenu navigationBarMenu = new NavigationBarMenu(context2, getClass(), getMaxItemCount());
        this.d = navigationBarMenu;
        NavigationBarMenuView navigationBarMenuViewA = a(context2);
        this.e = navigationBarMenuViewA;
        navigationBarPresenter.d = navigationBarMenuViewA;
        navigationBarPresenter.f = 1;
        navigationBarMenuViewA.setPresenter(navigationBarPresenter);
        navigationBarMenu.b(navigationBarPresenter);
        getContext();
        navigationBarPresenter.d.H = navigationBarMenu;
        TypedArray typedArray = tintTypedArrayE.b;
        if (typedArray.hasValue(6)) {
            navigationBarMenuViewA.setIconTintList(tintTypedArrayE.a(6));
        } else {
            navigationBarMenuViewA.setIconTintList(navigationBarMenuViewA.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(5, getResources().getDimensionPixelSize(com.woolworths.R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(12)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(12, 0));
        }
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceActive(typedArray.getResourceId(10, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(11, true));
        if (typedArray.hasValue(13)) {
            setItemTextColor(tintTypedArrayE.a(13));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListD = DrawableUtils.d(background);
        if (background == null || colorStateListD != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.d(context2, attributeSet, i, i2).a());
            if (colorStateListD != null) {
                materialShapeDrawable.m(colorStateListD);
            }
            materialShapeDrawable.k(context2);
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            setBackground(materialShapeDrawable);
        }
        if (typedArray.hasValue(8)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(8, 0));
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(MaterialResources.b(context2, tintTypedArrayE, 1));
        setLabelVisibilityMode(typedArray.getInteger(14, -1));
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            navigationBarMenuViewA.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MaterialResources.b(context2, tintTypedArrayE, 9));
        }
        int resourceId2 = typedArray.getResourceId(3, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, R.styleable.O);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(MaterialResources.a(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(ShapeAppearanceModel.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(15)) {
            c(typedArray.getResourceId(15, 0));
        }
        tintTypedArrayE.g();
        addView(navigationBarMenuViewA);
        navigationBarMenu.e = new MenuBuilder.Callback() { // from class: com.google.android.material.navigation.NavigationBarView.1
            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public final boolean a(MenuBuilder menuBuilder, MenuItem menuItem) {
                NavigationBarView navigationBarView = NavigationBarView.this;
                if (navigationBarView.i == null || menuItem.getItemId() != navigationBarView.getSelectedItemId()) {
                    OnItemSelectedListener onItemSelectedListener = navigationBarView.h;
                    return (onItemSelectedListener == null || onItemSelectedListener.a(menuItem)) ? false : true;
                }
                navigationBarView.i.d(menuItem);
                return true;
            }

            @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
            public final void b(MenuBuilder menuBuilder) {
            }
        };
    }

    private MenuInflater getMenuInflater() {
        if (this.g == null) {
            this.g = new SupportMenuInflater(getContext());
        }
        return this.g;
    }

    public abstract NavigationBarMenuView a(Context context);

    public final BadgeDrawable b() {
        NavigationBarMenuView navigationBarMenuView = this.e;
        navigationBarMenuView.getClass();
        SparseArray sparseArray = navigationBarMenuView.v;
        BadgeDrawable badgeDrawable = (BadgeDrawable) sparseArray.get(com.woolworths.R.id.action_more);
        NavigationBarItemView navigationBarItemView = null;
        if (badgeDrawable == null) {
            BadgeDrawable badgeDrawable2 = new BadgeDrawable(navigationBarMenuView.getContext(), null);
            sparseArray.put(com.woolworths.R.id.action_more, badgeDrawable2);
            badgeDrawable = badgeDrawable2;
        }
        NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView.i;
        if (navigationBarItemViewArr != null) {
            int length = navigationBarItemViewArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                NavigationBarItemView navigationBarItemView2 = navigationBarItemViewArr[i];
                if (navigationBarItemView2.getId() == com.woolworths.R.id.action_more) {
                    navigationBarItemView = navigationBarItemView2;
                    break;
                }
                i++;
            }
        }
        if (navigationBarItemView != null) {
            navigationBarItemView.setBadge(badgeDrawable);
        }
        return badgeDrawable;
    }

    public final void c(int i) {
        NavigationBarPresenter navigationBarPresenter = this.f;
        navigationBarPresenter.e = true;
        getMenuInflater().inflate(i, this.d);
        navigationBarPresenter.e = false;
        navigationBarPresenter.f(true);
    }

    @Px
    public int getActiveIndicatorLabelPadding() {
        return this.e.getActiveIndicatorLabelPadding();
    }

    @Nullable
    public ColorStateList getItemActiveIndicatorColor() {
        return this.e.getItemActiveIndicatorColor();
    }

    @Px
    public int getItemActiveIndicatorHeight() {
        return this.e.getItemActiveIndicatorHeight();
    }

    @Px
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.e.getItemActiveIndicatorMarginHorizontal();
    }

    @Nullable
    public ShapeAppearanceModel getItemActiveIndicatorShapeAppearance() {
        return this.e.getItemActiveIndicatorShapeAppearance();
    }

    @Px
    public int getItemActiveIndicatorWidth() {
        return this.e.getItemActiveIndicatorWidth();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.e.getItemBackground();
    }

    @DrawableRes
    @Deprecated
    public int getItemBackgroundResource() {
        return this.e.getItemBackgroundRes();
    }

    @Dimension
    public int getItemIconSize() {
        return this.e.getItemIconSize();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.e.getIconTintList();
    }

    @Px
    public int getItemPaddingBottom() {
        return this.e.getItemPaddingBottom();
    }

    @Px
    public int getItemPaddingTop() {
        return this.e.getItemPaddingTop();
    }

    @Nullable
    public ColorStateList getItemRippleColor() {
        return this.e.getItemRippleColor();
    }

    @StyleRes
    public int getItemTextAppearanceActive() {
        return this.e.getItemTextAppearanceActive();
    }

    @StyleRes
    public int getItemTextAppearanceInactive() {
        return this.e.getItemTextAppearanceInactive();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.d;
    }

    @NonNull
    @RestrictTo
    public MenuView getMenuView() {
        return this.e;
    }

    @NonNull
    @RestrictTo
    public NavigationBarPresenter getPresenter() {
        return this.f;
    }

    @IdRes
    public int getSelectedItemId() {
        return this.e.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        this.d.u(savedState.f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f = bundle;
        this.d.w(bundle);
        return savedState;
    }

    public void setActiveIndicatorLabelPadding(@Px int i) {
        this.e.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    public void setItemActiveIndicatorColor(@Nullable ColorStateList colorStateList) {
        this.e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.e.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(@Px int i) {
        this.e.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(@Px int i) {
        this.e.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        this.e.setItemActiveIndicatorShapeAppearance(shapeAppearanceModel);
    }

    public void setItemActiveIndicatorWidth(@Px int i) {
        this.e.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        this.e.setItemBackgroundRes(i);
    }

    public void setItemIconSize(@Dimension int i) {
        this.e.setItemIconSize(i);
    }

    public void setItemIconSizeRes(@DimenRes int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(@Px int i) {
        this.e.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(@Px int i) {
        this.e.setItemPaddingTop(i);
    }

    public void setItemRippleColor(@Nullable ColorStateList colorStateList) {
        this.e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(@StyleRes int i) throws Resources.NotFoundException {
        this.e.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) throws Resources.NotFoundException {
        this.e.setItemTextAppearanceActiveBoldEnabled(z);
    }

    public void setItemTextAppearanceInactive(@StyleRes int i) throws Resources.NotFoundException {
        this.e.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        NavigationBarMenuView navigationBarMenuView = this.e;
        if (navigationBarMenuView.getLabelVisibilityMode() != i) {
            navigationBarMenuView.setLabelVisibilityMode(i);
            this.f.f(false);
        }
    }

    public void setOnItemReselectedListener(@Nullable OnItemReselectedListener onItemReselectedListener) {
        this.i = onItemReselectedListener;
    }

    public void setOnItemSelectedListener(@Nullable OnItemSelectedListener onItemSelectedListener) {
        this.h = onItemSelectedListener;
    }

    public void setSelectedItemId(@IdRes int i) {
        NavigationBarMenu navigationBarMenu = this.d;
        MenuItem menuItemFindItem = navigationBarMenu.findItem(i);
        if (menuItemFindItem == null || navigationBarMenu.r(menuItemFindItem, this.f, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }
}
