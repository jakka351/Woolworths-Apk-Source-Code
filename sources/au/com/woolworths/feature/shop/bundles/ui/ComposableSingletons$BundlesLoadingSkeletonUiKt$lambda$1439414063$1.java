package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.bundles.ui.ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$-1439414063$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$1439414063$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public static final ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$1439414063$1 d = new ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$1439414063$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(items, "$this$items");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierJ = PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, 11);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            CardKt.b((Function0) objG, modifierJ, false, null, 0L, 0L, 0L, 0L, null, null, null, ComposableSingletons$BundlesLoadingSkeletonUiKt.b, composer, 54, 2044);
        }
        return Unit.f24250a;
    }
}
