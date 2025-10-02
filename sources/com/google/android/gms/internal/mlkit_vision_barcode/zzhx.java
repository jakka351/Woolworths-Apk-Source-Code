package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzhx implements ObjectEncoder {
    static final zzhx zza = new zzhx();

    static {
        a.A(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("errorCode"), "imageInfo"), "isColdCall"), "detectorOptions"));
    }

    private zzhx() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
