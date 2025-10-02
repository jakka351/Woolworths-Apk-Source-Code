package com.woolworths.rewards.redemptionsettings.selections;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.GraphQLString;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingsList;
import com.apollographql.apollo.api.CompiledField;
import com.apollographql.apollo.api.CompiledFragment;
import com.apollographql.apollo.api.CompiledGraphQL;
import com.woolworths.rewards.redemptionsettings.fragment.selections.RedemptionSettingsListFieldsSelections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/selections/RedemptionSettingsWith2FAQuerySelections;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RedemptionSettingsWith2FAQuerySelections {

    /* renamed from: a, reason: collision with root package name */
    public static final List f21127a;
    public static final List b;

    static {
        CompiledField compiledFieldC = new CompiledField.Builder("__typename", CompiledGraphQL.b(GraphQLString.f9617a)).c();
        CompiledFragment.Builder builder = new CompiledFragment.Builder("RewardsRedemptionSettingsList", CollectionsKt.Q("RewardsRedemptionSettingsList"));
        builder.b(RedemptionSettingsListFieldsSelections.h);
        List listR = CollectionsKt.R(compiledFieldC, builder.a());
        f21127a = listR;
        CompiledField.Builder builder2 = new CompiledField.Builder("rewardsRedemptionSettings", RewardsRedemptionSettingsList.f9860a);
        builder2.e = listR;
        b = CollectionsKt.Q(builder2.c());
    }
}
