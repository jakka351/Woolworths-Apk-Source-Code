package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RememberEventDispatcherKt {
    public static final void a(int i, int i2, ArrayList arrayList) {
        Object obj = arrayList.get(i);
        arrayList.set(i, arrayList.get(i2));
        arrayList.set(i2, obj);
    }

    public static final void b(MutableIntList mutableIntList, int i, int i2) {
        int iA = mutableIntList.a(i);
        mutableIntList.f(i, mutableIntList.a(i2));
        mutableIntList.f(i2, iA);
    }
}
