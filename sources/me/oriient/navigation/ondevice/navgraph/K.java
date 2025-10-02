package me.oriient.navigation.ondevice.navgraph;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes8.dex */
public final class K extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f26301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(w wVar) {
        super(0);
        this.f26301a = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w wVar = this.f26301a;
        return MapsKt.j(new Pair("buildingId", wVar.f26327a), new Pair("floorId", wVar.b));
    }
}
