package au.com.woolworths.feature.rewards.account.settings.v2;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.material.ScaffoldState;
import androidx.compose.material.SnackbarHostState;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.rewards.account.closeaccount.CloseAccountActivity;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$onCreate$1$1$1", f = "AccountSettingsActivity.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AccountSettingsActivity$onCreate$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsActivity q;
    public final /* synthetic */ CoroutineScope r;
    public final /* synthetic */ ScaffoldState s;
    public final /* synthetic */ Context t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsActivity$onCreate$1$1$1(AccountSettingsActivity accountSettingsActivity, CoroutineScope coroutineScope, ScaffoldState scaffoldState, Context context, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsActivity;
        this.r = coroutineScope;
        this.s = scaffoldState;
        this.t = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsActivity$onCreate$1$1$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsActivity$onCreate$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = AccountSettingsActivity.A;
            final AccountSettingsActivity accountSettingsActivity = this.q;
            Flow flow = accountSettingsActivity.O4().n;
            final ScaffoldState scaffoldState = this.s;
            final Context context = this.t;
            final CoroutineScope coroutineScope = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$onCreate$1$1$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$onCreate$1$1$1$1$1", f = "AccountSettingsActivity.kt", l = {106}, m = "invokeSuspend")
                /* renamed from: au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity$onCreate$1$1$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C01311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ ScaffoldState q;
                    public final /* synthetic */ AccountSettingsContract.Action r;
                    public final /* synthetic */ Context s;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C01311(ScaffoldState scaffoldState, AccountSettingsContract.Action action, Context context, Continuation continuation) {
                        super(2, continuation);
                        this.q = scaffoldState;
                        this.r = action;
                        this.s = context;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C01311(this.q, this.r, this.s, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C01311) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            SnackbarHostState snackbarHostState = this.q.f1319a;
                            String string = ((AccountSettingsContract.Action.ShowErrorMessage) this.r).f5784a.getText(this.s).toString();
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
                    AccountSettingsContract.Action action = (AccountSettingsContract.Action) obj2;
                    boolean z = action instanceof AccountSettingsContract.Action.GoToWelcomeScreen;
                    AccountSettingsActivity accountSettingsActivity2 = accountSettingsActivity;
                    if (z) {
                        boolean z2 = ((AccountSettingsContract.Action.GoToWelcomeScreen) action).f5775a;
                        int i3 = AccountSettingsActivity.A;
                        accountSettingsActivity2.finish();
                        accountSettingsActivity2.startActivity(Activities.Welcome.b(z2).setFlags(268468224));
                    } else if (action instanceof AccountSettingsContract.Action.OpenAndroidReviewLink) {
                        ContextExtKt.h(accountSettingsActivity2, ((AccountSettingsContract.Action.OpenAndroidReviewLink) action).f5776a);
                    } else if (action instanceof AccountSettingsContract.Action.OpenCallbackUrl) {
                        Activities.RewardsCallbackUrlActivity.Extras extras = ((AccountSettingsContract.Action.OpenCallbackUrl) action).f5777a;
                        ActivityResultLauncher activityResultLauncher = accountSettingsActivity2.z;
                        Intent intentA = ActivityNavigatorKt.a(Activities.RewardsCallbackUrlActivity.f4516a, ApplicationType.d);
                        intentA.putExtra("EXTRAS", extras);
                        activityResultLauncher.a(intentA, null);
                    } else if (action instanceof AccountSettingsContract.Action.OpenInAppBrowser) {
                        ContextExtKt.j(accountSettingsActivity2, ((AccountSettingsContract.Action.OpenInAppBrowser) action).f5778a, null, null, null, 62);
                    } else if (action instanceof AccountSettingsContract.Action.OpenMagicLink) {
                        AccountSettingsContract.Action.OpenMagicLink openMagicLink = (AccountSettingsContract.Action.OpenMagicLink) action;
                        String str = openMagicLink.f5779a;
                        String str2 = openMagicLink.b;
                        int i4 = AccountSettingsActivity.A;
                        accountSettingsActivity2.startActivity(Activities.MagicLinkActivity.b(str, str2, null));
                    } else if (action instanceof AccountSettingsContract.Action.OpenMagicLinkInChromeTab) {
                        AccountSettingsContract.Action.OpenMagicLinkInChromeTab openMagicLinkInChromeTab = (AccountSettingsContract.Action.OpenMagicLinkInChromeTab) action;
                        String str3 = openMagicLinkInChromeTab.f5780a;
                        String str4 = openMagicLinkInChromeTab.b;
                        Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode = Activities.MagicLinkActivity.PreferredLaunchMode.e;
                        int i5 = AccountSettingsActivity.A;
                        accountSettingsActivity2.startActivity(Activities.MagicLinkActivity.b(str3, str4, preferredLaunchMode));
                    } else if (action instanceof AccountSettingsContract.Action.OpenUrl) {
                        ContextExtKt.e(accountSettingsActivity2, ((AccountSettingsContract.Action.OpenUrl) action).f5781a);
                    } else if (action instanceof AccountSettingsContract.Action.ShowDeleteAccountScreen) {
                        int i6 = AccountSettingsActivity.A;
                        accountSettingsActivity2.startActivity(new Intent(accountSettingsActivity2, (Class<?>) CloseAccountActivity.class));
                    } else if (action instanceof AccountSettingsContract.Action.ShowDeveloperOptions) {
                        int i7 = AccountSettingsActivity.A;
                        accountSettingsActivity2.startActivity(ActivityNavigatorKt.a(Activities.DevOptions2.f4469a, ApplicationType.d));
                    } else {
                        if (!(action instanceof AccountSettingsContract.Action.ShowErrorMessage)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        BuildersKt.c(coroutineScope, null, null, new C01311(scaffoldState, action, context, null), 3);
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
