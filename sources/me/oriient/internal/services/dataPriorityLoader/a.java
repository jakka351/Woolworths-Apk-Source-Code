package me.oriient.internal.services.dataPriorityLoader;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public b f25424a;
    public Iterator b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(continuation);
        this.e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, this);
    }
}
