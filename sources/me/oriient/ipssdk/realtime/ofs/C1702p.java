package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataManager.building.Building;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.automatic.AutomaticSessionStopperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1702p extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SdkError f26124a;
    public final /* synthetic */ AutomaticSessionStopperImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702p(SdkError sdkError, AutomaticSessionStopperImpl automaticSessionStopperImpl) {
        super(0);
        this.f26124a = sdkError;
        this.b = automaticSessionStopperImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Pair pair = new Pair("errorMessage", this.f26124a.getMessage());
        Building building = this.b.i;
        return MapsKt.j(pair, new Pair("buildingId", building != null ? building.getId() : null));
    }
}
