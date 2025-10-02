package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HistoricalChange {

    /* renamed from: a, reason: collision with root package name */
    public final long f1846a;
    public final long b;
    public final long c;

    public HistoricalChange(long j, long j2, long j3) {
        this.f1846a = j;
        this.b = j2;
        this.c = j3;
    }

    /* renamed from: a, reason: from getter */
    public final long getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final long getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final long getF1846a() {
        return this.f1846a;
    }

    public final String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f1846a + ", position=" + ((Object) Offset.j(this.b)) + ')';
    }
}
