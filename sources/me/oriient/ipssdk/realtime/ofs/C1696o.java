package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1696o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticSessionStopperImpl f26118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1696o(AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        super(0);
        this.f26118a = automaticSessionStopperImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Building building = this.f26118a.i;
        return androidx.constraintlayout.core.state.a.s("buildingId", building != null ? building.getId() : null);
    }
}
