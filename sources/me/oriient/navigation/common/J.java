package me.oriient.navigation.common;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.models.NavigationPosition;

/* loaded from: classes8.dex */
public final class J extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationPosition f26214a;
    public final /* synthetic */ List b;
    public final /* synthetic */ NavigationManagerImpl c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(NavigationPosition navigationPosition, List list, NavigationManagerImpl navigationManagerImpl, long j) {
        super(0);
        this.f26214a = navigationPosition;
        this.b = list;
        this.c = navigationManagerImpl;
        this.d = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26214a.getBuildingId()), new Pair("floorOrder", Integer.valueOf(this.f26214a.getFloorOrder())), new Pair("waypointsCount", Integer.valueOf(this.b.size() - 1)), new Pair("timeSpentSec", Double.valueOf(Math.abs(this.c.getTimeProvider().timeIntervalSinceNowInSeconds(this.d)))));
    }
}
