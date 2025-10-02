package au.com.woolworths.feature.rewards.everydayextras.signup.compose.shared;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.TestTagKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.design.wx.component.button.SecondaryButtonKt;
import au.com.woolworths.feature.product.list.compose.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasButtonStyle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"everyday-extras-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FooterButtonKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6117a;

        static {
            int[] iArr = new int[EverydayExtrasButtonStyle.values().length];
            try {
                EverydayExtrasButtonStyle everydayExtrasButtonStyle = EverydayExtrasButtonStyle.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EverydayExtrasButtonStyle everydayExtrasButtonStyle2 = EverydayExtrasButtonStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EverydayExtrasButtonStyle everydayExtrasButtonStyle3 = EverydayExtrasButtonStyle.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6117a = iArr;
        }
    }

    public static final void a(String label, EverydayExtrasButtonStyle everydayExtrasButtonStyle, Function0 onClick, Composer composer, int i) {
        int i2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-176025008);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.r(everydayExtrasButtonStyle == null ? -1 : everydayExtrasButtonStyle.ordinal()) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            b(label, everydayExtrasButtonStyle, onClick, PaddingKt.f(SizeKt.e(TestTagKt.a(Modifier.Companion.d, "footerButton"), 1.0f), 16), composerImplV, (i2 & 14) | 3072 | (i2 & 112) | (i2 & 896));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new c(label, everydayExtrasButtonStyle, onClick, i, 1);
        }
    }

    public static final void b(String label, EverydayExtrasButtonStyle everydayExtrasButtonStyle, Function0 onClick, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(label, "label");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-1884401979);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.r(everydayExtrasButtonStyle == null ? -1 : everydayExtrasButtonStyle.ordinal()) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            int i3 = everydayExtrasButtonStyle != null ? WhenMappings.f6117a[everydayExtrasButtonStyle.ordinal()] : -1;
            if (i3 == 1) {
                composerImplV.o(1565904695);
                PrimaryButtonKt.a(label, onClick, modifier, false, false, null, null, null, null, composerImplV, ((i2 >> 3) & 112) | (i2 & 14) | KyberEngine.KyberPolyBytes, 1016);
                composerImplV.V(false);
            } else if (i3 == 2 || i3 == 3) {
                composerImplV.o(1565911685);
                SecondaryButtonKt.b(label, onClick, modifier, false, false, null, null, composerImplV, ((i2 >> 3) & 112) | (i2 & 14) | KyberEngine.KyberPolyBytes, 120);
                composerImplV = composerImplV;
                composerImplV.V(false);
            } else {
                composerImplV.o(1565918327);
                PrimaryButtonKt.a(label, onClick, modifier, false, false, null, null, null, null, composerImplV, ((i2 >> 3) & 112) | (i2 & 14) | KyberEngine.KyberPolyBytes, 1016);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(i, 5, label, everydayExtrasButtonStyle, onClick, modifier, false);
        }
    }
}
