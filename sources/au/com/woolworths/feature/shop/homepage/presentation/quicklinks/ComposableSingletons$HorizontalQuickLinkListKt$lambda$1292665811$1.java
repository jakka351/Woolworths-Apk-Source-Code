package au.com.woolworths.feature.shop.homepage.presentation.quicklinks;

import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.d;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.QuickLinkCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.homepage.presentation.quicklinks.ComposableSingletons$HorizontalQuickLinkListKt$lambda$-1292665811$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$HorizontalQuickLinkListKt$lambda$1292665811$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$HorizontalQuickLinkListKt$lambda$1292665811$1 d = new ComposableSingletons$HorizontalQuickLinkListKt$lambda$1292665811$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            QuickLinkCard quickLinkCard = new QuickLinkCard("Scan&Go", new ActionData("com.woolworths.shop://ScanAndGo", ActionType.e, null, null), "Scan items as you go & check out fast", "", null, null, 48, null);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new d(1);
                composer.A(objG);
            }
            composer.l();
            HorizontalQuickLinkListKt.a(quickLinkCard, (Function1) objG, null, composer, 56);
        }
        return Unit.f24250a;
    }
}
