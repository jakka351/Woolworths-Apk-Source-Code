package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class UnlockChristmasFundBottomSheetKt$UnlockChristmasFundModalBottomSheet$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundBottomSheetKt$UnlockChristmasFundModalBottomSheet$1$4, reason: invalid class name */
    final class AnonymousClass4 implements Function3<ColumnScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ((Number) obj3).intValue();
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundBottomSheetKt$UnlockChristmasFundModalBottomSheet$1$6, reason: invalid class name */
    final class AnonymousClass6 implements Function3<ColumnScope, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundBottomSheetKt$UnlockChristmasFundModalBottomSheet$1$6$1, reason: invalid class name */
        final class AnonymousClass1 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                ((Number) obj3).intValue();
                Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            ColumnScope ModalBottomSheet = (ColumnScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
            if ((iIntValue & 6) == 0) {
                iIntValue |= composer.n(ModalBottomSheet) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            EnterExitTransitionKt.f(null, 3);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        SheetStateKt.a(6, 0, composer);
        throw null;
    }
}
