package au.com.woolworths.feature.rewards.account.settings;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.rewards.graphql.type.RewardsNewBadgeMenuType;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.RewardsNewBadgeDismissedMutation;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/woolworths/rewards/account/RewardsNewBadgeDismissedMutation$Data;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsRepositoryOld$notifyNewBadgeDismissed$2", f = "AccountSettingsRepositoryOld.kt", l = {115}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsRepositoryOld$notifyNewBadgeDismissed$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsNewBadgeDismissedMutation.Data>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsRepositoryOld q;
    public final /* synthetic */ String r;
    public final /* synthetic */ RewardsNewBadgeMenuType s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsRepositoryOld$notifyNewBadgeDismissed$2(AccountSettingsRepositoryOld accountSettingsRepositoryOld, String str, RewardsNewBadgeMenuType rewardsNewBadgeMenuType, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsRepositoryOld;
        this.r = str;
        this.s = rewardsNewBadgeMenuType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsRepositoryOld$notifyNewBadgeDismissed$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsRepositoryOld$notifyNewBadgeDismissed$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AccountSettingsRepositoryOld accountSettingsRepositoryOld = this.q;
                String str = this.r;
                RewardsNewBadgeMenuType rewardsNewBadgeMenuType = this.s;
                ApolloClient apolloClient = accountSettingsRepositoryOld.e;
                RewardsNewBadgeDismissedMutation rewardsNewBadgeDismissedMutation = new RewardsNewBadgeDismissedMutation(Optional.Companion.a(rewardsNewBadgeMenuType), str);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, rewardsNewBadgeDismissedMutation);
                this.p = 1;
                obj = apolloCall.b(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return ExceptionExtKt.k((ApolloResponse) obj);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
