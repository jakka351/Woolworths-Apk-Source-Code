package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.internal.CharArrayPool;
import kotlinx.serialization.json.internal.Composer;
import kotlinx.serialization.json.internal.DescriptorSchemaCache;
import kotlinx.serialization.json.internal.JsonToStringWriter;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.StreamingJsonEncoder;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.TreeJsonDecoderKt;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/json/Json;", "Lkotlinx/serialization/StringFormat;", "Default", "Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/JsonImpl;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Json implements StringFormat {
    public static final Default d = new Default(new JsonConfiguration(false, false, true, "    ", false, "type", false, true, ClassDiscriminatorMode.e), SerializersModuleKt.f24879a);

    /* renamed from: a, reason: collision with root package name */
    public final JsonConfiguration f24836a;
    public final SerializersModule b;
    public final DescriptorSchemaCache c = new DescriptorSchemaCache();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/Json$Default;", "Lkotlinx/serialization/json/Json;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default extends Json {
    }

    public Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.f24836a = jsonConfiguration;
        this.b = serializersModule;
    }

    public final Object a(DeserializationStrategy deserializer, JsonElement element) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(element, "element");
        return TreeJsonDecoderKt.a(this, element, deserializer);
    }

    public final Object b(DeserializationStrategy deserializer, String string) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(string, "string");
        StringJsonLexer stringJsonLexer = new StringJsonLexer(string);
        Object objE = new StreamingJsonDecoder(this, WriteMode.f, stringJsonLexer, deserializer.getDescriptor(), null).E(deserializer);
        stringJsonLexer.p();
        return objE;
    }

    public final String c(SerializationStrategy serializer, Object obj) {
        Intrinsics.h(serializer, "serializer");
        JsonToStringWriter jsonToStringWriter = new JsonToStringWriter();
        CharArrayPool charArrayPool = CharArrayPool.c;
        jsonToStringWriter.f24866a = charArrayPool.b(128);
        try {
            new StreamingJsonEncoder(new Composer(jsonToStringWriter), this, WriteMode.f, new JsonEncoder[((AbstractCollection) WriteMode.k).getG()]).e(serializer, obj);
            String string = jsonToStringWriter.toString();
            char[] array = jsonToStringWriter.f24866a;
            charArrayPool.getClass();
            Intrinsics.h(array, "array");
            charArrayPool.a(array);
            return string;
        } catch (Throwable th) {
            CharArrayPool charArrayPool2 = CharArrayPool.c;
            char[] array2 = jsonToStringWriter.f24866a;
            charArrayPool2.getClass();
            Intrinsics.h(array2, "array");
            charArrayPool2.a(array2);
            throw th;
        }
    }

    public final JsonElement d(String string) {
        Intrinsics.h(string, "string");
        return (JsonElement) b(JsonElementSerializer.f24842a, string);
    }
}
