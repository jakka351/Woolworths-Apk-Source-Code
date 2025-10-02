package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.DpSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SliderDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final SliderDefaults f1497a = new SliderDefaults();
    public static final float b;
    public static final float c;
    public static final AndroidPath d;

    static {
        float f = SliderTokens.e;
        b = f;
        c = f;
        d = AndroidPath_androidKt.a();
    }

    public static final void d(DrawScope drawScope, long j, float f, long j2) {
        DrawScope.j0(drawScope, j2, drawScope.T1(f) / 2.0f, j, null, 0, 120);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(androidx.compose.ui.graphics.drawscope.DrawScope r26, float[] r27, float r28, float r29, long r30, long r32, long r34, long r36, float r38, float r39, float r40, float r41, float r42, kotlin.jvm.functions.Function2 r43, kotlin.jvm.functions.Function3 r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.e(androidx.compose.ui.graphics.drawscope.DrawScope, float[], float, float, long, long, long, long, float, float, float, float, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, boolean):void");
    }

    public static SliderColors f(Composer composer) {
        ColorScheme colorSchemeA = MaterialTheme.a(composer);
        SliderColors sliderColors = colorSchemeA.Q;
        if (sliderColors != null) {
            return sliderColors;
        }
        float f = SliderTokens.f1604a;
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.p;
        long jC = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens);
        long jC2 = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.t;
        long jC3 = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2);
        long jC4 = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2);
        long jC5 = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.k;
        SliderColors sliderColors2 = new SliderColors(jC, jC2, jC3, jC4, jC5, ColorKt.g(Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.38f), colorSchemeA.p), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.38f), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.12f), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.12f), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.38f));
        colorSchemeA.Q = sliderColors2;
        return sliderColors2;
    }

    public static void g(DrawScope drawScope, long j, long j2, long j3, float f, float f2) {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long jFloatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        RoundRect roundRectA = RoundRectKt.a(RectKt.a(OffsetKt.a(Offset.e(j), BitmapDescriptorFactory.HUE_RED), SizeKt.a(Size.d(j2), Size.b(j2))), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        AndroidPath androidPath = d;
        Path.k(androidPath, roundRectA);
        DrawScope.Z(drawScope, androidPath, j3, BitmapDescriptorFactory.HUE_RED, null, 60);
        androidPath.o();
    }

    public final void a(final MutableInteractionSource mutableInteractionSource, Modifier modifier, final SliderColors sliderColors, final boolean z, long j, Composer composer, final int i) {
        int i2;
        long j2;
        Modifier modifier2;
        long jFloatToRawIntBits;
        final long j3;
        final Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-290277409);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(mutableInteractionSource) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48 | (composerImplV.n(sliderColors) ? 256 : 128) | (composerImplV.p(z) ? 2048 : 1024) | 24576;
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            j3 = j;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                j2 = SliderKt.c;
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                modifier2 = modifier;
                j2 = j;
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new SnapshotStateList();
                composerImplV.A(objG);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objG;
            boolean z2 = (i3 & 14) == 4;
            Object objG2 = composerImplV.G();
            if (z2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                composerImplV.A(objG2);
            }
            EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG2);
            if (snapshotStateList.isEmpty()) {
                jFloatToRawIntBits = j2;
            } else {
                jFloatToRawIntBits = (Float.floatToRawIntBits(DpSize.b(j2) / 2) << 32) | (Float.floatToRawIntBits(DpSize.a(j2)) & 4294967295L);
            }
            FillElement fillElement = androidx.compose.foundation.layout.SizeKt.f977a;
            Modifier modifierA = HoverableKt.a(androidx.compose.foundation.layout.SizeKt.r(modifier2, DpSize.b(jFloatToRawIntBits), DpSize.a(jFloatToRawIntBits)), mutableInteractionSource);
            long j4 = z ? sliderColors.f1496a : sliderColors.f;
            float f = SliderTokens.f1604a;
            SpacerKt.a(composerImplV, BackgroundKt.b(modifierA, j4, ShapesKt.b(ShapeKeyTokens.g, composerImplV)));
            j3 = j2;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    this.h.a(mutableInteractionSource, modifier3, sliderColors, z, j3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(final androidx.compose.material3.RangeSliderState r22, androidx.compose.ui.Modifier r23, final boolean r24, final androidx.compose.material3.SliderColors r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function3 r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.b(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0120 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final androidx.compose.material3.SliderState r22, androidx.compose.ui.Modifier r23, final boolean r24, final androidx.compose.material3.SliderColors r25, kotlin.jvm.functions.Function2 r26, kotlin.jvm.functions.Function3 r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.c(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
