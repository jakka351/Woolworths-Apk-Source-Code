package com.woolworths.shop.deliveryunlimited.payment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedIconItem;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeFooter;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribePayment;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeTerms;
import au.com.woolworths.shop.graphql.type.DeliveryUnlimitedSubscribeTermsItem;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.EnumType;
import com.apollographql.apollo.api.ObjectType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/deliveryunlimited/payment/selections/DeliveryUnlimitedSubscribePaymentQuerySelections;", "", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeliveryUnlimitedSubscribePaymentQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22606a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        f22606a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        EnumType enumType = ButtonStyle.f;
        CompiledField compiledFieldC2 = new CompiledField.Builder("style", enumType).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f11439a;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c());
        b = listR2;
        ObjectType objectType = Button.f11080a;
        CompiledField.Builder builder = new CompiledField.Builder("button", CompiledGraphQL.b(objectType));
        builder.e = listR2;
        List listR3 = CollectionsKt.R(builder.c(), new CompiledField.Builder("disclaimer", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        List listR4 = CollectionsKt.R(new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        d = listR4;
        CompiledField compiledFieldC3 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("links", a.f(DeliveryUnlimitedSubscribeLink.f11329a));
        builder2.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC3, builder2.c());
        e = listR5;
        List listR6 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), a.d("style", enumType), new CompiledField.Builder("enabled", CompiledGraphQL.b(customScalarType2)).c());
        f = listR6;
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("terms", a.f(DeliveryUnlimitedSubscribeTermsItem.f11340a));
        builder3.e = listR5;
        CompiledField compiledFieldC5 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("button", CompiledGraphQL.b(objectType));
        builder4.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC4, compiledFieldC5, builder4.c());
        g = listR7;
        CompiledField compiledFieldC6 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder(NotificationMessage.NOTIF_KEY_SUB_TITLE, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC8 = new CompiledField.Builder("priceDescription", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC9 = new CompiledField.Builder("priceLabel", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder("price", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField compiledFieldG = d.g(lqlqqlq.mmm006Dm006Dm, customScalarType);
        CompiledField.Builder builder5 = new CompiledField.Builder("iconItem", DeliveryUnlimitedIconItem.f11317a);
        builder5.e = listR;
        CompiledField compiledFieldC11 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("footer", CompiledGraphQL.b(DeliveryUnlimitedSubscribeFooter.f11328a));
        builder6.e = listR3;
        CompiledField compiledFieldC12 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("terms", CompiledGraphQL.b(DeliveryUnlimitedSubscribeTerms.f11339a));
        builder7.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldC6, compiledFieldC7, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldG, compiledFieldC11, compiledFieldC12, builder7.c());
        h = listR8;
        CompiledField.Builder builder8 = new CompiledField.Builder("deliveryUnlimitedSubscribePayment", CompiledGraphQL.b(DeliveryUnlimitedSubscribePayment.f11330a));
        new CompiledArgument.Builder(Query.l);
        builder8.d = au.com.woolworths.android.onesite.a.v();
        builder8.e = listR8;
        i = CollectionsKt.Q(builder8.c());
    }
}
