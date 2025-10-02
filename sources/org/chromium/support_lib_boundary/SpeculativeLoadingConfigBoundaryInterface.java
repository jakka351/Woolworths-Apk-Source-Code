package org.chromium.support_lib_boundary;

import org.jspecify.annotations.NullMarked;

@NullMarked
/* loaded from: classes8.dex */
public interface SpeculativeLoadingConfigBoundaryInterface {
    int getMaxPrefetches();

    int getMaxPrerenders();

    int getPrefetchTTLSeconds();
}
