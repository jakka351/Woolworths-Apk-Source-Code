package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutIdParentData;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldImplKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1340a = 16;
    public static final float b = 12;

    public static final void a(final TextFieldType textFieldType, final String str, final Function2 function2, final VisualTransformation visualTransformation, final Function2 function22, final Function2 function23, final Function2 function24, final Function2 function25, final boolean z, final boolean z2, final boolean z3, final InteractionSource interactionSource, final PaddingValues paddingValues, final Shape shape, final TextFieldColors textFieldColors, final Function2 function26, Composer composer, final int i, final int i2) {
        TextFieldType textFieldType2;
        int i3;
        Function2 function27;
        int i4;
        int i5;
        ComposerImpl composerImpl;
        boolean z4;
        long j;
        boolean z5;
        boolean z6;
        ComposerImpl composerImplV = composer.v(341783750);
        if ((i & 6) == 0) {
            textFieldType2 = textFieldType;
            i3 = (composerImplV.n(textFieldType2) ? 4 : 2) | i;
        } else {
            textFieldType2 = textFieldType;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(str) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            function27 = function2;
            i3 |= composerImplV.I(function27) ? 256 : 128;
        } else {
            function27 = function2;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.n(visualTransformation) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(function22) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i4 = 196608;
            i3 |= composerImplV.I(function23) ? 131072 : 65536;
        } else {
            i4 = 196608;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerImplV.I(function24) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerImplV.I(function25) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerImplV.p(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.p(z2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (composerImplV.p(z3) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= composerImplV.n(interactionSource) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i5 |= composerImplV.n(paddingValues) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= composerImplV.n(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= composerImplV.n(textFieldColors) ? 16384 : 8192;
        }
        if ((i2 & i4) == 0) {
            i5 |= composerImplV.I(function26) ? 131072 : 65536;
        }
        if (composerImplV.z(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 74899) == 74898) ? false : true)) {
            boolean z7 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objG = composerImplV.G();
            if (z7 || objG == Composer.Companion.f1624a) {
                objG = visualTransformation.a(new AnnotatedString(6, str, null));
                composerImplV.A(objG);
            }
            final String str2 = ((TransformedText) objG).f2132a.e;
            InputPhase inputPhase = ((Boolean) FocusInteractionKt.a(interactionSource, composerImplV, (i5 >> 3) & 14).getD()).booleanValue() ? InputPhase.d : str2.length() == 0 ? InputPhase.e : InputPhase.f;
            TextFieldImplKt$CommonDecorationBox$labelColor$1 textFieldImplKt$CommonDecorationBox$labelColor$1 = new TextFieldImplKt$CommonDecorationBox$labelColor$1(interactionSource, textFieldColors, z2, z3);
            Typography typographyC = MaterialTheme.c(composerImplV);
            TextStyle textStyle = typographyC.g;
            TextStyle textStyle2 = typographyC.l;
            long jB = textStyle.b();
            long j2 = Color.k;
            boolean z8 = (Color.c(jB, j2) && !Color.c(textStyle2.b(), j2)) || (!Color.c(textStyle.b(), j2) && Color.c(textStyle2.b(), j2));
            composerImplV.o(1578866909);
            long jB2 = MaterialTheme.c(composerImplV).l.b();
            if (z8) {
                j = 16;
                composerImplV.o(-1572812364);
                if (jB2 == 16) {
                    jB2 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, composerImplV, 0)).f1766a;
                }
                z4 = false;
                composerImplV.V(false);
            } else {
                z4 = false;
                j = 16;
                composerImplV.o(780549965);
                composerImplV.V(false);
            }
            composerImplV.V(z4);
            composerImplV.o(1578874175);
            long jB3 = MaterialTheme.c(composerImplV).g.b();
            if (z8) {
                z5 = z8;
                composerImplV.o(-1572585196);
                if (jB3 == j) {
                    jB3 = ((Color) textFieldImplKt$CommonDecorationBox$labelColor$1.invoke(inputPhase, composerImplV, 0)).f1766a;
                }
                z6 = false;
                composerImplV.V(false);
            } else {
                z5 = z8;
                z6 = false;
                composerImplV.o(780557293);
                composerImplV.V(false);
            }
            long j3 = jB3;
            composerImplV.V(z6);
            if (function22 != null) {
                z6 = true;
            }
            final TextFieldType textFieldType3 = textFieldType2;
            final boolean z9 = z5;
            final Function2 function28 = function27;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(225557475, new Function6<Float, Color, Color, Float, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3

                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public /* synthetic */ class WhenMappings {
                    static {
                        int[] iArr = new int[TextFieldType.values().length];
                        try {
                            iArr[0] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            TextFieldType textFieldType = TextFieldType.d;
                            iArr[1] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(6);
                }

                @Override // kotlin.jvm.functions.Function6
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i6;
                    ComposableLambdaImpl composableLambdaImpl;
                    ComposableLambdaImpl composableLambdaImpl2;
                    ComposableLambdaImpl composableLambdaImplC2;
                    ComposableLambdaImpl composableLambdaImpl3;
                    int i7;
                    final float fFloatValue = ((Number) obj).floatValue();
                    final long j4 = ((Color) obj2).f1766a;
                    final long j5 = ((Color) obj3).f1766a;
                    final float fFloatValue2 = ((Number) obj4).floatValue();
                    Composer composer2 = (Composer) obj5;
                    int iIntValue = ((Number) obj6).intValue();
                    if ((iIntValue & 6) == 0) {
                        i6 = (composer2.q(fFloatValue) ? 4 : 2) | iIntValue;
                    } else {
                        i6 = iIntValue;
                    }
                    if ((iIntValue & 48) == 0) {
                        i6 |= composer2.s(j4) ? 32 : 16;
                    }
                    if ((iIntValue & KyberEngine.KyberPolyBytes) == 0) {
                        i6 |= composer2.s(j5) ? 256 : 128;
                    }
                    if ((iIntValue & 3072) == 0) {
                        i6 |= composer2.q(fFloatValue2) ? 2048 : 1024;
                    }
                    int i8 = i6;
                    if (composer2.z(i8 & 1, (i8 & 9363) != 9362)) {
                        ComposableLambdaImpl composableLambdaImplC3 = null;
                        final Function2 function29 = function22;
                        if (function29 == null) {
                            composer2.o(-1572254148);
                            composer2.l();
                            composableLambdaImpl = null;
                        } else {
                            composer2.o(-1572254147);
                            final boolean z10 = z9;
                            Function2<Composer, Integer, Unit> function210 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue2 = ((Number) obj8).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        TextStyle textStyleA = TextStyleKt.a(MaterialTheme.c(composer3).g, MaterialTheme.c(composer3).l, fFloatValue);
                                        if (z10) {
                                            textStyleA = TextStyle.a(textStyleA, j4, 0L, null, null, 0L, 0L, null, null, 0, 16777214);
                                        }
                                        TextFieldImplKt.b(j5, textStyleA, function29, composer3, KyberEngine.KyberPolyBytes, 0);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            fFloatValue = fFloatValue;
                            ComposableLambdaImpl composableLambdaImplC4 = ComposableLambdaKt.c(-1865025495, function210, composer2);
                            composer2.l();
                            composableLambdaImpl = composableLambdaImplC4;
                        }
                        final boolean z11 = z2;
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        final Function2 function211 = function23;
                        if (function211 == null || str2.length() != 0 || fFloatValue2 <= BitmapDescriptorFactory.HUE_RED) {
                            composer2.o(-1570844268);
                            composer2.l();
                            composableLambdaImpl2 = null;
                        } else {
                            composer2.o(-1571270300);
                            ComposableLambdaImpl composableLambdaImplC5 = ComposableLambdaKt.c(-413527723, new Function3<Modifier, Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                    Modifier modifier = (Modifier) obj7;
                                    Composer composer3 = (Composer) obj8;
                                    int iIntValue2 = ((Number) obj9).intValue();
                                    if ((iIntValue2 & 6) == 0) {
                                        iIntValue2 |= composer3.n(modifier) ? 4 : 2;
                                    }
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                        Modifier modifierA = AlphaKt.a(modifier, fFloatValue2);
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                        int p = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                        Modifier modifierD = ComposedModifierKt.d(composer3, modifierA);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function0 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function0);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function212 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                            b.z(p, composer3, p, function212);
                                        }
                                        Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                        TextFieldImplKt.b(((Color) textFieldColors2.e(z11, composer3).getD()).f1766a, MaterialTheme.c(composer3).g, function211, composer3, 0, 4);
                                        composer3.f();
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                            composer2.l();
                            composableLambdaImpl2 = composableLambdaImplC5;
                        }
                        boolean z12 = z3;
                        final long j6 = ((Color) textFieldColors2.mo1a(z11, z12, composer2).getD()).f1766a;
                        final Function2 function212 = function24;
                        if (function212 == null) {
                            composer2.o(-1570655509);
                            composer2.l();
                            composableLambdaImplC2 = null;
                        } else {
                            composer2.o(-1570655508);
                            composableLambdaImplC2 = ComposableLambdaKt.c(-1165144581, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue2 = ((Number) obj8).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        TextFieldImplKt.b(j6, null, function212, composer3, 0, 6);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                            composer2.l();
                        }
                        final long j7 = ((Color) textFieldColors2.f(z11, z12, interactionSource, composer2).getD()).f1766a;
                        final Function2 function213 = function25;
                        if (function213 == null) {
                            composer2.o(-1570361846);
                        } else {
                            composer2.o(-1570361845);
                            composableLambdaImplC3 = ComposableLambdaKt.c(1694126319, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue2 = ((Number) obj8).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        TextFieldImplKt.b(j7, null, function213, composer3, 0, 6);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                        }
                        composer2.l();
                        ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImplC3;
                        Modifier modifierB = BackgroundKt.b(Modifier.Companion.d, ((Color) textFieldColors2.g(composer2).getD()).f1766a, shape);
                        int iOrdinal = textFieldType3.ordinal();
                        if (iOrdinal == 0) {
                            composer2.o(-1570081481);
                            TextFieldKt.c(modifierB, function28, composableLambdaImpl, composableLambdaImpl2, composableLambdaImplC2, composableLambdaImpl4, z, fFloatValue, paddingValues, composer2, (i8 << 21) & 29360128);
                            composer2.l();
                        } else if (iOrdinal != 1) {
                            composer2.o(-1568043975);
                            composer2.l();
                        } else {
                            composer2.o(-1569502122);
                            Object objG2 = composer2.G();
                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                            if (objG2 == composer$Companion$Empty$1) {
                                composableLambdaImpl3 = composableLambdaImpl;
                                i7 = 29360128;
                                objG2 = SnapshotStateKt.f(new Size(0L));
                                composer2.A(objG2);
                            } else {
                                composableLambdaImpl3 = composableLambdaImpl;
                                i7 = 29360128;
                            }
                            final MutableState mutableState = (MutableState) objG2;
                            final PaddingValues paddingValues2 = paddingValues;
                            final Function2 function214 = function26;
                            ComposableLambdaImpl composableLambdaImplC6 = ComposableLambdaKt.c(-1212965554, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$drawBorder$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj7, Object obj8) {
                                    Composer composer3 = (Composer) obj7;
                                    int iIntValue2 = ((Number) obj8).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        Modifier modifierB2 = LayoutIdKt.b(Modifier.Companion.d, "border");
                                        final long j8 = ((Size) mutableState.getD()).f1754a;
                                        float f = OutlinedTextFieldKt.f1306a;
                                        final PaddingValues paddingValues3 = paddingValues2;
                                        Modifier modifierD = DrawModifierKt.d(modifierB2, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

                                            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                                            public /* synthetic */ class WhenMappings {

                                                /* renamed from: a, reason: collision with root package name */
                                                public static final /* synthetic */ int[] f1307a;

                                                static {
                                                    int[] iArr = new int[LayoutDirection.values().length];
                                                    try {
                                                        LayoutDirection layoutDirection = LayoutDirection.d;
                                                        iArr[1] = 1;
                                                    } catch (NoSuchFieldError unused) {
                                                    }
                                                    f1307a = iArr;
                                                }
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj9) {
                                                ContentDrawScope contentDrawScope = (ContentDrawScope) obj9;
                                                long j9 = j8;
                                                float fD = Size.d(j9);
                                                float f2 = BitmapDescriptorFactory.HUE_RED;
                                                if (fD > BitmapDescriptorFactory.HUE_RED) {
                                                    float fT1 = contentDrawScope.T1(OutlinedTextFieldKt.f1306a);
                                                    float fT12 = contentDrawScope.T1(paddingValues3.b(contentDrawScope.getLayoutDirection())) - fT1;
                                                    float f3 = 2;
                                                    float f4 = (fT1 * f3) + fD + fT12;
                                                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                                                    int[] iArr = WhenMappings.f1307a;
                                                    float fD2 = iArr[layoutDirection.ordinal()] == 1 ? Size.d(contentDrawScope.h()) - f4 : fT12 < BitmapDescriptorFactory.HUE_RED ? 0.0f : fT12;
                                                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                                                        float fD3 = Size.d(contentDrawScope.h());
                                                        if (fT12 >= BitmapDescriptorFactory.HUE_RED) {
                                                            f2 = fT12;
                                                        }
                                                        f4 = fD3 - f2;
                                                    }
                                                    float f5 = f4;
                                                    float fB = Size.b(j9);
                                                    float f6 = (-fB) / f3;
                                                    float f7 = fB / f3;
                                                    CanvasDrawScope$drawContext$1 e = contentDrawScope.getE();
                                                    long jD = e.d();
                                                    e.a().save();
                                                    try {
                                                        e.f1798a.b(fD2, f6, f5, f7, 0);
                                                        contentDrawScope.Q0();
                                                    } finally {
                                                        b.C(e, jD);
                                                    }
                                                } else {
                                                    contentDrawScope.Q0();
                                                }
                                                return Unit.f24250a;
                                            }
                                        });
                                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                                        int p = composer3.getP();
                                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                        Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierD);
                                        ComposeUiNode.e3.getClass();
                                        Function0 function0 = ComposeUiNode.Companion.b;
                                        if (composer3.w() == null) {
                                            ComposablesKt.b();
                                            throw null;
                                        }
                                        composer3.i();
                                        if (composer3.getO()) {
                                            composer3.K(function0);
                                        } else {
                                            composer3.e();
                                        }
                                        Updater.b(composer3, measurePolicyD, ComposeUiNode.Companion.g);
                                        Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                        Function2 function215 = ComposeUiNode.Companion.j;
                                        if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                            b.z(p, composer3, p, function215);
                                        }
                                        Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                        Function2 function216 = function214;
                                        if (function216 == null) {
                                            composer3.o(720285106);
                                        } else {
                                            composer3.o(-392406993);
                                            function216.invoke(composer3, 0);
                                        }
                                        composer3.l();
                                        composer3.f();
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2);
                            boolean z13 = (i8 & 14) == 4;
                            Object objG3 = composer2.G();
                            if (z13 || objG3 == composer$Companion$Empty$1) {
                                objG3 = new Function1<Size, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$3$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj7) {
                                        long j8 = ((Size) obj7).f1754a;
                                        float fD = Size.d(j8);
                                        float f = fFloatValue;
                                        float f2 = fD * f;
                                        float fB = Size.b(j8) * f;
                                        MutableState mutableState2 = mutableState;
                                        if (Size.d(((Size) mutableState2.getD()).f1754a) != f2 || Size.b(((Size) mutableState2.getD()).f1754a) != fB) {
                                            mutableState2.setValue(new Size(SizeKt.a(f2, fB)));
                                        }
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG3);
                            }
                            OutlinedTextFieldKt.c(modifierB, function28, composableLambdaImpl2, composableLambdaImpl3, composableLambdaImplC2, composableLambdaImpl4, z, fFloatValue, (Function1) objG3, composableLambdaImplC6, paddingValues, composer2, ((i8 << 21) & i7) | 805306368);
                            composer2.l();
                        }
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            composerImpl = composerImplV;
            TextFieldTransitionScope.f1343a.a(inputPhase, jB2, j3, textFieldImplKt$CommonDecorationBox$labelColor$1, z6, composableLambdaImplC, composerImpl, 1769472);
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$CommonDecorationBox$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    TextFieldImplKt.a(textFieldType, str, function2, visualTransformation, function22, function23, function24, function25, z, z2, z3, interactionSource, paddingValues, shape, textFieldColors, function26, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final long j, TextStyle textStyle, final Function2 function2, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-399493340);
        int i4 = (composerImplV.s(j) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.n(textStyle) ? 32 : 16);
        }
        final Float f = null;
        if ((i2 & 4) != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(null) ? 256 : 128;
        }
        int i6 = i3 | (composerImplV.I(function2) ? 2048 : 1024);
        if (composerImplV.z(i6 & 1, (i6 & 1171) != 1170)) {
            if (i5 != 0) {
                textStyle = null;
            }
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(494684590, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f1261a;
                        final long j2 = j;
                        ProvidedValue providedValueG = b.g(j2, dynamicProvidableCompositionLocal);
                        final Float f2 = f;
                        final Function2 function22 = function2;
                        CompositionLocalKt.a(providedValueG, ComposableLambdaKt.c(-1132188434, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$colorAndEmphasis$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Function2 function23 = function22;
                                    Float f3 = f2;
                                    if (f3 != null) {
                                        composer3.o(-1177895124);
                                        CompositionLocalKt.a(ContentAlphaKt.f1260a.b(f3), function23, composer3, 8);
                                        composer3.l();
                                    } else {
                                        composer3.o(-1177696538);
                                        CompositionLocalKt.a(ContentAlphaKt.f1260a.b(Float.valueOf(Color.d(j2))), function23, composer3, 8);
                                        composer3.l();
                                    }
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            if (textStyle != null) {
                composerImplV.o(2115981348);
                TextKt.a(textStyle, composableLambdaImplC, composerImplV, ((i6 >> 3) & 14) | 48);
            } else {
                composerImplV.o(2115982984);
                composableLambdaImplC.invoke(composerImplV, 6);
            }
            composerImplV.V(false);
        } else {
            composerImplV.j();
        }
        final TextStyle textStyle2 = textStyle;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$Decoration$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    TextFieldImplKt.b(j, textStyle2, function2, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final Modifier c(Modifier modifier, boolean z, final String str) {
        return z ? SemanticsModifierKt.b(modifier, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.TextFieldImplKt$defaultErrorSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                ((SemanticsPropertyReceiver) obj).b(SemanticsProperties.J, str);
                return Unit.f24250a;
            }
        }) : modifier;
    }

    public static final Object d(IntrinsicMeasurable intrinsicMeasurable) {
        Object a2 = intrinsicMeasurable.getV();
        LayoutIdParentData layoutIdParentData = a2 instanceof LayoutIdParentData ? (LayoutIdParentData) a2 : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getF();
        }
        return null;
    }
}
