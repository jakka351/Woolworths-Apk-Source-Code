package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzib implements ObjectEncoder {
    static final zzib zza = new zzib();

    static {
        a.A(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("errorCode"), "isColdCall"), "imageInfo"), "detectorOptions"));
    }

    private zzib() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
