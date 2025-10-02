package au.com.woolworths.feature.rewards.everydayextras.signup.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.selections.SubscribeOnboardingContentFragmentSelections;
import au.com.woolworths.feature.rewards.everydayextras.signup.fragment.selections.SubscribeOnboardingFooterFragmentSelections;
import au.com.woolworths.rewards.graphql.type.EverydayExtraOnboarding;
import au.com.woolworths.rewards.graphql.type.EverydayExtraOnboardingContent;
import au.com.woolworths.rewards.graphql.type.EverydayExtraOnboardingFooter;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/selections/EverydayExtrasSubscribeLegacyMutationSelections;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasSubscribeLegacyMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6216a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("EverydayExtraOnboardingContent", CollectionsKt.Q("EverydayExtraOnboardingContent"));
        builder.b(SubscribeOnboardingContentFragmentSelections.h);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f6216a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("EverydayExtraOnboardingFooter", CollectionsKt.Q("EverydayExtraOnboardingFooter"));
        builder2.b(SubscribeOnboardingFooterFragmentSelections.c);
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("content", CompiledGraphQL.b(EverydayExtraOnboardingContent.f9546a));
        builder3.e = listR;
        CompiledField compiledFieldC3 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("footer", CompiledGraphQL.b(EverydayExtraOnboardingFooter.f9547a));
        builder4.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, builder4.c());
        c = listR3;
        CompiledField.Builder builder5 = new CompiledField.Builder("everydayExtraSubscribe", CompiledGraphQL.b(EverydayExtraOnboarding.f9545a));
        new CompiledArgument.Builder(Mutation.g);
        builder5.d = au.com.woolworths.android.onesite.a.v();
        builder5.e = listR3;
        d = CollectionsKt.Q(builder5.c());
    }
}
