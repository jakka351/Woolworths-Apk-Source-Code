package com.woolworths.shop.cart.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.selections.ProductReviewResponseSelections;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.ProductReviewResult;
import au.com.woolworths.shop.graphql.type.UpdateProductReviewProductQuantitiesError;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/selections/UpdateProductReviewProductQuantitiesMutationSelections;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateProductReviewProductQuantitiesMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21644a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType)).c(), d.g("message", customScalarType));
        f21644a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("UpdateProductReviewProductQuantitiesError", CollectionsKt.Q("UpdateProductReviewProductQuantitiesError"));
        builder.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, builder.a());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("errors", CompiledGraphQL.a(CompiledGraphQL.b(UpdateProductReviewProductQuantitiesError.f11997a)));
        builder2.e = listR2;
        List listQ = CollectionsKt.Q(builder2.c());
        c = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("requiresProductReview", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        d = listQ2;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("ProductReviewResponse", CollectionsKt.Q("ProductReviewResponse"));
        builder3.b(ProductReviewResponseSelections.k);
        CompiledFragment compiledFragmentA = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("ProductReviewError", CollectionsKt.Q("ProductReviewError"));
        builder4.d = listQ;
        CompiledFragment compiledFragmentA2 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("ProductReviewEmpty", CollectionsKt.Q("ProductReviewEmpty"));
        builder5.d = listQ2;
        List listR3 = CollectionsKt.R(compiledFieldC2, compiledFragmentA, compiledFragmentA2, builder5.a());
        e = listR3;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("ProductReviewResult", CollectionsKt.R("ProductReviewResponse", "ProductReviewError", "ProductReviewEmpty"));
        builder6.d = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC3, builder6.a());
        f = listR4;
        CompiledField.Builder builder7 = new CompiledField.Builder("updateProductReviewProductQuantities", CompiledGraphQL.b(ProductReviewResult.f11780a));
        new CompiledArgument.Builder(Mutation.y);
        builder7.d = a.v();
        builder7.e = listR4;
        g = CollectionsKt.Q(builder7.c());
    }
}
