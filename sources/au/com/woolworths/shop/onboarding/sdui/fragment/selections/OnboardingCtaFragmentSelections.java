package au.com.woolworths.shop.onboarding.sdui.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.Action;
import au.com.woolworths.shop.graphql.type.ActionType;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/onboarding/sdui/fragment/selections/OnboardingCtaFragmentSelections;", "", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OnboardingCtaFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12535a;
    public static final List b;
    public static final List c;

    static {
        ActionType.e.getClass();
        CompiledField compiledFieldC = new CompiledField.Builder("type", CompiledGraphQL.b(ActionType.f)).c();
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c(), d.g("id", customScalarType));
        f12535a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, customScalarType).c());
        b = listQ;
        CompiledField compiledFieldG = d.g("buttonId", customScalarType);
        CompiledField compiledFieldC2 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        ButtonStyle.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder("style", ButtonStyle.f).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("enabled", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField.Builder builder = new CompiledField.Builder("buttonAction", Action.f10997a);
        builder.e = listR;
        CompiledField compiledFieldC5 = builder.c();
        CompiledField compiledFieldG2 = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldG3 = d.g("altText", customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", ButtonAnalytics.f11081a);
        builder2.e = listQ;
        c = CollectionsKt.R(compiledFieldG, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldG2, compiledFieldG3, builder2.c());
    }
}
