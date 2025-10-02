package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.CornerSizeKt$ZeroCornerSize$1;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/TextFieldDefaults;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldDefaults f1339a = new TextFieldDefaults();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    public static CornerBasedShape d(Composer composer) {
        RoundedCornerShape roundedCornerShape = MaterialTheme.b(composer).f1321a;
        CornerSizeKt$ZeroCornerSize$1 cornerSizeKt$ZeroCornerSize$1 = CornerSizeKt.f1098a;
        return CornerBasedShape.c(roundedCornerShape, null, null, cornerSizeKt$ZeroCornerSize$1, cornerSizeKt$ZeroCornerSize$1, 3);
    }

    public static Modifier e(Modifier modifier, final boolean z, final boolean z2, final MutableInteractionSource mutableInteractionSource, final TextFieldColors textFieldColors) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
                TextFieldDefaults textFieldDefaults = TextFieldDefaults.f1339a;
                TextFieldDefaults textFieldDefaults2 = TextFieldDefaults.f1339a;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                ((Number) obj3).intValue();
                composer.o(1398930845);
                final BorderStroke borderStroke = (BorderStroke) TextFieldDefaultsKt.a(z, z2, mutableInteractionSource, textFieldColors, TextFieldDefaults.e, TextFieldDefaults.d, composer, 0).getD();
                float f = TextFieldKt.f1341a;
                final float f2 = borderStroke.f828a;
                Modifier modifierD = DrawModifierKt.d(Modifier.Companion.d, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ContentDrawScope contentDrawScope = (ContentDrawScope) obj4;
                        contentDrawScope.Q0();
                        float f3 = f2;
                        if (!Dp.a(f3, BitmapDescriptorFactory.HUE_RED)) {
                            float e2 = contentDrawScope.getE() * f3;
                            float fB = Size.b(contentDrawScope.h()) - (e2 / 2);
                            contentDrawScope.m1(borderStroke.b, OffsetKt.a(BitmapDescriptorFactory.HUE_RED, fB), OffsetKt.a(Size.d(contentDrawScope.h()), fB), e2, (496 & 16) != 0 ? 0 : 0, (496 & 64) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                        }
                        return Unit.f24250a;
                    }
                });
                composer.l();
                return modifierD;
            }
        });
    }

    public static TextFieldColors f(long j, long j2, long j3, long j4, Composer composer, int i) {
        long jB = Color.b(((Color) composer.x(ContentColorKt.f1261a)).f1766a, ((Number) composer.x(ContentAlphaKt.f1260a)).floatValue());
        long jB2 = Color.b(jB, ContentAlpha.a(0.38f, 0.38f, composer));
        long j5 = Color.j;
        long jE = MaterialTheme.a(composer).e();
        long jC = MaterialTheme.a(composer).c();
        long jB3 = (i & 32) != 0 ? Color.b(MaterialTheme.a(composer).e(), ContentAlpha.b(composer)) : j;
        long jB4 = (i & 64) != 0 ? Color.b(MaterialTheme.a(composer).d(), ContentAlpha.a(0.38f, 0.38f, composer)) : j2;
        long jB5 = Color.b(jB4, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC2 = (i & 256) != 0 ? MaterialTheme.a(composer).c() : j3;
        long j6 = jB4;
        long jB6 = Color.b(MaterialTheme.a(composer).d(), 0.54f);
        long jB7 = Color.b(jB6, ContentAlpha.a(0.38f, 0.38f, composer));
        long jB8 = Color.b(MaterialTheme.a(composer).d(), 0.54f);
        long jB9 = Color.b(jB8, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC3 = MaterialTheme.a(composer).c();
        long jB10 = (i & 32768) != 0 ? Color.b(MaterialTheme.a(composer).e(), ContentAlpha.b(composer)) : j4;
        long jB11 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.c(composer, 6));
        long jB12 = Color.b(jB11, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC4 = MaterialTheme.a(composer).c();
        long jB13 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.c(composer, 6));
        return new DefaultTextFieldColors(jB, jB2, jE, jC, jB3, j6, jC2, jB5, jB6, jB7, jB6, jB8, jB9, jC3, j5, jB10, jB11, jB12, jC4, jB13, Color.b(jB13, ContentAlpha.a(0.38f, 0.38f, composer)));
    }

    public static TextFieldColors g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Composer composer, int i) {
        long j9;
        long jB;
        long j10;
        long jB2;
        long jB3 = (i & 1) != 0 ? Color.b(((Color) composer.x(ContentColorKt.f1261a)).f1766a, ((Number) composer.x(ContentAlphaKt.f1260a)).floatValue()) : j;
        long jB4 = Color.b(jB3, ContentAlpha.a(0.38f, 0.38f, composer));
        long jB5 = (i & 4) != 0 ? Color.b(MaterialTheme.a(composer).d(), 0.12f) : j2;
        long jE = (i & 8) != 0 ? MaterialTheme.a(composer).e() : j3;
        long jC = MaterialTheme.a(composer).c();
        long jB6 = (i & 32) != 0 ? Color.b(MaterialTheme.a(composer).e(), ContentAlpha.b(composer)) : j4;
        long jB7 = (i & 64) != 0 ? Color.b(MaterialTheme.a(composer).d(), 0.42f) : j5;
        long jB8 = Color.b(jB7, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC2 = MaterialTheme.a(composer).c();
        long j11 = jB7;
        long jB9 = Color.b(MaterialTheme.a(composer).d(), 0.54f);
        long jB10 = Color.b(jB9, ContentAlpha.a(0.38f, 0.38f, composer));
        if ((i & 4096) != 0) {
            j9 = jB9;
            jB = Color.b(MaterialTheme.a(composer).d(), 0.54f);
        } else {
            j9 = jB9;
            jB = j6;
        }
        long jB11 = Color.b(jB, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC3 = MaterialTheme.a(composer).c();
        long jB12 = (i & 32768) != 0 ? Color.b(MaterialTheme.a(composer).e(), ContentAlpha.b(composer)) : j7;
        if ((i & 65536) != 0) {
            j10 = jB;
            jB2 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.c(composer, 6));
        } else {
            j10 = jB;
            jB2 = j8;
        }
        long jB13 = Color.b(jB2, ContentAlpha.a(0.38f, 0.38f, composer));
        long jC4 = MaterialTheme.a(composer).c();
        long j12 = jB2;
        long jB14 = Color.b(MaterialTheme.a(composer).d(), ContentAlpha.c(composer, 6));
        return new DefaultTextFieldColors(jB3, jB4, jE, jC, jB6, j11, jC2, jB8, j9, jB10, j9, j10, jB11, jC3, jB5, jB12, j12, jB13, jC4, jB14, Color.b(jB14, ContentAlpha.a(0.38f, 0.38f, composer)));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final boolean r20, final boolean r21, final androidx.compose.foundation.interaction.InteractionSource r22, final androidx.compose.material.TextFieldColors r23, androidx.compose.ui.graphics.Shape r24, float r25, float r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldDefaults.a(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void b(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, final boolean z3, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Shape shape, final TextFieldColors textFieldColors, PaddingValues paddingValues, final Function2 function26, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function2 function27;
        boolean z4;
        boolean z5;
        VisualTransformation visualTransformation2;
        int i5;
        ComposerImpl composerImpl;
        final PaddingValues paddingValues2;
        PaddingValues paddingValuesImpl;
        PaddingValues paddingValues3;
        ComposerImpl composerImplV = composer.v(-920823490);
        if ((i & 6) == 0) {
            i4 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            function27 = function2;
            i4 |= composerImplV.I(function27) ? 32 : 16;
        } else {
            function27 = function2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z4 = z;
            i4 |= composerImplV.p(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        if ((i & 3072) == 0) {
            z5 = z2;
            i4 |= composerImplV.p(z5) ? 2048 : 1024;
        } else {
            z5 = z2;
        }
        if ((i & 24576) == 0) {
            visualTransformation2 = visualTransformation;
            i4 |= composerImplV.n(visualTransformation2) ? 16384 : 8192;
        } else {
            visualTransformation2 = visualTransformation;
        }
        if ((i & 196608) == 0) {
            i4 |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerImplV.p(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(function22) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerImplV.I(function23) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(function24) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.I(function25) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.n(shape) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.n(textFieldColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= ((i3 & 8192) == 0 && composerImplV.n(paddingValues)) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.I(function26) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= composerImplV.n(this) ? 131072 : 65536;
        }
        int i6 = i5;
        if (composerImplV.z(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i6) == 74898) ? false : true)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i3 & 8192) != 0) {
                    float f = TextFieldImplKt.f1340a;
                    paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                    i6 &= -7169;
                } else {
                    paddingValuesImpl = paddingValues;
                }
                paddingValues3 = paddingValuesImpl;
            } else {
                composerImplV.j();
                if ((i3 & 8192) != 0) {
                    i6 &= -7169;
                }
                paddingValues3 = paddingValues;
            }
            composerImplV.W();
            int i7 = i4 << 3;
            int i8 = i6;
            int i9 = ((i4 >> 3) & 7168) | (i7 & 112) | 6 | (i7 & 896);
            int i10 = i4 >> 9;
            int i11 = i9 | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | ((i8 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192);
            int i12 = i8 << 6;
            composerImpl = composerImplV;
            TextFieldImplKt.a(TextFieldType.e, str, function27, visualTransformation2, function22, function23, function24, function25, z5, z4, z3, interactionSource, paddingValues3, shape, textFieldColors, function26, composerImpl, i11, ((i4 >> 18) & 14) | ((i4 >> 12) & 112) | ((i8 >> 3) & 896) | (i12 & 7168) | (i12 & 57344) | ((i8 << 3) & 458752));
            paddingValues2 = paddingValues3;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$OutlinedTextFieldDecorationBox$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int i13 = i3;
                    this.h.b(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, shape, textFieldColors, paddingValues2, function26, (Composer) obj, iA, iA2, i13);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final void c(final String str, final Function2 function2, final boolean z, final boolean z2, final VisualTransformation visualTransformation, final InteractionSource interactionSource, final boolean z3, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final Shape shape, final TextFieldColors textFieldColors, PaddingValues paddingValues, Composer composer, final int i, final int i2, final int i3) {
        String str2;
        int i4;
        Function2 function26;
        boolean z4;
        VisualTransformation visualTransformation2;
        int i5;
        ComposerImpl composerImpl;
        final PaddingValues paddingValues2;
        PaddingValues paddingValuesImpl;
        ComposerImpl composerImplV = composer.v(-1391531252);
        if ((i & 6) == 0) {
            str2 = str;
            i4 = (composerImplV.n(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i4 = i;
        }
        if ((i & 48) == 0) {
            function26 = function2;
            i4 |= composerImplV.I(function26) ? 32 : 16;
        } else {
            function26 = function2;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            z4 = z;
            i4 |= composerImplV.p(z4) ? 256 : 128;
        } else {
            z4 = z;
        }
        int i6 = 1024;
        if ((i & 3072) == 0) {
            i4 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            visualTransformation2 = visualTransformation;
            i4 |= composerImplV.n(visualTransformation2) ? 16384 : 8192;
        } else {
            visualTransformation2 = visualTransformation;
        }
        if ((i & 196608) == 0) {
            i4 |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= composerImplV.p(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= composerImplV.I(function22) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= composerImplV.I(function23) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i4 |= composerImplV.I(function24) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.I(function25) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.n(shape) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.n(textFieldColors) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8192) == 0 && composerImplV.n(paddingValues)) {
                i6 = 2048;
            }
            i5 |= i6;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.n(this) ? 16384 : 8192;
        }
        int i7 = i5;
        if (composerImplV.z(i4 & 1, ((i4 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i3 & 8192) != 0) {
                    if (function22 == null) {
                        float f = TextFieldImplKt.f1340a;
                        composerImpl = composerImplV;
                        paddingValuesImpl = new PaddingValuesImpl(f, f, f, f);
                    } else {
                        float f2 = TextFieldImplKt.f1340a;
                        composerImpl = composerImplV;
                        paddingValuesImpl = new PaddingValuesImpl(f2, TextFieldKt.f1341a, f2, TextFieldKt.b);
                    }
                    i7 &= -7169;
                }
                composerImpl.W();
                int i8 = i7;
                int i9 = i4 << 3;
                int i10 = i4 >> 9;
                int i11 = (i9 & 896) | (i9 & 112) | 6 | ((i4 >> 3) & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | ((i8 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192);
                int i12 = ((i4 >> 18) & 14) | 196608 | ((i4 >> 12) & 112) | ((i8 >> 3) & 896);
                int i13 = i8 << 6;
                Function2 function27 = function26;
                boolean z5 = z4;
                PaddingValues paddingValues3 = paddingValuesImpl;
                TextFieldImplKt.a(TextFieldType.d, str2, function27, visualTransformation2, function22, function23, function24, function25, z2, z5, z3, interactionSource, paddingValues3, shape, textFieldColors, null, composerImpl, i11, i12 | (i13 & 7168) | (i13 & 57344));
                paddingValues2 = paddingValues3;
            } else {
                composerImplV.j();
                if ((i3 & 8192) != 0) {
                    i7 &= -7169;
                }
            }
            composerImpl = composerImplV;
            paddingValuesImpl = paddingValues;
            composerImpl.W();
            int i82 = i7;
            int i92 = i4 << 3;
            int i102 = i4 >> 9;
            int i112 = (i92 & 896) | (i92 & 112) | 6 | ((i4 >> 3) & 7168) | (i102 & 57344) | (i102 & 458752) | (i102 & 3670016) | ((i82 << 21) & 29360128) | ((i4 << 15) & 234881024) | ((i4 << 21) & 1879048192);
            int i122 = ((i4 >> 18) & 14) | 196608 | ((i4 >> 12) & 112) | ((i82 >> 3) & 896);
            int i132 = i82 << 6;
            Function2 function272 = function26;
            boolean z52 = z4;
            PaddingValues paddingValues32 = paddingValuesImpl;
            TextFieldImplKt.a(TextFieldType.d, str2, function272, visualTransformation2, function22, function23, function24, function25, z2, z52, z3, interactionSource, paddingValues32, shape, textFieldColors, null, composerImpl, i112, i122 | (i132 & 7168) | (i132 & 57344));
            paddingValues2 = paddingValues32;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            paddingValues2 = paddingValues;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldDefaults$TextFieldDecorationBox$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    int i14 = i3;
                    this.h.c(str, function2, z, z2, visualTransformation, interactionSource, z3, function22, function23, function24, function25, shape, textFieldColors, paddingValues2, (Composer) obj, iA, iA2, i14);
                    return Unit.f24250a;
                }
            };
        }
    }
}
