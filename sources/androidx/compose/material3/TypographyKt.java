package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TypographyKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1530a = new StaticProvidableCompositionLocal(TypographyKt$LocalTypography$1.h);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[4] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[5] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[6] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[7] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[8] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[12] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[13] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[14] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[0] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[1] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[2] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[9] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[10] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[11] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static final TextStyle a(TypographyKeyTokens typographyKeyTokens, Composer composer) {
        Typography typographyB = MaterialTheme.b(composer);
        switch (typographyKeyTokens.ordinal()) {
            case 0:
                return typographyB.j;
            case 1:
                return typographyB.k;
            case 2:
                return typographyB.l;
            case 3:
                return typographyB.f1529a;
            case 4:
                return typographyB.b;
            case 5:
                return typographyB.c;
            case 6:
                return typographyB.d;
            case 7:
                return typographyB.e;
            case 8:
                return typographyB.f;
            case 9:
                return typographyB.m;
            case 10:
                return typographyB.n;
            case 11:
                return typographyB.o;
            case 12:
                return typographyB.g;
            case 13:
                return typographyB.h;
            case 14:
                return typographyB.i;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
