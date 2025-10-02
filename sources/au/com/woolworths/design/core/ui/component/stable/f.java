package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionSettingKt;
import au.com.woolworths.foundation.rewards.common.ui.pointsbalance.PointsIndicatorDescriptionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ f(RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem, Function0 function0, Modifier modifier, boolean z, boolean z2, int i, int i2) {
        this.j = rewardsRedemptionSettingsItem;
        this.k = function0;
        this.e = modifier;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SwitchKt.a(this.f, (Function1) this.j, this.e, this.g, (MutableInteractionSource) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            case 1:
                ((Integer) obj2).getClass();
                RedemptionSettingKt.b((RewardsRedemptionSettingsItem) this.j, (Function0) this.k, this.e, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                PointsIndicatorDescriptionKt.a((String) this.j, this.e, (List) this.k, this.f, this.g, (Composer) obj, RecomposeScopeImplKt.a(this.h | 1), this.i);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ f(String str, Modifier modifier, List list, boolean z, boolean z2, int i, int i2) {
        this.j = str;
        this.e = modifier;
        this.k = list;
        this.f = z;
        this.g = z2;
        this.h = i;
        this.i = i2;
    }

    public /* synthetic */ f(boolean z, Function1 function1, Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.f = z;
        this.j = function1;
        this.e = modifier;
        this.g = z2;
        this.k = mutableInteractionSource;
        this.h = i;
        this.i = i2;
    }
}
