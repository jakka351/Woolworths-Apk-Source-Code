package androidx.collection.internal;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RuntimeHelpersKt {
    public static final void a(String message) {
        Intrinsics.h(message, "message");
        throw new IllegalArgumentException(message);
    }

    public static final void b(String message) {
        Intrinsics.h(message, "message");
        throw new IllegalStateException(message);
    }

    public static final void c(String message) {
        Intrinsics.h(message, "message");
        throw new IndexOutOfBoundsException(message);
    }

    public static final void d(String message) {
        Intrinsics.h(message, "message");
        throw new NoSuchElementException(message);
    }
}
