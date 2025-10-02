package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ArrayPoolsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int f24852a;

    static {
        Object objA;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.g(property, "getProperty(...)");
            objA = StringsKt.i0(property);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (objA instanceof Result.Failure) {
            objA = null;
        }
        Integer num = (Integer) objA;
        f24852a = num != null ? num.intValue() : 2097152;
    }
}
