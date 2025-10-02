package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.halilibo.richtext.ui.ComposableSingletons$FormattedListKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class ComposableSingletons$FormattedListKt$lambda1$1 implements Function4<RichTextScope, Function3<? super RichTextScope, ? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        Object FormattedList = (RichTextScope) obj;
        Function3 it = (Function3) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(FormattedList, "$this$FormattedList");
        Intrinsics.h(it, "it");
        if ((iIntValue & 6) == 0) {
            i = (composer.n(FormattedList) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= composer.I(it) ? 32 : 16;
        }
        if ((i & 147) == 146 && composer.c()) {
            composer.j();
        } else {
            it.invoke(FormattedList, composer, Integer.valueOf(i & 126));
        }
        return Unit.f24250a;
    }
}
