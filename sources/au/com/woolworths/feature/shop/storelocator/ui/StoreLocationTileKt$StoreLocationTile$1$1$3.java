package au.com.woolworths.feature.shop.storelocator.ui;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class StoreLocationTileKt$StoreLocationTile$1$1$3 implements Function3<FlowRowScope, Composer, Integer, Unit> {
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
