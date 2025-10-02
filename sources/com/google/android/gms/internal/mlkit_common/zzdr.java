package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzdr implements ObjectEncoder {
    static final zzdr zza = new zzdr();

    static {
        a.m(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("errorCode"), "imageInfo"), "isColdCall"), "detectorOptions"));
    }

    private zzdr() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
