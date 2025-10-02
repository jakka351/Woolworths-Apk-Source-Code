package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public final class zzfni {
    public static String zza(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
            return "viewAlphaZero";
        }
        return null;
    }
}
