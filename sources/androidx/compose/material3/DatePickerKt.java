package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$SpaceEvenly$1;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.grid.LazyGridStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "yearPickerVisible", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DatePickerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1433a = 48;
    public static final float b = 56;
    public static final float c;
    public static final float d;

    static {
        float f = 12;
        c = f;
        PaddingKt.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, f, 3);
        float f2 = 24;
        float f3 = 16;
        PaddingKt.b(f2, f3, f, BitmapDescriptorFactory.HUE_RED, 8);
        PaddingKt.b(f2, BitmapDescriptorFactory.HUE_RED, f, f, 2);
        d = f3;
    }

    public static final void a(final Function2 function2, final long j, final long j2, final float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-996037719);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i3 == 0) {
            i2 = (composerImplV.n(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.s(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.q(f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierX0 = SizeKt.e(companion, 1.0f).x0(function2 != null ? SizeKt.b(companion, BitmapDescriptorFactory.HUE_RED, f, 1) : companion);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.m, composerImplV, 6);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(594325590);
            if (function2 != null) {
                ProvideContentColorTextStyleKt.a(j, TypographyKt.a(DatePickerModalTokens.h, composerImplV), ComposableLambdaKt.c(1936268514, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.g, false);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                            Function2 function23 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function23);
                            }
                            Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                            androidx.camera.core.impl.b.A(0, composer2, function2);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, ((i2 >> 6) & 14) | KyberEngine.KyberPolyBytes);
            }
            composerImplV.V(false);
            CompositionLocalKt.a(androidx.camera.core.impl.b.g(j2, ContentColorKt.f1427a), composableLambdaImpl, composerImplV, ((i2 >> 12) & 112) | 8);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$DatePickerHeader$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DatePickerKt.a(function2, j, j2, f, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
    public static final void b(final boolean z, final Function0 function0, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final String str, final DatePickerColors datePickerColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        long j;
        ?? r0;
        int i2;
        int i3;
        State stateL;
        BorderStroke borderStroke;
        long j2;
        State stateB;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1434777861);
        int i4 = i | (composerImplV.p(z) ? 32 : 16) | (composerImplV.I(function0) ? 256 : 128) | (composerImplV.p(z2) ? 2048 : 1024) | (composerImplV.p(z3) ? 16384 : 8192) | (composerImplV.p(z4) ? 131072 : 65536) | (composerImplV.p(z5) ? 1048576 : 524288) | (composerImplV.n(str) ? 8388608 : 4194304) | (composerImplV.n(datePickerColors) ? 67108864 : 33554432);
        if ((306783379 & i4) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            boolean z6 = (29360128 & i4) == 8388608;
            Object objG = composerImplV.G();
            if (z6 || objG == Composer.Companion.f1624a) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                        AnnotatedString annotatedString = new AnnotatedString(6, str, null);
                        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                        semanticsPropertyReceiver.b(SemanticsProperties.z, CollectionsKt.Q(annotatedString));
                        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 0);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG);
            Shape shapeB = ShapesKt.b(DatePickerModalTokens.c, composerImplV);
            int i5 = i4 >> 3;
            if (z) {
                datePickerColors.getClass();
                j = 0;
            } else {
                datePickerColors.getClass();
                j = Color.j;
            }
            if (z2) {
                composerImplV.o(-217363149);
                r0 = 0;
                i3 = 6;
                i2 = 100;
                stateL = SingleValueAnimationKt.b(j, AnimationSpecKt.e(100, 0, null, 6), null, composerImplV, 0, 12);
                composerImplV.V(false);
            } else {
                r0 = 0;
                i2 = 100;
                i3 = 6;
                composerImplV.o(-217247953);
                stateL = SnapshotStateKt.l(new Color(j), composerImplV);
                composerImplV.V(false);
            }
            long j3 = ((Color) stateL.getD()).f1766a;
            datePickerColors.getClass();
            if ((!z || !z3) && ((z && !z3) || !z5 || !z3)) {
            }
            if (z5) {
                composerImplV.o(-828303257);
                stateB = SnapshotStateKt.l(new Color(0L), composerImplV);
                composerImplV.V(r0);
                j2 = j3;
                borderStroke = null;
            } else {
                composerImplV.o(-828241443);
                borderStroke = null;
                j2 = j3;
                stateB = SingleValueAnimationKt.b(0L, AnimationSpecKt.e(i2, r0, null, i3), null, composerImplV, 0, 12);
                composerImplV.V(r0);
            }
            SurfaceKt.b(z, function0, modifierB, z3, shapeB, j2, ((Color) stateB.getD()).f1766a, BitmapDescriptorFactory.HUE_RED, (!z4 || z) ? borderStroke : BorderStrokeKt.a(0L, DatePickerModalTokens.g), null, ComposableLambdaKt.c(-2031780827, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Day$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierL = SizeKt.l(Modifier.Companion.d, DatePickerModalTokens.f, DatePickerModalTokens.e);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierL);
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
            }, composerImplV), composerImplV, i5 & 7294, 1408);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(z, function0, z2, z3, z4, z5, str, datePickerColors, composableLambdaImpl, i) { // from class: androidx.compose.material3.DatePickerKt$Day$3
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ boolean j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ boolean l;
                public final /* synthetic */ boolean m;
                public final /* synthetic */ String n;
                public final /* synthetic */ DatePickerColors o;
                public final /* synthetic */ ComposableLambdaImpl p;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(805306375);
                    DatePickerKt.b(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(LazyListState lazyListState, final Long l, final Function1 function1, final Function1 function12, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Long l2;
        Object datePickerKt$HorizontalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        ComposerImpl composerImplV = composer.v(-1994757941);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(lazyListState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l2 = l;
            i2 |= composerImplV.n(l2) ? 32 : 16;
        } else {
            l2 = l;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function12) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= (2097152 & i) == 0 ? composerImplV.n(datePickerFormatter) : composerImplV.I(datePickerFormatter) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(selectableDates) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(datePickerColors) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final CalendarDate calendarDateH = calendarModel.h();
            boolean zN = composerImplV.n(intRange);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = calendarModel.e(intRange.d, 1);
                composerImplV.A(objG);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objG;
            int i3 = i2;
            final Long l3 = l2;
            TextKt.a(TypographyKt.a(DatePickerModalTokens.d, composerImplV), ComposableLambdaKt.c(1504086906, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final AnonymousClass1 h = new AnonymousClass1(1);

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00511 extends Lambda implements Function0<Float> {
                        public static final C00511 h = new C00511(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends Lambda implements Function0<Float> {
                        public static final AnonymousClass2 h = new AnonymousClass2(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertiesKt.m((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00511.h, AnonymousClass2.h, false));
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
                        Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, AnonymousClass1.h);
                        int i4 = DatePickerDefaults.f1430a;
                        DecayAnimationSpec decayAnimationSpecB = DecayAnimationSpecKt.b(3);
                        boolean zN2 = composer2.n(decayAnimationSpecB);
                        LazyListState lazyListState3 = lazyListState2;
                        boolean zN3 = zN2 | composer2.n(lazyListState3);
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (zN3 || objG2 == composer$Companion$Empty$12) {
                            final LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 lazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1 = new LazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1(lazyListState3, SnapPosition.Center.f916a);
                            SnapLayoutInfoProvider snapLayoutInfoProvider = new SnapLayoutInfoProvider() { // from class: androidx.compose.material3.DatePickerDefaults$rememberSnapFlingBehavior$1$snapLayoutInfoProvider$1
                                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                                public final float a(float f) {
                                    return lazyListSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1.a(f);
                                }

                                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                                public final float b(float f, float f2) {
                                    return BitmapDescriptorFactory.HUE_RED;
                                }
                            };
                            SpringSpec springSpecD = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, null, 5);
                            float f = SnapFlingBehaviorKt.f915a;
                            SnapFlingBehavior snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, decayAnimationSpecB, springSpecD);
                            composer2.A(snapFlingBehavior);
                            objG2 = snapFlingBehavior;
                        }
                        TargetedFlingBehavior targetedFlingBehavior = (TargetedFlingBehavior) objG2;
                        boolean zI = composer2.I(intRange) | composer2.I(calendarModel) | composer2.n(calendarMonth) | composer2.n(function1) | composer2.n(calendarDateH) | composer2.n(l3) | composer2.I(datePickerFormatter) | composer2.n(selectableDates) | composer2.n(datePickerColors);
                        Object objG3 = composer2.G();
                        if (zI || objG3 == composer$Companion$Empty$12) {
                            final IntRange intRange2 = intRange;
                            final CalendarModel calendarModel2 = calendarModel;
                            final CalendarMonth calendarMonth2 = calendarMonth;
                            final Function1 function13 = function1;
                            final CalendarDate calendarDate = calendarDateH;
                            final Long l4 = l3;
                            final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                            final SelectableDates selectableDates2 = selectableDates;
                            final DatePickerColors datePickerColors2 = datePickerColors;
                            Function1<LazyListScope, Unit> function14 = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    float f2 = DatePickerKt.f1433a;
                                    IntRange intRange3 = intRange2;
                                    int i5 = ((intRange3.e - intRange3.d) + 1) * 12;
                                    final SelectableDates selectableDates3 = selectableDates2;
                                    final DatePickerColors datePickerColors3 = datePickerColors2;
                                    final CalendarModel calendarModel3 = calendarModel2;
                                    final CalendarMonth calendarMonth3 = calendarMonth2;
                                    final Function1 function15 = function13;
                                    final CalendarDate calendarDate2 = calendarDate;
                                    final Long l5 = l4;
                                    final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                    LazyListScope.g((LazyListScope) obj3, i5, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            int i6;
                                            LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Composer composer3 = (Composer) obj6;
                                            int iIntValue2 = ((Number) obj7).intValue();
                                            if ((iIntValue2 & 6) == 0) {
                                                i6 = (composer3.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                            } else {
                                                i6 = iIntValue2;
                                            }
                                            if ((iIntValue2 & 48) == 0) {
                                                i6 |= composer3.r(iIntValue) ? 32 : 16;
                                            }
                                            if ((i6 & 147) == 146 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                CalendarMonth calendarMonthK = calendarModel3.k(calendarMonth3, iIntValue);
                                                Modifier modifierD = lazyItemScope.d(Modifier.Companion.d, 1.0f);
                                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
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
                                                Function2 function2 = ComposeUiNode.Companion.j;
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                    androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                                }
                                                Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                                DatePickerKt.d(calendarMonthK, function15, calendarDate2.g, l5, null, null, datePickerFormatter3, selectableDates3, datePickerColors3, composer3, 221184);
                                                composer3.f();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 1137566309), 6);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(function14);
                            objG3 = function14;
                        }
                        LazyDslKt.c(modifierB, lazyListState3, null, null, null, targetedFlingBehavior, false, (Function1) objG3, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
            boolean zI = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | composerImplV.I(calendarModel) | composerImplV.I(intRange);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                lazyListState2 = lazyListState;
                datePickerKt$HorizontalMonthsList$2$1 = new DatePickerKt$HorizontalMonthsList$2$1(lazyListState2, function12, calendarModel, intRange, null);
                composerImplV.A(datePickerKt$HorizontalMonthsList$2$1);
            } else {
                datePickerKt$HorizontalMonthsList$2$1 = objG2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.e(composerImplV, lazyListState2, (Function2) datePickerKt$HorizontalMonthsList$2$1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$HorizontalMonthsList$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DatePickerKt.c(lazyListState2, l, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final androidx.compose.material3.internal.CalendarMonth r31, final kotlin.jvm.functions.Function1 r32, final long r33, final java.lang.Long r35, final java.lang.Long r36, final androidx.compose.material3.SelectedRangeInfo r37, final androidx.compose.material3.DatePickerFormatter r38, final androidx.compose.material3.SelectableDates r39, final androidx.compose.material3.DatePickerColors r40, androidx.compose.runtime.Composer r41, final int r42) {
        /*
            Method dump skipped, instructions count: 1056
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.d(androidx.compose.material3.internal.CalendarMonth, kotlin.jvm.functions.Function1, long, java.lang.Long, java.lang.Long, androidx.compose.material3.SelectedRangeInfo, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final void e(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final String str, final Function0 function0, final Function0 function02, final Function0 function03, DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Function0 function04;
        Function0 function05;
        DatePickerColors datePickerColors2;
        ComposerImpl composerImplV = composer.v(-773929258);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            function04 = function02;
            i2 |= composerImplV.I(function04) ? 1048576 : 524288;
        } else {
            function04 = function02;
        }
        if ((12582912 & i) == 0) {
            function05 = function03;
            i2 |= composerImplV.I(function05) ? 8388608 : 4194304;
        } else {
            function05 = function03;
        }
        if ((100663296 & i) == 0) {
            datePickerColors2 = datePickerColors;
            i2 |= composerImplV.n(datePickerColors2) ? 67108864 : 33554432;
        } else {
            datePickerColors2 = datePickerColors;
        }
        if ((i2 & 38347923) == 38347922 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierJ = SizeKt.j(SizeKt.e(modifier, 1.0f), b);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(z3 ? Arrangement.f934a : Arrangement.g, Alignment.Companion.k, composerImplV, 48);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function06 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function06);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f1427a;
            datePickerColors2.getClass();
            final Function0 function07 = function04;
            final Function0 function08 = function05;
            CompositionLocalKt.a(androidx.camera.core.impl.b.g(0L, dynamicProvidableCompositionLocal), ComposableLambdaKt.c(-962805198, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1
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
                        final String str2 = str;
                        DatePickerKt.j(3072, composer2, ComposableLambdaKt.c(1377272806, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    final String str3 = str2;
                                    boolean zN = composer3.n(str3);
                                    Object objG = composer3.G();
                                    if (zN || objG == Composer.Companion.f1624a) {
                                        objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$1$1$1$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj5) {
                                                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj5;
                                                SemanticsPropertiesKt.n(semanticsPropertyReceiver, 0);
                                                SemanticsPropertiesKt.k(semanticsPropertyReceiver, str3);
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer3.A(objG);
                                    }
                                    TextKt.b(str3, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131068);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, function08, z3);
                        if (!z3) {
                            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD2 = ComposedModifierKt.d(composer2, Modifier.Companion.d);
                            ComposeUiNode.e3.getClass();
                            Function0 function09 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function09);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, rowMeasurePolicyA2, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function22 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function22);
                            }
                            Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                            IconButtonKt.a(function07, null, z2, null, ComposableSingletons$DatePickerKt.c, composer2, 196608, 26);
                            IconButtonKt.a(function0, null, z, null, ComposableSingletons$DatePickerKt.d, composer2, 196608, 26);
                            composer2.f();
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final DatePickerColors datePickerColors3 = datePickerColors2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$MonthsNavigation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DatePickerKt.e(modifier, z, z2, z3, str, function0, function02, function03, datePickerColors3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void f(final DatePickerColors datePickerColors, final CalendarModel calendarModel, Composer composer, final int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-1849465391);
        int i2 = (i & 6) == 0 ? (composerImplV.n(datePickerColors) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(calendarModel) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            int b2 = calendarModel.getB();
            List listI = calendarModel.i();
            ArrayList arrayList = new ArrayList();
            boolean z = true;
            int i3 = b2 - 1;
            int size = listI.size();
            for (int i4 = i3; i4 < size; i4++) {
                arrayList.add(listI.get(i4));
            }
            boolean z2 = false;
            for (int i5 = 0; i5 < i3; i5++) {
                arrayList.add(listI.get(i5));
            }
            TextStyle textStyleA = TypographyKt.a(DatePickerModalTokens.j, composerImplV);
            Modifier.Companion companion = Modifier.Companion.d;
            float f = f1433a;
            Modifier modifierE = SizeKt.e(SizeKt.b(companion, BitmapDescriptorFactory.HUE_RED, f, 1), 1.0f);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f, Alignment.Companion.k, composerImplV, 54);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierE);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(396197267);
            int size2 = arrayList.size();
            int i7 = 0;
            while (i7 < size2) {
                final Pair pair = (Pair) arrayList.get(i7);
                boolean zN = composerImplV.n(pair);
                Object objG = composerImplV.G();
                if (zN || objG == Composer.Companion.f1624a) {
                    objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$1$1$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj, (String) pair.d);
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                Modifier modifierR = SizeKt.r(SemanticsModifierKt.a(companion, (Function1) objG), f, f);
                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, z2);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
                Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierR);
                ComposeUiNode.e3.getClass();
                Function0 function02 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function02);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ2, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, composerImplV, i8, function22);
                }
                Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
                String str = (String) pair.e;
                Modifier modifierZ = SizeKt.z(companion, null, 3);
                datePickerColors.getClass();
                ComposerImpl composerImpl2 = composerImplV;
                TextKt.b(str, modifierZ, 0L, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, textStyleA, composerImpl2, 48, 0, 65016);
                composerImpl2.V(true);
                i7++;
                z = true;
                composerImplV = composerImpl2;
                size2 = size2;
                companion = companion;
                f = f;
                arrayList = arrayList;
                z2 = false;
            }
            composerImpl = composerImplV;
            composerImpl.V(z2);
            composerImpl.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$WeekDays$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    DatePickerKt.f(datePickerColors, calendarModel, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(final java.lang.Long r27, final long r28, final kotlin.jvm.functions.Function1 r30, final kotlin.jvm.functions.Function1 r31, final androidx.compose.material3.internal.CalendarModel r32, final kotlin.ranges.IntRange r33, final androidx.compose.material3.DatePickerFormatter r34, final androidx.compose.material3.SelectableDates r35, final androidx.compose.material3.DatePickerColors r36, androidx.compose.runtime.Composer r37, final int r38) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DatePickerKt.g(java.lang.Long, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    public static final void h(final Modifier modifier, final boolean z, final boolean z2, final Function0 function0, final boolean z3, final String str, final DatePickerColors datePickerColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Object obj;
        Object objA;
        long j;
        ComposerImpl composerImplV = composer.v(238547184);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.p(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(str) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj = datePickerColors;
            i2 |= composerImplV.n(obj) ? 1048576 : 524288;
        } else {
            obj = datePickerColors;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            boolean z4 = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z4 || objG == composer$Companion$Empty$1) {
                if (!z2 || z) {
                    objA = null;
                } else {
                    float f = DatePickerModalTokens.g;
                    obj.getClass();
                    objA = BorderStrokeKt.a(0L, f);
                }
                composerImplV.A(objA);
            } else {
                objA = objG;
            }
            BorderStroke borderStroke = (BorderStroke) objA;
            boolean z5 = (458752 & i2) == 131072;
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                        AnnotatedString annotatedString = new AnnotatedString(6, str, null);
                        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                        semanticsPropertyReceiver.b(SemanticsProperties.z, CollectionsKt.Q(annotatedString));
                        SemanticsPropertiesKt.r(semanticsPropertyReceiver, 0);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            Modifier modifierB = SemanticsModifierKt.b(modifier, true, (Function1) objG2);
            Shape shapeB = ShapesKt.b(DatePickerModalTokens.n, composerImplV);
            int i3 = i2 >> 3;
            int i4 = i3 & 14;
            if (z) {
                obj.getClass();
                j = 0;
            } else {
                obj.getClass();
                j = Color.j;
            }
            long j2 = ((Color) SingleValueAnimationKt.b(j, AnimationSpecKt.e(100, 0, null, 6), null, composerImplV, 0, 12).getD()).f1766a;
            int i5 = i2 >> 6;
            if (z && z3) {
                datePickerColors.getClass();
            } else if ((!z || z3) && !z2 && z3) {
                datePickerColors.getClass();
            } else {
                datePickerColors.getClass();
            }
            SurfaceKt.b(z, function0, modifierB, z3, shapeB, j2, ((Color) SingleValueAnimationKt.b(0L, AnimationSpecKt.e(100, 0, null, 6), null, composerImplV, 0, 12).getD()).f1766a, BitmapDescriptorFactory.HUE_RED, borderStroke, null, ComposableLambdaKt.c(-1573188346, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = SizeKt.e(Modifier.Companion.d, 1.0f);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
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
            }, composerImplV), composerImplV, (i3 & 7168) | i4 | (i5 & 112), 1408);
            composerImplV = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$Year$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    DatePickerKt.h(modifier, z, z2, function0, z3, str, datePickerColors, composableLambdaImpl, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void i(final Modifier modifier, final long j, final Function1 function1, final SelectableDates selectableDates, final CalendarModel calendarModel, final IntRange intRange, final DatePickerColors datePickerColors, Composer composer, final int i) {
        Modifier modifier2;
        int i2;
        ComposerImpl composerImplV = composer.v(-1286899812);
        if ((i & 6) == 0) {
            modifier2 = modifier;
            i2 = (composerImplV.n(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(selectableDates) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(calendarModel) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(intRange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(datePickerColors) ? 1048576 : 524288;
        }
        if ((i2 & 599187) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final Modifier modifier3 = modifier2;
            TextKt.a(TypographyKt.a(DatePickerModalTokens.m, composerImplV), ComposableLambdaKt.c(1301915789, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final AnonymousClass1 h = new AnonymousClass1(1);

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00521 extends Lambda implements Function0<Float> {
                        public static final C00521 h = new C00521(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends Lambda implements Function0<Float> {
                        public static final AnonymousClass2 h = new AnonymousClass2(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertiesKt.w((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00521.h, AnonymousClass2.h, false));
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
                        CalendarModel calendarModel2 = calendarModel;
                        final int i3 = calendarModel2.g(calendarModel2.h()).f1552a;
                        final int i4 = calendarModel2.f(j).f1552a;
                        IntRange intRange2 = intRange;
                        final LazyGridState lazyGridStateA = LazyGridStateKt.a(Math.max(0, (i4 - intRange2.d) - 3), 2, composer2);
                        DatePickerColors datePickerColors2 = datePickerColors;
                        datePickerColors2.getClass();
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer2.y()));
                            composer2.A(objG);
                        }
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
                        final String strA = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_picker_scroll_to_earlier_years);
                        final String strA2 = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_picker_scroll_to_later_years);
                        GridCells.Fixed fixed = new GridCells.Fixed(3);
                        Modifier modifierB = SemanticsModifierKt.b(BackgroundKt.b(modifier3, 0L, RectangleShapeKt.f1779a), false, AnonymousClass1.h);
                        Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
                        Arrangement$SpaceEvenly$1 arrangement$SpaceEvenly$1 = Arrangement.f;
                        Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(DatePickerKt.d);
                        boolean zN = composer2.n(datePickerColors2) | composer2.I(intRange2) | composer2.n(lazyGridStateA) | composer2.I(coroutineScope) | composer2.n(strA) | composer2.n(strA2) | composer2.r(i4) | composer2.r(i3) | composer2.n(function1) | composer2.n(selectableDates);
                        Object objG2 = composer2.G();
                        if (zN || objG2 == composer$Companion$Empty$1) {
                            final IntRange intRange3 = intRange;
                            final Function1 function12 = function1;
                            final SelectableDates selectableDates2 = selectableDates;
                            final DatePickerColors datePickerColors3 = datePickerColors;
                            Function1<LazyGridScope, Unit> function13 = new Function1<LazyGridScope, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int size;
                                    LazyGridScope lazyGridScope = (LazyGridScope) obj3;
                                    Iterable iterable = intRange3;
                                    Intrinsics.h(iterable, "<this>");
                                    if (iterable instanceof Collection) {
                                        size = ((Collection) iterable).size();
                                    } else {
                                        IntProgressionIterator it = iterable.iterator();
                                        size = 0;
                                        while (it.f) {
                                            it.next();
                                            size++;
                                            if (size < 0) {
                                                CollectionsKt.y0();
                                                throw null;
                                            }
                                        }
                                    }
                                    final SelectableDates selectableDates3 = selectableDates2;
                                    final DatePickerColors datePickerColors4 = datePickerColors3;
                                    final IntRange intRange4 = intRange3;
                                    final LazyGridState lazyGridState = lazyGridStateA;
                                    final CoroutineScope coroutineScope2 = coroutineScope;
                                    final String str = strA;
                                    final String str2 = strA2;
                                    final int i5 = i4;
                                    final int i6 = i3;
                                    final Function1 function14 = function12;
                                    LazyGridScope.h(lazyGridScope, size, null, null, null, new ComposableLambdaImpl(new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            final int iIntValue = ((Number) obj5).intValue();
                                            Composer composer3 = (Composer) obj6;
                                            int iIntValue2 = ((Number) obj7).intValue();
                                            if ((iIntValue2 & 48) == 0) {
                                                iIntValue2 |= composer3.r(iIntValue) ? 32 : 16;
                                            }
                                            if ((iIntValue2 & 145) == 144 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                final int i7 = iIntValue + intRange4.d;
                                                final String strA3 = CalendarLocale_jvmKt.a(i7, 7);
                                                Modifier modifierL = SizeKt.l(Modifier.Companion.d, DatePickerModalTokens.l, DatePickerModalTokens.k);
                                                boolean zN2 = composer3.n(lazyGridState);
                                                boolean z = (iIntValue2 & 112) == 32;
                                                final CoroutineScope coroutineScope3 = coroutineScope2;
                                                boolean zI = z | zN2 | composer3.I(coroutineScope3) | composer3.n(str) | composer3.n(str2);
                                                Object objG3 = composer3.G();
                                                Object obj8 = Composer.Companion.f1624a;
                                                if (zI || objG3 == obj8) {
                                                    final LazyGridState lazyGridState2 = lazyGridState;
                                                    final String str3 = str;
                                                    final String str4 = str2;
                                                    objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(1);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj9) {
                                                            List listR;
                                                            LazyGridItemInfo lazyGridItemInfo;
                                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj9;
                                                            final LazyGridState lazyGridState3 = lazyGridState2;
                                                            int iG = lazyGridState3.g();
                                                            int i8 = iIntValue;
                                                            if (iG == i8 || ((lazyGridItemInfo = (LazyGridItemInfo) CollectionsKt.P(lazyGridState3.i().f())) != null && lazyGridItemInfo.getF996a() == i8)) {
                                                                float f = DatePickerKt.f1433a;
                                                                final CoroutineScope coroutineScope4 = coroutineScope3;
                                                                listR = CollectionsKt.R(new CustomAccessibilityAction(str3, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1

                                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1", f = "DatePicker.kt", l = {2242}, m = "invokeSuspend")
                                                                    /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
                                                                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public int p;
                                                                        public final /* synthetic */ LazyGridState q;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass1(LazyGridState lazyGridState, Continuation continuation) {
                                                                            super(2, continuation);
                                                                            this.q = lazyGridState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                                            return new AnonymousClass1(this.q, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Object invokeSuspend(Object obj) {
                                                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                                            int i = this.p;
                                                                            if (i == 0) {
                                                                                ResultKt.b(obj);
                                                                                LazyGridState lazyGridState = this.q;
                                                                                int iG = lazyGridState.g() - 3;
                                                                                this.p = 1;
                                                                                if (LazyGridState.j(lazyGridState, iG, this) == coroutineSingletons) {
                                                                                    return coroutineSingletons;
                                                                                }
                                                                            } else {
                                                                                if (i != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.b(obj);
                                                                            }
                                                                            return Unit.f24250a;
                                                                        }
                                                                    }

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        boolean z2;
                                                                        LazyGridState lazyGridState4 = lazyGridState3;
                                                                        if (lazyGridState4.d()) {
                                                                            BuildersKt.c(coroutineScope4, null, null, new AnonymousClass1(lazyGridState4, null), 3);
                                                                            z2 = true;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        return Boolean.valueOf(z2);
                                                                    }
                                                                }), new CustomAccessibilityAction(str4, new Function0<Boolean>() { // from class: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1

                                                                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                                    @DebugMetadata(c = "androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1", f = "DatePicker.kt", l = {2250}, m = "invokeSuspend")
                                                                    /* renamed from: androidx.compose.material3.DatePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
                                                                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                                        public int p;
                                                                        public final /* synthetic */ LazyGridState q;

                                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                        public AnonymousClass1(LazyGridState lazyGridState, Continuation continuation) {
                                                                            super(2, continuation);
                                                                            this.q = lazyGridState;
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Continuation create(Object obj, Continuation continuation) {
                                                                            return new AnonymousClass1(this.q, continuation);
                                                                        }

                                                                        @Override // kotlin.jvm.functions.Function2
                                                                        public final Object invoke(Object obj, Object obj2) {
                                                                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                                                                        }

                                                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        public final Object invokeSuspend(Object obj) {
                                                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                                                                            int i = this.p;
                                                                            if (i == 0) {
                                                                                ResultKt.b(obj);
                                                                                LazyGridState lazyGridState = this.q;
                                                                                int iG = lazyGridState.g() + 3;
                                                                                this.p = 1;
                                                                                if (LazyGridState.j(lazyGridState, iG, this) == coroutineSingletons) {
                                                                                    return coroutineSingletons;
                                                                                }
                                                                            } else {
                                                                                if (i != 1) {
                                                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                                }
                                                                                ResultKt.b(obj);
                                                                            }
                                                                            return Unit.f24250a;
                                                                        }
                                                                    }

                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(0);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function0
                                                                    public final Object invoke() {
                                                                        boolean z2;
                                                                        LazyGridState lazyGridState4 = lazyGridState3;
                                                                        if (lazyGridState4.b()) {
                                                                            BuildersKt.c(coroutineScope4, null, null, new AnonymousClass1(lazyGridState4, null), 3);
                                                                            z2 = true;
                                                                        } else {
                                                                            z2 = false;
                                                                        }
                                                                        return Boolean.valueOf(z2);
                                                                    }
                                                                }));
                                                            } else {
                                                                listR = EmptyList.d;
                                                            }
                                                            SemanticsPropertiesKt.l(semanticsPropertyReceiver, listR);
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer3.A(objG3);
                                                }
                                                Modifier modifierB2 = SemanticsModifierKt.b(modifierL, false, (Function1) objG3);
                                                boolean z2 = i7 == i5;
                                                boolean z3 = i7 == i6;
                                                final Function1 function15 = function14;
                                                boolean zN3 = composer3.n(function15) | composer3.r(i7);
                                                Object objG4 = composer3.G();
                                                if (zN3 || objG4 == obj8) {
                                                    objG4 = new Function0<Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$2$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        {
                                                            super(0);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            function15.invoke(Integer.valueOf(i7));
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer3.A(objG4);
                                                }
                                                selectableDates3.getClass();
                                                DatePickerKt.h(modifierB2, z2, z3, (Function0) objG4, true, String.format(Strings_androidKt.a(composer3, com.woolworths.R.string.m3c_date_picker_navigate_to_year_description), Arrays.copyOf(new Object[]{strA3}, 1)), datePickerColors4, ComposableLambdaKt.c(882189459, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt.YearPicker.1.2.1.1.3

                                                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                                                    /* renamed from: androidx.compose.material3.DatePickerKt$YearPicker$1$2$1$1$3$1, reason: invalid class name and collision with other inner class name */
                                                    final class C00531 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                                                        public static final C00531 h = new C00531(1);

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
                                                    public final Object invoke(Object obj9, Object obj10) {
                                                        Composer composer4 = (Composer) obj9;
                                                        if ((((Number) obj10).intValue() & 3) == 2 && composer4.c()) {
                                                            composer4.j();
                                                        } else {
                                                            TextKt.b(strA3, SemanticsModifierKt.a(Modifier.Companion.d, C00531.h), 0L, 0L, null, null, null, 0L, null, new TextAlign(3), 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 130556);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, composer3), composer3, 12582912);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, 1040623618), 14);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(function13);
                            objG2 = function13;
                        }
                        LazyGridDslKt.a(fixed, modifierB, lazyGridStateA, null, spacedAlignedG, arrangement$SpaceEvenly$1, null, false, (Function1) objG2, composer2, 1769472);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPicker$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DatePickerKt.i(modifier, j, function1, selectableDates, calendarModel, intRange, datePickerColors, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void j(final int i, Composer composer, final ComposableLambdaImpl composableLambdaImpl, Modifier modifier, final Function0 function0, final boolean z) {
        int i2;
        final Modifier modifier2;
        ComposerImpl composerImplV = composer.v(409654418);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1404a;
            Modifier.Companion companion = Modifier.Companion.d;
            ButtonKt.b(function0, companion, false, roundedCornerShape, ButtonDefaults.b(0L, ((Color) composerImplV.x(ContentColorKt.f1427a)).f1766a, composerImplV, 13), null, ComposableLambdaKt.c(1899012021, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    String strA;
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        composableLambdaImpl.invoke(composer2, 0);
                        float f = ButtonDefaults.d;
                        Modifier.Companion companion2 = Modifier.Companion.d;
                        SpacerKt.a(composer2, SizeKt.q(companion2, f));
                        ImageVector imageVectorD = ArrowDropDownKt.f1355a;
                        if (imageVectorD == null) {
                            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = VectorKt.f1820a;
                            SolidColor solidColor = new SolidColor(Color.b);
                            PathBuilder pathBuilder = new PathBuilder();
                            pathBuilder.i(7.0f, 10.0f);
                            pathBuilder.h(5.0f, 5.0f);
                            pathBuilder.h(5.0f, -5.0f);
                            pathBuilder.a();
                            builder.b((14420 & 16) != 0 ? 1.0f : 1.0f, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 0, 0, 2, solidColor, (14420 & 32) != 0 ? null : null, "", pathBuilder.f1816a);
                            imageVectorD = builder.d();
                            ArrowDropDownKt.f1355a = imageVectorD;
                        }
                        boolean z2 = z;
                        if (z2) {
                            composer2.o(-1360040181);
                            strA = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_picker_switch_to_day_selection);
                            composer2.l();
                        } else {
                            composer2.o(-1359945910);
                            strA = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_picker_switch_to_year_selection);
                            composer2.l();
                        }
                        IconKt.b(imageVectorD, strA, RotateKt.a(companion2, z2 ? 180.0f : BitmapDescriptorFactory.HUE_RED), 0L, composer2, 0, 8);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i3 & 14) | 807075840 | ((i3 >> 3) & 112), 388);
            composerImplV = composerImplV;
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$YearPickerMenuButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DatePickerKt.j(RecomposeScopeImplKt.a(i | 1), (Composer) obj, composableLambdaImpl, modifier2, function0, z);
                    return Unit.f24250a;
                }
            };
        }
    }
}
