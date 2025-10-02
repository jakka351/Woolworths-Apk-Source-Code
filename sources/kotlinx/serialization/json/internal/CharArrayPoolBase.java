package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPoolBase;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class CharArrayPoolBase {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f24854a = new ArrayDeque();
    public int b;

    public final void a(char[] array) {
        Intrinsics.h(array, "array");
        synchronized (this) {
            int i = this.b;
            if (array.length + i < ArrayPoolsKt.f24852a) {
                this.b = i + array.length;
                this.f24854a.addLast(array);
            }
        }
    }

    public final char[] b(int i) {
        char[] cArr;
        synchronized (this) {
            ArrayDeque arrayDeque = this.f24854a;
            cArr = null;
            char[] cArr2 = (char[]) (arrayDeque.isEmpty() ? null : arrayDeque.removeLast());
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        return cArr == null ? new char[i] : cArr;
    }
}
