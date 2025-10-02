package androidx.compose.foundation.content.internal;

import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ProvidableModifierLocal;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReceiveContentConfigurationKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProvidableModifierLocal f853a = new ProvidableModifierLocal(ReceiveContentConfigurationKt$ModifierLocalReceiveContent$1.h);

    public static final ReceiveContentConfiguration a(ModifierLocalModifierNode modifierLocalModifierNode) {
        if (modifierLocalModifierNode.getD().q) {
            return (ReceiveContentConfiguration) modifierLocalModifierNode.u(f853a);
        }
        return null;
    }
}
