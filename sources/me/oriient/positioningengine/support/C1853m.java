package me.oriient.positioningengine.support;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.dataModel.engine.SpecificEngineConfig;

/* renamed from: me.oriient.positioningengine.support.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1853m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ double f26562a;
    public final /* synthetic */ SpecificEngineConfig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1853m(double d, SpecificEngineConfig specificEngineConfig) {
        super(0);
        this.f26562a = d;
        this.b = specificEngineConfig;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("storageLeftMb", Double.valueOf(this.f26562a)), new Pair("enableEventsUploading", Boolean.valueOf(this.b.getUploading().getEnableEventsUploading())), new Pair("minimumStorageLeftToUploadEventsMb", Double.valueOf(this.b.getUploading().getMinimumStorageLeftToUploadEventsMb())));
    }
}
