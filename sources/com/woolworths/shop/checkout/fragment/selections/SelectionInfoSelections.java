package com.woolworths.shop.checkout.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.FulfilmentWindowsFooterIcon;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/selections/SelectionInfoSelections;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionInfoSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f22543a;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("descriptionMd", GraphQLString.f11443a).c();
        FulfilmentWindowsFooterIcon.e.getClass();
        f22543a = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("iconType", CompiledGraphQL.b(FulfilmentWindowsFooterIcon.f)).c());
    }
}
