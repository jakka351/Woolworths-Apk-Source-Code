package me.oriient.ipssdk.ips;

import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSError;

/* loaded from: classes4.dex */
public interface IPSDataStatusObserver {
    void onDataPreparationFailed(@NonNull String str, @NonNull IPSError iPSError);

    void onDataStatusChanged(@NonNull String str, int i);
}
