package me.oriient.ipssdk.realtime.ips.proximity.local;

import java.util.List;
import kotlin.Metadata;
import me.oriient.internal.infra.utils.core.DiProvidable;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005H&J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u000f"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventManager;", "Lme/oriient/internal/infra/utils/core/DiProvidable;", "addProximityEvents", "", "toAdd", "", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "removeAllProximityEvents", "removeProximityEvents", "toRemove", "removeProximityEventsByGroupIds", "groupIds", "", "setProximityEvents", "newEvents", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ProximityEventManager extends DiProvidable {
    void addProximityEvents(@NotNull List<IPSLocalProximityEvent> toAdd);

    void removeAllProximityEvents();

    void removeProximityEvents(@NotNull List<IPSLocalProximityEvent> toRemove);

    void removeProximityEventsByGroupIds(@NotNull List<String> groupIds);

    void setProximityEvents(@NotNull List<IPSLocalProximityEvent> newEvents);
}
