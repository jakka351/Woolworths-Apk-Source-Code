package com.adobe.marketing.mobile.services.ui.alert.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
final class AlertScreenKt$AlertScreen$1$2$1$2 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RowScope TextButton = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(TextButton, "$this$TextButton");
        if ((iIntValue & 81) != 16 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
