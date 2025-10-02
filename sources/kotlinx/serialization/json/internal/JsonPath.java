package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath;", "", "Tombstone", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class JsonPath {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f24864a;
    public int[] b;
    public int c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonPath$Tombstone;", "", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Tombstone {

        /* renamed from: a, reason: collision with root package name */
        public static final Tombstone f24865a = new Tombstone();
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.c + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = this.f24864a[i2];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!Intrinsics.c(serialDescriptor.getB(), StructureKind.LIST.f24775a)) {
                    int i3 = this.b[i2];
                    if (i3 >= 0) {
                        sb.append(".");
                        sb.append(serialDescriptor.g(i3));
                    }
                } else if (this.b[i2] != -1) {
                    sb.append("[");
                    sb.append(this.b[i2]);
                    sb.append("]");
                }
            } else if (obj != Tombstone.f24865a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }

    public final String toString() {
        return a();
    }
}
