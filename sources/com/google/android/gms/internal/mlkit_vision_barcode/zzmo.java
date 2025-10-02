package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzmo implements ObjectEncoder {
    static final zzmo zza = new zzmo();

    static {
        a.A(6, a.y(5, a.y(4, a.y(2, a.y(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"), "imageInfo"), "captionCount"), "highestScore"), "imageType"));
    }

    private zzmo() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
