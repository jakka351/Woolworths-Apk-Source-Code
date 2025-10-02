package me.oriient.navigation.common;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;

/* loaded from: classes8.dex */
public final class Y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationConfig f26228a;
    public final /* synthetic */ NavigationManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(NavigationConfig navigationConfig, NavigationManagerImpl navigationManagerImpl) {
        super(0);
        this.f26228a = navigationConfig;
        this.b = navigationManagerImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("useOnDevice", Boolean.TRUE), new Pair("useTailTrimming", Boolean.valueOf(this.f26228a.getShouldUseTailTrimming())), new Pair("firstWaypointTrimming", Boolean.valueOf(this.f26228a.getAllowFirstWaypointTrimming())), new Pair("isLiveNavigationEnabled", Boolean.valueOf(this.b._isLiveNavigationEnabled)));
    }
}
