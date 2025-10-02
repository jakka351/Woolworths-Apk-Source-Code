package au.com.woolworths.feature.rewards.card.overlay.ui;

import android.content.Context;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel;
import com.woolworths.R;
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
@DebugMetadata(c = "au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1", f = "RewardsCardOverlayScreen.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsCardOverlayViewModel q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ CoroutineScope s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ ScaffoldState v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1(RewardsCardOverlayViewModel rewardsCardOverlayViewModel, Function0 function0, CoroutineScope coroutineScope, Function1 function1, Function1 function12, ScaffoldState scaffoldState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsCardOverlayViewModel;
        this.r = function0;
        this.s = coroutineScope;
        this.t = function1;
        this.u = function12;
        this.v = scaffoldState;
        this.w = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1(this.q, this.r, this.s, this.t, this.u, this.v, this.w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flow = this.q.l;
            final ScaffoldState scaffoldState = this.v;
            final Context context = this.w;
            final Function0 function0 = this.r;
            final CoroutineScope coroutineScope = this.s;
            final Function1 function1 = this.t;
            final Function1 function12 = this.u;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1$1$1", f = "RewardsCardOverlayScreen.kt", l = {87}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C01331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScaffoldState q;
                    public final /* synthetic */ Context r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01331(ScaffoldState scaffoldState, Context context, Continuation continuation) {
                        super(2, continuation);
                        this.q = scaffoldState;
                        this.r = context;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01331(this.q, this.r, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01331) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SnackbarHostState snackbarHostState = this.q.f1319a;
                            String string = this.r.getString(R.string.rewards_card_copied_to_clipboard_message);
                            Intrinsics.g(string, "getString(...)");
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

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1$1$2", f = "RewardsCardOverlayScreen.kt", l = {103}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.feature.rewards.card.overlay.ui.RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$1$1$1$2, reason: invalid class name */
                final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScaffoldState q;
                    public final /* synthetic */ Context r;
                    public final /* synthetic */ RewardsCardOverlayContract.Action s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(ScaffoldState scaffoldState, Context context, RewardsCardOverlayContract.Action action, Continuation continuation) {
                        super(2, continuation);
                        this.q = scaffoldState;
                        this.r = context;
                        this.s = action;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new AnonymousClass2(this.q, this.r, this.s, continuation);
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
                            SnackbarHostState snackbarHostState = this.q.f1319a;
                            String string = this.r.getString(((RewardsCardOverlayContract.Action.ShowSnackbarMessage) this.s).f5831a);
                            Intrinsics.g(string, "getString(...)");
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
                    RewardsCardOverlayContract.Action action = (RewardsCardOverlayContract.Action) obj2;
                    if (action instanceof RewardsCardOverlayContract.Action.Close) {
                        function0.invoke();
                    } else {
                        boolean z = action instanceof RewardsCardOverlayContract.Action.ShowCardNumberCopiedMessage;
                        CoroutineScope coroutineScope2 = coroutineScope;
                        Context context2 = context;
                        ScaffoldState scaffoldState2 = scaffoldState;
                        if (z) {
                            BuildersKt.c(coroutineScope2, null, null, new C01331(scaffoldState2, context2, null), 3);
                        } else if (action instanceof RewardsCardOverlayContract.Action.CopyCardNumberToClipboard) {
                            function1.invoke(((RewardsCardOverlayContract.Action.CopyCardNumberToClipboard) action).f5828a);
                        } else if (action instanceof RewardsCardOverlayContract.Action.SaveToGoogleWallet) {
                            function12.invoke(((RewardsCardOverlayContract.Action.SaveToGoogleWallet) action).f5829a);
                        } else {
                            if (!(action instanceof RewardsCardOverlayContract.Action.ShowSnackbarMessage)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            BuildersKt.c(coroutineScope2, null, null, new AnonymousClass2(scaffoldState2, context2, action, null), 3);
                        }
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
