package au.com.woolworths.feature.shop.instore.navigation.onboarding.ui;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingViewModel;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1", f = "ProductFinderOnboardingScreen.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductFinderOnboardingViewModel q;
    public final /* synthetic */ Lifecycle r;
    public final /* synthetic */ Function1 s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.onboarding.ui.ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
        public final /* synthetic */ Function1 d;

        public AnonymousClass1(Function1 function1) {
            this.d = function1;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function b() {
            return new FunctionReferenceImpl(2, this.d, Intrinsics.Kotlin.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lau/com/woolworths/feature/shop/instore/navigation/onboarding/ProductFinderOnboardingContract$Actions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            this.d.invoke((ProductFinderOnboardingContract.Actions) obj);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return Unit.f24250a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1(ProductFinderOnboardingViewModel productFinderOnboardingViewModel, Lifecycle lifecycle, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = productFinderOnboardingViewModel;
        this.r = lifecycle;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductFinderOnboardingScreenKt$ProductFinderOnboardingScreen$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowA = FlowExtKt.a(FlowKt.a(this.q.h), this.r, Lifecycle.State.g);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.s);
            this.p = 1;
            if (((ChannelFlow) flowA).collect(anonymousClass1, this) == coroutineSingletons) {
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
