package com.medallia.digital.mobilesdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class x4 extends FrameLayout {
    private static final float A = 2.0E-4f;
    private static final float B = 0.002f;
    private static final float C = 0.2f;
    private static final int y = 255;
    private static final float z = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    private final float f16768a;
    private final float b;
    private int c;
    private int d;
    private float e;
    private float f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final int[] k;
    private final int[] l;
    private final int m;
    private final int n;
    private int o;
    private NinePatchDrawable p;
    private int q;
    private NinePatchDrawable r;
    private int s;
    private NinePatchDrawable t;
    private int u;
    private NinePatchDrawable v;
    private final Rect w;
    private final int[] x;

    public static class a extends View.BaseSavedState implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0343a();

        /* renamed from: a, reason: collision with root package name */
        float f16769a;
        float b;
        boolean c;
        boolean d;
        private boolean e;
        private boolean f;

        /* renamed from: com.medallia.digital.mobilesdk.x4$a$a, reason: collision with other inner class name */
        public class C0343a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f16769a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.c = parcel.readByte() != 0;
            this.d = parcel.readByte() != 0;
            this.e = parcel.readByte() != 0;
            this.f = parcel.readByte() != 0;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f16769a);
            parcel.writeFloat(this.b);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @SuppressLint
    public x4(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        this.e = BitmapDescriptorFactory.HUE_RED;
        this.f = BitmapDescriptorFactory.HUE_RED;
        this.g = true;
        this.h = false;
        this.i = true;
        this.j = true;
        this.w = new Rect();
        this.x = new int[2];
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.md_MaterialShadowContainerView, i, i2);
        float dimension = typedArrayObtainStyledAttributes.getDimension(R.styleable.md_MaterialShadowContainerView_md_shadowTranslationZ, this.e);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(R.styleable.md_MaterialShadowContainerView_md_shadowElevation, this.f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.md_MaterialShadowContainerView_md_spotShadowDrawablesList, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.md_MaterialShadowContainerView_md_ambientShadowDrawablesList, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_forceUseCompatShadow, this.h);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_affectsDisplayedPosition, this.g);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_useAmbientShadow, this.i);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.md_MaterialShadowContainerView_md_useSpotShadow, this.j);
        typedArrayObtainStyledAttributes.recycle();
        int[] iArrA = a(getResources(), resourceId);
        this.k = iArrA;
        int[] iArrA2 = a(getResources(), resourceId2);
        this.l = iArrA2;
        this.m = a(iArrA);
        this.n = a(iArrA2);
        float f = getResources().getDisplayMetrics().density;
        this.f16768a = f;
        this.b = 1.0f / f;
        this.e = dimension;
        this.f = dimension2;
        this.h = z2;
        this.g = z3;
        this.i = z4;
        this.j = z5;
        e(true);
    }

    private static int a(int[] iArr) {
        if (iArr != null) {
            return Math.max(0, iArr.length - 1);
        }
        return 0;
    }

    private void e(boolean z2) {
        if (j()) {
            a(this.e, this.f, z2);
        } else {
            b(this.e, this.f, z2);
        }
    }

    private void f() {
        if (getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        int left = childAt.getLeft();
        int top = childAt.getTop();
        int right = childAt.getRight();
        int bottom = childAt.getBottom();
        a(this.p, left, top, right, bottom);
        NinePatchDrawable ninePatchDrawable = this.t;
        NinePatchDrawable ninePatchDrawable2 = this.r;
        if (ninePatchDrawable != ninePatchDrawable2) {
            a(ninePatchDrawable2, left, top, right, bottom);
        }
        a(this.t, left, top, right, bottom);
        NinePatchDrawable ninePatchDrawable3 = this.t;
        NinePatchDrawable ninePatchDrawable4 = this.v;
        if (ninePatchDrawable3 != ninePatchDrawable4) {
            a(ninePatchDrawable4, left, top, right, bottom);
        }
    }

    private void g() {
        float fSqrt;
        float fSqrt2;
        if (getChildCount() < 1) {
            return;
        }
        View childAt = getChildAt(0);
        childAt.getWindowVisibleDisplayFrame(this.w);
        int iWidth = this.w.width() / 2;
        childAt.getLocationInWindow(this.x);
        float f = this.e + this.f;
        float translationX = childAt.getTranslationX();
        float translationY = childAt.getTranslationY();
        if (this.g) {
            int width = childAt.getWidth();
            int height = childAt.getHeight();
            int[] iArr = this.x;
            int i = (width / 2) + iArr[0];
            int i2 = (height / 2) + iArr[1];
            fSqrt2 = ((float) Math.sqrt((i - iWidth) * this.b * A)) * f;
            fSqrt = ((float) Math.sqrt(i2 * this.b * 0.002f)) * f;
        } else {
            fSqrt = this.f16768a * 0.2f * f;
            fSqrt2 = BitmapDescriptorFactory.HUE_RED;
        }
        this.c = (int) (fSqrt2 + translationX + 0.5f);
        this.d = (int) (fSqrt + translationY + 0.5f);
    }

    private boolean h() {
        boolean z2 = false;
        boolean z3 = this.i && !(this.t == null && this.v == null);
        boolean z4 = this.j && !(this.p == null && this.r == null);
        if (!z3 && !z4 && getBackground() == null && getForeground() == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        return z2;
    }

    public float b() {
        return this.f;
    }

    public float c() {
        return this.e;
    }

    public boolean d() {
        return this.g;
    }

    public boolean i() {
        return this.i;
    }

    public boolean j() {
        if (e()) {
            return this.h;
        }
        return true;
    }

    public boolean k() {
        return this.j;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getChildCount() <= 0 || getChildAt(0).getVisibility() != 0) {
            return;
        }
        if (this.i) {
            NinePatchDrawable ninePatchDrawable = this.t;
            if (ninePatchDrawable != null) {
                ninePatchDrawable.draw(canvas);
            }
            NinePatchDrawable ninePatchDrawable2 = this.v;
            if (ninePatchDrawable2 != null) {
                ninePatchDrawable2.draw(canvas);
            }
        }
        if (this.j) {
            if (this.p == null && this.r == null) {
                return;
            }
            int iSave = canvas.save();
            canvas.translate(this.c, this.d);
            NinePatchDrawable ninePatchDrawable3 = this.p;
            if (ninePatchDrawable3 != null) {
                ninePatchDrawable3.draw(canvas);
            }
            NinePatchDrawable ninePatchDrawable4 = this.r;
            if (ninePatchDrawable4 != null) {
                ninePatchDrawable4.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        f();
        g();
        if (j()) {
            return;
        }
        b(this.e, this.f, true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f = aVar.b;
        this.e = aVar.f16769a;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        e(true);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.b = this.f;
        aVar.f16769a = this.e;
        aVar.c = this.g;
        aVar.d = this.h;
        aVar.e = this.i;
        aVar.f = this.j;
        return aVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        f();
        g();
    }

    @SuppressLint
    private void a() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (layoutParams.gravity == -1) {
                layoutParams.gravity = 51;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public static boolean e() {
        return true;
    }

    public void b(float f) {
        if (this.e == f) {
            return;
        }
        this.e = f;
        e(false);
    }

    public void c(boolean z2) {
        if (this.i == z2) {
            return;
        }
        this.i = z2;
        if (h()) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        postInvalidateOnAnimation();
    }

    public void d(boolean z2) {
        if (this.j == z2) {
            return;
        }
        this.j = z2;
        if (h()) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        postInvalidateOnAnimation();
    }

    private void b(float f, float f2, boolean z2) {
        if (z2) {
            this.p = null;
            this.o = 0;
            this.r = null;
            this.q = 0;
            this.t = null;
            this.s = 0;
            this.v = null;
            this.u = 0;
            h();
        }
        View childAt = getChildCount() > 0 ? getChildAt(0) : null;
        if (childAt != null) {
            ViewCompat.O(childAt, f);
            ViewCompat.F(childAt, f2);
        }
    }

    public void a(float f) {
        if (this.f == f) {
            return;
        }
        this.f = f;
        e(false);
    }

    private void a(int i, int i2) {
        int iMin = Math.min(1, getChildCount());
        boolean z2 = (View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) ? false : true;
        View view = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < iMin; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                measureChildWithMargins(childAt, i, 0, i2, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int iMax = Math.max(i3, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                int iMax2 = Math.max(i4, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                int measuredState = childAt.getMeasuredState() | i5;
                if (z2 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                    view = childAt;
                }
                i5 = measuredState;
                i4 = iMax2;
                i3 = iMax;
            }
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iMax3 = Math.max(i4 + paddingBottom, getSuggestedMinimumHeight());
        int iMax4 = Math.max(i3 + paddingRight, getSuggestedMinimumWidth());
        Drawable foreground = getForeground();
        if (foreground != null) {
            iMax3 = Math.max(iMax3, foreground.getMinimumHeight());
            iMax4 = Math.max(iMax4, foreground.getMinimumWidth());
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax4, i, i5), View.resolveSizeAndState(iMax3, i2, i5 << 16));
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i7 = marginLayoutParams.width;
            int iMakeMeasureSpec = i7 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - paddingRight) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i, paddingRight + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, i7);
            int i8 = marginLayoutParams.height;
            view.measure(iMakeMeasureSpec, i8 == -1 ? View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - paddingBottom) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824) : ViewGroup.getChildMeasureSpec(i2, paddingBottom + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, i8));
        }
    }

    public void b(boolean z2) {
        if (this.h == z2) {
            return;
        }
        boolean zJ = j();
        this.h = z2;
        boolean zJ2 = j();
        if (zJ != zJ2) {
            if (zJ2 && e()) {
                b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, true);
            }
            e(true);
        }
    }

    private void a(NinePatchDrawable ninePatchDrawable, int i, int i2, int i3, int i4) {
        if (ninePatchDrawable == null) {
            return;
        }
        Rect rect = this.w;
        ninePatchDrawable.getPadding(rect);
        ninePatchDrawable.setBounds(i - rect.left, i2 - rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void a(boolean z2) {
        if (this.g == z2) {
            return;
        }
        this.g = z2;
        if (j()) {
            e(true);
        }
    }

    private int[] a(Resources resources, int i) throws Resources.NotFoundException {
        if (i == 0 || isInEditMode()) {
            return null;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        int length = typedArrayObtainTypedArray.length();
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = typedArrayObtainTypedArray.getResourceId(i2, 0);
        }
        typedArrayObtainTypedArray.recycle();
        return iArr;
    }

    private NinePatchDrawable a(int i) {
        Drawable drawable = (i == 0 || i4.c().b() == null) ? null : i4.c().b().getDrawable(i);
        if (drawable instanceof NinePatchDrawable) {
            return (NinePatchDrawable) drawable;
        }
        return null;
    }

    private void a(float f, float f2, boolean z2) {
        float fMax = Math.max((f + f2) * this.b, BitmapDescriptorFactory.HUE_RED);
        int i = (int) fMax;
        int iMin = Math.min(i, this.m);
        int i2 = i + 1;
        int iMin2 = Math.min(i2, this.m);
        int iMin3 = Math.min(i, this.n);
        int iMin4 = Math.min(i2, this.n);
        int[] iArr = this.k;
        int i3 = iArr != null ? iArr[iMin] : 0;
        int i4 = iArr != null ? iArr[iMin2] : 0;
        int[] iArr2 = this.l;
        int i5 = iArr2 != null ? iArr2[iMin3] : 0;
        int i6 = iArr2 != null ? iArr2[iMin4] : 0;
        if (z2 || i3 != this.o || i4 != this.q || i5 != this.s || i6 != this.u) {
            if (i3 != this.o) {
                this.p = a(i3);
                this.o = i3;
            }
            if (i4 != this.q) {
                this.r = i4 == i3 ? null : a(i4);
                if (i4 == i3) {
                    i4 = 0;
                }
                this.q = i4;
            }
            if (i5 != this.s) {
                this.t = a(i5);
                this.s = i5;
            }
            if (i6 != this.u) {
                this.v = i6 != i5 ? a(i6) : null;
                if (i6 == i5) {
                    i6 = 0;
                }
                this.u = i6;
            }
            f();
            g();
            h();
        }
        int iMin5 = 255 - Math.min(Math.max((int) YU.a.a(fMax, i, 255.0f, 0.5f), 0), 255);
        int i7 = 255 - iMin5;
        NinePatchDrawable ninePatchDrawable = this.p;
        if (ninePatchDrawable != null) {
            if (this.r != null) {
                ninePatchDrawable.setAlpha(iMin5);
            } else {
                ninePatchDrawable.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable2 = this.r;
        if (ninePatchDrawable2 != null) {
            ninePatchDrawable2.setAlpha(i7);
        }
        NinePatchDrawable ninePatchDrawable3 = this.t;
        if (ninePatchDrawable3 != null) {
            if (this.v != null) {
                ninePatchDrawable3.setAlpha(iMin5);
            } else {
                ninePatchDrawable3.setAlpha(255);
            }
        }
        NinePatchDrawable ninePatchDrawable4 = this.v;
        if (ninePatchDrawable4 != null) {
            ninePatchDrawable4.setAlpha(i7);
        }
        if (willNotDraw()) {
            return;
        }
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        postInvalidateOnAnimation();
    }
}
