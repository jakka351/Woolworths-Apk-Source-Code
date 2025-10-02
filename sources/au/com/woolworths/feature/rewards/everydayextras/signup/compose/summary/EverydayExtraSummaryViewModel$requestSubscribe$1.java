package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.rewards.everydayextrasignup.EdxSummaryAnalytics;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSignupSubscribeData;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.EverydayExtrasSummaryInteractorImpl;
import com.woolworths.R;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryViewModel$requestSubscribe$1", f = "EverydayExtraSummaryViewModel.kt", l = {515}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class EverydayExtraSummaryViewModel$requestSubscribe$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ EverydayExtraSummaryViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ String s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EverydayExtraSummaryViewModel$requestSubscribe$1(EverydayExtraSummaryViewModel everydayExtraSummaryViewModel, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.q = everydayExtraSummaryViewModel;
        this.r = str;
        this.s = str2;
        this.t = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EverydayExtraSummaryViewModel$requestSubscribe$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((EverydayExtraSummaryViewModel$requestSubscribe$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        EverydayExtraSummaryViewModel everydayExtraSummaryViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                EverydayExtrasSummaryInteractorImpl everydayExtrasSummaryInteractorImpl = everydayExtraSummaryViewModel.f;
                String str = this.r;
                String str2 = this.s;
                String str3 = this.t;
                this.p = 1;
                obj = everydayExtrasSummaryInteractorImpl.a(str, str2, str3, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            EverydayExtraSignupSubscribeData everydayExtraSignupSubscribeData = (EverydayExtraSignupSubscribeData) obj;
            if (everydayExtraSignupSubscribeData instanceof EverydayExtrasOnBoarding) {
                everydayExtraSummaryViewModel.i.g(EdxSummaryAnalytics.Summary.Action.e);
                BuildersKt.c(ViewModelKt.a(everydayExtraSummaryViewModel), null, null, new EverydayExtraSummaryViewModel$onSubscribeSuccess$1(everydayExtraSummaryViewModel, (EverydayExtrasOnBoarding) everydayExtraSignupSubscribeData, null), 3);
            } else {
                if (!(everydayExtraSignupSubscribeData instanceof EverydayExtraSubscribeAlertDialog)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (Intrinsics.c(((EverydayExtraSubscribeAlertDialog) everydayExtraSignupSubscribeData).i, Boolean.TRUE)) {
                    EverydayExtraSummaryViewModel.q6(everydayExtraSummaryViewModel, true);
                }
                EverydayExtraSummaryViewModel.s6(everydayExtraSummaryViewModel, (EverydayExtraSubscribeAlertDialog) everydayExtraSignupSubscribeData);
            }
        } catch (NoConnectivityException unused) {
            EverydayExtraSummaryViewModel.t6(everydayExtraSummaryViewModel, R.string.everyday_extras_signup_network_error_title, R.string.everyday_extras_signup_network_error_message);
        } catch (ServerErrorException unused2) {
            EverydayExtraSummaryViewModel.t6(everydayExtraSummaryViewModel, R.string.everyday_extras_signup_server_error_title, R.string.everyday_extras_signup_server_error_message);
        }
        return Unit.f24250a;
    }
}
