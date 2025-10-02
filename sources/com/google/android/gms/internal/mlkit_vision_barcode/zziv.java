package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zziv implements ObjectEncoder {
    static final zziv zza = new zziv();

    static {
        a.A(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("durationMs"), "detectorOptions"), "eventType"), "errorCode"));
    }

    private zziv() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
