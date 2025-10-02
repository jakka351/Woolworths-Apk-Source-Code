package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.SharedValues;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ReactiveGuide extends View implements SharedValues.SharedValuesListener {
    public int d;
    public boolean e;
    public int f;
    public boolean g;

    public ReactiveGuide(Context context) {
        super(context);
        this.d = -1;
        this.e = false;
        this.f = 0;
        this.g = true;
        super.setVisibility(8);
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.d);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                } else if (index == 0) {
                    this.e = typedArrayObtainStyledAttributes.getBoolean(index, this.e);
                } else if (index == 2) {
                    this.f = typedArrayObtainStyledAttributes.getResourceId(index, this.f);
                } else if (index == 1) {
                    this.g = typedArrayObtainStyledAttributes.getBoolean(index, this.g);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.d != -1) {
            ConstraintLayout.getSharedValues().a(this.d, this);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f;
    }

    public int getAttributeId() {
        return this.d;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z) {
        this.e = z;
    }

    public void setApplyToConstraintSetId(int i) {
        this.f = i;
    }

    public void setAttributeId(int i) {
        HashSet hashSet;
        SharedValues sharedValues = ConstraintLayout.getSharedValues();
        int i2 = this.d;
        if (i2 != -1 && (hashSet = (HashSet) sharedValues.f2377a.get(Integer.valueOf(i2))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                SharedValues.SharedValuesListener sharedValuesListener = (SharedValues.SharedValuesListener) weakReference.get();
                if (sharedValuesListener == null || sharedValuesListener == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.d = i;
        if (i != -1) {
            sharedValues.a(i, this);
        }
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f2362a = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.b = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.c = f;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = -1;
        this.e = false;
        this.f = 0;
        this.g = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = -1;
        this.e = false;
        this.f = 0;
        this.g = true;
        super.setVisibility(8);
        a(attributeSet);
    }
}
