package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzhv implements ObjectEncoder {
    static final zzhv zza = new zzhv();

    static {
        a.m(4, a.f(3, a.f(2, a.f(1, new FieldDescriptor.Builder("durationMs"), "errorCode"), "options"), "pageCount"));
    }

    private zzhv() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
