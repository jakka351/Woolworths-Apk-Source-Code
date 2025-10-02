package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzdc implements ObjectEncoder {
    static final zzdc zza = new zzdc();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("inferenceCommonLogEvent"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("options"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("imageInfo"));

    private zzdc() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
