package com.woolworths.product.list.legacy.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.selections.AnalyticsFieldsSelections;
import au.com.woolworths.shop.graphql.type.Analytics;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/woolworths/product/list/legacy/fragment/selections/VideoAdBottomSheetSelections;", "", "<init>", "()V", "__impressionAnalytics", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "__root", "get__root", "()Ljava/util/List;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class VideoAdBottomSheetSelections {
    public static final int $stable;

    @NotNull
    public static final VideoAdBottomSheetSelections INSTANCE = new VideoAdBottomSheetSelections();

    @NotNull
    private static final List<CompiledSelection> __impressionAnalytics;

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("Analytics", CollectionsKt.Q("Analytics"));
        builder.b(AnalyticsFieldsSelections.b);
        List<CompiledSelection> listR = CollectionsKt.R(compiledFieldC, builder.a());
        __impressionAnalytics = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("contentMarkdown", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("buttonText", customScalarType);
        CompiledField compiledFieldC5 = new CompiledField.Builder("accessibilityText", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("impressionAnalytics", Analytics.f11028a);
        builder2.e = listR;
        __root = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldG, compiledFieldC5, builder2.c());
        $stable = 8;
    }

    private VideoAdBottomSheetSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
