package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.aem.components.model.link.LinkData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$LinkKt$lambda$1056416830$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            LinkData linkData = new LinkData("link_id", new ActionData(UrlHandler.ACTION, ActionType.e, "id", null), new TextWithAltData("See All", "See All"));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            LinkKt.a(linkData, (Function0) objG, SizeKt.g(Modifier.Companion.d, 48), null, composer, 432);
        }
        return Unit.f24250a;
    }
}
