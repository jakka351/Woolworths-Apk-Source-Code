package me.oriient.internal.services.uploadingManager.rest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25646a;
    public final /* synthetic */ DataUploaderRestImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataUploaderRestImpl dataUploaderRestImpl, Continuation continuation) {
        super(continuation);
        this.b = dataUploaderRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25646a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.sendEndChunk(null, this);
    }
}
