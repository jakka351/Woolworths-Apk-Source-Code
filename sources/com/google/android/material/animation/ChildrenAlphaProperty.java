package com.google.android.material.animation;

import android.util.Property;
import android.view.ViewGroup;
import com.woolworths.R;

/* loaded from: classes6.dex */
public class ChildrenAlphaProperty extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final ChildrenAlphaProperty f14506a = new ChildrenAlphaProperty(Float.class, "childrenAlpha");

    @Override // android.util.Property
    public final Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f != null ? f : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(ViewGroup viewGroup, Float f) {
        ViewGroup viewGroup2 = viewGroup;
        Float f2 = f;
        float fFloatValue = f2.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f2);
        int childCount = viewGroup2.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup2.getChildAt(i).setAlpha(fFloatValue);
        }
    }
}
