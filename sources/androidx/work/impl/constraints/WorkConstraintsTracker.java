package androidx.work.impl.constraints;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.controllers.BatteryChargingController;
import androidx.work.impl.constraints.controllers.BatteryNotLowController;
import androidx.work.impl.constraints.controllers.ConstraintController;
import androidx.work.impl.constraints.controllers.NetworkConnectedController;
import androidx.work.impl.constraints.controllers.NetworkMeteredController;
import androidx.work.impl.constraints.controllers.NetworkNotRoamingController;
import androidx.work.impl.constraints.controllers.NetworkUnmeteredController;
import androidx.work.impl.constraints.controllers.StorageNotLowController;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/constraints/WorkConstraintsTracker;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class WorkConstraintsTracker {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3964a;

    public WorkConstraintsTracker(Trackers trackers) {
        Intrinsics.h(trackers, "trackers");
        BatteryChargingController batteryChargingController = new BatteryChargingController(trackers.b);
        BatteryNotLowController batteryNotLowController = new BatteryNotLowController(trackers.c);
        StorageNotLowController storageNotLowController = new StorageNotLowController(trackers.e);
        ConstraintTracker constraintTracker = trackers.d;
        NetworkConnectedController networkConnectedController = new NetworkConnectedController(constraintTracker);
        NetworkUnmeteredController networkUnmeteredController = new NetworkUnmeteredController(constraintTracker);
        NetworkNotRoamingController networkNotRoamingController = new NetworkNotRoamingController(constraintTracker);
        NetworkMeteredController networkMeteredController = new NetworkMeteredController(constraintTracker);
        Context context = trackers.f3977a;
        String str = WorkConstraintsTrackerKt.f3965a;
        Intrinsics.h(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f3964a = ArraysKt.F(new ConstraintController[]{batteryChargingController, batteryNotLowController, storageNotLowController, networkConnectedController, networkUnmeteredController, networkNotRoamingController, networkMeteredController, new NetworkRequestConstraintController((ConnectivityManager) systemService)});
    }

    public final boolean a(WorkSpec workSpec) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f3964a) {
            if (((ConstraintController) obj).b(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            Logger.e().a(WorkConstraintsTrackerKt.f3965a, "Work " + workSpec.f3990a + " constrained by " + CollectionsKt.M(arrayList, null, null, null, WorkConstraintsTracker$areAllConstraintsMet$1.h, 31));
        }
        return arrayList.isEmpty();
    }

    public final Flow b(WorkSpec spec) {
        Intrinsics.h(spec, "spec");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f3964a) {
            if (((ConstraintController) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ConstraintController) it.next()).a(spec.j));
        }
        final Flow[] flowArr = (Flow[]) CollectionsKt.G0(arrayList2).toArray(new Flow[0]);
        return FlowKt.r(new Flow<ConstraintsState>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1

            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", l = {292}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3, reason: invalid class name */
            public final class AnonymousClass3 extends SuspendLambda implements Function3<FlowCollector<? super ConstraintsState>, ConstraintsState[], Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ FlowCollector q;
                public /* synthetic */ Object[] r;

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
                    anonymousClass3.q = (FlowCollector) obj;
                    anonymousClass3.r = (Object[]) obj2;
                    return anonymousClass3.invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    ConstraintsState constraintsState;
                    ConstraintsState constraintsState2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        FlowCollector flowCollector = this.q;
                        ConstraintsState[] constraintsStateArr = (ConstraintsState[]) this.r;
                        int length = constraintsStateArr.length;
                        int i2 = 0;
                        while (true) {
                            constraintsState = ConstraintsState.ConstraintsMet.f3958a;
                            if (i2 >= length) {
                                constraintsState2 = null;
                                break;
                            }
                            constraintsState2 = constraintsStateArr[i2];
                            if (!Intrinsics.c(constraintsState2, constraintsState)) {
                                break;
                            }
                            i2++;
                        }
                        if (constraintsState2 != null) {
                            constraintsState = constraintsState2;
                        }
                        this.p = 1;
                        if (flowCollector.emit(constraintsState, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                final Flow[] flowArr2 = flowArr;
                Object objA = CombineKt.a(continuation, new Function0<ConstraintsState[]>() { // from class: androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return new ConstraintsState[flowArr2.length];
                    }
                }, new AnonymousClass3(3, null), flowCollector, flowArr2);
                return objA == CoroutineSingletons.d ? objA : Unit.f24250a;
            }
        });
    }
}
