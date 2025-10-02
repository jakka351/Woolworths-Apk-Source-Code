package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.input.TextFieldValue;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", TextBundle.TEXT_ENTRY, "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class DateInputKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PaddingValuesImpl f1428a;
    public static final float b = 16;

    static {
        float f = 24;
        f1428a = PaddingKt.b(f, 10, f, BitmapDescriptorFactory.HUE_RED, 8);
    }

    public static final void a(final Long l, final Function1 function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(643325609);
        int i2 = i | (composerImplV.n(l) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.I(calendarModel) ? 256 : 128) | (composerImplV.I(intRange) ? 2048 : 1024) | (composerImplV.n(datePickerFormatter) ? 16384 : 8192) | (composerImplV.n(selectableDates) ? 131072 : 65536) | (composerImplV.n(datePickerColors) ? 1048576 : 524288);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
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
            DateInputFormat dateInputFormat = (DateInputFormat) objG;
            String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_for_pattern);
            String strA2 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_year_range);
            String strA3 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_invalid_not_allowed);
            boolean zN2 = composerImplV.n(dateInputFormat) | ((57344 & i2) == 16384);
            Object objG2 = composerImplV.G();
            if (zN2 || objG2 == composer$Companion$Empty$1) {
                DateInputValidator dateInputValidator = new DateInputValidator(intRange, selectableDates, dateInputFormat, datePickerFormatter, strA, strA2, strA3, "");
                composerImplV.A(dateInputValidator);
                objG2 = dateInputValidator;
            }
            DateInputValidator dateInputValidator2 = (DateInputValidator) objG2;
            final String upperCase = dateInputFormat.f1553a.toUpperCase(Locale.ROOT);
            Intrinsics.g(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            final String strA4 = Strings_androidKt.a(composerImplV, com.woolworths.R.string.m3c_date_input_label);
            Modifier modifierE = PaddingKt.e(SizeKt.e(Modifier.Companion.d, 1.0f), f1428a);
            dateInputValidator2.h = l;
            int i3 = i2 << 3;
            b(modifierE, l, function1, calendarModel, ComposableLambdaKt.c(-1819015125, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2
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
                        String str = strA4;
                        boolean zN3 = composer2.n(str);
                        final String str2 = upperCase;
                        boolean zN4 = zN3 | composer2.n(str2);
                        Object objG3 = composer2.G();
                        if (zN4 || objG3 == Composer.Companion.f1624a) {
                            final String str3 = strA4;
                            objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$2$1$1
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
                            composer2.A(objG3);
                        }
                        TextKt.b(str, SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG3), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131068);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), ComposableLambdaKt.c(-564233108, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputContent$3

                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
                /* renamed from: androidx.compose.material3.DateInputKt$DateInputContent$3$1, reason: invalid class name */
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
            }, composerImplV), 0, dateInputValidator2, dateInputFormat, localeA, datePickerColors, composerImplV, (i3 & 7168) | (i3 & 112) | 1794054 | (i3 & 896), (i2 >> 18) & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(l, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, i) { // from class: androidx.compose.material3.DateInputKt$DateInputContent$4
                public final /* synthetic */ Long h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ CalendarModel j;
                public final /* synthetic */ IntRange k;
                public final /* synthetic */ DatePickerFormatter l;
                public final /* synthetic */ SelectableDates m;
                public final /* synthetic */ DatePickerColors n;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    DateInputKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v14 */
    public static final void b(final Modifier modifier, final Long l, final Function1 function1, final CalendarModel calendarModel, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final int i, final DateInputValidator dateInputValidator, final DateInputFormat dateInputFormat, final Locale locale, final DatePickerColors datePickerColors, Composer composer, final int i2, final int i3) {
        int i4;
        Function1 function12;
        int i5;
        Object obj;
        int i6;
        final MutableState mutableState;
        ?? r15;
        final DateInputFormat dateInputFormat2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-857008589);
        if ((i2 & 6) == 0) {
            i4 = (composerImplV.n(modifier) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= composerImplV.n(l) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            function12 = function1;
            i4 |= composerImplV.I(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        if ((i2 & 3072) == 0) {
            i4 |= composerImplV.I(calendarModel) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= composerImplV.I(composableLambdaImpl2) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= composerImplV.r(i) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= composerImplV.n(dateInputValidator) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i4 |= composerImplV.n(dateInputFormat) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= composerImplV.I(locale) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i5 = i3 | (composerImplV.n(datePickerColors) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            dateInputFormat2 = dateInputFormat;
        } else {
            MutableState mutableState2 = (MutableState) RememberSaveableKt.c(new Object[0], null, DateInputKt$DateInputTextField$errorText$1.h, composerImplV, 3072, 6);
            Object[] objArr = new Object[0];
            SaverKt$Saver$1 saverKt$Saver$1 = TextFieldValue.d;
            int i7 = 234881024 & i4;
            boolean zI = ((i4 & 112) == 32) | composerImplV.I(calendarModel) | (i7 == 67108864) | composerImplV.I(locale);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new Function0<MutableState<TextFieldValue>>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
                    @Override // kotlin.jvm.functions.Function0
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke() {
                        /*
                            r5 = this;
                            java.lang.Long r0 = r1
                            if (r0 == 0) goto L16
                            long r0 = r0.longValue()
                            androidx.compose.material3.internal.DateInputFormat r2 = r3
                            java.lang.String r2 = r2.c
                            androidx.compose.material3.internal.CalendarModel r3 = r2
                            java.util.Locale r4 = r4
                            java.lang.String r0 = r3.a(r0, r2, r4)
                            if (r0 != 0) goto L18
                        L16:
                            java.lang.String r0 = ""
                        L18:
                            r1 = 0
                            long r1 = androidx.compose.ui.text.TextRangeKt.a(r1, r1)
                            androidx.compose.ui.text.input.TextFieldValue r3 = new androidx.compose.ui.text.input.TextFieldValue
                            r4 = 4
                            r3.<init>(r0, r1, r4)
                            androidx.compose.runtime.MutableState r0 = androidx.compose.runtime.SnapshotStateKt.f(r3)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt$DateInputTextField$text$2$1.invoke():java.lang.Object");
                    }
                };
                composerImplV.A(objG);
            }
            final MutableState mutableStateB = RememberSaveableKt.b(objArr, saverKt$Saver$1, (Function0) objG, composerImplV);
            TextFieldValue textFieldValue = (TextFieldValue) mutableStateB.getD();
            boolean zN = ((i4 & 896) == 256) | (i7 == 67108864) | composerImplV.n(mutableStateB) | composerImplV.n(mutableState2) | composerImplV.I(calendarModel) | ((29360128 & i4) == 8388608) | ((3670016 & i4) == 1048576) | composerImplV.I(locale);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                i6 = i4;
                final Function1 function13 = function12;
                mutableState = mutableState2;
                r15 = 0;
                dateInputFormat2 = dateInputFormat;
                obj = new Function1<TextFieldValue, Unit>(mutableState, function13, calendarModel, dateInputValidator, i, locale, mutableStateB) { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$1$1
                    public final /* synthetic */ MutableState i;
                    public final /* synthetic */ Function1 j;
                    public final /* synthetic */ CalendarModel k;
                    public final /* synthetic */ DateInputValidator l;
                    public final /* synthetic */ int m;
                    public final /* synthetic */ MutableState n;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.n = mutableStateB;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
                    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
                    @Override // kotlin.jvm.functions.Function1
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r12) {
                        /*
                            r11 = this;
                            androidx.compose.ui.text.input.TextFieldValue r12 = (androidx.compose.ui.text.input.TextFieldValue) r12
                            androidx.compose.ui.text.AnnotatedString r0 = r12.f2127a
                            java.lang.String r1 = r0.e
                            java.lang.String r0 = r0.e
                            int r1 = r1.length()
                            androidx.compose.material3.internal.DateInputFormat r2 = r11.h
                            java.lang.String r2 = r2.c
                            int r3 = r2.length()
                            if (r1 > r3) goto Lf5
                            r1 = 0
                        L17:
                            int r3 = r0.length()
                            if (r1 >= r3) goto L2c
                            char r3 = r0.charAt(r1)
                            boolean r3 = java.lang.Character.isDigit(r3)
                            if (r3 != 0) goto L29
                            goto Lf5
                        L29:
                            int r1 = r1 + 1
                            goto L17
                        L2c:
                            androidx.compose.foundation.layout.PaddingValuesImpl r1 = androidx.compose.material3.DateInputKt.f1428a
                            androidx.compose.runtime.MutableState r1 = r11.n
                            r1.setValue(r12)
                            java.lang.CharSequence r12 = kotlin.text.StringsKt.k0(r0)
                            java.lang.String r12 = r12.toString()
                            int r0 = r12.length()
                            kotlin.jvm.functions.Function1 r1 = r11.j
                            java.lang.String r3 = ""
                            r4 = 0
                            androidx.compose.runtime.MutableState r5 = r11.i
                            if (r0 != 0) goto L49
                            goto L53
                        L49:
                            int r0 = r12.length()
                            int r6 = r2.length()
                            if (r0 >= r6) goto L5b
                        L53:
                            r5.setValue(r3)
                            r1.invoke(r4)
                            goto Lf5
                        L5b:
                            androidx.compose.material3.internal.CalendarModel r0 = r11.k
                            androidx.compose.material3.internal.CalendarDate r12 = r0.j(r12, r2)
                            androidx.compose.material3.DateInputValidator r0 = r11.l
                            kotlin.ranges.IntRange r2 = r0.f1429a
                            r6 = 1
                            if (r12 != 0) goto L86
                            java.lang.String r2 = r0.e
                            androidx.compose.material3.internal.DateInputFormat r0 = r0.c
                            java.lang.String r0 = r0.f1553a
                            java.util.Locale r3 = java.util.Locale.ROOT
                            java.lang.String r0 = r0.toUpperCase(r3)
                            java.lang.String r3 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
                            kotlin.jvm.internal.Intrinsics.g(r0, r3)
                            java.lang.Object[] r0 = new java.lang.Object[]{r0}
                            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
                            java.lang.String r3 = java.lang.String.format(r2, r0)
                            goto Ldb
                        L86:
                            int r7 = r12.d
                            long r8 = r12.g
                            boolean r7 = r2.g(r7)
                            r10 = 2
                            if (r7 != 0) goto Lad
                            java.lang.String r0 = r0.f
                            int r3 = r2.d
                            r6 = 7
                            java.lang.String r3 = androidx.compose.material3.CalendarLocale_jvmKt.a(r3, r6)
                            int r2 = r2.e
                            java.lang.String r2 = androidx.compose.material3.CalendarLocale_jvmKt.a(r2, r6)
                            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
                            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r10)
                            java.lang.String r3 = java.lang.String.format(r0, r2)
                            goto Ldb
                        Lad:
                            androidx.compose.material3.SelectableDates r2 = r0.b
                            r2.getClass()
                            int r2 = r11.m
                            if (r2 != r6) goto Lc8
                            java.lang.Long r6 = r0.i
                            if (r6 == 0) goto Lbf
                            long r6 = r6.longValue()
                            goto Lc4
                        Lbf:
                            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                        Lc4:
                            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                            if (r6 >= 0) goto Ld9
                        Lc8:
                            if (r2 != r10) goto Ldb
                            java.lang.Long r2 = r0.h
                            if (r2 == 0) goto Ld3
                            long r6 = r2.longValue()
                            goto Ld5
                        Ld3:
                            r6 = -9223372036854775808
                        Ld5:
                            int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                            if (r2 >= 0) goto Ldb
                        Ld9:
                            java.lang.String r3 = r0.g
                        Ldb:
                            r5.setValue(r3)
                            java.lang.Object r0 = r5.getD()
                            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                            int r0 = r0.length()
                            if (r0 != 0) goto Lf2
                            if (r12 == 0) goto Lf2
                            long r2 = r12.g
                            java.lang.Long r4 = java.lang.Long.valueOf(r2)
                        Lf2:
                            r1.invoke(r4)
                        Lf5:
                            kotlin.Unit r12 = kotlin.Unit.f24250a
                            return r12
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateInputKt$DateInputTextField$1$1.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                composerImplV.A(obj);
            } else {
                obj = objG2;
                i6 = i4;
                mutableState = mutableState2;
                dateInputFormat2 = dateInputFormat;
                r15 = 0;
            }
            Function1 function14 = (Function1) obj;
            Modifier modifierJ = PaddingKt.j(modifier, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, !StringsKt.D((CharSequence) mutableState.getD()) ? (float) r15 : b, 7);
            boolean zN2 = composerImplV.n(mutableState);
            Object objG3 = composerImplV.G();
            if (zN2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj2;
                        MutableState mutableState3 = mutableState;
                        if (!StringsKt.D((CharSequence) mutableState3.getD())) {
                            String str = (String) mutableState3.getD();
                            KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                            semanticsPropertyReceiver.b(SemanticsProperties.J, str);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            Modifier modifierB = SemanticsModifierKt.b(modifierJ, r15, (Function1) objG3);
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(-591991974, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        MutableState mutableState3 = mutableState;
                        if (!StringsKt.D((CharSequence) mutableState3.getD())) {
                            TextKt.b((String) mutableState3.getD(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            boolean z = !StringsKt.D((CharSequence) mutableState.getD());
            DateVisualTransformation dateVisualTransformation = new DateVisualTransformation(dateInputFormat2);
            KeyboardOptions keyboardOptions = new KeyboardOptions(3, 7, 113);
            datePickerColors.getClass();
            OutlinedTextFieldKt.a(textFieldValue, function14, modifierB, false, null, composableLambdaImpl, composableLambdaImpl2, composableLambdaImplC, z, dateVisualTransformation, keyboardOptions, null, true, 0, 0, null, null, composerImplV, (i6 << 6) & 33030144);
            composerImpl = composerImplV;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final DateInputFormat dateInputFormat3 = dateInputFormat2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateInputKt$DateInputTextField$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    DateInputKt.b(modifier, l, function1, calendarModel, composableLambdaImpl, composableLambdaImpl2, i, dateInputValidator, dateInputFormat3, locale, datePickerColors, (Composer) obj2, RecomposeScopeImplKt.a(i2 | 1), RecomposeScopeImplKt.a(i3));
                    return Unit.f24250a;
                }
            };
        }
    }
}
