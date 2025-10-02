package com.woolworths.rewards.redemptionsettings.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.BulletedListItem;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLID;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.PreferenceDetailsAnalytics;
import au.com.woolworths.rewards.graphql.type.PreferenceToggle;
import au.com.woolworths.rewards.graphql.type.RewardsSecurePreferenceLoadingState;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/selections/RewardsSecurePreferenceFieldsSelections;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RewardsSecurePreferenceFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21126a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        CompiledField compiledFieldC = new CompiledField.Builder("bulletText", CompiledGraphQL.b(customScalarType)).c();
        CustomScalarType customScalarType2 = GraphQLBoolean.f9613a;
        List listR = CollectionsKt.R(compiledFieldC, new CompiledField.Builder("isEmoji", customScalarType2).c(), d.g("itemTitle", customScalarType), d.g("markdownDescription", customScalarType));
        f21126a = listR;
        List listQ = CollectionsKt.Q(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c());
        b = listQ;
        CompiledField compiledFieldC2 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldG = d.g(NotificationMessage.NOTIF_KEY_SUB_TITLE, customScalarType);
        CompiledField compiledFieldC3 = new CompiledField.Builder("value", CompiledGraphQL.b(customScalarType2)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("id", CompiledGraphQL.b(GraphQLID.f9615a)).c();
        CompiledField compiledFieldG2 = d.g("altText", customScalarType);
        CompiledField.Builder builder = new CompiledField.Builder("analytics", CompiledGraphQL.b(PreferenceDetailsAnalytics.f9745a));
        builder.e = listQ;
        List listR2 = CollectionsKt.R(compiledFieldC2, compiledFieldG, compiledFieldC3, compiledFieldC4, compiledFieldG2, builder.c(), d.g("iconUrl", customScalarType));
        c = listR2;
        List listR3 = CollectionsKt.R(d.g("title", customScalarType), d.g(AnnotatedPrivateKey.LABEL, customScalarType));
        d = listR3;
        CompiledField compiledFieldC5 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC6 = new CompiledField.Builder(ErrorBundle.SUMMARY_ENTRY, CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("infoItems", a.f(BulletedListItem.f9445a));
        builder2.e = listR;
        CompiledField compiledFieldC7 = builder2.c();
        CompiledField.Builder builder3 = new CompiledField.Builder("securePreference", CompiledGraphQL.b(PreferenceToggle.f9751a));
        builder3.e = listR2;
        CompiledField compiledFieldC8 = builder3.c();
        CompiledField.Builder builder4 = new CompiledField.Builder("loadingState", CompiledGraphQL.b(RewardsSecurePreferenceLoadingState.f9867a));
        builder4.e = listR3;
        e = CollectionsKt.R(compiledFieldC5, compiledFieldC6, compiledFieldC7, compiledFieldC8, builder4.c());
    }
}
