package me.oriient.ipssdk.realtime.ofs;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;
import me.oriient.ipssdk.realtime.ips.CoreLogic$startPositioning$2$onSessionStart$1$2$WhenMappings;

/* loaded from: classes8.dex */
public final class X0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Building f26029a;
    public final /* synthetic */ DataPreloadingManager.PreloadingStatus b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(Building building, DataPreloadingManager.PreloadingStatus preloadingStatus) {
        super(0);
        this.f26029a = building;
        this.b = preloadingStatus;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        Pair pair = new Pair("buildingId", this.f26029a.getId());
        int i = CoreLogic$startPositioning$2$onSessionStart$1$2$WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            str = "requiresPreparation";
        } else if (i == 2) {
            str = "preparing";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str = "ready";
        }
        return MapsKt.j(pair, new Pair("dataStatus", str));
    }
}
