package com.scandit.datacapture.barcode;

import com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter;
import com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class B6 implements TrackedObjectAugmenter.Factory {
    @Override // com.scandit.datacapture.core.internal.sdk.ui.overlay.TrackedObjectAugmenter.Factory
    public final TrackedObjectAugmenter forHost(TrackedObjectAugmenter.Host host, ArImagesLicenseFeature imagesLicenseFeature) {
        Intrinsics.h(host, "host");
        Intrinsics.h(imagesLicenseFeature, "imagesLicenseFeature");
        return new F6(host, imagesLicenseFeature);
    }
}
