package au.com.woolworths.feature.rewards.everydayextras.signup.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.EverydayExtraFinalGlance;
import au.com.woolworths.rewards.graphql.type.EverydayExtraFinalGlanceItem;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Query;
import au.com.woolworths.rewards.graphql.type.TimelineBreakdownItem;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/selections/EverydayExtrasFinalGlanceQuerySelections;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtrasFinalGlanceQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6214a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        f6214a = listQ;
        List listR = CollectionsKt.R(d.g("title", customScalarType), d.g(lqlqqlq.mmm006Dm006Dm, customScalarType), new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("altText", CompiledGraphQL.b(customScalarType)).c());
        b = listR;
        CompiledField.Builder builder = new CompiledField.Builder("items", a.f(TimelineBreakdownItem.f9927a));
        builder.e = listR;
        List listQ2 = CollectionsKt.Q(builder.c());
        c = listQ2;
        List listQ3 = CollectionsKt.Q(new CompiledField.Builder("content", CompiledGraphQL.b(customScalarType)).c());
        d = listQ3;
        CompiledField compiledFieldC = new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder(UrlHandler.ACTION, CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("actionUrl", customScalarType);
        EverydayExtraButtonStyle.e.getClass();
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldG, new CompiledField.Builder("style", EverydayExtraButtonStyle.f).c());
        e = listR2;
        CompiledField compiledFieldC3 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder2 = new CompiledFragment.Builder("TitleTextItem", CollectionsKt.Q("TitleTextItem"));
        builder2.d = listQ;
        CompiledFragment compiledFragmentA = builder2.a();
        CompiledFragment.Builder builder3 = new CompiledFragment.Builder("TimelineBreakdown", CollectionsKt.Q("TimelineBreakdown"));
        builder3.d = listQ2;
        CompiledFragment compiledFragmentA2 = builder3.a();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("NoteTextItem", CollectionsKt.Q("NoteTextItem"));
        builder4.d = listQ3;
        CompiledFragment compiledFragmentA3 = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("EverydayExtraButton", CollectionsKt.Q("EverydayExtraButton"));
        builder5.d = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC3, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, builder5.a());
        f = listR3;
        CompiledField.Builder builder6 = new CompiledField.Builder("feed", d.j(EverydayExtraFinalGlanceItem.f9535a));
        builder6.e = listR3;
        List listQ4 = CollectionsKt.Q(builder6.c());
        g = listQ4;
        CompiledField.Builder builder7 = new CompiledField.Builder("everydayExtraFinalGlance", EverydayExtraFinalGlance.f9534a);
        new CompiledArgument.Builder(Query.e);
        builder7.d = au.com.woolworths.android.onesite.a.v();
        builder7.e = listQ4;
        h = CollectionsKt.Q(builder7.c());
    }
}
