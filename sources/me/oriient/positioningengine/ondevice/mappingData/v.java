package me.oriient.positioningengine.ondevice.mappingData;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.dataManager.mapGrid.MapGrid;
import me.oriient.internal.services.dataManager.mapGrid.MapGridRecord;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* loaded from: classes8.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26450a;
    public /* synthetic */ Object b;
    public final /* synthetic */ w c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ double g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, String str, String str2, String str3, double d, Continuation continuation) {
        super(2, continuation);
        this.c = wVar;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        v vVar = new v(this.c, this.d, this.e, this.f, this.g, continuation);
        vVar.b = obj;
        return vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objAwait;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26450a;
        if (i == 0) {
            ResultKt.b(obj);
            Deferred deferredA = BuildersKt.a((CoroutineScope) this.b, ((CoroutineContextProvider) this.c.f.getD()).getIo(), new u(this.c, this.d, this.e, this.f, this.g, null), 2);
            this.f26450a = 1;
            objAwait = deferredA.await(this);
            if (objAwait == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            objAwait = obj;
        }
        Outcome outcomeMapFailure = ((Outcome) objAwait).mapFailure(t.f26448a);
        if (!(outcomeMapFailure instanceof Outcome.Success)) {
            if (outcomeMapFailure instanceof Outcome.Failure) {
                return new Outcome.Failure(((Outcome.Failure) outcomeMapFailure).getValue());
            }
            throw new NoWhenBranchMatchedException();
        }
        MapGrid mapGrid = (MapGrid) ((Outcome.Success) outcomeMapFailure).getValue();
        Intrinsics.h(mapGrid, "<this>");
        MapGridRecord record = mapGrid.getRecord();
        MapGrid.MapGridData mapGridData = mapGrid.getMapGridData();
        Intrinsics.h(mapGridData, "<this>");
        String mapId = mapGridData.getMapId();
        MapGrid.MapGridData.Grid mgrid = mapGridData.getMgrid();
        Intrinsics.h(mgrid, "<this>");
        MappingData.Map.MapGrid.MapGridData.Grid grid = new MappingData.Map.MapGrid.MapGridData.Grid(mgrid.getMx(), mgrid.getMy(), mgrid.getMz(), mgrid.getD(), mgrid.getRes());
        MapGrid.MapGridData.Range mgridxqRange = mapGridData.getMgridxqRange();
        Intrinsics.h(mgridxqRange, "<this>");
        MappingData.Map.MapGrid.MapGridData.Range range = new MappingData.Map.MapGrid.MapGridData.Range(mgridxqRange.getMin(), mgridxqRange.getMax());
        MapGrid.MapGridData.Range mgridyqRange = mapGridData.getMgridyqRange();
        Intrinsics.h(mgridyqRange, "<this>");
        MappingData.Map.MapGrid.MapGridData.Range range2 = new MappingData.Map.MapGrid.MapGridData.Range(mgridyqRange.getMin(), mgridyqRange.getMax());
        MapGrid.MapGridData.CoarseGrid mgridcoarse = mapGridData.getMgridcoarse();
        Intrinsics.h(mgridcoarse, "<this>");
        MappingData.Map.MapGrid.MapGridData.CoarseGrid coarseGrid = new MappingData.Map.MapGrid.MapGridData.CoarseGrid(mgridcoarse.getMx(), mgridcoarse.getMy(), mgridcoarse.getMz(), mgridcoarse.getD(), mgridcoarse.getRes());
        MapGrid.MapGridData.CoarseRange mgridcoarsexqRange = mapGridData.getMgridcoarsexqRange();
        Intrinsics.h(mgridcoarsexqRange, "<this>");
        MappingData.Map.MapGrid.MapGridData.CoarseRange coarseRange = new MappingData.Map.MapGrid.MapGridData.CoarseRange(mgridcoarsexqRange.getMin(), mgridcoarsexqRange.getMax());
        MapGrid.MapGridData.CoarseRange mgridcoarseyqRange = mapGridData.getMgridcoarseyqRange();
        Intrinsics.h(mgridcoarseyqRange, "<this>");
        MappingData.Map.MapGrid.MapGridData.CoarseRange coarseRange2 = new MappingData.Map.MapGrid.MapGridData.CoarseRange(mgridcoarseyqRange.getMin(), mgridcoarseyqRange.getMax());
        MapGrid.MapGridData.GmmPdf gmmpdf = mapGridData.getGmmpdf();
        Intrinsics.h(gmmpdf, "<this>");
        return new Outcome.Success(new MappingData.Map(new MappingData.Map.MapGrid(record, new MappingData.Map.MapGrid.MapGridData(mapId, grid, range, range2, coarseGrid, coarseRange, coarseRange2, new MappingData.Map.MapGrid.MapGridData.GmmPdf(gmmpdf.getR(), gmmpdf.getW(), gmmpdf.getStd()), mapGridData.getDone(), mapGridData.getPlmVersion(), mapGridData.getMajorVersion(), mapGridData.getVersion()))));
    }
}
