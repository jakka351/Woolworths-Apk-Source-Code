package com.woolworths.rewards.card.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.DownloadableAsset;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionUnlockButton;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionUnlockConfirmation;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/card/selections/RedemptionUnlockMutationSelections;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionUnlockMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20691a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        DownloadableAssetType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("assetType", CompiledGraphQL.b(DownloadableAssetType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("assetUrl", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLInt.f9616a;
        CompiledField compiledFieldC3 = new CompiledField.Builder("assetWidth", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("assetHeight", CompiledGraphQL.b(customScalarType2)).c();
        DownloadableAssetFit.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("fit", DownloadableAssetFit.f).c());
        f20691a = listR;
        List listR2 = CollectionsKt.R(d.g("loadingStateLabel", customScalarType), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("iconUrl", customScalarType));
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        c = listR3;
        CompiledField compiledFieldC5 = new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("headerImage", CompiledGraphQL.b(DownloadableAsset.f9500a));
        builder.e = listR;
        CompiledField compiledFieldC6 = builder.c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType3 = GraphQLBoolean.f9613a;
        CompiledField compiledFieldC8 = new CompiledField.Builder("showAnimation", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("button", CompiledGraphQL.b(RewardsRedemptionUnlockButton.f9863a));
        builder2.e = listR2;
        CompiledField compiledFieldC10 = builder2.c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("analyticsLabel", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("callToAction", ContentCta.f9485a);
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldC11, builder3.c(), d.g("showUnlock", customScalarType3));
        d = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder("rewardsRedemptionUnlock", RewardsRedemptionUnlockConfirmation.f9864a);
        builder4.e = listR4;
        e = CollectionsKt.Q(builder4.c());
    }
}
