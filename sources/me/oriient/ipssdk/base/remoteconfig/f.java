package me.oriient.ipssdk.base.remoteconfig;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class f extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public RemoteConfigRestImpl f25708a;
    public /* synthetic */ Object b;
    public final /* synthetic */ RemoteConfigRestImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RemoteConfigRestImpl remoteConfigRestImpl, Continuation continuation) {
        super(continuation);
        this.c = remoteConfigRestImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.fetchRemoteConfig(null, this);
    }
}
