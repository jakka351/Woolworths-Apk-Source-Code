package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzft implements ObjectEncoder {
    static final zzft zza = new zzft();

    static {
        a.m(14, a.f(13, a.f(12, a.f(11, a.f(10, a.f(9, a.f(8, a.f(7, a.f(6, a.f(5, a.f(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("source"), "appliedFilter"), "isAutoCaptureManuallyTriggered"), "isRotated"), "hasLowConfidenceProposedCorners"), "autoCaptureTriggerLatencyMs"), "galleryImportProcessingMs"), "imageWidth"), "imageHeight"), "proposedCorners"), "adjustedCorners"), "isShadowRemoved"), "numOfAppliedCleanUpStrokes"), "numOfAttemptedCleanUpStrokes"));
    }

    private zzft() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
