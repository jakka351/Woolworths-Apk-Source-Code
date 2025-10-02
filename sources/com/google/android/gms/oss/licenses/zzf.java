package com.google.android.gms.oss.licenses;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzf implements Runnable {
    final /* synthetic */ OssLicensesActivity zza;

    public zzf(OssLicensesActivity ossLicensesActivity) {
        Objects.requireNonNull(ossLicensesActivity);
        this.zza = ossLicensesActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OssLicensesActivity ossLicensesActivity = this.zza;
        ossLicensesActivity.zza().scrollTo(0, ossLicensesActivity.zzb().getLayout().getLineTop(ossLicensesActivity.zzb().getLayout().getLineForOffset(ossLicensesActivity.zzc())));
    }
}
