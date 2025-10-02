package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzjz implements ObjectEncoder {
    static final zzjz zza = new zzjz();

    static {
        a.m(5, a.f(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("xMin"), "yMin"), "xMax"), "yMax"), "confidenceScore"));
    }

    private zzjz() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
