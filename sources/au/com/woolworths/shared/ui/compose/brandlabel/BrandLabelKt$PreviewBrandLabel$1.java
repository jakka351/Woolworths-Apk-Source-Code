package au.com.woolworths.shared.ui.compose.brandlabel;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class BrandLabelKt$PreviewBrandLabel$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shared.ui.compose.brandlabel.BrandLabelKt$PreviewBrandLabel$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            FlowRowScope FlowRow = (FlowRowScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(FlowRow, "$this$FlowRow");
            if ((iIntValue & 17) != 16 || !composer.c()) {
                throw null;
            }
            composer.j();
            return Unit.f24250a;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = 4;
            FlowLayoutKt.b(null, Arrangement.g(f), Arrangement.g(f), null, 0, 0, ComposableLambdaKt.c(304182934, new AnonymousClass1(), composer), composer, 1573296, 57);
        }
        return Unit.f24250a;
    }
}
