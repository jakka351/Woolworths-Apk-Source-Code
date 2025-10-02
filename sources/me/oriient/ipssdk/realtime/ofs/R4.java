package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.realtime.ips.proximity.local.WalkingDistanceLocalProximityLocationResolver;
import me.oriient.navigation.common.models.Route;

/* loaded from: classes8.dex */
public final class R4 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WalkingDistanceLocalProximityLocationResolver f26002a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R4(WalkingDistanceLocalProximityLocationResolver walkingDistanceLocalProximityLocationResolver, String str) {
        super(1);
        this.f26002a = walkingDistanceLocalProximityLocationResolver;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Route route = (Route) obj;
        Intrinsics.h(route, "route");
        return Boolean.valueOf(WalkingDistanceLocalProximityLocationResolver.access$onRouteReceived(this.f26002a, route, this.b));
    }
}
