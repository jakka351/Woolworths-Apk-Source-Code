package me.oriient.navigation.ondevice.navgraph;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.ByteArrayExtensionsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;

/* loaded from: classes8.dex */
public final class u extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavGraphRecord f26325a;
    public final /* synthetic */ v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(NavGraphRecord navGraphRecord, v vVar) {
        super(1);
        this.f26325a = navGraphRecord;
        this.b = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws IOException {
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        byte[] byteArray = ByteArrayExtensionsKt.toByteArray(this.f26325a.getNavGraph());
        String str = "/nav_graphs/" + this.f26325a.getBuildingId() + '/' + this.f26325a.getFloorId() + "/nav_graph";
        this.b.b.writeFile(this.b.b.getOrCreateFile(str), byteArray);
        ((me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) queries).a(this.f26325a.getBuildingId(), this.f26325a.getFloorId(), this.f26325a.getSpaceId(), this.f26325a.getVersion(), str, ((TimeProvider) this.b.d.getD()).getCurrentTimeMillis());
        return Unit.f24250a;
    }
}
