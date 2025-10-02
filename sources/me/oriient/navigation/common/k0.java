package me.oriient.navigation.common;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class k0 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f26250a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(List list) {
        super(0);
        this.f26250a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.i(new Pair("newWaypointsCount", Integer.valueOf(this.f26250a.size())));
    }
}
