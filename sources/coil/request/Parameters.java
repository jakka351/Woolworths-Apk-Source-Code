package coil.request;

import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001:\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcoil/request/Parameters;", "", "Lkotlin/Pair;", "", "Lcoil/request/Parameters$Entry;", "Builder", "Companion", "Entry", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class Parameters implements Iterable<Pair<? extends String, ? extends Entry>>, KMappedMarker {
    public static final Parameters e = new Parameters(EmptyMap.d);
    public final Map d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/Parameters$Builder;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f13022a;

        public Builder(Parameters parameters) {
            this.f13022a = MapsKt.s(parameters.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/request/Parameters$Companion;", "", "Lcoil/request/Parameters;", "EMPTY", "Lcoil/request/Parameters;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/Parameters$Entry;", "", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Entry {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Entry);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Entry(value=null, memoryCacheKey=null)";
        }
    }

    public Parameters(Map map) {
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Parameters) {
            return Intrinsics.c(this.d, ((Parameters) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends Entry>> iterator() {
        Map map = this.d;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new Pair((String) entry.getKey(), (Entry) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return a.u(new StringBuilder("Parameters(entries="), this.d, ')');
    }
}
