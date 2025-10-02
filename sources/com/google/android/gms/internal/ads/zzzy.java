package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzzy extends zzss {
    public zzzy(Throwable th, @Nullable zzst zzstVar, @Nullable Surface surface) {
        super(th, zzstVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
    }
}
