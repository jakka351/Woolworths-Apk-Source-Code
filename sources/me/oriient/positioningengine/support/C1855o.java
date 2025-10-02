package me.oriient.positioningengine.support;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* renamed from: me.oriient.positioningengine.support.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1855o extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f26564a;
    public final /* synthetic */ SpecificEngineConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1855o(double d, SpecificEngineConfig specificEngineConfig) {
        super(0);
        this.f26564a = d;
        this.b = specificEngineConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("storageLeftMb", Double.valueOf(this.f26564a)), new Pair("enableSensorsDataUploading", Boolean.valueOf(this.b.getUploading().getEnableSensorsDataUploading())), new Pair("minimumStorageLeftToUploadSensorsMb", Double.valueOf(this.b.getUploading().getMinimumStorageLeftToUploadSensorsMb())));
    }
}
