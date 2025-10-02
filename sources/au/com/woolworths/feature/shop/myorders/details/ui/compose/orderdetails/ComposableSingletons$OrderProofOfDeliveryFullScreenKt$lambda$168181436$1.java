package au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.SubcomposeAsyncImageScope;
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
/* loaded from: classes3.dex */
public final class ComposableSingletons$OrderProofOfDeliveryFullScreenKt$lambda$168181436$1 implements Function4<SubcomposeAsyncImageScope, AsyncImagePainter.State.Error, Composer, Integer, Unit> {
    public static final ComposableSingletons$OrderProofOfDeliveryFullScreenKt$lambda$168181436$1 d = new ComposableSingletons$OrderProofOfDeliveryFullScreenKt$lambda$168181436$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SubcomposeAsyncImageScope SubcomposeAsyncImage = (SubcomposeAsyncImageScope) obj;
        AsyncImagePainter.State.Error it = (AsyncImagePainter.State.Error) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
        Intrinsics.h(it, "it");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composer, companion);
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
            Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_image_load_failed, 0, composer), null, BoxScopeInstance.f944a.g(companion, Alignment.Companion.e), null, null, BitmapDescriptorFactory.HUE_RED, null, composer, 48, 120);
            composer.f();
        }
        return Unit.f24250a;
    }
}
