package com.google.android.gms.internal.vision;

/* loaded from: classes5.dex */
final class zzir {
    private static final zziq<?> zza = new zzip();
    private static final zziq<?> zzb = zzc();

    public static zziq<?> zza() {
        return zza;
    }

    public static zziq<?> zzb() {
        zziq<?> zziqVar = zzb;
        if (zziqVar != null) {
            return zziqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static zziq<?> zzc() {
        try {
            return (zziq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
