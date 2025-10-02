package me.oriient.internal.services.uploadingManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes7.dex */
public final class J extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25619a;
    public final /* synthetic */ DataUploaderItemsStorageImpl b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Function1 function1, DataUploaderItemsStorageImpl dataUploaderItemsStorageImpl, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f25619a = function1;
        this.b = dataUploaderItemsStorageImpl;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new J(this.f25619a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return this.f25619a.invoke(this.b.database.getDbUploadItemQueries());
        } catch (Exception e) {
            this.b.getLogger().e("DataUploaderItemsStorag", "execute: db operation failed", e);
            this.b.getELog().e("DataUploaderItemsStorag", "uploading db failure", new I(e));
            return this.c;
        }
    }
}
