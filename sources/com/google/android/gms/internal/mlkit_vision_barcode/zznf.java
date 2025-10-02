package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zznf implements ObjectEncoder {
    static final zznf zza = new zznf();

    static {
        a.A(5, a.y(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("detectorOptions"), "errorCode"), "totalInitializationMs"), "loggingInitializationMs"), "otherErrors"));
    }

    private zznf() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
