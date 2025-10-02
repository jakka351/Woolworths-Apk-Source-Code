package au.com.woolworths.feature.shop.notification.preferences.selections;

import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.GraphQLBoolean;
import au.com.woolworths.shop.graphql.type.GraphQLID;
import au.com.woolworths.shop.graphql.type.GraphQLString;
import au.com.woolworths.shop.graphql.type.Mutation;
import au.com.woolworths.shop.graphql.type.PreferenceAnalytics;
import au.com.woolworths.shop.graphql.type.PreferenceItem;
import au.com.woolworths.shop.graphql.type.PreferenceToggle;
import au.com.woolworths.shop.graphql.type.Preferences;
import au.com.woolworths.shop.graphql.type.PreviewContent;
import au.com.woolworths.shop.graphql.type.PreviewImageItem;
import com.apollographql.apollo.api.CompiledArgument;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/selections/UpdatePreferencesMutationSelections;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdatePreferencesMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f7947a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;

    static {
        CustomScalarType customScalarType = GraphQLString.f11443a;
        List listR = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("body", CompiledGraphQL.b(customScalarType)).c(), d.g("altText", customScalarType));
        f7947a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        b = listQ;
        List listR2 = CollectionsKt.R(new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("imageUrl", CompiledGraphQL.b(customScalarType)).c(), d.g("altText", customScalarType));
        c = listR2;
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g("badge", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("entries", a.f(PreviewImageItem.f11714a));
        builder.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC, compiledFieldG, builder.c(), d.g("footer", customScalarType));
        d = listR3;
        CompiledField compiledFieldC2 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG2 = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldC4 = new CompiledField.Builder("value", CompiledGraphQL.b(GraphQLBoolean.f11439a)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f11441a)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("analytics", CompiledGraphQL.b(PreferenceAnalytics.f11707a));
        builder2.e = listQ;
        CompiledField compiledFieldC6 = builder2.c();
        CompiledField compiledFieldG3 = d.g("iconUrl", customScalarType);
        CompiledField compiledFieldG4 = d.g("altText", customScalarType);
        CompiledField.Builder builder3 = new CompiledField.Builder("preview", PreviewContent.f11713a);
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldG2, compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldG3, compiledFieldG4, builder3.c(), d.g("footer", customScalarType));
        e = listR4;
        CompiledField compiledFieldC7 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG5 = d.g("groupTitle", customScalarType);
        CompiledField compiledFieldG6 = d.g(lqlqqlq.mmm006Dm006Dm, customScalarType);
        CompiledField.Builder builder4 = new CompiledField.Builder("toggles", a.f(PreferenceToggle.f11710a));
        builder4.e = listR4;
        List listR5 = CollectionsKt.R(compiledFieldC7, compiledFieldG5, compiledFieldG6, builder4.c());
        f = listR5;
        CompiledField compiledFieldC8 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("PreferenceText", CollectionsKt.Q("PreferenceText"));
        builder5.d = listR;
        CompiledFragment compiledFragmentA = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("PreferenceToggleGroup", CollectionsKt.Q("PreferenceToggleGroup"));
        builder6.d = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC8, compiledFragmentA, builder6.a());
        g = listR6;
        CompiledField compiledFieldC9 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG7 = d.g("title", customScalarType);
        CompiledField.Builder builder7 = new CompiledField.Builder(ErrorBundle.DETAIL_ENTRY, d.j(PreferenceItem.f11708a));
        builder7.e = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC9, compiledFieldG7, builder7.c());
        h = listR7;
        CompiledField.Builder builder8 = new CompiledField.Builder("updatePreference", Preferences.f11712a);
        new CompiledArgument.Builder(Mutation.u);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.w);
        CompiledArgument compiledArgument2 = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.v);
        builder8.d = CollectionsKt.R(compiledArgument, compiledArgument2, new CompiledArgument());
        builder8.e = listR7;
        i = CollectionsKt.Q(builder8.c());
    }
}
