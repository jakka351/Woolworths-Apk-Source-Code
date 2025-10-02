package com.halilibo.richtext.ui;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class f implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        TextStyle textStyle = (TextStyle) obj2;
        Intrinsics.h(textStyle, "textStyle");
        if (iIntValue == 0) {
            return new TextStyle(0L, TextUnitKt.c(36), FontWeight.m, null, null, 0L, null, 0, 0, 0L, null, 16777209);
        }
        if (iIntValue == 1) {
            return new TextStyle(0L, TextUnitKt.c(26), FontWeight.m, null, null, 0L, null, 0, 0, 0L, null, 16777209);
        }
        if (iIntValue == 2) {
            return new TextStyle(Color.b(textStyle.b(), 0.7f), TextUnitKt.c(22), FontWeight.m, null, null, 0L, null, 0, 0, 0L, null, 16777208);
        }
        if (iIntValue == 3) {
            return new TextStyle(0L, TextUnitKt.c(20), FontWeight.m, new FontStyle(1), null, 0L, null, 0, 0, 0L, null, 16777201);
        }
        if (iIntValue == 4) {
            return new TextStyle(Color.b(textStyle.b(), 0.7f), TextUnitKt.c(18), FontWeight.m, null, null, 0L, null, 0, 0, 0L, null, 16777208);
        }
        if (iIntValue != 5) {
            return textStyle;
        }
        return new TextStyle(Color.b(textStyle.b(), 0.5f), 0L, FontWeight.m, null, null, 0L, null, 0, 0, 0L, null, 16777210);
    }
}
