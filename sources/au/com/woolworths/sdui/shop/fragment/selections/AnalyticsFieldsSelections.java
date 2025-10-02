package au.com.woolworths.sdui.shop.fragment.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AnalyticsExtraContent;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/selections/AnalyticsFieldsSelections;", "", "graphql-fragments-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnalyticsFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10080a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("key", CompiledGraphQL.b(customScalarType)).c(), d.g("value", customScalarType), new CompiledField.Builder("values", CompiledGraphQL.a(CompiledGraphQL.b(customScalarType))).c());
        f10080a = listR;
        CompiledField compiledFieldG = d.g("appSection", customScalarType);
        CompiledField compiledFieldG2 = d.g("screenName", customScalarType);
        CompiledField compiledFieldG3 = d.g("screenType", customScalarType);
        CompiledField compiledFieldG4 = d.g("eventAction", customScalarType);
        CompiledField compiledFieldG5 = d.g("eventCategory", customScalarType);
        CompiledField compiledFieldG6 = d.g("eventLabel", customScalarType);
        CompiledField compiledFieldG7 = d.g("eventValue", customScalarType);
        CompiledField compiledFieldG8 = d.g("eventDescription", customScalarType);
        CompiledField compiledFieldG9 = d.g("tealiumEvent", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("extraContent", CompiledGraphQL.a(CompiledGraphQL.b(AnalyticsExtraContent.f11029a)));
        builder.e = listR;
        b = CollectionsKt.R(compiledFieldG, compiledFieldG2, compiledFieldG3, compiledFieldG4, compiledFieldG5, compiledFieldG6, compiledFieldG7, compiledFieldG8, compiledFieldG9, builder.c());
    }
}
