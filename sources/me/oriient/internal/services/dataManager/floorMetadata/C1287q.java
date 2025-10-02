package me.oriient.internal.services.dataManager.floorMetadata;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.dataManager.DataRepository;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1287q extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25167a;
    public final /* synthetic */ FloorMetadataRepositoryImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1287q(FloorMetadataRepositoryImpl floorMetadataRepositoryImpl, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.b = floorMetadataRepositoryImpl;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1287q(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1287q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25167a;
        if (i == 0) {
            ResultKt.b(obj);
            DataRepository dataRepository = this.b.floorMetadataWithImageRepository;
            FloorFetchData floorFetchData = new FloorFetchData(this.c, this.d);
            this.f25167a = 1;
            obj = dataRepository.getData(floorFetchData, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl = this.b;
        String str = this.d;
        if (outcome instanceof Outcome.Success) {
            kotlin.reflect.jvm.internal.impl.types.checker.a.q("floorId", str, floorMetadataRepositoryImpl.getELog(), "FloorMetadataRepository", "Get fetchFloorMetadataWithBitmap");
        }
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl2 = this.b;
        String str2 = this.d;
        if (outcome instanceof Outcome.Failure) {
            floorMetadataRepositoryImpl2.getELog().e("FloorMetadataRepository", "Failed to fetchFloorMetadataWithBitmap", MapsKt.j(new Pair("floorId", str2), new Pair("errorMessage", ((OriientError) ((Outcome.Failure) outcome).getValue()).getMessage())));
        }
        return outcome;
    }
}
