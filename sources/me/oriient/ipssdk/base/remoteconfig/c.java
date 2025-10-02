package me.oriient.ipssdk.base.remoteconfig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public RemoteConfigManagerImpl f25706a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RemoteConfigManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RemoteConfigManagerImpl remoteConfigManagerImpl, Continuation continuation) {
        super(continuation);
        this.c = remoteConfigManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.refresh(null, this);
    }
}
