package au.com.woolworths.android.onesite.modules.checkout.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.modules.checkout.CheckOutContract;
import au.com.woolworths.android.onesite.modules.checkout.common.CheckoutInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesInteractor;
import au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.network.ApiService;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import com.google.gson.Gson;
import dagger.hilt.android.lifecycle.HiltViewModel;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.rx2.RxConvertKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/checkout/ui/CheckoutViewModel;", "Landroidx/lifecycle/ViewModel;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckoutViewModel extends ViewModel {
    public final PaymentServicesInteractor e;
    public final CheckoutInteractor f;
    public final ApiService g;
    public final Gson h;
    public final FeatureToggleManager i;
    public final CompositeDisposable j;
    public CheckoutStep k;
    public final SharedFlowImpl l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final MutableStateFlow p;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 q;
    public final SharedFlowImpl r;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$1", f = "CheckoutViewModel.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CheckoutViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flow = (Flow) CheckoutViewModel.this.n.getD();
                this.p = 1;
                if (FlowKt.g(flow, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$2", f = "CheckoutViewModel.kt", l = {102}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CheckoutViewModel.this.new AnonymousClass2(continuation);
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
                Flow flow = (Flow) CheckoutViewModel.this.m.getD();
                this.p = 1;
                if (FlowKt.g(flow, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$3", f = "CheckoutViewModel.kt", l = {105}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CheckoutViewModel.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                Flow flow = (Flow) CheckoutViewModel.this.o.getD();
                this.p = 1;
                if (FlowKt.g(flow, this) == coroutineSingletons) {
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4313a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[CheckoutStep.values().length];
            try {
                CheckoutStep checkoutStep = CheckoutStep.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f4313a = iArr;
            int[] iArr2 = new int[PaymentServicesStatus.values().length];
            try {
                PaymentServicesStatus paymentServicesStatus = PaymentServicesStatus.d;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            b = iArr2;
        }
    }

    public CheckoutViewModel(PaymentServicesInteractor paymentServicesInteractor, CheckoutInteractor checkoutInteractor, ApiService legacyApiService, Gson gson, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(paymentServicesInteractor, "paymentServicesInteractor");
        Intrinsics.h(checkoutInteractor, "checkoutInteractor");
        Intrinsics.h(legacyApiService, "legacyApiService");
        Intrinsics.h(gson, "gson");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = paymentServicesInteractor;
        this.f = checkoutInteractor;
        this.g = legacyApiService;
        this.h = gson;
        this.i = featureToggleManager;
        this.j = new CompositeDisposable();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        final int i = 0;
        this.m = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.g
            public final /* synthetic */ CheckoutViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CheckoutViewModel checkoutViewModel = this.e;
                        final SharedFlow sharedFlowM = FlowKt.M(RxConvertKt.a(checkoutViewModel.e.j()), ViewModelKt.a(checkoutViewModel), SharingStarted.Companion.a(3), 0);
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$paymentStatus$2$2(checkoutViewModel, null), new Flow<PaymentServicesStatus>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @SourceDebugExtension
                            /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2, reason: invalid class name */
                            public final class AnonymousClass2<T> implements FlowCollector {
                                public final /* synthetic */ FlowCollector d;

                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2", f = "CheckoutViewModel.kt", l = {50}, m = "emit")
                                /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1, reason: invalid class name */
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    public /* synthetic */ Object p;
                                    public int q;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.p = obj;
                                        this.q |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.d = flowCollector;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                @Override // kotlinx.coroutines.flow.FlowCollector
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                                    /*
                                        r4 = this;
                                        boolean r0 = r6 instanceof au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r6
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = (au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.q
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.q = r1
                                        goto L18
                                    L13:
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = new au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1
                                        r0.<init>(r6)
                                    L18:
                                        java.lang.Object r6 = r0.p
                                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                        int r2 = r0.q
                                        r3 = 1
                                        if (r2 == 0) goto L2f
                                        if (r2 != r3) goto L27
                                        kotlin.ResultKt.b(r6)
                                        goto L44
                                    L27:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                        r5.<init>(r6)
                                        throw r5
                                    L2f:
                                        kotlin.ResultKt.b(r6)
                                        r6 = r5
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r6 = (au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus) r6
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r2 = au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus.e
                                        if (r6 == r2) goto L44
                                        r0.q = r3
                                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                        java.lang.Object r5 = r6.emit(r5, r0)
                                        if (r5 != r1) goto L44
                                        return r1
                                    L44:
                                        kotlin.Unit r5 = kotlin.Unit.f24250a
                                        return r5
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                Object objCollect = sharedFlowM.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                            }
                        });
                    case 1:
                        CheckoutViewModel checkoutViewModel2 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$legacyError$2$1(checkoutViewModel2, null), FlowKt.M(RxConvertKt.a(checkoutViewModel2.f.c()), ViewModelKt.a(checkoutViewModel2), SharingStarted.Companion.a(3), 0));
                    default:
                        Flow flowA = RxConvertKt.a(RxBus.a().c(ForcedLogoutEvent.class));
                        CheckoutViewModel checkoutViewModel3 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$logoutEvent$2$1(checkoutViewModel3, null), FlowKt.M(flowA, ViewModelKt.a(checkoutViewModel3), SharingStarted.Companion.a(3), 0));
                }
            }
        });
        final int i2 = 1;
        this.n = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.g
            public final /* synthetic */ CheckoutViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CheckoutViewModel checkoutViewModel = this.e;
                        final Flow sharedFlowM = FlowKt.M(RxConvertKt.a(checkoutViewModel.e.j()), ViewModelKt.a(checkoutViewModel), SharingStarted.Companion.a(3), 0);
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$paymentStatus$2$2(checkoutViewModel, null), new Flow<PaymentServicesStatus>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @SourceDebugExtension
                            /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2, reason: invalid class name */
                            public final class AnonymousClass2<T> implements FlowCollector {
                                public final /* synthetic */ FlowCollector d;

                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2", f = "CheckoutViewModel.kt", l = {50}, m = "emit")
                                /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1, reason: invalid class name */
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    public /* synthetic */ Object p;
                                    public int q;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.p = obj;
                                        this.q |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.d = flowCollector;
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public final Object emit(Object v, Continuation v2) {
                                    /*
                                        this = this;
                                        boolean r0 = r6 instanceof au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r6
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = (au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.q
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.q = r1
                                        goto L18
                                    L13:
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = new au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1
                                        r0.<init>(r6)
                                    L18:
                                        java.lang.Object r6 = r0.p
                                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                        int r2 = r0.q
                                        r3 = 1
                                        if (r2 == 0) goto L2f
                                        if (r2 != r3) goto L27
                                        kotlin.ResultKt.b(r6)
                                        goto L44
                                    L27:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                        r5.<init>(r6)
                                        throw r5
                                    L2f:
                                        kotlin.ResultKt.b(r6)
                                        r6 = r5
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r6 = (au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus) r6
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r2 = au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus.e
                                        if (r6 == r2) goto L44
                                        r0.q = r3
                                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                        java.lang.Object r5 = r6.emit(r5, r0)
                                        if (r5 != r1) goto L44
                                        return r1
                                    L44:
                                        kotlin.Unit r5 = kotlin.Unit.f24250a
                                        return r5
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                Object objCollect = sharedFlowM.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                            }
                        });
                    case 1:
                        CheckoutViewModel checkoutViewModel2 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$legacyError$2$1(checkoutViewModel2, null), FlowKt.M(RxConvertKt.a(checkoutViewModel2.f.c()), ViewModelKt.a(checkoutViewModel2), SharingStarted.Companion.a(3), 0));
                    default:
                        Flow flowA = RxConvertKt.a(RxBus.a().c(ForcedLogoutEvent.class));
                        CheckoutViewModel checkoutViewModel3 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$logoutEvent$2$1(checkoutViewModel3, null), FlowKt.M(flowA, ViewModelKt.a(checkoutViewModel3), SharingStarted.Companion.a(3), 0));
                }
            }
        });
        final int i3 = 2;
        this.o = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.g
            public final /* synthetic */ CheckoutViewModel e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CheckoutViewModel checkoutViewModel = this.e;
                        final Flow sharedFlowM = FlowKt.M(RxConvertKt.a(checkoutViewModel.e.j()), ViewModelKt.a(checkoutViewModel), SharingStarted.Companion.a(3), 0);
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$paymentStatus$2$2(checkoutViewModel, null), new Flow<PaymentServicesStatus>() { // from class: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1

                            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                            @SourceDebugExtension
                            /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2, reason: invalid class name */
                            public final class AnonymousClass2<T> implements FlowCollector {
                                public final /* synthetic */ FlowCollector d;

                                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                                @DebugMetadata(c = "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2", f = "CheckoutViewModel.kt", l = {50}, m = "emit")
                                /* renamed from: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1, reason: invalid class name */
                                public final class AnonymousClass1 extends ContinuationImpl {
                                    public /* synthetic */ Object p;
                                    public int q;

                                    public AnonymousClass1(Continuation continuation) {
                                        super(continuation);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    public final Object invokeSuspend(Object obj) {
                                        this.p = obj;
                                        this.q |= Integer.MIN_VALUE;
                                        return AnonymousClass2.this.emit(null, this);
                                    }
                                }

                                public AnonymousClass2(FlowCollector flowCollector) {
                                    this.d = flowCollector;
                                }

                                @Override // kotlinx.coroutines.flow.FlowCollector
                                public final Object emit(Object v, Continuation v2) {
                                    /*
                                        this = this;
                                        boolean r0 = r6 instanceof au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                        if (r0 == 0) goto L13
                                        r0 = r6
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = (au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                        int r1 = r0.q
                                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                        r3 = r1 & r2
                                        if (r3 == 0) goto L13
                                        int r1 = r1 - r2
                                        r0.q = r1
                                        goto L18
                                    L13:
                                        au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1 r0 = new au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1$2$1
                                        r0.<init>(r6)
                                    L18:
                                        java.lang.Object r6 = r0.p
                                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                        int r2 = r0.q
                                        r3 = 1
                                        if (r2 == 0) goto L2f
                                        if (r2 != r3) goto L27
                                        kotlin.ResultKt.b(r6)
                                        goto L44
                                    L27:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                        r5.<init>(r6)
                                        throw r5
                                    L2f:
                                        kotlin.ResultKt.b(r6)
                                        r6 = r5
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r6 = (au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus) r6
                                        au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus r2 = au.com.woolworths.android.onesite.modules.checkout.common.PaymentServicesStatus.e
                                        if (r6 == r2) goto L44
                                        r0.q = r3
                                        kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                        java.lang.Object r5 = r6.emit(r5, r0)
                                        if (r5 != r1) goto L44
                                        return r1
                                    L44:
                                        kotlin.Unit r5 = kotlin.Unit.f24250a
                                        return r5
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutViewModel$paymentStatus_delegate$lambda$1$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                                }
                            }

                            @Override // kotlinx.coroutines.flow.Flow
                            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                                Object objCollect = sharedFlowM.collect(new AnonymousClass2(flowCollector), continuation);
                                return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                            }
                        });
                    case 1:
                        CheckoutViewModel checkoutViewModel2 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$legacyError$2$1(checkoutViewModel2, null), FlowKt.M(RxConvertKt.a(checkoutViewModel2.f.c()), ViewModelKt.a(checkoutViewModel2), SharingStarted.Companion.a(3), 0));
                    default:
                        Flow flowA = RxConvertKt.a(RxBus.a().c(ForcedLogoutEvent.class));
                        CheckoutViewModel checkoutViewModel3 = this.e;
                        return new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CheckoutViewModel$logoutEvent$2$1(checkoutViewModel3, null), FlowKt.M(flowA, ViewModelKt.a(checkoutViewModel3), SharingStarted.Companion.a(3), 0));
                }
            }
        });
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.p = mutableStateFlowA;
        this.q = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA);
        this.r = sharedFlowImplB;
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass1(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass2(null), 3);
        BuildersKt.c(ViewModelKt.a(this), null, null, new AnonymousClass3(null), 3);
    }

    public final void p6(CheckOutContract.LoadingState loadingState) {
        this.p.setValue(new CheckoutContract.ViewState(loadingState == CheckOutContract.LoadingState.d));
    }
}
