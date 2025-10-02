package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.R;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class SearchBar extends Toolbar {
    public static final /* synthetic */ int p0 = 0;
    public final TextView a0;
    public final boolean b0;
    public final boolean c0;
    public final SearchBarAnimationHelper d0;
    public final Drawable e0;
    public final boolean f0;
    public final boolean g0;
    public View h0;
    public final Integer i0;
    public Drawable j0;
    public int k0;
    public boolean l0;
    public final MaterialShapeDrawable m0;
    public final AccessibilityManager n0;
    public final c o0;

    public static abstract class OnLoadAnimationCallback {
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public String f;

        /* renamed from: com.google.android.material.search.SearchBar$SavedState$1, reason: invalid class name */
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
            this.f = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f);
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonB = ToolbarUtils.b(this);
        if (imageButtonB == null) {
            return;
        }
        imageButtonB.setClickable(!z);
        imageButtonB.setFocusable(!z);
        Drawable background = imageButtonB.getBackground();
        if (background != null) {
            this.j0 = background;
        }
        imageButtonB.setBackgroundDrawable(z ? null : this.j0);
        y();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.b0 && this.h0 == null && !(view instanceof ActionMenuView)) {
            this.h0 = view;
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        super.addView(view, i, layoutParams);
    }

    @Nullable
    public View getCenterView() {
        return this.h0;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.m0;
        return materialShapeDrawable != null ? materialShapeDrawable.d.m : ViewCompat.k(this);
    }

    public float getCornerSize() {
        return this.m0.i();
    }

    @DimenRes
    @RestrictTo
    public int getDefaultMarginVerticalResource() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo
    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.a0.getHint();
    }

    public int getMenuResId() {
        return this.k0;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.m0.d.d.getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.m0.d.j;
    }

    @NonNull
    public CharSequence getText() {
        return this.a0.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.a0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void n(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof MenuBuilder;
        if (z) {
            ((MenuBuilder) menu).B();
        }
        super.n(i);
        this.k0 = i;
        if (z) {
            ((MenuBuilder) menu).A();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        MaterialShapeUtils.c(this, this.m0);
        if (this.c0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        z();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.h0;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = this.h0.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            View view2 = this.h0;
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        y();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.h0;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        setText(savedState.f);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.h0;
        if (view2 != null) {
            removeView(view2);
            this.h0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.l0 = z;
        z();
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeDrawable materialShapeDrawable = this.m0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.l(f);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.a0.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        int iB;
        if (this.f0 && drawable != null) {
            Integer num = this.i0;
            if (num != null) {
                iB = num.intValue();
            } else {
                iB = MaterialColors.b(drawable == this.e0 ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(iB);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.g0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.d0.getClass();
    }

    public void setStrokeColor(@ColorInt int i) {
        if (getStrokeColor() != i) {
            this.m0.s(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(@Dimension float f) {
        if (getStrokeWidth() != f) {
            this.m0.t(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.a0.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final void y() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonB = ToolbarUtils.b(this);
        int width = (imageButtonB == null || !imageButtonB.isClickable()) ? 0 : z ? getWidth() - imageButtonB.getLeft() : imageButtonB.getRight();
        ActionMenuView actionMenuViewA = ToolbarUtils.a(this);
        int right = actionMenuViewA != null ? z ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, BitmapDescriptorFactory.HUE_RED, -width, BitmapDescriptorFactory.HUE_RED);
    }

    public final void z() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.l0) {
                if (layoutParams.f14513a == 0) {
                    layoutParams.f14513a = 53;
                }
            } else if (layoutParams.f14513a == 53) {
                layoutParams.f14513a = 0;
            }
        }
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean j;

        public ScrollingViewBehavior() {
            this.j = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.j(coordinatorLayout, view, view2);
            if (!this.j && (view2 instanceof AppBarLayout)) {
                this.j = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(BitmapDescriptorFactory.HUE_RED);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.j = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public void setHint(@StringRes int i) {
        this.a0.setHint(i);
    }

    public void setText(@StringRes int i) {
        this.a0.setText(i);
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.k0 = -1;
        this.o0 = new c(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", NotificationMessage.NOTIF_KEY_SUB_TITLE) != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableB = AppCompatResources.b(getDefaultNavigationIconResource(), context2);
        this.e0 = drawableB;
        SearchBarAnimationHelper searchBarAnimationHelper = new SearchBarAnimationHelper();
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.d0 = searchBarAnimationHelper;
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.W, i, R.style.Widget_Material3_SearchBar, new int[0]);
        ShapeAppearanceModel shapeAppearanceModelA = ShapeAppearanceModel.d(context2, attributeSet, i, R.style.Widget_Material3_SearchBar).a();
        int color = typedArrayD.getColor(3, 0);
        float dimension = typedArrayD.getDimension(6, BitmapDescriptorFactory.HUE_RED);
        this.c0 = typedArrayD.getBoolean(4, true);
        this.l0 = typedArrayD.getBoolean(5, true);
        boolean z = typedArrayD.getBoolean(8, false);
        this.g0 = typedArrayD.getBoolean(7, false);
        this.f0 = typedArrayD.getBoolean(12, true);
        if (typedArrayD.hasValue(9)) {
            this.i0 = Integer.valueOf(typedArrayD.getColor(9, -1));
        }
        int resourceId = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(1);
        String string2 = typedArrayD.getString(2);
        float dimension2 = typedArrayD.getDimension(11, -1.0f);
        int color2 = typedArrayD.getColor(10, 0);
        typedArrayD.recycle();
        if (!z) {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableB);
            setNavigationIconDecorative(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.b0 = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.a0 = textView;
        ViewCompat.F(this, dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        if (getNavigationIcon() == null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(shapeAppearanceModelA);
        this.m0 = materialShapeDrawable;
        materialShapeDrawable.k(getContext());
        this.m0.l(dimension);
        if (dimension2 >= BitmapDescriptorFactory.HUE_RED) {
            MaterialShapeDrawable materialShapeDrawable2 = this.m0;
            materialShapeDrawable2.t(dimension2);
            materialShapeDrawable2.s(ColorStateList.valueOf(color2));
        }
        int iB = MaterialColors.b(R.attr.colorControlHighlight, this);
        this.m0.m(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iB);
        MaterialShapeDrawable materialShapeDrawable3 = this.m0;
        setBackground(new RippleDrawable(colorStateListValueOf, materialShapeDrawable3, materialShapeDrawable3));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.n0 = accessibilityManager;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    SearchBar searchBar = SearchBar.this;
                    AccessibilityManagerCompat.a(searchBar.n0, searchBar.o0);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    SearchBar searchBar = SearchBar.this;
                    AccessibilityManagerCompat.b(searchBar.n0, searchBar.o0);
                }
            });
        }
    }
}
