package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class CircularFlow extends VirtualLayout {
    public static int y;
    public static float z;
    public ConstraintLayout o;
    public int p;
    public float[] q;
    public int[] r;
    public int s;
    public int t;
    public String u;
    public String v;
    public Float w;
    public Integer x;

    public CircularFlow(Context context) {
        super(context);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.t = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                s(str.substring(i).trim());
                return;
            } else {
                s(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i = 0;
        this.s = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                t(str.substring(i).trim());
                return;
            } else {
                t(str.substring(i, iIndexOf).trim());
                i = iIndexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.q, this.t);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.r, this.s);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 33) {
                    this.p = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.u = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.v = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float fValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, z));
                    this.w = fValueOf;
                    setDefaultAngle(fValueOf.floatValue());
                } else if (index == 31) {
                    Integer numValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, y));
                    this.x = numValueOf;
                    setDefaultRadius(numValueOf.intValue());
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.u;
        if (str != null) {
            this.q = new float[1];
            setAngles(str);
        }
        String str2 = this.v;
        if (str2 != null) {
            this.r = new int[1];
            setRadius(str2);
        }
        Float f = this.w;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.x;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.o = (ConstraintLayout) getParent();
        for (int i = 0; i < this.e; i++) {
            View viewById = this.o.getViewById(this.d[i]);
            if (viewById != null) {
                int i2 = y;
                float f2 = z;
                int[] iArr = this.r;
                HashMap map = this.l;
                if (iArr == null || i >= iArr.length) {
                    Integer num2 = this.x;
                    if (num2 == null || num2.intValue() == -1) {
                        Log.e("CircularFlow", "Added radius to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.s++;
                        if (this.r == null) {
                            this.r = new int[1];
                        }
                        int[] radius = getRadius();
                        this.r = radius;
                        radius[this.s - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.q;
                if (fArr == null || i >= fArr.length) {
                    Float f3 = this.w;
                    if (f3 == null || f3.floatValue() == -1.0f) {
                        Log.e("CircularFlow", "Added angle to view with id: " + ((String) map.get(Integer.valueOf(viewById.getId()))));
                    } else {
                        this.t++;
                        if (this.q == null) {
                            this.q = new float[1];
                        }
                        float[] angles = getAngles();
                        this.q = angles;
                        angles[this.t - 1] = f2;
                    }
                } else {
                    f2 = fArr[i];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) viewById.getLayoutParams();
                layoutParams.r = f2;
                layoutParams.p = this.p;
                layoutParams.q = i2;
                viewById.setLayoutParams(layoutParams);
            }
        }
        e();
    }

    public final void s(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f == null || (fArr = this.q) == null) {
            return;
        }
        if (this.t + 1 > fArr.length) {
            this.q = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.q[this.t] = Integer.parseInt(str);
        this.t++;
    }

    public void setDefaultAngle(float f) {
        z = f;
    }

    public void setDefaultRadius(int i) {
        y = i;
    }

    public final void t(String str) {
        Context context;
        int[] iArr;
        if (str == null || str.length() == 0 || (context = this.f) == null || (iArr = this.r) == null) {
            return;
        }
        if (this.s + 1 > iArr.length) {
            this.r = Arrays.copyOf(iArr, iArr.length + 1);
        }
        this.r[this.s] = (int) (Integer.parseInt(str) * context.getResources().getDisplayMetrics().density);
        this.s++;
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
