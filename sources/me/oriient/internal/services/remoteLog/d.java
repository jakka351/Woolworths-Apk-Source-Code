package me.oriient.internal.services.remoteLog;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class d extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public e f25526a;
    public List b;
    public List c;
    public Iterator d;
    public me.oriient.internal.services.remoteLog.models.a e;
    public /* synthetic */ Object f;
    public final /* synthetic */ e g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a((List) null, this);
    }
}
