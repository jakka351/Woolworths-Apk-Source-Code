package dev.chrisbanes.snapper;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldev/chrisbanes/snapper/LazyListSnapperLayoutItemInfo;", "Ldev/chrisbanes/snapper/SnapperLayoutItemInfo;", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
final class LazyListSnapperLayoutItemInfo extends SnapperLayoutItemInfo {

    /* renamed from: a, reason: collision with root package name */
    public final LazyListItemInfo f23781a;

    public LazyListSnapperLayoutItemInfo(LazyListItemInfo lazyListItem) {
        Intrinsics.h(lazyListItem, "lazyListItem");
        this.f23781a = lazyListItem;
    }

    @Override // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int a() {
        return this.f23781a.getIndex();
    }

    @Override // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int b() {
        return this.f23781a.getOffset();
    }

    @Override // dev.chrisbanes.snapper.SnapperLayoutItemInfo
    public final int c() {
        return this.f23781a.getSize();
    }
}
