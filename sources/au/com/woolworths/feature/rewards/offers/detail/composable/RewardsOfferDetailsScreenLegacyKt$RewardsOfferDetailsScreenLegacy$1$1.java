package au.com.woolworths.feature.rewards.offers.detail.composable;

import android.content.Context;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsContractLegacy;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsViewModel;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1", f = "RewardsOfferDetailsScreenLegacy.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsOfferDetailsViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function0 v;
    public final /* synthetic */ CoroutineScope w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ ScaffoldState y;
    public final /* synthetic */ Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1(RewardsOfferDetailsViewModel rewardsOfferDetailsViewModel, Function0 function0, Function1 function1, Function1 function12, Function0 function02, Function0 function03, CoroutineScope coroutineScope, Function1 function13, ScaffoldState scaffoldState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsOfferDetailsViewModel;
        this.r = function0;
        this.s = function1;
        this.t = function12;
        this.u = function02;
        this.v = function03;
        this.w = coroutineScope;
        this.x = function13;
        this.y = scaffoldState;
        this.z = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.q;
            final ScaffoldState scaffoldState = this.y;
            final Context context = this.z;
            final Function0 function0 = this.r;
            final Function1 function1 = this.s;
            final Function1 function12 = this.t;
            final Function0 function02 = this.u;
            final Function0 function03 = this.v;
            final CoroutineScope coroutineScope = this.w;
            final Function1 function13 = this.x;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1$1$1", f = "RewardsOfferDetailsScreenLegacy.kt", l = {113}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.feature.rewards.offers.detail.composable.RewardsOfferDetailsScreenLegacyKt$RewardsOfferDetailsScreenLegacy$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C01391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScaffoldState q;
                    public final /* synthetic */ RewardsOfferDetailsContractLegacy.Actions r;
                    public final /* synthetic */ Context s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01391(ScaffoldState scaffoldState, RewardsOfferDetailsContractLegacy.Actions actions, Context context, Continuation continuation) {
                        super(2, continuation);
                        this.q = scaffoldState;
                        this.r = actions;
                        this.s = context;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01391(this.q, this.r, this.s, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01391) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SnackbarHostState snackbarHostState = this.q.f1319a;
                            String string = ((RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationError) this.r).f6326a.getText(this.s).toString();
                            this.p = 1;
                            if (SnackbarHostState.b(snackbarHostState, string, null, null, this, 6) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    RewardsOfferDetailsContractLegacy.Actions actions = (RewardsOfferDetailsContractLegacy.Actions) obj2;
                    if (Intrinsics.c(actions, RewardsOfferDetailsContractLegacy.Actions.CloseScreen.f6321a)) {
                        function0.invoke();
                    } else if (actions instanceof RewardsOfferDetailsContractLegacy.Actions.CloseScreenAndShowError) {
                        function1.invoke(((RewardsOfferDetailsContractLegacy.Actions.CloseScreenAndShowError) actions).f6322a);
                    } else if (actions instanceof RewardsOfferDetailsContractLegacy.Actions.OpenUrl) {
                        function12.invoke(((RewardsOfferDetailsContractLegacy.Actions.OpenUrl) actions).f6323a);
                    } else if (Intrinsics.c(actions, RewardsOfferDetailsContractLegacy.Actions.PerformHapticFeedbackForActivationFailure.f6324a)) {
                        function02.invoke();
                    } else if (Intrinsics.c(actions, RewardsOfferDetailsContractLegacy.Actions.PerformHapticFeedbackForActivationSuccess.f6325a)) {
                        function03.invoke();
                    } else if (actions instanceof RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationError) {
                        BuildersKt.c(coroutineScope, null, null, new C01391(scaffoldState, actions, context, null), 3);
                    } else {
                        if (!(actions instanceof RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationMessage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        function13.invoke(((RewardsOfferDetailsContractLegacy.Actions.ShowOfferActivationMessage) actions).f6327a);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flow.collect(flowCollector, this) == coroutineSingletons) {
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
