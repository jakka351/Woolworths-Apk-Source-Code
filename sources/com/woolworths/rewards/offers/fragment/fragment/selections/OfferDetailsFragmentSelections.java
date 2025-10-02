package com.woolworths.rewards.offers.fragment.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLInt;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.OfferCta;
import au.com.woolworths.rewards.graphql.type.RewardsOfferActivationMessage;
import au.com.woolworths.rewards.graphql.type.RewardsOfferAnalytics;
import au.com.woolworths.rewards.graphql.type.RewardsOfferMechanicItem;
import au.com.woolworths.rewards.graphql.type.RewardsOfferMechanics;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import au.com.woolworths.rewards.graphql.type.RewardsStatusIcon;
import au.com.woolworths.rewards.graphql.type.StandardBanner;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.common.Scopes;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/selections/OfferDetailsFragmentSelections;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OfferDetailsFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21037a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder(BarcodePickDeserializer.FIELD_ICON, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("caption", CompiledGraphQL.b(customScalarType)).c(), d.g("altText", customScalarType), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c());
        f21037a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("displayLastUpdated", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("separator", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("selectedIndex", CompiledGraphQL.b(GraphQLInt.f9616a)).c();
        CompiledField.Builder builder = new CompiledField.Builder("items", a.f(RewardsOfferMechanicItem.f9839a));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, builder.c());
        b = listR2;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(BarcodePickDeserializer.FIELD_ICON, CompiledGraphQL.b(customScalarType)).c());
        c = listQ;
        List listR3 = CollectionsKt.R(d.g("offerName", customScalarType), d.g("commId", customScalarType), d.g("uoid", customScalarType), d.g("campaignCode", customScalarType), d.g("campaignStream", customScalarType), d.g("channel", customScalarType), d.g("status", customScalarType), d.g("offerType", customScalarType), d.g("partnerId", customScalarType), d.g("rtlAccountID", customScalarType), d.g("rtlCampaignID", customScalarType), d.g("rtlCampaignCode", customScalarType), d.g("rtlCouponStart", customScalarType), d.g(Scopes.PROFILE, customScalarType));
        d = listR3;
        List listR4 = CollectionsKt.R(d.g("title", customScalarType), d.g("message", customScalarType), new CompiledField.Builder("buttonLabel", CompiledGraphQL.b(customScalarType)).c());
        e = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType), new CompiledField.Builder("isExternalUrl", GraphQLBoolean.f9613a).c());
        f = listR5;
        CompiledField.Builder builder2 = new CompiledField.Builder("cta", CompiledGraphQL.b(ContentCta.f9485a));
        builder2.e = listR5;
        List listR6 = CollectionsKt.R(builder2.c(), d.g("displayStatus", customScalarType));
        g = listR6;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("StandardBanner", CollectionsKt.Q("StandardBanner"));
        builder3.b(StandardBannerFieldsSelections.f21039a);
        List listR7 = CollectionsKt.R(compiledFieldC4, builder3.a());
        h = listR7;
        CompiledField compiledFieldG = d.g("displayExpiryExtended", customScalarType);
        CompiledField.Builder builder4 = new CompiledField.Builder("offerDetailsCta", OfferCta.f9675a);
        builder4.e = listR6;
        CompiledField compiledFieldC5 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("standardBanner", StandardBanner.f9912a);
        builder5.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldG, compiledFieldC5, builder5.c());
        i = listR8;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG2 = d.g("bannerUrl", customScalarType);
        CompiledField compiledFieldC9 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG3 = d.g(ErrorBundle.SUMMARY_ENTRY, customScalarType);
        CompiledField compiledFieldG4 = d.g("body", customScalarType);
        CompiledField compiledFieldG5 = d.g("formattedTermsAndConditions", customScalarType);
        CompiledField compiledFieldG6 = d.g("markdownTermsAndConditions", customScalarType);
        CompiledField compiledFieldC11 = new CompiledField.Builder("displayExpiry", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC12 = new CompiledField.Builder("displayStatus", CompiledGraphQL.b(customScalarType)).c();
        RewardsOfferStatus.e.getClass();
        CompiledField compiledFieldC13 = new CompiledField.Builder("offerStatus", CompiledGraphQL.b(RewardsOfferStatus.f)).c();
        CompiledField compiledFieldG7 = d.g("brandLogoUrl", customScalarType);
        CompiledField.Builder builder6 = new CompiledField.Builder("mechanics", RewardsOfferMechanics.f9840a);
        builder6.e = listR2;
        CompiledField compiledFieldC14 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("statusIcons", a.f(RewardsStatusIcon.f9871a));
        builder7.e = listQ;
        CompiledField compiledFieldC15 = builder7.c();
        CompiledField.Builder builder8 = new CompiledField.Builder("offerAnalytics", RewardsOfferAnalytics.f9837a);
        builder8.e = listR3;
        CompiledField compiledFieldC16 = builder8.c();
        CompiledField compiledFieldG8 = d.g("activationAnimation", customScalarType);
        CompiledField compiledFieldG9 = d.g("displayAnimation", customScalarType);
        CompiledField.Builder builder9 = new CompiledField.Builder("activationMessage", RewardsOfferActivationMessage.f9836a);
        builder9.e = listR4;
        CompiledField compiledFieldC17 = builder9.c();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("RewardsOffer", CollectionsKt.Q("RewardsOffer"));
        builder10.d = listR8;
        j = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldG2, compiledFieldC9, compiledFieldC10, compiledFieldG3, compiledFieldG4, compiledFieldG5, compiledFieldG6, compiledFieldC11, compiledFieldC12, compiledFieldC13, compiledFieldG7, compiledFieldC14, compiledFieldC15, compiledFieldC16, compiledFieldG8, compiledFieldG9, compiledFieldC17, builder10.a());
    }
}
