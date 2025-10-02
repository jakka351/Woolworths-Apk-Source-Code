package au.com.woolworths.rewards.base;

import au.com.woolworths.android.onesite.network.ExceptionExtKt;
import au.com.woolworths.android.onesite.network.GraphQlException;
import au.com.woolworths.rewards.base.FetchFeatureAccesslistQuery;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.exception.ApolloException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.rewards.base.RewardsFeatureAccessListRepository", f = "RewardsFeatureAccessListRepository.kt", l = {22}, m = "fetchFeatureAccessLists")
/* loaded from: classes4.dex */
final class RewardsFeatureAccessListRepository$fetchFeatureAccessLists$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsFeatureAccessListRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsFeatureAccessListRepository$fetchFeatureAccessLists$1(RewardsFeatureAccessListRepository rewardsFeatureAccessListRepository, Continuation continuation) {
        super(continuation);
        this.q = rewardsFeatureAccessListRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        RewardsFeatureAccessListRepository$fetchFeatureAccessLists$1 rewardsFeatureAccessListRepository$fetchFeatureAccessLists$1;
        this.p = obj;
        int i = this.r | Integer.MIN_VALUE;
        this.r = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.r = i - Integer.MIN_VALUE;
            rewardsFeatureAccessListRepository$fetchFeatureAccessLists$1 = this;
        } else {
            rewardsFeatureAccessListRepository$fetchFeatureAccessLists$1 = new RewardsFeatureAccessListRepository$fetchFeatureAccessLists$1(this.q, this);
        }
        Object obj2 = rewardsFeatureAccessListRepository$fetchFeatureAccessLists$1.p;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = rewardsFeatureAccessListRepository$fetchFeatureAccessLists$1.r;
        if (i2 == 0) {
            ResultKt.b(obj2);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            ResultKt.b(obj2);
            ApolloResponse apolloResponse = (ApolloResponse) obj2;
            if (apolloResponse.b()) {
                throw ExceptionExtKt.i(apolloResponse.d);
            }
            FetchFeatureAccesslistQuery.Data data = (FetchFeatureAccesslistQuery.Data) ExceptionExtKt.k(apolloResponse);
            return new Pair(data.f9348a, data.b);
        } catch (GraphQlException e) {
            throw ExceptionExtKt.h(e);
        } catch (ApolloException e2) {
            throw ExceptionExtKt.j(e2);
        }
    }
}
