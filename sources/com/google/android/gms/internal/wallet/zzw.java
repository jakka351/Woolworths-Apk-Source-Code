package com.google.android.gms.internal.wallet;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentCardRecognitionIntentResponse;

/* loaded from: classes5.dex */
final class zzw extends zzt {
    private final TaskCompletionSource zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.wallet.zzt, com.google.android.gms.internal.wallet.zzq
    public final void zze(Status status, @Nullable PaymentCardRecognitionIntentResponse paymentCardRecognitionIntentResponse, Bundle bundle) {
        AutoResolveHelper.zzd(status, paymentCardRecognitionIntentResponse, this.zza);
    }
}
