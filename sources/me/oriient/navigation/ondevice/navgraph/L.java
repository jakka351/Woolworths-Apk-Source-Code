package me.oriient.navigation.ondevice.navgraph;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.floorMetadata.FloorImage;

/* loaded from: classes8.dex */
public final class L extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f26302a;
    public final /* synthetic */ String b;
    public final /* synthetic */ FloorImage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(w wVar, String str, FloorImage floorImage) {
        super(1);
        this.f26302a = wVar;
        this.b = str;
        this.c = floorImage;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NavGraph navGraph = (NavGraph) obj;
        Intrinsics.h(navGraph, "navGraph");
        w wVar = this.f26302a;
        return new NavGraphRecord(wVar.f26327a, wVar.b, this.b, this.c.getVersion(), navGraph);
    }
}
