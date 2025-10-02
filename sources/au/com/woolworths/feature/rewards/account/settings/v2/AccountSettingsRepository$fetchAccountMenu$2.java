package au.com.woolworths.feature.rewards.account.settings.v2;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.AccountMenuQuery;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/settings/v2/model/RewardsAccountMenu;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsRepository$fetchAccountMenu$2", f = "AccountSettingsRepository.kt", l = {152}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsRepository$fetchAccountMenu$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsAccountMenu>, Object> {
    public AccountSettingsRepository p;
    public int q;
    public final /* synthetic */ AccountSettingsRepository r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsRepository$fetchAccountMenu$2(AccountSettingsRepository accountSettingsRepository, Continuation continuation) {
        super(2, continuation);
        this.r = accountSettingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsRepository$fetchAccountMenu$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsRepository$fetchAccountMenu$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        AccountSettingsRepository accountSettingsRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AccountSettingsRepository accountSettingsRepository2 = this.r;
                ApolloClient apolloClient = accountSettingsRepository2.b;
                AccountMenuQuery accountMenuQuery = new AccountMenuQuery();
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, accountMenuQuery);
                this.p = accountSettingsRepository2;
                this.q = 1;
                Object objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                accountSettingsRepository = accountSettingsRepository2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                accountSettingsRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            AccountMenuQuery.RewardsAccountMenu rewardsAccountMenu = ((AccountMenuQuery.Data) ExceptionExtKt.k(apolloResponse)).f20520a;
            RewardsAccountMenu rewardsAccountMenuA = rewardsAccountMenu != null ? AccountSettingsRepository.a(accountSettingsRepository, AccountMenuQueryRewardsAccountMenuExtKt.a(rewardsAccountMenu)) : null;
            if (rewardsAccountMenuA != null) {
                return rewardsAccountMenuA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
