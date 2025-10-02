package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzkh implements ObjectEncoder {
    static final zzkh zza = new zzkh();

    static {
        a.A(3, a.y(2, a.y(1, new FieldDescriptor.Builder("detectorOptions"), "eventType"), "errorCode"));
    }

    private zzkh() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
