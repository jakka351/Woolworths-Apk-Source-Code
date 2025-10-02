package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements MotionHelperInterface {
    public boolean m;
    public boolean n;
    public float o;
    public View[] p;

    public MotionHelper(Context context) {
        super(context);
        this.m = false;
        this.n = false;
    }

    public void a(int i) {
    }

    public float getProgress() {
        return this.o;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.t);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.m = typedArrayObtainStyledAttributes.getBoolean(index, this.m);
                } else if (index == 0) {
                    this.n = typedArrayObtainStyledAttributes.getBoolean(index, this.n);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void r(MotionLayout motionLayout, HashMap map) {
    }

    public void setProgress(float f) {
        this.o = f;
        int i = 0;
        if (this.e > 0) {
            this.p = j((ConstraintLayout) getParent());
            while (i < this.e) {
                View view = this.p[i];
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            viewGroup.getChildAt(i);
            i++;
        }
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = false;
        this.n = false;
        k(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = false;
        this.n = false;
        k(attributeSet);
    }
}
