package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1345a = new DynamicProvidableCompositionLocal(TextKt$LocalTextStyle$1.h);

    public static final void a(final TextStyle textStyle, final Function2 function2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(1772272796);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(textStyle) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f1345a;
            CompositionLocalKt.a(dynamicProvidableCompositionLocal.b(((TextStyle) composerImplV.x(dynamicProvidableCompositionLocal)).d(textStyle)), function2, composerImplV, (i2 & 112) | 8);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextKt$ProvideTextStyle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    TextKt.a(textStyle, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:253:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r41, androidx.compose.ui.Modifier r42, long r43, long r45, androidx.compose.ui.text.font.FontWeight r47, long r48, androidx.compose.ui.text.style.TextDecoration r50, androidx.compose.ui.text.style.TextAlign r51, long r52, int r54, boolean r55, int r56, int r57, kotlin.jvm.functions.Function1 r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.b(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontWeight, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.ui.text.AnnotatedString r43, androidx.compose.ui.Modifier r44, long r45, long r47, androidx.compose.ui.text.font.FontStyle r49, androidx.compose.ui.text.font.FontWeight r50, androidx.compose.ui.text.font.FontFamily r51, long r52, androidx.compose.ui.text.style.TextDecoration r54, androidx.compose.ui.text.style.TextAlign r55, long r56, int r58, boolean r59, int r60, int r61, java.util.Map r62, kotlin.jvm.functions.Function1 r63, androidx.compose.ui.text.TextStyle r64, androidx.compose.runtime.Composer r65, final int r66, final int r67, final int r68) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.c(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void d(Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, Function1 function1, TextStyle textStyle, Composer composer, final int i3) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i4;
        final boolean z2;
        final int i5;
        final Function1 function12;
        final TextStyle textStyle2;
        long j9;
        TextStyle textStyle3;
        int i6;
        boolean z3;
        long j10;
        int i7;
        Function1 function13;
        long j11;
        long j12;
        Modifier modifier3;
        ComposerImpl composerImplV = composer.v(-366126944);
        int i8 = i3 | 920350128;
        if (composerImplV.z(i8 & 1, (306783379 & i8) != 306783378)) {
            composerImplV.u0();
            if ((i3 & 1) == 0 || composerImplV.c0()) {
                long j13 = Color.k;
                j9 = TextUnit.c;
                TextStyle textStyle4 = (TextStyle) composerImplV.x(f1345a);
                Modifier.Companion companion = Modifier.Companion.d;
                textStyle3 = textStyle4;
                i6 = 1;
                z3 = true;
                j10 = j9;
                i7 = Integer.MAX_VALUE;
                function13 = TextKt$Text$3.h;
                j11 = j13;
                j12 = j10;
                modifier3 = companion;
            } else {
                composerImplV.j();
                modifier3 = modifier;
                j11 = j;
                j9 = j2;
                j12 = j3;
                j10 = j4;
                i6 = i;
                z3 = z;
                i7 = i2;
                function13 = function1;
                textStyle3 = textStyle;
            }
            composerImplV.W();
            composerImpl = composerImplV;
            b("Next", modifier3, j11, j9, null, j12, null, null, j10, i6, z3, i7, 1, function13, textStyle3, composerImpl, 920350134, 224694, 0);
            modifier2 = modifier3;
            j5 = j11;
            j6 = j9;
            j7 = j12;
            j8 = j10;
            i4 = i6;
            z2 = z3;
            i5 = i7;
            function12 = function13;
            textStyle2 = textStyle3;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            modifier2 = modifier;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i4 = i;
            z2 = z;
            i5 = i2;
            function12 = function1;
            textStyle2 = textStyle;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(j5, j6, j7, j8, i4, z2, i5, function12, textStyle2, i3) { // from class: androidx.compose.material.TextKt$Text$4
                public final /* synthetic */ long i;
                public final /* synthetic */ long j;
                public final /* synthetic */ long k;
                public final /* synthetic */ long l;
                public final /* synthetic */ int m;
                public final /* synthetic */ boolean n;
                public final /* synthetic */ int o;
                public final /* synthetic */ Function1 p;
                public final /* synthetic */ TextStyle q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(7);
                    TextKt.d(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
