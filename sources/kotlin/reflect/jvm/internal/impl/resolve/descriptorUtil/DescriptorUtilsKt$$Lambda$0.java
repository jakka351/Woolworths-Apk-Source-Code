package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* loaded from: classes7.dex */
class DescriptorUtilsKt$$Lambda$0 implements DFS.Neighbors {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorUtilsKt$$Lambda$0 f24545a = new DescriptorUtilsKt$$Lambda$0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public final Iterable a(Object obj) {
        int i = DescriptorUtilsKt.f24544a;
        Collection collectionQ = ((ValueParameterDescriptor) obj).q();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(collectionQ, 10));
        Iterator it = collectionQ.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).H0());
        }
        return arrayList;
    }
}
