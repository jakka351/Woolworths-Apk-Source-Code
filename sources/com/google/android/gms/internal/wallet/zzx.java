package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;

/* loaded from: classes5.dex */
final class zzx extends zzt {
    private final TaskCompletionSource zza;

    public zzx(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zzf(Status status, @Nullable PaymentData paymentData, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentData, this.zza);
    }
}
