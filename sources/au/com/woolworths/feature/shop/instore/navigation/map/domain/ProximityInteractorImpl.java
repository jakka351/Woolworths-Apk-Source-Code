package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityEventTriggerSpec;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinition;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.LocalProximityLocationDefinitionKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.proximity.ProximityServiceState;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.ipssdk.ips.IPSLocalProximityEvent;
import me.oriient.ipssdk.ips.IPSLocalProximityEventRepetitionStrategy;
import me.oriient.ipssdk.ips.IPSLocalProximityEventTrigger;
import me.oriient.ipssdk.ips.IPSLocalProximityLocationDefinition;
import me.oriient.ipssdk.ips.IPSProximity;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/ProximityInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/ProximityInteractor;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProximityInteractorImpl implements ProximityInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final BuildingInteractor f7373a;
    public final MutableStateFlow b;
    public final StateFlow c;
    public final SharedFlowImpl d;

    public ProximityInteractorImpl(BuildingInteractor buildingInteractor) {
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        this.f7373a = buildingInteractor;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(ProximityServiceState.d);
        this.b = mutableStateFlowA;
        this.c = FlowKt.b(mutableStateFlowA);
        BufferOverflow bufferOverflow = BufferOverflow.e;
        SharedFlowKt.a(0, 1, bufferOverflow);
        this.d = SharedFlowKt.a(0, 1, bufferOverflow);
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor
    public final void b() {
        IPSProximity.removeAllLocalProximityEvents();
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor
    /* renamed from: c, reason: from getter */
    public final SharedFlowImpl getD() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.ProximityInteractor
    public final void d(String groupId, LocalProximityLocationDefinition.CloseWalkingDistance closeWalkingDistance, int i, LocalProximityEventTriggerSpec localProximityEventTriggerSpec) {
        IPSLocalProximityEventTrigger iPSLocalProximityEventTriggerOnDwell;
        Intrinsics.h(groupId, "groupId");
        BuildingInteractor buildingInteractor = this.f7373a;
        Building building = (Building) buildingInteractor.getCurrentBuilding().getValue();
        String str = building != null ? building.f7331a : null;
        if (str == null) {
            str = "";
        }
        List listQ = CollectionsKt.Q(new LocalProximityEventSpec(str, i - 1, localProximityEventTriggerSpec, closeWalkingDistance, groupId));
        if (listQ.isEmpty()) {
            return;
        }
        List<LocalProximityEventSpec> list = listQ;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (LocalProximityEventSpec localProximityEventSpec : list) {
            n nVar = new n(13, this, localProximityEventSpec);
            Intrinsics.h(localProximityEventSpec, "<this>");
            String str2 = localProximityEventSpec.e;
            String str3 = localProximityEventSpec.f7350a;
            int i2 = localProximityEventSpec.b;
            LocalProximityEventTriggerSpec localProximityEventTriggerSpec2 = localProximityEventSpec.c;
            if (localProximityEventTriggerSpec2 instanceof LocalProximityEventTriggerSpec.Enter) {
                iPSLocalProximityEventTriggerOnDwell = IPSLocalProximityEventTrigger.INSTANCE.onEnter();
            } else if (localProximityEventTriggerSpec2 instanceof LocalProximityEventTriggerSpec.Exit) {
                iPSLocalProximityEventTriggerOnDwell = IPSLocalProximityEventTrigger.INSTANCE.onExit();
            } else {
                if (!(localProximityEventTriggerSpec2 instanceof LocalProximityEventTriggerSpec.Dwell)) {
                    throw new NoWhenBranchMatchedException();
                }
                iPSLocalProximityEventTriggerOnDwell = IPSLocalProximityEventTrigger.INSTANCE.onDwell(0.0d);
            }
            arrayList.add(new IPSLocalProximityEvent(str2, str3, i2, iPSLocalProximityEventTriggerOnDwell, IPSLocalProximityLocationDefinition.INSTANCE.closeWalkingDistance(LocalProximityLocationDefinitionKt.a(localProximityEventSpec.d.f7353a, buildingInteractor)), IPSLocalProximityEventRepetitionStrategy.INSTANCE.once(), nVar));
        }
        IPSProximity.addLocalProximityEvents(arrayList);
    }
}
