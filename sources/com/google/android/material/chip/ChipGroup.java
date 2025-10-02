package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class ChipGroup extends FlowLayout {
    public int h;
    public int i;
    public OnCheckedStateChangeListener j;
    public final CheckableGroup k;
    public final int l;
    public final PassThroughHierarchyChangeListener m;

    /* renamed from: com.google.android.material.chip.ChipGroup$1, reason: invalid class name */
    public class AnonymousClass1 implements CheckableGroup.OnCheckedStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // com.google.android.material.internal.CheckableGroup.OnCheckedStateChangeListener
        public final void a() {
            ChipGroup chipGroup = ChipGroup.this;
            OnCheckedStateChangeListener onCheckedStateChangeListener = chipGroup.j;
            if (onCheckedStateChangeListener != null) {
                chipGroup.k.c(chipGroup);
                onCheckedStateChangeListener.a(chipGroup);
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Deprecated
    public interface OnCheckedChangeListener {
        void a(ChipGroup chipGroup);
    }

    public interface OnCheckedStateChangeListener {
        void a(ChipGroup chipGroup);
    }

    public class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener d;

        public PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap weakHashMap = ViewCompat.f2488a;
                    view2.setId(View.generateViewId());
                }
                chipGroup.k.a((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                CheckableGroup checkableGroup = chipGroup.k;
                Chip chip = (Chip) view2;
                checkableGroup.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                checkableGroup.f14590a.remove(Integer.valueOf(chip.getId()));
                checkableGroup.b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // com.google.android.material.internal.FlowLayout
    public final boolean a() {
        return this.f;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.k.d();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.k.c(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.h;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.i;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
        super.onFinishInflate();
        int i = this.l;
        if (i != -1) {
            CheckableGroup checkableGroup = this.k;
            MaterialCheckable materialCheckable = (MaterialCheckable) checkableGroup.f14590a.get(Integer.valueOf(i));
            if (materialCheckable == null || !checkableGroup.b(materialCheckable) || (onCheckedStateChangeListener = checkableGroup.c) == null) {
                return;
            }
            new HashSet(checkableGroup.b);
            ((AnonymousClass1) onCheckedStateChangeListener).a();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(getRowCount(), this.f ? getVisibleChipCount() : -1, this.k.d ? 1 : 2));
    }

    public void setChipSpacing(@Dimension int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@Dimension int i) {
        if (this.h != i) {
            this.h = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@DimenRes int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@Dimension int i) {
        if (this.i != i) {
            this.i = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public final void a(ChipGroup chipGroup) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.k.d) {
                        chipGroup2.getCheckedChipId();
                        onCheckedChangeListener.a(chipGroup);
                        throw null;
                    }
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.j = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.m.d = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.k.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        CheckableGroup.OnCheckedStateChangeListener onCheckedStateChangeListener;
        CheckableGroup checkableGroup = this.k;
        boolean z2 = checkableGroup.d;
        HashSet hashSet = checkableGroup.b;
        if (z2 != z) {
            checkableGroup.d = z;
            boolean zIsEmpty = hashSet.isEmpty();
            Iterator it = checkableGroup.f14590a.values().iterator();
            while (it.hasNext()) {
                checkableGroup.e((MaterialCheckable) it.next(), false);
            }
            if (zIsEmpty || (onCheckedStateChangeListener = checkableGroup.c) == null) {
                return;
            }
            new HashSet(hashSet);
            ((AnonymousClass1) onCheckedStateChangeListener).a();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084100), attributeSet, i);
        CheckableGroup checkableGroup = new CheckableGroup();
        this.k = checkableGroup;
        PassThroughHierarchyChangeListener passThroughHierarchyChangeListener = new PassThroughHierarchyChangeListener();
        this.m = passThroughHierarchyChangeListener;
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.k, i, 2132084100, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        this.l = typedArrayD.getResourceId(0, -1);
        typedArrayD.recycle();
        checkableGroup.c = new AnonymousClass1();
        super.setOnHierarchyChangeListener(passThroughHierarchyChangeListener);
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
