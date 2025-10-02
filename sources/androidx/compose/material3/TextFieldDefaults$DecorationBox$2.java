package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TextFieldDefaults$DecorationBox$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ TextFieldDefaults h;
    public final /* synthetic */ String i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ VisualTransformation m;
    public final /* synthetic */ InteractionSource n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Function2 q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ Function2 s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ Function2 v;
    public final /* synthetic */ Shape w;
    public final /* synthetic */ TextFieldColors x;
    public final /* synthetic */ PaddingValues y;
    public final /* synthetic */ Function2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$DecorationBox$2(TextFieldDefaults textFieldDefaults, String str, Function2 function2, boolean z, boolean z2, VisualTransformation visualTransformation, InteractionSource interactionSource, boolean z3, Function2 function22, Function2 function23, Function2 function24, Function2 function25, Function2 function26, Function2 function27, Function2 function28, Shape shape, TextFieldColors textFieldColors, PaddingValues paddingValues, Function2 function29, int i, int i2, int i3) {
        super(2);
        this.h = textFieldDefaults;
        this.i = str;
        this.j = function2;
        this.k = z;
        this.l = z2;
        this.m = visualTransformation;
        this.n = interactionSource;
        this.o = z3;
        this.p = function22;
        this.q = function23;
        this.r = function24;
        this.s = function25;
        this.t = function26;
        this.u = function27;
        this.v = function28;
        this.w = shape;
        this.x = textFieldColors;
        this.y = paddingValues;
        this.z = function29;
        this.A = i;
        this.B = i2;
        this.C = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        final Shape shape;
        Function2 function2;
        Function2 function22;
        boolean z2;
        PaddingValues paddingValues;
        Function2 function2C;
        Function2 function23;
        Function2 function24;
        int i5;
        PaddingValuesImpl paddingValuesImpl;
        ComposerImpl composerImpl;
        Function2 function25;
        Function2 function26;
        Shape shape2;
        Function2 function27;
        Function2 function28;
        Function2 function29;
        Function2 function210;
        boolean z3;
        PaddingValues paddingValues2;
        Function2 function211;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.A | 1);
        int iA2 = RecomposeScopeImplKt.a(this.B);
        ComposerImpl composerImplV = ((Composer) obj).v(289640444);
        int i6 = iA & 6;
        String str = this.i;
        if (i6 == 0) {
            i = (composerImplV.n(str) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i7 = iA & 48;
        Function2 function212 = this.j;
        if (i7 == 0) {
            i |= composerImplV.I(function212) ? 32 : 16;
        }
        int i8 = iA & KyberEngine.KyberPolyBytes;
        final boolean z4 = this.k;
        if (i8 == 0) {
            i |= composerImplV.p(z4) ? 256 : 128;
        }
        int i9 = iA & 3072;
        boolean z5 = this.l;
        if (i9 == 0) {
            i |= composerImplV.p(z5) ? 2048 : 1024;
        }
        int i10 = iA & 24576;
        VisualTransformation visualTransformation = this.m;
        if (i10 == 0) {
            i |= composerImplV.n(visualTransformation) ? 16384 : 8192;
        }
        int i11 = 196608 & iA;
        final InteractionSource interactionSource = this.n;
        if (i11 == 0) {
            i |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        int i12 = this.C;
        int i13 = i12 & 64;
        boolean z6 = this.o;
        int i14 = 524288;
        int i15 = 1572864;
        if (i13 != 0) {
            i |= i15;
        } else if ((iA & 1572864) == 0) {
            i15 = composerImplV.p(z6) ? 1048576 : 524288;
            i |= i15;
        }
        int i16 = i12 & 128;
        Function2 function213 = this.p;
        if (i16 != 0) {
            i |= 12582912;
        } else if ((iA & 12582912) == 0) {
            i |= composerImplV.I(function213) ? 8388608 : 4194304;
        }
        int i17 = iA & 100663296;
        Function2 function214 = this.q;
        if (i17 == 0) {
            i |= composerImplV.I(function214) ? 67108864 : 33554432;
        }
        int i18 = iA & 805306368;
        Function2 function215 = this.r;
        if (i18 == 0) {
            i |= composerImplV.I(function215) ? 536870912 : 268435456;
        }
        Function2 function216 = function215;
        Function2 function217 = this.s;
        int i19 = iA2 | (composerImplV.I(function217) ? 4 : 2);
        int i20 = i12 & 2048;
        Function2 function218 = this.t;
        if (i20 != 0) {
            i2 = i19 | 48;
        } else {
            i2 = i19 | (composerImplV.I(function218) ? 32 : 16);
        }
        int i21 = i2;
        int i22 = i12 & 4096;
        Function2 function219 = this.u;
        if (i22 != 0) {
            i3 = i21 | KyberEngine.KyberPolyBytes;
        } else {
            i3 = i21 | (composerImplV.I(function219) ? 256 : 128);
        }
        Function2 function220 = function219;
        int i23 = i12 & 8192;
        Function2 function221 = this.v;
        if (i23 != 0) {
            i4 = i3 | 3072;
        } else {
            i4 = i3 | (composerImplV.I(function221) ? 2048 : 1024);
        }
        Shape shape3 = this.w;
        int i24 = i4 | (composerImplV.n(shape3) ? 16384 : 8192);
        final TextFieldColors textFieldColors = this.x;
        int i25 = i24 | (composerImplV.n(textFieldColors) ? 131072 : 65536);
        int i26 = i12 & 65536;
        PaddingValues paddingValues3 = this.y;
        if (i26 == 0 && composerImplV.n(paddingValues3)) {
            i14 = 1048576;
        }
        int i27 = i25 | i14;
        int i28 = i12 & 131072;
        PaddingValues paddingValues4 = paddingValues3;
        Function2 function222 = this.z;
        if (i28 != 0) {
            i27 |= 12582912;
        } else if ((iA2 & 12582912) == 0) {
            i27 |= composerImplV.I(function222) ? 8388608 : 4194304;
        }
        if ((i & 306783379) == 306783378 && (i27 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            z3 = z6;
            function25 = function212;
            z = z4;
            function210 = function221;
            shape2 = shape3;
            paddingValues2 = paddingValues4;
            function211 = function222;
            function29 = function220;
            function27 = function213;
            function28 = function218;
            function26 = function214;
        } else {
            composerImplV.u0();
            if ((iA & 1) == 0 || composerImplV.c0()) {
                if (i13 != 0) {
                    z6 = false;
                }
                if (i16 != 0) {
                    function213 = null;
                }
                Function2 function223 = i20 != 0 ? null : function218;
                if (i22 != 0) {
                    function220 = null;
                }
                Function2 function224 = i23 == 0 ? function221 : null;
                if (i26 != 0) {
                    if (function213 == null) {
                        float f = TextFieldImplKt.b;
                        paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                        i5 = -3670017;
                    } else {
                        float f2 = TextFieldImplKt.b;
                        float f3 = TextFieldKt.f1516a;
                        i5 = -3670017;
                        paddingValuesImpl = new PaddingValuesImpl(f2, f3, f2, f3);
                    }
                    i27 &= i5;
                    paddingValues4 = paddingValuesImpl;
                }
                if (i28 != 0) {
                    final boolean z7 = z6;
                    shape = shape3;
                    z = z4;
                    function2 = function224;
                    function2C = ComposableLambdaKt.c(-435523791, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TextFieldDefaults$DecorationBox$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                                composer.j();
                            } else {
                                TextFieldDefaults.f1515a.a(z4, z7, interactionSource, textFieldColors, shape, composer, 114822144);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV);
                    function22 = function213;
                    z2 = z7;
                    paddingValues = paddingValues4;
                } else {
                    z = z4;
                    shape = shape3;
                    function2 = function224;
                    function22 = function213;
                    z2 = z6;
                    paddingValues = paddingValues4;
                    function2C = function222;
                }
                function23 = function220;
                function24 = function223;
            } else {
                composerImplV.j();
                if (i26 != 0) {
                    i27 &= -3670017;
                }
                z2 = z6;
                function22 = function213;
                z = z4;
                function2 = function221;
                shape = shape3;
                paddingValues = paddingValues4;
                function2C = function222;
                function23 = function220;
                function24 = function218;
            }
            composerImplV.W();
            int i29 = i << 3;
            int i30 = i >> 3;
            int i31 = i >> 9;
            int i32 = i27 << 21;
            composerImpl = composerImplV;
            TextFieldImplKt.a(TextFieldType.d, str, function212, visualTransformation, function22, function214, function216, function217, function24, function23, function2, z5, z, z2, interactionSource, paddingValues, textFieldColors, function2C, composerImpl, (i29 & 896) | (i29 & 112) | 6 | (i30 & 7168) | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | (i32 & 29360128) | (i32 & 234881024) | (i32 & 1879048192), ((i27 >> 9) & 14) | ((i >> 6) & 112) | (i & 896) | (i31 & 7168) | (i30 & 57344) | ((i27 >> 3) & 458752) | ((i27 << 3) & 3670016) | (i27 & 29360128));
            function25 = function212;
            function26 = function214;
            function216 = function216;
            shape2 = shape;
            function27 = function22;
            function28 = function24;
            function29 = function23;
            function210 = function2;
            z3 = z2;
            paddingValues2 = paddingValues;
            function211 = function2C;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new TextFieldDefaults$DecorationBox$2(this.h, str, function25, z, z5, visualTransformation, interactionSource, z3, function27, function26, function216, function217, function28, function29, function210, shape2, textFieldColors, paddingValues2, function211, iA, iA2, i12);
        }
        return Unit.f24250a;
    }
}
