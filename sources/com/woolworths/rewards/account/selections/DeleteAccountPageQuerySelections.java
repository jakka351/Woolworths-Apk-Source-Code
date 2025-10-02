package com.woolworths.rewards.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.DeleteAccountPage;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/selections/DeleteAccountPageQuerySelections;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DeleteAccountPageQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20642a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f20642a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("navigationTitle", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("markdownDescription", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("primaryCta", CompiledGraphQL.b(ContentCta.f9485a));
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, builder.c(), new CompiledField.Builder("consentLabel", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("consentToken", CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("deleteAccountPage", DeleteAccountPage.f9495a);
        builder2.e = listR2;
        c = CollectionsKt.Q(builder2.c());
    }
}
