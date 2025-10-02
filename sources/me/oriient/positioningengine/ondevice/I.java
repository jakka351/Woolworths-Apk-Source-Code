package me.oriient.positioningengine.ondevice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.UtilsKt;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfig;
import me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.elog.Metric;
import me.oriient.internal.services.sensorsManager.sensors.SensorsDataSample;
import me.oriient.positioningengine.common.CalibrationContext;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.common.EngineStopReason;
import me.oriient.positioningengine.common.PositioningContext;
import me.oriient.positioningengine.common.PositioningEngine;
import me.oriient.positioningengine.common.PositioningEngineState;
import me.oriient.positioningengine.common.util.PositioningEngineError;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingManager;
import me.oriient.positioningengine.ondevice.debugging.PositioningDebuggingWalk;
import me.oriient.positioningengine.ondevice.initialization.EngineSessionConfig;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.mappingData.MappingDataProvider;
import me.oriient.positioningengine.ondevice.models.EngineSessionInfo;
import me.oriient.positioningengine.ondevice.models.calibration.CalibrationData;
import me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo;
import me.oriient.positioningengine.ondevice.util.EngineErrorHandler;
import me.oriient.positioningengine.support.device_data.model.PredefinedDataShift;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I implements PositioningEngine {

    @NotNull
    public static final C1817d Companion = new C1817d();
    public me.oriient.positioningengine.ondevice.models.c A;
    public final me.oriient.positioningengine.ondevice.initialization.a B;
    public final Lazy C;
    public final ArrayList D;
    public long E;

    /* renamed from: a, reason: collision with root package name */
    public final double f26401a;
    public final me.oriient.positioningengine.ondevice.calibration.e b;
    public final CoroutineContext c;
    public final boolean d;
    public final PredefinedDataShift e;
    public final OnDeviceEngineCoreConfigProvider f;
    public final OnDeviceEnginePerformanceMonitor g;
    public final PositioningDebuggingManager h;
    public final MutableStateFlow i;
    public final MutableStateFlow j;
    public final MutableStateFlow k;
    public final MutableSharedFlow l;
    public final MutableSharedFlow m;
    public final MutableSharedFlow n;
    public final MutableSharedFlow o;
    public final MutableSharedFlow p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;
    public final C1821h x;
    public X y;
    public MappingData.Building.BuildingInfo z;

    public I(String spaceId, int i, double d, me.oriient.positioningengine.ondevice.calibration.e calibrationDataRepository, CoroutineContext engineCoroutineContext, boolean z, PredefinedDataShift predefinedDataShift, OnDeviceEngineCoreConfigProvider engineCoreConfigProvider, OnDeviceEnginePerformanceMonitor performanceMonitor, PositioningDebuggingManager positioningDebuggingManager) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(calibrationDataRepository, "calibrationDataRepository");
        Intrinsics.h(engineCoroutineContext, "engineCoroutineContext");
        Intrinsics.h(engineCoreConfigProvider, "engineCoreConfigProvider");
        Intrinsics.h(performanceMonitor, "performanceMonitor");
        this.f26401a = d;
        this.b = calibrationDataRepository;
        this.c = engineCoroutineContext;
        this.d = z;
        this.e = predefinedDataShift;
        this.f = engineCoreConfigProvider;
        this.g = performanceMonitor;
        this.h = positioningDebuggingManager;
        this.i = StateFlowKt.a(new PositioningEngineState.Idle());
        this.j = StateFlowKt.a(null);
        this.k = StateFlowKt.a(null);
        this.l = UtilsKt.EventFlow();
        this.m = UtilsKt.EventFlow();
        BufferOverflow bufferOverflow = BufferOverflow.e;
        this.n = SharedFlowKt.a(0, i, bufferOverflow);
        this.o = SharedFlowKt.a(0, i, bufferOverflow);
        this.p = SharedFlowKt.a(0, i, bufferOverflow);
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.q = di.inject(reflectionFactory.b(Logger.class));
        Lazy lazyInject = DiKt.getDi().inject(reflectionFactory.b(TimeProvider.class));
        this.r = lazyInject;
        this.s = DiKt.getDi().inject(reflectionFactory.b(ELog.class));
        this.t = DiKt.getDi().inject(reflectionFactory.b(Metric.class));
        this.u = DiKt.getDi().inject(reflectionFactory.b(L.class));
        this.v = DiKt.getDi().inject(reflectionFactory.b(EngineErrorHandler.class));
        this.w = DiKt.getDi().inject(reflectionFactory.b(MappingDataProvider.class));
        C1821h c1821h = new C1821h(this);
        this.x = c1821h;
        this.A = new me.oriient.positioningengine.ondevice.models.c();
        this.B = new me.oriient.positioningengine.ondevice.initialization.a(spaceId, engineCoreConfigProvider);
        Lazy lazyB = LazyKt.b(new C1823j(this));
        this.C = lazyB;
        this.D = new ArrayList();
        this.E = ((TimeProvider) lazyInject.getD()).getCurrentTimeMillis();
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1813b(this, null), 3);
        BuildersKt.c((CoroutineScope) lazyB.getD(), null, null, new C1814c(this, null), 3);
        me.oriient.positioningengine.ondevice.debugging.o oVar = positioningDebuggingManager instanceof me.oriient.positioningengine.ondevice.debugging.o ? (me.oriient.positioningengine.ondevice.debugging.o) positioningDebuggingManager : null;
        if (oVar != null) {
            ((me.oriient.positioningengine.ondevice.debugging.n) oVar).n = c1821h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.positioningengine.ondevice.I r59, me.oriient.positioningengine.ondevice.mappingData.MappingData.Building r60, long r61, kotlin.coroutines.jvm.internal.ContinuationImpl r63) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(me.oriient.positioningengine.ondevice.I, me.oriient.positioningengine.ondevice.mappingData.MappingData$Building, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(me.oriient.positioningengine.ondevice.I r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof me.oriient.positioningengine.ondevice.C1830q
            if (r0 == 0) goto L16
            r0 = r5
            me.oriient.positioningengine.ondevice.q r0 = (me.oriient.positioningengine.ondevice.C1830q) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            me.oriient.positioningengine.ondevice.q r0 = new me.oriient.positioningengine.ondevice.q
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f26476a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.ResultKt.b(r5)
            goto L4f
        L32:
            kotlin.ResultKt.b(r5)
            kotlin.Lazy r5 = r4.v
            java.lang.Object r5 = r5.getD()
            me.oriient.positioningengine.ondevice.util.EngineErrorHandler r5 = (me.oriient.positioningengine.ondevice.util.EngineErrorHandler) r5
            kotlinx.coroutines.flow.SharedFlow r5 = r5.getEngineErrorFlow()
            me.oriient.positioningengine.ondevice.r r2 = new me.oriient.positioningengine.ondevice.r
            r2.<init>(r4)
            r0.c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.b(me.oriient.positioningengine.ondevice.I, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(me.oriient.positioningengine.ondevice.I r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.c(me.oriient.positioningengine.ondevice.I, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final SharedFlow getActiveFloorUpdates() {
        return this.l;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final StateFlow getCalibrationNeededUpdates() {
        return this.b.c;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final SharedFlow getCalibrationUpdates() {
        return this.n;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object getCurrentCalibrationInfo(Continuation continuation) {
        return BuildersKt.f(this.c, new C1824k(this, null), continuation);
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final OnDeviceEngineCoreConfig getCurrentCoreConfig() {
        PositioningEngineState positioningEngineState = (PositioningEngineState) this.i.getValue();
        if (positioningEngineState instanceof PositioningEngineState.Positioning) {
            return this.f.configForBuilding(((PositioningEngineState.Positioning) positioningEngineState).getContext().getBuildingId());
        }
        if (positioningEngineState instanceof PositioningEngineState.Calibrating) {
            return this.f.configForBuilding(((PositioningEngineState.Calibrating) positioningEngineState).getContext().getBuildingId());
        }
        if (positioningEngineState instanceof PositioningEngineState.Idle) {
            return this.f.configForBuilding(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object getCurrentEngineAnalytics(Continuation continuation) {
        return BuildersKt.f(this.c, new C1825l(this, null), continuation);
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final StateFlow getCurrentFloor() {
        return this.j;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final StateFlow getCurrentMap() {
        return this.k;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object getCurrentPerformanceReport(Continuation continuation) {
        return BuildersKt.f(this.c, new C1826m(this, null), continuation);
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final EngineSessionConfig getCurrentSessionConfig() {
        X x = this.y;
        if (x != null) {
            return x.h;
        }
        return null;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final SharedFlow getErrors() {
        return this.m;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object getLastSuccessfulCalibrationInfo(Continuation continuation) {
        return BuildersKt.f(this.c, new C1827n(this, null), continuation);
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final String getLastValidCalibrationSessionId() {
        me.oriient.positioningengine.ondevice.models.calibration.b bVar = this.b.f;
        if (bVar != null) {
            return bVar.b;
        }
        return null;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final SharedFlow getPositioningUpdates() {
        return this.o;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final PredefinedDataShift getPredefinedDataShift() {
        return this.e;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final EngineSessionInfo getSessionInfo() {
        return this.A;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final StateFlow getState() {
        return this.i;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final SharedFlow getValidationUpdates() {
        return this.p;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final boolean isSmartCartMode() {
        return this.d;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final void onNewSample(SensorsDataSample sample) {
        Intrinsics.h(sample, "sample");
        BuildersKt.c((CoroutineScope) this.C.getD(), null, null, new C1834v(this, sample, null), 3);
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object startCalibration(CalibrationContext calibrationContext, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(this.c, new B(this, calibrationContext, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object startPositioning(PositioningContext positioningContext, Continuation continuation) throws Throwable {
        ((Logger) this.q.getD()).d("OnDeviceEngine", "startPositioning() called with: context = " + positioningContext);
        Object objF = BuildersKt.f(this.c, new C(this, positioningContext, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // me.oriient.positioningengine.common.PositioningEngine
    public final Object stop(EngineStopReason engineStopReason, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(this.c, new F(this, engineStopReason, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    public static final Logger b(I i) {
        return (Logger) i.q.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.positioningengine.ondevice.I r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof me.oriient.positioningengine.ondevice.C1828o
            if (r0 == 0) goto L16
            r0 = r5
            me.oriient.positioningengine.ondevice.o r0 = (me.oriient.positioningengine.ondevice.C1828o) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.c = r1
            goto L1b
        L16:
            me.oriient.positioningengine.ondevice.o r0 = new me.oriient.positioningengine.ondevice.o
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.f26474a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            kotlin.ResultKt.b(r5)
            goto L45
        L32:
            kotlin.ResultKt.b(r5)
            kotlinx.coroutines.flow.MutableStateFlow r5 = r4.i
            me.oriient.positioningengine.ondevice.p r2 = new me.oriient.positioningengine.ondevice.p
            r2.<init>(r4)
            r0.c = r3
            java.lang.Object r4 = r5.collect(r2, r0)
            if (r4 != r1) goto L45
            return r1
        L45:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(me.oriient.positioningengine.ondevice.I, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(I i, EngineCalibrationInfo engineCalibrationInfo, PositioningContext positioningContext) {
        Object objLogDescription;
        String lastSuccessfulTime;
        i.getClass();
        Long lValueOf = null;
        CalibrationData calibrationData = engineCalibrationInfo != null ? engineCalibrationInfo.getCalibrationData() : null;
        Double dValueOf = calibrationData != null ? Double.valueOf(calibrationData.getProgress()) : null;
        PredefinedDataShift predefinedDataShift = i.e;
        if (predefinedDataShift == null || (objLogDescription = predefinedDataShift.logDescription()) == null) {
            objLogDescription = "empty";
        }
        LinkedHashMap linkedHashMapL = MapsKt.l(new Pair("sessionId", positioningContext.getSessionId()), new Pair("buildingId", positioningContext.getBuildingId()), new Pair("floorIds", CollectionsKt.M(positioningContext.getInitialFloorIds(), ",", null, null, null, 62)), new Pair("isOutOfGeofence", Boolean.valueOf(positioningContext.isOutOfGeofence())), new Pair("isSFKL", Boolean.valueOf(positioningContext.getStartPosition() != null)), new Pair("engineState", ((PositioningEngineState) i.i.getValue()).logDescription$service_positioning_engine_publishRelease()), new Pair("engineType", me.oriient.positioningengine.common.u.ON_DEVICE.getValue$service_positioning_engine_publishRelease()), new Pair("_predefinedDataShift", objLogDescription));
        ((ELog) i.s.getD()).i("OnDeviceEngine", "Start positioning called", linkedHashMapL);
        if (calibrationData != null && (lastSuccessfulTime = calibrationData.getLastSuccessfulTime()) != null) {
            lValueOf = Long.valueOf(me.oriient.positioningengine.common.util.a.a(lastSuccessfulTime, ((TimeProvider) i.r.getD()).getTimeZoneGmt()));
        }
        if (lValueOf != null) {
            linkedHashMapL.put("lastCalibrationTime", Long.valueOf(lValueOf.longValue()));
        }
        ((Metric) i.t.getD()).i("OnDeviceEngine", "startPositioning", dValueOf != null ? dValueOf.doubleValue() : 0.0d, MapsKt.q(linkedHashMapL));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(me.oriient.positioningengine.ondevice.I r9, me.oriient.positioningengine.common.PositioningContext r10, boolean r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(me.oriient.positioningengine.ondevice.I, me.oriient.positioningengine.common.PositioningContext, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void a(I i, MappingData.FloorFullData floorFullData) {
        ((Logger) i.q.getD()).d("OnDeviceEngine", "onFloorDownloaded() called with: floorId = " + floorFullData.getMetadata().getFloorId());
        me.oriient.positioningengine.ondevice.models.c cVar = i.A;
        long currentTimeMillis = ((TimeProvider) i.r.getD()).getCurrentTimeMillis();
        cVar.getClass();
        ArrayList arrayList = cVar.c;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (Intrinsics.c(((EngineSessionInfo.FloorDataVersion) it.next()).getFloorId(), floorFullData.getMetadata().getFloorId())) {
                    return;
                }
            }
        }
        cVar.c.add(new EngineSessionInfo.FloorDataVersion(floorFullData.getMetadata().getFloorId(), floorFullData.getObstacles().getMapVersion()));
        cVar.j.add(new EngineSessionInfo.FloorLoadingTimestamp(floorFullData.getMetadata().getFloorId(), currentTimeMillis));
    }

    public static final ELog a(I i) {
        return (ELog) i.s.getD();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.ondevice.EngineSessionMetadata r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            boolean r2 = r1 instanceof me.oriient.positioningengine.ondevice.A
            if (r2 == 0) goto L17
            r2 = r1
            me.oriient.positioningengine.ondevice.A r2 = (me.oriient.positioningengine.ondevice.A) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e = r3
            goto L1c
        L17:
            me.oriient.positioningengine.ondevice.A r2 = new me.oriient.positioningengine.ondevice.A
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r2.e
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L39
            if (r4 != r6) goto L31
            me.oriient.positioningengine.ondevice.EngineSessionMetadata r3 = r2.b
            me.oriient.positioningengine.ondevice.I r2 = r2.f26393a
            kotlin.ResultKt.b(r1)
            r8 = r3
            goto L57
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            kotlin.ResultKt.b(r1)
            me.oriient.positioningengine.ondevice.X r1 = r0.y
            if (r1 != 0) goto Lc2
            me.oriient.positioningengine.ondevice.calibration.e r1 = r0.b
            r2.f26393a = r0
            r4 = r20
            r2.b = r4
            r2.e = r6
            me.oriient.positioningengine.ondevice.models.calibration.b r1 = r1.f
            if (r1 == 0) goto L51
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo r1 = r1.c
            goto L52
        L51:
            r1 = r5
        L52:
            if (r1 != r3) goto L55
            return r3
        L55:
            r2 = r0
            r8 = r4
        L57:
            r9 = r1
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo r9 = (me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo) r9
            me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r10 = r2.e
            if (r10 == 0) goto L90
            if (r9 == 0) goto L70
            me.oriient.positioningengine.ondevice.models.calibration.CalibrationData r1 = r9.getCalibrationData()
            if (r1 == 0) goto L70
            java.lang.String r1 = r1.getLastSuccessfulTime()
            if (r1 != 0) goto L6d
            goto L70
        L6d:
            r16 = r1
            goto L83
        L70:
            kotlin.Lazy r1 = r2.r
            java.lang.Object r1 = r1.getD()
            me.oriient.internal.infra.utils.core.time.TimeProvider r1 = (me.oriient.internal.infra.utils.core.time.TimeProvider) r1
            java.util.TimeZone r1 = r1.getTimeZoneGmt()
            r3 = 0
            java.lang.String r1 = me.oriient.positioningengine.common.util.a.a(r3, r1)
            goto L6d
        L83:
            r17 = 15
            r18 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            me.oriient.positioningengine.support.device_data.model.PredefinedDataShift r5 = me.oriient.positioningengine.support.device_data.model.PredefinedDataShift.copy$default(r10, r11, r13, r14, r15, r16, r17, r18)
        L90:
            r10 = r5
            me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor r1 = r2.g
            long r3 = r8.getStartTime()
            r1.initialize(r3)
            kotlin.Lazy r1 = r2.u
            java.lang.Object r1 = r1.getD()
            me.oriient.positioningengine.ondevice.L r1 = (me.oriient.positioningengine.ondevice.L) r1
            me.oriient.positioningengine.ondevice.h r7 = r2.x
            me.oriient.internal.services.dataModel.engine.OnDeviceEngineCoreConfigProvider r11 = r2.f
            me.oriient.positioningengine.ondevice.OnDeviceEnginePerformanceMonitor r12 = r2.g
            r1.getClass()
            java.lang.String r1 = "delegate"
            kotlin.jvm.internal.Intrinsics.h(r7, r1)
            java.lang.String r1 = "engineCoreConfigProvider"
            kotlin.jvm.internal.Intrinsics.h(r11, r1)
            java.lang.String r1 = "performanceMonitor"
            kotlin.jvm.internal.Intrinsics.h(r12, r1)
            me.oriient.positioningengine.ondevice.X r6 = new me.oriient.positioningengine.ondevice.X
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r2.y = r6
            return r6
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(me.oriient.positioningengine.ondevice.EngineSessionMetadata, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(me.oriient.positioningengine.common.EngineStopReason r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(me.oriient.positioningengine.common.EngineStopReason, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof me.oriient.positioningengine.ondevice.H
            if (r0 == 0) goto L13
            r0 = r10
            me.oriient.positioningengine.ondevice.H r0 = (me.oriient.positioningengine.ondevice.H) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            me.oriient.positioningengine.ondevice.H r0 = new me.oriient.positioningengine.ondevice.H
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.e
            r3 = 2
            r4 = 1
            kotlin.Unit r5 = kotlin.Unit.f24250a
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.ResultKt.b(r10)
            goto Lb8
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L36:
            java.lang.String r2 = r0.b
            me.oriient.positioningengine.ondevice.I r4 = r0.f26400a
            kotlin.ResultKt.b(r10)
            goto L7a
        L3e:
            kotlin.ResultKt.b(r10)
            kotlinx.coroutines.flow.MutableStateFlow r10 = r9.i
            java.lang.Object r10 = r10.getValue()
            me.oriient.positioningengine.common.PositioningEngineState r10 = (me.oriient.positioningengine.common.PositioningEngineState) r10
            boolean r2 = r10 instanceof me.oriient.positioningengine.common.PositioningEngineState.Calibrating
            if (r2 == 0) goto L59
            me.oriient.positioningengine.common.PositioningEngineState$Calibrating r10 = (me.oriient.positioningengine.common.PositioningEngineState.Calibrating) r10
            me.oriient.positioningengine.common.CalibrationContext r10 = r10.getContext()
            java.lang.String r10 = r10.getSessionId()
        L57:
            r2 = r10
            goto L68
        L59:
            boolean r2 = r10 instanceof me.oriient.positioningengine.common.PositioningEngineState.Positioning
            if (r2 == 0) goto Lb9
            me.oriient.positioningengine.common.PositioningEngineState$Positioning r10 = (me.oriient.positioningengine.common.PositioningEngineState.Positioning) r10
            me.oriient.positioningengine.common.PositioningContext r10 = r10.getContext()
            java.lang.String r10 = r10.getSessionId()
            goto L57
        L68:
            me.oriient.positioningengine.ondevice.X r10 = r9.y
            if (r10 == 0) goto L7d
            r0.f26400a = r9
            r0.b = r2
            r0.e = r4
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult r10 = r10.b()
            if (r10 != r1) goto L79
            goto Lb7
        L79:
            r4 = r9
        L7a:
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult r10 = (me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfoEngineResult) r10
            goto L7f
        L7d:
            r4 = r9
            r10 = r6
        L7f:
            java.lang.String r7 = "OnDeviceEngine"
            if (r10 != 0) goto L91
            kotlin.Lazy r10 = r4.s
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.services.elog.ELog r10 = (me.oriient.internal.services.elog.ELog) r10
            java.lang.String r0 = "Calibration saving - no data available"
            r10.d(r7, r0)
            goto La4
        L91:
            boolean r8 = r10.isSuccessful()
            if (r8 != 0) goto La5
            kotlin.Lazy r10 = r4.s
            java.lang.Object r10 = r10.getD()
            me.oriient.internal.services.elog.ELog r10 = (me.oriient.internal.services.elog.ELog) r10
            java.lang.String r0 = "Calibration saving - calibration is not finished"
            r10.d(r7, r0)
        La4:
            return r5
        La5:
            me.oriient.positioningengine.ondevice.calibration.e r4 = r4.b
            me.oriient.positioningengine.ondevice.models.calibration.EngineCalibrationInfo r10 = r10.getEngineCalibrationInfo()
            r0.f26400a = r6
            r0.b = r6
            r0.e = r3
            java.lang.Object r10 = r4.a(r10, r2, r0)
            if (r10 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            return r5
        Lb9:
            boolean r10 = r10 instanceof me.oriient.positioningengine.common.PositioningEngineState.Idle
            if (r10 == 0) goto Lbe
            return r5
        Lbe:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.positioningengine.ondevice.I.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object a(PositioningEngineError positioningEngineError, Continuation continuation) {
        PositioningDebuggingManager positioningDebuggingManager = this.h;
        PositioningDebuggingWalk walk = positioningDebuggingManager != null ? positioningDebuggingManager.getWalk() : null;
        Unit unit = Unit.f24250a;
        if (walk != null) {
            return unit;
        }
        ((Logger) this.q.getD()).e("OnDeviceEngine", "onError() called with", positioningEngineError);
        this.m.f(positioningEngineError);
        Object objA = a(new EngineStopReason.Error(positioningEngineError), continuation);
        return objA == CoroutineSingletons.d ? objA : unit;
    }
}
