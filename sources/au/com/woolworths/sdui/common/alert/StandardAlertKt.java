package au.com.woolworths.sdui.common.alert;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertKt;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.design.core.ui.component.stable.alert.Placement;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.b;
import au.com.woolworths.sdui.common.alert.model.BasicInsetAlertModel;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.model.action.ActionType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StandardAlertKt {
    public static final void a(BasicInsetAlertModel basicInsetAlertModel, Function1 onActionClick, Modifier modifier, Composer composer, int i) {
        AlertSpec.Action action;
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(830113724);
        int i2 = (composerImplV.I(basicInsetAlertModel) ? 4 : 2) | i | (composerImplV.I(onActionClick) ? 32 : 16) | 3072;
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1124621511);
            composerImplV.V(false);
            CoreInsetAlertModel insetAlertUI = basicInsetAlertModel.getInsetAlertUI();
            composerImplV.o(-1124615044);
            if (basicInsetAlertModel.getActionLabel() == null || basicInsetAlertModel.getAction() == null) {
                action = null;
            } else {
                String actionLabel = basicInsetAlertModel.getActionLabel();
                boolean z = basicInsetAlertModel.getAction().getType() == ActionType.e;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(basicInsetAlertModel) | ((i2 & 112) == 32);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new a(0, onActionClick, basicInsetAlertModel);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                action = new AlertSpec.Action(z, actionLabel, (Function0) objG);
            }
            composerImplV.V(false);
            b(insetAlertUI, modifier, action, composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(basicInsetAlertModel, onActionClick, modifier, i, 14);
        }
    }

    public static final void b(CoreInsetAlertModel model, Modifier modifier, AlertSpec.Action action, Composer composer, int i) {
        int i2;
        Intrinsics.h(model, "model");
        ComposerImpl composerImplV = composer.v(-547308231);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(model) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(action) : composerImplV.I(action) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = i2 << 3;
            AlertKt.c(model.getStyle().a(), Placement.d, modifier, action, model.getTitle(), model.getDescription(), null, composerImplV, (i3 & 896) | 48 | (i3 & 7168), 64);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(model, modifier, action, i, 8);
        }
    }
}
