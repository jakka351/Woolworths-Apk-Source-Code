package me.oriient.positioningengine.ondevice;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1836x extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MappingData.Building f26492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1836x(MappingData.Building building) {
        super(0);
        this.f26492a = building;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return androidx.constraintlayout.core.state.a.s("buildingId", this.f26492a.getBuildingInfo().getBuildingId());
    }
}
