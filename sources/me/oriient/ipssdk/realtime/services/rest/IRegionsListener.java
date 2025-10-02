package me.oriient.ipssdk.realtime.services.rest;

import java.util.List;
import kotlin.Metadata;
import me.oriient.ipssdk.api.listeners.IPSFailable;
import me.oriient.ipssdk.realtime.utils.models.Region;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/IRegionsListener;", "Lme/oriient/ipssdk/api/listeners/IPSFailable;", "onReceived", "", "regions", "", "Lme/oriient/ipssdk/realtime/utils/models/Region;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IRegionsListener extends IPSFailable {
    void onReceived(@NotNull List<Region> regions);
}
