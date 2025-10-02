package au.com.woolworths.feature.rewards.everydayextras.signup.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.AlertDialogAnalytics;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.apollographql.apollo.api.ObjectType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/selections/SubscribeAlertDialogFragmentSelections;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SubscribeAlertDialogFragmentSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f6206a;
    public static final List b;
    public static final List c;
    public static final List d;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        f6206a = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        b = listR2;
        List listR3 = CollectionsKt.R(new CompiledField.Builder("eventCategory", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("eventDescription", CompiledGraphQL.b(customScalarType)).c());
        c = listR3;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC2 = new CompiledField.Builder("resetPaymentForm", GraphQLBoolean.f9613a).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c();
        ObjectType objectType = ContentCta.f9485a;
        CompiledField.Builder builder = new CompiledField.Builder("primaryCta", CompiledGraphQL.b(objectType));
        builder.e = listR;
        CompiledField compiledFieldC5 = builder.c();
        CompiledField.Builder builder2 = new CompiledField.Builder("secondaryCta", objectType);
        builder2.e = listR2;
        CompiledField compiledFieldC6 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("analytics", AlertDialogAnalytics.f9419a);
        builder3.e = listR3;
        d = CollectionsKt.R(compiledFieldC, compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, builder3.c());
    }
}
