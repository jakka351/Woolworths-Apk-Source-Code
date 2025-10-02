package com.woolworths.shop.modeselector.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ButtonAnalytics;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/modeselector/fragment/selections/ButtonFragmentSelections;", "", "mode-selector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23362a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, customScalarType).c());
        f23362a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("style", ButtonStyle.f).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldG = d.g(UrlHandler.ACTION, customScalarType);
        CompiledField compiledFieldG2 = d.g("url", customScalarType);
        CompiledField compiledFieldG3 = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldG4 = d.g("altText", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("analytics", ButtonAnalytics.f11081a);
        builder.e = listQ;
        b = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldG, compiledFieldG2, compiledFieldG3, compiledFieldG4, builder.c());
    }
}
