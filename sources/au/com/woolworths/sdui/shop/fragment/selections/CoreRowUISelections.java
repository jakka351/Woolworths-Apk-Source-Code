package au.com.woolworths.sdui.shop.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.IconAsset;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.UnionType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/shop/fragment/selections/CoreRowUISelections;", "", "shop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreRowUISelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f10083a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        f10083a = listQ;
        List listQ2 = CollectionsKt.Q(new CompiledField.Builder("coreIconName", CompiledGraphQL.b(customScalarType)).c());
        b = listQ2;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder.d = listQ;
        CompiledFragment compiledFragmentA = builder.a();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("CoreIcon", CollectionsKt.Q("CoreIcon"));
        builder2.d = listQ2;
        List listR = CollectionsKt.R(compiledFieldC, compiledFragmentA, builder2.a());
        c = listR;
        List listQ3 = CollectionsKt.Q(new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        d = listQ3;
        List listQ4 = CollectionsKt.Q(new CompiledField.Builder("coreIconName", CompiledGraphQL.b(customScalarType)).c());
        e = listQ4;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("HostedIcon", CollectionsKt.Q("HostedIcon"));
        builder3.d = listQ3;
        CompiledFragment compiledFragmentA2 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("CoreIcon", CollectionsKt.Q("CoreIcon"));
        builder4.d = listQ4;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFragmentA2, builder4.a());
        f = listR2;
        CompiledField compiledFieldG = d.g("overlineText", customScalarType);
        UnionType unionType = IconAsset.f11477a;
        CompiledField.Builder builder5 = new CompiledField.Builder("leadingAsset", unionType);
        builder5.e = listR;
        CompiledField compiledFieldC3 = builder5.c();
        CompiledField compiledFieldG2 = d.g(lqlqqlq.mmm006Dm006Dm, customScalarType);
        CompiledField compiledFieldC4 = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder6 = new CompiledField.Builder("trailingAsset", unionType);
        builder6.e = listR2;
        CompiledField compiledFieldC5 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("trailingText", customScalarType);
        builder7.c = a.s("isEverydayMarketPdpUpliftEnabled", false);
        g = CollectionsKt.R(compiledFieldG, compiledFieldC3, compiledFieldG2, compiledFieldC4, compiledFieldC5, builder7.c());
    }

    public static List a() {
        return g;
    }
}
