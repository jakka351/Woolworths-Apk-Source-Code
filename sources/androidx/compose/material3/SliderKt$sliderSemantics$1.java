package androidx.compose.material3;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SliderKt$sliderSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "targetValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.material3.SliderKt$sliderSemantics$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Float, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((Number) obj).floatValue();
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        SemanticsPropertiesKt.c(semanticsPropertyReceiver);
        SemanticsPropertiesKt.p(semanticsPropertyReceiver, new AnonymousClass1(1));
        return Unit.f24250a;
    }
}
