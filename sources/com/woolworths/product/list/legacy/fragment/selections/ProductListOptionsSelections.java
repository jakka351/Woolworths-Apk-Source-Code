package com.woolworths.product.list.legacy.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.FilterMenuItem;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.InsetBanner;
import au.com.woolworths.shop.graphql.type.ProductFilter;
import au.com.woolworths.shop.graphql.type.ProductSortOption;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/selections/ProductListOptionsSelections;", "", "<init>", "()V", "__filterItems", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__banner", "__filters", "__sortOptions", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductListOptionsSelections {
    public static final int $stable;

    @NotNull
    public static final ProductListOptionsSelections INSTANCE = new ProductListOptionsSelections();

    @NotNull
    private static final List<CompiledSelection> __banner;

    @NotNull
    private static final List<CompiledSelection> __filterItems;

    @NotNull
    private static final List<CompiledSelection> __filters;

    @NotNull
    private static final List<CompiledSelection> __root;

    @NotNull
    private static final List<CompiledSelection> __sortOptions;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("parentKey", customScalarType);
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldG, new CompiledField.Builder("hasChildren", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType2)).c());
        __filterItems = listR;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("InsetBanner", CollectionsKt.Q("InsetBanner"));
        builder.b(InsetBannerSelections.INSTANCE.get__root());
        List<CompiledSelection> listR2 = CollectionsKt.R(compiledFieldC4, builder.a());
        __banner = listR2;
        CompiledField compiledFieldC5 = new CompiledField.Builder("headerKey", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("headerTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("filterItems", a.f(FilterMenuItem.f11386a));
        builder2.e = listR;
        CompiledField compiledFieldC7 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("banner", InsetBanner.f11509a);
        builder3.e = listR2;
        List<CompiledSelection> listR3 = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, builder3.c());
        __filters = listR3;
        List<CompiledSelection> listR4 = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), new CompiledField.Builder("isApplied", CompiledGraphQL.b(customScalarType2)).c());
        __sortOptions = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder("filters", a.f(ProductFilter.f11739a));
        builder4.e = listR3;
        CompiledField compiledFieldC8 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("sortOptions", a.f(ProductSortOption.f11786a));
        builder5.e = listR4;
        __root = CollectionsKt.R(compiledFieldC8, builder5.c());
        $stable = 8;
    }

    private ProductListOptionsSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
