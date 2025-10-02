package me.oriient.navigation.common;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.Route;

/* loaded from: classes8.dex */
public final class i0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public NavigationManagerImpl f26246a;
    public Route b;
    public NavigationPosition c;
    public /* synthetic */ Object d;
    public final /* synthetic */ NavigationManagerImpl e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(continuation);
        this.e = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.setNewRoute(null, null, this);
    }
}
