package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class IntListKt {

    /* renamed from: a, reason: collision with root package name */
    public static final MutableIntList f677a = new MutableIntList(0);

    public static final MutableIntList a(int... iArr) {
        MutableIntList mutableIntList = new MutableIntList(iArr.length);
        int i = mutableIntList.b;
        if (i < 0) {
            RuntimeHelpersKt.c("");
            throw null;
        }
        if (iArr.length == 0) {
            return mutableIntList;
        }
        mutableIntList.d(iArr.length + i);
        int[] iArr2 = mutableIntList.f676a;
        int i2 = mutableIntList.b;
        if (i != i2) {
            ArraysKt.q(iArr.length + i, i, i2, iArr2, iArr2);
        }
        ArraysKt.u(i, 0, 12, iArr, iArr2);
        mutableIntList.b += iArr.length;
        return mutableIntList;
    }
}
