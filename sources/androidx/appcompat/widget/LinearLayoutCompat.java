package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public class LinearLayoutCompat extends ViewGroup {
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public int[] l;
    public int[] m;
    public Drawable n;
    public int o;
    public int p;
    public int q;
    public int r;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DividerMode {
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f177a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;

        /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$1, reason: invalid class name */
        class AnonymousClass1 implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i) {
                return i != 0 ? i != 1 ? String.valueOf(i) : "vertical" : "horizontal";
            }
        }

        /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion$2, reason: invalid class name */
        class AnonymousClass2 implements IntFunction<Set<String>> {
            @Override // java.util.function.IntFunction
            public final Set<String> apply(int i) {
                HashSet hashSet = new HashSet();
                if (i == 0) {
                    hashSet.add(DevicePublicKeyStringDef.NONE);
                }
                if (i == 1) {
                    hashSet.add("beginning");
                }
                if (i == 2) {
                    hashSet.add("middle");
                }
                if (i == 4) {
                    hashSet.add("end");
                }
                return hashSet;
            }
        }

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f177a = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.b = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.c = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.d = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new AnonymousClass1());
            this.e = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.f = propertyMapper.mapObject("divider", com.woolworths.R.attr.divider);
            this.g = propertyMapper.mapInt("dividerPadding", com.woolworths.R.attr.dividerPadding);
            this.h = propertyMapper.mapBoolean("measureWithLargestChild", com.woolworths.R.attr.measureWithLargestChild);
            this.i = propertyMapper.mapIntFlag("showDividers", com.woolworths.R.attr.showDividers, new AnonymousClass2());
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) obj;
            propertyReader.readBoolean(this.f177a, linearLayoutCompat.d);
            propertyReader.readInt(this.b, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.c, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.d, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.e, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.f, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.g, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.h, linearLayoutCompat.k);
            propertyReader.readIntFlag(this.i, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    public final void b(Canvas canvas, int i) {
        this.n.setBounds(getPaddingLeft() + this.r, i, (getWidth() - getPaddingRight()) - this.r, this.p + i);
        this.n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void e(Canvas canvas, int i) {
        this.n.setBounds(i, getPaddingTop() + this.r, this.o + i, (getHeight() - getPaddingBottom()) - this.r);
        this.n.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.g;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.e < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.e;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.e == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iD = this.f;
        if (this.g == 1 && (i = this.h & 112) != 48) {
            if (i == 16) {
                iD = YU.a.D(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.i, 2, iD);
            } else if (i == 80) {
                iD = ((getBottom() - getTop()) - getPaddingBottom()) - this.i;
            }
        }
        return iD + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.e;
    }

    public Drawable getDividerDrawable() {
        return this.n;
    }

    public int getDividerPadding() {
        return this.r;
    }

    @RestrictTo
    public int getDividerWidth() {
        return this.o;
    }

    @GravityInt
    public int getGravity() {
        return this.h;
    }

    public int getOrientation() {
        return this.g;
    }

    public int getShowDividers() {
        return this.q;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final boolean i(int i) {
        if (i == 0) {
            return (this.q & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.q & 4) != 0;
        }
        if ((this.q & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.n == null) {
            return;
        }
        int i2 = 0;
        if (this.g == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && i(i2)) {
                    b(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.p);
                }
                i2++;
            }
            if (i(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                b(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.p : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && i(i2)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                e(canvas, z ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.o);
            }
            i2++;
        }
        if (i(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (z) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.o;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.o;
                right = left - i;
            }
            e(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.d = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.e = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            this.o = drawable.getIntrinsicWidth();
            this.p = drawable.getIntrinsicHeight();
        } else {
            this.o = 0;
            this.p = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.r = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.h != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.h = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.h;
        if ((8388615 & i3) != i2) {
            this.h = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.k = z;
    }

    public void setOrientation(int i) {
        if (this.g != i) {
            this.g = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.q) {
            requestLayout();
        }
        this.q = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.h;
        if ((i3 & 112) != i2) {
            this.h = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.j = Math.max(BitmapDescriptorFactory.HUE_RED, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = true;
        this.e = -1;
        this.f = 0;
        this.h = 8388659;
        int[] iArr = androidx.appcompat.R.styleable.p;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, tintTypedArrayF.b, i);
        TypedArray typedArray = tintTypedArrayF.b;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.j = typedArray.getFloat(4, -1.0f);
        this.e = typedArray.getInt(3, -1);
        this.k = typedArray.getBoolean(7, false);
        setDividerDrawable(tintTypedArrayF.b(5));
        this.q = typedArray.getInt(8, 0);
        this.r = typedArray.getDimensionPixelSize(6, 0);
        tintTypedArrayF.g();
    }
}
