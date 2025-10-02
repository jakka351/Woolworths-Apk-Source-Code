package me.oriient.internal.services.dataManager.obstaclesPolygonsFinder;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes7.dex */
public final class a extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ObstaclesPolygonsFinderFetchData f25268a;
    public /* synthetic */ Object b;
    public final /* synthetic */ c c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, Continuation continuation) {
        super(continuation);
        this.c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.fetchData((ObstaclesPolygonsFinderFetchData) null, (Continuation) this);
    }
}
