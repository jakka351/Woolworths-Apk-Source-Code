package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerKt$SwitchableDateEntryContent$4 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ CalendarModel m;
    public final /* synthetic */ IntRange n;
    public final /* synthetic */ DatePickerFormatter o;
    public final /* synthetic */ SelectableDates p;
    public final /* synthetic */ DatePickerColors q;
    public final /* synthetic */ int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerKt$SwitchableDateEntryContent$4(Long l, long j, int i, Function1 function1, Function1 function12, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2) {
        super(2);
        this.h = l;
        this.i = j;
        this.j = i;
        this.k = function1;
        this.l = function12;
        this.m = calendarModel;
        this.n = intRange;
        this.o = datePickerFormatter;
        this.p = selectableDates;
        this.q = datePickerColors;
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        final CalendarModel calendarModel;
        final Long l;
        final long j;
        final SelectableDates selectableDates;
        final Function1 function1;
        final Function1 function12;
        final IntRange intRange;
        final DatePickerFormatter datePickerFormatter;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.r | 1);
        float f = DatePickerKt.f1433a;
        ComposerImpl composerImplV = ((Composer) obj).v(-895379221);
        int i2 = iA & 6;
        Long l2 = this.h;
        if (i2 == 0) {
            i = (composerImplV.n(l2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        long j2 = this.i;
        if (i3 == 0) {
            i |= composerImplV.s(j2) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        int i5 = this.j;
        if (i4 == 0) {
            i |= composerImplV.r(i5) ? 256 : 128;
        }
        int i6 = iA & 3072;
        Function1 function13 = this.k;
        if (i6 == 0) {
            i |= composerImplV.I(function13) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        Function1 function14 = this.l;
        if (i7 == 0) {
            i |= composerImplV.I(function14) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        CalendarModel calendarModel2 = this.m;
        if (i8 == 0) {
            i |= composerImplV.I(calendarModel2) ? 131072 : 65536;
        }
        int i9 = 1572864 & iA;
        IntRange intRange2 = this.n;
        if (i9 == 0) {
            i |= composerImplV.I(intRange2) ? 1048576 : 524288;
        }
        int i10 = 12582912 & iA;
        DatePickerFormatter datePickerFormatter2 = this.o;
        if (i10 == 0) {
            i |= (16777216 & iA) == 0 ? composerImplV.n(datePickerFormatter2) : composerImplV.I(datePickerFormatter2) ? 8388608 : 4194304;
        }
        int i11 = 100663296 & iA;
        SelectableDates selectableDates2 = this.p;
        if (i11 == 0) {
            i |= composerImplV.n(selectableDates2) ? 67108864 : 33554432;
        }
        int i12 = 805306368 & iA;
        final DatePickerColors datePickerColors = this.q;
        if (i12 == 0) {
            i |= composerImplV.n(datePickerColors) ? 536870912 : 268435456;
        }
        if ((306783379 & i) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            calendarModel = calendarModel2;
            l = l2;
            j = j2;
            selectableDates = selectableDates2;
            function1 = function13;
            function12 = function14;
            intRange = intRange2;
            datePickerFormatter = datePickerFormatter2;
        } else {
            final int i13 = -((Density) composerImplV.x(CompositionLocalsKt.h)).r1(48);
            calendarModel = calendarModel2;
            DisplayMode displayMode = new DisplayMode(i5);
            int i14 = i;
            Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, DatePickerKt$SwitchableDateEntryContent$1.h);
            boolean zR = composerImplV.r(i13);
            Object objG = composerImplV.G();
            if (zR || objG == Composer.Companion.f1624a) {
                objG = new Function1<AnimatedContentTransitionScope<DisplayMode>, ContentTransform>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "height", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends Lambda implements Function1<Integer, Integer> {
                        public static final AnonymousClass1 h = new AnonymousClass1(1);

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(((Number) obj).intValue());
                        }
                    }

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "fullHeight", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$4, reason: invalid class name */
                    final class AnonymousClass4 extends Lambda implements Function1<Integer, Integer> {
                        public static final AnonymousClass4 h = new AnonymousClass4(1);

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(((Number) obj).intValue());
                        }
                    }

                    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/ui/unit/IntSize;", "<anonymous parameter 0>", "<anonymous parameter 1>", "invoke-TemP2vQ", "(JJ)Landroidx/compose/animation/core/FiniteAnimationSpec;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1$5, reason: invalid class name */
                    final class AnonymousClass5 extends Lambda implements Function2<IntSize, IntSize, FiniteAnimationSpec<IntSize>> {
                        public static final AnonymousClass5 h = new AnonymousClass5(2);

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            long j = ((IntSize) obj).f2202a;
                            long j2 = ((IntSize) obj2).f2202a;
                            return AnimationSpecKt.e(500, 0, MotionTokens.b, 2);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        AnimatedContentTransitionScope animatedContentTransitionScope = (AnimatedContentTransitionScope) obj3;
                        int i15 = ((DisplayMode) animatedContentTransitionScope.getB()).f1438a;
                        final int i16 = i13;
                        return animatedContentTransitionScope.g(i15 == 1 ? AnimatedContentKt.d(EnterExitTransitionKt.n(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnonymousClass1.h).b(EnterExitTransitionKt.e(AnimationSpecKt.e(100, 100, null, 4), 2)), EnterExitTransitionKt.f(AnimationSpecKt.e(100, 0, null, 6), 2).b(EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ((Number) obj4).intValue();
                                return Integer.valueOf(i16);
                            }
                        }))) : AnimatedContentKt.d(EnterExitTransitionKt.n(AnimationSpecKt.e(0, 50, null, 5), new Function1<Integer, Integer>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$2$1.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ((Number) obj4).intValue();
                                return Integer.valueOf(i16);
                            }
                        }).b(EnterExitTransitionKt.e(AnimationSpecKt.e(100, 100, null, 4), 2)), EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), AnonymousClass4.h).b(EnterExitTransitionKt.f(AnimationSpecKt.e(100, 0, null, 6), 2))), AnimatedContentKt.c(AnonymousClass5.h));
                    }
                };
                composerImplV.A(objG);
            }
            l = l2;
            j = j2;
            selectableDates = selectableDates2;
            function1 = function13;
            function12 = function14;
            intRange = intRange2;
            datePickerFormatter = datePickerFormatter2;
            AnimatedContentKt.b(displayMode, modifierB, (Function1) objG, null, "DatePickerDisplayModeAnimation", null, ComposableLambdaKt.c(-459778869, new Function4<AnimatedContentScope, DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DatePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                    int i15 = ((DisplayMode) obj4).f1438a;
                    Composer composer = (Composer) obj5;
                    ((Number) obj6).intValue();
                    if (i15 == 0) {
                        composer.o(-1870116901);
                        DatePickerKt.g(l, j, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
                        composer.l();
                    } else if (i15 == 1) {
                        composer.o(-1870098348);
                        DateInputKt.a(l, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer, 0);
                        composer.l();
                    } else {
                        composer.o(-2138080579);
                        composer.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i14 >> 6) & 14) | 1597440, 40);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DatePickerKt$SwitchableDateEntryContent$4(l, j, i5, function1, function12, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, iA);
        }
        return Unit.f24250a;
    }
}
