package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@RequiresApi
/* loaded from: classes5.dex */
final class zzaaw {
    public static void zza(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == BitmapDescriptorFactory.HUE_RED ? 0 : 1);
        } catch (IllegalStateException e) {
            zzds.zzf("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
