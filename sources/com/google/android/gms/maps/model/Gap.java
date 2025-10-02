package com.google.android.gms.maps.model;

import android.support.v4.media.session.a;
import androidx.annotation.NonNull;

/* loaded from: classes5.dex */
public final class Gap extends PatternItem {
    public final float length;

    public Gap(float f) {
        super(2, Float.valueOf(Math.max(f, BitmapDescriptorFactory.HUE_RED)));
        this.length = Math.max(f, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    @NonNull
    public String toString() {
        return a.j(this.length, "]", new StringBuilder("[Gap: length="));
    }
}
