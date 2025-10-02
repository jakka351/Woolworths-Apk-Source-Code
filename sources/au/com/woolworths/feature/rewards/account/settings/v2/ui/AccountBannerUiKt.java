package au.com.woolworths.feature.rewards.account.settings.v2.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiData;
import au.com.woolworths.foundation.rewards.banner.model.RewardsNotificationBannerApiDataKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.RewardsNotificationBannerKt;
import au.com.woolworths.foundation.rewards.common.ui.banners.data.RewardsNotificationBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"account_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AccountBannerUiKt {
    public static final void a(final RewardsNotificationBannerApiData banner, final Function1 onCloseButtonClick, final Function1 onActionButtonClick, Composer composer, int i) {
        Intrinsics.h(banner, "banner");
        Intrinsics.h(onCloseButtonClick, "onCloseButtonClick");
        Intrinsics.h(onActionButtonClick, "onActionButtonClick");
        ComposerImpl composerImplV = composer.v(-167192666);
        int i2 = (composerImplV.I(banner) ? 4 : 2) | i | (composerImplV.I(onCloseButtonClick) ? 32 : 16) | (composerImplV.I(onActionButtonClick) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RewardsNotificationBannerData rewardsNotificationBannerDataA = RewardsNotificationBannerApiDataKt.a(banner);
            composerImplV.o(-1633490746);
            boolean z = true;
            int i3 = i2 & 14;
            boolean z2 = ((i2 & 112) == 32) | (i3 == 4 || composerImplV.I(banner));
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z2 || objG == composer$Companion$Empty$1) {
                final int i4 = 0;
                objG = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.ui.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                onCloseButtonClick.invoke(banner);
                                break;
                            default:
                                onCloseButtonClick.invoke(banner);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean z3 = (i2 & 896) == 256;
            if (i3 != 4 && !composerImplV.I(banner)) {
                z = false;
            }
            boolean z4 = z3 | z;
            Object objG2 = composerImplV.G();
            if (z4 || objG2 == composer$Companion$Empty$1) {
                final int i5 = 1;
                objG2 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.settings.v2.ui.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                onActionButtonClick.invoke(banner);
                                break;
                            default:
                                onActionButtonClick.invoke(banner);
                                break;
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            RewardsNotificationBannerKt.a(rewardsNotificationBannerDataA, function0, (Function0) objG2, null, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.internal.a(banner, onCloseButtonClick, onActionButtonClick, i, 3);
        }
    }
}
