package androidx.compose.runtime;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.MultiValueMap;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class Pending {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1653a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final MutableIntObjectMap e;
    public final Lazy f;

    public Pending(int i, ArrayList arrayList) {
        this.f1653a = arrayList;
        this.b = i;
        if (i < 0) {
            PreconditionsKt.a("Invalid start index");
        }
        this.d = new ArrayList();
        MutableIntObjectMap mutableIntObjectMap = new MutableIntObjectMap();
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            KeyInfo keyInfo = (KeyInfo) this.f1653a.get(i3);
            int i4 = keyInfo.c;
            int i5 = keyInfo.d;
            mutableIntObjectMap.h(i4, new GroupInfo(i3, i2, i5));
            i2 += i5;
        }
        this.e = mutableIntObjectMap;
        this.f = LazyKt.b(new Function0<MultiValueMap<Object, KeyInfo>>() { // from class: androidx.compose.runtime.Pending$keyMap$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayList arrayList2 = this.h.f1653a;
                MutableScatterMap mutableScatterMap = new MutableScatterMap(arrayList2.size());
                int size2 = arrayList2.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    KeyInfo keyInfo2 = (KeyInfo) arrayList2.get(i6);
                    Object obj = keyInfo2.b;
                    int i7 = keyInfo2.f1642a;
                    MultiValueMap.a(mutableScatterMap, obj != null ? new JoinedKey(Integer.valueOf(i7), keyInfo2.b) : Integer.valueOf(i7), keyInfo2);
                }
                return new MultiValueMap(mutableScatterMap);
            }
        });
    }

    public final boolean a(int i, int i2) {
        int i3;
        MutableIntObjectMap mutableIntObjectMap = this.e;
        GroupInfo groupInfo = (GroupInfo) mutableIntObjectMap.b(i);
        if (groupInfo == null) {
            return false;
        }
        int i4 = groupInfo.b;
        int i5 = i2 - groupInfo.c;
        groupInfo.c = i2;
        if (i5 == 0) {
            return true;
        }
        Object[] objArr = mutableIntObjectMap.c;
        long[] jArr = mutableIntObjectMap.f678a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = 0; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        GroupInfo groupInfo2 = (GroupInfo) objArr[(i6 << 3) + i8];
                        if (groupInfo2.b >= i4 && !groupInfo2.equals(groupInfo) && (i3 = groupInfo2.b + i5) >= 0) {
                            groupInfo2.b = i3;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return true;
                }
            }
            if (i6 == length) {
                return true;
            }
            i6++;
        }
    }
}
