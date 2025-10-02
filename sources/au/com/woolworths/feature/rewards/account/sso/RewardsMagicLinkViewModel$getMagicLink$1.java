package au.com.woolworths.feature.rewards.account.sso;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.rewards.account.data.RewardsMagicLink;
import au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkViewModel$getMagicLink$1", f = "RewardsMagicLinkViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsMagicLinkViewModel$getMagicLink$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsMagicLinkViewModel q;
    public final /* synthetic */ String r;
    public final /* synthetic */ Activities.MagicLinkActivity.PreferredLaunchMode s;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5810a;

        static {
            int[] iArr = new int[Activities.MagicLinkActivity.PreferredLaunchMode.values().length];
            try {
                Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode = Activities.MagicLinkActivity.PreferredLaunchMode.d;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5810a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsMagicLinkViewModel$getMagicLink$1(RewardsMagicLinkViewModel rewardsMagicLinkViewModel, String str, Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsMagicLinkViewModel;
        this.r = str;
        this.s = preferredLaunchMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsMagicLinkViewModel$getMagicLink$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsMagicLinkViewModel$getMagicLink$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RewardsMagicLinkViewModel rewardsMagicLinkViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = rewardsMagicLinkViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MutableLiveData mutableLiveData = rewardsMagicLinkViewModel.i;
                String str = this.r;
                RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, mutableLiveData, true, str, null, null, 8);
                RewardsMagicLinkInteractor rewardsMagicLinkInteractor = rewardsMagicLinkViewModel.e;
                this.p = 1;
                obj = RewardsMagicLinkInteractor.a(rewardsMagicLinkInteractor, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            RewardsMagicLink rewardsMagicLink = (RewardsMagicLink) obj;
            Activities.MagicLinkActivity.PreferredLaunchMode preferredLaunchMode = this.s;
            if ((preferredLaunchMode == null ? -1 : WhenMappings.f5810a[preferredLaunchMode.ordinal()]) == 1) {
                RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, rewardsMagicLinkViewModel.i, false, null, null, "", 7);
                sharedFlowImpl.f(new RewardsMagicLinkContract.Actions.OpenInChromeTab(rewardsMagicLink.f5718a, rewardsMagicLink.b));
            } else {
                RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, rewardsMagicLinkViewModel.i, false, null, null, rewardsMagicLink.c, 7);
                sharedFlowImpl.f(new RewardsMagicLinkContract.Actions.OpenInWebView(rewardsMagicLink.f5718a, rewardsMagicLink.b));
            }
        } catch (NoConnectivityException unused) {
            RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, rewardsMagicLinkViewModel.i, false, null, RewardsMagicLinkErrorState.d, null, 11);
        } catch (ServerErrorException unused2) {
            RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, rewardsMagicLinkViewModel.i, false, null, RewardsMagicLinkErrorState.e, null, 11);
        }
        RewardsMagicLinkViewModel.p6(rewardsMagicLinkViewModel, rewardsMagicLinkViewModel.i, false, null, null, null, 14);
        return Unit.f24250a;
    }
}
