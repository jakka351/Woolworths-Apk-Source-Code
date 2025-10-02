package me.oriient.internal.services.uploadingManager.rest;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class e extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataUploaderRestImpl f25649a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataUploaderRestImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DataUploaderRestImpl dataUploaderRestImpl, Continuation continuation) {
        super(continuation);
        this.c = dataUploaderRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.sendStartChunk(null, null, false, this);
    }
}
