package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes2.dex */
public class Grid extends VirtualLayout {
    public int A;
    public int B;
    public boolean[][] C;
    public final HashSet D;
    public int[] E;
    public View[] o;
    public ConstraintLayout p;
    public int q;
    public int r;
    public int s;
    public int t;
    public String u;
    public String v;
    public String w;
    public String x;
    public float y;
    public float z;

    public Grid(Context context) {
        super(context);
        this.B = 0;
        this.D = new HashSet();
    }

    public static int[][] B(String str) {
        String[] strArrSplit = str.split(",");
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
        for (int i = 0; i < strArrSplit.length; i++) {
            String[] strArrSplit2 = strArrSplit[i].trim().split(":");
            String[] strArrSplit3 = strArrSplit2[1].split("x");
            iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
            iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
            iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
        }
        return iArr;
    }

    public static float[] C(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    private int getNextPosition() {
        boolean z = false;
        int i = 0;
        while (!z) {
            i = this.B;
            if (i >= this.q * this.s) {
                return -1;
            }
            int iX = x(i);
            int iW = w(this.B);
            boolean[] zArr = this.C[iX];
            if (zArr[iW]) {
                zArr[iW] = false;
                z = true;
            }
            this.B++;
        }
        return i;
    }

    public static void s(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.H = -1.0f;
        layoutParams.f = -1;
        layoutParams.e = -1;
        layoutParams.g = -1;
        layoutParams.h = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public static void t(View view) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        layoutParams.I = -1.0f;
        layoutParams.j = -1;
        layoutParams.i = -1;
        layoutParams.k = -1;
        layoutParams.l = -1;
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -1;
        view.setLayoutParams(layoutParams);
    }

    public final View A() {
        View view = new View(getContext());
        view.setId(View.generateViewId());
        view.setVisibility(4);
        this.p.addView(view, new ConstraintLayout.LayoutParams(0, 0));
        return view;
    }

    public final void D() {
        int i;
        int i2 = this.r;
        if (i2 != 0 && (i = this.t) != 0) {
            this.q = i2;
            this.s = i;
            return;
        }
        int i3 = this.t;
        if (i3 > 0) {
            this.s = i3;
            this.q = ((this.e + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.q = i2;
            this.s = ((this.e + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.e) + 1.5d);
            this.q = iSqrt;
            this.s = ((this.e + iSqrt) - 1) / iSqrt;
        }
    }

    public String getColumnWeights() {
        return this.x;
    }

    public int getColumns() {
        return this.t;
    }

    public float getHorizontalGaps() {
        return this.y;
    }

    public int getOrientation() {
        return this.A;
    }

    public String getRowWeights() {
        return this.w;
    }

    public int getRows() {
        return this.r;
    }

    public String getSkips() {
        return this.v;
    }

    public String getSpans() {
        return this.u;
    }

    public float getVerticalGaps() {
        return this.z;
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.h = true;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.i);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 5) {
                    this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 1) {
                    this.t = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 7) {
                    this.u = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 6) {
                    this.v = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 4) {
                    this.w = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 0) {
                    this.x = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == 3) {
                    this.A = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 2) {
                    this.y = typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == 10) {
                    this.z = typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == 9) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                } else if (index == 8) {
                    typedArrayObtainStyledAttributes.getBoolean(index, false);
                }
            }
            D();
            y();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = (ConstraintLayout) getParent();
        v(false);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            Paint paint = new Paint();
            paint.setColor(-65536);
            paint.setStyle(Paint.Style.STROKE);
            int top = getTop();
            int left = getLeft();
            int bottom = getBottom();
            int right = getRight();
            for (View view : this.o) {
                int left2 = view.getLeft() - left;
                int top2 = view.getTop() - top;
                int right2 = view.getRight() - left;
                int bottom2 = view.getBottom() - top;
                canvas.drawRect(left2, BitmapDescriptorFactory.HUE_RED, right2, bottom - top, paint);
                canvas.drawRect(BitmapDescriptorFactory.HUE_RED, top2, right - left, bottom2, paint);
            }
        }
    }

    public void setColumnWeights(String str) {
        String str2 = this.x;
        if (str2 == null || !str2.equals(str)) {
            this.x = str;
            v(true);
            invalidate();
        }
    }

    public void setColumns(int i) {
        if (i <= 50 && this.t != i) {
            this.t = i;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setHorizontalGaps(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && this.y != f) {
            this.y = f;
            v(true);
            invalidate();
        }
    }

    public void setOrientation(int i) {
        if ((i == 0 || i == 1) && this.A != i) {
            this.A = i;
            v(true);
            invalidate();
        }
    }

    public void setRowWeights(String str) {
        String str2 = this.w;
        if (str2 == null || !str2.equals(str)) {
            this.w = str;
            v(true);
            invalidate();
        }
    }

    public void setRows(int i) {
        if (i <= 50 && this.r != i) {
            this.r = i;
            D();
            y();
            v(false);
            invalidate();
        }
    }

    public void setSkips(String str) {
        String str2 = this.v;
        if (str2 == null || !str2.equals(str)) {
            this.v = str;
            v(true);
            invalidate();
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.u;
        if (str == null || !str.contentEquals(charSequence)) {
            this.u = charSequence.toString();
            v(true);
            invalidate();
        }
    }

    public void setVerticalGaps(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED && this.z != f) {
            this.z = f;
            v(true);
            invalidate();
        }
    }

    public final void u(View view, int i, int i2, int i3, int i4) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int[] iArr = this.E;
        layoutParams.e = iArr[i2];
        layoutParams.i = iArr[i];
        layoutParams.h = iArr[(i2 + i4) - 1];
        layoutParams.l = iArr[(i + i3) - 1];
        view.setLayoutParams(layoutParams);
    }

    public final void v(boolean z) {
        int i;
        int i2;
        int[][] iArrB;
        int[][] iArrB2;
        if (this.p == null || this.q < 1 || this.s < 1) {
            return;
        }
        HashSet hashSet = this.D;
        if (z) {
            for (int i3 = 0; i3 < this.C.length; i3++) {
                int i4 = 0;
                while (true) {
                    boolean[][] zArr = this.C;
                    if (i4 < zArr[0].length) {
                        zArr[i3][i4] = true;
                        i4++;
                    }
                }
            }
            hashSet.clear();
        }
        this.B = 0;
        int iMax = Math.max(this.q, this.s);
        View[] viewArr = this.o;
        if (viewArr == null) {
            this.o = new View[iMax];
            int i5 = 0;
            while (true) {
                View[] viewArr2 = this.o;
                if (i5 >= viewArr2.length) {
                    break;
                }
                viewArr2[i5] = A();
                i5++;
            }
        } else if (iMax != viewArr.length) {
            View[] viewArr3 = new View[iMax];
            for (int i6 = 0; i6 < iMax; i6++) {
                View[] viewArr4 = this.o;
                if (i6 < viewArr4.length) {
                    viewArr3[i6] = viewArr4[i6];
                } else {
                    viewArr3[i6] = A();
                }
            }
            int i7 = iMax;
            while (true) {
                View[] viewArr5 = this.o;
                if (i7 >= viewArr5.length) {
                    break;
                }
                this.p.removeView(viewArr5[i7]);
                i7++;
            }
            this.o = viewArr3;
        }
        this.E = new int[iMax];
        int i8 = 0;
        while (true) {
            View[] viewArr6 = this.o;
            if (i8 >= viewArr6.length) {
                break;
            }
            this.E[i8] = viewArr6[i8].getId();
            i8++;
        }
        int id = getId();
        int iMax2 = Math.max(this.q, this.s);
        float[] fArrC = C(this.q, this.w);
        if (this.q == 1) {
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.o[0].getLayoutParams();
            t(this.o[0]);
            layoutParams.i = id;
            layoutParams.l = id;
            this.o[0].setLayoutParams(layoutParams);
        } else {
            int i9 = 0;
            while (true) {
                i = this.q;
                if (i9 >= i) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.o[i9].getLayoutParams();
                t(this.o[i9]);
                if (fArrC != null) {
                    layoutParams2.I = fArrC[i9];
                }
                if (i9 > 0) {
                    layoutParams2.j = this.E[i9 - 1];
                } else {
                    layoutParams2.i = id;
                }
                if (i9 < this.q - 1) {
                    layoutParams2.k = this.E[i9 + 1];
                } else {
                    layoutParams2.l = id;
                }
                if (i9 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = (int) this.y;
                }
                this.o[i9].setLayoutParams(layoutParams2);
                i9++;
            }
            while (i < iMax2) {
                ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) this.o[i].getLayoutParams();
                t(this.o[i]);
                layoutParams3.i = id;
                layoutParams3.l = id;
                this.o[i].setLayoutParams(layoutParams3);
                i++;
            }
        }
        int id2 = getId();
        int iMax3 = Math.max(this.q, this.s);
        float[] fArrC2 = C(this.s, this.x);
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) this.o[0].getLayoutParams();
        if (this.s == 1) {
            s(this.o[0]);
            layoutParams4.e = id2;
            layoutParams4.h = id2;
            this.o[0].setLayoutParams(layoutParams4);
        } else {
            int i10 = 0;
            while (true) {
                i2 = this.s;
                if (i10 >= i2) {
                    break;
                }
                ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) this.o[i10].getLayoutParams();
                s(this.o[i10]);
                if (fArrC2 != null) {
                    layoutParams5.H = fArrC2[i10];
                }
                if (i10 > 0) {
                    layoutParams5.f = this.E[i10 - 1];
                } else {
                    layoutParams5.e = id2;
                }
                if (i10 < this.s - 1) {
                    layoutParams5.g = this.E[i10 + 1];
                } else {
                    layoutParams5.h = id2;
                }
                if (i10 > 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams5).leftMargin = (int) this.y;
                }
                this.o[i10].setLayoutParams(layoutParams5);
                i10++;
            }
            while (i2 < iMax3) {
                ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) this.o[i2].getLayoutParams();
                s(this.o[i2]);
                layoutParams6.e = id2;
                layoutParams6.h = id2;
                this.o[i2].setLayoutParams(layoutParams6);
                i2++;
            }
        }
        String str = this.v;
        if (str != null && !str.trim().isEmpty() && (iArrB2 = B(this.v)) != null) {
            for (int i11 = 0; i11 < iArrB2.length; i11++) {
                int iX = x(iArrB2[i11][0]);
                int iW = w(iArrB2[i11][0]);
                int[] iArr = iArrB2[i11];
                if (!z(iX, iW, iArr[1], iArr[2])) {
                    break;
                }
            }
        }
        String str2 = this.u;
        if (str2 != null && !str2.trim().isEmpty() && (iArrB = B(this.u)) != null) {
            int[] iArr2 = this.d;
            View[] viewArrJ = j(this.p);
            for (int i12 = 0; i12 < iArrB.length; i12++) {
                int iX2 = x(iArrB[i12][0]);
                int iW2 = w(iArrB[i12][0]);
                int[] iArr3 = iArrB[i12];
                if (!z(iX2, iW2, iArr3[1], iArr3[2])) {
                    break;
                }
                View view = viewArrJ[i12];
                int[] iArr4 = iArrB[i12];
                u(view, iX2, iW2, iArr4[1], iArr4[2]);
                hashSet.add(Integer.valueOf(iArr2[i12]));
            }
        }
        View[] viewArrJ2 = j(this.p);
        for (int i13 = 0; i13 < this.e; i13++) {
            if (!hashSet.contains(Integer.valueOf(this.d[i13]))) {
                int nextPosition = getNextPosition();
                int iX3 = x(nextPosition);
                int iW3 = w(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    u(viewArrJ2[i13], iX3, iW3, 1, 1);
                }
            }
        }
    }

    public final int w(int i) {
        return this.A == 1 ? i / this.q : i % this.s;
    }

    public final int x(int i) {
        return this.A == 1 ? i % this.q : i / this.s;
    }

    public final void y() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.q, this.s);
        this.C = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
    }

    public final boolean z(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.C;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public Grid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = 0;
        this.D = new HashSet();
    }

    public Grid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.B = 0;
        this.D = new HashSet();
    }
}
