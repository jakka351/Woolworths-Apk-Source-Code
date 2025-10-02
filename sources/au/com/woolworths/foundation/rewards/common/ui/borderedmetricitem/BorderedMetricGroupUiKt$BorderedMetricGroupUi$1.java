package au.com.woolworths.foundation.rewards.common.ui.borderedmetricitem;

import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final class BorderedMetricGroupUiKt$BorderedMetricGroupUi$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.foundation.rewards.common.ui.borderedmetricitem.BorderedMetricGroupUiKt$BorderedMetricGroupUi$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            BoxWithConstraintsScope BoxWithConstraints = (BoxWithConstraintsScope) obj;
            Composer composer = (Composer) obj2;
            int iIntValue = ((Number) obj3).intValue();
            Intrinsics.h(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 6) == 0) {
                iIntValue |= composer.n(BoxWithConstraints) ? 4 : 2;
            }
            if ((iIntValue & 19) == 18 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            Float.compare(BoxWithConstraints.f(), DilithiumEngine.DilithiumPolyT1PackedBytes);
            PaddingKt.e(Modifier.Companion.d, null);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) != 2 || !composer.c()) {
            throw null;
        }
        composer.j();
        return Unit.f24250a;
    }
}
