package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class c implements ArImagesLicenseFeature {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f18774a;
    private NativeFeatureAvailability b;

    public c(Function0 isArFullSupported) {
        Intrinsics.h(isArFullSupported, "isArFullSupported");
        this.f18774a = isArFullSupported;
        this.b = NativeFeatureAvailability.UNKNOWN;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.utils.ArImagesLicenseFeature
    public final boolean getShouldStripImages() {
        if (this.b == NativeFeatureAvailability.UNKNOWN) {
            this.b = (NativeFeatureAvailability) this.f18774a.invoke();
        }
        return this.b != NativeFeatureAvailability.SUPPORTED;
    }
}
