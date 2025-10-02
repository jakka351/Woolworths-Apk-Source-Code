package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: me.oriient.navigation.ondevice.navgraph.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1802h extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f26312a;
    public final /* synthetic */ double b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1802h(v vVar, double d) {
        super(1);
        this.f26312a = vVar;
        this.b = d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me.oriient.navigation.ondevice.navigationgraph.database.b queries = (me.oriient.navigation.ondevice.navigationgraph.database.b) obj;
        Intrinsics.h(queries, "queries");
        queries.transaction(false, new C1801g(this.f26312a, this.b, queries));
        return Unit.f24250a;
    }
}
