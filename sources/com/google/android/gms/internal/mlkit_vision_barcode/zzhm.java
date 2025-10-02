package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzhm implements ObjectEncoder {
    static final zzhm zza = new zzhm();

    static {
        a.A(3, a.y(2, a.y(1, new FieldDescriptor.Builder("logEventKey"), "eventCount"), "inferenceDurationStats"));
    }

    private zzhm() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
