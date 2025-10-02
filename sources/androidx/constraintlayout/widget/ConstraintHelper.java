package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.Helper;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class ConstraintHelper extends View {
    public int[] d;
    public int e;
    public final Context f;
    public HelperWidget g;
    public boolean h;
    public String i;
    public String j;
    public View[] k;
    public final HashMap l;

    public ConstraintHelper(Context context) {
        super(context);
        this.d = new int[32];
        this.h = false;
        this.k = null;
        this.l = new HashMap();
        this.f = context;
        k(null);
    }

    public final void b(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f == null) {
            return;
        }
        String strTrim = str.trim();
        int i = i(strTrim);
        if (i != 0) {
            this.l.put(Integer.valueOf(i), strTrim);
            c(i);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void c(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.e + 1;
        int[] iArr = this.d;
        if (i2 > iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.e;
        iArr2[i3] = i;
        this.e = i3 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.f == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.LayoutParams) && strTrim.equals(((ConstraintLayout.LayoutParams) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.e; i++) {
            View viewById = constraintLayout.getViewById(this.d[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.d, this.e);
    }

    public final int h(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    public final int i(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iH = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                iH = ((Integer) designInformation).intValue();
            }
        }
        if (iH == 0 && constraintLayout != null) {
            iH = h(constraintLayout, str);
        }
        if (iH == 0) {
            try {
                iH = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iH != 0) {
            return iH;
        }
        Context context = this.f;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public final View[] j(ConstraintLayout constraintLayout) {
        View[] viewArr = this.k;
        if (viewArr == null || viewArr.length != this.e) {
            this.k = new View[this.e];
        }
        for (int i = 0; i < this.e; i++) {
            this.k[i] = constraintLayout.getViewById(this.d[i]);
        }
        return this.k;
    }

    public void k(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.i = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.j = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void l(ConstraintSet.Constraint constraint, HelperWidget helperWidget, Constraints.LayoutParams layoutParams, SparseArray sparseArray) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintSet.Layout layout = constraint.e;
        int[] iArr = layout.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = layout.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = layout.k0.split(",");
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int i3 = i(str2.trim());
                        if (i3 != 0) {
                            iArrCopyOf[i2] = i3;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    layout.j0 = iArrCopyOf;
                } else {
                    layout.j0 = null;
                }
            }
        }
        helperWidget.b();
        if (layout.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = layout.j0;
            if (i >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i]);
            if (constraintWidget != null) {
                helperWidget.a(constraintWidget);
            }
            i++;
        }
    }

    public void m(ConstraintWidget constraintWidget, boolean z) {
    }

    public void n() {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.h) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(Helper helper, SparseArray sparseArray) {
        helper.b();
        for (int i = 0; i < this.e; i++) {
            helper.a((ConstraintWidget) sparseArray.get(this.d[i]));
        }
    }

    public final void q() {
        if (this.g == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).q0 = this.g;
        }
    }

    public void setIds(String str) {
        this.i = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.i = null;
        this.e = 0;
        for (int i : iArr) {
            c(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.i == null) {
            c(i);
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new int[32];
        this.h = false;
        this.k = null;
        this.l = new HashMap();
        this.f = context;
        k(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new int[32];
        this.h = false;
        this.k = null;
        this.l = new HashMap();
        this.f = context;
        k(attributeSet);
    }
}
