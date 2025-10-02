package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSMap;
import me.oriient.ipssdk.common.BuildConfig;

@Keep
@Deprecated(forRemoval = true, since = BuildConfig.LIB_VERSION_NAME)
/* loaded from: classes2.dex */
public interface IPSMapListener extends IPSFailable {
    void onMapReceived(@NonNull IPSMap iPSMap);
}
