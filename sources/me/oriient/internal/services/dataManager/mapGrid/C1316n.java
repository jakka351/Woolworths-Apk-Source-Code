package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1316n extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f25219a;
    public final /* synthetic */ C1321t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1316n(Function1 function1, C1321t c1321t, Continuation continuation) {
        super(2, continuation);
        this.f25219a = (Lambda) function1;
        this.b = c1321t;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1316n(this.f25219a, this.b, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1316n(this.f25219a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            this.f25219a.invoke(this.b.b.getMapGridQueries());
        } catch (Exception e) {
            ((Logger) this.b.d.getD()).e("MapGridDatabase", "execute: db operation failed", e);
        }
        return Unit.f24250a;
    }
}
