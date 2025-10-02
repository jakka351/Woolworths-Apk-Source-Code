package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class T extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25149a;
    public final /* synthetic */ U b;
    public final /* synthetic */ FloorMetadataWithSvgImage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u, FloorMetadataWithSvgImage floorMetadataWithSvgImage, Continuation continuation) {
        super(2, continuation);
        this.b = u;
        this.c = floorMetadataWithSvgImage;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new T(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new T(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25149a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        FloorImagesProvider floorImagesProvider = (FloorImagesProvider) this.b.c.getD();
        FloorMetadataWithSvgImage floorMetadataWithSvgImage = this.c;
        this.f25149a = 1;
        Object objSaveSvgImageToCache = floorImagesProvider.saveSvgImageToCache(floorMetadataWithSvgImage, this);
        return objSaveSvgImageToCache == coroutineSingletons ? coroutineSingletons : objSaveSvgImageToCache;
    }
}
