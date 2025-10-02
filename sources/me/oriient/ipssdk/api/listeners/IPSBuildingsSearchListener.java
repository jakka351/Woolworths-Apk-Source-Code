package me.oriient.ipssdk.api.listeners;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import java.util.List;
import me.oriient.ipssdk.api.models.IPSBuildingsSearchResult;

@Keep
/* loaded from: classes2.dex */
public interface IPSBuildingsSearchListener extends IPSFailable {
    void onBuildingsSearchReceived(@NonNull List<IPSBuildingsSearchResult> list);
}
