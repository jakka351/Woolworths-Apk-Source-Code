package androidx.compose.material3;

import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DatePickerDefaults$DatePickerHeadline$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ DatePickerDefaults h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ int j;
    public final /* synthetic */ DatePickerFormatter k;
    public final /* synthetic */ Modifier l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatePickerDefaults$DatePickerHeadline$2(DatePickerDefaults datePickerDefaults, Long l, int i, DatePickerFormatter datePickerFormatter, Modifier modifier, int i2) {
        super(2);
        this.h = datePickerDefaults;
        this.i = l;
        this.j = i;
        this.k = datePickerFormatter;
        this.l = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ComposerImpl composerImpl;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(27649);
        ComposerImpl composerImplV = ((Composer) obj).v(1502835813);
        Long l = this.i;
        int i = (composerImplV.n(l) ? 4 : 2) | iA;
        int i2 = this.j;
        int i3 = i | (composerImplV.r(i2) ? 32 : 16);
        DatePickerFormatter datePickerFormatter = this.k;
        int i4 = (i3 | (composerImplV.n(datePickerFormatter) ? 256 : 128)) & 1171;
        Modifier modifier = this.l;
        if (i4 == 1170 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            Locale localeA = CalendarLocale_androidKt.a(composerImplV);
            String strB = datePickerFormatter.b(l, localeA, false);
            String strB2 = datePickerFormatter.b(l, localeA, true);
            composerImplV.o(1148835145);
            String strA = "";
            if (strB2 == null) {
                if (i2 == 0) {
                    composerImplV.o(1148842944);
                    strB2 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_picker_no_selection_description);
                    composerImplV.V(false);
                } else if (i2 == 1) {
                    composerImplV.o(1148845915);
                    strB2 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_no_input_description);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1254558033);
                    composerImplV.V(false);
                    strB2 = "";
                }
            }
            composerImplV.V(false);
            composerImplV.o(1148850481);
            if (strB == null) {
                if (i2 == 0) {
                    composerImplV.o(1148853330);
                    strB = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_picker_headline);
                    composerImplV.V(false);
                } else if (i2 == 1) {
                    composerImplV.o(1148855857);
                    strB = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_headline);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1254856625);
                    composerImplV.V(false);
                    strB = "";
                }
            }
            composerImplV.V(false);
            if (i2 == 0) {
                composerImplV.o(1148862013);
                strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_picker_headline_description);
                composerImplV.V(false);
            } else if (i2 == 1) {
                composerImplV.o(1148864764);
                strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_headline_description);
                composerImplV.V(false);
            } else {
                composerImplV.o(1255139345);
                composerImplV.V(false);
            }
            final String str = String.format(strA, Arrays.copyOf(new Object[]{strB2}, 1));
            boolean zN = composerImplV.n(str);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DatePickerDefaults$DatePickerHeadline$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj3;
                        SemanticsPropertiesKt.n(semanticsPropertyReceiver, 0);
                        SemanticsPropertiesKt.k(semanticsPropertyReceiver, str);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            composerImpl = composerImplV;
            TextKt.b(strB, SemanticsModifierKt.b(modifier, false, (Function1) objG), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, composerImpl, 0, 3072, 122876);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DatePickerDefaults$DatePickerHeadline$2(this.h, l, i2, datePickerFormatter, modifier, iA);
        }
        return Unit.f24250a;
    }
}
