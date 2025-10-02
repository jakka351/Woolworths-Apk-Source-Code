package com.scandit.datacapture.core.ui.animation;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public final class FloatValueHolder {

    /* renamed from: a, reason: collision with root package name */
    private float f18888a = BitmapDescriptorFactory.HUE_RED;

    public FloatValueHolder() {
    }

    public float getValue() {
        return this.f18888a;
    }

    public void setValue(float f) {
        this.f18888a = f;
    }

    public FloatValueHolder(float f) {
        setValue(f);
    }
}
