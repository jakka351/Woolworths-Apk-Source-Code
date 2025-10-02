package com.woolworths.feature.shop.contentpage.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.CoreButtonStyle;
import au.com.woolworths.shop.graphql.type.CoreIcon;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/selections/CoreButtonFieldsSelections;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoreButtonFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19786a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CoreIcon", CollectionsKt.Q("CoreIcon"));
        List list = CoreIconFieldsSelections.f19787a;
        builder.b(list);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f19786a = listR;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("CoreIcon", CollectionsKt.Q("CoreIcon"));
        builder2.d = list;
        List listR2 = CollectionsKt.R(compiledFieldC2, builder2.a());
        b = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("Action", CollectionsKt.Q("Action"));
        builder3.b(ActionFieldsSelections.b);
        List listR3 = CollectionsKt.R(compiledFieldC3, builder3.a());
        c = listR3;
        CoreButtonStyle.e.getClass();
        CompiledField compiledFieldC4 = new CompiledField.Builder("coreButtonStyle", CompiledGraphQL.b(CoreButtonStyle.f)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("coreButtonLabel", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = CoreIcon.f11290a;
        CompiledField.Builder builder4 = new CompiledField.Builder("coreButtonLeadingIcon", objectType);
        builder4.e = listR;
        CompiledField compiledFieldC6 = builder4.c();
        CompiledField.Builder builder5 = new CompiledField.Builder("coreButtonTrailingIcon", objectType);
        builder5.e = listR2;
        CompiledField compiledFieldC7 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("coreButtonAction", CompiledGraphQL.b(Action.f10997a));
        builder6.e = listR3;
        d = CollectionsKt.R(compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldC7, builder6.c(), new CompiledField.Builder("coreButtonEnabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c());
    }

    public static List a() {
        return d;
    }
}
