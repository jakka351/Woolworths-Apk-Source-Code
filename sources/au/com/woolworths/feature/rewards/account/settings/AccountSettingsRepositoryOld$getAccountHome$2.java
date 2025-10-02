package au.com.woolworths.feature.rewards.account.settings;

import android.os.Build;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.data.AccountHome;
import au.com.woolworths.feature.rewards.account.data.AccountHomeQueryRewardsAccountHomeExtKt;
import au.com.woolworths.rewards.base.RewardsBaseFeature;
import au.com.woolworths.rewards.graphql.type.AppOS;
import au.com.woolworths.rewards.graphql.type.RewardsAccountHomeFlags;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.AccountHomeQuery;
import java.util.Locale;
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
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/data/AccountHome;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.settings.AccountSettingsRepositoryOld$getAccountHome$2", f = "AccountSettingsRepositoryOld.kt", l = {73}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class AccountSettingsRepositoryOld$getAccountHome$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super AccountHome>, Object> {
    public int p;
    public final /* synthetic */ AccountSettingsRepositoryOld q;
    public final /* synthetic */ RewardsAccountHomeFlags r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountSettingsRepositoryOld$getAccountHome$2(AccountSettingsRepositoryOld accountSettingsRepositoryOld, RewardsAccountHomeFlags rewardsAccountHomeFlags, String str, Continuation continuation) {
        super(2, continuation);
        this.q = accountSettingsRepositoryOld;
        this.r = rewardsAccountHomeFlags;
        this.s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AccountSettingsRepositoryOld$getAccountHome$2(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSettingsRepositoryOld$getAccountHome$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                AccountSettingsRepositoryOld accountSettingsRepositoryOld = this.q;
                RewardsAccountHomeFlags rewardsAccountHomeFlags = this.r;
                String str = this.s;
                ApolloClient apolloClient = accountSettingsRepositoryOld.e;
                AccountHomeQuery accountHomeQuery = new AccountHomeQuery(Optional.Companion.a(rewardsAccountHomeFlags), Optional.Companion.a(str), accountSettingsRepositoryOld.i.c(RewardsBaseFeature.o));
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, accountHomeQuery);
                String strC = ContextExtKt.c(accountSettingsRepositoryOld.j);
                AppOS.Companion companion = AppOS.e;
                String lowerCase = "ANDROID".toLowerCase(Locale.ROOT);
                Intrinsics.g(lowerCase, "toLowerCase(...)");
                apolloCall.a("x-app-config", strC + ";" + lowerCase + ";" + Build.VERSION.RELEASE);
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
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            AccountHomeQuery.RewardsAccountHome rewardsAccountHome = ((AccountHomeQuery.Data) ExceptionExtKt.k(apolloResponse)).f20499a;
            AccountHome accountHomeA = rewardsAccountHome != null ? AccountHomeQueryRewardsAccountHomeExtKt.a(rewardsAccountHome) : null;
            if (accountHomeA != null) {
                return accountHomeA;
            }
            throw ExceptionExtKt.i(apolloResponse.d);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
