package au.com.woolworths.foundation.appcomms.inbox.datasource.shop.fragment.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.NCCta;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/appcomms/inbox/datasource/shop/fragment/selections/NotificationMessageSelections;", "", "inbox-datasource-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationMessageSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8471a;
    public static final List b;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        f8471a = listR;
        CompiledField compiledFieldC = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("campaignCode", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("campaignVariant", customScalarType);
        CompiledField compiledFieldG2 = d.g("title", customScalarType);
        CompiledField compiledFieldG3 = d.g("body", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("cta", NCCta.f11613a);
        builder.e = listR;
        b = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldG, compiledFieldG2, compiledFieldG3, builder.c(), new CompiledField.Builder("createdOn", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("ttl", CompiledGraphQL.b(customScalarType)).c());
    }
}
