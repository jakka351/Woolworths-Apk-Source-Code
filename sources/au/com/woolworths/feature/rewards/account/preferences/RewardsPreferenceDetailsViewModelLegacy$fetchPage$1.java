package au.com.woolworths.feature.rewards.account.preferences;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy$fetchPage$1", f = "RewardsPreferenceDetailsViewModelLegacy.kt", l = {78}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsViewModelLegacy$fetchPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsPreferenceDetailsViewModelLegacy q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsViewModelLegacy$fetchPage$1(RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsPreferenceDetailsViewModelLegacy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsViewModelLegacy$fetchPage$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsViewModelLegacy$fetchPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy = this.q;
        MutableLiveData mutableLiveData = rewardsPreferenceDetailsViewModelLegacy.l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        int i2 = 23;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(b3 == true ? 1 : 0, b2 == true ? 1 : 0, b == true ? 1 : 0, 27));
                RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor = rewardsPreferenceDetailsViewModelLegacy.e;
                String str = rewardsPreferenceDetailsViewModelLegacy.h;
                if (str == null) {
                    Intrinsics.p("preferencesKey");
                    throw null;
                }
                this.p = 1;
                RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository = rewardsPreferenceDetailsInteractor.f5741a;
                rewardsPreferenceDetailsRepository.b.getClass();
                DefaultScheduler defaultScheduler = Dispatchers.f24691a;
                obj = BuildersKt.f(DefaultIoScheduler.f, new RewardsPreferenceDetailsRepository$getReceiptsPreferences$2(rewardsPreferenceDetailsRepository, str, null), this);
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
            String str2 = preferenceDetailsData.f5747a;
            mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(str2 != null ? new PlainText(str2) : null, preferenceDetailsData.b, rewardsPreferenceDetailsErrorState, 28));
        } catch (NoConnectivityException unused) {
            mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(0 == true ? 1 : 0, 0 == true ? 1 : 0, RewardsPreferenceDetailsErrorState.d, i2));
        } catch (ServerErrorException unused2) {
            mutableLiveData.m(new RewardsPreferenceDetailsContractLegacy.ViewState(0 == true ? 1 : 0, 0 == true ? 1 : 0, RewardsPreferenceDetailsErrorState.e, i2));
        }
        return Unit.f24250a;
    }
}
