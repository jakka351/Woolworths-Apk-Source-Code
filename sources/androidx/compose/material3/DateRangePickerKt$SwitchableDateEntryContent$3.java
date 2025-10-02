package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateRangePickerKt$SwitchableDateEntryContent$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Long h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ CalendarModel n;
    public final /* synthetic */ IntRange o;
    public final /* synthetic */ DatePickerFormatter p;
    public final /* synthetic */ SelectableDates q;
    public final /* synthetic */ DatePickerColors r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerKt$SwitchableDateEntryContent$3(Long l, Long l2, long j, int i, Function2 function2, Function1 function1, CalendarModel calendarModel, IntRange intRange, DatePickerFormatter datePickerFormatter, SelectableDates selectableDates, DatePickerColors datePickerColors, int i2, int i3) {
        super(2);
        this.h = l;
        this.i = l2;
        this.j = j;
        this.k = i;
        this.l = function2;
        this.m = function1;
        this.n = calendarModel;
        this.o = intRange;
        this.p = datePickerFormatter;
        this.q = selectableDates;
        this.r = datePickerColors;
        this.s = i2;
        this.t = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        final Long l;
        final Long l2;
        final Function2 function2;
        final long j;
        final Function1 function1;
        final CalendarModel calendarModel;
        final IntRange intRange;
        DatePickerFormatter datePickerFormatter;
        SelectableDates selectableDates;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.s | 1);
        int iA2 = RecomposeScopeImplKt.a(this.t);
        PaddingValuesImpl paddingValuesImpl = DateRangePickerKt.f1435a;
        ComposerImpl composerImplV = ((Composer) obj).v(-532789335);
        int i4 = iA & 6;
        Long l3 = this.h;
        if (i4 == 0) {
            i = (composerImplV.n(l3) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i5 = iA & 48;
        Long l4 = this.i;
        if (i5 == 0) {
            i |= composerImplV.n(l4) ? 32 : 16;
        }
        int i6 = iA & KyberEngine.KyberPolyBytes;
        long j2 = this.j;
        if (i6 == 0) {
            i |= composerImplV.s(j2) ? 256 : 128;
        }
        int i7 = iA & 3072;
        int i8 = this.k;
        if (i7 == 0) {
            i |= composerImplV.r(i8) ? 2048 : 1024;
        }
        int i9 = iA & 24576;
        Function2 function22 = this.l;
        if (i9 == 0) {
            i |= composerImplV.I(function22) ? 16384 : 8192;
        }
        int i10 = 196608 & iA;
        Function1 function12 = this.m;
        if (i10 == 0) {
            i |= composerImplV.I(function12) ? 131072 : 65536;
        }
        int i11 = 1572864 & iA;
        CalendarModel calendarModel2 = this.n;
        if (i11 == 0) {
            i |= composerImplV.I(calendarModel2) ? 1048576 : 524288;
        }
        int i12 = 12582912 & iA;
        IntRange intRange2 = this.o;
        if (i12 == 0) {
            i |= composerImplV.I(intRange2) ? 8388608 : 4194304;
        }
        int i13 = 100663296 & iA;
        final DatePickerFormatter datePickerFormatter2 = this.p;
        if (i13 == 0) {
            i |= (134217728 & iA) == 0 ? composerImplV.n(datePickerFormatter2) : composerImplV.I(datePickerFormatter2) ? 67108864 : 33554432;
        }
        int i14 = 805306368 & iA;
        final SelectableDates selectableDates2 = this.q;
        if (i14 == 0) {
            i |= composerImplV.n(selectableDates2) ? 536870912 : 268435456;
        }
        int i15 = iA2 & 6;
        int i16 = i;
        final DatePickerColors datePickerColors = this.r;
        if (i15 == 0) {
            i2 = iA2 | (composerImplV.n(datePickerColors) ? 4 : 2);
        } else {
            i2 = iA2;
        }
        if ((i16 & 306783379) == 306783378 && (i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            i3 = iA;
            l = l3;
            l2 = l4;
            function2 = function22;
            j = j2;
            function1 = function12;
            calendarModel = calendarModel2;
            intRange = intRange2;
            datePickerFormatter = datePickerFormatter2;
            selectableDates = selectableDates2;
        } else {
            i3 = iA;
            l = l3;
            l2 = l4;
            function2 = function22;
            j = j2;
            function1 = function12;
            calendarModel = calendarModel2;
            intRange = intRange2;
            datePickerFormatter = datePickerFormatter2;
            selectableDates = selectableDates2;
            CrossfadeKt.b(new DisplayMode(i8), SemanticsModifierKt.b(Modifier.Companion.d, false, DateRangePickerKt$SwitchableDateEntryContent$1.h), AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7), null, ComposableLambdaKt.c(-1026642619, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    int i17 = ((DisplayMode) obj3).f1438a;
                    Composer composer = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer.r(i17) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer.c()) {
                        composer.j();
                    } else if (i17 == 0) {
                        composer.o(-1871299185);
                        DateRangePickerKt.b(l, l2, j, function2, function1, calendarModel, intRange, datePickerFormatter2, selectableDates2, datePickerColors, composer, 0);
                        composer.l();
                    } else if (i17 == 1) {
                        composer.o(-1871277944);
                        DateRangeInputKt.a(l, l2, function2, calendarModel, intRange, datePickerFormatter2, selectableDates2, datePickerColors, composer, 0);
                        composer.l();
                    } else {
                        composer.o(2120399965);
                        composer.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i16 >> 9) & 14) | 24960, 8);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DateRangePickerKt$SwitchableDateEntryContent$3(l, l2, j, i8, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i3, iA2);
        }
        return Unit.f24250a;
    }
}
