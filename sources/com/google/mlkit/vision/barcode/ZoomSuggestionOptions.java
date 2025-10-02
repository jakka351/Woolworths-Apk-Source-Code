package com.google.mlkit.vision.barcode;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes6.dex */
public class ZoomSuggestionOptions {

    public static class Builder {
    }

    public interface ZoomCallback {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ZoomSuggestionOptions) && Objects.equal(null, null);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
    }
}
