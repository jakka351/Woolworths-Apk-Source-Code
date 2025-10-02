package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.RelativeCornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes6.dex */
class RadialViewGroup extends ConstraintLayout {
    public final b d;
    public int e;
    public final MaterialShapeDrawable f;

    public RadialViewGroup(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = ViewCompat.f2488a;
            view.setId(View.generateViewId());
        }
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.d;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    public void d() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.g(this);
        HashMap map = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!map.containsKey(i2)) {
                    map.put(i2, new ArrayList());
                }
                ((List) map.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            int iRound = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(this.e * 0.66f) : this.e;
            Iterator it = list.iterator();
            float size = BitmapDescriptorFactory.HUE_RED;
            while (it.hasNext()) {
                ConstraintSet.Layout layout = constraintSet.k(((View) it.next()).getId()).e;
                layout.A = R.id.circle_center;
                layout.B = iRound;
                layout.C = size;
                size += 360.0f / list.size();
            }
        }
        constraintSet.c(this);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            b bVar = this.d;
            handler.removeCallbacks(bVar);
            handler.post(bVar);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f.m(ColorStateList.valueOf(i));
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable();
        this.f = materialShapeDrawable;
        RelativeCornerSize relativeCornerSize = new RelativeCornerSize(0.5f);
        ShapeAppearanceModel.Builder builderG = materialShapeDrawable.d.f14634a.g();
        builderG.e = relativeCornerSize;
        builderG.f = relativeCornerSize;
        builderG.g = relativeCornerSize;
        builderG.h = relativeCornerSize;
        materialShapeDrawable.setShapeAppearanceModel(builderG.a());
        this.f.m(ColorStateList.valueOf(-1));
        MaterialShapeDrawable materialShapeDrawable2 = this.f;
        WeakHashMap weakHashMap = ViewCompat.f2488a;
        setBackground(materialShapeDrawable2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.google.android.material.R.styleable.S, i, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.d = new b(this, 1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
