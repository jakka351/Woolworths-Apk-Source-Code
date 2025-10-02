package kotlinx.serialization.json.internal;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonNamingStrategy;
import kotlinx.serialization.json.JsonSchemaCacheKt;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-json"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class JsonNamesMapKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DescriptorSchemaCache.Key f24863a = new DescriptorSchemaCache.Key();

    public static final Map a(SerialDescriptor descriptor, Json json) {
        Intrinsics.h(json, "<this>");
        Intrinsics.h(descriptor, "descriptor");
        DescriptorSchemaCache descriptorSchemaCacheA = JsonSchemaCacheKt.a(json);
        coil3.gif.a aVar = new coil3.gif.a(12, descriptor, json);
        descriptorSchemaCacheA.getClass();
        Intrinsics.h(descriptor, "descriptor");
        DescriptorSchemaCache.Key key = f24863a;
        Object value = descriptorSchemaCacheA.a(descriptor, key);
        if (value == null) {
            value = aVar.invoke();
            Intrinsics.h(value, "value");
            ConcurrentHashMap concurrentHashMap = descriptorSchemaCacheA.f24858a;
            Object concurrentHashMap2 = concurrentHashMap.get(descriptor);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(descriptor, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(key, value);
        }
        return (Map) value;
    }

    public static final String b(SerialDescriptor serialDescriptor, Json json, int i) {
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(json, "json");
        e(serialDescriptor, json);
        return serialDescriptor.g(i);
    }

    public static final int c(SerialDescriptor serialDescriptor, Json json, String name) {
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(json, "json");
        Intrinsics.h(name, "name");
        e(serialDescriptor, json);
        int iC = serialDescriptor.c(name);
        if (iC != -3 || !json.f24836a.h) {
            return iC;
        }
        Integer num = (Integer) a(serialDescriptor, json).get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int d(SerialDescriptor serialDescriptor, Json json, String name, String suffix) {
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(json, "json");
        Intrinsics.h(name, "name");
        Intrinsics.h(suffix, "suffix");
        int iC = c(serialDescriptor, json, name);
        if (iC != -3) {
            return iC;
        }
        throw new SerializationException(serialDescriptor.getF24814a() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static final JsonNamingStrategy e(SerialDescriptor serialDescriptor, Json json) {
        Intrinsics.h(serialDescriptor, "<this>");
        Intrinsics.h(json, "json");
        Intrinsics.c(serialDescriptor.getB(), StructureKind.CLASS.f24774a);
        return null;
    }
}
