package me.oriient.ipssdk.realtime.ofs;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.internal.services.geofence.models.BuildingGeofenceStatus;
import me.oriient.internal.services.geofence.models.GeofenceBuilding;
import me.oriient.ipssdk.base.remoteconfig.RemoteConfig;
import me.oriient.ipssdk.realtime.ips.Core;
import me.oriient.ipssdk.realtime.ips.DataManager;
import me.oriient.ipssdk.realtime.ips.Positioning;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: me.oriient.ipssdk.realtime.ofs.n1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1692n1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26114a;

    public C1692n1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1692n1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1692n1((Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26114a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<Integer> connectionStateFlow = Core.INSTANCE.getConnectionStateFlow();
            StateFlow<Boolean> stateFlowIsPreheatingEnabled = Positioning.INSTANCE.isPreheatingEnabled();
            DataManager dataManager = DataManager.INSTANCE;
            StateFlow<RemoteConfig> config = DataManager.access$getRemoteConfigManager(dataManager).getConfig();
            final StateFlow<Map<GeofenceBuilding, BuildingGeofenceStatus>> circularStatus = DataManager.access$getBuildingGeofenceManager(dataManager).getCircularStatus();
            FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2J = FlowKt.j(connectionStateFlow, stateFlowIsPreheatingEnabled, config, FlowKt.r(new Flow<List<? extends String>>() { // from class: me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ FlowCollector f25827a;

                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2", f = "DataManager.kt", l = {223}, m = "emit")
                    @SourceDebugExtension
                    /* renamed from: me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* renamed from: a, reason: collision with root package name */
                        /* synthetic */ Object f25828a;
                        int b;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f25828a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.f25827a = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @org.jetbrains.annotations.Nullable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2$1 r0 = (me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.b = r1
                            goto L18
                        L13:
                            me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2$1 r0 = new me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.f25828a
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                            int r2 = r0.b
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            kotlin.ResultKt.b(r8)
                            goto L97
                        L27:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L2f:
                            kotlin.ResultKt.b(r8)
                            kotlinx.coroutines.flow.FlowCollector r8 = r6.f25827a
                            java.util.Map r7 = (java.util.Map) r7
                            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                            r2.<init>()
                            java.util.Set r7 = r7.entrySet()
                            java.util.Iterator r7 = r7.iterator()
                        L43:
                            boolean r4 = r7.hasNext()
                            if (r4 == 0) goto L63
                            java.lang.Object r4 = r7.next()
                            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                            java.lang.Object r5 = r4.getValue()
                            boolean r5 = r5 instanceof me.oriient.internal.services.geofence.models.BuildingGeofenceStatus.Inside
                            if (r5 == 0) goto L43
                            java.lang.Object r5 = r4.getKey()
                            java.lang.Object r4 = r4.getValue()
                            r2.put(r5, r4)
                            goto L43
                        L63:
                            java.util.ArrayList r7 = new java.util.ArrayList
                            int r4 = r2.size()
                            r7.<init>(r4)
                            java.util.Set r2 = r2.entrySet()
                            java.util.Iterator r2 = r2.iterator()
                        L74:
                            boolean r4 = r2.hasNext()
                            if (r4 == 0) goto L8e
                            java.lang.Object r4 = r2.next()
                            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                            java.lang.Object r4 = r4.getKey()
                            me.oriient.internal.services.geofence.models.GeofenceBuilding r4 = (me.oriient.internal.services.geofence.models.GeofenceBuilding) r4
                            java.lang.String r4 = r4.getId()
                            r7.add(r4)
                            goto L74
                        L8e:
                            r0.b = r3
                            java.lang.Object r7 = r8.emit(r7, r0)
                            if (r7 != r1) goto L97
                            return r1
                        L97:
                            kotlin.Unit r7 = kotlin.Unit.f24250a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: me.oriient.ipssdk.realtime.ips.DataManager$3$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = circularStatus.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                }
            }), new C1686m1(null));
            this.f26114a = 1;
            if (FlowKt.g(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2J, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
