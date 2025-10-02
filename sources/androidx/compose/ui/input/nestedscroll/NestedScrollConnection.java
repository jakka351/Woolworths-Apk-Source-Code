package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
    }

    default Object J0(long j, Continuation continuation) {
        return Velocity.a(0L);
    }

    default Object V(long j, long j2, Continuation continuation) {
        return Velocity.a(0L);
    }

    default long b0(int i, long j) {
        return 0L;
    }

    default long n0(int i, long j, long j2) {
        return 0L;
    }
}
