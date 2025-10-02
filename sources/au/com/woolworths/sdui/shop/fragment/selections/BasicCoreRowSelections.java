package au.com.woolworths.sdui.shop.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CoreRowUI;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/selections/BasicCoreRowSelections;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicCoreRowSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10081a;
    public static final List b;
    public static final List c;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("CoreRowUI", CollectionsKt.Q("CoreRowUI"));
        builder.b(CoreRowUISelections.g);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f10081a = listR;
        ActionType.e.getClass();
        List listR2 = CollectionsKt.R(new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c(), new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c());
        b = listR2;
        CompiledField.Builder builder2 = new CompiledField.Builder("row", CompiledGraphQL.b(CoreRowUI.f11293a));
        builder2.e = listR;
        CompiledField compiledFieldC2 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(Action.f10997a));
        builder3.e = listR2;
        c = CollectionsKt.R(compiledFieldC2, builder3.c());
    }

    public static List a() {
        return c;
    }
}
