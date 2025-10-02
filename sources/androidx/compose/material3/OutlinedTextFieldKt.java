package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.TypeScaleTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OutlinedTextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1469a = 4;
    public static final long b;

    static {
        GenericFontFamily genericFontFamily = TypeScaleTokens.f1613a;
        long j = TypeScaleTokens.l;
        TextUnitKt.a(j);
        b = TextUnitKt.e(1095216660480L & j, TextUnit.c(j) / 2);
    }

    public static final void a(final TextFieldValue textFieldValue, final Function1 function1, final Modifier modifier, boolean z, TextStyle textStyle, final Function2 function2, final Function2 function22, final Function2 function23, final boolean z2, final VisualTransformation visualTransformation, final KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, final boolean z3, int i, int i2, Shape shape, final TextFieldColors textFieldColors, Composer composer, final int i3) {
        int i4;
        Modifier modifier2;
        final Function2 function24;
        final KeyboardActions keyboardActions2;
        final int i5;
        final Shape shapeB;
        TextStyle textStyle2;
        final boolean z4;
        final int i6;
        ComposerImpl composerImpl;
        final boolean z5;
        final KeyboardActions keyboardActions3;
        final int i7;
        final Shape shape2;
        final TextStyle textStyle3;
        final int i8;
        ComposerImpl composerImplV = composer.v(-1570442800);
        if ((i3 & 6) == 0) {
            i4 = (composerImplV.n(textFieldValue) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            i9 = 93184 | i4;
        }
        if ((1572864 & i3) == 0) {
            function24 = function2;
            i9 |= composerImplV.I(function24) ? 1048576 : 524288;
        } else {
            function24 = function2;
        }
        if ((12582912 & i3) == 0) {
            i9 |= composerImplV.I(function22) ? 8388608 : 4194304;
        }
        int i10 = i9 | 905969664;
        int i11 = (composerImplV.p(z2) ? (char) 2048 : (char) 1024) | 438 | (composerImplV.n(visualTransformation) ? 16384 : 8192) | 840433664;
        int i12 = (composerImplV.n(textFieldColors) ? (char) 256 : (char) 128) | 22;
        if ((i10 & 306783379) == 306783378 && (306783379 & i11) == 306783378 && (i12 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z5 = z;
            textStyle3 = textStyle;
            keyboardActions3 = keyboardActions;
            i8 = i;
            i7 = i2;
            shape2 = shape;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i3 & 1) == 0 || composerImplV.c0()) {
                TextStyle textStyle4 = (TextStyle) composerImplV.x(TextKt.f1518a);
                KeyboardActions keyboardActions4 = KeyboardActions.d;
                int i13 = z3 ? 1 : Integer.MAX_VALUE;
                OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f1468a;
                keyboardActions2 = keyboardActions4;
                i5 = 1;
                shapeB = ShapesKt.b(ShapeKeyTokens.f, composerImplV);
                textStyle2 = textStyle4;
                z4 = true;
                i6 = i13;
            } else {
                composerImplV.j();
                z4 = z;
                textStyle2 = textStyle;
                keyboardActions2 = keyboardActions;
                i6 = i;
                i5 = i2;
                shapeB = shape;
            }
            composerImplV.W();
            composerImplV.o(30368324);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            composerImplV.o(30374434);
            long jB = textStyle2.b();
            if (jB == 16) {
                jB = textFieldColors.a(z4, z2, ((Boolean) FocusInteractionKt.a(mutableInteractionSource, composerImplV, 0).getD()).booleanValue());
            }
            long j = jB;
            composerImplV.V(false);
            final TextStyle textStyleD = textStyle2.d(new TextStyle(j, 0L, null, null, null, 0L, null, 0, 0, 0L, null, 16777214));
            final Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            ProvidedValue providedValueB = TextSelectionColorsKt.f1228a.b(textFieldColors.k);
            final Modifier modifier3 = modifier2;
            Function2<Composer, Integer, Unit> function25 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final AnonymousClass1 h = new AnonymousClass1(1);

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Function2 function26 = function24;
                        Modifier modifierJ = Modifier.Companion.d;
                        if (function26 != null) {
                            modifierJ = PaddingKt.j(SemanticsModifierKt.b(modifierJ, true, AnonymousClass1.h), BitmapDescriptorFactory.HUE_RED, density.r(OutlinedTextFieldKt.b), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13);
                        }
                        Modifier modifierX0 = modifier3.x0(modifierJ);
                        String strA = Strings_androidKt.a(composer2, com.woolworths.R.string.default_error_message);
                        boolean z6 = z2;
                        Modifier modifierA = SizeKt.a(TextFieldImplKt.e(modifierX0, z6, strA), OutlinedTextFieldDefaults.c, OutlinedTextFieldDefaults.b);
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        SolidColor solidColor = new SolidColor(z6 ? textFieldColors2.j : textFieldColors2.i);
                        final Function2 function27 = function23;
                        final Shape shape3 = shapeB;
                        final TextFieldValue textFieldValue2 = textFieldValue;
                        final boolean z7 = z4;
                        final boolean z8 = z3;
                        final VisualTransformation visualTransformation2 = visualTransformation;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        final boolean z9 = z2;
                        final Function2 function28 = function24;
                        final Function2 function29 = function22;
                        BasicTextFieldKt.a(textFieldValue2, function1, modifierA, z7, false, textStyleD, keyboardOptions, keyboardActions2, z8, i6, i5, visualTransformation2, null, mutableInteractionSource2, solidColor, ComposableLambdaKt.c(-757328870, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$3.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Function2 function210 = (Function2) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.I(function210) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults2 = OutlinedTextFieldDefaults.f1468a;
                                    String str = textFieldValue2.f2127a.e;
                                    final Shape shape4 = shape3;
                                    final boolean z10 = z7;
                                    final boolean z11 = z9;
                                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    final TextFieldColors textFieldColors3 = textFieldColors2;
                                    outlinedTextFieldDefaults2.b(str, function210, z10, z8, visualTransformation2, mutableInteractionSource3, z11, function28, function29, null, function27, textFieldColors3, null, ComposableLambdaKt.c(255570733, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.3.3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                OutlinedTextFieldDefaults.f1468a.a(z10, z11, mutableInteractionSource3, null, textFieldColors3, shape4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer4, 100663296, 200);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, (iIntValue << 3) & 112, 14155776, 32768);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 196608, 4096);
                    }
                    return Unit.f24250a;
                }
            };
            composerImpl = composerImplV;
            CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(1830921872, function25, composerImpl), composerImpl, 56);
            z5 = z4;
            keyboardActions3 = keyboardActions2;
            i7 = i5;
            shape2 = shapeB;
            textStyle3 = textStyle2;
            i8 = i6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i3 | 1);
                    OutlinedTextFieldKt.a(textFieldValue, function1, modifier, z5, textStyle3, function2, function22, function23, z2, visualTransformation, keyboardOptions, keyboardActions3, z3, i8, i7, shape2, textFieldColors, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final String str, final Function1 function1, final Modifier modifier, boolean z, final TextStyle textStyle, final Function2 function2, final Function2 function22, VisualTransformation visualTransformation, KeyboardOptions keyboardOptions, KeyboardActions keyboardActions, int i, int i2, final Shape shape, final TextFieldColors textFieldColors, Composer composer, final int i3) {
        final KeyboardOptions keyboardOptions2;
        final KeyboardActions keyboardActions2;
        final boolean z2;
        final int i4;
        final VisualTransformation visualTransformation2;
        final int i5;
        final boolean z3;
        final KeyboardOptions keyboardOptions3;
        final KeyboardActions keyboardActions3;
        final int i6;
        final int i7;
        final VisualTransformation visualTransformation3;
        ComposerImpl composerImplV = composer.v(-1922450045);
        int i8 = i3 | (composerImplV.n(str) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | 27648 | (composerImplV.n(textStyle) ? 131072 : 65536) | 102236160;
        int i9 = (composerImplV.n(shape) ? ' ' : (char) 16) | 6 | (composerImplV.n(textFieldColors) ? (char) 256 : (char) 128);
        if ((i8 & 306783379) == 306783378 && (i9 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            z3 = z;
            visualTransformation3 = visualTransformation;
            keyboardOptions3 = keyboardOptions;
            keyboardActions3 = keyboardActions;
            i6 = i;
            i7 = i2;
        } else {
            composerImplV.u0();
            if ((i3 & 1) == 0 || composerImplV.c0()) {
                keyboardOptions2 = KeyboardOptions.h;
                keyboardActions2 = KeyboardActions.d;
                z2 = true;
                i4 = 1;
                visualTransformation2 = VisualTransformation.Companion.f2133a;
                i5 = Integer.MAX_VALUE;
            } else {
                composerImplV.j();
                z2 = z;
                visualTransformation2 = visualTransformation;
                keyboardOptions2 = keyboardOptions;
                keyboardActions2 = keyboardActions;
                i5 = i;
                i4 = i2;
            }
            composerImplV.W();
            composerImplV.o(30062948);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = InteractionSourceKt.a();
                composerImplV.A(objG);
            }
            final MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
            composerImplV.V(false);
            composerImplV.o(30069058);
            long jB = textStyle.b();
            if (jB == 16) {
                jB = textFieldColors.a(z2, false, ((Boolean) FocusInteractionKt.a(mutableInteractionSource, composerImplV, 0).getD()).booleanValue());
            }
            long j = jB;
            composerImplV.V(false);
            final TextStyle textStyleD = textStyle.d(new TextStyle(j, 0L, null, null, null, 0L, null, 0, 0, 0L, null, 16777214));
            final Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            CompositionLocalKt.a(TextSelectionColorsKt.f1228a.b(textFieldColors.k), ComposableLambdaKt.c(-1886965181, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    static {
                        new AnonymousClass1(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        return Unit.f24250a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = SizeKt.a(TextFieldImplKt.e(modifier.x0(Modifier.Companion.d), false, Strings_androidKt.a(composer2, com.woolworths.R.string.default_error_message)), OutlinedTextFieldDefaults.c, OutlinedTextFieldDefaults.b);
                        final TextFieldColors textFieldColors2 = textFieldColors;
                        SolidColor solidColor = new SolidColor(textFieldColors2.i);
                        final Function2 function23 = function22;
                        final Shape shape2 = shape;
                        final String str2 = str;
                        final boolean z4 = z2;
                        final VisualTransformation visualTransformation4 = visualTransformation2;
                        final MutableInteractionSource mutableInteractionSource2 = mutableInteractionSource;
                        final Function2 function24 = function2;
                        BasicTextFieldKt.b(str2, function1, modifierA, z4, false, textStyleD, keyboardOptions2, keyboardActions2, false, i5, i4, visualTransformation4, null, mutableInteractionSource2, solidColor, ComposableLambdaKt.c(1474611661, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Function2 function25 = (Function2) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                if ((iIntValue & 6) == 0) {
                                    iIntValue |= composer3.I(function25) ? 4 : 2;
                                }
                                if ((iIntValue & 19) == 18 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.f1468a;
                                    final Shape shape3 = shape2;
                                    final boolean z5 = z4;
                                    final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
                                    final TextFieldColors textFieldColors3 = textFieldColors2;
                                    outlinedTextFieldDefaults.b(str2, function25, z5, false, visualTransformation4, mutableInteractionSource3, false, null, function24, function23, null, textFieldColors3, null, ComposableLambdaKt.c(2108828640, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt.OutlinedTextField.1.3.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj6, Object obj7) {
                                            Composer composer4 = (Composer) obj6;
                                            if ((((Number) obj7).intValue() & 3) == 2 && composer4.c()) {
                                                composer4.j();
                                            } else {
                                                OutlinedTextFieldDefaults.f1468a.a(z5, false, mutableInteractionSource3, null, textFieldColors3, shape3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer4, 100663296, 200);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, (iIntValue << 3) & 112, 14155776, 32768);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 196608, 4096);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            z3 = z2;
            keyboardOptions3 = keyboardOptions2;
            keyboardActions3 = keyboardActions2;
            i6 = i5;
            i7 = i4;
            visualTransformation3 = visualTransformation2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(str, function1, modifier, z3, textStyle, function2, function22, visualTransformation3, keyboardOptions3, keyboardActions3, i6, i7, shape, textFieldColors, i3) { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextField$2
                public final /* synthetic */ String h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ TextStyle l;
                public final /* synthetic */ Function2 m;
                public final /* synthetic */ Function2 n;
                public final /* synthetic */ VisualTransformation o;
                public final /* synthetic */ KeyboardOptions p;
                public final /* synthetic */ KeyboardActions q;
                public final /* synthetic */ int r;
                public final /* synthetic */ int s;
                public final /* synthetic */ Shape t;
                public final /* synthetic */ TextFieldColors u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(817889281);
                    OutlinedTextFieldKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    public static final void c(final Function2 function2, final Function3 function3, Function2 function22, final Function2 function23, final Function2 function24, Function2 function25, final Function2 function26, final boolean z, float f, final Function1 function1, final ComposableLambdaImpl composableLambdaImpl, Function2 function27, PaddingValues paddingValues, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        PaddingValues paddingValues2;
        LayoutDirection layoutDirection;
        Function2 function28;
        float f2;
        Function2 function29;
        int i5;
        float f3;
        Function2 function210;
        float f4;
        final Function2 function211;
        boolean z2;
        ComposerImpl composerImplV = composer.v(1408290209);
        int i6 = i & 6;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i6 == 0) {
            i3 = i | (composerImplV.n(companion) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function22) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(function23) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function24) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(function25) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.I(function26) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= composerImplV.p(z) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerImplV.q(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerImplV.I(function1) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(function27) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            paddingValues2 = paddingValues;
            i4 |= composerImplV.n(paddingValues2) ? 2048 : 1024;
        } else {
            paddingValues2 = paddingValues;
        }
        int i7 = i4;
        if ((i3 & 306783379) == 306783378 && (i7 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            function210 = function22;
            function211 = function27;
            function28 = function25;
            f4 = f;
        } else {
            boolean z3 = ((i7 & 14) == 4) | ((i3 & 234881024) == 67108864) | ((i3 & 1879048192) == 536870912) | ((i7 & 7168) == 2048);
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new OutlinedTextFieldMeasurePolicy(function1, z, f, paddingValues2);
                composerImplV.A(objG);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) objG;
            LayoutDirection layoutDirection2 = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            int i8 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function212 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, outlinedTextFieldMeasurePolicy, function212);
            Function2 function213 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function213);
            Function2 function214 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                androidx.camera.core.impl.b.B(i8, composerImplV, i8, function214);
            }
            Function2 function215 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function215);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf((i7 >> 3) & 14));
            composerImplV.o(250370369);
            BiasAlignment biasAlignment = Alignment.Companion.e;
            if (function23 != null) {
                Modifier modifierX0 = LayoutIdKt.b(companion, "Leading").x0(TextFieldImplKt.i);
                MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
                int i9 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierX0);
                composerImplV.i();
                layoutDirection = layoutDirection2;
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                    androidx.camera.core.impl.b.B(i9, composerImplV, i9, function214);
                }
                Updater.b(composerImplV, modifierD2, function215);
                android.support.v4.media.session.a.z((i3 >> 12) & 14, function23, composerImplV, true);
            } else {
                layoutDirection = layoutDirection2;
            }
            ?? r15 = 0;
            composerImplV.V(false);
            composerImplV.o(250379492);
            if (function24 != null) {
                Modifier modifierX02 = LayoutIdKt.b(companion, "Trailing").x0(TextFieldImplKt.i);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                int i10 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierX02);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i10))) {
                    androidx.camera.core.impl.b.B(i10, composerImplV, i10, function214);
                }
                Updater.b(composerImplV, modifierD3, function215);
                android.support.v4.media.session.a.z((i3 >> 15) & 14, function24, composerImplV, true);
                r15 = 0;
            }
            composerImplV.V(r15);
            LayoutDirection layoutDirection3 = layoutDirection;
            float fD = PaddingKt.d(paddingValues2, layoutDirection3);
            float fC = PaddingKt.c(paddingValues2, layoutDirection3);
            if (function23 != null) {
                fD -= TextFieldImplKt.c;
                float f5 = (float) r15;
                if (fD < f5) {
                    fD = f5;
                }
            }
            float f6 = fD;
            if (function24 != null) {
                fC -= TextFieldImplKt.c;
                float f7 = (float) r15;
                if (fC < f7) {
                    fC = f7;
                }
            }
            composerImplV.o(250410106);
            BiasAlignment biasAlignment2 = Alignment.Companion.f1719a;
            if (function25 != null) {
                f2 = fC;
                Modifier modifierJ = PaddingKt.j(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Prefix"), TextFieldImplKt.f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), f6, BitmapDescriptorFactory.HUE_RED, TextFieldImplKt.e, BitmapDescriptorFactory.HUE_RED, 10);
                MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment2, false);
                int i11 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierJ);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD3, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i11))) {
                    androidx.camera.core.impl.b.B(i11, composerImplV, i11, function214);
                }
                Updater.b(composerImplV, modifierD4, function215);
                function28 = function25;
                android.support.v4.media.session.a.z((i3 >> 18) & 14, function28, composerImplV, true);
            } else {
                function28 = function25;
                f2 = fC;
            }
            composerImplV.V(false);
            composerImplV.o(250422072);
            if (function26 != null) {
                Modifier modifierJ2 = PaddingKt.j(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Suffix"), TextFieldImplKt.f, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), TextFieldImplKt.e, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10);
                MeasurePolicy measurePolicyD4 = BoxKt.d(biasAlignment2, false);
                int i12 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImplV.Q();
                Modifier modifierD5 = ComposedModifierKt.d(composerImplV, modifierJ2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD4, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ5, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i12))) {
                    androidx.camera.core.impl.b.B(i12, composerImplV, i12, function214);
                }
                Updater.b(composerImplV, modifierD5, function215);
                function29 = function26;
                android.support.v4.media.session.a.z((i3 >> 21) & 14, function29, composerImplV, true);
            } else {
                function29 = function26;
            }
            composerImplV.V(false);
            float f8 = TextFieldImplKt.f;
            Modifier modifierX = SizeKt.x(SizeKt.i(companion, f8, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false);
            if (function28 == null) {
                f3 = f6;
                i5 = 0;
            } else {
                i5 = 0;
                f3 = 0;
            }
            Modifier modifierJ3 = PaddingKt.j(modifierX, f3, BitmapDescriptorFactory.HUE_RED, function29 == null ? f2 : i5, BitmapDescriptorFactory.HUE_RED, 10);
            composerImplV.o(250444361);
            if (function3 != null) {
                function3.invoke(LayoutIdKt.b(companion, "Hint").x0(modifierJ3), composerImplV, Integer.valueOf((i3 >> 3) & 112));
            }
            composerImplV.V(false);
            Modifier modifierX03 = LayoutIdKt.b(companion, "TextField").x0(modifierJ3);
            MeasurePolicy measurePolicyD5 = BoxKt.d(biasAlignment2, true);
            int i13 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImplV.Q();
            Modifier modifierD6 = ComposedModifierKt.d(composerImplV, modifierX03);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD5, function212);
            Updater.b(composerImplV, persistentCompositionLocalMapQ6, function213);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i13))) {
                androidx.camera.core.impl.b.B(i13, composerImplV, i13, function214);
            }
            Updater.b(composerImplV, modifierD6, function215);
            function2.invoke(composerImplV, Integer.valueOf((i3 >> 3) & 14));
            composerImplV.V(true);
            composerImplV.o(250455481);
            if (function22 != null) {
                f4 = f;
                Modifier modifierB = LayoutIdKt.b(SizeKt.x(SizeKt.i(companion, MathHelpersKt.b(f8, TextFieldImplKt.g, f4), BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), "Label");
                MeasurePolicy measurePolicyD6 = BoxKt.d(biasAlignment2, false);
                int i14 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ7 = composerImplV.Q();
                Modifier modifierD7 = ComposedModifierKt.d(composerImplV, modifierB);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD6, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ7, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i14))) {
                    androidx.camera.core.impl.b.B(i14, composerImplV, i14, function214);
                }
                Updater.b(composerImplV, modifierD7, function215);
                function210 = function22;
                android.support.v4.media.session.a.z((i3 >> 9) & 14, function210, composerImplV, true);
            } else {
                function210 = function22;
                f4 = f;
            }
            boolean z4 = false;
            composerImplV.V(false);
            composerImplV.o(250473414);
            if (function27 != null) {
                Modifier modifierE = PaddingKt.e(SizeKt.x(SizeKt.i(LayoutIdKt.b(companion, "Supporting"), TextFieldImplKt.h, BitmapDescriptorFactory.HUE_RED, 2), Alignment.Companion.k, false), TextFieldDefaults.b());
                MeasurePolicy measurePolicyD7 = BoxKt.d(biasAlignment2, false);
                int i15 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ8 = composerImplV.Q();
                Modifier modifierD8 = ComposedModifierKt.d(composerImplV, modifierE);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD7, function212);
                Updater.b(composerImplV, persistentCompositionLocalMapQ8, function213);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i15))) {
                    androidx.camera.core.impl.b.B(i15, composerImplV, i15, function214);
                }
                Updater.b(composerImplV, modifierD8, function215);
                function211 = function27;
                z2 = true;
                android.support.v4.media.session.a.z((i7 >> 6) & 14, function211, composerImplV, true);
                z4 = false;
            } else {
                function211 = function27;
                z2 = true;
            }
            composerImplV.V(z4);
            composerImplV.V(z2);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function2 function216 = function210;
            final Function2 function217 = function28;
            final float f9 = f4;
            final PaddingValues paddingValues3 = paddingValues2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    int iA2 = RecomposeScopeImplKt.a(i2);
                    OutlinedTextFieldKt.c(function2, function3, function216, function23, function24, function217, function26, z, f9, function1, composableLambdaImpl, function211, paddingValues3, (Composer) obj, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, long j, float f2, PaddingValues paddingValues) {
        int iC = ComparisonsKt.c(i5, i7, i3, i4, MathHelpersKt.c(f, i6, 0));
        float b2 = paddingValues.getB() * f2;
        return Math.max(Constraints.i(j), Math.max(i, Math.max(i2, MathKt.b(MathHelpersKt.b(b2, Math.max(b2, i6 / 2.0f), f) + iC + (paddingValues.getD() * f2)))) + i8);
    }

    public static final int e(int i, int i2, int i3, int i4, int i5, int i6, int i7, float f, long j, float f2, PaddingValues paddingValues) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, MathHelpersKt.c(f, i6, 0))) + i + i2;
        LayoutDirection layoutDirection = LayoutDirection.d;
        return Math.max(iMax, Math.max(MathKt.b((i6 + ((paddingValues.c(layoutDirection) + paddingValues.b(layoutDirection)) * f2)) * f), Constraints.j(j)));
    }

    public static final Modifier f(Modifier modifier, final Function0 function0, final PaddingValues paddingValues) {
        return DrawModifierKt.d(modifier, new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldKt$outlineCutout$1

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f1470a;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        LayoutDirection layoutDirection = LayoutDirection.d;
                        iArr[1] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f1470a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ContentDrawScope contentDrawScope = (ContentDrawScope) obj;
                long j = ((Size) ((MutablePropertyReference0) function0).get()).f1754a;
                float fD = Size.d(j);
                float f = BitmapDescriptorFactory.HUE_RED;
                if (fD > BitmapDescriptorFactory.HUE_RED) {
                    float fT1 = contentDrawScope.T1(OutlinedTextFieldKt.f1469a);
                    float fT12 = contentDrawScope.T1(paddingValues.b(contentDrawScope.getLayoutDirection())) - fT1;
                    float f2 = 2;
                    float f3 = (fT1 * f2) + fD + fT12;
                    LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                    int[] iArr = WhenMappings.f1470a;
                    float fD2 = iArr[layoutDirection.ordinal()] == 1 ? Size.d(contentDrawScope.h()) - f3 : fT12 < BitmapDescriptorFactory.HUE_RED ? 0.0f : fT12;
                    if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                        float fD3 = Size.d(contentDrawScope.h());
                        if (fT12 >= BitmapDescriptorFactory.HUE_RED) {
                            f = fT12;
                        }
                        f3 = fD3 - f;
                    }
                    float f4 = f3;
                    float fB = Size.b(j);
                    float f5 = (-fB) / f2;
                    float f6 = fB / f2;
                    CanvasDrawScope$drawContext$1 e = contentDrawScope.getE();
                    long jD = e.d();
                    e.a().save();
                    try {
                        e.f1798a.b(fD2, f5, f4, f6, 0);
                        contentDrawScope.Q0();
                    } finally {
                        androidx.camera.core.impl.b.C(e, jD);
                    }
                } else {
                    contentDrawScope.Q0();
                }
                return Unit.f24250a;
            }
        });
    }

    public static final int g(boolean z, int i, int i2, Placeable placeable, Placeable placeable2) {
        if (z) {
            i2 = Alignment.Companion.k.a(placeable2.e, i);
        }
        float f = TextFieldImplKt.b;
        return Math.max(i2, (placeable != null ? placeable.e : 0) / 2);
    }
}
