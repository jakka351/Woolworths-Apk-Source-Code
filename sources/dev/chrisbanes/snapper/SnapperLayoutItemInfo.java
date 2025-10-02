package dev.chrisbanes.snapper;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SnapperLayoutItemInfo {
    public abstract int a();

    public abstract int b();

    public abstract int c();

    public final String toString() {
        int iA = a();
        int iB = b();
        return a.m(a.q(iA, iB, "SnapperLayoutItemInfo(index=", ", offset=", ", size="), c(), ")");
    }
}
