package com.halilibo.richtext.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class InfoPanelKt$DefaultInfoPanelBackground$1 implements Function3<InfoPanelType, Composer, Integer, Modifier> {
    public static final InfoPanelKt$DefaultInfoPanelBackground$1 d = new InfoPanelKt$DefaultInfoPanelBackground$1();

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
        Pair pair;
        InfoPanelType infoPanelType = (InfoPanelType) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        Intrinsics.h(infoPanelType, "infoPanelType");
        composer.o(-1998730632);
        composer.o(-666834869);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            int iOrdinal = infoPanelType.ordinal();
            if (iOrdinal == 0) {
                pair = new Pair(new Color(ColorKt.d(4290304767L)), new Color(ColorKt.d(4291618303L)));
            } else if (iOrdinal == 1) {
                pair = new Pair(new Color(ColorKt.d(4292270299L)), new Color(ColorKt.d(4293059557L)));
            } else if (iOrdinal == 2) {
                pair = new Pair(new Color(ColorKt.d(4291028683L)), new Color(ColorKt.d(4292144602L)));
            } else if (iOrdinal == 3) {
                pair = new Pair(new Color(ColorKt.d(4294297291L)), new Color(ColorKt.d(4294498266L)));
            } else {
                if (iOrdinal != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                pair = new Pair(new Color(ColorKt.d(4294962874L)), new Color(ColorKt.d(4294964173L)));
            }
            long j = ((Color) pair.d).f1766a;
            float f = 4;
            objG = BackgroundKt.b(BorderKt.a(Modifier.Companion.d, 1, j, RoundedCornerShapeKt.b(f)), ((Color) pair.e).f1766a, RoundedCornerShapeKt.b(f));
            composer.A(objG);
        }
        Modifier modifier = (Modifier) objG;
        composer.l();
        composer.l();
        return modifier;
    }
}
