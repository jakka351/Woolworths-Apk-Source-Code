package au.com.woolworths.feature.rewards.everydayextras.signup.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraOnboardingItem;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.NestedItem;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/selections/SubscribeOnboardingContentFragmentSelections;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeOnboardingContentFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6207a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        DownloadableAssetType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("assetType", CompiledGraphQL.b(DownloadableAssetType.f)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("assetUrl", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f9616a;
        CompiledField compiledFieldC4 = new CompiledField.Builder("assetWidth", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("assetHeight", CompiledGraphQL.b(customScalarType2)).c();
        DownloadableAssetFit.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, new CompiledField.Builder("fit", DownloadableAssetFit.f).c(), d.g("altText", customScalarType));
        f6207a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c(), d.g("alignment", customScalarType));
        c = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        d = listR4;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("NestedMarkdownContent", CollectionsKt.Q("NestedMarkdownContent"));
        builder.d = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC6, builder.a());
        e = listR5;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("items", d.j(NestedItem.f9663a));
        builder2.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, builder2.c());
        f = listR6;
        CompiledField compiledFieldC9 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("DownloadableAsset", CollectionsKt.Q("DownloadableAsset"));
        builder3.d = listR;
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("TitleTextItem", CollectionsKt.Q("TitleTextItem"));
        builder4.d = listR2;
        CompiledFragment compiledFragmentA2 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ParagraphTextItem", CollectionsKt.Q("ParagraphTextItem"));
        builder5.d = listR3;
        CompiledFragment compiledFragmentA3 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("IconListItemWithNestedItems", CollectionsKt.Q("IconListItemWithNestedItems"));
        builder6.d = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC9, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, builder6.a());
        g = listR7;
        CompiledField compiledFieldC10 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f9615a)).c();
        CompiledField.Builder builder7 = new CompiledField.Builder("items", d.j(EverydayExtraOnboardingItem.f9549a));
        builder7.e = listR7;
        h = CollectionsKt.R(compiledFieldC10, compiledFieldC11, builder7.c());
    }
}
