package au.com.woolworths.shop.productcard.ui.containers;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.productcard.ui.components.WatchlistIconButtonKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.productcard.ui.containers.ComposableSingletons$ProductTileGridUiKt$lambda$-1111392256$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductTileGridUiKt$lambda$1111392256$1 implements Function3<BoxScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductTileGridUiKt$lambda$1111392256$1 d = new ComposableSingletons$ProductTileGridUiKt$lambda$1111392256$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        BoxScope ProductTileGridUi = (BoxScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(ProductTileGridUi, "$this$ProductTileGridUi");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            WatchlistIconButtonKt.a(54, composer, null, (Function0) objG, false);
        }
        return Unit.f24250a;
    }
}
