package androidx.os;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"androidx/savedstate/SavedStateWriterKt__SavedStateWriter_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SavedStateWriterKt {
    public static final ArrayList a(Collection collection) {
        Intrinsics.h(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList(collection);
    }
}
