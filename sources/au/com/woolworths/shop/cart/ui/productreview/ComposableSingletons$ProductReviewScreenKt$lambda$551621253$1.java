package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimationKt;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.RememberLottieCompositionKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductReviewScreenKt$lambda$551621253$1 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductReviewScreenKt$lambda$551621253$1 d = new ComposableSingletons$ProductReviewScreenKt$lambda$551621253$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AnimatedContentScope AnimatedContent = (AnimatedContentScope) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Composer composer = (Composer) obj3;
        ((Number) obj4).intValue();
        Intrinsics.h(AnimatedContent, "$this$AnimatedContent");
        if (zBooleanValue) {
            composer.o(1827048282);
            LoadingScreenKt.a(ComposableSingletons$ProductReviewScreenKt.f10510a, composer, 6, 0);
            composer.l();
        } else {
            if (zBooleanValue) {
                throw au.com.woolworths.android.onesite.a.x(composer, 1827047938);
            }
            composer.o(804168470);
            FillElement fillElement = SizeKt.c;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.e, Alignment.Companion.n, composer, 54);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            if (composer.w() == null) {
                ComposablesKt.b();
                throw null;
            }
            composer.i();
            if (composer.getO()) {
                composer.K(function0);
            } else {
                composer.e();
            }
            Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            LottieComposition d2 = RememberLottieCompositionKt.c(new LottieCompositionSpec.RawRes(R.raw.product_review_complete), composer, 0).getD();
            Modifier.Companion companion = Modifier.Companion.d;
            LottieAnimationKt.a(d2, SizeKt.k(companion, 42), null, 0, null, null, null, false, composer, 48, 0, 2097148);
            TextKt.b(StringResources_androidKt.c(composer, R.string.product_review_updating_cart_done), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
            composer.f();
            composer.l();
        }
        return Unit.f24250a;
    }
}
