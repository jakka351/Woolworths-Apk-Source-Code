package au.com.woolworths.feature.rewards.everydayextras.signup.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.EverydayExtraOnboardingFooterItem;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/selections/SubscribeOnboardingFooterFragmentSelections;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeOnboardingFooterFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6208a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f6208a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ContentCta", CollectionsKt.Q("ContentCta"));
        builder.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f9615a)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("items", d.j(EverydayExtraOnboardingFooterItem.f9548a));
        builder2.e = listR2;
        c = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder2.c());
    }
}
