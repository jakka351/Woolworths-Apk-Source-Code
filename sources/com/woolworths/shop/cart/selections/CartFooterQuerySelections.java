package com.woolworths.shop.cart.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CartFooter;
import au.com.woolworths.shop.graphql.type.CartResponse;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/selections/CartFooterQuerySelections;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CartFooterQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21635a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g(UrlHandler.ACTION, customScalarType);
        ButtonStyle.e.getClass();
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldG, new CompiledField.Builder("style", ButtonStyle.f).c(), new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
        f21635a = listR;
        CompiledField.Builder builder = new CompiledField.Builder("button", CompiledGraphQL.b(Button.f11080a));
        builder.e = listR;
        CompiledField compiledFieldC2 = builder.c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("totalLabel", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("totalAmount", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG2 = d.g("totalDescription", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("panelMarkdown", customScalarType);
        builder2.c = a.s("isPanelMarkdownEnabled", false);
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldG2, builder2.c(), d.g("savings", customScalarType));
        b = listR2;
        CompiledField.Builder builder3 = new CompiledField.Builder("footer", CompiledGraphQL.b(CartFooter.f11105a));
        builder3.e = listR2;
        List listQ = CollectionsKt.Q(builder3.c());
        c = listQ;
        CompiledField.Builder builder4 = new CompiledField.Builder("cart", CompiledGraphQL.b(CartResponse.f11122a));
        builder4.e = listQ;
        d = CollectionsKt.Q(builder4.c());
    }
}
