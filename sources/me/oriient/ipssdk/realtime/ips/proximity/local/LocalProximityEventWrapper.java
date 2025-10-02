package me.oriient.ipssdk.realtime.ips.proximity.local;

import kotlin.Metadata;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.positioningengine.common.PositioningUpdate;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u0010"}, d2 = {"Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapper;", "", "event", "Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "getEvent", "()Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "isConsumed", "", "()Z", "onNewPosition", "", "positioningUpdate", "Lme/oriient/positioningengine/common/PositioningUpdate;", "buildingId", "", "reset", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface LocalProximityEventWrapper {
    @NotNull
    IPSLocalProximityEvent getEvent();

    boolean isConsumed();

    void onNewPosition(@NotNull PositioningUpdate positioningUpdate, @NotNull String buildingId);

    void reset();
}
