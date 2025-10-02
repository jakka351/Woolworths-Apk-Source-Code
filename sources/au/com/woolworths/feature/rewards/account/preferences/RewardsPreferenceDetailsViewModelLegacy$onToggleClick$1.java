package au.com.woolworths.feature.rewards.account.preferences;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.base.rewards.account.data.PreferenceToggleData;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1", f = "RewardsPreferenceDetailsViewModelLegacy.kt", l = {119}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsPreferenceDetailsViewModelLegacy q;
    public final /* synthetic */ PreferenceToggleData r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1(RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy, PreferenceToggleData preferenceToggleData, boolean z, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsPreferenceDetailsViewModelLegacy;
        this.r = preferenceToggleData;
        this.s = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsViewModelLegacy$onToggleClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy = this.q;
        SharedFlowImpl sharedFlowImpl = rewardsPreferenceDetailsViewModelLegacy.m;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = null;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.b(obj);
                        RewardsPreferenceDetailsViewModelLegacy.q6(rewardsPreferenceDetailsViewModelLegacy, rewardsPreferenceDetailsViewModelLegacy.l, true);
                        RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor = rewardsPreferenceDetailsViewModelLegacy.e;
                        PreferenceToggleData preferenceToggleData = this.r;
                        boolean z = this.s;
                        this.p = 1;
                        RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository = rewardsPreferenceDetailsInteractor.f5741a;
                        String id = preferenceToggleData.getId();
                        rewardsPreferenceDetailsRepository.b.getClass();
                        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                        obj = BuildersKt.f(DefaultIoScheduler.f, new RewardsPreferenceDetailsRepository$updateReceiptsPreference$2(rewardsPreferenceDetailsRepository, id, z, null), this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj);
                    }
                    PreferenceDetailsData preferenceDetailsData = (PreferenceDetailsData) obj;
                    rewardsPreferenceDetailsViewModelLegacy.j = true;
                    MutableLiveData mutableLiveData = rewardsPreferenceDetailsViewModelLegacy.l;
                    String str = preferenceDetailsData.f5747a;
                    mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(str != null ? new PlainText(str) : null, preferenceDetailsData.b, rewardsPreferenceDetailsErrorState, 28));
                    String str2 = preferenceDetailsData.c;
                    if (str2 != null) {
                        sharedFlowImpl.f(new RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarMessage(str2));
                    }
                } catch (ServerErrorException unused) {
                    sharedFlowImpl.f(new RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarErrorMessage(RewardsPreferenceDetailsContractLegacy.ToggleErrorType.f));
                }
            } catch (NoConnectivityException unused2) {
                sharedFlowImpl.f(new RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarErrorMessage(RewardsPreferenceDetailsContractLegacy.ToggleErrorType.e));
            }
            return Unit.f24250a;
        } finally {
            RewardsPreferenceDetailsViewModelLegacy.q6(rewardsPreferenceDetailsViewModelLegacy, rewardsPreferenceDetailsViewModelLegacy.l, false);
        }
    }
}
