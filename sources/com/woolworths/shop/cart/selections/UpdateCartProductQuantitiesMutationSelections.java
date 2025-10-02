package com.woolworths.shop.cart.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.foundation.shop.prompt.handler.fragment.selections.PromptsSelections;
import au.com.woolworths.shop.cart.data.common.fragment.selections.CartSelections;
import au.com.woolworths.shop.graphql.type.CartProductQuantitiesUpdatedResponse;
import au.com.woolworths.shop.graphql.type.CartProductQuantityAction;
import au.com.woolworths.shop.graphql.type.CartProductQuantityUpdated;
import au.com.woolworths.shop.graphql.type.CartResponse;
import au.com.woolworths.shop.graphql.type.ErrorUpdateCartProductQuantity;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.Prompt;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/selections/UpdateCartProductQuantitiesMutationSelections;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateCartProductQuantitiesMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21642a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;

    static {
        UpdateCartProductQuantityFailedReason.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("reason", CompiledGraphQL.b(UpdateCartProductQuantityFailedReason.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c());
        f21642a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("productId", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC3 = new CompiledField.Builder("updatedQuantity", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("success", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder = new CompiledField.Builder("error", ErrorUpdateCartProductQuantity.f11381a);
        builder.e = listR;
        CompiledField compiledFieldC5 = builder.c();
        CompiledField compiledFieldG = d.g("deltaQuantity", customScalarType2);
        CompiledField compiledFieldG2 = d.g("deltaSubtotal", customScalarType);
        CartProductQuantityAction.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldG, compiledFieldG2, new CompiledField.Builder("productQuantityAction", CartProductQuantityAction.f).c());
        b = listR2;
        CompiledField compiledFieldC6 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("CartResponse", CollectionsKt.Q("CartResponse"));
        builder2.b(CartSelections.R);
        List listR3 = CollectionsKt.R(compiledFieldC6, builder2.a());
        c = listR3;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("Prompt", CollectionsKt.R("BottomSheet", "PromptAlert", "ActionableSnackbar"));
        builder3.b(PromptsSelections.i);
        List listR4 = CollectionsKt.R(compiledFieldC7, builder3.a());
        d = listR4;
        CustomScalarType customScalarType3 = GraphQLInt.f11442a;
        CompiledField compiledFieldC8 = new CompiledField.Builder("productCount", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("totalProductCount", CompiledGraphQL.b(customScalarType3)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("updatedProductQuantities", a.f(CartProductQuantityUpdated.f11117a));
        builder4.e = listR2;
        CompiledField compiledFieldC10 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("cart", CompiledGraphQL.b(CartResponse.f11122a));
        builder5.e = listR3;
        CompiledField compiledFieldC11 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("errorPrompt", Prompt.f11803a);
        builder6.c = a.s("isPromptEnabled", false);
        builder6.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldC11, builder6.c());
        e = listR5;
        CompiledField.Builder builder7 = new CompiledField.Builder("updateCartProductQuantities", CompiledGraphQL.b(CartProductQuantitiesUpdatedResponse.f11113a));
        new CompiledArgument.Builder(Mutation.M);
        builder7.d = au.com.woolworths.android.onesite.a.v();
        builder7.e = listR5;
        f = CollectionsKt.Q(builder7.c());
    }
}
