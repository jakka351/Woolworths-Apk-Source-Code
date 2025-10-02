package au.com.woolworths.feature.shop.ask.olive.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.shop.ask.olive.AskOliveFeatures;
import au.com.woolworths.feature.shop.ask.olive.databinding.ActivityChatWithOliveBinding;
import au.com.woolworths.feature.shop.ask.olive.ui.AskOliveContract;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.AskOliveJsInterface;
import au.com.woolworths.feature.shop.ask.olive.ui.jsbridge.OliveJsActions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$subscribeActions$1", f = "AskOliveActivity.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AskOliveActivity$subscribeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AskOliveActivity q;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$subscribeActions$1$1", f = "AskOliveActivity.kt", l = {173}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity$subscribeActions$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ AskOliveActivity q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AskOliveActivity askOliveActivity, Continuation continuation) {
            super(2, continuation);
            this.q = askOliveActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, continuation);
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
                final AskOliveActivity askOliveActivity = this.q;
                AskOliveJsInterface askOliveJsInterface = askOliveActivity.y;
                if (askOliveJsInterface == null) {
                    Intrinsics.p("jsInterface");
                    throw null;
                }
                ChannelLimitedFlowMerge channelLimitedFlowMergeG = FlowKt.G(askOliveJsInterface.b, askOliveActivity.R4().r);
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity.subscribeActions.1.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        boolean z = obj2 instanceof OliveJsActions;
                        int i2 = 1;
                        AskOliveActivity askOliveActivity2 = askOliveActivity;
                        if (z) {
                            OliveJsActions oliveJsActions = (OliveJsActions) obj2;
                            int i3 = AskOliveActivity.I;
                            if (oliveJsActions instanceof OliveJsActions.ShowSurvey) {
                                ContextExtKt.e(askOliveActivity2, ((OliveJsActions.ShowSurvey) oliveJsActions).f6628a);
                            } else if (oliveJsActions instanceof OliveJsActions.UpdateEndChatState) {
                                if (askOliveActivity2.P4().c(AskOliveFeatures.f)) {
                                    int iOrdinal = ((OliveJsActions.UpdateEndChatState) oliveJsActions).f6629a.f6635a.ordinal();
                                    if (iOrdinal == 0) {
                                        askOliveActivity2.T4(true);
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        askOliveActivity2.T4(false);
                                    }
                                }
                            } else {
                                if (!oliveJsActions.equals(OliveJsActions.RefreshCartBadge.f6627a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                AskOliveViewModel askOliveViewModelR4 = askOliveActivity2.R4();
                                BuildersKt.c(ViewModelKt.a(askOliveViewModelR4), null, null, new AskOliveViewModel$fetchCartInfo$1(askOliveViewModelR4, null), 3);
                            }
                        } else if (obj2 instanceof AskOliveContract.Actions) {
                            AskOliveContract.Actions actions = (AskOliveContract.Actions) obj2;
                            if (actions instanceof AskOliveContract.Actions.ForwardAccessTokenToWebview) {
                                ActivityChatWithOliveBinding activityChatWithOliveBinding = askOliveActivity2.B;
                                if (activityChatWithOliveBinding == null) {
                                    Intrinsics.p("binding");
                                    throw null;
                                }
                                activityChatWithOliveBinding.A.loadUrl("javascript:setToken(`" + ((AskOliveContract.Actions.ForwardAccessTokenToWebview) actions).f6617a + "`)");
                            } else {
                                int i4 = AskOliveActivity.I;
                                if (actions.equals(AskOliveContract.Actions.RetryChatbotSessionId.f6618a)) {
                                    ActivityChatWithOliveBinding activityChatWithOliveBinding2 = askOliveActivity2.B;
                                    if (activityChatWithOliveBinding2 == null) {
                                        Intrinsics.p("binding");
                                        throw null;
                                    }
                                    activityChatWithOliveBinding2.A.evaluateJavascript("getSessionId()", new a(askOliveActivity2));
                                } else {
                                    if (!(actions instanceof AskOliveContract.Actions.EndChat)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    ActivityChatWithOliveBinding activityChatWithOliveBinding3 = askOliveActivity2.B;
                                    if (activityChatWithOliveBinding3 == null) {
                                        Intrinsics.p("binding");
                                        throw null;
                                    }
                                    activityChatWithOliveBinding3.A.evaluateJavascript("endChat()", new au.com.woolworths.feature.rewards.account.sso.d(i2));
                                }
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (channelLimitedFlowMergeG.collect(flowCollector, this) == coroutineSingletons) {
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
    public AskOliveActivity$subscribeActions$1(AskOliveActivity askOliveActivity, Continuation continuation) {
        super(2, continuation);
        this.q = askOliveActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AskOliveActivity$subscribeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AskOliveActivity$subscribeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            AskOliveActivity askOliveActivity = this.q;
            Lifecycle d = askOliveActivity.getD();
            Lifecycle.State state = Lifecycle.State.g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(askOliveActivity, null);
            this.p = 1;
            if (RepeatOnLifecycleKt.a(d, state, anonymousClass1, this) == coroutineSingletons) {
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
