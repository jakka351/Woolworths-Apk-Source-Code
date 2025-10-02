package au.com.woolworths.foundation.shop.prompt.handler.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.icon.IconKeyMapperKt;
import au.com.woolworths.feature.shop.contentpage.ui.c;
import au.com.woolworths.feature.shop.healthylifefoodtracker.ui.h;
import au.com.woolworths.foundation.shop.prompt.handler.data.PromptBottomSheet;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.button.ButtonKt;
import au.com.woolworths.sdui.common.button.model.CoreButtonModel;
import coil3.compose.SingletonAsyncImageKt;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"prompt-handler_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class BottomSheetPromptContentKt {
    public static final void a(PromptBottomSheet prompt, Function1 onActionClick, Composer composer, int i) {
        Intrinsics.h(prompt, "prompt");
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(-624582557);
        int i2 = i | (composerImplV.I(prompt) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onActionClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerImplV.c()) {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierF = PaddingKt.f(SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false), 16);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(8), Alignment.Companion.n, composerImplV, 54);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            IconAsset iconAsset = prompt.d;
            composerImplV.o(-82037142);
            if (iconAsset != null) {
                b(iconAsset, 128, composerImplV, 48);
            }
            composerImplV.V(false);
            int i4 = i2;
            TextKt.a(prompt.e, CoreTheme.f(composerImplV).d.c.d, TestTagKt.a(companion, "BottomSheetPromptTitle"), 0L, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1016);
            TextKt.a(prompt.f, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, TestTagKt.a(companion, "AddDeliveryAddressPromptMessage"), 0L, null, 3, 2, false, 3, null, composerImplV, 102236544, 664);
            composerImplV.o(-82018971);
            Iterator it = prompt.g.iterator();
            int i5 = 0;
            while (true) {
                if (!it.hasNext()) {
                    composerImplV.V(false);
                    composerImplV.V(true);
                    break;
                }
                Object next = it.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.z0();
                    throw null;
                }
                CoreButtonModel coreButtonModel = (CoreButtonModel) next;
                composerImplV.o(5004770);
                boolean z = (i4 & 112) == 32;
                Object objG = composerImplV.G();
                if (z || objG == Composer.Companion.f1624a) {
                    objG = new c(23, onActionClick);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                ButtonKt.a(coreButtonModel, (Function1) objG, TestTagKt.a(SizeKt.e(companion, 1.0f), "BottomSheetPromptButton_" + i5), composerImplV, 8);
                i5 = i6;
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new h(prompt, i, 23, onActionClick);
        }
    }

    public static final void b(IconAsset iconAsset, float f, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(551277030);
        if ((((composerImplV.I(iconAsset) ? 4 : 2) | i) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z = iconAsset instanceof IconAsset.CoreIcon;
            Modifier.Companion companion = Modifier.Companion.d;
            if (z) {
                composerImplV.o(-860774593);
                ImageVector imageVectorA = IconKeyMapperKt.a(CoreTheme.e(composerImplV), ((IconAsset.CoreIcon) iconAsset).d);
                if (imageVectorA != null) {
                    IconKt.b(imageVectorA, null, SizeKt.q(companion, f), CoreTheme.b(composerImplV).e.c.b, composerImplV, 48, 0);
                }
                composerImplV.V(false);
            } else {
                if (!(iconAsset instanceof IconAsset.HostedIcon)) {
                    throw a.w(1496252608, composerImplV, false);
                }
                composerImplV.o(-860331975);
                SingletonAsyncImageKt.b(((IconAsset.HostedIcon) iconAsset).d, null, SizeKt.q(companion, f), null, null, null, null, null, null, null, ContentScale.Companion.b, null, composerImplV, 27696, 6, 31712);
                composerImplV = composerImplV;
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.recipes.details.ui.b(iconAsset, f, i);
        }
    }
}
