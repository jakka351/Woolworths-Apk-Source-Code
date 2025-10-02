package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import me.oriient.ipssdk.api.models.IPSRoute;

@Keep
/* loaded from: classes2.dex */
public interface IPSRouteListener extends IPSFailable {
    void onRouteReceived(@NonNull IPSRoute iPSRoute);
}
