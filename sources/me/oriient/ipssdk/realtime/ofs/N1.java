package me.oriient.ipssdk.realtime.ofs;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingManagerImpl;

/* loaded from: classes8.dex */
public final class N1 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public EventTaggingManagerImpl f25980a;
    public User b;
    public String c;
    public Object d;
    public Iterator e;
    public Object f;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ EventTaggingManagerImpl i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N1(EventTaggingManagerImpl eventTaggingManagerImpl, Continuation continuation) {
        super(continuation);
        this.i = eventTaggingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return EventTaggingManagerImpl.access$sendCachedEventTags(this.i, this);
    }
}
