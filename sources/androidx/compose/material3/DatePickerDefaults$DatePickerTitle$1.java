package androidx.compose.material3;

import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerDefaults$DatePickerTitle$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ DatePickerDefaults h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Modifier j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerTitle$1(DatePickerDefaults datePickerDefaults, int i, Modifier modifier, int i2) {
        super(2);
        this.h = datePickerDefaults;
        this.i = i;
        this.j = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposerImpl composerImpl;
        Modifier modifier;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(433);
        ComposerImpl composerImplV = ((Composer) obj).v(327413563);
        int i = this.i;
        int i2 = ((composerImplV.r(i) ? 4 : 2) | iA) & 19;
        Modifier modifier2 = this.j;
        if (i2 == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            modifier = modifier2;
        } else if (i == 0) {
            composerImplV.o(406439148);
            modifier = modifier2;
            TextKt.b(Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_picker_title), modifier, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImplV, 48, 0, 131068);
            composerImpl = composerImplV;
            composerImpl.V(false);
        } else {
            composerImpl = composerImplV;
            modifier = modifier2;
            if (i == 1) {
                composerImpl.o(406443211);
                TextKt.b(Strings_androidKt.a(composerImpl, com.woolworths.R.string.m3c_date_input_title), modifier, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerImpl, 48, 0, 131068);
                composerImpl = composerImpl;
                composerImpl.V(false);
            } else {
                composerImpl.o(-285079389);
                composerImpl.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DatePickerDefaults$DatePickerTitle$1(this.h, i, modifier, iA);
        }
        return Unit.f24250a;
    }
}
