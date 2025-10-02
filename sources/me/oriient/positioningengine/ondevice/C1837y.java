package me.oriient.positioningengine.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1837y extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PositioningEngineError f26493a;
    public final /* synthetic */ MappingData.Building b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837y(PositioningEngineError positioningEngineError, MappingData.Building building) {
        super(0);
        this.f26493a = positioningEngineError;
        this.b = building;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("errorMessage", this.f26493a.getMessage()), new Pair("buildingId", this.b.getBuildingInfo().getBuildingId()));
    }
}
