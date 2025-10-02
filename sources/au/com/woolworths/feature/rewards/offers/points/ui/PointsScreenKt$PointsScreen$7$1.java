package au.com.woolworths.feature.rewards.offers.points.ui;

import android.content.Context;
import android.content.res.Resources;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.KotlinNothingValueException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$7$1", f = "PointsScreen.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PointsScreenKt$PointsScreen$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsPointsViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;
    public final /* synthetic */ Function0 t;
    public final /* synthetic */ Function0 u;
    public final /* synthetic */ Function1 v;
    public final /* synthetic */ Context w;
    public final /* synthetic */ Function1 x;
    public final /* synthetic */ Function1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointsScreenKt$PointsScreen$7$1(RewardsPointsViewModel rewardsPointsViewModel, Function0 function0, Function1 function1, Function0 function02, Function0 function03, Function1 function12, Context context, Function1 function13, Function1 function14, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsPointsViewModel;
        this.r = function0;
        this.s = function1;
        this.t = function02;
        this.u = function03;
        this.v = function12;
        this.w = context;
        this.x = function13;
        this.y = function14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PointsScreenKt$PointsScreen$7$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((PointsScreenKt$PointsScreen$7$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow sharedFlow = this.q.j;
            final Function1 function1 = this.x;
            final Function1 function12 = this.y;
            final Function0 function0 = this.r;
            final Function1 function13 = this.s;
            final Function0 function02 = this.t;
            final Function0 function03 = this.u;
            final Function1 function14 = this.v;
            final Context context = this.w;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.PointsScreenKt$PointsScreen$7$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) throws Resources.NotFoundException {
                    RewardsOfferBaseContract.Actions actions = (RewardsOfferBaseContract.Actions) obj2;
                    if (Intrinsics.c(actions, RewardsPointsContract.Actions.CloseScreen.f6367a)) {
                        function0.invoke();
                    } else if (actions instanceof RewardsOfferBaseContract.Actions.OpenUrl) {
                        function13.invoke(((RewardsOfferBaseContract.Actions.OpenUrl) actions).f6237a);
                    } else if (Intrinsics.c(actions, RewardsPointsContract.Actions.PerformHapticFeedbackForActivationFailure.f6368a)) {
                        function02.invoke();
                    } else if (Intrinsics.c(actions, RewardsPointsContract.Actions.PerformHapticFeedbackForActivationSuccess.f6369a)) {
                        function03.invoke();
                    } else {
                        boolean z = actions instanceof RewardsPointsContract.Actions.ShowOfferActivationError;
                        Context context2 = context;
                        Function1 function15 = function14;
                        if (z) {
                            function15.invoke(((RewardsPointsContract.Actions.ShowOfferActivationError) actions).f6370a.getText(context2).toString());
                        } else if (actions instanceof RewardsPointsContract.Actions.ShowOfferActivationMessage) {
                            function1.invoke(((RewardsPointsContract.Actions.ShowOfferActivationMessage) actions).f6371a);
                        } else if (actions instanceof RewardsPointsContract.Actions.ShowOfferDetailsScreen) {
                            function12.invoke(((RewardsPointsContract.Actions.ShowOfferDetailsScreen) actions).f6372a);
                        } else if (actions instanceof RewardsPointsContract.Actions.ShowOfferListRefreshFailedError) {
                            String string = context2.getResources().getString(((RewardsPointsContract.Actions.ShowOfferListRefreshFailedError) actions).f6373a);
                            Intrinsics.g(string, "getString(...)");
                            function15.invoke(string);
                        }
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (sharedFlow.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
