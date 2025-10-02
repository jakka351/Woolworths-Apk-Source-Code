package au.com.woolworths.sdui.shop.alert;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.alert.AlertSpec;
import au.com.woolworths.foundation.shop.instore.presence.presentation.b;
import au.com.woolworths.sdui.common.alert.a;
import au.com.woolworths.sdui.common.alert.model.CoreInsetAlertModel;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.sdui.shop.alert.model.BasicInsetAlertModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class StandardAlertKt {
    public static final void a(BasicInsetAlertModel basicInsetAlertModel, Function1 onActionClick, Modifier modifier, Function1 function1, Composer composer, int i, int i2) {
        Function1 function12;
        int i3;
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(-1249441657);
        int i4 = i | (composerImplV.I(basicInsetAlertModel) ? 4 : 2) | (composerImplV.I(onActionClick) ? 32 : 16);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            function12 = function1;
        } else {
            function12 = function1;
            i3 = i4 | (composerImplV.I(function12) ? 2048 : 1024);
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            AlertSpec.Action action = null;
            if (i5 != 0) {
                function12 = null;
            }
            composerImplV.o(1877417284);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (function12 != null) {
                composerImplV.o(-1633490746);
                boolean zI = ((i3 & 7168) == 2048) | composerImplV.I(basicInsetAlertModel);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new StandardAlertKt$StandardAlert$1$1(function12, basicInsetAlertModel, null);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG);
            }
            composerImplV.V(false);
            CoreInsetAlertModel insetAlertUI = basicInsetAlertModel.getInsetAlertUI();
            composerImplV.o(1877423751);
            if (basicInsetAlertModel.getActionLabel() != null && basicInsetAlertModel.getAction() != null) {
                String actionLabel = basicInsetAlertModel.getActionLabel();
                boolean z = basicInsetAlertModel.getAction().getType() == ActionType.e;
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(basicInsetAlertModel) | ((i3 & 112) == 32);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(2, onActionClick, basicInsetAlertModel);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                action = new AlertSpec.Action(z, actionLabel, (Function0) objG2);
            }
            composerImplV.V(false);
            au.com.woolworths.sdui.common.alert.StandardAlertKt.b(insetAlertUI, modifier, action, composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(basicInsetAlertModel, onActionClick, modifier, function12, i, i2, 8);
        }
    }
}
