package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzalf {

    @ColorInt
    private int zzf;
    private int zzh;
    private float zzn;
    private String zza = "";
    private String zzb = "";
    private Set zzc = Collections.EMPTY_SET;
    private String zzd = "";

    @Nullable
    private String zze = null;
    private boolean zzg = false;
    private boolean zzi = false;
    private int zzj = -1;
    private int zzk = -1;
    private int zzl = -1;
    private int zzm = -1;
    private int zzo = -1;
    private boolean zzp = false;

    private static int zzA(int i, String str, @Nullable String str2, int i2) {
        if (str.isEmpty() || i == -1) {
            return i;
        }
        if (str.equals(str2)) {
            return i + i2;
        }
        return -1;
    }

    public final void zza(String str) {
        this.zza = str;
    }

    public final void zzb(String str) {
        this.zzb = str;
    }

    public final void zzc(String[] strArr) {
        this.zzc = new HashSet(Arrays.asList(strArr));
    }

    public final void zzd(String str) {
        this.zzd = str;
    }

    public final int zze(@Nullable String str, @Nullable String str2, Set set, @Nullable String str3) {
        if (this.zza.isEmpty() && this.zzb.isEmpty() && this.zzc.isEmpty() && this.zzd.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iZzA = zzA(zzA(zzA(0, this.zza, str, 1073741824), this.zzb, str2, 2), this.zzd, str3, 4);
        if (iZzA == -1 || !set.containsAll(this.zzc)) {
            return 0;
        }
        return (this.zzc.size() * 4) + iZzA;
    }

    public final int zzf() {
        int i = this.zzk;
        if (i == -1 && this.zzl == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.zzl == 1 ? 2 : 0);
    }

    public final boolean zzg() {
        return this.zzj == 1;
    }

    public final zzalf zzh(boolean z) {
        this.zzj = 1;
        return this;
    }

    public final zzalf zzi(boolean z) {
        this.zzk = 1;
        return this;
    }

    public final zzalf zzj(boolean z) {
        this.zzl = 1;
        return this;
    }

    @Nullable
    public final String zzk() {
        return this.zze;
    }

    public final zzalf zzl(@Nullable String str) {
        this.zze = zzggj.zza(str);
        return this;
    }

    public final int zzm() {
        if (this.zzg) {
            return this.zzf;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public final zzalf zzn(int i) {
        this.zzf = i;
        this.zzg = true;
        return this;
    }

    public final boolean zzo() {
        return this.zzg;
    }

    public final int zzp() {
        if (this.zzi) {
            return this.zzh;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public final zzalf zzq(int i) {
        this.zzh = i;
        this.zzi = true;
        return this;
    }

    public final boolean zzr() {
        return this.zzi;
    }

    public final zzalf zzs(float f) {
        this.zzn = f;
        return this;
    }

    public final zzalf zzt(int i) {
        this.zzm = i;
        return this;
    }

    public final int zzu() {
        return this.zzm;
    }

    public final float zzv() {
        return this.zzn;
    }

    public final zzalf zzw(int i) {
        this.zzo = i;
        return this;
    }

    public final int zzx() {
        return this.zzo;
    }

    public final zzalf zzy(boolean z) {
        this.zzp = z;
        return this;
    }

    public final boolean zzz() {
        return this.zzp;
    }
}
