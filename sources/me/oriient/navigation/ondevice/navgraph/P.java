package me.oriient.navigation.ondevice.navgraph;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.CachedDataStatus;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;
import me.oriient.internal.services.dataManager.floorMetadata.FloorMetadata;

/* loaded from: classes8.dex */
public final class P extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavGraphRecord f26306a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(NavGraphRecord navGraphRecord) {
        super(1);
        this.f26306a = navGraphRecord;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FloorMetadata mapMetadata = (FloorMetadata) obj;
        Intrinsics.h(mapMetadata, "mapMetadata");
        FloorImage navGraph = mapMetadata.getNavGraph();
        boolean z = (navGraph != null ? navGraph.getVersion() : 0) == this.f26306a.getVersion();
        if (z) {
            return CachedDataStatus.VALID;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        return CachedDataStatus.INVALID;
    }
}
