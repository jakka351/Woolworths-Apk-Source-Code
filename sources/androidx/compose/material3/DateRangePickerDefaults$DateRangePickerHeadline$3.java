package androidx.compose.material3;

import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DateRangePickerDefaults$DateRangePickerHeadline$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ DateRangePickerDefaults h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Long j;
    public final /* synthetic */ int k;
    public final /* synthetic */ DatePickerFormatter l;
    public final /* synthetic */ Modifier m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangePickerDefaults$DateRangePickerHeadline$3(DateRangePickerDefaults dateRangePickerDefaults, Long l, Long l2, int i, DatePickerFormatter datePickerFormatter, Modifier modifier, int i2) {
        super(2);
        this.h = dateRangePickerDefaults;
        this.i = l;
        this.j = l2;
        this.k = i;
        this.l = datePickerFormatter;
        this.m = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposerImpl composerImpl;
        Modifier modifier;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(221185);
        ComposerImpl composerImplV = ((Composer) obj).v(-1611069472);
        Long l = this.i;
        int i = (composerImplV.n(l) ? 4 : 2) | iA;
        Long l2 = this.j;
        int i2 = i | (composerImplV.n(l2) ? 32 : 16);
        int i3 = this.k;
        int i4 = i2 | (composerImplV.r(i3) ? 256 : 128);
        DatePickerFormatter datePickerFormatter = this.l;
        int i5 = i4 | (composerImplV.n(datePickerFormatter) ? 2048 : 1024);
        int i6 = 74899 & i5;
        DateRangePickerDefaults dateRangePickerDefaults = this.h;
        Modifier modifier2 = this.m;
        if (i6 == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier = modifier2;
        } else {
            final String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_range_picker_start_headline);
            final String strA2 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_range_picker_end_headline);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(482821121, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        TextKt.b(strA, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            ComposableLambdaImpl composableLambdaImplC2 = ComposableLambdaKt.c(-1522669758, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerDefaults$DateRangePickerHeadline$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        TextKt.b(strA2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$DateRangePickerKt.f1418a;
            composerImpl = composerImplV;
            modifier = modifier2;
            dateRangePickerDefaults.a(l, l2, i3, datePickerFormatter, modifier, strA, strA2, composableLambdaImplC, composableLambdaImplC2, composerImpl, (i5 & 7168) | 918552576 | (i5 & 14) | (i5 & 112) | (i5 & 896) | 24576, 6);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DateRangePickerDefaults$DateRangePickerHeadline$3(dateRangePickerDefaults, l, l2, i3, datePickerFormatter, modifier, iA);
        }
        return Unit.f24250a;
    }
}
