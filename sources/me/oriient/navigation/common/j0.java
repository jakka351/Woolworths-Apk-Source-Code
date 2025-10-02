package me.oriient.navigation.common;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class j0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public NavigationManagerImpl f26248a;
    public /* synthetic */ Object b;
    public final /* synthetic */ NavigationManagerImpl c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(continuation);
        this.c = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.tryToUpdateRouteLocally(null, null, this);
    }
}
