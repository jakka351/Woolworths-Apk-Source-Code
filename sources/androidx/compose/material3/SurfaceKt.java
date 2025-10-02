package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SurfaceKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f1504a = new DynamicProvidableCompositionLocal(SurfaceKt$LocalAbsoluteTonalElevation$1.h);

    public static final void a(Modifier modifier, Shape shape, final long j, long j2, float f, float f2, BorderStroke borderStroke, final Function2 function2, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            modifier = Modifier.Companion.d;
        }
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.f1779a;
        }
        if ((i2 & 8) != 0) {
            j2 = ColorSchemeKt.b(j, composer);
        }
        if ((i2 & 16) != 0) {
            f = 0;
        }
        if ((i2 & 32) != 0) {
            f2 = 0;
        }
        if ((i2 & 64) != 0) {
            borderStroke = null;
        }
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f1504a;
        final float f3 = f + ((Dp) composer.x(dynamicProvidableCompositionLocal)).d;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f4 = f2;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(j2, ContentColorKt.f1427a), dynamicProvidableCompositionLocal.b(new Dp(f3))}, ComposableLambdaKt.c(-70914509, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$2, reason: invalid class name */
            final class AnonymousClass2 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                public static final AnonymousClass2 h = new AnonymousClass2(1);

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    SemanticsPropertiesKt.j((SemanticsPropertyReceiver) obj);
                    return Unit.f24250a;
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", l = {}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new AnonymousClass3(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    AnonymousClass3 anonymousClass3 = (AnonymousClass3) create((PointerInputScope) obj, (Continuation) obj2);
                    Unit unit = Unit.f24250a;
                    anonymousClass3.invokeSuspend(unit);
                    return unit;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    ResultKt.b(obj);
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
                int iIntValue = ((Number) obj2).intValue() & 3;
                Unit unit = Unit.f24250a;
                if (iIntValue == 2 && composer2.c()) {
                    composer2.j();
                    return unit;
                }
                Modifier modifierX0 = SemanticsModifierKt.b(SurfaceKt.d(modifier2, shape2, SurfaceKt.e(j, f3, composer2), borderStroke2, ((Density) composer2.x(CompositionLocalsKt.h)).T1(f4)), false, AnonymousClass2.h).x0(new SuspendPointerInputElement(unit, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new AnonymousClass3(2, null)), 6));
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                int p = composer2.getP();
                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                Modifier modifierD = ComposedModifierKt.d(composer2, modifierX0);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                if (composer2.w() == null) {
                    ComposablesKt.b();
                    throw null;
                }
                composer2.i();
                if (composer2.getO()) {
                    composer2.K(function0);
                } else {
                    composer2.e();
                }
                Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                    androidx.camera.core.impl.b.z(p, composer2, p, function22);
                }
                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                androidx.camera.core.impl.b.A(0, composer2, function2);
                return unit;
            }
        }, composer), composer, 56);
    }

    public static final void b(final boolean z, final Function0 function0, final Modifier modifier, boolean z2, final Shape shape, final long j, long j2, float f, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        final boolean z3 = (i2 & 8) != 0 ? true : z2;
        long jB = (i2 & 64) != 0 ? ColorSchemeKt.b(j, composer) : j2;
        float f2 = 0;
        final float f3 = (i2 & 256) != 0 ? 0 : f;
        final BorderStroke borderStroke2 = (i2 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i2 & 1024) != 0 ? null : mutableInteractionSource;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f1504a;
        final float f4 = ((Dp) composer.x(dynamicProvidableCompositionLocal)).d + f2;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(jB, ContentColorKt.f1427a), dynamicProvidableCompositionLocal.b(new Dp(f4))}, ComposableLambdaKt.c(-1164547968, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1454a;
                    Modifier modifierA = SelectableKt.a(SurfaceKt.d(modifier.x0(MinimumInteractiveModifier.d), shape, SurfaceKt.e(j, f4, composer2), borderStroke2, ((Density) composer2.x(CompositionLocalsKt.h)).T1(f3)), z, mutableInteractionSource2, RippleKt.b(false, BitmapDescriptorFactory.HUE_RED, 0L, composer2, 0, 7), z3, null, function0);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function02);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                }
                return Unit.f24250a;
            }
        }, composer), composer, 56);
    }

    public static final void c(final Function0 function0, final Modifier modifier, boolean z, final Shape shape, final long j, long j2, float f, float f2, BorderStroke borderStroke, final MutableInteractionSource mutableInteractionSource, final ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        final boolean z2 = (i2 & 4) != 0 ? true : z;
        long jB = (i2 & 32) != 0 ? ColorSchemeKt.b(j, composer) : j2;
        float f3 = (i2 & 64) != 0 ? 0 : f;
        final float f4 = (i2 & 128) != 0 ? 0 : f2;
        final BorderStroke borderStroke2 = (i2 & 256) != 0 ? null : borderStroke;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f1504a;
        final float f5 = f3 + ((Dp) composer.x(dynamicProvidableCompositionLocal)).d;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(jB, ContentColorKt.f1427a), dynamicProvidableCompositionLocal.b(new Dp(f5))}, ComposableLambdaKt.c(1279702876, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
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
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1454a;
                    Modifier modifierB = ClickableKt.b(SurfaceKt.d(modifier.x0(MinimumInteractiveModifier.d), shape, SurfaceKt.e(j, f5, composer2), borderStroke2, ((Density) composer2.x(CompositionLocalsKt.h)).T1(f4)), mutableInteractionSource, RippleKt.b(false, BitmapDescriptorFactory.HUE_RED, 0L, composer2, 0, 7), z2, null, null, function0, 24);
                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                    int p = composer2.getP();
                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
                    ComposeUiNode.e3.getClass();
                    Function0 function02 = ComposeUiNode.Companion.b;
                    if (composer2.w() == null) {
                        ComposablesKt.b();
                        throw null;
                    }
                    composer2.i();
                    if (composer2.getO()) {
                        composer2.K(function02);
                    } else {
                        composer2.e();
                    }
                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                    Function2 function2 = ComposeUiNode.Companion.j;
                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                    }
                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                    android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl);
                }
                return Unit.f24250a;
            }
        }, composer), composer, 56);
    }

    public static final Modifier d(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier modifierB = Modifier.Companion.d;
        Modifier modifierX0 = modifier.x0(f > BitmapDescriptorFactory.HUE_RED ? GraphicsLayerModifierKt.b(modifierB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, shape, false, 124895) : modifierB);
        if (borderStroke != null) {
            modifierB = BorderKt.b(modifierB, borderStroke.f828a, borderStroke.b, shape);
        }
        return ClipKt.a(BackgroundKt.b(modifierX0.x0(modifierB), j, shape), shape);
    }

    public static final long e(long j, float f, Composer composer) {
        ColorScheme colorSchemeA = MaterialTheme.a(composer);
        boolean zBooleanValue = ((Boolean) composer.x(ColorSchemeKt.b)).booleanValue();
        long j2 = colorSchemeA.p;
        if (!Color.c(j, j2) || !zBooleanValue) {
            return j;
        }
        if (Dp.a(f, 0)) {
            return j2;
        }
        return ColorKt.g(Color.b(colorSchemeA.t, ((((float) Math.log(f + 1)) * 4.5f) + 2.0f) / 100.0f), j2);
    }
}
