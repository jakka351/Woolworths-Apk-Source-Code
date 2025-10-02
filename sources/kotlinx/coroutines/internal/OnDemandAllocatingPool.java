package kotlinx.coroutines.internal;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/OnDemandAllocatingPool;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class OnDemandAllocatingPool<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f24727a = AtomicIntegerFieldUpdater.newUpdater(OnDemandAllocatingPool.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnDemandAllocatingPool(");
        int i = f24727a.get(this);
        IntRange intRangeO = RangesKt.o(0, Integer.MAX_VALUE & i);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(intRangeO, 10));
        IntProgressionIterator it = intRangeO.iterator();
        if (it.f) {
            it.nextInt();
            throw null;
        }
        sb.append(arrayList.toString() + ((i & Integer.MIN_VALUE) != 0 ? "[closed]" : ""));
        sb.append(')');
        return sb.toString();
    }
}
