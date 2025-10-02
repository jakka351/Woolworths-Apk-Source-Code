package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.IntOffsetKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DateRangePickerKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f1435a = PaddingKt.b(24, 20, BitmapDescriptorFactory.HUE_RED, 8, 4);

    static {
        float f = 64;
        float f2 = 12;
        PaddingKt.b(f, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10);
        PaddingKt.b(f, BitmapDescriptorFactory.HUE_RED, f2, f2, 2);
    }

    public static final void a(LazyListState lazyListState, final Long l, final Long l2, final Function2 function2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Long l3;
        Long l4;
        Function2 function22;
        SelectableDates selectableDates2;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        ComposerImpl composerImplV = composer.v(1257365001);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(lazyListState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            l3 = l;
            i2 |= composerImplV.n(l3) ? 32 : 16;
        } else {
            l3 = l;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            l4 = l2;
            i2 |= composerImplV.n(l4) ? 256 : 128;
        } else {
            l4 = l2;
        }
        if ((i & 3072) == 0) {
            function22 = function2;
            i2 |= composerImplV.I(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerImplV.n(datePickerFormatter) : composerImplV.I(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= composerImplV.n(selectableDates2) ? 67108864 : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.n(datePickerColors) ? 536870912 : 268435456;
        }
        int i3 = i2;
        if ((i3 & 306783379) == 306783378 && composerImplV.c()) {
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
            final Long l5 = l3;
            final Long l6 = l4;
            final Function2 function23 = function22;
            final SelectableDates selectableDates3 = selectableDates2;
            TextKt.a(TypographyKt.a(DatePickerModalTokens.d, composerImplV), ComposableLambdaKt.c(1090773432, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1, reason: invalid class name */
                final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                    public static final AnonymousClass1 h = new AnonymousClass1(1);

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$1, reason: invalid class name and collision with other inner class name */
                    final class C00541 extends Lambda implements Function0<Float> {
                        public static final C00541 h = new C00541(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    /* renamed from: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$1$2, reason: invalid class name */
                    final class AnonymousClass2 extends Lambda implements Function0<Float> {
                        public static final AnonymousClass2 h = new AnonymousClass2(0);

                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ Object invoke() {
                            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
                        }
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        SemanticsPropertiesKt.w((SemanticsPropertyReceiver) obj, new ScrollAxisRange(C00541.h, AnonymousClass2.h, false));
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
                        Object objG2 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                        if (objG2 == composer$Companion$Empty$12) {
                            objG2 = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composer2.y()));
                            composer2.A(objG2);
                        }
                        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG2).d;
                        String strA = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_range_picker_scroll_to_previous_month);
                        String strA2 = Strings_androidKt.a(composer2, com.woolworths.R.string.m3c_date_range_picker_scroll_to_next_month);
                        final Long l7 = l5;
                        boolean zN2 = composer2.n(l7);
                        final Long l8 = l6;
                        boolean zN3 = zN2 | composer2.n(l8);
                        final Function2 function24 = function23;
                        boolean zN4 = zN3 | composer2.n(function24);
                        Object objG3 = composer2.G();
                        if (zN4 || objG3 == composer$Companion$Empty$12) {
                            objG3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    long jLongValue = ((Number) obj3).longValue();
                                    PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f1435a;
                                    Long l9 = l7;
                                    Long l10 = l8;
                                    Function2 function25 = function24;
                                    if (!(l9 == null && l10 == null) && ((l9 == null || l10 == null) && l9 != null && jLongValue >= l9.longValue())) {
                                        function25.invoke(l9, Long.valueOf(jLongValue));
                                    } else {
                                        function25.invoke(Long.valueOf(jLongValue), null);
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG3);
                        }
                        final Function1 function12 = (Function1) objG3;
                        PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f1435a;
                        final LazyListState lazyListState3 = lazyListState2;
                        final List listR = CollectionsKt.R(new CustomAccessibilityAction(strA, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", l = {1046}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
                            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public int p;
                                public final /* synthetic */ LazyListState q;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                                    super(2, continuation);
                                    this.q = lazyListState;
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
                                        LazyListState lazyListState = this.q;
                                        int iH = lazyListState.h() - 1;
                                        this.p = 1;
                                        if (lazyListState.l(iH, 0, this) == coroutineSingletons) {
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
                                boolean z;
                                LazyListState lazyListState4 = lazyListState3;
                                if (lazyListState4.d()) {
                                    BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(lazyListState4, null), 3);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        }), new CustomAccessibilityAction(strA2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

                            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", l = {1054}, m = "invokeSuspend")
                            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
                            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                public int p;
                                public final /* synthetic */ LazyListState q;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public AnonymousClass1(LazyListState lazyListState, Continuation continuation) {
                                    super(2, continuation);
                                    this.q = lazyListState;
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
                                        LazyListState lazyListState = this.q;
                                        int iH = lazyListState.h() + 1;
                                        this.p = 1;
                                        if (lazyListState.l(iH, 0, this) == coroutineSingletons) {
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
                                boolean z;
                                LazyListState lazyListState4 = lazyListState3;
                                if (lazyListState4.b()) {
                                    BuildersKt.c(coroutineScope, null, null, new AnonymousClass1(lazyListState4, null), 3);
                                    z = true;
                                } else {
                                    z = false;
                                }
                                return Boolean.valueOf(z);
                            }
                        }));
                        Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, AnonymousClass1.h);
                        boolean zI = composer2.I(intRange) | composer2.I(calendarModel) | composer2.n(calendarMonth) | composer2.I(datePickerFormatter) | composer2.I(listR) | composer2.n(datePickerColors) | composer2.n(l7) | composer2.n(l8) | composer2.n(function12) | composer2.n(calendarDateH) | composer2.n(selectableDates3);
                        Object objG4 = composer2.G();
                        if (zI || objG4 == composer$Companion$Empty$12) {
                            final IntRange intRange2 = intRange;
                            final CalendarModel calendarModel2 = calendarModel;
                            final CalendarMonth calendarMonth2 = calendarMonth;
                            final Long l9 = l5;
                            final Long l10 = l6;
                            final CalendarDate calendarDate = calendarDateH;
                            final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                            final SelectableDates selectableDates4 = selectableDates3;
                            final DatePickerColors datePickerColors2 = datePickerColors;
                            Function1<LazyListScope, Unit> function13 = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    float f = DatePickerKt.f1433a;
                                    IntRange intRange3 = intRange2;
                                    int i4 = ((intRange3.e - intRange3.d) + 1) * 12;
                                    final DatePickerColors datePickerColors3 = datePickerColors2;
                                    final List list = listR;
                                    final CalendarModel calendarModel3 = calendarModel2;
                                    final CalendarMonth calendarMonth3 = calendarMonth2;
                                    final Long l11 = l9;
                                    final Long l12 = l10;
                                    final Function1 function14 = function12;
                                    final CalendarDate calendarDate2 = calendarDate;
                                    final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                    final SelectableDates selectableDates5 = selectableDates4;
                                    LazyListScope.g((LazyListScope) obj3, i4, null, new ComposableLambdaImpl(new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(4);
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            int i5;
                                            DatePickerColors datePickerColors4;
                                            SelectedRangeInfo selectedRangeInfo;
                                            Object obj8;
                                            Object selectedRangeInfo2;
                                            Object obj9;
                                            LazyItemScope lazyItemScope = (LazyItemScope) obj4;
                                            int iIntValue = ((Number) obj5).intValue();
                                            Composer composer3 = (Composer) obj6;
                                            int iIntValue2 = ((Number) obj7).intValue();
                                            if ((iIntValue2 & 6) == 0) {
                                                i5 = (composer3.n(lazyItemScope) ? 4 : 2) | iIntValue2;
                                            } else {
                                                i5 = iIntValue2;
                                            }
                                            if ((iIntValue2 & 48) == 0) {
                                                i5 |= composer3.r(iIntValue) ? 32 : 16;
                                            }
                                            if ((i5 & 147) == 146 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                CalendarMonth calendarMonth4 = calendarMonth3;
                                                CalendarModel calendarModel4 = calendarModel3;
                                                final CalendarMonth calendarMonthK = calendarModel4.k(calendarMonth4, iIntValue);
                                                Modifier modifierD = lazyItemScope.d(Modifier.Companion.d, 1.0f);
                                                ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer3, 0);
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
                                                Updater.b(composer3, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                                                Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                                Function2 function25 = ComposeUiNode.Companion.j;
                                                if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                    androidx.camera.core.impl.b.z(p, composer3, p, function25);
                                                }
                                                Updater.b(composer3, modifierD2, ComposeUiNode.Companion.d);
                                                TextStyle textStyleA = TypographyKt.a(DatePickerModalTokens.i, composer3);
                                                final DatePickerFormatter datePickerFormatter4 = datePickerFormatter3;
                                                final List list2 = list;
                                                final DatePickerColors datePickerColors5 = datePickerColors3;
                                                TextKt.a(textStyleA, ComposableLambdaKt.c(1622100276, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final Object invoke(Object obj10, Object obj11) {
                                                        Composer composer4 = (Composer) obj10;
                                                        if ((((Number) obj11).intValue() & 3) == 2 && composer4.c()) {
                                                            composer4.j();
                                                        } else {
                                                            String strA3 = datePickerFormatter4.a(Long.valueOf(calendarMonthK.e), CalendarLocale_androidKt.a(composer4));
                                                            if (strA3 == null) {
                                                                strA3 = "-";
                                                            }
                                                            Modifier modifierE = PaddingKt.e(Modifier.Companion.d, DateRangePickerKt.f1435a);
                                                            final List list3 = list2;
                                                            boolean zI2 = composer4.I(list3);
                                                            Object objG5 = composer4.G();
                                                            if (zI2 || objG5 == Composer.Companion.f1624a) {
                                                                objG5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1$1$1$1$1$1
                                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                    {
                                                                        super(1);
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function1
                                                                    public final Object invoke(Object obj12) {
                                                                        SemanticsPropertiesKt.l((SemanticsPropertyReceiver) obj12, list3);
                                                                        return Unit.f24250a;
                                                                    }
                                                                };
                                                                composer4.A(objG5);
                                                            }
                                                            Modifier modifierB2 = SemanticsModifierKt.b(modifierE, false, (Function1) objG5);
                                                            datePickerColors5.getClass();
                                                            TextKt.b(strA3, modifierB2, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 131064);
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                }, composer3), composer3, 48);
                                                composer3.o(2125334733);
                                                Long l13 = l11;
                                                Long l14 = l12;
                                                if (l13 == null || l14 == null) {
                                                    datePickerColors4 = datePickerColors5;
                                                    selectedRangeInfo = null;
                                                } else {
                                                    boolean zN5 = composer3.n(l13) | composer3.n(l14);
                                                    Object objG5 = composer3.G();
                                                    if (zN5 || objG5 == Composer.Companion.f1624a) {
                                                        CalendarDate calendarDateB = calendarModel4.b(l13.longValue());
                                                        CalendarDate calendarDateB2 = calendarModel4.b(l14.longValue());
                                                        long j = calendarDateB.g;
                                                        long j2 = calendarMonthK.f;
                                                        int i6 = calendarMonthK.d;
                                                        if (j <= j2) {
                                                            datePickerColors4 = datePickerColors5;
                                                            obj8 = null;
                                                            long j3 = calendarDateB2.g;
                                                            long j4 = calendarMonthK.e;
                                                            if (j3 >= j4) {
                                                                boolean z = j >= j4;
                                                                boolean z2 = j3 <= j2;
                                                                int i7 = z ? (calendarDateB.f + i6) - 1 : i6;
                                                                int i8 = (i6 + (z2 ? calendarDateB2.f : calendarMonthK.c)) - 1;
                                                                selectedRangeInfo2 = new SelectedRangeInfo(IntOffsetKt.a(i7 % 7, i7 / 7), IntOffsetKt.a(i8 % 7, i8 / 7), z, z2);
                                                            }
                                                            composer3.A(selectedRangeInfo2);
                                                            obj9 = selectedRangeInfo2;
                                                        } else {
                                                            datePickerColors4 = datePickerColors5;
                                                            obj8 = null;
                                                        }
                                                        selectedRangeInfo2 = obj8;
                                                        composer3.A(selectedRangeInfo2);
                                                        obj9 = selectedRangeInfo2;
                                                    } else {
                                                        datePickerColors4 = datePickerColors5;
                                                        obj9 = objG5;
                                                    }
                                                    selectedRangeInfo = (SelectedRangeInfo) obj9;
                                                }
                                                composer3.l();
                                                DatePickerKt.d(calendarMonthK, function14, calendarDate2.g, l13, l14, selectedRangeInfo, datePickerFormatter4, selectableDates5, datePickerColors4, composer3, 0);
                                                composer3.f();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, true, -1413501381), 6);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(function13);
                            objG4 = function13;
                        }
                        LazyDslKt.a(modifierB, lazyListState2, null, null, null, null, false, (Function1) objG4, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 48);
            boolean zI = ((i3 & 14) == 4) | ((i3 & 57344) == 16384) | composerImplV.I(calendarModel) | composerImplV.I(intRange);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, function1, calendarModel, intRange, null);
                composerImplV.A(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = objG2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.e(composerImplV, lazyListState2, (Function2) dateRangePickerKt$VerticalMonthsList$2$1);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DateRangePickerKt.a(lazyListState2, l, l2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Long l, final Long l2, final long j, final Function2 function2, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        int i2;
        Function2 function22;
        Function1 function12;
        SelectableDates selectableDates2;
        ComposerImpl composerImplV = composer.v(-787063721);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(l) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(l2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.s(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function22 = function2;
            i2 |= composerImplV.I(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if ((i & 24576) == 0) {
            function12 = function1;
            i2 |= composerImplV.I(function12) ? 16384 : 8192;
        } else {
            function12 = function1;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(calendarModel) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= (16777216 & i) == 0 ? composerImplV.n(datePickerFormatter) : composerImplV.I(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            selectableDates2 = selectableDates;
            i2 |= composerImplV.n(selectableDates2) ? 67108864 : 33554432;
        } else {
            selectableDates2 = selectableDates;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.n(datePickerColors) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
        } else {
            CalendarMonth calendarMonthF = calendarModel.f(j);
            int i3 = (((calendarMonthF.f1552a - intRange.d) * 12) + calendarMonthF.b) - 1;
            if (i3 < 0) {
                i3 = 0;
            }
            LazyListState lazyListStateA = LazyListStateKt.a(i3, 0, 2, composerImplV);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zN = composerImplV.n(lazyListStateA) | composerImplV.r(i3);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new DateRangePickerKt$DateRangePickerContent$1$1(i3, lazyListStateA, null);
                composerImplV.A(objG);
            }
            EffectsKt.e(composerImplV, numValueOf, (Function2) objG);
            Modifier modifierH = PaddingKt.h(Modifier.Companion.d, DatePickerKt.c, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
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
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            DatePickerKt.f(datePickerColors, calendarModel, composerImplV, ((i2 >> 27) & 14) | ((i2 >> 12) & 112));
            a(lazyListStateA, l, l2, function22, function12, calendarModel, intRange, datePickerFormatter, selectableDates2, datePickerColors, composerImplV, ((i2 << 3) & 1008) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2) | (234881024 & i2) | (i2 & 1879048192));
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$DateRangePickerContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    DateRangePickerKt.b(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
