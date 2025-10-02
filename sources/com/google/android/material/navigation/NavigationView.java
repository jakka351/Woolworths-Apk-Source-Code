package com.google.android.material.navigation;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.activity.BackEventCompat;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import au.com.woolworths.shop.addtolist.utils.a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialSideContainerBackHelper;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeableDelegate;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements MaterialBackHandler {
    public static final int[] A = {R.attr.state_checked};
    public static final int[] B = {-16842910};
    public final NavigationMenu k;
    public final NavigationMenuPresenter l;
    public OnNavigationItemSelectedListener m;
    public final int n;
    public final int[] o;
    public SupportMenuInflater p;
    public final ViewTreeObserver.OnGlobalLayoutListener q;
    public boolean r;
    public boolean s;
    public int t;
    public final boolean u;
    public final int v;
    public final ShapeableDelegate w;
    public final MaterialSideContainerBackHelper x;
    public final MaterialBackOrchestrator y;
    public final DrawerLayout.DrawerListener z;

    public interface OnNavigationItemSelectedListener {
        void a(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public Bundle f;

        /* renamed from: com.google.android.material.navigation.NavigationView$SavedState$1, reason: invalid class name */
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
            this.f = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f);
        }
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.p == null) {
            this.p = new SupportMenuInflater(getContext());
        }
        return this.p;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void b(BackEventCompat backEventCompat) {
        k();
        this.x.f = backEventCompat;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c(BackEventCompat backEventCompat) {
        float f = backEventCompat.c;
        int i = ((DrawerLayout.LayoutParams) k().second).f2687a;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.x;
        if (materialSideContainerBackHelper.f == null) {
            Log.w("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        BackEventCompat backEventCompat2 = materialSideContainerBackHelper.f;
        materialSideContainerBackHelper.f = backEventCompat;
        if (backEventCompat2 != null) {
            materialSideContainerBackHelper.d(backEventCompat.d == 0, f, i);
        }
        if (this.u) {
            this.t = AnimationUtils.c(materialSideContainerBackHelper.f14611a.getInterpolation(f), 0, this.v);
            j(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d() {
        Pair pairK = k();
        final DrawerLayout drawerLayout = (DrawerLayout) pairK.first;
        MaterialSideContainerBackHelper materialSideContainerBackHelper = this.x;
        BackEventCompat backEventCompat = materialSideContainerBackHelper.f;
        materialSideContainerBackHelper.f = null;
        if (backEventCompat == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.c(this, true);
            return;
        }
        int i = ((DrawerLayout.LayoutParams) pairK.second).f2687a;
        int i2 = DrawerLayoutUtils.f14615a;
        materialSideContainerBackHelper.c(backEventCompat, i, new AnimatorListenerAdapter() { // from class: com.google.android.material.navigation.DrawerLayoutUtils.1
            public final /* synthetic */ NavigationView e;

            public AnonymousClass1(final NavigationView this) {
                navigationView = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                NavigationView navigationView = navigationView;
                DrawerLayout drawerLayout2 = drawerLayout;
                drawerLayout2.c(navigationView, false);
                drawerLayout2.setScrimColor(-1728053248);
            }
        }, new a(drawerLayout, 4));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ShapeableDelegate shapeableDelegate = this.w;
        Path path = shapeableDelegate.e;
        if (!shapeableDelegate.c() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void e() {
        k();
        this.x.b();
        if (!this.u || this.t == 0) {
            return;
        }
        this.t = 0;
        j(getWidth(), getHeight());
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void g(WindowInsetsCompat windowInsetsCompat) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.getClass();
        int iK = windowInsetsCompat.k();
        if (navigationMenuPresenter.C != iK) {
            navigationMenuPresenter.C = iK;
            int i = (navigationMenuPresenter.e.getChildCount() <= 0 && navigationMenuPresenter.A) ? navigationMenuPresenter.C : 0;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.d;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = navigationMenuPresenter.d;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, windowInsetsCompat.h());
        ViewCompat.d(navigationMenuPresenter.e, windowInsetsCompat);
    }

    @VisibleForTesting
    public MaterialSideContainerBackHelper getBackHelper() {
        return this.x;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.l.a();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.l.w;
    }

    @Px
    public int getDividerInsetStart() {
        return this.l.v;
    }

    public int getHeaderCount() {
        return this.l.e.getChildCount();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.l.p;
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.l.r;
    }

    @Dimension
    public int getItemIconPadding() {
        return this.l.t;
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.l.o;
    }

    public int getItemMaxLines() {
        return this.l.B;
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.l.n;
    }

    @Px
    public int getItemVerticalPadding() {
        return this.l.s;
    }

    @NonNull
    public Menu getMenu() {
        return this.k;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.l.y;
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.l.x;
    }

    public final ColorStateList h(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListC = ContextCompat.c(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.woolworths.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListC.getDefaultColor();
        int[] iArr = A;
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        int[] iArr3 = B;
        return new ColorStateList(new int[][]{iArr3, iArr, iArr2}, new int[]{colorStateListC.getColorForState(iArr3, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable i(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        TypedArray typedArray = tintTypedArray.b;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(ShapeAppearanceModel.a(getContext(), typedArray.getResourceId(17, 0), typedArray.getResourceId(18, 0)).a());
        materialShapeDrawable.m(colorStateList);
        return new InsetDrawable((Drawable) materialShapeDrawable, typedArray.getDimensionPixelSize(22, 0), typedArray.getDimensionPixelSize(23, 0), typedArray.getDimensionPixelSize(21, 0), typedArray.getDimensionPixelSize(20, 0));
    }

    public final void j(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.t > 0 || this.u) && (getBackground() instanceof MaterialShapeDrawable)) {
                int i3 = ((DrawerLayout.LayoutParams) getLayoutParams()).f2687a;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                boolean z = Gravity.getAbsoluteGravity(i3, getLayoutDirection()) == 3;
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) getBackground();
                ShapeAppearanceModel.Builder builderG = materialShapeDrawable.d.f14634a.g();
                builderG.b(this.t);
                if (z) {
                    builderG.e(BitmapDescriptorFactory.HUE_RED);
                    builderG.c(BitmapDescriptorFactory.HUE_RED);
                } else {
                    builderG.f(BitmapDescriptorFactory.HUE_RED);
                    builderG.d(BitmapDescriptorFactory.HUE_RED);
                }
                ShapeAppearanceModel shapeAppearanceModelA = builderG.a();
                materialShapeDrawable.setShapeAppearanceModel(shapeAppearanceModelA);
                ShapeableDelegate shapeableDelegate = this.w;
                shapeableDelegate.c = shapeAppearanceModelA;
                shapeableDelegate.d();
                shapeableDelegate.b(this);
                shapeableDelegate.d = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, i, i2);
                shapeableDelegate.d();
                shapeableDelegate.b(this);
                shapeableDelegate.b = true;
                shapeableDelegate.b(this);
            }
        }
    }

    public final Pair k() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            MaterialBackOrchestrator materialBackOrchestrator = this.y;
            if (materialBackOrchestrator.f14612a != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                DrawerLayout.DrawerListener drawerListener = this.z;
                if (drawerListener != null && (arrayList = drawerLayout.w) != null) {
                    arrayList.remove(drawerListener);
                }
                drawerLayout.a(drawerListener);
                if (DrawerLayout.m(this)) {
                    materialBackOrchestrator.a(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.q);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            DrawerLayout.DrawerListener drawerListener = this.z;
            if (drawerListener == null || (arrayList = drawerLayout.w) == null) {
                return;
            }
            arrayList.remove(drawerListener);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.n;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        this.k.u(savedState.f);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f = bundle;
        this.k.w(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        j(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z) {
        this.s = z;
    }

    public void setCheckedItem(@IdRes int i) {
        MenuItem menuItemFindItem = this.k.findItem(i);
        if (menuItemFindItem != null) {
            this.l.i((MenuItemImpl) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.w = i;
        navigationMenuPresenter.f(false);
    }

    public void setDividerInsetStart(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.v = i;
        navigationMenuPresenter.f(false);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MaterialShapeUtils.b(this, f);
    }

    @RestrictTo
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z) {
        ShapeableDelegate shapeableDelegate = this.w;
        if (z != shapeableDelegate.f14643a) {
            shapeableDelegate.f14643a = z;
            shapeableDelegate.b(this);
        }
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.p = drawable;
        navigationMenuPresenter.f(false);
    }

    public void setItemBackgroundResource(@DrawableRes int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.r = i;
        navigationMenuPresenter.f(false);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.r = dimensionPixelSize;
        navigationMenuPresenter.f(false);
    }

    public void setItemIconPadding(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.t = i;
        navigationMenuPresenter.f(false);
    }

    public void setItemIconPaddingResource(int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.t = dimensionPixelSize;
        navigationMenuPresenter.f(false);
    }

    public void setItemIconSize(@Dimension int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        if (navigationMenuPresenter.u != i) {
            navigationMenuPresenter.u = i;
            navigationMenuPresenter.z = true;
            navigationMenuPresenter.f(false);
        }
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.o = colorStateList;
        navigationMenuPresenter.f(false);
    }

    public void setItemMaxLines(int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.B = i;
        navigationMenuPresenter.f(false);
    }

    public void setItemTextAppearance(@StyleRes int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.l = i;
        navigationMenuPresenter.f(false);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.m = z;
        navigationMenuPresenter.f(false);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.n = colorStateList;
        navigationMenuPresenter.f(false);
    }

    public void setItemVerticalPadding(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.s = i;
        navigationMenuPresenter.f(false);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.s = dimensionPixelSize;
        navigationMenuPresenter.f(false);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener onNavigationItemSelectedListener) {
        this.m = onNavigationItemSelectedListener;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        if (navigationMenuPresenter != null) {
            navigationMenuPresenter.E = i;
            NavigationMenuView navigationMenuView = navigationMenuPresenter.d;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setSubheaderInsetEnd(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.y = i;
        navigationMenuPresenter.f(false);
    }

    public void setSubheaderInsetStart(@Px int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.l;
        navigationMenuPresenter.x = i;
        navigationMenuPresenter.f(false);
    }

    public void setTopInsetScrimEnabled(boolean z) {
        this.r = z;
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.navigationViewStyle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017c A[PHI: r15
  0x017c: PHI (r15v4 android.graphics.drawable.Drawable) = 
  (r15v3 android.graphics.drawable.Drawable)
  (r15v7 android.graphics.drawable.Drawable)
  (r15v3 android.graphics.drawable.Drawable)
 binds: [B:50:0x0142, B:56:0x0168, B:54:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(@androidx.annotation.NonNull android.content.Context r18, @androidx.annotation.Nullable android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.k.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.l.i((MenuItemImpl) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }
}
