package au.com.woolworths.feature.shop.inbox.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.feature.shop.inbox.domain.NotificationSection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"inbox_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MessageSectionHeaderKt {
    public static final void a(NotificationSection section, Modifier modifier, Composer composer, int i) {
        int i2;
        int i3;
        ComposerImpl composerImpl;
        Modifier modifier2;
        Intrinsics.h(section, "section");
        ComposerImpl composerImplV = composer.v(-1774962474);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(section) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            if (section.equals(NotificationSection.New.f7290a)) {
                i3 = R.string.inbox_notification_section_new;
            } else if (section.equals(NotificationSection.ThisWeek.f7292a)) {
                i3 = R.string.inbox_notification_section_this_week;
            } else if (section.equals(NotificationSection.LastWeek.f7289a)) {
                i3 = R.string.inbox_notification_section_last_week;
            } else {
                if (!section.equals(NotificationSection.Older.f7291a)) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = R.string.inbox_notification__section_older;
            }
            String strC = StringResources_androidKt.c(composerImplV, i3);
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(strC);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui.a(strC, 7);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(PaddingKt.j(SizeKt.e(BackgroundKt.b(SemanticsModifierKt.b(companion, true, (Function1) objG), WxTheme.a(composerImplV).b(), RectangleShapeKt.f1779a), 1.0f), 32, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 8, 5);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.d, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Object objF = au.com.woolworths.android.onesite.a.f(composerImplV, modifierD, ComposeUiNode.Companion.d, 1849434622);
            if (objF == composer$Companion$Empty$1) {
                objF = new d(13);
                composerImplV.A(objF);
            }
            composerImplV.V(false);
            TextKt.b(strC, SemanticsModifierKt.a(companion, (Function1) objF), ToneColors.f5162a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).r, composerImplV, 0, 0, 65528);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(section, i, 6, modifier2);
        }
    }
}
