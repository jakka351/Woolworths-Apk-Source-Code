package au.com.woolworths.shop.lists.data.remote.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.graphql.common.fragment.selections.ProductCardSelections;
import au.com.woolworths.shop.graphql.type.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.graphql.type.AlternativeProductsProductsHeader;
import au.com.woolworths.shop.graphql.type.AlternativeProductsSections;
import au.com.woolworths.shop.graphql.type.AlternativeProductsType;
import au.com.woolworths.shop.graphql.type.AlternativeProductsTypeTag;
import au.com.woolworths.shop.graphql.type.GetAlternativeProductsResponse;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductCard;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/shop/lists/data/remote/selections/AlternativeProductsQuerySelections;", "", "<init>", "()V", "__product", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__onAlternativeProductsTargetProductSection", "__products", "__disclaimer", "__typeTag", "__sectionHeader", "__onAlternativeProductsProductSection", "__onAlternativeProductsNoResultSection", "__onAlternativeProductsCtaSection", "__insetBanner", "__onAlternativeProductsInsetBannerSection", "__sections", "__disclaimer1", "__getAlternativeProducts", "__root", "get__root", "()Ljava/util/List;", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AlternativeProductsQuerySelections {

    @NotNull
    public static final AlternativeProductsQuerySelections INSTANCE = new AlternativeProductsQuerySelections();

    @NotNull
    private static final List<CompiledSelection> __disclaimer;

    @NotNull
    private static final List<CompiledSelection> __disclaimer1;

    @NotNull
    private static final List<CompiledSelection> __getAlternativeProducts;

    @NotNull
    private static final List<CompiledSelection> __insetBanner;

    @NotNull
    private static final List<CompiledSelection> __onAlternativeProductsCtaSection;

    @NotNull
    private static final List<CompiledSelection> __onAlternativeProductsInsetBannerSection;

    @NotNull
    private static final List<CompiledSelection> __onAlternativeProductsNoResultSection;

    @NotNull
    private static final List<CompiledSelection> __onAlternativeProductsProductSection;

    @NotNull
    private static final List<CompiledSelection> __onAlternativeProductsTargetProductSection;

    @NotNull
    private static final List<CompiledSelection> __product;

    @NotNull
    private static final List<CompiledSelection> __products;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __sectionHeader;

    @NotNull
    private static final List<CompiledSelection> __sections;

    @NotNull
    private static final List<CompiledSelection> __typeTag;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        List list = ProductCardSelections.A;
        builder.b(list);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __product = listR;
        ObjectType objectType = ProductCard.f11717a;
        CompiledField.Builder builder2 = new CompiledField.Builder("product", CompiledGraphQL.b(objectType));
        builder2.e = listR;
        List<CompiledSelection> listQ = CollectionsKt.Q(builder2.c());
        __onAlternativeProductsTargetProductSection = listQ;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ProductCard", CollectionsKt.Q("ProductCard"));
        builder3.d = list;
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC2, builder3.a());
        __products = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("dismissCtaText", CompiledGraphQL.b(customScalarType)).c());
        __disclaimer = listR3;
        AlternativeProductsType.e.getClass();
        List<CompiledSelection> listR4 = CollectionsKt.R(new CompiledField.Builder("swapType", CompiledGraphQL.b(AlternativeProductsType.f)).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        __typeTag = listR4;
        CompiledField compiledFieldG = d.g("title", customScalarType);
        ObjectType objectType2 = AlternativeProductsDisclaimer.f11019a;
        CompiledField.Builder builder4 = new CompiledField.Builder("disclaimer", objectType2);
        builder4.e = listR3;
        CompiledField compiledFieldC3 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("typeTag", AlternativeProductsTypeTag.f11027a);
        builder5.e = listR4;
        List<CompiledSelection> listR5 = CollectionsKt.R(compiledFieldG, compiledFieldC3, builder5.c());
        __sectionHeader = listR5;
        CompiledField compiledFieldC4 = new CompiledField.Builder("substitutionSource", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("products", a.f(objectType));
        builder6.e = listR2;
        CompiledField compiledFieldC5 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("sectionHeader", AlternativeProductsProductsHeader.f11024a);
        builder7.e = listR5;
        List<CompiledSelection> listR6 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, builder7.c());
        __onAlternativeProductsProductSection = listR6;
        List<CompiledSelection> listQ2 = CollectionsKt.Q(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        __onAlternativeProductsNoResultSection = listQ2;
        List<CompiledSelection> listR7 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("actionTerm", customScalarType));
        __onAlternativeProductsCtaSection = listR7;
        InsetBannerDisplayType.e.getClass();
        List<CompiledSelection> listR8 = CollectionsKt.R(new CompiledField.Builder("displayType", CompiledGraphQL.b(InsetBannerDisplayType.f)).c(), new CompiledField.Builder("title", customScalarType).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        __insetBanner = listR8;
        CompiledField.Builder builder8 = new CompiledField.Builder("insetBanner", InsetBanner.f11509a);
        builder8.e = listR8;
        List<CompiledSelection> listQ3 = CollectionsKt.Q(builder8.c());
        __onAlternativeProductsInsetBannerSection = listQ3;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder9 = new CompiledFragment.Builder("AlternativeProductsTargetProductSection", CollectionsKt.Q("AlternativeProductsTargetProductSection"));
        builder9.d = listQ;
        CompiledFragment compiledFragmentA = builder9.a();
        CompiledFragment.Builder builder10 = new CompiledFragment.Builder("AlternativeProductsProductSection", CollectionsKt.Q("AlternativeProductsProductSection"));
        builder10.d = listR6;
        CompiledFragment compiledFragmentA2 = builder10.a();
        CompiledFragment.Builder builder11 = new CompiledFragment.Builder("AlternativeProductsNoResultSection", CollectionsKt.Q("AlternativeProductsNoResultSection"));
        builder11.d = listQ2;
        CompiledFragment compiledFragmentA3 = builder11.a();
        CompiledFragment.Builder builder12 = new CompiledFragment.Builder("AlternativeProductsCtaSection", CollectionsKt.Q("AlternativeProductsCtaSection"));
        builder12.d = listR7;
        CompiledFragment compiledFragmentA4 = builder12.a();
        CompiledFragment.Builder builder13 = new CompiledFragment.Builder("AlternativeProductsInsetBannerSection", CollectionsKt.Q("AlternativeProductsInsetBannerSection"));
        builder13.d = listQ3;
        List<CompiledSelection> listR9 = CollectionsKt.R(compiledFieldC6, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, compiledFragmentA4, builder13.a());
        __sections = listR9;
        List<CompiledSelection> listR10 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("dismissCtaText", CompiledGraphQL.b(customScalarType)).c());
        __disclaimer1 = listR10;
        CompiledField.Builder builder14 = new CompiledField.Builder("sections", d.j(AlternativeProductsSections.f11025a));
        builder14.e = listR9;
        CompiledField compiledFieldC7 = builder14.c();
        CompiledField.Builder builder15 = new CompiledField.Builder("disclaimer", objectType2);
        builder15.e = listR10;
        List<CompiledSelection> listR11 = CollectionsKt.R(compiledFieldC7, builder15.c());
        __getAlternativeProducts = listR11;
        CompiledField.Builder builder16 = new CompiledField.Builder("getAlternativeProducts", GetAlternativeProductsResponse.f11432a);
        new CompiledArgument.Builder(Query.d);
        builder16.d = au.com.woolworths.android.onesite.a.v();
        builder16.e = listR11;
        __root = CollectionsKt.Q(builder16.c());
    }

    private AlternativeProductsQuerySelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
