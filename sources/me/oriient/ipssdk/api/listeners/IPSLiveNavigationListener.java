package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import me.oriient.ipssdk.api.models.IPSNavigationInstruction;
import me.oriient.ipssdk.api.models.IPSRoute;
import me.oriient.ipssdk.api.models.IPSTurn;
import me.oriient.ipssdk.api.utils.OriientExperimentalApi;

@Keep
/* loaded from: classes2.dex */
public interface IPSLiveNavigationListener extends IPSFailable {
    @OriientExperimentalApi
    default void onNavigationInstructionsUpdate(@NonNull List<IPSNavigationInstruction> list) {
    }

    @OriientExperimentalApi
    default void onNavigationTurnsUpdate(@NonNull List<IPSTurn> list) {
    }

    void onNavigationUpdate(@NonNull IPSRoute iPSRoute);
}
