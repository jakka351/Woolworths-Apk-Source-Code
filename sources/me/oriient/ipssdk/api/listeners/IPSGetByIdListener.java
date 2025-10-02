package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public interface IPSGetByIdListener<T> extends IPSFailable {
    void onResults(@NonNull List<T> list);
}
