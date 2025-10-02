package com.woolworths.rewards.promo.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.DownloadableAsset;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.FeatureInfoFooter;
import au.com.woolworths.rewards.graphql.type.FeatureInfoItem;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.RewardsAppModal;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/promo/selections/RewardsAppModalQuerySelections;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsAppModalQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21075a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;

    static {
        DownloadableAssetType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("assetType", CompiledGraphQL.b(DownloadableAssetType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("assetUrl", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f9616a;
        CompiledField compiledFieldC3 = new CompiledField.Builder("assetWidth", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("assetHeight", CompiledGraphQL.b(customScalarType2)).c();
        DownloadableAssetFit.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("fit", DownloadableAssetFit.f).c(), d.g("altText", customScalarType));
        f21075a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("markdownContent", CompiledGraphQL.b(customScalarType)).c());
        c = listQ;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("FeatureInfoBulletItem", CollectionsKt.Q("FeatureInfoBulletItem"));
        builder.d = listR2;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("FeatureInfoText", CollectionsKt.Q("FeatureInfoText"));
        builder2.d = listQ;
        List listR3 = CollectionsKt.R(compiledFieldC5, compiledFragmentA, builder2.a());
        d = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        e = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f = listR5;
        ObjectType objectType = ContentCta.f9485a;
        CompiledField.Builder builder3 = new CompiledField.Builder("primaryCta", CompiledGraphQL.b(objectType));
        builder3.e = listR4;
        CompiledField compiledFieldC6 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("secondaryCta", objectType);
        builder4.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC6, builder4.c());
        g = listR6;
        CompiledField.Builder builder5 = new CompiledField.Builder("headerImage", DownloadableAsset.f9500a);
        builder5.e = listR;
        CompiledField compiledFieldC7 = builder5.c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder(ErrorBundle.SUMMARY_ENTRY, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("infoItems", d.j(FeatureInfoItem.f9573a));
        builder6.e = listR3;
        CompiledField compiledFieldC10 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("footer", FeatureInfoFooter.f9571a);
        builder7.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, builder7.c());
        h = listR7;
        CompiledField.Builder builder8 = new CompiledField.Builder("rewardsAppModal", RewardsAppModal.f9805a);
        new CompiledArgument.Builder(Query.q);
        builder8.d = a.v();
        builder8.e = listR7;
        i = CollectionsKt.Q(builder8.c());
    }
}
