package nl.dionsegijn.konfetti.emitters;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import nl.dionsegijn.konfetti.Confetti;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lnl/dionsegijn/konfetti/Confetti;", "invoke"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes8.dex */
final class RenderSystem$render$1 extends Lambda implements Function1<Confetti, Boolean> {
    public static final RenderSystem$render$1 h = new RenderSystem$render$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Confetti it = (Confetti) obj;
        Intrinsics.h(it, "it");
        return Boolean.valueOf(it.g <= 0);
    }
}
