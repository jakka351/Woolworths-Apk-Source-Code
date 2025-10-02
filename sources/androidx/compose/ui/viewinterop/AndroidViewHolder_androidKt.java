package androidx.compose.ui.viewinterop;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidViewHolder_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final AndroidViewHolder_androidKt$NoOpScrollConnection$1 f2210a = new AndroidViewHolder_androidKt$NoOpScrollConnection$1();

    public static final void a(View view, LayoutNode layoutNode) {
        long jG = layoutNode.K.b.G(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jG >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jG & 4294967295L)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    public static final float b(int i) {
        return i * (-1);
    }

    public static final float c(float f) {
        return f * (-1.0f);
    }

    public static final int d(int i) {
        return i == 0 ? 1 : 2;
    }
}
