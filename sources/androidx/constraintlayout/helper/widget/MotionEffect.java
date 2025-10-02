package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.R;

/* loaded from: classes2.dex */
public class MotionEffect extends MotionHelper {
    public float q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;

    public MotionEffect(Context context) {
        super(context);
        this.q = 0.1f;
        this.r = 49;
        this.s = 50;
        this.t = 0;
        this.u = 0;
        this.v = true;
        this.w = -1;
        this.x = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0175, code lost:
    
        if (r14 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018b, code lost:
    
        if (r14 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019c, code lost:
    
        if (r15 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d7  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.constraintlayout.motion.widget.MotionLayout r24, java.util.HashMap r25) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.r(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void s(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    int i2 = typedArrayObtainStyledAttributes.getInt(index, this.r);
                    this.r = i2;
                    this.r = Math.max(Math.min(i2, 99), 0);
                } else if (index == 1) {
                    int i3 = typedArrayObtainStyledAttributes.getInt(index, this.s);
                    this.s = i3;
                    this.s = Math.max(Math.min(i3, 99), 0);
                } else if (index == 5) {
                    this.t = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.t);
                } else if (index == 6) {
                    this.u = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.u);
                } else if (index == 0) {
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                } else if (index == 2) {
                    this.x = typedArrayObtainStyledAttributes.getInt(index, this.x);
                } else if (index == 4) {
                    this.v = typedArrayObtainStyledAttributes.getBoolean(index, this.v);
                } else if (index == 7) {
                    this.w = typedArrayObtainStyledAttributes.getResourceId(index, this.w);
                }
            }
            int i4 = this.r;
            int i5 = this.s;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.r = i4 - 1;
                } else {
                    this.s = i5 + 1;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.q = 0.1f;
        this.r = 49;
        this.s = 50;
        this.t = 0;
        this.u = 0;
        this.v = true;
        this.w = -1;
        this.x = -1;
        s(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = 0.1f;
        this.r = 49;
        this.s = 50;
        this.t = 0;
        this.u = 0;
        this.v = true;
        this.w = -1;
        this.x = -1;
        s(context, attributeSet);
    }
}
