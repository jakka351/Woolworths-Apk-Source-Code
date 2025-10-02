package com.woolworths.shop.homepage.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.DismissBottomSheetResultSuccess;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.Mutation;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/selections/DismissBottomSheetMutationSelections;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DismissBottomSheetMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23221a;
    public static final List b;

    static {
        List listQ = CollectionsKt.Q(new CompiledField.Builder("_", GraphQLBoolean.f11439a).c());
        f23221a = listQ;
        CompiledField.Builder builder = new CompiledField.Builder("dismissBottomSheet", DismissBottomSheetResultSuccess.f11347a);
        new CompiledArgument.Builder(Mutation.B);
        builder.d = a.v();
        builder.e = listQ;
        b = CollectionsKt.Q(builder.c());
    }
}
