package au.com.woolworths.product.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.BoostOfferResponse;
import au.com.woolworths.shop.graphql.type.BoostTagProductOffersResponse;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.RewardsOfferAnalytics;
import au.com.woolworths.shop.graphql.type.RewardsOfferInfo;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/selections/BoostOffersMutationSelections;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BoostOffersMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9335a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("offerName", customScalarType).c(), d.g("campaignStream", customScalarType), d.g("channel", customScalarType), d.g("status", customScalarType), d.g("offerType", customScalarType), d.g("partnerId", customScalarType), d.g("rtlAccountID", customScalarType), d.g("rtlCampaignID", customScalarType), d.g("rtlCampaignCode", customScalarType));
        f9335a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("displayExpiry", CompiledGraphQL.b(customScalarType)).c();
        RewardsOfferStatus.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("offerStatus", CompiledGraphQL.b(RewardsOfferStatus.f)).c();
        CompiledField compiledFieldG = d.g("displayStatus", customScalarType);
        CompiledField compiledFieldG2 = d.g("minimumSpend", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("offerAnalytics", RewardsOfferAnalytics.f11883a);
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldG, compiledFieldG2, builder.c());
        b = listR2;
        CompiledField compiledFieldC4 = new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("info", RewardsOfferInfo.f11884a);
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, builder2.c());
        c = listR3;
        CompiledField.Builder builder3 = new CompiledField.Builder("boostOffers", CompiledGraphQL.a(CompiledGraphQL.b(BoostOfferResponse.f11050a)));
        builder3.e = listR3;
        List listQ = CollectionsKt.Q(builder3.c());
        d = listQ;
        CompiledField.Builder builder4 = new CompiledField.Builder("boostTagProductOffers", BoostTagProductOffersResponse.f11051a);
        new CompiledArgument.Builder(Mutation.x);
        builder4.d = a.v();
        builder4.e = listQ;
        e = CollectionsKt.Q(builder4.c());
    }
}
