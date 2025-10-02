package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzdr implements ObjectEncoder {
    static final zzdr zza = new zzdr();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("remoteModelOptions"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("localModelOptions"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("errorCodes"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("modelInitializationMs"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("isNnApiEnabled"));

    private zzdr() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
