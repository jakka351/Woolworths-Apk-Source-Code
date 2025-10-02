package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextSelectionColors;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextSelectionColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1227a;
    public final long b;

    public TextSelectionColors(long j, long j2) {
        this.f1227a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextSelectionColors)) {
            return false;
        }
        TextSelectionColors textSelectionColors = (TextSelectionColors) obj;
        return Color.c(this.f1227a, textSelectionColors.f1227a) && Color.c(this.b, textSelectionColors.b);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.b) + (Long.hashCode(this.f1227a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        android.support.v4.media.session.a.A(this.f1227a, ", selectionBackgroundColor=", sb);
        sb.append((Object) Color.i(this.b));
        sb.append(')');
        return sb.toString();
    }
}
