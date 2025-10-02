package me.oriient.ipssdk.realtime.ofs;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.ipssdk.base.utils.SdkError;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapperImpl;

/* renamed from: me.oriient.ipssdk.realtime.ofs.w2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1743w2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalProximityEventWrapperImpl f26167a;
    public final /* synthetic */ SdkError b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743w2(LocalProximityEventWrapperImpl localProximityEventWrapperImpl, SdkError sdkError) {
        super(0);
        this.f26167a = localProximityEventWrapperImpl;
        this.b = sdkError;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26167a.getEvent().getBuildingId()), new Pair("floorOrder", Integer.valueOf(this.f26167a.getEvent().getFloorOrder())), new Pair("errorMessage", this.b.getMessage()));
    }
}
