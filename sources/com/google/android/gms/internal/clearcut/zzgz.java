package com.google.android.gms.internal.clearcut;

import androidx.compose.ui.input.pointer.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzgz extends zzfu<zzgz> implements Cloneable {
    private byte[] zzbjb = zzgb.zzse;
    private String zzbjc = "";
    private byte[][] zzbjd = zzgb.zzsd;
    private boolean zzbje = false;

    public zzgz() {
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzgc, reason: merged with bridge method [inline-methods] */
    public final zzgz clone() {
        try {
            zzgz zzgzVar = (zzgz) super.clone();
            byte[][] bArr = this.zzbjd;
            if (bArr != null && bArr.length > 0) {
                zzgzVar.zzbjd = (byte[][]) bArr.clone();
            }
            return zzgzVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgz)) {
            return false;
        }
        zzgz zzgzVar = (zzgz) obj;
        if (!Arrays.equals(this.zzbjb, zzgzVar.zzbjb)) {
            return false;
        }
        String str = this.zzbjc;
        if (str == null) {
            if (zzgzVar.zzbjc != null) {
                return false;
            }
        } else if (!str.equals(zzgzVar.zzbjc)) {
            return false;
        }
        if (!zzfy.zza(this.zzbjd, zzgzVar.zzbjd)) {
            return false;
        }
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            return this.zzrj.equals(zzgzVar.zzrj);
        }
        zzfw zzfwVar2 = zzgzVar.zzrj;
        return zzfwVar2 == null || zzfwVar2.isEmpty();
    }

    public final int hashCode() {
        int iD = a.d(553293486, 31, this.zzbjb);
        String str = this.zzbjc;
        int iHashCode = 0;
        int iZza = (((zzfy.zza(this.zzbjd) + ((iD + (str == null ? 0 : str.hashCode())) * 31)) * 31) + 1237) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            iHashCode = this.zzrj.hashCode();
        }
        return iZza + iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            zzfsVar.zza(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    zzfsVar.zza(2, bArr3);
                }
                i++;
            }
        }
        String str = this.zzbjc;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(4, this.zzbjc);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int iZzen = super.zzen();
        if (!Arrays.equals(this.zzbjb, zzgb.zzse)) {
            iZzen += zzfs.zzb(1, this.zzbjb);
        }
        byte[][] bArr = this.zzbjd;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            int iZzh = 0;
            int i2 = 0;
            while (true) {
                byte[][] bArr2 = this.zzbjd;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    i2++;
                    iZzh = zzfs.zzh(bArr3) + iZzh;
                }
                i++;
            }
            iZzen = iZzen + iZzh + i2;
        }
        String str = this.zzbjc;
        return (str == null || str.equals("")) ? iZzen : zzfs.zzb(4, this.zzbjc) + iZzen;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* renamed from: zzeo */
    public final /* synthetic */ zzfu clone() throws CloneNotSupportedException {
        return (zzgz) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzep */
    public final /* synthetic */ zzfz clone() throws CloneNotSupportedException {
        return (zzgz) clone();
    }
}
