package androidx.compose.ui.graphics;

import android.graphics.PorterDuff;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                android.graphics.BlendMode unused = android.graphics.BlendMode.CLEAR;
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                android.graphics.BlendMode unused3 = android.graphics.BlendMode.SRC;
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                android.graphics.BlendMode unused5 = android.graphics.BlendMode.DST;
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                android.graphics.BlendMode unused7 = android.graphics.BlendMode.SRC_OVER;
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                android.graphics.BlendMode unused9 = android.graphics.BlendMode.DST_OVER;
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                android.graphics.BlendMode unused11 = android.graphics.BlendMode.SRC_IN;
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                android.graphics.BlendMode unused13 = android.graphics.BlendMode.DST_IN;
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                android.graphics.BlendMode unused15 = android.graphics.BlendMode.SRC_OUT;
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                android.graphics.BlendMode unused17 = android.graphics.BlendMode.DST_OUT;
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                android.graphics.BlendMode unused19 = android.graphics.BlendMode.SRC_ATOP;
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                android.graphics.BlendMode unused21 = android.graphics.BlendMode.DST_ATOP;
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                android.graphics.BlendMode unused23 = android.graphics.BlendMode.XOR;
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                android.graphics.BlendMode unused25 = android.graphics.BlendMode.PLUS;
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                android.graphics.BlendMode unused27 = android.graphics.BlendMode.MODULATE;
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                android.graphics.BlendMode unused29 = android.graphics.BlendMode.SCREEN;
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                android.graphics.BlendMode unused31 = android.graphics.BlendMode.OVERLAY;
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                android.graphics.BlendMode unused33 = android.graphics.BlendMode.DARKEN;
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                android.graphics.BlendMode unused35 = android.graphics.BlendMode.LIGHTEN;
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                android.graphics.BlendMode unused37 = android.graphics.BlendMode.COLOR_DODGE;
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                android.graphics.BlendMode unused39 = android.graphics.BlendMode.COLOR_BURN;
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                android.graphics.BlendMode unused41 = android.graphics.BlendMode.HARD_LIGHT;
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                android.graphics.BlendMode unused43 = android.graphics.BlendMode.SOFT_LIGHT;
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                android.graphics.BlendMode unused45 = android.graphics.BlendMode.DIFFERENCE;
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                android.graphics.BlendMode unused47 = android.graphics.BlendMode.EXCLUSION;
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                android.graphics.BlendMode unused49 = android.graphics.BlendMode.MULTIPLY;
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                android.graphics.BlendMode unused51 = android.graphics.BlendMode.HUE;
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                android.graphics.BlendMode unused53 = android.graphics.BlendMode.SATURATION;
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                android.graphics.BlendMode unused55 = android.graphics.BlendMode.COLOR;
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                android.graphics.BlendMode unused57 = android.graphics.BlendMode.LUMINOSITY;
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (NoSuchFieldError unused58) {
            }
        }
    }

    public static final android.graphics.BlendMode a(int i) {
        return i == 0 ? android.graphics.BlendMode.CLEAR : i == 1 ? android.graphics.BlendMode.SRC : i == 2 ? android.graphics.BlendMode.DST : i == 3 ? android.graphics.BlendMode.SRC_OVER : i == 4 ? android.graphics.BlendMode.DST_OVER : i == 5 ? android.graphics.BlendMode.SRC_IN : i == 6 ? android.graphics.BlendMode.DST_IN : i == 7 ? android.graphics.BlendMode.SRC_OUT : i == 8 ? android.graphics.BlendMode.DST_OUT : i == 9 ? android.graphics.BlendMode.SRC_ATOP : i == 10 ? android.graphics.BlendMode.DST_ATOP : i == 11 ? android.graphics.BlendMode.XOR : i == 12 ? android.graphics.BlendMode.PLUS : i == 13 ? android.graphics.BlendMode.MODULATE : i == 14 ? android.graphics.BlendMode.SCREEN : i == 15 ? android.graphics.BlendMode.OVERLAY : i == 16 ? android.graphics.BlendMode.DARKEN : i == 17 ? android.graphics.BlendMode.LIGHTEN : i == 18 ? android.graphics.BlendMode.COLOR_DODGE : i == 19 ? android.graphics.BlendMode.COLOR_BURN : i == 20 ? android.graphics.BlendMode.HARD_LIGHT : i == 21 ? android.graphics.BlendMode.SOFT_LIGHT : i == 22 ? android.graphics.BlendMode.DIFFERENCE : i == 23 ? android.graphics.BlendMode.EXCLUSION : i == 24 ? android.graphics.BlendMode.MULTIPLY : i == 25 ? android.graphics.BlendMode.HUE : i == 26 ? android.graphics.BlendMode.SATURATION : i == 27 ? android.graphics.BlendMode.COLOR : i == 28 ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode b(int i) {
        return i == 0 ? PorterDuff.Mode.CLEAR : i == 1 ? PorterDuff.Mode.SRC : i == 2 ? PorterDuff.Mode.DST : i == 3 ? PorterDuff.Mode.SRC_OVER : i == 4 ? PorterDuff.Mode.DST_OVER : i == 5 ? PorterDuff.Mode.SRC_IN : i == 6 ? PorterDuff.Mode.DST_IN : i == 7 ? PorterDuff.Mode.SRC_OUT : i == 8 ? PorterDuff.Mode.DST_OUT : i == 9 ? PorterDuff.Mode.SRC_ATOP : i == 10 ? PorterDuff.Mode.DST_ATOP : i == 11 ? PorterDuff.Mode.XOR : i == 12 ? PorterDuff.Mode.ADD : i == 14 ? PorterDuff.Mode.SCREEN : i == 15 ? PorterDuff.Mode.OVERLAY : i == 16 ? PorterDuff.Mode.DARKEN : i == 17 ? PorterDuff.Mode.LIGHTEN : i == 13 ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
