package au.com.woolworths.foundation.force.upgrade.shop.selections;

import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AppConfig;
import au.com.woolworths.shop.graphql.type.AppConfigAlert;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Query;
import au.com.woolworths.shop.graphql.type.UpgradeType;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/force/upgrade/shop/selections/AppConfigQuerySelections;", "", "force-upgrade-data-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppConfigQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8527a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("primaryActionLabel", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("secondaryActionLabel", CompiledGraphQL.b(customScalarType)).c());
        f8527a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("primaryActionLabel", CompiledGraphQL.b(customScalarType)).c(), d.g("rewardsCardActionLabel", customScalarType));
        b = listR2;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("AppConfigSoftAlert", CollectionsKt.Q("AppConfigSoftAlert"));
        builder.d = listR;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("AppConfigForcedAlert", CollectionsKt.Q("AppConfigForcedAlert"));
        builder2.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
        c = listR3;
        UpgradeType.e.getClass();
        CompiledField compiledFieldC2 = new CompiledField.Builder("upgradeType", CompiledGraphQL.b(UpgradeType.f)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("isForcedUpgrade", GraphQLBoolean.f11439a).c();
        CompiledField.Builder builder3 = new CompiledField.Builder("alert", AppConfigAlert.f11031a);
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, builder3.c(), new CompiledField.Builder("bff", CompiledGraphQL.b(customScalarType)).c());
        d = listR4;
        CompiledField.Builder builder4 = new CompiledField.Builder(MlModel.MODEL_FILE_SUFFIX, CompiledGraphQL.b(AppConfig.f11030a));
        new CompiledArgument.Builder(Query.e);
        builder4.d = a.v();
        builder4.e = listR4;
        e = CollectionsKt.Q(builder4.c());
    }
}
