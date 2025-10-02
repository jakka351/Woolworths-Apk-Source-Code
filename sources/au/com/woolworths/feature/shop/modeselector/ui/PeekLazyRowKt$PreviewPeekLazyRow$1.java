package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PeekLazyRowKt$PreviewPeekLazyRow$1 implements Function4<LazyItemScope, String, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope PeekLazyRow = (LazyItemScope) obj;
        String item = (String) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(PeekLazyRow, "$this$PeekLazyRow");
        Intrinsics.h(item, "item");
        if ((iIntValue & 48) == 0) {
            iIntValue |= composer.n(item) ? 32 : 16;
        }
        if ((iIntValue & 145) == 144 && composer.c()) {
            composer.j();
        } else {
            PeekLazyRowKt.a((iIntValue >> 3) & 14, composer, BackgroundKt.b(SizeKt.k(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED), Color.d, RectangleShapeKt.f1779a), item);
        }
        return Unit.f24250a;
    }
}
