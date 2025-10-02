package au.com.woolworths.android.onesite.rxutils;

import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.repository.b;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RxExtKt {
    public static final SingleMap a(Single single) {
        Intrinsics.h(single, "<this>");
        return new SingleMap(single, new e(new b(3), 18));
    }
}
