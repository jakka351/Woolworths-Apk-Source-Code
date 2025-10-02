package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;

@Deprecated
/* loaded from: classes5.dex */
public interface PreloadCallback {
    void onAdsAvailable(@NonNull PreloadConfiguration preloadConfiguration);

    void onAdsExhausted(@NonNull PreloadConfiguration preloadConfiguration);
}
