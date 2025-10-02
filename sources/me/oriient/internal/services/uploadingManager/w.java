package me.oriient.internal.services.uploadingManager;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class w extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public DataUploaderImpl f25661a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataUploaderImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(DataUploaderImpl dataUploaderImpl, Continuation continuation) {
        super(continuation);
        this.c = dataUploaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.recoverDatabase(this);
    }
}
