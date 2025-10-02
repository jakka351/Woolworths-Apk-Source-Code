package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlinx/serialization/internal/CachedNames;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
@SourceDebugExtension
/* loaded from: classes.dex */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, CachedNames {

    /* renamed from: a, reason: collision with root package name */
    public final String f24814a;
    public final GeneratedSerializer b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;

    public PluginGeneratedSerialDescriptor(String str, GeneratedSerializer generatedSerializer, int i) {
        this.f24814a = str;
        this.b = generatedSerializer;
        this.c = i;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = EmptyMap.d;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.d;
        final int i4 = 0;
        this.i = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c
            public final /* synthetic */ PluginGeneratedSerialDescriptor e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i4) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.e.b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? PluginHelperInterfacesKt.f24815a : kSerializerArrChildSerializers;
                    case 1:
                        GeneratedSerializer generatedSerializer3 = this.e.b;
                        if (generatedSerializer3 == null || (kSerializerArrTypeParametersSerializers = generatedSerializer3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getB());
                            }
                        }
                        return Platform_commonKt.b(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.e;
                        return Integer.valueOf(PluginGeneratedSerialDescriptorKt.a(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.j.getD()));
                }
            }
        });
        final int i5 = 1;
        this.j = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c
            public final /* synthetic */ PluginGeneratedSerialDescriptor e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i5) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.e.b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? PluginHelperInterfacesKt.f24815a : kSerializerArrChildSerializers;
                    case 1:
                        GeneratedSerializer generatedSerializer3 = this.e.b;
                        if (generatedSerializer3 == null || (kSerializerArrTypeParametersSerializers = generatedSerializer3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getB());
                            }
                        }
                        return Platform_commonKt.b(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.e;
                        return Integer.valueOf(PluginGeneratedSerialDescriptorKt.a(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.j.getD()));
                }
            }
        });
        final int i6 = 2;
        this.k = LazyKt.a(lazyThreadSafetyMode, new Function0(this) { // from class: kotlinx.serialization.internal.c
            public final /* synthetic */ PluginGeneratedSerialDescriptor e;

            {
                this.e = this;
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KSerializer[] kSerializerArrChildSerializers;
                ArrayList arrayList;
                KSerializer[] kSerializerArrTypeParametersSerializers;
                switch (i6) {
                    case 0:
                        GeneratedSerializer generatedSerializer2 = this.e.b;
                        return (generatedSerializer2 == null || (kSerializerArrChildSerializers = generatedSerializer2.childSerializers()) == null) ? PluginHelperInterfacesKt.f24815a : kSerializerArrChildSerializers;
                    case 1:
                        GeneratedSerializer generatedSerializer3 = this.e.b;
                        if (generatedSerializer3 == null || (kSerializerArrTypeParametersSerializers = generatedSerializer3.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(kSerializerArrTypeParametersSerializers.length);
                            for (KSerializer kSerializer : kSerializerArrTypeParametersSerializers) {
                                arrayList.add(kSerializer.getB());
                            }
                        }
                        return Platform_commonKt.b(arrayList);
                    default:
                        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.e;
                        return Integer.valueOf(PluginGeneratedSerialDescriptorKt.a(pluginGeneratedSerialDescriptor, (SerialDescriptor[]) pluginGeneratedSerialDescriptor.j.getD()));
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.internal.CachedNames
    /* renamed from: a */
    public final Set getC() {
        return this.h.keySet();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int c(String name) {
        Intrinsics.h(name, "name");
        Integer num = (Integer) this.h.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public SerialDescriptor d(int i) {
        return ((KSerializer[]) this.i.getD())[i].getB();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: e, reason: from getter */
    public final int getC() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.Lazy] */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (this.f24814a.equals(serialDescriptor.getC()) && Arrays.equals((SerialDescriptor[]) this.j.getD(), (SerialDescriptor[]) ((PluginGeneratedSerialDescriptor) obj).j.getD())) {
                int c = serialDescriptor.getC();
                int i = this.c;
                if (i == c) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (Intrinsics.c(d(i2).getC(), serialDescriptor.d(i2).getC()) && Intrinsics.c(d(i2).getB(), serialDescriptor.d(i2).getB())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: f */
    public SerialKind getB() {
        return StructureKind.CLASS.f24774a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i) {
        return this.e[i];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: getAnnotations */
    public final List getD() {
        return EmptyList.d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? EmptyList.d : list;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public int hashCode() {
        return ((Number) this.k.getD()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: i, reason: from getter */
    public final String getC() {
        return this.f24814a;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    /* renamed from: isInline */
    public boolean getL() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String name, boolean z) {
        Intrinsics.h(name, "name");
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = name;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return CollectionsKt.M(RangesKt.o(0, this.c), ", ", this.f24814a.concat("("), ")", new b(this, 1), 24);
    }
}
