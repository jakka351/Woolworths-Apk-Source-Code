package au.com.woolworths.foundation.rewards.banner.dismiss.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/banner/dismiss/selections/RewardsBannerDismissedMutationSelections;", "", "banner-dismiss_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsBannerDismissedMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8545a;

    static {
        CompiledField.Builder builder = new CompiledField.Builder("rewardsBannerDismissed", GraphQLBoolean.f9613a);
        new CompiledArgument.Builder(Mutation.p);
        builder.d = a.v();
        f8545a = CollectionsKt.Q(builder.c());
    }
}
