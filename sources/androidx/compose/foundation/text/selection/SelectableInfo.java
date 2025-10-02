package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectableInfo;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SelectableInfo {

    /* renamed from: a, reason: collision with root package name */
    public final long f1203a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final TextLayoutResult f;

    public SelectableInfo(long j, int i, int i2, int i3, int i4, TextLayoutResult textLayoutResult) {
        this.f1203a = j;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = textLayoutResult;
    }

    public final Selection.AnchorInfo a(int i) {
        return new Selection.AnchorInfo(SelectionLayoutKt.a(this.f, i), i, this.f1203a);
    }

    public final CrossStatus b() {
        int i = this.c;
        int i2 = this.d;
        return i < i2 ? CrossStatus.e : i > i2 ? CrossStatus.d : CrossStatus.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f1203a);
        sb.append(", range=(");
        int i = this.c;
        sb.append(i);
        sb.append('-');
        TextLayoutResult textLayoutResult = this.f;
        sb.append(SelectionLayoutKt.a(textLayoutResult, i));
        sb.append(',');
        int i2 = this.d;
        sb.append(i2);
        sb.append('-');
        sb.append(SelectionLayoutKt.a(textLayoutResult, i2));
        sb.append("), prevOffset=");
        return YU.a.l(sb, this.e, ')');
    }
}
