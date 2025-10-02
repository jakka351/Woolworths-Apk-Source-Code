package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.SaverKt$Saver$1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState;", "Landroidx/compose/foundation/pager/PagerState;", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DefaultPagerState extends PagerState {
    public static final SaverKt$Saver$1 K = ListSaverKt.a(DefaultPagerState$Companion$Saver$2.h, DefaultPagerState$Companion$Saver$1.h);
    public final MutableState J;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerState$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public DefaultPagerState(int i, float f, Function0 function0) {
        super(i, f);
        this.J = SnapshotStateKt.f(function0);
    }

    @Override // androidx.compose.foundation.pager.PagerState
    public final int m() {
        return ((Number) ((Function0) ((SnapshotMutableStateImpl) this.J).getD()).invoke()).intValue();
    }
}
