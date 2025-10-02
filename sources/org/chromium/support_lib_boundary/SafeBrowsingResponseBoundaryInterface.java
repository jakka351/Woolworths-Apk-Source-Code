package org.chromium.support_lib_boundary;

import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public interface SafeBrowsingResponseBoundaryInterface {
    void backToSafety(boolean z);

    void proceed(boolean z);

    void showInterstitial(boolean z);
}
