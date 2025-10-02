package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.internal.services.dataManager.preloading.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1408h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25375a;
    public final /* synthetic */ BuildingDataPreloader b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408h(BuildingDataPreloader buildingDataPreloader, String str, Continuation continuation) {
        super(2, continuation);
        this.b = buildingDataPreloader;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1408h(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1408h(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25375a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DataPreloader dataPreloader = this.b.plaiDataPreloader;
        String str = this.c;
        this.f25375a = 1;
        Object objPreloadData = dataPreloader.preloadData(str, this);
        return objPreloadData == coroutineSingletons ? coroutineSingletons : objPreloadData;
    }
}
