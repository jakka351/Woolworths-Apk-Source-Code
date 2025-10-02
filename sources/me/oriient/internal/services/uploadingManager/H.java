package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class H extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25617a;
    public final /* synthetic */ DataUploaderItemsStorageImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(Function1 function1, DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl, Continuation continuation) {
        super(2, continuation);
        this.f25617a = function1;
        this.b = dataUploaderItemsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new H(this.f25617a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H(this.f25617a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            this.f25617a.invoke(this.b.database.getDbUploadItemQueries());
        } catch (Exception e) {
            this.b.getLogger().e("DataUploaderItemsStorag", "execute: db operation failed", e);
        }
        return Unit.f24250a;
    }
}
