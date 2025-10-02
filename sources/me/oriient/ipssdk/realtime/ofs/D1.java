package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabaseImpl;

/* loaded from: classes8.dex */
public final class D1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f25925a;
    public final /* synthetic */ EventTaggingDatabaseImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public D1(EventTaggingDatabaseImpl eventTaggingDatabaseImpl, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f25925a = (Lambda) function1;
        this.b = eventTaggingDatabaseImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new D1(this.b, this.f25925a, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ?? r0 = this.f25925a;
        return new D1(this.b, r0, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            this.f25925a.invoke(this.b.f26189a.getDBTagQueries());
        } catch (Exception e) {
            Logger logger = this.b.b;
            if (logger != null) {
                logger.e("EventTaggingDatabase", "execute: db operation failed", e);
            }
        }
        return Unit.f24250a;
    }
}
