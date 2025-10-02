package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzjz implements ObjectEncoder {
    static final zzjz zza = new zzjz();

    static {
        a.A(14, a.y(13, a.y(12, a.y(11, a.y(10, a.y(9, a.y(8, a.y(7, a.y(6, a.y(5, a.y(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("source"), "appliedFilter"), "isAutoCaptureManuallyTriggered"), "isRotated"), "hasLowConfidenceProposedCorners"), "autoCaptureTriggerLatencyMs"), "galleryImportProcessingMs"), "imageWidth"), "imageHeight"), "proposedCorners"), "adjustedCorners"), "isShadowRemoved"), "numOfAppliedCleanUpStrokes"), "numOfAttemptedCleanUpStrokes"));
    }

    private zzjz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
