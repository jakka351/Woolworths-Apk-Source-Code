package com.google.firebase.auth.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzaif;
import com.google.firebase.auth.ActionCodeResult;
import com.google.firebase.auth.MultiFactorInfo;

/* loaded from: classes6.dex */
public final class zzu implements ActionCodeResult {

    /* renamed from: a, reason: collision with root package name */
    public final int f15216a;

    public zzu(zzaif zzaifVar) {
        int i;
        if (zzaifVar.zzg()) {
            zzaifVar.zzc();
        } else {
            zzaifVar.zzb();
        }
        zzaifVar.zzb();
        if (!zzaifVar.zzh()) {
            this.f15216a = 3;
            return;
        }
        String strZzd = zzaifVar.zzd();
        strZzd.getClass();
        i = 5;
        switch (strZzd) {
            case "REVERT_SECOND_FACTOR_ADDITION":
                i = 6;
                break;
            case "PASSWORD_RESET":
                i = 0;
                break;
            case "VERIFY_EMAIL":
                i = 1;
                break;
            case "VERIFY_AND_CHANGE_EMAIL":
                break;
            case "EMAIL_SIGNIN":
                i = 4;
                break;
            case "RECOVER_EMAIL":
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        this.f15216a = i;
        if (i == 4 || i == 3) {
            return;
        }
        if (zzaifVar.zzf()) {
            String strZzb = zzaifVar.zzb();
            MultiFactorInfo multiFactorInfoA = zzbk.a(zzaifVar.zza());
            Preconditions.checkNotEmpty(strZzb);
            return;
        }
        if (!zzaifVar.zzg()) {
            if (zzaifVar.zze()) {
                Preconditions.checkNotEmpty(zzaifVar.zzb());
            }
        } else {
            String strZzc = zzaifVar.zzc();
            String strZzb2 = zzaifVar.zzb();
            Preconditions.checkNotEmpty(strZzc);
            Preconditions.checkNotEmpty(strZzb2);
        }
    }
}
