package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MotionTelltales extends MockView {
    public final Paint o;
    public MotionLayout p;
    public final float[] q;
    public final Matrix r;
    public int s;
    public int t;
    public float u;

    public MotionTelltales(Context context) {
        super(context);
        this.o = new Paint();
        this.q = new float[2];
        this.r = new Matrix();
        this.s = 0;
        this.t = -65281;
        this.u = 0.25f;
        b(context, null);
    }

    public final void b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.x);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.t = typedArrayObtainStyledAttributes.getColor(index, this.t);
                } else if (index == 2) {
                    this.s = typedArrayObtainStyledAttributes.getInt(index, this.s);
                } else if (index == 1) {
                    this.u = typedArrayObtainStyledAttributes.getFloat(index, this.u);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i2 = this.t;
        Paint paint = this.o;
        paint.setColor(i2);
        paint.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Matrix matrix = getMatrix();
        Matrix matrix2 = this.r;
        matrix.invert(matrix2);
        if (this.p == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.p = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.p.v(this, f2, f, this.q, this.s);
                float[] fArr2 = this.q;
                matrix2.mapVectors(fArr2);
                float f3 = width * f2;
                float f4 = height * f;
                float f5 = fArr2[0];
                float f6 = this.u;
                float f7 = f4 - (fArr2[1] * f6);
                matrix2.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f7, this.o);
            }
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.i = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o = new Paint();
        this.q = new float[2];
        this.r = new Matrix();
        this.s = 0;
        this.t = -65281;
        this.u = 0.25f;
        b(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new Paint();
        this.q = new float[2];
        this.r = new Matrix();
        this.s = 0;
        this.t = -65281;
        this.u = 0.25f;
        b(context, attributeSet);
    }
}
