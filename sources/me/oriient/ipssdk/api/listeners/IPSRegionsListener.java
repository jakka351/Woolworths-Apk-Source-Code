package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import me.oriient.ipssdk.api.models.IPSRegion;

@Keep
/* loaded from: classes2.dex */
public interface IPSRegionsListener {
    void onRegionsAdded(@NonNull List<IPSRegion> list);

    void onRegionsChanged(@NonNull List<IPSRegion> list);

    void onRegionsRemoved(@NonNull List<IPSRegion> list);
}
