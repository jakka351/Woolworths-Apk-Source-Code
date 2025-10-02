package me.oriient.positioningengine.ondevice;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.positioningengine.common.EngineStopReason;

/* loaded from: classes8.dex */
public final class G extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public I f26399a;
    public /* synthetic */ Object b;
    public final /* synthetic */ I c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(I i, Continuation continuation) {
        super(continuation);
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((EngineStopReason) null, this);
    }
}
