package me.oriient.navigation.ondevice.navgraph;

import com.squareup.sqldelight.TransactionWithReturn;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.time.TimeProvider;

/* loaded from: classes8.dex */
public final class s extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ me.oriient.navigation.ondevice.navigationgraph.database.b f26323a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ v e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(me.oriient.navigation.ondevice.navigationgraph.database.b bVar, String str, String str2, String str3, v vVar) {
        super(1);
        this.f26323a = bVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TransactionWithReturn transactionWithResult = (TransactionWithReturn) obj;
        Intrinsics.h(transactionWithResult, "$this$transactionWithResult");
        me.oriient.navigation.ondevice.navigationgraph.database.b bVar = this.f26323a;
        String buildingId = this.b;
        String floorId = this.c;
        String spaceId = this.d;
        me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s sVar = (me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) bVar;
        sVar.getClass();
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(spaceId, "spaceId");
        me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.h mapper = me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.h.f26339a;
        Intrinsics.h(mapper, "mapper");
        me.oriient.navigation.ondevice.navigationgraph.database.a aVar = (me.oriient.navigation.ondevice.navigationgraph.database.a) new me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.d(sVar, buildingId, floorId, spaceId, new me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.g(mapper)).executeAsOneOrNull();
        if (aVar == null) {
            return null;
        }
        me.oriient.navigation.ondevice.navigationgraph.database.b bVar2 = this.f26323a;
        v vVar = this.e;
        me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s sVar2 = (me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) bVar2;
        sVar2.a(((TimeProvider) vVar.d.getD()).getCurrentTimeMillis(), this.b, this.c, this.d);
        return aVar;
    }
}
