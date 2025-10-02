package au.com.woolworths.design.wx.component.text;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.wx.component.text.InlineLabelSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$InlineLabelTextKt$lambda$1125339840$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InlineLabelTextKt$lambda$1125339840$1 d = new ComposableSingletons$InlineLabelTextKt$lambda$1125339840$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InlineLabelSpec inlineLabelSpec = InlineLabelSpec.Branded.f5149a;
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 12);
            SpanPlacement[] spanPlacementArr = SpanPlacement.d;
            InlineLabelTextKt.a(inlineLabelSpec, "New", modifierF, false, 0L, null, null, "product name title", 1, null, composer, 100691382, 6, BERTags.FLAGS);
        }
        return Unit.f24250a;
    }
}
