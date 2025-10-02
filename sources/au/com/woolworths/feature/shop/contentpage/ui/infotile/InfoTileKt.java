package au.com.woolworths.feature.shop.contentpage.ui.infotile;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material.RippleKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileCta;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileIconSlotSize;
import au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileStyle;
import au.com.woolworths.feature.shop.contentpage.ui.n;
import au.com.woolworths.markdown.compat.MarkdownCompatKt;
import au.com.woolworths.markdown.compat.MarkdownTextViewStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"content-page_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InfoTileKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InfoTileStyle.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InfoTileStyle infoTileStyle = InfoTileStyle.d;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[InfoTileIconSlotSize.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InfoTileIconSlotSize infoTileIconSlotSize = InfoTileIconSlotSize.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function1 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.contentpage.ui.infotile.InfoTileKt.a(au.com.woolworths.feature.shop.contentpage.data.infotile.InfoTileData, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public static final void b(InfoTileData infoTileData, PaddingValuesImpl paddingValuesImpl, Function1 function1, Composer composer, int i) {
        int i2;
        Modifier.Companion companion;
        ?? r4;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(465876038);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(infoTileData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(paddingValuesImpl) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
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
            TextKt.a(infoTileData.b, CoreTheme.f(composerImplV).e.f5133a.b, PaddingKt.e(companion2, paddingValuesImpl), CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            ComposerImpl composerImpl2 = composerImplV;
            String str = infoTileData.c;
            composerImpl2.o(606199779);
            if (str == null) {
                companion = companion2;
                r4 = 1;
            } else {
                SpacerKt.a(8, composerImpl2, 6);
                companion = companion2;
                r4 = 1;
                MarkdownCompatKt.a(str, PaddingKt.e(companion2, paddingValuesImpl), new MarkdownTextViewStyle((Density) composerImpl2.x(CompositionLocalsKt.h), CoreTheme.b(composerImpl2).e.d.d, CoreTheme.f(composerImpl2).f5120a.b.f5123a, new TextAlign(1), 16), null, true, new Color(CoreTheme.b(composerImpl2).e.d.f4856a), null, false, null, null, composerImpl2, 24576, 968);
            }
            composerImpl2.V(false);
            InfoTileCta infoTileCta = infoTileData.d;
            composerImpl2.o(606220528);
            ComposerImpl composerImpl3 = composerImpl2;
            if (infoTileCta != null) {
                String str2 = infoTileCta.f7025a;
                TextStyle textStyle = CoreTheme.f(composerImpl2).f5120a.b.b;
                long j = CoreTheme.b(composerImpl2).f4782a.d.b.f4798a;
                IndicationNodeFactory indicationNodeFactoryA = RippleKt.a(r4, 30, CoreTheme.b(composerImpl2).f4782a.d.b.f4798a);
                composerImpl2.o(1849434622);
                Object objG = composerImpl2.G();
                Object obj = Composer.Companion.f1624a;
                if (objG == obj) {
                    objG = InteractionSourceKt.a();
                    composerImpl2.A(objG);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
                composerImpl2.V(false);
                Role role = new Role(4);
                composerImpl2.o(-1633490746);
                boolean zI = ((i2 & 896) == 256 ? r4 : false) | composerImpl2.I(infoTileCta);
                Object objG2 = composerImpl2.G();
                if (zI || objG2 == obj) {
                    objG2 = new n(1, function1, infoTileCta);
                    composerImpl2.A(objG2);
                }
                composerImpl2.V(false);
                TextKt.a(str2, textStyle, PaddingKt.h(PaddingKt.e(ClickableKt.b(companion, mutableInteractionSource, indicationNodeFactoryA, false, null, role, (Function0) objG2, 12), paddingValuesImpl), BitmapDescriptorFactory.HUE_RED, 12, r4), j, null, 0, 0, false, 0, null, composerImpl2, 0, 1008);
                composerImpl3 = composerImpl2;
            }
            composerImpl3.V(false);
            composerImpl3.V(r4);
            composerImpl = composerImpl3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(infoTileData, paddingValuesImpl, function1, i, 11);
        }
    }
}
