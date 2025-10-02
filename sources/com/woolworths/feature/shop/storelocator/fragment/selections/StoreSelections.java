package com.woolworths.feature.shop.storelocator.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLInt;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.PickupOption;
import au.com.woolworths.shop.graphql.type.PickupType;
import au.com.woolworths.shop.graphql.type.ShoppingModeId;
import au.com.woolworths.shop.graphql.type.TradingHour;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.storage.db.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/storelocator/fragment/selections/StoreSelections;", "", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20350a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("dayLabel", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("hoursLabel", CompiledGraphQL.b(customScalarType)).c());
        f20350a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("addressId", CompiledGraphQL.b(GraphQLInt.f11442a)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("shoppingModeId", CompiledGraphQL.b(customScalarType)).c();
        PickupOption.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("type", CompiledGraphQL.b(PickupOption.f)).c(), new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder(TextBundle.TEXT_ENTRY, CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("id", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder(AppMeasurementSdk.ConditionalUserProperty.NAME, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder("address", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC7 = new CompiledField.Builder("facilities", a.e(customScalarType)).c();
        CompiledField compiledFieldG = d.g("phone", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("instoreTradingHours", a.f(TradingHour.f11975a));
        builder.e = listR;
        CompiledField compiledFieldC8 = builder.c();
        CustomScalarType customScalarType2 = GraphQLFloat.f11440a;
        CompiledField compiledFieldC9 = new CompiledField.Builder(h.a.b, CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC10 = new CompiledField.Builder(h.a.c, CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldG2 = d.g("distanceInKm", customScalarType2);
        ShoppingModeId.e.getClass();
        CompiledField compiledFieldC11 = new CompiledField.Builder("supportedShoppingModes", CompiledGraphQL.b(CompiledGraphQL.a(CompiledGraphQL.b(ShoppingModeId.f)))).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("pickupTypes", a.f(PickupType.f11700a));
        builder2.e = listR2;
        c = CollectionsKt.R(compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldG, compiledFieldC8, compiledFieldC9, compiledFieldC10, compiledFieldG2, compiledFieldC11, builder2.c());
    }
}
