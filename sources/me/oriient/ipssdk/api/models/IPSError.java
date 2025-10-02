package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
/* loaded from: classes2.dex */
public interface IPSError {
    int getCode();

    @NonNull
    String getMessage();

    int getRecoveryStrategy();
}
