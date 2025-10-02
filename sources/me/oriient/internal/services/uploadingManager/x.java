package me.oriient.internal.services.uploadingManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25662a;
    public final /* synthetic */ DataUploaderImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(DataUploaderImpl dataUploaderImpl, Continuation continuation) {
        super(continuation);
        this.b = dataUploaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25662a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.sendUploadingStartRequest(null, this);
    }
}
