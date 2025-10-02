package kotlinx.serialization.descriptors;

import androidx.camera.core.impl.b;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.i;
import au.com.woolworths.shop.ratings.and.reviews.ui.submitreviewform.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.IndexingIterable;
import kotlin.collections.IndexingIterator;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptorImpl;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SerialDescriptorImpl implements SerialDescriptor, CachedNames {

    /* renamed from: a, reason: collision with root package name */
    public final String f24771a;
    public final SerialKind b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final Lazy l;

    public SerialDescriptorImpl(String serialName, SerialKind serialKind, int i, List list, ClassSerialDescriptorBuilder classSerialDescriptorBuilder) {
        Intrinsics.h(serialName, "serialName");
        this.f24771a = serialName;
        this.b = serialKind;
        this.c = i;
        this.d = classSerialDescriptorBuilder.b;
        ArrayList arrayList = classSerialDescriptorBuilder.c;
        this.e = CollectionsKt.E0(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = Platform_commonKt.b(classSerialDescriptorBuilder.e);
        this.h = (List[]) classSerialDescriptorBuilder.f.toArray(new List[0]);
        this.i = CollectionsKt.A0(classSerialDescriptorBuilder.g);
        Intrinsics.h(strArr, "<this>");
        IndexingIterable indexingIterable = new IndexingIterable(new c(strArr, 27));
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(indexingIterable, 10));
        Iterator it = indexingIterable.iterator();
        while (true) {
            IndexingIterator indexingIterator = (IndexingIterator) it;
            if (!indexingIterator.d.hasNext()) {
                this.j = MapsKt.p(arrayList2);
                this.k = Platform_commonKt.b(list);
                this.l = LazyKt.b(new c(this, 29));
                return;
            }
            IndexedValue indexedValue = (IndexedValue) indexingIterator.next();
            arrayList2.add(new Pair(indexedValue.b, Integer.valueOf(indexedValue.f24254a)));
        }
    }

    @Override // kotlinx.serialization.internal.CachedNames
    /* renamed from: a */
    public final Set getC() {
        return this.e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.h(name, "name");
        Integer num = (Integer) this.j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor d(int i) {
        return this.g[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e, reason: from getter */
    public final int getC() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.c(this.f24771a, serialDescriptor.getF24816a()) && Arrays.equals(this.k, ((SerialDescriptorImpl) obj).k)) {
                int c = serialDescriptor.getC();
                int i = this.c;
                if (i == c) {
                    for (int i2 = 0; i2 < i; i2++) {
                        SerialDescriptor[] serialDescriptorArr = this.g;
                        if (Intrinsics.c(serialDescriptorArr[i2].getF24816a(), serialDescriptor.d(i2).getF24816a()) && Intrinsics.c(serialDescriptorArr[i2].getB(), serialDescriptor.d(i2).getB())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f, reason: from getter */
    public final SerialKind getB() {
        return this.b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.f[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: getAnnotations, reason: from getter */
    public final List getD() {
        return this.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getD()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i, reason: from getter */
    public final String getF24816a() {
        return this.f24771a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public final boolean getL() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return CollectionsKt.M(RangesKt.o(0, this.c), ", ", b.r(new StringBuilder(), this.f24771a, '('), ")", new i(this, 29), 24);
    }
}
