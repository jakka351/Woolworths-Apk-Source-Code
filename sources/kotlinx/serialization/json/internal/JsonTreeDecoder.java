package kotlinx.serialization.json.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonConfiguration;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.JsonSchemaCacheKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/JsonTreeDecoder;", "Lkotlinx/serialization/json/internal/AbstractJsonTreeDecoder;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
class JsonTreeDecoder extends AbstractJsonTreeDecoder {
    public final JsonObject g;
    public final SerialDescriptor h;
    public int i;
    public boolean j;

    public /* synthetic */ JsonTreeDecoder(Json json, JsonObject jsonObject, String str, int i) {
        this(json, jsonObject, (i & 4) != 0 ? null : str, (SerialDescriptor) null);
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        return !this.j && super.C();
    }

    @Override // kotlinx.serialization.internal.NamedValueDecoder
    public String W(SerialDescriptor descriptor, int i) {
        Object next;
        Intrinsics.h(descriptor, "descriptor");
        Json json = this.c;
        JsonNamesMapKt.e(descriptor, json);
        String strG = descriptor.g(i);
        if (this.f.h && !getK().d.keySet().contains(strG)) {
            Map mapA = JsonNamesMapKt.a(descriptor, json);
            Iterator it = getK().d.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) mapA.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strG;
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    public JsonElement Z(String tag) {
        Intrinsics.h(tag, "tag");
        return (JsonElement) MapsKt.e(tag, getK());
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.Decoder
    public final CompositeDecoder b(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        SerialDescriptor serialDescriptor = this.h;
        if (descriptor != serialDescriptor) {
            return super.b(descriptor);
        }
        JsonElement jsonElementA0 = a0();
        String f24814a = serialDescriptor.getF24814a();
        if (jsonElementA0 instanceof JsonObject) {
            String str = this.e;
            return new JsonTreeDecoder(this.c, (JsonObject) jsonElementA0, str, serialDescriptor);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        sb.append(reflectionFactory.b(JsonObject.class).B());
        sb.append(", but had ");
        sb.append(reflectionFactory.b(jsonElementA0.getClass()).B());
        sb.append(" as the serialized body of ");
        sb.append(f24814a);
        sb.append(" at element: ");
        sb.append(Y());
        throw JsonExceptionsKt.c(-1, jsonElementA0.toString(), sb.toString());
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder, kotlinx.serialization.internal.TaggedDecoder, kotlinx.serialization.encoding.CompositeDecoder
    public void c(SerialDescriptor descriptor) {
        Set setG;
        Intrinsics.h(descriptor, "descriptor");
        JsonConfiguration jsonConfiguration = this.f;
        if (jsonConfiguration.f24840a || (descriptor.getB() instanceof PolymorphicKind)) {
            return;
        }
        Json json = this.c;
        JsonNamesMapKt.e(descriptor, json);
        if (jsonConfiguration.h) {
            Set setA = Platform_commonKt.a(descriptor);
            Map map = (Map) JsonSchemaCacheKt.a(json).a(descriptor, JsonNamesMapKt.f24863a);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.d;
            }
            setG = SetsKt.g(setA, setKeySet);
        } else {
            setG = Platform_commonKt.a(descriptor);
        }
        for (String key : getK().d.keySet()) {
            if (!setG.contains(key) && !Intrinsics.c(key, this.e)) {
                String input = getK().toString();
                Intrinsics.h(key, "key");
                Intrinsics.h(input, "input");
                StringBuilder sbU = YU.a.u("Encountered an unknown key '", key, "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: ");
                sbU.append((Object) JsonExceptionsKt.g(-1, input));
                throw JsonExceptionsKt.d(-1, sbU.toString());
            }
        }
    }

    @Override // kotlinx.serialization.json.internal.AbstractJsonTreeDecoder
    /* renamed from: e0, reason: from getter */
    public JsonObject getD() {
        return this.g;
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int u(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        while (this.i < descriptor.getC()) {
            int i = this.i;
            this.i = i + 1;
            String strT = T(descriptor, i);
            int i2 = this.i - 1;
            this.j = false;
            boolean zContainsKey = getK().containsKey(strT);
            Json json = this.c;
            if (!zContainsKey) {
                boolean z = (json.f24836a.c || descriptor.j(i2) || !descriptor.d(i2).b()) ? false : true;
                this.j = z;
                if (!z) {
                    continue;
                }
            }
            if (this.f.e) {
                boolean zJ = descriptor.j(i2);
                SerialDescriptor serialDescriptorD = descriptor.d(i2);
                if (!zJ || serialDescriptorD.b() || !(Z(strT) instanceof JsonNull)) {
                    if (Intrinsics.c(serialDescriptorD.getB(), SerialKind.ENUM.f24773a) && (!serialDescriptorD.b() || !(Z(strT) instanceof JsonNull))) {
                        JsonElement jsonElementZ = Z(strT);
                        String f = null;
                        JsonPrimitive jsonPrimitive = jsonElementZ instanceof JsonPrimitive ? (JsonPrimitive) jsonElementZ : null;
                        if (jsonPrimitive != null) {
                            InlineClassDescriptor inlineClassDescriptor = JsonElementKt.f24841a;
                            if (!(jsonPrimitive instanceof JsonNull)) {
                                f = jsonPrimitive.getF();
                            }
                        }
                        if (f != null) {
                            int iC = JsonNamesMapKt.c(serialDescriptorD, json, f);
                            boolean z2 = !json.f24836a.c && serialDescriptorD.b();
                            if (iC != -3 || (!zJ && !z2)) {
                            }
                        }
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeDecoder(Json json, JsonObject value, String str, SerialDescriptor serialDescriptor) {
        super(json, value, str);
        Intrinsics.h(json, "json");
        Intrinsics.h(value, "value");
        this.g = value;
        this.h = serialDescriptor;
    }
}
