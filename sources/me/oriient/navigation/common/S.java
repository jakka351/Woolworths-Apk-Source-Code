package me.oriient.navigation.common;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.models.RouteCore;

/* loaded from: classes8.dex */
public final class S extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f26222a;
    public final /* synthetic */ NavigationWaypoint b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(List list, NavigationWaypoint navigationWaypoint, String str) {
        super(1);
        this.f26222a = list;
        this.b = navigationWaypoint;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        RouteCore it = (RouteCore) obj;
        Intrinsics.h(it, "it");
        me.oriient.navigation.common.models.i iVar = Route.Companion;
        List list = this.f26222a;
        NavigationWaypoint navigationWaypoint = this.b;
        String str = this.c;
        iVar.getClass();
        return me.oriient.navigation.common.models.i.a(it, list, navigationWaypoint, str);
    }
}
