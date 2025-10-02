package androidx.compose.ui.focus;

import androidx.compose.ui.node.DelegatableNodeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class FocusEventModifierNodeKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                FocusStateImpl focusStateImpl = FocusStateImpl.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                FocusStateImpl focusStateImpl2 = FocusStateImpl.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                FocusStateImpl focusStateImpl3 = FocusStateImpl.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final void a(FocusEventModifierNode focusEventModifierNode) {
        DelegatableNodeKt.h(focusEventModifierNode).getFocusOwner().k(focusEventModifierNode);
    }
}
