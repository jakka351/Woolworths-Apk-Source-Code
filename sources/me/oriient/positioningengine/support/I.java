package me.oriient.positioningengine.support;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* loaded from: classes8.dex */
public final class I extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26503a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(PositioningEngine positioningEngine, OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new I(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26503a;
        if (i == 0) {
            Ref.ObjectRef objectRefX = androidx.camera.core.impl.b.x(obj);
            StateFlow<MappingData.Building.BuildingInfo.FloorMetadata.MapMetadata> currentMap = this.b.getCurrentMap();
            H h = new H(objectRefX, this.c);
            this.f26503a = 1;
            if (currentMap.collect(h, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
