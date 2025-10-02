package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;

/* loaded from: classes8.dex */
public final class L1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public EventTaggingManagerImpl f25968a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EventTaggingManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(EventTaggingManagerImpl eventTaggingManagerImpl, Continuation continuation) {
        super(continuation);
        this.c = eventTaggingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return EventTaggingManagerImpl.access$onRequestError(this.c, null, this);
    }
}
