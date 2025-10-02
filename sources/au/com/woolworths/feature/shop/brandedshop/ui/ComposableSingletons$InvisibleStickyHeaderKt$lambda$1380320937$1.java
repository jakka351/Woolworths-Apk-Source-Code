package au.com.woolworths.feature.shop.brandedshop.ui;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$InvisibleStickyHeaderKt$lambda$1380320937$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public static final ComposableSingletons$InvisibleStickyHeaderKt$lambda$1380320937$1 d = new ComposableSingletons$InvisibleStickyHeaderKt$lambda$1380320937$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope stickyHeader = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(stickyHeader, "$this$stickyHeader");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierG = SizeKt.g(Modifier.Companion.d, 0);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shared.instore.wifi.ui.c(16);
                composer.A(objG);
            }
            composer.l();
            BoxKt.a(SemanticsModifierKt.a(modifierG, (Function1) objG), composer, 0);
        }
        return Unit.f24250a;
    }
}
