package me.oriient.positioningengine.support.preloaders;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes8.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26567a;
    public final /* synthetic */ OnDeviceEngineSessionPreloader b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OnDeviceEngineSessionPreloader onDeviceEngineSessionPreloader, Continuation continuation) {
        super(continuation);
        this.b = onDeviceEngineSessionPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26567a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.preloadData2((Unit) null, (Continuation<? super Outcome<Unit, OriientError>>) this);
    }
}
