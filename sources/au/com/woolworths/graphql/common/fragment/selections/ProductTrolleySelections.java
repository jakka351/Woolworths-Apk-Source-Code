package au.com.woolworths.graphql.common.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLFloat;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/selections/ProductTrolleySelections;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductTrolleySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f9029a;

    static {
        CustomScalarType customScalarType = GraphQLFloat.f11440a;
        CompiledField compiledFieldC = new CompiledField.Builder("minimum", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("maximum", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("increment", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("default", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLString.f11443a;
        f9029a = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, new CompiledField.Builder("unit", customScalarType2).c(), d.g("inTrolley", customScalarType), new CompiledField.Builder("buttonState", CompiledGraphQL.b(customScalarType2)).c(), new CompiledField.Builder("buttonLabel", CompiledGraphQL.b(customScalarType2)).c(), d.g("buttonQuantity", customScalarType2), d.g("title", customScalarType2));
    }
}
