package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class zznq {
    private static final Logger zza = Logger.getLogger(zznq.class.getName());
    private static final zznq zzb = new zznq();
    private ConcurrentMap<String, zzbh<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbh<?> zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return this.zzc.get(str);
    }

    public final <P> zzbh<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbh<P> zzbhVar = (zzbh<P>) zzc(str);
        if (zzbhVar.zza().equals(cls)) {
            return zzbhVar;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzbhVar.getClass());
        String strValueOf2 = String.valueOf(zzbhVar.zza());
        StringBuilder sbV = a.v("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbV.append(strValueOf2);
        throw new GeneralSecurityException(sbV.toString());
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbh<?> zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zznq zza() {
        return zzb;
    }

    private final synchronized void zza(zzbh<?> zzbhVar, boolean z, boolean z2) throws GeneralSecurityException {
        try {
            String strZzb = zzbhVar.zzb();
            if (z2 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
            }
            zzbh<?> zzbhVar2 = this.zzc.get(strZzb);
            if (zzbhVar2 != null && !zzbhVar2.getClass().equals(zzbhVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzbhVar2.getClass().getName() + ", cannot be re-registered with " + zzbhVar.getClass().getName());
            }
            this.zzc.putIfAbsent(strZzb, zzbhVar);
            this.zzd.put(strZzb, Boolean.valueOf(z2));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbh<P> zzbhVar, boolean z) throws GeneralSecurityException {
        zza(zzbhVar, zziv.zza.zza, z);
    }

    public final synchronized <P> void zza(zzbh<P> zzbhVar, zziv.zza zzaVar, boolean z) throws GeneralSecurityException {
        if (zzaVar.zza()) {
            zza((zzbh<?>) zzbhVar, false, z);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
