package me.oriient.navigation.common;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class K extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationPosition f26215a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Outcome.Failure c;
    public final /* synthetic */ NavigationManagerImpl d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(NavigationPosition navigationPosition, List list, Outcome.Failure failure, NavigationManagerImpl navigationManagerImpl, long j) {
        super(0);
        this.f26215a = navigationPosition;
        this.b = list;
        this.c = failure;
        this.d = navigationManagerImpl;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26215a.getBuildingId()), new Pair("floorOrder", Integer.valueOf(this.f26215a.getFloorOrder())), new Pair("waypointsCount", Integer.valueOf(this.b.size() - 1)), new Pair("errorMessage", ((NavigationError) this.c.getValue()).getMessage()), new Pair("timeSpentSec", Double.valueOf(Math.abs(this.d.getTimeProvider().timeIntervalSinceNowInSeconds(this.e)))));
    }
}
