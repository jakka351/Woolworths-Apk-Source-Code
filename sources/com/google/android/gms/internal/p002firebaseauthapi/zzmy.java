package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes5.dex */
public final class zzmy {
    private static final Object zza = new Object();
    private static final String zzb = "zzmy";

    @GuardedBy
    private zzbw zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzba zze = null;
        private boolean zzf = true;
        private zzbj zzg = null;
        private zzxb zzh = null;

        @GuardedBy
        private zzbw zzi;

        private static zzbw zza(byte[] bArr) throws GeneralSecurityException, IOException {
            return zzbw.zza(zzbz.zza(zzaz.zza(bArr), zzbf.zza()));
        }

        @Nullable
        private final zzba zzb() throws GeneralSecurityException {
            zzmy.zzd();
            zznd zzndVar = new zznd();
            try {
                boolean zZzc = zznd.zzc(this.zzd);
                try {
                    return zzndVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e) {
                    if (!zZzc) {
                        throw new KeyStoreException(a.h("the master key ", this.zzd, " exists but is unusable"), e);
                    }
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                return null;
            }
        }

        public final zza zza(zzxb zzxbVar) {
            this.zzh = zzxbVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public final zza zza(Context context, String str, String str2) throws IOException {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzmy zza() throws GeneralSecurityException, IOException {
            zzmy zzmyVar;
            try {
                if (this.zzb != null) {
                    zzxb zzxbVar = this.zzh;
                    if (zzxbVar != null && this.zzg == null) {
                        this.zzg = zzbj.zza(zzcj.zza(zzxbVar.zzk()));
                    }
                    synchronized (zzmy.zza) {
                        try {
                            byte[] bArrZzb = zzb(this.zza, this.zzb, this.zzc);
                            if (bArrZzb == null) {
                                if (this.zzd != null) {
                                    this.zze = zzb();
                                }
                                zzbj zzbjVar = this.zzg;
                                if (zzbjVar != null) {
                                    zzbm zzbmVarZza = zzbm.zza(zzbjVar);
                                    zzmy.zza(zzbmVarZza, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                                    this.zzi = zzbw.zza(zzbmVarZza);
                                } else {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                            } else if (this.zzd != null) {
                                zzmy.zzd();
                                this.zzi = zzb(bArrZzb);
                            } else {
                                this.zzi = zza(bArrZzb);
                            }
                            zzmyVar = new zzmy(this);
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th) {
                throw th;
            }
            return zzmyVar;
        }

        private final zzbw zzb(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbw.zza(zzbm.zza(zzaz.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e2) {
                try {
                    zzbw zzbwVarZza = zza(bArr);
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                    return zzbwVarZza;
                } catch (IOException unused2) {
                    throw e2;
                }
            }
        }

        @Nullable
        private static byte[] zzb(Context context, String str, String str2) throws IOException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return zzzx.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(a.h("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbm zza() throws GeneralSecurityException {
        return this.zzc.zza();
    }

    private zzmy(zza zzaVar) {
        new zznf(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbm zzbmVar, zzby zzbyVar, zzba zzbaVar) throws GeneralSecurityException {
        try {
            if (zzbaVar != null) {
                zzbmVar.zza(zzbyVar, zzbaVar, new byte[0]);
            } else {
                zzbz.zza(zzbmVar, zzbyVar, zzbf.zza());
            }
        } catch (IOException e) {
            throw new GeneralSecurityException(e);
        }
    }
}
