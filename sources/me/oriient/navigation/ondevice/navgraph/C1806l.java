package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.navigation.ondevice.navgraph.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1806l extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26316a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1806l(v vVar, String str) {
        super(1);
        this.f26316a = vVar;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        this.f26316a.b.deleteFiles(androidx.camera.core.impl.b.r(new StringBuilder("/nav_graphs/"), this.b, '/'), true, C1805k.f26315a);
        ((me.oriient.navigation.ondevice.navigationgraph.database.servicenavigation.s) queries).a(this.b);
        return Unit.f24250a;
    }
}
