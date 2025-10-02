package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final /* synthetic */ int n = 0;
    public final ArrayList d;
    public final PressedStateTracker e;
    public final LinkedHashSet f;
    public final Comparator g;
    public Integer[] h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final int l;
    public HashSet m;

    public static class CornerData {
        public static final AbsoluteCornerSize e = new AbsoluteCornerSize(BitmapDescriptorFactory.HUE_RED);

        /* renamed from: a, reason: collision with root package name */
        public final CornerSize f14528a;
        public final CornerSize b;
        public final CornerSize c;
        public final CornerSize d;

        public CornerData(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f14528a = cornerSize;
            this.b = cornerSize3;
            this.c = cornerSize4;
            this.d = cornerSize2;
        }
    }

    public interface OnButtonCheckedListener {
        void a(int i, boolean z);
    }

    public class PressedStateTracker implements MaterialButton.OnPressedChangeListener {
        public PressedStateTracker() {
        }

        @Override // com.google.android.material.button.MaterialButton.OnPressedChangeListener
        public final void a() {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.e);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.o);
        ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.d.add(new CornerData(shapeAppearanceModel.e, shapeAppearanceModel.h, shapeAppearanceModel.f, shapeAppearanceModel.g));
        materialButton.setEnabled(isEnabled());
        ViewCompat.A(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.2
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public final void d(View view2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                int i2;
                this.f2466a.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat.f2508a);
                int i3 = MaterialButtonToggleGroup.n;
                if (view2 instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                        if (i4 >= materialButtonToggleGroup.getChildCount()) {
                            break;
                        }
                        if (materialButtonToggleGroup.getChildAt(i4) == view2) {
                            i2 = i5;
                            break;
                        }
                        if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.c(i4)) {
                            i5++;
                        }
                        i4++;
                    }
                } else {
                    i2 = -1;
                }
                accessibilityNodeInfoCompat.o(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.a(0, 1, i2, 1, false, ((MaterialButton) view2).o));
            }
        });
    }

    public final void b(int i, boolean z) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.m);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.j && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.k || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set set) {
        HashSet hashSet = this.m;
        this.m = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.i = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.i = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator it = this.f.iterator();
                while (it.hasNext()) {
                    ((OnButtonCheckedListener) it.next()).a(id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.g);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.h = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        CornerData cornerData;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builderG = materialButton.getShapeAppearanceModel().g();
                CornerData cornerData2 = (CornerData) this.d.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    AbsoluteCornerSize absoluteCornerSize = CornerData.e;
                    if (i == firstVisibleChildIndex) {
                        cornerData = z ? ViewUtils.h(this) ? new CornerData(absoluteCornerSize, absoluteCornerSize, cornerData2.b, cornerData2.c) : new CornerData(cornerData2.f14528a, cornerData2.d, absoluteCornerSize, absoluteCornerSize) : new CornerData(cornerData2.f14528a, absoluteCornerSize, cornerData2.b, absoluteCornerSize);
                    } else if (i == lastVisibleChildIndex) {
                        cornerData = z ? ViewUtils.h(this) ? new CornerData(cornerData2.f14528a, cornerData2.d, absoluteCornerSize, absoluteCornerSize) : new CornerData(absoluteCornerSize, absoluteCornerSize, cornerData2.b, cornerData2.c) : new CornerData(absoluteCornerSize, cornerData2.d, absoluteCornerSize, cornerData2.c);
                    } else {
                        cornerData2 = null;
                    }
                    cornerData2 = cornerData;
                }
                if (cornerData2 == null) {
                    builderG.b(BitmapDescriptorFactory.HUE_RED);
                } else {
                    builderG.e = cornerData2.f14528a;
                    builderG.h = cornerData2.d;
                    builderG.f = cornerData2.b;
                    builderG.g = cornerData2.c;
                }
                materialButton.setShapeAppearanceModel(builderG.a());
            }
        }
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.j || this.m.isEmpty()) {
            return -1;
        }
        return ((Integer) this.m.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.m.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.h;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.l;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new AccessibilityNodeInfoCompat(accessibilityNodeInfo).n(AccessibilityNodeInfoCompat.CollectionInfoCompat.a(1, getVisibleButtonCount(), this.j ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.d.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setSelectionRequired(boolean z) {
        this.k = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.j != z) {
            this.j = z;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.j ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.a(context, attributeSet, i, 2132084114), attributeSet, i);
        this.d = new ArrayList();
        this.e = new PressedStateTracker();
        this.f = new LinkedHashSet();
        this.g = new Comparator<MaterialButton>() { // from class: com.google.android.material.button.MaterialButtonToggleGroup.1
            @Override // java.util.Comparator
            public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
                MaterialButton materialButton3 = materialButton;
                MaterialButton materialButton4 = materialButton2;
                int iCompareTo = Boolean.valueOf(materialButton3.o).compareTo(Boolean.valueOf(materialButton4.o));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
                return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
            }
        };
        this.i = false;
        this.m = new HashSet();
        TypedArray typedArrayD = ThemeEnforcement.d(getContext(), attributeSet, com.google.android.material.R.styleable.B, i, 2132084114, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(3, false));
        this.l = typedArrayD.getResourceId(1, -1);
        this.k = typedArrayD.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@BoolRes int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
