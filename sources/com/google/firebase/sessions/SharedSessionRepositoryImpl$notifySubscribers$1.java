package com.google.firebase.sessions;

import com.google.firebase.sessions.SharedSessionRepositoryImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.google.firebase.sessions.SharedSessionRepositoryImpl", f = "SharedSessionRepository.kt", l = {199}, m = "notifySubscribers")
/* loaded from: classes.dex */
final class SharedSessionRepositoryImpl$notifySubscribers$1 extends ContinuationImpl {
    public String p;
    public SharedSessionRepositoryImpl.NotificationType q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SharedSessionRepositoryImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedSessionRepositoryImpl$notifySubscribers$1(SharedSessionRepositoryImpl sharedSessionRepositoryImpl, Continuation continuation) {
        super(continuation);
        this.s = sharedSessionRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return SharedSessionRepositoryImpl.d(this.s, null, null, this);
    }
}
