package androidx.os;

import YU.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"androidx/savedstate/SavedStateReaderKt__SavedStateReaderKt", "androidx/savedstate/SavedStateReaderKt__SavedStateReader_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavedStateReaderKt {
    public static final void a(String key) {
        Intrinsics.h(key, "key");
        throw new IllegalArgumentException(a.h("No valid saved state was found for the key '", key, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
    }
}
