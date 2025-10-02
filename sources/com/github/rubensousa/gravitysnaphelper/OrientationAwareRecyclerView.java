package com.github.rubensousa.gravitysnaphelper;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes4.dex */
public class OrientationAwareRecyclerView extends RecyclerView {
    public float R0;
    public float S0;
    public boolean T0;

    public OrientationAwareRecyclerView(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if (layoutManager == null) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        boolean zH = true;
        if (actionMasked == 0) {
            this.R0 = motionEvent.getX();
            this.S0 = motionEvent.getY();
            if (this.T0) {
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                motionEventObtain.setAction(1);
                return super.onInterceptTouchEvent(motionEventObtain);
            }
        } else if (actionMasked == 2) {
            zH = Math.abs(motionEvent.getY() - this.S0) > Math.abs(motionEvent.getX() - this.R0) ? layoutManager.h() : layoutManager.g();
        }
        if (zH) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public OrientationAwareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OrientationAwareRecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.R0 = BitmapDescriptorFactory.HUE_RED;
        this.S0 = BitmapDescriptorFactory.HUE_RED;
        this.T0 = false;
        k(new RecyclerView.OnScrollListener() { // from class: com.github.rubensousa.gravitysnaphelper.OrientationAwareRecyclerView.1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void a(int i2, RecyclerView recyclerView) {
                OrientationAwareRecyclerView.this.T0 = i2 != 0;
            }
        });
    }
}
