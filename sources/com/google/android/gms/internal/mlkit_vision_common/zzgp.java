package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.gms.common.api.internal.a;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.salesforce.marketingcloud.UrlHandler;
import java.io.IOException;

/* loaded from: classes5.dex */
final class zzgp implements ObjectEncoder {
    static final zzgp zza = new zzgp();
    private static final FieldDescriptor zzb = a.C(1, new FieldDescriptor.Builder("deviceInfo"));
    private static final FieldDescriptor zzc = a.C(2, new FieldDescriptor.Builder("nnapiInfo"));
    private static final FieldDescriptor zzd = a.C(3, new FieldDescriptor.Builder("gpuInfo"));
    private static final FieldDescriptor zze = a.C(4, new FieldDescriptor.Builder("pipelineIdentifier"));
    private static final FieldDescriptor zzf = a.C(5, new FieldDescriptor.Builder("acceptedConfigurations"));
    private static final FieldDescriptor zzg = a.C(6, new FieldDescriptor.Builder(UrlHandler.ACTION));
    private static final FieldDescriptor zzh = a.C(7, new FieldDescriptor.Builder("status"));
    private static final FieldDescriptor zzi = a.C(8, new FieldDescriptor.Builder("customErrors"));
    private static final FieldDescriptor zzj = a.C(9, new FieldDescriptor.Builder("benchmarkStatus"));
    private static final FieldDescriptor zzk = a.C(10, new FieldDescriptor.Builder("validationTestResult"));
    private static final FieldDescriptor zzl = a.C(11, new FieldDescriptor.Builder("timestampUs"));
    private static final FieldDescriptor zzm = a.C(12, new FieldDescriptor.Builder("elapsedUs"));

    private zzgp() {
    }

    @Override // com.google.firebase.encoders.ObjectEncoder
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        throw null;
    }
}
