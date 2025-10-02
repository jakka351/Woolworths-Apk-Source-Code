package com.woolworths.rewards.account.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.Mutation;
import au.com.woolworths.rewards.graphql.type.PreferenceDetails;
import au.com.woolworths.rewards.graphql.type.PreferenceDetailsAnalytics;
import au.com.woolworths.rewards.graphql.type.PreferenceDetailsItem;
import au.com.woolworths.rewards.graphql.type.PreferenceToggle;
import au.com.woolworths.rewards.graphql.type.RewardsWebLink;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/account/selections/PreferenceUpdateMutationSelections;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreferenceUpdateMutationSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f20644a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;
    public static final List i;
    public static final List j;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listR = CollectionsKt.R(new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType), d.g("imageUrl", customScalarType), d.g("body", customScalarType));
        f20644a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        b = listQ;
        CompiledField compiledFieldC = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldC2 = new CompiledField.Builder("value", CompiledGraphQL.b(GraphQLBoolean.f9613a)).c();
        CompiledField compiledFieldC3 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f9615a)).c();
        CompiledField compiledFieldG2 = d.g("altText", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("analytics", CompiledGraphQL.b(PreferenceDetailsAnalytics.f9745a));
        builder.e = listQ;
        List listR2 = CollectionsKt.R(compiledFieldC, compiledFieldG, compiledFieldC2, compiledFieldC3, compiledFieldG2, builder.c(), d.g("iconUrl", customScalarType));
        c = listR2;
        CompiledField compiledFieldG3 = d.g("groupTitle", customScalarType);
        CompiledField compiledFieldG4 = d.g(lqlqqlq.mmm006Dm006Dm, customScalarType);
        CompiledField.Builder builder2 = new CompiledField.Builder("toggles", CompiledGraphQL.a(PreferenceToggle.f9751a));
        builder2.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldG3, compiledFieldG4, builder2.c());
        d = listR3;
        List listR4 = CollectionsKt.R(d.g("body", customScalarType), d.g("altText", customScalarType));
        e = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("url", CompiledGraphQL.b(customScalarType)).c());
        f = listR5;
        CompiledField compiledFieldG5 = d.g("body", customScalarType);
        CompiledField.Builder builder3 = new CompiledField.Builder("button", RewardsWebLink.f9878a);
        builder3.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldG5, builder3.c());
        g = listR6;
        CompiledField compiledFieldC4 = new CompiledField.Builder("__typename", CompiledGraphQL.b(customScalarType)).c();
        CompiledFragment.Builder builder4 = new CompiledFragment.Builder("PreferenceDetailsHeader", CollectionsKt.Q("PreferenceDetailsHeader"));
        builder4.d = listR;
        CompiledFragment compiledFragmentA = builder4.a();
        CompiledFragment.Builder builder5 = new CompiledFragment.Builder("PreferenceDetailsToggleGroup", CollectionsKt.Q("PreferenceDetailsToggleGroup"));
        builder5.d = listR3;
        CompiledFragment compiledFragmentA2 = builder5.a();
        CompiledFragment.Builder builder6 = new CompiledFragment.Builder("PreferenceDetailsText", CollectionsKt.Q("PreferenceDetailsText"));
        builder6.d = listR4;
        CompiledFragment compiledFragmentA3 = builder6.a();
        CompiledFragment.Builder builder7 = new CompiledFragment.Builder("PreferenceDetailsFooter", CollectionsKt.Q("PreferenceDetailsFooter"));
        builder7.d = listR6;
        List listR7 = CollectionsKt.R(compiledFieldC4, compiledFragmentA, compiledFragmentA2, compiledFragmentA3, builder7.a());
        h = listR7;
        CompiledField compiledFieldG6 = d.g("title", customScalarType);
        CompiledField.Builder builder8 = new CompiledField.Builder(ErrorBundle.DETAIL_ENTRY, CompiledGraphQL.a(PreferenceDetailsItem.f9748a));
        builder8.e = listR7;
        List listR8 = CollectionsKt.R(compiledFieldG6, builder8.c(), d.g("message", customScalarType));
        i = listR8;
        CompiledField.Builder builder9 = new CompiledField.Builder("updatePreference", PreferenceDetails.f9744a);
        new CompiledArgument.Builder(Mutation.t);
        CompiledArgument compiledArgument = new CompiledArgument();
        new CompiledArgument.Builder(Mutation.u);
        builder9.d = CollectionsKt.R(compiledArgument, new CompiledArgument());
        builder9.e = listR8;
        j = CollectionsKt.Q(builder9.c());
    }
}
