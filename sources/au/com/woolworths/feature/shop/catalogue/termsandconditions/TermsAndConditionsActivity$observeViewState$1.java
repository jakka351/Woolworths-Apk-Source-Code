package au.com.woolworths.feature.shop.catalogue.termsandconditions;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityTermsAndConditionsBinding;
import au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$observeViewState$1", f = "TermsAndConditionsActivity.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TermsAndConditionsActivity$observeViewState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ TermsAndConditionsActivity q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/catalogue/termsandconditions/TermsAndConditionsContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$observeViewState$1$1", f = "TermsAndConditionsActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.catalogue.termsandconditions.TermsAndConditionsActivity$observeViewState$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<TermsAndConditionsContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ TermsAndConditionsActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TermsAndConditionsActivity termsAndConditionsActivity, Continuation continuation) {
            super(2, continuation);
            this.q = termsAndConditionsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((TermsAndConditionsContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            TermsAndConditionsContract.ViewState viewState = (TermsAndConditionsContract.ViewState) this.p;
            boolean zIsEmpty = viewState.f6958a.isEmpty();
            TermsAndConditionsActivity termsAndConditionsActivity = this.q;
            if (zIsEmpty) {
                ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding = termsAndConditionsActivity.y;
                if (activityTermsAndConditionsBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityTermsAndConditionsBinding.y.setVisibility(8);
            } else {
                ActivityTermsAndConditionsBinding activityTermsAndConditionsBinding2 = termsAndConditionsActivity.y;
                if (activityTermsAndConditionsBinding2 == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityTermsAndConditionsBinding2.y.setVisibility(0);
                TermsEpoxyController termsEpoxyController = termsAndConditionsActivity.z;
                if (termsEpoxyController == null) {
                    Intrinsics.p("termsEpoxyController");
                    throw null;
                }
                termsEpoxyController.setData(viewState.f6958a);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TermsAndConditionsActivity$observeViewState$1(TermsAndConditionsActivity termsAndConditionsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = termsAndConditionsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TermsAndConditionsActivity$observeViewState$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TermsAndConditionsActivity$observeViewState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            TermsAndConditionsActivity termsAndConditionsActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(termsAndConditionsActivity, null), FlowExtKt.a(((TermsAndConditionsViewModel) termsAndConditionsActivity.x.getD()).e, termsAndConditionsActivity.getD(), Lifecycle.State.g));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
