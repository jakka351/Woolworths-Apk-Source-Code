package au.com.woolworths.product.cartpreauth;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.ImageKt;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.button.PrimaryButtonKt;
import au.com.woolworths.design.core.ui.component.stable.button.SecondaryButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-cart_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartPreAuthScreenKt {
    public static final void a(Function0 onLogInClick, Function0 onSignUpClick, Composer composer, int i) {
        int i2;
        int i3;
        Function0 function0;
        Function0 function02;
        Intrinsics.h(onLogInClick, "onLogInClick");
        Intrinsics.h(onSignUpClick, "onSignUpClick");
        ComposerImpl composerImplV = composer.v(2106311961);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(onLogInClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSignUpClick) ? 32 : 16;
        }
        int i4 = i2;
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function02 = onLogInClick;
            function0 = onSignUpClick;
            i3 = 2;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierF = PaddingKt.f(SizeKt.x(SizeKt.e(companion, 1.0f), Alignment.Companion.k, false), f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g(f), Alignment.Companion.n, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function03 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function03);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_no_products, 0, composerImplV), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 124);
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.cart_sign_in_prompt_title), CoreTheme.f(composerImplV).d.c.d, TestTagKt.a(companion, "SignInPromptTitle"), 0L, null, 0, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 1016);
            TextKt.a(StringResources_androidKt.c(composerImplV, R.string.cart_sign_in_prompt_message), CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, TestTagKt.a(companion, "SignInPromptMessage"), 0L, null, 3, 0, false, 0, null, composerImplV, KyberEngine.KyberPolyBytes, 984);
            i3 = 2;
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.login), onLogInClick, TestTagKt.a(SizeKt.e(companion, 1.0f), "LogInButton"), false, null, null, null, null, composerImplV, ((i4 << 3) & 112) | KyberEngine.KyberPolyBytes, 248);
            function0 = onSignUpClick;
            function02 = onLogInClick;
            SecondaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.signup), function0, TestTagKt.a(SizeKt.e(companion, 1.0f), "SignUpButton"), false, null, null, null, null, composerImplV, (i4 & 112) | KyberEngine.KyberPolyBytes, 248);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shared.web.file.uploader.permission.ui.a(function02, function0, i, i3);
        }
    }
}
