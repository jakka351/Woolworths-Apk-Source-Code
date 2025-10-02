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
import me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader;

/* renamed from: me.oriient.internal.services.dataManager.floorMetadata.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1286p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25166a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ FloorMetadataRepositoryImpl d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1286p(String str, String str2, FloorMetadataRepositoryImpl floorMetadataRepositoryImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = str2;
        this.d = floorMetadataRepositoryImpl;
        this.e = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1286p(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1286p) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1286p c1286p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25166a;
        if (i == 0) {
            ResultKt.b(obj);
            FloorFetchData floorFetchData = new FloorFetchData(this.b, this.c);
            InterfaceC1280j interfaceC1280j = this.d.floorMetadataPriorityLoader;
            boolean z = this.e;
            this.f25166a = 1;
            c1286p = this;
            obj = DataPriorityLoader.DefaultImpls.loadData$default(interfaceC1280j, floorFetchData, 0.0d, z, c1286p, 2, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            c1286p = this;
        }
        Outcome outcome = (Outcome) obj;
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl = c1286p.d;
        String str = c1286p.c;
        if (outcome instanceof Outcome.Success) {
            kotlin.reflect.jvm.internal.impl.types.checker.a.q("floorId", str, floorMetadataRepositoryImpl.getELog(), "FloorMetadataRepository", "fetchFloorMetadata");
        }
        FloorMetadataRepositoryImpl floorMetadataRepositoryImpl2 = c1286p.d;
        String str2 = c1286p.c;
        if (outcome instanceof Outcome.Failure) {
            floorMetadataRepositoryImpl2.getELog().e("FloorMetadataRepository", "Failed to fetchFloorMetadata", MapsKt.j(new Pair("floorId", str2), new Pair("errorMessage", ((OriientError) ((Outcome.Failure) outcome).getValue()).getMessage())));
        }
        return outcome;
    }
}
