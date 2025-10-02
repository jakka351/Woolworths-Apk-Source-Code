package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Landroidx/work/impl/constraints/ConstraintsState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements Function2<ProducerScope<? super ConstraintsState>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Constraints r;
    public final /* synthetic */ NetworkRequestConstraintController s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1(Constraints constraints, NetworkRequestConstraintController networkRequestConstraintController, Continuation continuation) {
        super(2, continuation);
        this.r = constraints;
        this.s = networkRequestConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.r, this.s, continuation);
        networkRequestConstraintController$track$1.q = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkRequestConstraintController$track$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ProducerScope producerScope = (ProducerScope) this.q;
            NetworkRequest networkRequestA = this.r.a();
            if (networkRequestA == null) {
                producerScope.b().y(null);
                return Unit.f24250a;
            }
            final NetworkRequestConstraintController$track$1$onConstraintState$1 networkRequestConstraintController$track$1$onConstraintState$1 = new NetworkRequestConstraintController$track$1$onConstraintState$1(BuildersKt.c(producerScope, null, null, new NetworkRequestConstraintController$track$1$timeoutJob$1(this.s, producerScope, null), 3), producerScope);
            if (Build.VERSION.SDK_INT >= 30) {
                final SharedNetworkCallback sharedNetworkCallback = SharedNetworkCallback.f3963a;
                final ConnectivityManager connectivityManager = this.s.f3961a;
                sharedNetworkCallback.getClass();
                synchronized (SharedNetworkCallback.b) {
                    LinkedHashMap linkedHashMap = SharedNetworkCallback.c;
                    boolean zIsEmpty = linkedHashMap.isEmpty();
                    linkedHashMap.put(networkRequestConstraintController$track$1$onConstraintState$1, networkRequestA);
                    if (zIsEmpty) {
                        Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController register shared callback");
                        connectivityManager.registerDefaultNetworkCallback(sharedNetworkCallback);
                    }
                }
                function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.SharedNetworkCallback$addCallback$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Object obj2 = SharedNetworkCallback.b;
                        Function1 function1 = networkRequestConstraintController$track$1$onConstraintState$1;
                        ConnectivityManager connectivityManager2 = connectivityManager;
                        SharedNetworkCallback sharedNetworkCallback2 = sharedNetworkCallback;
                        synchronized (obj2) {
                            LinkedHashMap linkedHashMap2 = SharedNetworkCallback.c;
                            linkedHashMap2.remove(function1);
                            if (linkedHashMap2.isEmpty()) {
                                Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController unregister shared callback");
                                connectivityManager2.unregisterNetworkCallback(sharedNetworkCallback2);
                            }
                        }
                        return Unit.f24250a;
                    }
                };
            } else {
                int i2 = IndividualNetworkCallback.b;
                final ConnectivityManager connectivityManager2 = this.s.f3961a;
                final IndividualNetworkCallback individualNetworkCallback = new IndividualNetworkCallback(networkRequestConstraintController$track$1$onConstraintState$1);
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                try {
                    Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, individualNetworkCallback);
                    booleanRef.d = true;
                } catch (RuntimeException e) {
                    if (!StringsKt.v(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    Logger.e().b(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController couldn't register callback", e);
                    networkRequestConstraintController$track$1$onConstraintState$1.invoke(new ConstraintsState.ConstraintsNotMet(7));
                }
                function0 = new Function0<Unit>() { // from class: androidx.work.impl.constraints.IndividualNetworkCallback$Companion$addCallback$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        if (booleanRef.d) {
                            Logger.e().a(WorkConstraintsTrackerKt.f3965a, "NetworkRequestConstraintController unregister callback");
                            connectivityManager2.unregisterNetworkCallback(individualNetworkCallback);
                        }
                        return Unit.f24250a;
                    }
                };
            }
            Function0<Unit> function02 = new Function0<Unit>(function0) { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1.1
                public final /* synthetic */ Lambda h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                    this.h = (Lambda) function0;
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.h.invoke();
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (ProduceKt.a(producerScope, function02, this) == coroutineSingletons) {
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
