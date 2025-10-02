package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Constraints extends ViewGroup {
    public ConstraintSet d;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ConstraintSet getConstraintSet() {
        if (this.d == null) {
            this.d = new ConstraintSet();
        }
        ConstraintSet constraintSet = this.d;
        constraintSet.getClass();
        int childCount = getChildCount();
        HashMap map = constraintSet.g;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (constraintSet.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new ConstraintSet.Constraint());
            }
            ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) map.get(Integer.valueOf(id));
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                    ConstraintSet.Layout layout = constraint.e;
                    constraint.e(id, layoutParams);
                    if (constraintHelper instanceof Barrier) {
                        layout.i0 = 1;
                        Barrier barrier = (Barrier) constraintHelper;
                        layout.g0 = barrier.getType();
                        layout.j0 = barrier.getReferencedIds();
                        layout.h0 = barrier.getMargin();
                    }
                }
                constraint.e(id, layoutParams);
            }
        }
        return this.d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public final float A0;
        public final float B0;
        public final float C0;
        public final float D0;
        public final float r0;
        public final boolean s0;
        public final float t0;
        public final float u0;
        public final float v0;
        public final float w0;
        public final float x0;
        public final float y0;
        public final float z0;

        public LayoutParams() {
            super(-2, -2);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = BitmapDescriptorFactory.HUE_RED;
            this.u0 = BitmapDescriptorFactory.HUE_RED;
            this.v0 = BitmapDescriptorFactory.HUE_RED;
            this.w0 = BitmapDescriptorFactory.HUE_RED;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = BitmapDescriptorFactory.HUE_RED;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = BitmapDescriptorFactory.HUE_RED;
            this.u0 = BitmapDescriptorFactory.HUE_RED;
            this.v0 = BitmapDescriptorFactory.HUE_RED;
            this.w0 = BitmapDescriptorFactory.HUE_RED;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = BitmapDescriptorFactory.HUE_RED;
            this.A0 = BitmapDescriptorFactory.HUE_RED;
            this.B0 = BitmapDescriptorFactory.HUE_RED;
            this.C0 = BitmapDescriptorFactory.HUE_RED;
            this.D0 = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.g);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.r0 = typedArrayObtainStyledAttributes.getFloat(index, this.r0);
                } else if (index == 28) {
                    this.t0 = typedArrayObtainStyledAttributes.getFloat(index, this.t0);
                    this.s0 = true;
                } else if (index == 23) {
                    this.v0 = typedArrayObtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == 24) {
                    this.w0 = typedArrayObtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == 22) {
                    this.u0 = typedArrayObtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == 20) {
                    this.x0 = typedArrayObtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == 21) {
                    this.y0 = typedArrayObtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == 16) {
                    this.z0 = typedArrayObtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == 17) {
                    this.A0 = typedArrayObtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == 18) {
                    this.B0 = typedArrayObtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == 19) {
                    this.C0 = typedArrayObtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == 27) {
                    this.D0 = typedArrayObtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
