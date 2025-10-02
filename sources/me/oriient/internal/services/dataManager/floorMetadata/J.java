package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes7.dex */
public final class J extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25141a;
    public /* synthetic */ Object b;
    public final /* synthetic */ K c;
    public final /* synthetic */ FloorFetchData d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k, FloorFetchData floorFetchData, Continuation continuation) {
        super(2, continuation);
        this.c = k;
        this.d = floorFetchData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        J j = new J(this.c, this.d, continuation);
        j.b = obj;
        return j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J) create((FloorMetadata) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FloorMetadata floorMetadata;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25141a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorMetadata floorMetadata2 = (FloorMetadata) this.b;
            FloorImagesProvider floorImagesProvider = (FloorImagesProvider) this.c.d.getD();
            this.b = floorMetadata2;
            this.f25141a = 1;
            Object objFetchFloorImage = floorImagesProvider.fetchFloorImage(floorMetadata2, this);
            if (objFetchFloorImage == coroutineSingletons) {
                return coroutineSingletons;
            }
            floorMetadata = floorMetadata2;
            obj = objFetchFloorImage;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floorMetadata = (FloorMetadata) this.b;
            ResultKt.b(obj);
        }
        Outcome map = ((Outcome) obj).map(new I(floorMetadata));
        K k = this.c;
        FloorFetchData floorFetchData = this.d;
        if (map instanceof Outcome.Failure) {
            OriientError oriientError = (OriientError) ((Outcome.Failure) map).getValue();
            ((Logger) k.b.getD()).e("FloorMetadataWithImageSou", "fetchData: failed to floor floor image of " + floorFetchData.getFloorId(), oriientError);
            ((ELog) k.c.getD()).e("FloorMetadataWithImageSou", "Failed to get floor image", MapsKt.j(new Pair("floorId", floorFetchData.getFloorId()), new Pair("errorMessage", oriientError.getMessage())));
        }
        K k2 = this.c;
        FloorFetchData floorFetchData2 = this.d;
        if (map instanceof Outcome.Success) {
            ((Logger) k2.b.getD()).d("FloorMetadataWithImageSou", "fetchData: got floor image of " + floorFetchData2.getFloorId());
            kotlin.reflect.jvm.internal.impl.types.checker.a.q("floorId", floorFetchData2.getFloorId(), (ELog) k2.c.getD(), "FloorMetadataWithImageSou", "Get floor image");
        }
        return map;
    }
}
