package au.com.woolworths.sdui.rewards.broadcastbanner;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerSpec;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.b;
import au.com.woolworths.sdui.common.alert.a;
import au.com.woolworths.sdui.common.broadcastbanner.model.CoreBroadcastBannerModel;
import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.ActionType;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.BasicCoreBroadcastBannerModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BroadcastBannerKt {
    public static final void a(BasicCoreBroadcastBannerModel item, Function1 onActionClick, Modifier modifier, Composer composer, int i) {
        BroadcastBannerSpec.Action action;
        Intrinsics.h(item, "item");
        ActionData actionData = item.c;
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(-1798326247);
        int i2 = (composerImplV.I(item) ? 4 : 2) | i | (composerImplV.I(onActionClick) ? 32 : 16) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1614662570);
            composerImplV.V(false);
            CoreBroadcastBannerModel coreBroadcastBannerModel = item.f10026a;
            composerImplV.o(-1614655735);
            String str = item.b;
            if (str == null || actionData == null) {
                action = null;
            } else {
                boolean z = actionData.e == ActionType.e;
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 112) == 32) | composerImplV.I(item);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new a(1, onActionClick, item);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                action = new BroadcastBannerSpec.Action(z, str, (Function0) objG);
            }
            BroadcastBannerSpec.Action action2 = action;
            composerImplV.V(false);
            CoreBroadcastBannerModel.Companion companion = CoreBroadcastBannerModel.INSTANCE;
            au.com.woolworths.sdui.common.broadcastbanner.BroadcastBannerKt.a(coreBroadcastBannerModel, modifier, null, action2, composerImplV, 440, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(item, onActionClick, modifier, i, 16);
        }
    }
}
