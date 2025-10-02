package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DateRangeInputKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1434a = 8;

    public static final void a(final Long l, final Long l2, Function2 function2, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        DateInputFormat dateInputFormat;
        final Function2 function22 = function2;
        ComposerImpl composerImplV = composer.v(-607499086);
        int i2 = i | (composerImplV.n(l) ? 4 : 2) | (composerImplV.n(l2) ? 32 : 16) | (composerImplV.I(function22) ? 256 : 128) | (composerImplV.I(calendarModel) ? 2048 : 1024) | (composerImplV.I(intRange) ? 16384 : 8192) | (composerImplV.n(datePickerFormatter) ? 131072 : 65536) | (composerImplV.n(selectableDates) ? 1048576 : 524288) | (composerImplV.n(datePickerColors) ? 8388608 : 4194304);
        if ((4793491 & i2) == 4793490 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Locale localeA = CalendarLocale_androidKt.a(composerImplV);
            boolean zN = composerImplV.n(localeA);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = calendarModel.c(localeA);
                composerImplV.A(objG);
            }
            DateInputFormat dateInputFormat2 = (DateInputFormat) objG;
            String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_for_pattern);
            String strA2 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_year_range);
            String strA3 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_not_allowed);
            String strA4 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_range_input_invalid_range_input);
            boolean zN2 = ((i2 & 458752) == 131072) | composerImplV.n(dateInputFormat2);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new DateInputValidator(intRange, selectableDates, dateInputFormat2, datePickerFormatter, strA, strA2, strA3, strA4);
                dateInputFormat = dateInputFormat2;
                composerImplV.A(objG2);
            } else {
                dateInputFormat = dateInputFormat2;
            }
            DateInputValidator dateInputValidator = (DateInputValidator) objG2;
            dateInputValidator.h = l;
            dateInputValidator.i = l2;
            PaddingValuesImpl paddingValuesImpl = DateInputKt.f1428a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = PaddingKt.e(companion, paddingValuesImpl);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.g(f1434a), Alignment.Companion.j, composerImplV, 6);
            int i3 = composerImplV.P;
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
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            final String upperCase = dateInputFormat.f1553a.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strA5 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_range_picker_start_headline);
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            Modifier modifierA = rowScopeInstance.a(companion, 0.5f, true);
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            int i5 = i2 & 112;
            boolean z2 = z | (i5 == 32);
            Object objG3 = composerImplV.G();
            if (z2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function22.invoke((Long) obj, l2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            int i6 = i2 & 7168;
            int i7 = (i2 >> 21) & 14;
            DateInputKt.b(modifierA, l, (Function1) objG3, calendarModel, ComposableLambdaKt.c(801434508, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2
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
                        String str = strA5;
                        boolean zN3 = composer2.n(str);
                        final String str2 = upperCase;
                        boolean zN4 = zN3 | composer2.n(str2);
                        Object objG4 = composer2.G();
                        if (zN4 || objG4 == Composer.Companion.f1624a) {
                            final String str3 = strA5;
                            objG4 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj3, str3 + ", " + str2);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG4);
                        }
                        TextKt.b(str, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG4), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(665407211, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$3$1, reason: invalid class name */
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
                        TextKt.b(upperCase, SemanticsModifierKt.a(Modifier.Companion.d, AnonymousClass1.h), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 1, dateInputValidator, dateInputFormat, localeA, datePickerColors, composerImplV, ((i2 << 3) & 112) | 1794048 | i6, i7);
            final String strA6 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_range_picker_end_headline);
            Modifier modifierA2 = rowScopeInstance.a(companion, 0.5f, true);
            boolean z3 = (i4 == 256) | ((i2 & 14) == 4);
            Object objG4 = composerImplV.G();
            if (z3 || objG4 == composer$Companion$Empty$1) {
                function22 = function2;
                objG4 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        function22.invoke(l, (Long) obj);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            } else {
                function22 = function2;
            }
            DateInputKt.b(modifierA2, l2, (Function1) objG4, calendarModel, ComposableLambdaKt.c(911487285, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5
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
                        String str = strA6;
                        boolean zN3 = composer2.n(str);
                        final String str2 = upperCase;
                        boolean zN4 = zN3 | composer2.n(str2);
                        Object objG5 = composer2.G();
                        if (zN4 || objG5 == Composer.Companion.f1624a) {
                            final String str3 = strA6;
                            objG5 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$5$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    SemanticsPropertiesKt.k((SemanticsPropertyReceiver) obj3, str3 + ", " + str2);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG5);
                        }
                        TextKt.b(str, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG5), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-961726252, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$2$6$1, reason: invalid class name */
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
                        TextKt.b(upperCase, SemanticsModifierKt.a(Modifier.Companion.d, AnonymousClass1.h), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), 2, dateInputValidator, dateInputFormat, localeA, datePickerColors, composerImplV, i5 | 1794048 | i6, i7);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function2 function24 = function22;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(l, l2, function24, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i) { // from class: androidx.compose.material3.DateRangeInputKt$DateRangeInputContent$3
                public final /* synthetic */ Long h;
                public final /* synthetic */ Long i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ CalendarModel k;
                public final /* synthetic */ IntRange l;
                public final /* synthetic */ DatePickerFormatter m;
                public final /* synthetic */ SelectableDates n;
                public final /* synthetic */ DatePickerColors o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    DateRangeInputKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
