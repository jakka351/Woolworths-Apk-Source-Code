package au.com.woolworths.compose.utils.modifier;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.os.Build;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0006²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "origin", "", "angle", "", "isVisible", "compose-utils_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class WaveBackgroundModifierKt {
    public static final void a(final State state, final Animatable animatable, final Animatable animatable2, float f, float f2, float f3, Composer composer, final int i) {
        final float f4;
        final float f5;
        final float f6;
        ComposerImpl composerImplV = composer.v(4355253);
        int i2 = i | (composerImplV.n(state) ? 4 : 2) | (composerImplV.I(animatable) ? 32 : 16) | (composerImplV.I(animatable2) ? 256 : 128) | 1797120;
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
            f6 = f;
            f4 = f2;
            f5 = f3;
        } else {
            Object d = state.getD();
            composerImplV.o(-1224400529);
            boolean z = true;
            boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32 || composerImplV.I(animatable));
            if ((i2 & 896) != 256 && !composerImplV.I(animatable2)) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objG = composerImplV.G();
            f4 = 1.0f;
            f5 = 1.0f;
            if (z3 || objG == Composer.Companion.f1624a) {
                WaveBackgroundModifierKt$AnimatedPulseEffect$1$1 waveBackgroundModifierKt$AnimatedPulseEffect$1$1 = new WaveBackgroundModifierKt$AnimatedPulseEffect$1$1(state, animatable, 0.3f, animatable2, 1.0f, 1.0f, null);
                composerImplV.A(waveBackgroundModifierKt$AnimatedPulseEffect$1$1);
                objG = waveBackgroundModifierKt$AnimatedPulseEffect$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, d, (Function2) objG);
            f6 = 0.3f;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(animatable, animatable2, f6, f4, f5, i) { // from class: au.com.woolworths.compose.utils.modifier.k
                public final /* synthetic */ Animatable e;
                public final /* synthetic */ Animatable f;
                public final /* synthetic */ float g;
                public final /* synthetic */ float h;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = RecomposeScopeImplKt.a(577);
                    WaveBackgroundModifierKt.a(this.d, this.e, this.f, this.g, this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final MutableState isAnimating, final Animatable scale, final Animatable alpha, final float f, final Modifier modifier, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        Intrinsics.h(isAnimating, "isAnimating");
        Intrinsics.h(scale, "scale");
        Intrinsics.h(alpha, "alpha");
        ComposerImpl composerImplV = composer.v(-1848479034);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.n(isAnimating) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.I(scale) ? 32 : 16) | (composerImplV.I(alpha) ? 256 : 128) | (composerImplV.I(composableLambdaImpl) ? 131072 : 65536);
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1224400529);
            boolean z = ((i3 & 896) == 256 || composerImplV.I(alpha)) | ((i3 & 14) == 4) | ((458752 & i3) == 131072) | ((i3 & 112) == 32 || composerImplV.I(scale));
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                Function2 function2 = new Function2() { // from class: au.com.woolworths.compose.utils.modifier.m
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r15v14, types: [kotlin.collections.EmptyList] */
                    /* JADX WARN: Type inference failed for: r15v18, types: [java.util.ArrayList] */
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Integer numValueOf;
                        Object arrayList;
                        final SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
                        Constraints constraints = (Constraints) obj2;
                        Intrinsics.h(SubcomposeLayout, "$this$SubcomposeLayout");
                        List listX0 = SubcomposeLayout.X0(WaveBackgroundContainerSlots.e, composableLambdaImpl);
                        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(listX0, 10));
                        Iterator it = listX0.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((Measurable) it.next()).c0(constraints.f2197a));
                        }
                        Iterator it2 = arrayList2.iterator();
                        Integer numValueOf2 = null;
                        if (it2.hasNext()) {
                            numValueOf = Integer.valueOf(((Placeable) it2.next()).d);
                            while (it2.hasNext()) {
                                Integer numValueOf3 = Integer.valueOf(((Placeable) it2.next()).d);
                                if (numValueOf.compareTo(numValueOf3) < 0) {
                                    numValueOf = numValueOf3;
                                }
                            }
                        } else {
                            numValueOf = null;
                        }
                        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            numValueOf2 = Integer.valueOf(((Placeable) it3.next()).e);
                            while (it3.hasNext()) {
                                Integer numValueOf4 = Integer.valueOf(((Placeable) it3.next()).e);
                                if (numValueOf2.compareTo(numValueOf4) < 0) {
                                    numValueOf2 = numValueOf4;
                                }
                            }
                        }
                        final int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
                        final long jFloatToRawIntBits = (Float.floatToRawIntBits(iIntValue) << 32) | (Float.floatToRawIntBits(iIntValue2) & 4294967295L);
                        if (Build.VERSION.SDK_INT >= 33) {
                            WaveBackgroundContainerSlots waveBackgroundContainerSlots = WaveBackgroundContainerSlots.d;
                            final MutableState mutableState = isAnimating;
                            final Animatable animatable = scale;
                            final Animatable animatable2 = alpha;
                            final Modifier modifier2 = modifier;
                            final float f2 = f;
                            List listX02 = SubcomposeLayout.X0(waveBackgroundContainerSlots, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$WaveBackgroundContainer$1$1$backgroundPlaceables$1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer2 = (Composer) obj3;
                                    if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        WaveBackgroundModifierKt.a(mutableState, animatable, animatable2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, composer2, 576);
                                        int i4 = iIntValue;
                                        SubcomposeMeasureScope subcomposeMeasureScope = SubcomposeLayout;
                                        Modifier modifierR = SizeKt.r(modifier2, subcomposeMeasureScope.B(i4), subcomposeMeasureScope.B(iIntValue2));
                                        final List listR = CollectionsKt.R(new Color(ColorKt.d(4281390709L)), new Color(ColorKt.d(4281972042L)), new Color(ColorKt.d(4292802835L)), new Color(ColorKt.d(4281390709L)));
                                        final Animatable animatable3 = animatable;
                                        final Animatable animatable4 = animatable2;
                                        final MutableState mutableState2 = mutableState;
                                        final long j = jFloatToRawIntBits;
                                        final float f3 = f2;
                                        BoxKt.a(ComposedModifierKt.a(modifierR, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1
                                            @Override // kotlin.jvm.functions.Function3
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                Modifier composed = (Modifier) obj5;
                                                Composer composer3 = (Composer) obj6;
                                                ((Number) obj7).intValue();
                                                Intrinsics.h(composed, "$this$composed");
                                                composer3.o(51816786);
                                                composer3.o(1849434622);
                                                Object objG2 = composer3.G();
                                                Object obj8 = Composer.Companion.f1624a;
                                                if (objG2 == obj8) {
                                                    objG2 = SnapshotStateKt.f(new Offset(0L));
                                                    composer3.A(objG2);
                                                }
                                                MutableState mutableState3 = (MutableState) objG2;
                                                Object objE = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                if (objE == obj8) {
                                                    objE = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
                                                    composer3.A(objE);
                                                }
                                                MutableFloatState mutableFloatState = (MutableFloatState) objE;
                                                Object objE2 = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                if (objE2 == obj8) {
                                                    objE2 = SnapshotStateKt.f(Boolean.TRUE);
                                                    composer3.A(objE2);
                                                }
                                                MutableState mutableState4 = (MutableState) objE2;
                                                Object objE3 = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                if (objE3 == obj8) {
                                                    objE3 = AnimatableKt.a(BitmapDescriptorFactory.HUE_RED);
                                                    composer3.A(objE3);
                                                }
                                                Animatable animatable5 = (Animatable) objE3;
                                                Object objE4 = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                if (objE4 == obj8) {
                                                    objE4 = AnimatableKt.a(1.0f);
                                                    composer3.A(objE4);
                                                }
                                                Animatable animatable6 = (Animatable) objE4;
                                                Object objE5 = au.com.woolworths.android.onesite.a.e(composer3, 1849434622);
                                                if (objE5 == obj8) {
                                                    objE5 = AnimatableKt.a(1.0f);
                                                    composer3.A(objE5);
                                                }
                                                Animatable animatable7 = (Animatable) objE5;
                                                composer3.l();
                                                Animatable animatable8 = animatable3;
                                                final Animatable animatable9 = animatable8 == null ? animatable6 : animatable8;
                                                Animatable animatable10 = animatable4;
                                                final Animatable animatable11 = animatable10 == null ? animatable7 : animatable10;
                                                Boolean bool = (Boolean) mutableState4.getD();
                                                bool.getClass();
                                                composer3.o(-1224400529);
                                                MutableState mutableState5 = mutableState2;
                                                boolean zN = composer3.n(mutableState5) | composer3.I(animatable5) | composer3.s(4000L);
                                                Object objG3 = composer3.G();
                                                if (zN || objG3 == obj8) {
                                                    objG3 = new WaveBackgroundModifierKt$waveBackground$1$1$1(mutableState5, animatable5, mutableState4, null);
                                                    composer3.A(objG3);
                                                }
                                                composer3.l();
                                                EffectsKt.f(mutableState5, bool, (Function2) objG3, composer3);
                                                Object objF = animatable5.f();
                                                composer3.o(-1746271574);
                                                boolean zI = composer3.I(animatable5) | composer3.s(j);
                                                Object objG4 = composer3.G();
                                                if (zI || objG4 == obj8) {
                                                    Object waveBackgroundModifierKt$waveBackground$1$2$1 = new WaveBackgroundModifierKt$waveBackground$1$2$1(animatable5, j, mutableState3, null);
                                                    composer3.A(waveBackgroundModifierKt$waveBackground$1$2$1);
                                                    objG4 = waveBackgroundModifierKt$waveBackground$1$2$1;
                                                }
                                                composer3.l();
                                                EffectsKt.e(composer3, objF, (Function2) objG4);
                                                Object obj9 = (LifecycleOwner) composer3.x(LocalLifecycleOwnerKt.f2808a);
                                                composer3.o(-1633490746);
                                                boolean zI2 = composer3.I(obj9);
                                                Object objG5 = composer3.G();
                                                if (zI2 || objG5 == obj8) {
                                                    objG5 = new j(2, obj9, mutableState4);
                                                    composer3.A(objG5);
                                                }
                                                composer3.l();
                                                EffectsKt.c(Unit.f24250a, (Function1) objG5, composer3);
                                                composer3.o(-1633490746);
                                                boolean zN2 = composer3.n(mutableState5);
                                                Object objG6 = composer3.G();
                                                if (zN2 || objG6 == obj8) {
                                                    objG6 = new WaveBackgroundModifierKt$waveBackground$1$4$1(mutableFloatState, mutableState5, null);
                                                    composer3.A(objG6);
                                                }
                                                composer3.l();
                                                EffectsKt.e(composer3, mutableState5, (Function2) objG6);
                                                boolean zBooleanValue = ((Boolean) mutableState5.getD()).booleanValue();
                                                Modifier modifierA = Modifier.Companion.d;
                                                if (zBooleanValue && ((Boolean) mutableState4.getD()).booleanValue()) {
                                                    final long j2 = ((Offset) mutableState3.getD()).f1751a;
                                                    final float fA = mutableFloatState.a();
                                                    final float fFloatValue = ((Number) animatable5.f()).floatValue();
                                                    final long j3 = j;
                                                    final float f4 = f3;
                                                    final List list = listR;
                                                    modifierA = ComposedModifierKt.a(modifierA, InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$rippleEffect$1
                                                        @Override // kotlin.jvm.functions.Function3
                                                        public final Object invoke(Object obj10, Object obj11, Object obj12) throws Resources.NotFoundException, IOException {
                                                            Modifier composed2 = (Modifier) obj10;
                                                            Composer composer4 = (Composer) obj11;
                                                            ((Number) obj12).intValue();
                                                            Intrinsics.h(composed2, "$this$composed");
                                                            composer4.o(1942209055);
                                                            Context context = (Context) composer4.x(AndroidCompositionLocals_androidKt.b);
                                                            composer4.o(1849434622);
                                                            Object objG7 = composer4.G();
                                                            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                                            if (objG7 == composer$Companion$Empty$1) {
                                                                InputStream inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.ripple_wave_shader);
                                                                Intrinsics.g(inputStreamOpenRawResource, "openRawResource(...)");
                                                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource, Charsets.f24671a), 8192);
                                                                try {
                                                                    objG7 = TextStreamsKt.b(bufferedReader);
                                                                    bufferedReader.close();
                                                                    composer4.A(objG7);
                                                                } finally {
                                                                }
                                                            }
                                                            String str = (String) objG7;
                                                            Object objE6 = au.com.woolworths.android.onesite.a.e(composer4, 1849434622);
                                                            if (objE6 == composer$Companion$Empty$1) {
                                                                objE6 = androidx.media3.exoplayer.audio.a.b(str);
                                                                composer4.A(objE6);
                                                            }
                                                            final RuntimeShader runtimeShaderA = androidx.media3.exoplayer.audio.a.a(objE6);
                                                            composer4.l();
                                                            final float f5 = fFloatValue;
                                                            final long j4 = j2;
                                                            final long j5 = j3;
                                                            final long j6 = j3;
                                                            final float f6 = fA;
                                                            final List list2 = list;
                                                            final Animatable animatable12 = animatable9;
                                                            final Animatable animatable13 = animatable11;
                                                            final float f7 = f4;
                                                            Modifier modifierD = DrawModifierKt.d(composed2, new Function1() { // from class: au.com.woolworths.compose.utils.modifier.l
                                                                @Override // kotlin.jvm.functions.Function1
                                                                public final Object invoke(Object obj13) {
                                                                    RuntimeShader runtimeShader = runtimeShaderA;
                                                                    ContentDrawScope drawWithContent = (ContentDrawScope) obj13;
                                                                    Intrinsics.h(drawWithContent, "$this$drawWithContent");
                                                                    runtimeShader.setFloatUniform("uTime", f5);
                                                                    long j7 = j4;
                                                                    runtimeShader.setFloatUniform("uOrigin", Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)));
                                                                    runtimeShader.setFloatUniform("uAmplitude", 20.0f);
                                                                    runtimeShader.setFloatUniform("uFrequency", 8.0f);
                                                                    runtimeShader.setFloatUniform("uDecay", 2.0f);
                                                                    runtimeShader.setFloatUniform("uSpeed", 400.0f);
                                                                    long j8 = j5;
                                                                    runtimeShader.setFloatUniform("center", Float.intBitsToFloat((int) (j8 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j8 & 4294967295L)) / 2.0f);
                                                                    long j9 = j6;
                                                                    runtimeShader.setFloatUniform("resolution", Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)));
                                                                    runtimeShader.setFloatUniform("angle", f6);
                                                                    runtimeShader.setFloatUniform("uMaxOffset", 20.0f);
                                                                    List list3 = list2;
                                                                    runtimeShader.setFloatUniform("color1", Color.h(((Color) list3.get(0)).f1766a), Color.g(((Color) list3.get(0)).f1766a), Color.e(((Color) list3.get(0)).f1766a));
                                                                    runtimeShader.setFloatUniform("color2", Color.h(((Color) list3.get(1)).f1766a), Color.g(((Color) list3.get(1)).f1766a), Color.e(((Color) list3.get(1)).f1766a));
                                                                    runtimeShader.setFloatUniform("color3", Color.h(((Color) list3.get(2)).f1766a), Color.g(((Color) list3.get(2)).f1766a), Color.e(((Color) list3.get(2)).f1766a));
                                                                    runtimeShader.setFloatUniform("color4", Color.h(((Color) list3.get(3)).f1766a), Color.g(((Color) list3.get(3)).f1766a), Color.e(((Color) list3.get(3)).f1766a));
                                                                    Canvas canvasA = drawWithContent.getE().a();
                                                                    Paint paint = AndroidPaint_androidKt.a().f1759a;
                                                                    paint.setAntiAlias(true);
                                                                    paint.setStyle(Paint.Style.FILL);
                                                                    Animatable animatable14 = animatable12;
                                                                    paint.setMaskFilter(new BlurMaskFilter(((Number) animatable14.f()).floatValue() * 12.0f, BlurMaskFilter.Blur.NORMAL));
                                                                    paint.setAlpha(RangesKt.c((int) (((Number) animatable13.f()).floatValue() * 255), 0, 255));
                                                                    paint.setShader(runtimeShader);
                                                                    RectF rectF = new RectF(((Number) animatable14.f()).floatValue() * (-10.0f), ((Number) animatable14.f()).floatValue() * (-10.0f), (((Number) animatable14.f()).floatValue() * 10.0f) + Float.intBitsToFloat((int) (drawWithContent.h() >> 32)), (((Number) animatable14.f()).floatValue() * 10.0f) + Float.intBitsToFloat((int) (4294967295L & drawWithContent.h())));
                                                                    android.graphics.Canvas canvasA2 = AndroidCanvas_androidKt.a(canvasA);
                                                                    float f8 = f7;
                                                                    canvasA2.drawRoundRect(rectF, drawWithContent.T1(f8), drawWithContent.T1(f8), paint);
                                                                    return Unit.f24250a;
                                                                }
                                                            });
                                                            composer4.l();
                                                            return modifierD;
                                                        }
                                                    });
                                                }
                                                Modifier modifierA2 = ClipKt.a(composed.x0(modifierA), RoundedCornerShapeKt.b(f3));
                                                composer3.l();
                                                return modifierA2;
                                            }
                                        }), composer2, 0);
                                    }
                                    return Unit.f24250a;
                                }
                            }, true, 274580046));
                            arrayList = new ArrayList(CollectionsKt.s(listX02, 10));
                            Iterator it4 = listX02.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(((Measurable) it4.next()).c0(Constraints.Companion.c(iIntValue, iIntValue2)));
                            }
                        } else {
                            arrayList = EmptyList.d;
                        }
                        return SubcomposeLayout.L0(iIntValue, iIntValue2, EmptyMap.d, new j(1, arrayList, arrayList2));
                    }
                };
                composerImplV.A(function2);
                objG = function2;
            }
            composerImplV.V(false);
            SubcomposeLayoutKt.a(null, (Function2) objG, composerImplV, 0, 1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new n(isAnimating, scale, alpha, f, modifier, composableLambdaImpl, i, 0);
        }
    }
}
