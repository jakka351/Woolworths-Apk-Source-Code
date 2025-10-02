package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.zzan;
import com.google.firebase.auth.zze;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzahk {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzaia zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private zze zzk;
    private List<zzahy> zzl;
    private zzah<zzan> zzm;

    public zzahk() {
        this.zzf = new zzaia();
        this.zzm = zzah.zzg();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    @Nullable
    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    @NonNull
    public final zzah<zzan> zzd() {
        return this.zzm;
    }

    @Nullable
    public final zze zze() {
        return this.zzk;
    }

    public final zzaia zzf() {
        return this.zzf;
    }

    @Nullable
    public final String zzg() {
        return this.zzd;
    }

    @Nullable
    public final String zzh() {
        return this.zzb;
    }

    @NonNull
    public final String zzi() {
        return this.zza;
    }

    @Nullable
    public final String zzj() {
        return this.zzg;
    }

    @NonNull
    public final List<zzahy> zzk() {
        return this.zzl;
    }

    @NonNull
    public final List<zzaib> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    @NonNull
    public final zzahk zza(zze zzeVar) {
        this.zzk = zzeVar;
        return this;
    }

    @NonNull
    public final zzahk zzb(@Nullable String str) {
        this.zzb = str;
        return this;
    }

    @NonNull
    public final zzahk zza(@Nullable String str) {
        this.zzd = str;
        return this;
    }

    @NonNull
    public final zzahk zzc(@Nullable String str) {
        this.zze = str;
        return this;
    }

    public zzahk(String str, String str2, boolean z, String str3, String str4, zzaia zzaiaVar, String str5, String str6, long j, long j2, boolean z2, zze zzeVar, List<zzahy> list, zzah<zzan> zzahVar) {
        zzaia zzaiaVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z;
        this.zzd = str3;
        this.zze = str4;
        if (zzaiaVar == null) {
            zzaiaVar2 = new zzaia();
        } else {
            List<zzaib> listZza = zzaiaVar.zza();
            zzaia zzaiaVar3 = new zzaia();
            if (listZza != null) {
                zzaiaVar3.zza().addAll(listZza);
            }
            zzaiaVar2 = zzaiaVar3;
        }
        this.zzf = zzaiaVar2;
        this.zzg = str6;
        this.zzh = j;
        this.zzi = j2;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzahVar;
    }

    public final zzahk zza(boolean z) {
        this.zzj = z;
        return this;
    }

    @NonNull
    public final zzahk zza(zzah<zzan> zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        this.zzm = zzahVar;
        return this;
    }

    @NonNull
    public final zzahk zza(List<zzaib> list) {
        Preconditions.checkNotNull(list);
        zzaia zzaiaVar = new zzaia();
        this.zzf = zzaiaVar;
        zzaiaVar.zza().addAll(list);
        return this;
    }
}
