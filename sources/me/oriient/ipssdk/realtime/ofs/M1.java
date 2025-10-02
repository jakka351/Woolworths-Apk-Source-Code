package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;

/* loaded from: classes8.dex */
public final class M1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public EventTaggingManagerImpl f25974a;
    public List b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ EventTaggingManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M1(EventTaggingManagerImpl eventTaggingManagerImpl, Continuation continuation) {
        super(continuation);
        this.e = eventTaggingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return EventTaggingManagerImpl.access$resetAllInProgressTags(this.e, this);
    }
}
