package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public class Layer extends ConstraintHelper {
    public float A;
    public float B;
    public boolean C;
    public boolean D;
    public float m;
    public float n;
    public float o;
    public ConstraintLayout p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public final boolean y;
    public View[] z;

    public Layer(Context context) {
        super(context);
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.q = 1.0f;
        this.r = 1.0f;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = Float.NaN;
        this.x = Float.NaN;
        this.y = true;
        this.z = null;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.B = BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.h = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.c);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.C = true;
                } else if (index == 22) {
                    this.D = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n() {
        s();
        this.s = Float.NaN;
        this.t = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).q0;
        constraintWidget.W(0);
        constraintWidget.R(0);
        r();
        layout(((int) this.w) - getPaddingLeft(), ((int) this.x) - getPaddingTop(), getPaddingRight() + ((int) this.u), getPaddingBottom() + ((int) this.v));
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(ConstraintLayout constraintLayout) {
        this.p = constraintLayout;
        float rotation = getRotation();
        if (rotation != BitmapDescriptorFactory.HUE_RED) {
            this.o = rotation;
        } else {
            if (Float.isNaN(this.o)) {
                return;
            }
            this.o = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p = (ConstraintLayout) getParent();
        if (this.C || this.D) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.e; i++) {
                View viewById = this.p.getViewById(this.d[i]);
                if (viewById != null) {
                    if (this.C) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.D && elevation > BitmapDescriptorFactory.HUE_RED) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void r() {
        if (this.p == null) {
            return;
        }
        if (this.y || Float.isNaN(this.s) || Float.isNaN(this.t)) {
            if (!Float.isNaN(this.m) && !Float.isNaN(this.n)) {
                this.t = this.n;
                this.s = this.m;
                return;
            }
            View[] viewArrJ = j(this.p);
            int left = viewArrJ[0].getLeft();
            int top = viewArrJ[0].getTop();
            int right = viewArrJ[0].getRight();
            int bottom = viewArrJ[0].getBottom();
            for (int i = 0; i < this.e; i++) {
                View view = viewArrJ[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.u = right;
            this.v = bottom;
            this.w = left;
            this.x = top;
            if (Float.isNaN(this.m)) {
                this.s = (left + right) / 2;
            } else {
                this.s = this.m;
            }
            if (Float.isNaN(this.n)) {
                this.t = (top + bottom) / 2;
            } else {
                this.t = this.n;
            }
        }
    }

    public final void s() {
        int i;
        if (this.p == null || (i = this.e) == 0) {
            return;
        }
        View[] viewArr = this.z;
        if (viewArr == null || viewArr.length != i) {
            this.z = new View[i];
        }
        for (int i2 = 0; i2 < this.e; i2++) {
            this.z[i2] = this.p.getViewById(this.d[i2]);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        e();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.m = f;
        t();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.n = f;
        t();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.o = f;
        t();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.q = f;
        t();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.r = f;
        t();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.A = f;
        t();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.B = f;
        t();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        e();
    }

    public final void t() {
        if (this.p == null) {
            return;
        }
        if (this.z == null) {
            s();
        }
        r();
        double radians = Float.isNaN(this.o) ? 0.0d : Math.toRadians(this.o);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.q;
        float f2 = f * fCos;
        float f3 = this.r;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.e; i++) {
            View view = this.z[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.s;
            float f8 = bottom - this.t;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.A;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.B;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.r);
            view.setScaleX(this.q);
            if (!Float.isNaN(this.o)) {
                view.setRotation(this.o);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.q = 1.0f;
        this.r = 1.0f;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = Float.NaN;
        this.x = Float.NaN;
        this.y = true;
        this.z = null;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.B = BitmapDescriptorFactory.HUE_RED;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.q = 1.0f;
        this.r = 1.0f;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = Float.NaN;
        this.w = Float.NaN;
        this.x = Float.NaN;
        this.y = true;
        this.z = null;
        this.A = BitmapDescriptorFactory.HUE_RED;
        this.B = BitmapDescriptorFactory.HUE_RED;
    }
}
