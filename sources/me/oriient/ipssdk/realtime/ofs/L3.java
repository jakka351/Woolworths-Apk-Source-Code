package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper;

/* loaded from: classes8.dex */
public final class L3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IPSLocalProximityEvent f25970a;
    public final /* synthetic */ LocalProximityEventWrapper b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L3(IPSLocalProximityEvent iPSLocalProximityEvent, LocalProximityEventWrapper localProximityEventWrapper) {
        super(0);
        this.f25970a = iPSLocalProximityEvent;
        this.b = localProximityEventWrapper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair = new Pair("buildingId", this.f25970a.getBuildingId());
        Pair pair2 = new Pair("floorOrder", Integer.valueOf(this.f25970a.getFloorOrder()));
        String groupId = this.f25970a.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        return MapsKt.j(pair, pair2, new Pair("groupId", groupId), new Pair("locationDefinition", this.f25970a.getLocationDefinition().getLocationDefinition().getDescription$me_oriient_sdk_realtime()), new Pair("repetitionStrategy", this.f25970a.getRepetitionStrategy().getRepetitionStrategy().getDescription$me_oriient_sdk_realtime()), new Pair("trigger", this.f25970a.getTrigger().getTrigger().getDescription$me_oriient_sdk_realtime()), new Pair("shouldBeRemoved", Boolean.valueOf(this.b.isConsumed())));
    }
}
