package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FormattedListKt$painterUnorderedMarkers$1 implements Function3<Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        Composer composer = (Composer) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= composer.r(iIntValue) ? 4 : 2;
        }
        if ((iIntValue2 & 19) != 18 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
