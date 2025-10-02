package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSError;

@Keep
/* loaded from: classes2.dex */
public interface IPSCalibrationDialogDismissListener {
    void onDismissWithError(@NonNull IPSError iPSError);

    void onDismissWithSuccess();
}
