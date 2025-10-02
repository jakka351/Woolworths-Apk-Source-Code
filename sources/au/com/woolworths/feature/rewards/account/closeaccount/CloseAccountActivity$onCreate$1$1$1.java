package au.com.woolworths.feature.rewards.account.closeaccount;

import android.content.Context;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountContract;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$onCreate$1$1$1", f = "CloseAccountActivity.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CloseAccountActivity$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CloseAccountActivity q;
    public final /* synthetic */ Context r;
    public final /* synthetic */ CoroutineScope s;
    public final /* synthetic */ ScaffoldState t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloseAccountActivity$onCreate$1$1$1(CloseAccountActivity closeAccountActivity, Context context, CoroutineScope coroutineScope, ScaffoldState scaffoldState, Continuation continuation) {
        super(2, continuation);
        this.q = closeAccountActivity;
        this.r = context;
        this.s = coroutineScope;
        this.t = scaffoldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CloseAccountActivity$onCreate$1$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CloseAccountActivity$onCreate$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CloseAccountActivity closeAccountActivity = this.q;
            Flow flow = ((CloseAccountViewModel) closeAccountActivity.x.getD()).i;
            final CoroutineScope coroutineScope = this.s;
            final ScaffoldState scaffoldState = this.t;
            final Context context = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$onCreate$1$1$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$onCreate$1$1$1$1$1", f = "CloseAccountActivity.kt", l = {49}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity$onCreate$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C01231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScaffoldState q;
                    public final /* synthetic */ Context r;
                    public final /* synthetic */ CloseAccountContract.Action s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01231(ScaffoldState scaffoldState, Context context, CloseAccountContract.Action action, Continuation continuation) {
                        super(2, continuation);
                        this.q = scaffoldState;
                        this.r = context;
                        this.s = action;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01231(this.q, this.r, this.s, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01231) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SnackbarHostState snackbarHostState = this.q.f1319a;
                            String string = this.r.getString(((CloseAccountContract.Action.ShowErrorMessage) this.s).f5685a);
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
                    CloseAccountContract.Action action = (CloseAccountContract.Action) obj2;
                    boolean z = action instanceof CloseAccountContract.Action.OpenUrl;
                    Context context2 = context;
                    if (z) {
                        ContextExtKt.e(context2, ((CloseAccountContract.Action.OpenUrl) action).f5684a);
                    } else if (action instanceof CloseAccountContract.Action.ShowErrorMessage) {
                        BuildersKt.c(coroutineScope, null, null, new C01231(scaffoldState, context2, action, null), 3);
                    } else {
                        if (!Intrinsics.c(action, CloseAccountContract.Action.CloseAndGoToWelcomeScreen.f5683a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i2 = CloseAccountActivity.y;
                        CloseAccountActivity closeAccountActivity2 = closeAccountActivity;
                        closeAccountActivity2.finish();
                        closeAccountActivity2.startActivity(ActivityNavigatorKt.a(Activities.Welcome.f4555a, ApplicationType.d).setFlags(268468224));
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
