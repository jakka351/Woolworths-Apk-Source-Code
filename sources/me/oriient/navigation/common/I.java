package me.oriient.navigation.common;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.NavigationWaypoint;

/* loaded from: classes8.dex */
public final class I extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public NavigationManagerImpl f26213a;
    public NavigationPosition b;
    public List c;
    public NavigationWaypoint d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ NavigationManagerImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(continuation);
        this.g = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.calculateRouteImpl(null, null, null, null, this);
    }
}
