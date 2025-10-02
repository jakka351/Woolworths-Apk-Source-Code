package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.navigation.ondevice.navgraph.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1808n extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26318a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1808n(v vVar) {
        super(1);
        this.f26318a = vVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        this.f26318a.b.deleteFiles("/nav_graphs/", true, C1807m.f26317a);
        ((me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) queries).a();
        return Unit.f24250a;
    }
}
