package com.halilibo.richtext.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class InfoPanelKt$DefaultInfoPanelTextStyle$1 implements Function3<InfoPanelType, Composer, Integer, TextStyle> {
    public static final InfoPanelKt$DefaultInfoPanelTextStyle$1 d = new InfoPanelKt$DefaultInfoPanelTextStyle$1();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[InfoPanelType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InfoPanelType[] infoPanelTypeArr = InfoPanelType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InfoPanelType[] infoPanelTypeArr2 = InfoPanelType.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                InfoPanelType[] infoPanelTypeArr3 = InfoPanelType.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                InfoPanelType[] infoPanelTypeArr4 = InfoPanelType.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long jD;
        InfoPanelType infoPanelType = (InfoPanelType) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(infoPanelType, "infoPanelType");
        composer.o(818489191);
        composer.o(757418463);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            int iOrdinal = infoPanelType.ordinal();
            if (iOrdinal == 0) {
                jD = ColorKt.d(4278206597L);
            } else if (iOrdinal == 1) {
                jD = ColorKt.d(4281875777L);
            } else if (iOrdinal == 2) {
                jD = ColorKt.d(4279588644L);
            } else if (iOrdinal == 3) {
                jD = ColorKt.d(4285668388L);
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                jD = ColorKt.d(4286931972L);
            }
            TextStyle textStyle = new TextStyle(jD, 0L, null, null, null, 0L, null, 0, 0, 0L, null, 16777214);
            composer.A(textStyle);
            objG = textStyle;
        }
        TextStyle textStyle2 = (TextStyle) objG;
        composer.l();
        composer.l();
        return textStyle2;
    }
}
