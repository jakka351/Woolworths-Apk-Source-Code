package au.com.woolworths.shared.ui.compose.shop;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.wx.component.button.PrimaryButtonKt;
import au.com.woolworths.feature.rewards.offers.ui.a;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-ui-compose_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SignInOrRegisterNzButtonKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onSignInOrRegisterButtonClick) {
        Intrinsics.h(onSignInOrRegisterButtonClick, "onSignInOrRegisterButtonClick");
        ComposerImpl composerImplV = composer.v(30807933);
        if (((i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            modifier = Modifier.Companion.d;
            PrimaryButtonKt.a(StringResources_androidKt.c(composerImplV, R.string.sign_in_or_register_nz), onSignInOrRegisterButtonClick, SizeKt.e(modifier, 1.0f), false, false, null, null, null, null, composerImplV, 48, 1016);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(onSignInOrRegisterButtonClick, modifier, i, 5);
        }
    }
}
