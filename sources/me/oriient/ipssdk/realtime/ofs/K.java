package me.oriient.ipssdk.realtime.ofs;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.ipssdk.realtime.services.rest.ContentRestServiceImpl;

/* loaded from: classes8.dex */
public final class K extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ContentRestServiceImpl f25962a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ContentRestServiceImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(ContentRestServiceImpl contentRestServiceImpl, Continuation continuation) {
        super(continuation);
        this.c = contentRestServiceImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ContentRestServiceImpl.access$fetchSync(this.c, null, this);
    }
}
