package au.com.woolworths.feature.rewards.account.sso;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.feature.rewards.account.data.RewardsMagicLink;
import com.apollographql.apollo.ApolloCall;
import com.apollographql.apollo.ApolloClient;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.exception.ApolloException;
import com.woolworths.rewards.account.RewardsMagicLinkQuery;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/feature/rewards/account/data/RewardsMagicLink;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkRepository$getMagicLink$2", f = "RewardsMagicLinkRepository.kt", l = {38}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes3.dex */
final class RewardsMagicLinkRepository$getMagicLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RewardsMagicLink>, Object> {
    public RewardsMagicLinkRepository p;
    public String q;
    public int r;
    public final /* synthetic */ RewardsMagicLinkRepository s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsMagicLinkRepository$getMagicLink$2(RewardsMagicLinkRepository rewardsMagicLinkRepository, String str, Continuation continuation) {
        super(2, continuation);
        this.s = rewardsMagicLinkRepository;
        this.t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsMagicLinkRepository$getMagicLink$2(this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsMagicLinkRepository$getMagicLink$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RewardsMagicLinkRepository rewardsMagicLinkRepository;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                rewardsMagicLinkRepository = this.s;
                String str2 = this.t;
                ApolloClient apolloClient = rewardsMagicLinkRepository.b;
                RewardsMagicLinkQuery rewardsMagicLinkQuery = new RewardsMagicLinkQuery(Optional.Companion.a(null), str2);
                apolloClient.getClass();
                ApolloCall apolloCall = new ApolloCall(apolloClient, rewardsMagicLinkQuery);
                this.p = rewardsMagicLinkRepository;
                this.q = str2;
                this.r = 1;
                Object objB = apolloCall.b(this);
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str = str2;
                obj = objB;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = this.q;
                rewardsMagicLinkRepository = this.p;
                ResultKt.b(obj);
            }
            ApolloResponse apolloResponse = (ApolloResponse) obj;
            RewardsMagicLinkQuery.RewardsMagicLink rewardsMagicLink = ((RewardsMagicLinkQuery.Data) ExceptionExtKt.k(apolloResponse)).f20564a;
            if (rewardsMagicLink == null) {
                throw ExceptionExtKt.i(apolloResponse.d);
            }
            rewardsMagicLinkRepository.f5809a.getD().getClass();
            return new RewardsMagicLink(rewardsMagicLink.f20565a, Intrinsics.c(str, "olive") ? rewardsMagicLinkRepository.f5809a.getD().f4272a : EmptyMap.d, rewardsMagicLink.b);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
