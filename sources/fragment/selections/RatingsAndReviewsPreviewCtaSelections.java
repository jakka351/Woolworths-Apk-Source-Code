package fragment.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.Button;
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

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfragment/selections/RatingsAndReviewsPreviewCtaSelections;", "", "ratingsandreviews-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RatingsAndReviewsPreviewCtaSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f23833a;
    public static final List b;
    public static final List c;

    static {
        ActionType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        f23833a = listR;
        CompiledField compiledFieldG = d.g("buttonId", customScalarType);
        CompiledField compiledFieldC2 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder = new CompiledField.Builder("buttonAction", Action.f10997a);
        builder.e = listR;
        List listR2 = CollectionsKt.R(compiledFieldG, compiledFieldC2, compiledFieldC3, builder.c(), d.g("iconUrl", customScalarType), d.g("altText", customScalarType));
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("button", CompiledGraphQL.b(Button.f11080a));
        builder2.e = listR2;
        c = CollectionsKt.Q(builder2.c());
    }
}
