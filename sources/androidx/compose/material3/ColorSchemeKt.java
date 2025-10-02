package androidx.compose.material3;

import androidx.compose.material3.tokens.ColorLightTokens;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ColorSchemeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1414a = new StaticProvidableCompositionLocal(ColorSchemeKt$LocalColorScheme$1.h);
    public static final StaticProvidableCompositionLocal b = new StaticProvidableCompositionLocal(ColorSchemeKt$LocalTonalElevationEnabled$1.h);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ColorSchemeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[13] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[17] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[18] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[42] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[19] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[20] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[23] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[24] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[29] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[30] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[31] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[34] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[43] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[35] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[36] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[37] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[38] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[39] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[40] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[41] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[44] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[45] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    public static final long a(ColorScheme colorScheme, long j) {
        long j2 = colorScheme.f1413a;
        long j3 = colorScheme.q;
        if (Color.c(j, j2)) {
            return colorScheme.b;
        }
        if (Color.c(j, colorScheme.f)) {
            return colorScheme.g;
        }
        if (Color.c(j, colorScheme.j)) {
            return colorScheme.k;
        }
        if (Color.c(j, colorScheme.n)) {
            return colorScheme.o;
        }
        if (Color.c(j, colorScheme.w)) {
            return colorScheme.x;
        }
        if (Color.c(j, colorScheme.c)) {
            return colorScheme.d;
        }
        if (Color.c(j, colorScheme.h)) {
            return colorScheme.i;
        }
        if (Color.c(j, colorScheme.l)) {
            return colorScheme.m;
        }
        if (Color.c(j, colorScheme.y)) {
            return colorScheme.z;
        }
        if (Color.c(j, colorScheme.u)) {
            return colorScheme.v;
        }
        if (Color.c(j, colorScheme.p)) {
            return j3;
        }
        if (Color.c(j, colorScheme.r)) {
            return colorScheme.s;
        }
        if (Color.c(j, colorScheme.D) || Color.c(j, colorScheme.F) || Color.c(j, colorScheme.G) || Color.c(j, colorScheme.H) || Color.c(j, colorScheme.I) || Color.c(j, colorScheme.J)) {
            return j3;
        }
        int i = Color.l;
        return Color.k;
    }

    public static final long b(long j, Composer composer) {
        composer.o(-1680936624);
        long jA = a(MaterialTheme.a(composer), j);
        if (jA == 16) {
            jA = ((Color) composer.x(ContentColorKt.f1427a)).f1766a;
        }
        composer.l();
        return jA;
    }

    public static final long c(ColorScheme colorScheme, ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (colorSchemeKeyTokens.ordinal()) {
            case 0:
                return colorScheme.n;
            case 1:
                return colorScheme.w;
            case 2:
                return colorScheme.y;
            case 3:
                return colorScheme.v;
            case 4:
                return colorScheme.e;
            case 5:
                return colorScheme.u;
            case 6:
                return colorScheme.o;
            case 7:
                return colorScheme.x;
            case 8:
                return colorScheme.z;
            case 9:
                return colorScheme.b;
            case 10:
                return colorScheme.d;
            case 11:
            case 12:
            case 15:
            case 16:
            case 21:
            case 22:
            case 27:
            case 28:
            case 32:
            case 33:
            default:
                int i = Color.l;
                return Color.k;
            case 13:
                return colorScheme.g;
            case 14:
                return colorScheme.i;
            case 17:
                return colorScheme.q;
            case 18:
                return colorScheme.s;
            case 19:
                return colorScheme.k;
            case 20:
                return colorScheme.m;
            case 23:
                return colorScheme.A;
            case 24:
                return colorScheme.B;
            case 25:
                return colorScheme.f1413a;
            case 26:
                return colorScheme.c;
            case 29:
                return colorScheme.C;
            case 30:
                return colorScheme.f;
            case 31:
                return colorScheme.h;
            case 34:
                return colorScheme.p;
            case 35:
                return colorScheme.D;
            case 36:
                return colorScheme.F;
            case 37:
                return colorScheme.G;
            case 38:
                return colorScheme.H;
            case 39:
                return colorScheme.I;
            case 40:
                return colorScheme.J;
            case 41:
                return colorScheme.E;
            case 42:
                return colorScheme.t;
            case 43:
                return colorScheme.r;
            case 44:
                return colorScheme.j;
            case 45:
                return colorScheme.l;
        }
    }

    public static final long d(ColorSchemeKeyTokens colorSchemeKeyTokens, Composer composer) {
        return c(MaterialTheme.a(composer), colorSchemeKeyTokens);
    }

    public static ColorScheme e(int i, long j, long j2, long j3) {
        long j4 = ColorLightTokens.t;
        return new ColorScheme(j4, ColorLightTokens.j, ColorLightTokens.u, (i & 8) != 0 ? ColorLightTokens.k : j, ColorLightTokens.e, ColorLightTokens.w, ColorLightTokens.l, ColorLightTokens.x, (i & 256) != 0 ? ColorLightTokens.m : j2, ColorLightTokens.H, ColorLightTokens.p, ColorLightTokens.I, (i & 4096) != 0 ? ColorLightTokens.q : j3, ColorLightTokens.f1573a, ColorLightTokens.g, ColorLightTokens.y, ColorLightTokens.n, ColorLightTokens.G, ColorLightTokens.o, j4, ColorLightTokens.f, ColorLightTokens.d, ColorLightTokens.b, ColorLightTokens.h, ColorLightTokens.c, ColorLightTokens.i, ColorLightTokens.r, ColorLightTokens.s, ColorLightTokens.v, ColorLightTokens.z, ColorLightTokens.F, ColorLightTokens.A, ColorLightTokens.B, ColorLightTokens.C, ColorLightTokens.D, ColorLightTokens.E);
    }
}
