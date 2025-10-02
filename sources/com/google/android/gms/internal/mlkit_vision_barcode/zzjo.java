package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzjo implements ObjectEncoder {
    static final zzjo zza = new zzjo();

    static {
        a.A(5, a.y(4, a.y(3, a.y(2, a.y(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"), "options"), "inputsFormats"), "outputFormats"), "modelInitializationMs"));
    }

    private zzjo() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
