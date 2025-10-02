package com.woolworths.product.list.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.TealiumAnalytics;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CompiledSelection;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/woolworths/product/list/fragment/selections/ActionableCardSelections;", "", "<init>", "()V", "__root", "", "Lcom/apollographql/apollo/api/CompiledSelection;", "get__root", "()Ljava/util/List;", "product-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ActionableCardSelections {
    public static final int $stable;

    @NotNull
    public static final ActionableCardSelections INSTANCE = new ActionableCardSelections();

    @NotNull
    private static final List<CompiledSelection> __root;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("image", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c();
        CardHeight.e.getClass();
        __root = CollectionsKt.R(compiledFieldC, compiledFieldC2, new CompiledField.Builder("cardHeight", CompiledGraphQL.b(CardHeight.f)).c(), new CompiledField.Builder("link", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("analytics", TealiumAnalytics.f11963a).c());
        $stable = 8;
    }

    private ActionableCardSelections() {
    }

    @NotNull
    public final List<CompiledSelection> get__root() {
        return __root;
    }
}
