package me.oriient.positioningengine.support;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningUpdate;

/* renamed from: me.oriient.positioningengine.support.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1861v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26573a;
    public final /* synthetic */ PositioningEngine b;
    public final /* synthetic */ OnDeviceSessionsUploadManagerImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861v(PositioningEngine positioningEngine, OnDeviceSessionsUploadManagerImpl onDeviceSessionsUploadManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = positioningEngine;
        this.c = onDeviceSessionsUploadManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1861v(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1861v(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26573a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<PositioningUpdate> positioningUpdates = this.b.getPositioningUpdates();
            C1860u c1860u = new C1860u(this.c, this.b);
            this.f26573a = 1;
            if (positioningUpdates.collect(c1860u, this) == coroutineSingletons) {
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
