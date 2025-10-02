package com.woolworths.rewards.redemptionsettings.fragment.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.ContentCta;
import au.com.woolworths.rewards.graphql.type.GraphQLBoolean;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionAction;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionActionsList;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSetting;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingConfirmationMessage;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingCta;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingIcon;
import au.com.woolworths.rewards.graphql.type.RewardsTwoFactorAuth;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.apollographql.apollo.api.CustomScalarType;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/selections/RedemptionSettingsListFieldsSelections;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionSettingsListFieldsSelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21125a;
    public static final List b;
    public static final List c;
    public static final List d;
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    static {
        CustomScalarType customScalarType = GraphQLString.f9617a;
        List listQ = CollectionsKt.Q(new CompiledField.Builder("stepUpUrl", CompiledGraphQL.b(customScalarType)).c());
        f21125a = listQ;
        List listR = CollectionsKt.R(d.g("title", customScalarType), new CompiledField.Builder("message", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("buttonLabel", CompiledGraphQL.b(customScalarType)).c());
        b = listR;
        List listR2 = CollectionsKt.R(new CompiledField.Builder(AnnotatedPrivateKey.LABEL, CompiledGraphQL.b(customScalarType)).c(), d.g("url", customScalarType));
        c = listR2;
        CompiledField compiledFieldC = new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder = new CompiledField.Builder("cta", CompiledGraphQL.b(ContentCta.f9485a));
        builder.e = listR2;
        List listR3 = CollectionsKt.R(compiledFieldC, builder.c());
        d = listR3;
        CustomScalarType customScalarType2 = GraphQLBoolean.f9613a;
        CompiledField compiledFieldC2 = new CompiledField.Builder("isSelected", CompiledGraphQL.b(customScalarType2)).c();
        RewardsRedemptionSettingIcon.e.getClass();
        CompiledField compiledFieldC3 = new CompiledField.Builder(BarcodePickDeserializer.FIELD_ICON, CompiledGraphQL.b(RewardsRedemptionSettingIcon.f)).c();
        CompiledField compiledFieldC4 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField compiledFieldC5 = new CompiledField.Builder("body", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder2 = new CompiledField.Builder("confirmationMessages", CompiledGraphQL.a(CompiledGraphQL.b(RewardsRedemptionSettingConfirmationMessage.f9858a)));
        builder2.e = listR;
        CompiledField compiledFieldC6 = builder2.c();
        CompiledField compiledFieldG = d.g("isChangeEnabled", customScalarType2);
        CompiledField.Builder builder3 = new CompiledField.Builder("cta", RewardsRedemptionSettingCta.f9859a);
        builder3.e = listR3;
        List listR4 = CollectionsKt.R(compiledFieldC2, compiledFieldC3, compiledFieldC4, compiledFieldC5, compiledFieldC6, compiledFieldG, builder3.c());
        e = listR4;
        List listR5 = CollectionsKt.R(new CompiledField.Builder("iconUrl", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("body", CompiledGraphQL.b(customScalarType)).c(), new CompiledField.Builder("actionUrl", CompiledGraphQL.b(customScalarType)).c());
        f = listR5;
        CompiledField compiledFieldC7 = new CompiledField.Builder("title", CompiledGraphQL.b(customScalarType)).c();
        CompiledField.Builder builder4 = new CompiledField.Builder("items", a.f(RewardsRedemptionAction.f9855a));
        builder4.e = listR5;
        List listR6 = CollectionsKt.R(compiledFieldC7, builder4.c());
        g = listR6;
        CompiledField.Builder builder5 = new CompiledField.Builder("twoFactorAuth", RewardsTwoFactorAuth.f9875a);
        builder5.e = listQ;
        CompiledField compiledFieldC8 = builder5.c();
        CompiledField.Builder builder6 = new CompiledField.Builder("items", a.f(RewardsRedemptionSetting.f9857a));
        builder6.e = listR4;
        CompiledField compiledFieldC9 = builder6.c();
        CompiledField.Builder builder7 = new CompiledField.Builder("actions", RewardsRedemptionActionsList.f9856a);
        builder7.e = listR6;
        h = CollectionsKt.R(compiledFieldC8, compiledFieldC9, builder7.c());
    }
}
