package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlinedTextFieldDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final OutlinedTextFieldDefaults f1468a = new OutlinedTextFieldDefaults();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final boolean r28, final boolean r29, final androidx.compose.foundation.interaction.InteractionSource r30, androidx.compose.ui.Modifier r31, androidx.compose.material3.TextFieldColors r32, final androidx.compose.ui.graphics.Shape r33, float r34, float r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.a(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void b(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, final TextFieldColors textFieldColors, PaddingValues paddingValues, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        VisualTransformation visualTransformation2;
        final boolean z4;
        Function2 function26;
        Function2 function27;
        int i5;
        int i6;
        int i7;
        int i8;
        PaddingValues paddingValuesImpl;
        boolean z5;
        int i9;
        Function2 function28;
        PaddingValues paddingValues2;
        Function2 function29;
        Function2 function210;
        Function2 function211;
        ComposerImpl composerImpl;
        final Function2 function212;
        final Function2 function213;
        final Function2 function214;
        final PaddingValues paddingValues3;
        final Function2 function215;
        ComposerImpl composerImplV = composer.v(-350442135);
        if ((i & 6) == 0) {
            i4 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            visualTransformation2 = visualTransformation;
            i4 |= composerImplV.n(visualTransformation2) ? 16384 : 8192;
        } else {
            visualTransformation2 = visualTransformation;
        }
        int i10 = 65536;
        if ((i & 196608) == 0) {
            i4 |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i4 |= 1572864;
            z4 = z3;
        } else {
            z4 = z3;
            if ((i & 1572864) == 0) {
                i4 |= composerImplV.p(z4) ? 1048576 : 524288;
            }
        }
        int i12 = i3 & 128;
        if (i12 != 0) {
            i4 |= 12582912;
            function26 = function22;
        } else {
            function26 = function22;
            if ((i & 12582912) == 0) {
                i4 |= composerImplV.I(function26) ? 8388608 : 4194304;
            }
        }
        int i13 = i3 & 256;
        if (i13 != 0) {
            i4 |= 100663296;
            function27 = function23;
        } else {
            function27 = function23;
            if ((i & 100663296) == 0) {
                i4 |= composerImplV.I(function27) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 512) != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(null) ? 536870912 : 268435456;
        }
        int i14 = i3 & 1024;
        if (i14 != 0) {
            i5 = i2 | 6;
        } else {
            i5 = i2 | (composerImplV.I(function24) ? 4 : 2);
        }
        if ((i3 & 2048) != 0) {
            i6 = i5 | 48;
        } else {
            i6 = i5 | (composerImplV.I(null) ? 32 : 16);
        }
        if ((i3 & 4096) != 0) {
            i7 = i6 | KyberEngine.KyberPolyBytes;
        } else {
            i7 = i6 | (composerImplV.I(null) ? 256 : 128);
        }
        int i15 = i3 & 8192;
        if (i15 != 0) {
            i8 = i7 | 3072;
        } else {
            i8 = i7 | (composerImplV.I(function25) ? 2048 : 1024);
        }
        int i16 = i8 | (composerImplV.n(textFieldColors) ? 16384 : 8192);
        if ((i2 & 196608) == 0) {
            if ((i3 & 32768) == 0 && composerImplV.n(paddingValues)) {
                i10 = 131072;
            }
            i16 |= i10;
        }
        if ((i4 & 306783379) == 306783378 && (i16 & 4793491) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            function214 = function25;
            paddingValues3 = paddingValues;
            composerImpl = composerImplV;
            function212 = function26;
            function215 = function27;
            function213 = function24;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                boolean z6 = i11 != 0 ? false : z4;
                if (i12 != 0) {
                    function26 = null;
                }
                if (i13 != 0) {
                    function27 = null;
                }
                Function2 function216 = i14 != 0 ? null : function24;
                Function2 function217 = i15 != 0 ? null : function25;
                if ((i3 & 32768) != 0) {
                    float f = TextFieldImplKt.b;
                    paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                    i16 &= -458753;
                } else {
                    paddingValuesImpl = paddingValues;
                }
                int i17 = i16;
                z5 = z6;
                i9 = i17;
                function28 = function216;
                paddingValues2 = paddingValuesImpl;
                function29 = function26;
                function210 = function27;
                function211 = function217;
            } else {
                composerImplV.j();
                if ((i3 & 32768) != 0) {
                    i16 &= -458753;
                }
                function28 = function24;
                paddingValues2 = paddingValues;
                function29 = function26;
                i9 = i16;
                z5 = z4;
                function210 = function27;
                function211 = function25;
            }
            composerImplV.W();
            int i18 = i4 << 3;
            int i19 = i4 >> 3;
            int i20 = i4 >> 9;
            int i21 = i9 << 21;
            composerImpl = composerImplV;
            TextFieldImplKt.a(TextFieldType.e, str, function2, visualTransformation2, function29, function210, null, function28, null, null, function211, z2, z, z5, interactionSource, paddingValues2, textFieldColors, composableLambdaImpl, composerImpl, (i18 & 896) | (i18 & 112) | 6 | (i19 & 7168) | (i20 & 57344) | (i20 & 458752) | (i20 & 3670016) | (i21 & 29360128) | (i21 & 234881024) | (i21 & 1879048192), ((i9 << 6) & 3670016) | ((i9 >> 9) & 14) | ((i4 >> 6) & 112) | (i4 & 896) | (i20 & 7168) | (i19 & 57344) | (i9 & 458752) | 12582912);
            function212 = function29;
            function213 = function28;
            function214 = function211;
            paddingValues3 = paddingValues2;
            function215 = function210;
            z4 = z5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldDefaults$DecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int i22 = i3;
                    this.h.b(str, function2, z, z2, visualTransformation, interactionSource, z4, function212, function215, function213, function214, textFieldColors, paddingValues3, composableLambdaImpl, (Composer) obj, iA, iA2, i22);
                    return Unit.f24250a;
                }
            };
        }
    }
}
