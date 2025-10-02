package au.com.woolworths.shop.checkout.ui.common.component;

import androidx.activity.compose.BackHandlerKt;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.sdui.legacy.banner.designcoreadapter.a;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt;
import com.airbnb.lottie.compose.LottieAnimatable;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\u000e\u0010\u0001\u001a\u0004\u0018\u00010\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WappleLoadingScreenKt {
    public static final void a(Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(259674080);
        if (((i | 6) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier2 = modifier;
        } else {
            LottieCompositionResultImpl lottieCompositionResultImplC = RememberLottieCompositionKt.c(new LottieCompositionSpec.Asset("wwspinner.json"), composerImplV, 6);
            LottieAnimatable lottieAnimatableA = AnimateLottieCompositionAsStateKt.a(lottieCompositionResultImplC.getD(), null, Integer.MAX_VALUE, composerImplV, 958);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new h(20);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            BackHandlerKt.a(false, (Function0) objG, composerImplV, 48, 1);
            Modifier modifierB = BackgroundKt.b(SizeKt.c, Color.b(Color.b, 0.4f), RectangleShapeKt.f1779a);
            composerImplV.o(1849434622);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = WappleLoadingScreenKt$WappleLoadingScreen$2$1.d;
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Modifier modifierD = SuspendingPointerInputFilterKt.d(modifierB, Unit.f24250a, (PointerInputEventHandler) objG2);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierD);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierG = BoxScopeInstance.f944a.g(SizeKt.q(companion, 100), Alignment.Companion.e);
            LottieComposition d = lottieCompositionResultImplC.getD();
            composerImplV.o(5004770);
            boolean zN = composerImplV.n(lottieAnimatableA);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == obj) {
                objG3 = new au.com.woolworths.feature.product.list.compose.filter.h(lottieAnimatableA, 11);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            LottieAnimationKt.b(d, (Function0) objG3, modifierG, false, false, false, null, false, null, null, null, false, false, null, null, false, composerImplV, 0, 0, 65528);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 5, modifier2);
        }
    }
}
