package com.google.android.gms.internal.mlkit_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzii implements ObjectEncoder {
    static final zzii zza = new zzii();

    static {
        a.m(6, a.f(5, a.f(4, a.f(2, a.f(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"), "imageInfo"), "captionCount"), "highestScore"), "imageType"));
    }

    private zzii() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
