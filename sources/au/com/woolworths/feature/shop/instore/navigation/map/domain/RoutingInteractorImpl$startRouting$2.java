package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import android.support.v4.media.session.a;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapRoute;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2", f = "RoutingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoutingInteractorImpl$startRouting$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ RoutingInteractorImpl q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$1", f = "RoutingInteractor.kt", l = {80}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ RoutingInteractorImpl q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoutingInteractorImpl routingInteractorImpl, Continuation continuation) {
            super(2, continuation);
            this.q = routingInteractorImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw a.v(obj);
            }
            ResultKt.b(obj);
            final RoutingInteractorImpl routingInteractorImpl = this.q;
            StateFlow stateFlowC = routingInteractorImpl.f7374a.c();
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl.startRouting.2.1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    if (((PositioningInteractor.PositioningState) obj2) == PositioningInteractor.PositioningState.d) {
                        RoutingInteractorImpl routingInteractorImpl2 = routingInteractorImpl;
                        routingInteractorImpl2.g.setValue(null);
                        Object objF = routingInteractorImpl2.f(continuation);
                        if (objF == CoroutineSingletons.d) {
                            return objF;
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            stateFlowC.collect(flowCollector, this);
            return coroutineSingletons;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$2", f = "RoutingInteractor.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ RoutingInteractorImpl q;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "routeFromUser", "Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMapRoute;", "routeFromEntrance"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$2$1", f = "RoutingInteractor.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$startRouting$2$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function3<OriientMapRoute, OriientMapRoute, Continuation<? super Unit>, Object> {
            public /* synthetic */ OriientMapRoute p;
            public /* synthetic */ OriientMapRoute q;
            public final /* synthetic */ RoutingInteractorImpl r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(RoutingInteractorImpl routingInteractorImpl, Continuation continuation) {
                super(3, continuation);
                this.r = routingInteractorImpl;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, (Continuation) obj3);
                anonymousClass1.p = (OriientMapRoute) obj;
                anonymousClass1.q = (OriientMapRoute) obj2;
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                OriientMapRoute oriientMapRoute = this.p;
                OriientMapRoute oriientMapRoute2 = this.q;
                Timber.f27013a.b("route from the user: " + oriientMapRoute + ", route from entrance: " + oriientMapRoute2, new Object[0]);
                MutableStateFlow mutableStateFlow = this.r.d;
                if (oriientMapRoute == null) {
                    oriientMapRoute = null;
                }
                mutableStateFlow.setValue(oriientMapRoute);
                return Unit.f24250a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RoutingInteractorImpl routingInteractorImpl, Continuation continuation) {
            super(2, continuation);
            this.q = routingInteractorImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                RoutingInteractorImpl routingInteractorImpl = this.q;
                FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1L = FlowKt.l(routingInteractorImpl.g, routingInteractorImpl.h, new AnonymousClass1(routingInteractorImpl, null));
                this.p = 1;
                if (FlowKt.g(flowKt__ZipKt$combine$$inlined$unsafeFlow$1L, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingInteractorImpl$startRouting$2(RoutingInteractorImpl routingInteractorImpl, Continuation continuation) {
        super(2, continuation);
        this.q = routingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoutingInteractorImpl$startRouting$2 routingInteractorImpl$startRouting$2 = new RoutingInteractorImpl$startRouting$2(this.q, continuation);
        routingInteractorImpl$startRouting$2.p = obj;
        return routingInteractorImpl$startRouting$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RoutingInteractorImpl$startRouting$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.p;
        RoutingInteractorImpl routingInteractorImpl = this.q;
        BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(routingInteractorImpl, null), 3);
        return BuildersKt.c(coroutineScope, null, null, new AnonymousClass2(routingInteractorImpl, null), 3);
    }
}
