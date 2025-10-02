package au.com.woolworths.feature.shop.recipes.freshmag.content.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.zoomablepage.ZoomablePage;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.recipes.freshmag.content.ui.ComposableSingletons$FreshMagContentScreenKt$lambda$-19579772$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FreshMagContentScreenKt$lambda$19579772$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EmptyList emptyList = EmptyList.d;
            FreshMagContentContract.FreshMagContent freshMagContent = new FreshMagContentContract.FreshMagContent(CollectionsKt.R(new ZoomablePage("", 50, 50, emptyList), new ZoomablePage("", 50, 50, emptyList)), 0);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new l(22);
                composer.A(objG);
            }
            composer.l();
            FreshMagContentScreenKt.a(freshMagContent, (Function1) objG, null, composer, 48);
        }
        return Unit.f24250a;
    }
}
