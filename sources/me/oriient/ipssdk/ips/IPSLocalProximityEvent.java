package me.oriient.ipssdk.ips;

import androidx.annotation.Keep;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001BG\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0010BO\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0002\u0010\u0013R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0011\u001a\u00020\u0012X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/ips/IPSLocalProximityEvent;", "", "groupId", "", "buildingId", "floorOrder", "", "trigger", "Lme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;", "locationDefinition", "Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;", "repetitionStrategy", "Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;", UrlHandler.ACTION, "Lkotlin/Function0;", "", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;Lkotlin/jvm/functions/Function0;)V", "origin", "Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "(Ljava/lang/String;Ljava/lang/String;ILme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;Lkotlin/jvm/functions/Function0;)V", "getAction", "()Lkotlin/jvm/functions/Function0;", "getBuildingId", "()Ljava/lang/String;", "getFloorOrder", "()I", "getGroupId", "getLocationDefinition", "()Lme/oriient/ipssdk/ips/IPSLocalProximityLocationDefinition;", "getOrigin$me_oriient_sdk_realtime", "()Lme/oriient/ipssdk/realtime/ips/proximity/local/ProximityEventOrigin;", "getRepetitionStrategy", "()Lme/oriient/ipssdk/ips/IPSLocalProximityEventRepetitionStrategy;", "getTrigger", "()Lme/oriient/ipssdk/ips/IPSLocalProximityEventTrigger;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IPSLocalProximityEvent {

    @NotNull
    private final Function0<Unit> action;

    @NotNull
    private final String buildingId;
    private final int floorOrder;

    @Nullable
    private final String groupId;

    @NotNull
    private final IPSLocalProximityLocationDefinition locationDefinition;

    @NotNull
    private final ProximityEventOrigin origin;

    @NotNull
    private final IPSLocalProximityEventRepetitionStrategy repetitionStrategy;

    @NotNull
    private final IPSLocalProximityEventTrigger trigger;

    public IPSLocalProximityEvent(@Nullable String str, @NotNull String buildingId, int i, @NotNull IPSLocalProximityEventTrigger trigger, @NotNull IPSLocalProximityLocationDefinition locationDefinition, @NotNull IPSLocalProximityEventRepetitionStrategy repetitionStrategy, @NotNull ProximityEventOrigin origin, @NotNull Function0<Unit> action) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(trigger, "trigger");
        Intrinsics.h(locationDefinition, "locationDefinition");
        Intrinsics.h(repetitionStrategy, "repetitionStrategy");
        Intrinsics.h(origin, "origin");
        Intrinsics.h(action, "action");
        this.groupId = str;
        this.buildingId = buildingId;
        this.floorOrder = i;
        this.trigger = trigger;
        this.locationDefinition = locationDefinition;
        this.repetitionStrategy = repetitionStrategy;
        this.origin = origin;
        this.action = action;
    }

    @NotNull
    public final Function0<Unit> getAction() {
        return this.action;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final int getFloorOrder() {
        return this.floorOrder;
    }

    @Nullable
    public final String getGroupId() {
        return this.groupId;
    }

    @NotNull
    public final IPSLocalProximityLocationDefinition getLocationDefinition() {
        return this.locationDefinition;
    }

    @NotNull
    /* renamed from: getOrigin$me_oriient_sdk_realtime, reason: from getter */
    public final ProximityEventOrigin getOrigin() {
        return this.origin;
    }

    @NotNull
    public final IPSLocalProximityEventRepetitionStrategy getRepetitionStrategy() {
        return this.repetitionStrategy;
    }

    @NotNull
    public final IPSLocalProximityEventTrigger getTrigger() {
        return this.trigger;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IPSLocalProximityEvent(@Nullable String str, @NotNull String buildingId, int i, @NotNull IPSLocalProximityEventTrigger trigger, @NotNull IPSLocalProximityLocationDefinition locationDefinition, @NotNull IPSLocalProximityEventRepetitionStrategy repetitionStrategy, @NotNull Function0<Unit> action) {
        this(str, buildingId, i, trigger, locationDefinition, repetitionStrategy, ProximityEventOrigin.CLIENT, action);
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(trigger, "trigger");
        Intrinsics.h(locationDefinition, "locationDefinition");
        Intrinsics.h(repetitionStrategy, "repetitionStrategy");
        Intrinsics.h(action, "action");
    }
}
