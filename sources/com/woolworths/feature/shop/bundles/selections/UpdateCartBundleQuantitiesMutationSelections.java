package com.woolworths.feature.shop.bundles.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.BundleQuantityStepper;
import au.com.woolworths.shop.graphql.type.CartBundleQuantitiesUpdatedResponse;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.CartProductQuantityUpdated;
import au.com.woolworths.shop.graphql.type.ErrorUpdateCartProductQuantity;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.UpdateCartProductQuantityFailedReason;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/bundles/selections/UpdateCartBundleQuantitiesMutationSelections;", "", "bundles_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateCartBundleQuantitiesMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19503a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        CustomScalarType customScalarType = GraphQLInt.f11442a;
        CompiledField compiledFieldC = new CompiledField.Builder("minimum", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("maximum", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("increment", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("inCart", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("addToCartLabel", CompiledGraphQL.b(customScalarType2)).c(), d.g("maximumReachedLabel", customScalarType2), new CompiledField.Builder("offerId", CompiledGraphQL.b(customScalarType2)).c());
        f19503a = listR;
        CompiledField compiledFieldC5 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType2)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("BundleQuantityStepper", CollectionsKt.Q("BundleQuantityStepper"));
        builder.d = listR;
        List listR2 = CollectionsKt.R(compiledFieldC5, builder.a());
        b = listR2;
        UpdateCartProductQuantityFailedReason.e.getClass();
        List listR3 = CollectionsKt.R(new CompiledField.Builder("reason", CompiledGraphQL.b(UpdateCartProductQuantityFailedReason.f)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType2)).c());
        c = listR3;
        CompiledField compiledFieldC6 = new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType2)).c();
        CustomScalarType customScalarType3 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC7 = new CompiledField.Builder("updatedQuantity", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("error", ErrorUpdateCartProductQuantity.f11381a);
        builder2.e = listR3;
        CompiledField compiledFieldC9 = builder2.c();
        CompiledField compiledFieldG = d.g("deltaQuantity", customScalarType3);
        CompiledField compiledFieldG2 = d.g("deltaSubtotal", customScalarType2);
        CartProductQuantityAction.e.getClass();
        List listR4 = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldG, compiledFieldG2, new CompiledField.Builder("productQuantityAction", CartProductQuantityAction.f).c());
        d = listR4;
        CompiledField compiledFieldC10 = new CompiledField.Builder("productCount", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC11 = new CompiledField.Builder("totalProductCount", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("updatedBundleQuantitySelector", CompiledGraphQL.b(BundleQuantityStepper.f11069a));
        builder3.e = listR2;
        CompiledField compiledFieldC12 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("updatedProductQuantities", a.f(CartProductQuantityUpdated.f11117a));
        builder4.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC10, compiledFieldC11, compiledFieldC12, builder4.c());
        e = listR5;
        CompiledField.Builder builder5 = new CompiledField.Builder("updateCartBundleQuantities", CompiledGraphQL.b(CartBundleQuantitiesUpdatedResponse.f11103a));
        new CompiledArgument.Builder(Mutation.L);
        builder5.d = au.com.woolworths.android.onesite.a.v();
        builder5.e = listR5;
        f = CollectionsKt.Q(builder5.c());
    }
}
