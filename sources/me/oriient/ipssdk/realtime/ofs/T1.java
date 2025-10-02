package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.api.listeners.IPSCompletionListener;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingRestServiceImpl;

/* loaded from: classes8.dex */
public final class T1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public EventTaggingRestServiceImpl f26011a;
    public IPSCompletionListener b;
    public /* synthetic */ Object c;
    public final /* synthetic */ EventTaggingRestServiceImpl d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T1(EventTaggingRestServiceImpl eventTaggingRestServiceImpl, Continuation continuation) {
        super(continuation);
        this.d = eventTaggingRestServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return EventTaggingRestServiceImpl.m477access$sendEventTagq7CU6k(this.d, null, null, null, null, this);
    }
}
