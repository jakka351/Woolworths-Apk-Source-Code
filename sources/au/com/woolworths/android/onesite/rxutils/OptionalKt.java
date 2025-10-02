package au.com.woolworths.android.onesite.rxutils;

import au.com.woolworths.android.onesite.rxutils.Optional;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OptionalKt {
    public static final Object a(Optional optional) {
        Intrinsics.h(optional, "<this>");
        if (optional.equals(Optional.None.f4589a)) {
            return null;
        }
        if (optional instanceof Optional.Some) {
            return ((Optional.Some) optional).f4590a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Optional b(String str) {
        return str != null ? new Optional.Some(str) : Optional.None.f4589a;
    }
}
