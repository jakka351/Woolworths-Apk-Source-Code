package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgqo implements zzgxr {
    private final List zza;
    private final zzgxy zzb;

    @Nullable
    private final zzgqo zzc;

    public /* synthetic */ zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar, byte[] bArr) {
        this(zzhecVar, list, zzgxyVar);
    }

    public static final zzgqo zza(zzhec zzhecVar) throws GeneralSecurityException {
        zzn(zzhecVar);
        return new zzgqo(zzhecVar, zzl(zzhecVar), zzgxy.zza);
    }

    public static final zzgqo zzf(zzgqs zzgqsVar) throws GeneralSecurityException {
        zzgqj zzgqjVar = new zzgqj();
        zzgqh zzgqhVar = new zzgqh(zzgqsVar, null);
        zzgqhVar.zzb();
        zzgqhVar.zza();
        zzgqjVar.zza(zzgqhVar);
        return zzgqjVar.zzb();
    }

    public static /* synthetic */ zzgqo zzh(final zzgqo zzgqoVar) {
        final zzgxy zzgxyVar = zzgqoVar.zzb;
        if (zzgxyVar.zza()) {
            return zzgqoVar;
        }
        zzgqk zzgqkVar = new zzgqk() { // from class: com.google.android.gms.internal.ads.zzgqn
            @Override // com.google.android.gms.internal.ads.zzgqk
            public final /* synthetic */ void zza(zzgqm zzgqmVar) {
                zzgyj.zza().zzb().zza(this.zza, zzgxyVar, "keyset_handle", "get_key");
            }
        };
        List<zzgqm> list = zzgqoVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzgqm zzgqmVar : list) {
            arrayList.add(new zzgqm(zzgqmVar.zzf(), zzgqmVar.zzj(), zzgqmVar.zzg(), zzgqmVar.zzh(), zzgqmVar.zzi(), zzgqkVar, null));
        }
        return new zzgqo(arrayList, zzgxyVar, zzgqoVar);
    }

    public static /* synthetic */ int zzj(zzgqf zzgqfVar) {
        if (zzgqf.zza.equals(zzgqfVar)) {
            return 3;
        }
        if (zzgqf.zzb.equals(zzgqfVar)) {
            return 4;
        }
        if (zzgqf.zzc.equals(zzgqfVar)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static List zzl(zzhec zzhecVar) throws GeneralSecurityException {
        zzgqd zzgxvVar;
        boolean z;
        ArrayList arrayList = new ArrayList(zzhecVar.zzc());
        for (zzheb zzhebVar : zzhecVar.zzb()) {
            int iZzc = zzhebVar.zzc();
            try {
                zzgzj zzgzjVarZzo = zzo(zzhebVar);
                zzgyo zzgyoVarZza = zzgyo.zza();
                zzgqt zzgqtVarZza = zzgqt.zza();
                zzgxvVar = !zzgyoVarZza.zzf(zzgzjVarZzo) ? new zzgxv(zzgzjVarZzo, zzgqtVarZza) : zzgyoVarZza.zzg(zzgzjVarZzo, zzgqtVarZza);
                z = false;
            } catch (GeneralSecurityException e) {
                if (zzgxb.zza.zza()) {
                    throw e;
                }
                zzgxvVar = new zzgxv(zzo(zzhebVar), zzgqt.zza());
                z = true;
            }
            if (zzgxb.zza.zza() && !zzp(zzhebVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z2 = true;
            int iZzk = zzhebVar.zzk();
            if (iZzc != zzhecVar.zza()) {
                z2 = false;
            }
            arrayList.add(new zzgqm(zzgxvVar, iZzk, iZzc, z2, z, zzgqm.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzgqo zzm() {
        zzgqo zzgqoVar = this.zzc;
        return zzgqoVar == null ? this : zzgqoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzhec zzhecVar) throws GeneralSecurityException {
        if (zzhecVar == null || zzhecVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static zzgzj zzo(zzheb zzhebVar) throws GeneralSecurityException {
        return zzgzj.zza(zzhebVar.zzb().zza(), zzhebVar.zzb().zzb(), zzhebVar.zzb().zzc(), zzhebVar.zzd(), zzhebVar.zzd() == zzhep.RAW ? null : Integer.valueOf(zzhebVar.zzc()));
    }

    private static boolean zzp(int i) {
        int i2 = i - 2;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzheb zzq(zzgqd zzgqdVar, int i, int i2) throws GeneralSecurityException {
        zzgzj zzgzjVar = (zzgzj) zzgyo.zza().zzh(zzgqdVar, zzgzj.class, zzgqt.zza());
        Integer numZze = zzgzjVar.zze();
        if (numZze != null && numZze.intValue() != i2) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        zzhea zzheaVarZze = zzheb.zze();
        zzhdr zzhdrVarZzd = zzhdt.zzd();
        zzhdrVarZzd.zza(zzgzjVar.zzg());
        zzhdrVarZzd.zzb(zzgzjVar.zzb());
        zzhdrVarZzd.zzc(zzgzjVar.zzc());
        zzheaVarZze.zza(zzhdrVarZzd);
        zzheaVarZze.zzd(i);
        zzheaVarZze.zzb(i2);
        zzheaVarZze.zzc(zzgzjVar.zzd());
        return (zzheb) zzheaVarZze.zzbu();
    }

    public final String toString() {
        zzhec zzhecVarZzb = zzb();
        int i = zzgqv.zza;
        zzhed zzhedVarZza = zzheg.zza();
        zzhedVarZza.zza(zzhecVarZzb.zza());
        for (zzheb zzhebVar : zzhecVarZzb.zzb()) {
            zzhee zzheeVarZza = zzhef.zza();
            zzheeVarZza.zza(zzhebVar.zzb().zza());
            zzheeVarZza.zzd(zzhebVar.zzk());
            zzheeVarZza.zzc(zzhebVar.zzd());
            zzheeVarZza.zzb(zzhebVar.zzc());
            zzhedVarZza.zzb((zzhef) zzheeVarZza.zzbu());
        }
        return ((zzheg) zzhedVarZza.zzbu()).toString();
    }

    public final zzhec zzb() {
        try {
            zzhdz zzhdzVarZzg = zzhec.zzg();
            for (zzgqm zzgqmVar : this.zza) {
                zzhdzVarZzg.zzb(zzq(zzgqmVar.zza(), zzgqmVar.zzj(), zzgqmVar.zzc()));
                if (zzgqmVar.zzd()) {
                    zzhdzVarZzg.zza(zzgqmVar.zzc());
                }
            }
            return (zzhec) zzhdzVarZzg.zzbu();
        } catch (GeneralSecurityException e) {
            throw new zzgzt(e);
        }
    }

    public final zzgqm zzc() {
        for (zzgqm zzgqmVar : this.zza) {
            if (zzgqmVar != null && zzgqmVar.zzd()) {
                if (zzgqmVar.zzb() == zzgqf.zza) {
                    return zzgqmVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzgxr
    public final int zzd() {
        return this.zza.size();
    }

    public final zzgqm zze(int i) {
        if (i < 0 || i >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(au.com.woolworths.shop.checkout.ui.confirmation.c.l(i, iZzd, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i).length() + 34 + String.valueOf(iZzd).length())));
        }
        List list = this.zza;
        zzgqm zzgqmVar = (zzgqm) list.get(i);
        if (!zzp(zzgqmVar.zzj())) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.k(new StringBuilder(String.valueOf(i).length() + 42), "Keyset-Entry at position ", i, " has wrong status"));
        }
        if (zzgqmVar.zzi()) {
            throw new IllegalStateException(androidx.constraintlayout.core.state.a.k(new StringBuilder(String.valueOf(i).length() + 48), "Keyset-Entry at position ", i, " didn't parse correctly"));
        }
        return (zzgqm) list.get(i);
    }

    public final Object zzg(zzgqb zzgqbVar, Class cls) throws GeneralSecurityException {
        if (!(zzgqbVar instanceof zzgxj)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzgxj zzgxjVar = (zzgxj) zzgqbVar;
        zzhec zzhecVarZzb = zzm().zzb();
        int i = zzgqv.zza;
        int iZza = zzhecVarZzb.zza();
        boolean z = true;
        int i2 = 0;
        boolean z2 = false;
        for (zzheb zzhebVar : zzhecVarZzb.zzb()) {
            if (zzhebVar.zzk() == 3) {
                if (!zzhebVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzd() == zzhep.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhebVar.zzc())));
                }
                if (zzhebVar.zzc() == iZza) {
                    if (z2) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z2 = true;
                }
                z &= zzhebVar.zzb().zzc() == zzhds.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z2 && !z) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i3 = 0; i3 < zzd(); i3++) {
            List list = this.zza;
            if (((zzgqm) list.get(i3)).zzi() || !zzp(((zzgqm) list.get(i3)).zzj())) {
                String strZza = zzhecVarZzb.zzd(i3).zzb().zza();
                StringBuilder sb = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i3).length() + 44 + 32);
                au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i3, "Key parsing of key with index ", " and type_url ", strZza, sb);
                sb.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return zzgxjVar.zza(zzm(), this.zzb, cls);
    }

    private zzgqo(List list, zzgxy zzgxyVar, zzgqo zzgqoVar) {
        this.zza = list;
        this.zzb = zzgxyVar;
        this.zzc = zzgqoVar;
    }

    private zzgqo(zzhec zzhecVar, List list, zzgxy zzgxyVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzgxyVar;
        if (zzgxb.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzheb zzhebVar : zzhecVar.zzb()) {
                if (!hashSet.contains(Integer.valueOf(zzhebVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhebVar.zzc()));
                } else {
                    int iZzc = zzhebVar.zzc();
                    throw new GeneralSecurityException(androidx.constraintlayout.core.state.a.k(new StringBuilder(String.valueOf(iZzc).length() + 121), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzhecVar.zza()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
