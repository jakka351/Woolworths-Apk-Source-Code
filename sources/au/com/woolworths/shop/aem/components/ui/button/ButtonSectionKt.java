package au.com.woolworths.shop.aem.components.ui.button;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.button.ButtonDefaults;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.design.wx.component.button.TertiaryButtonKt;
import au.com.woolworths.feature.shop.account.ui.details.components.b;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.button.ButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ButtonSectionKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10213a;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                ButtonStyle buttonStyle = ButtonStyle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ButtonStyle buttonStyle2 = ButtonStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ButtonStyle buttonStyle3 = ButtonStyle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10213a = iArr;
        }
    }

    public static final void a(ButtonData buttonData, Function1 onButtonClick, Modifier modifier, PaddingValues paddingValues, Composer composer, int i) {
        int i2;
        PaddingValues paddingValues2;
        PaddingValues paddingValues3;
        Intrinsics.h(buttonData, "buttonData");
        Intrinsics.h(onButtonClick, "onButtonClick");
        ComposerImpl composerImplV = composer.v(233744489);
        int i3 = (composerImplV.I(buttonData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(onButtonClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i4 = i3 | 1024;
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            paddingValues3 = paddingValues;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                i2 = i4 & (-7169);
                paddingValues2 = ButtonDefaults.f5142a;
            } else {
                composerImplV.j();
                i2 = i4 & (-7169);
                paddingValues2 = paddingValues;
            }
            composerImplV.W();
            ButtonStyle buttonStyle = buttonData.c;
            int i5 = buttonStyle == null ? -1 : WhenMappings.f10213a[buttonStyle.ordinal()];
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (i5 == 1) {
                composerImplV.o(1340366651);
                String str = buttonData.b;
                boolean z = buttonData.d;
                composerImplV.o(-1633490746);
                boolean zI = composerImplV.I(buttonData) | ((i2 & 112) == 32);
                Object objG = composerImplV.G();
                if (zI || objG == composer$Companion$Empty$1) {
                    objG = new b(onButtonClick, buttonData, 1);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                PrimaryButtonKt.a(str, (Function0) objG, modifier, z, false, paddingValues2, null, null, null, composerImplV, i2 & 896, 976);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else if (i5 == 2) {
                composerImplV.o(1340716889);
                String str2 = buttonData.b;
                boolean z2 = buttonData.d;
                composerImplV.o(-1633490746);
                boolean zI2 = composerImplV.I(buttonData) | ((i2 & 112) == 32);
                Object objG2 = composerImplV.G();
                if (zI2 || objG2 == composer$Companion$Empty$1) {
                    objG2 = new b(onButtonClick, buttonData, 2);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                SecondaryButtonKt.b(str2, (Function0) objG2, modifier, z2, false, paddingValues2, null, composerImplV, i2 & 896, 80);
                composerImplV.V(false);
            } else if (i5 != 3) {
                composerImplV.o(1341394456);
                composerImplV.V(false);
            } else {
                composerImplV.o(1341068026);
                String str3 = buttonData.b;
                boolean z3 = buttonData.d;
                composerImplV.o(-1633490746);
                boolean zI3 = composerImplV.I(buttonData) | ((i2 & 112) == 32);
                Object objG3 = composerImplV.G();
                if (zI3 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new b(onButtonClick, buttonData, 3);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                TertiaryButtonKt.a(str3, (Function0) objG3, modifier, z3, false, paddingValues2, null, composerImplV, i2 & 896, 80);
                composerImplV.V(false);
            }
            paddingValues3 = paddingValues2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(buttonData, onButtonClick, modifier, paddingValues3, i, 10);
        }
    }
}
