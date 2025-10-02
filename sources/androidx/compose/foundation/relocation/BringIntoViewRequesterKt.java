package androidx.compose.foundation.relocation;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;

@Metadata(d1 = {"androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewRequesterKt", "androidx/compose/foundation/relocation/BringIntoViewRequesterKt__BringIntoViewResponderKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BringIntoViewRequesterKt {
    public static final BringIntoViewRequester a() {
        return new BringIntoViewRequesterImpl();
    }

    public static final Modifier b(Modifier modifier, BringIntoViewRequester bringIntoViewRequester) {
        return modifier.x0(new BringIntoViewRequesterElement(bringIntoViewRequester));
    }
}
