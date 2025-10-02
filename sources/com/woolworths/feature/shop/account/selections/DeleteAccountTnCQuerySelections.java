package com.woolworths.feature.shop.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.Button;
import au.com.woolworths.shop.graphql.type.DeleteAccountTnCResponse;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/selections/DeleteAccountTnCQuerySelections;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeleteAccountTnCQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f19391a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        f19391a = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("termsAndConditions", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("termsAndConditionsAgreeText", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("deleteButton", CompiledGraphQL.b(Button.f11080a));
        builder.e = listQ;
        List listR = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, builder.c());
        b = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("deleteAccountTnC", DeleteAccountTnCResponse.f11309a);
        builder2.e = listR;
        c = CollectionsKt.Q(builder2.c());
    }
}
