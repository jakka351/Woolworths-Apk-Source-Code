package me.oriient.ipssdk.realtime.services.rest;

import kotlin.Metadata;
import me.oriient.ipssdk.api.listeners.IPSFailable;
import me.oriient.ipssdk.realtime.ips.MapImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/IMapDownloadListener;", "Lme/oriient/ipssdk/api/listeners/IPSFailable;", "onMapReceived", "", "map", "Lme/oriient/ipssdk/realtime/ips/MapImpl;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface IMapDownloadListener extends IPSFailable {
    void onMapReceived(@NotNull MapImpl map);
}
