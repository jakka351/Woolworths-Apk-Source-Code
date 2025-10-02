package com.github.rubensousa.gravitysnaphelper;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

/* loaded from: classes4.dex */
public class GravitySnapRecyclerView extends OrientationAwareRecyclerView {
    public final GravitySnapHelper U0;
    public final boolean V0;

    public GravitySnapRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public int getCurrentSnappedPosition() {
        View viewM;
        GravitySnapHelper gravitySnapHelper = this.U0;
        RecyclerView recyclerView = gravitySnapHelper.r;
        if (recyclerView == null || recyclerView.getLayoutManager() == null || (viewM = gravitySnapHelper.m(gravitySnapHelper.r.getLayoutManager(), true)) == null) {
            return -1;
        }
        gravitySnapHelper.r.getClass();
        return RecyclerView.N(viewM);
    }

    @NonNull
    public GravitySnapHelper getSnapHelper() {
        return this.U0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void o0(int i) {
        if (this.V0) {
            GravitySnapHelper gravitySnapHelper = this.U0;
            boolean zS = false;
            if (i == -1) {
                gravitySnapHelper.getClass();
            } else {
                zS = gravitySnapHelper.s(i, false);
            }
            if (zS) {
                return;
            }
        }
        super.o0(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(int i) {
        boolean zS;
        if (this.V0) {
            GravitySnapHelper gravitySnapHelper = this.U0;
            if (i == -1) {
                gravitySnapHelper.getClass();
                zS = false;
            } else {
                zS = gravitySnapHelper.s(i, true);
            }
            if (zS) {
                return;
            }
        }
        super.s0(i);
    }

    public void setSnapListener(@Nullable GravitySnapHelper.SnapListener snapListener) {
        this.U0.q = snapListener;
    }

    public GravitySnapRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GravitySnapRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.V0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f14359a, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, 0);
        if (i2 == 0) {
            this.U0 = new GravitySnapHelper(8388611);
        } else if (i2 == 1) {
            this.U0 = new GravitySnapHelper(48);
        } else if (i2 == 2) {
            this.U0 = new GravitySnapHelper(8388613);
        } else if (i2 == 3) {
            this.U0 = new GravitySnapHelper(80);
        } else if (i2 == 4) {
            this.U0 = new GravitySnapHelper(17);
        } else {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.U0.k = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.U0.h = typedArrayObtainStyledAttributes.getBoolean(2, false);
        GravitySnapHelper gravitySnapHelper = this.U0;
        float f = typedArrayObtainStyledAttributes.getFloat(3, -1.0f);
        gravitySnapHelper.m = -1;
        gravitySnapHelper.n = f;
        this.U0.l = typedArrayObtainStyledAttributes.getFloat(4, 100.0f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, true);
        GravitySnapHelper gravitySnapHelper2 = this.U0;
        if (z) {
            gravitySnapHelper2.b(this);
        } else {
            gravitySnapHelper2.b(null);
        }
        this.V0 = z;
        typedArrayObtainStyledAttributes.recycle();
    }
}
