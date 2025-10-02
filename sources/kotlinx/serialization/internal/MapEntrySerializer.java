package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer;", "K", "V", "Lkotlinx/serialization/internal/KeyValueSerializer;", "", "MapEntry", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class MapEntrySerializer<K, V> extends KeyValueSerializer<K, V, Map.Entry<? extends K, ? extends V>> {
    public final SerialDescriptorImpl c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/internal/MapEntrySerializer$MapEntry;", "K", "V", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, KMappedMarker {
        public final Object d;
        public final Object e;

        public MapEntry(Object obj, Object obj2) {
            this.d = obj;
            this.e = obj2;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) obj;
            return Intrinsics.c(this.d, mapEntry.d) && Intrinsics.c(this.e, mapEntry.e);
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.d;
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            return this.e;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            Object obj = this.d;
            int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
            Object obj2 = this.e;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MapEntry(key=");
            sb.append(this.d);
            sb.append(", value=");
            return android.support.v4.media.session.a.s(sb, this.e, ')');
        }
    }

    public MapEntrySerializer(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        a aVar = new a(kSerializer, kSerializer2, 0);
        this.c = SerialDescriptorsKt.d("kotlin.collections.Map.Entry", StructureKind.MAP.f24776a, new SerialDescriptor[0], aVar);
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object a(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.h(entry, "<this>");
        return entry.getKey();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object b(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.h(entry, "<this>");
        return entry.getValue();
    }

    @Override // kotlinx.serialization.internal.KeyValueSerializer
    public final Object c(Object obj, Object obj2) {
        return new MapEntry(obj, obj2);
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return this.c;
    }
}
