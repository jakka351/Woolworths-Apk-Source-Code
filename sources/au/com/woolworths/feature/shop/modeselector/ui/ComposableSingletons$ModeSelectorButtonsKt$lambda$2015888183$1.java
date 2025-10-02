package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButton;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeButtonType;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.modeselector.ui.ComposableSingletons$ModeSelectorButtonsKt$lambda$-2015888183$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ModeSelectorButtonsKt$lambda$2015888183$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new ShoppingModeButton(ShoppingModeButtonType.e, false, "Delivery", true), new ShoppingModeButton(ShoppingModeButtonType.f, true, "Pick up", true), new ShoppingModeButton(ShoppingModeButtonType.g, false, "Instore", true));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(9);
                composer.A(objG);
            }
            composer.l();
            ModeSelectorButtonsKt.a(listR, (Function1) objG, composer, 48);
        }
        return Unit.f24250a;
    }
}
