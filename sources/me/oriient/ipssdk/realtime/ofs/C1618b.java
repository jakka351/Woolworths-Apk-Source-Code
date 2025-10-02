package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.services.dataManager.region.BuildingExitRegion;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticLockedSessionStopper;

/* renamed from: me.oriient.ipssdk.realtime.ofs.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1618b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AutomaticLockedSessionStopper f26045a;
    public final /* synthetic */ BuildingExitRegion b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1618b(AutomaticLockedSessionStopper automaticLockedSessionStopper, BuildingExitRegion buildingExitRegion) {
        super(0);
        this.f26045a = automaticLockedSessionStopper;
        this.b = buildingExitRegion;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AutomaticLockedSessionStopper automaticLockedSessionStopper = this.f26045a;
        BuildersKt.c(automaticLockedSessionStopper.b, null, null, new me.oriient.ipssdk.realtime.ips.automatic.a(automaticLockedSessionStopper, this.b, null), 3);
        return Unit.f24250a;
    }
}
