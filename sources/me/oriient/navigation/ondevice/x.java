package me.oriient.navigation.ondevice;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationError f26361a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ NavigationWaypoint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(NavigationError navigationError, String str, List list, NavigationWaypoint navigationWaypoint) {
        super(0);
        this.f26361a = navigationError;
        this.b = str;
        this.c = list;
        this.d = navigationWaypoint;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f26361a.getMessage()), new Pair("buildingId", this.b), new Pair("waypointsCount", Integer.valueOf(this.c.size())), new Pair("withFinalWaypoint", Boolean.valueOf(this.d != null)));
    }
}
