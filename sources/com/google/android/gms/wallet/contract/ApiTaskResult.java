package com.google.android.gms.wallet.contract;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;

/* loaded from: classes2.dex */
public class ApiTaskResult<T> {

    @Nullable
    private final Object zza;
    private final Status zzb;

    public ApiTaskResult(@Nullable T t, @NonNull Status status) {
        this.zza = t;
        this.zzb = status;
    }

    @Nullable
    public T getResult() {
        return (T) this.zza;
    }

    @NonNull
    public Status getStatus() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        return Objects.toStringHelper(this).add("status", this.zzb).add(lqlqqlq.m006Dm006Dm006Dm, this.zza).toString();
    }

    public ApiTaskResult(@NonNull Status status) {
        this(null, status);
    }
}
