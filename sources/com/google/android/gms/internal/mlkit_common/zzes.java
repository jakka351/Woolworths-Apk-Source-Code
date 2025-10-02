package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzes implements ObjectEncoder {
    static final zzes zza = new zzes();

    static {
        a.m(3, a.f(2, a.f(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"), "options"), "imageInfo"));
    }

    private zzes() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
