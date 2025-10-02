package au.com.woolworths.feature.product.list.v2.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/fragment/selections/VideoAdBottomSheetSelections;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VideoAdBottomSheetSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5639a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder.b(AnalyticsFieldsSelections.b);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f5639a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("contentMarkdown", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("buttonText", customScalarType);
        CompiledField compiledFieldC5 = new CompiledField.Builder("accessibilityText", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("impressionAnalytics", Analytics.f11028a);
        builder2.e = listR;
        b = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldG, compiledFieldC5, builder2.c());
    }
}
