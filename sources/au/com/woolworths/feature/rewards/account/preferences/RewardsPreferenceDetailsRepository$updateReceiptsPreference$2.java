package au.com.woolworths.feature.rewards.account.preferences;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.preferences.data.PreferenceDetailsData;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.PreferenceUpdateMutation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/preferences/data/PreferenceDetailsData;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsRepository$updateReceiptsPreference$2", f = "RewardsPreferenceDetailsRepository.kt", l = {44}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsRepository$updateReceiptsPreference$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PreferenceDetailsData>, Object> {
    public RewardsPreferenceDetailsRepository p;
    public int q;
    public final /* synthetic */ RewardsPreferenceDetailsRepository r;
    public final /* synthetic */ String s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsRepository$updateReceiptsPreference$2(RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.r = rewardsPreferenceDetailsRepository;
        this.s = str;
        this.t = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPreferenceDetailsRepository$updateReceiptsPreference$2(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsPreferenceDetailsRepository$updateReceiptsPreference$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                RewardsPreferenceDetailsRepository rewardsPreferenceDetailsRepository2 = this.r;
                String str = this.s;
                boolean z = this.t;
                ApolloClient apolloClient = rewardsPreferenceDetailsRepository2.f5742a;
                PreferenceUpdateMutation preferenceUpdateMutation = new PreferenceUpdateMutation(str, z);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, preferenceUpdateMutation);
                this.p = rewardsPreferenceDetailsRepository2;
                this.q = 1;
                Object objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                rewardsPreferenceDetailsRepository = rewardsPreferenceDetailsRepository2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rewardsPreferenceDetailsRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            PreferenceUpdateMutation.UpdatePreference updatePreference = ((PreferenceUpdateMutation.Data) ExceptionExtKt.k(apolloResponse)).f20555a;
            PreferenceDetailsData preferenceDetailsDataB = updatePreference != null ? RewardsPreferenceDetailsRepository.b(rewardsPreferenceDetailsRepository, updatePreference) : null;
            if (preferenceDetailsDataB != null) {
                return preferenceDetailsDataB;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
