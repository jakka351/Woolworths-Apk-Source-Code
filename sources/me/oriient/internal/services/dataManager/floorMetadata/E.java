package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25137a;
    public final /* synthetic */ F b;
    public final /* synthetic */ FloorMetadataWithImage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(F f, FloorMetadataWithImage floorMetadataWithImage, Continuation continuation) {
        super(2, continuation);
        this.b = f;
        this.c = floorMetadataWithImage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25137a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FloorImagesProvider floorImagesProvider = (FloorImagesProvider) this.b.c.getD();
        FloorMetadataWithImage floorMetadataWithImage = this.c;
        this.f25137a = 1;
        Object objSaveImageToCache = floorImagesProvider.saveImageToCache(floorMetadataWithImage, this);
        return objSaveImageToCache == coroutineSingletons ? coroutineSingletons : objSaveImageToCache;
    }
}
