package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductMultiBuyLabelKt$lambda$-1431527214$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductMultiBuyLabelKt$lambda$1431527214$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductMultiBuyLabelKt$lambda$1431527214$1 d = new ComposableSingletons$ProductMultiBuyLabelKt$lambda$1431527214$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductMultiBuyLabelKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", null, null, null, null, null, null, null, null, null, null, null, -4097, 3), null, false, null, composer, 0, 14);
        }
        return Unit.f24250a;
    }
}
