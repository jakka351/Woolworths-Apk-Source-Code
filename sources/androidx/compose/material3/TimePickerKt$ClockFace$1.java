package androidx.compose.material3;

import androidx.collection.IntList;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "screen", "Landroidx/collection/IntList;", "invoke", "(Landroidx/collection/IntList;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class TimePickerKt$ClockFace$1 extends Lambda implements Function3<IntList, Composer, Integer, Unit> {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.e;
            Unit unit = Unit.f24250a;
            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, unit);
            return unit;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        final IntList intList = (IntList) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        final AnalogTimePickerState analogTimePickerState = null;
        final boolean z = false;
        final TimePickerColors timePickerColors = null;
        TimePickerKt.j(TimePickerKt.f1519a, 432, composer, ComposableLambdaKt.c(-320307952, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj4, Object obj5) {
                Composer composer2 = (Composer) obj4;
                if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                    composer2.j();
                } else {
                    DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f1427a;
                    timePickerColors.getClass();
                    CompositionLocalKt.a(androidx.camera.core.impl.b.g(0L, dynamicProvidableCompositionLocal), ComposableLambdaKt.c(1992872400, new Function2<Composer, Integer, Unit>(analogTimePickerState, z) { // from class: androidx.compose.material3.TimePickerKt.ClockFace.1.2.1

                        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 48)
                        @SourceDebugExtension
                        /* renamed from: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2, reason: invalid class name and collision with other inner class name */
                        final class C00622 extends Lambda implements Function2<Composer, Integer, Unit> {
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer = (Composer) obj;
                                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                                    composer.j();
                                } else {
                                    int i = TimePickerKt.f.b;
                                    for (final int i2 = 0; i2 < i; i2++) {
                                        int iA = TimePickerKt.f.a(i2);
                                        boolean zR = composer.r(i2);
                                        Object objG = composer.G();
                                        if (zR || objG == Composer.Companion.f1624a) {
                                            objG = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.TimePickerKt$ClockFace$1$2$1$2$1$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj3) {
                                                    SemanticsPropertiesKt.v((SemanticsPropertyReceiver) obj3, 12 + i2);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer.A(objG);
                                        }
                                        TimePickerKt.k(SemanticsModifierKt.b(Modifier.Companion.d, false, (Function1) objG), null, iA, false, composer, 0);
                                    }
                                }
                                return Unit.f24250a;
                            }
                        }

                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            Composer composer3 = (Composer) obj6;
                            if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                composer3.j();
                                return Unit.f24250a;
                            }
                            composer3.o(1547046870);
                            if (this.h.b > 0) {
                                throw null;
                            }
                            composer3.l();
                            throw null;
                        }
                    }, composer2), composer2, 56);
                }
                return Unit.f24250a;
            }
        }, composer), SemanticsModifierKt.b(SizeKt.q(Modifier.Companion.d, TimePickerTokens.f1609a), false, AnonymousClass1.h));
        return Unit.f24250a;
    }
}
