package au.com.woolworths.feature.shop.shippingcalculator;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.search.RecentSearch;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
import au.com.woolworths.foundation.shop.shippingcalculator.data.ShippingCalculatorDataStore;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorViewModel;", "Landroidx/lifecycle/ViewModel;", "Companion", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShippingCalculatorViewModel extends ViewModel {
    public final ShippingCalculatorDataStore e;
    public final MutableStateFlow f;
    public final MutableStateFlow g;
    public final StateFlow h;
    public final SharedFlowImpl i;
    public final Flow j;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", RecentSearch.COLUMN_NAME_SEARCH_TERM, ""}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel$1", f = "ShippingCalculatorViewModel.kt", l = {56}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        public Object p;
        public int q;
        public /* synthetic */ Object r;
        public final /* synthetic */ ShippingCalculatorInteractor t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShippingCalculatorInteractor shippingCalculatorInteractor, Continuation continuation) {
            super(2, continuation);
            this.t = shippingCalculatorInteractor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ShippingCalculatorViewModel.this.new AnonymousClass1(this.t, continuation);
            anonymousClass1.r = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((String) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[Catch: NoConnectivityException -> 0x0019, ServerErrorException -> 0x001b, TryCatch #3 {NoConnectivityException -> 0x0019, ServerErrorException -> 0x001b, blocks: (B:6:0x0015, B:19:0x004d, B:21:0x0055, B:22:0x0058), top: B:34:0x0015 }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0058 A[Catch: NoConnectivityException -> 0x0019, ServerErrorException -> 0x001b, TRY_LEAVE, TryCatch #3 {NoConnectivityException -> 0x0019, ServerErrorException -> 0x001b, blocks: (B:6:0x0015, B:19:0x004d, B:21:0x0055, B:22:0x0058), top: B:34:0x0015 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel r0 = au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel.this
                kotlinx.coroutines.flow.MutableStateFlow r0 = r0.g
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r2 = r5.q
                r3 = 1
                if (r2 == 0) goto L25
                if (r2 != r3) goto L1d
                java.lang.Object r0 = r5.p
                kotlinx.coroutines.flow.MutableStateFlow r0 = (kotlinx.coroutines.flow.MutableStateFlow) r0
                java.lang.Object r1 = r5.r
                kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
                kotlin.ResultKt.b(r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                goto L4d
            L19:
                r0 = r1
                goto L5f
            L1b:
                r0 = r1
                goto L6b
            L1d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L25:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.r
                java.lang.String r6 = (java.lang.String) r6
                int r2 = r6.length()
                r4 = 3
                if (r2 < r4) goto L7f
                au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState r2 = new au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Loading r4 = au.com.woolworths.feature.shop.shippingcalculator.ScreenState.Loading.f8095a
                r2.<init>(r4)
                r0.f(r2)
                au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorInteractor r2 = r5.t     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L5f au.com.woolworths.android.onesite.network.ServerErrorException -> L6b
                r5.r = r0     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L5f au.com.woolworths.android.onesite.network.ServerErrorException -> L6b
                r5.p = r0     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L5f au.com.woolworths.android.onesite.network.ServerErrorException -> L6b
                r5.q = r3     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L5f au.com.woolworths.android.onesite.network.ServerErrorException -> L6b
                java.io.Serializable r6 = r2.a(r6, r5)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L5f au.com.woolworths.android.onesite.network.ServerErrorException -> L6b
                if (r6 != r1) goto L4c
                return r1
            L4c:
                r1 = r0
            L4d:
                java.util.List r6 = (java.util.List) r6     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                boolean r2 = r6.isEmpty()     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                if (r2 == 0) goto L58
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Empty r6 = au.com.woolworths.feature.shop.shippingcalculator.ScreenState.Empty.f8092a     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                goto L76
            L58:
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Success r2 = new au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Success     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                r2.<init>(r6)     // Catch: au.com.woolworths.android.onesite.network.NoConnectivityException -> L19 au.com.woolworths.android.onesite.network.ServerErrorException -> L1b
                r6 = r2
                goto L76
            L5f:
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Error r6 = new au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Error
                r1 = 2132019149(0x7f1407cd, float:1.9676625E38)
                r2 = 2132019148(0x7f1407cc, float:1.9676623E38)
                r6.<init>(r1, r2)
                goto L76
            L6b:
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Error r6 = new au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Error
                r1 = 2132019154(0x7f1407d2, float:1.9676635E38)
                r2 = 2132019153(0x7f1407d1, float:1.9676633E38)
                r6.<init>(r1, r2)
            L76:
                au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState r1 = new au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState
                r1.<init>(r6)
                r0.f(r1)
                goto L89
            L7f:
                au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState r6 = new au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract$ViewState
                au.com.woolworths.feature.shop.shippingcalculator.ScreenState$Init r1 = au.com.woolworths.feature.shop.shippingcalculator.ScreenState.Init.f8094a
                r6.<init>(r1)
                r0.f(r6)
            L89:
                kotlin.Unit r6 = kotlin.Unit.f24250a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/shippingcalculator/ShippingCalculatorViewModel$Companion;", "", "", "MINIMUM_TEXT_LENGTH_FOR_SEARCH", "I", "", "SEARCH_DEBOUNCE_TIME", "J", "shipping-calculator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public ShippingCalculatorViewModel(ShippingCalculatorInteractor shippingCalculatorInteractor, ShippingCalculatorDataStore shippingCalculatorDataStore) {
        Intrinsics.h(shippingCalculatorInteractor, "shippingCalculatorInteractor");
        Intrinsics.h(shippingCalculatorDataStore, "shippingCalculatorDataStore");
        this.e = shippingCalculatorDataStore;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.f = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(new ShippingCalculatorContract.ViewState());
        this.g = mutableStateFlowA2;
        this.h = FlowKt.b(mutableStateFlowA2);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        this.j = FlowKt.a(sharedFlowImplB);
        FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(shippingCalculatorInteractor, null), new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(FlowKt.o(mutableStateFlowA, 300L))), ViewModelKt.a(this));
    }
}
