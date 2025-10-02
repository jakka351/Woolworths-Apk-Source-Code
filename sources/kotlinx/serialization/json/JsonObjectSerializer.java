package kotlinx.serialization.json;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.LinkedHashMapClassDesc;
import kotlinx.serialization.internal.StringSerializer;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/serialization/json/JsonObjectSerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonObject;", "JsonObjectDescriptor", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes7.dex */
public final class JsonObjectSerializer implements KSerializer<JsonObject> {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonObjectSerializer f24846a = new JsonObjectSerializer();
    public static final SerialDescriptor b = JsonObjectDescriptor.b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/JsonObjectSerializer$JsonObjectDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JsonObjectDescriptor implements SerialDescriptor {
        public static final JsonObjectDescriptor b = new JsonObjectDescriptor();
        public static final String c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMapClassDesc f24847a = BuiltinSerializersKt.c(StringSerializer.f24821a, JsonElementSerializer.f24842a).c;

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean b() {
            this.f24847a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final int c(String name) {
            Intrinsics.h(name, "name");
            return this.f24847a.c(name);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final SerialDescriptor d(int i) {
            return this.f24847a.d(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: e */
        public final int getC() {
            this.f24847a.getClass();
            return 2;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: f */
        public final SerialKind getB() {
            this.f24847a.getClass();
            return StructureKind.MAP.f24776a;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final String g(int i) {
            this.f24847a.getClass();
            return String.valueOf(i);
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: getAnnotations */
        public final List getD() {
            this.f24847a.getClass();
            return EmptyList.d;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final List h(int i) {
            this.f24847a.h(i);
            return EmptyList.d;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: i */
        public final String getF24814a() {
            return c;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        /* renamed from: isInline */
        public final boolean getL() {
            this.f24847a.getClass();
            return false;
        }

        @Override // kotlinx.serialization.descriptors.SerialDescriptor
        public final boolean j(int i) {
            this.f24847a.j(i);
            return false;
        }
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final Object deserialize(Decoder decoder) {
        JsonElementSerializersKt.a(decoder);
        return new JsonObject((Map) BuiltinSerializersKt.c(StringSerializer.f24821a, JsonElementSerializer.f24842a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    /* renamed from: getDescriptor */
    public final SerialDescriptor getB() {
        return b;
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, Object obj) {
        JsonObject value = (JsonObject) obj;
        Intrinsics.h(value, "value");
        JsonElementSerializersKt.b(encoder);
        BuiltinSerializersKt.c(StringSerializer.f24821a, JsonElementSerializer.f24842a).serialize(encoder, value);
    }
}
