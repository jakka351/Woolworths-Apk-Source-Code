package me.oriient.positioningengine.support.preloaders;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes8.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26566a;
    public final /* synthetic */ MlModelPreloader b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(MlModelPreloader mlModelPreloader, Continuation continuation) {
        super(continuation);
        this.b = mlModelPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26566a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.preloadData2((Unit) null, (Continuation<? super Outcome<Unit, OriientError>>) this);
    }
}
