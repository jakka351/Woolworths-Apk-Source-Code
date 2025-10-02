package me.oriient.navigation.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationData f26355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(NavigationData navigationData) {
        super(0);
        this.f26355a = navigationData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26355a.getBuilding().getId()), new Pair("floorsCountWithNavGraphs", Integer.valueOf(this.f26355a.getNavGraphsRecords().size())));
    }
}
