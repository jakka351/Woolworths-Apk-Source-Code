package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u001c\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r*\u00020\u000eH\u0000\u001a\u001e\u0010\u000f\u001a\u0002H\u0010\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0006*\u00020\u0011H\u0087\b¢\u0006\u0002\u0010\u0012\u001a#\u0010\u000f\u001a\u0002H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u0006*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a \u0010\u0015\u001a\u0004\u0018\u0001H\u0010\"\n\b\u0000\u0010\u0010\u0018\u0001*\u00020\u0006*\u00020\u0011H\u0087\b¢\u0006\u0002\u0010\u0012\u001a%\u0010\u0015\u001a\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u0006*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a\f\u0010\u0016\u001a\u00020\u0011*\u00020\u0006H\u0007\u001a\u000e\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u0006H\u0007\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0018"}, d2 = {"json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "buildSerializer", "Lkotlinx/serialization/KSerializer;", "", "value", "module", "Lkotlinx/serialization/modules/SerializersModule;", "elementSerializer", "", "kclass", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "parseAsJson", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "(Ljava/lang/String;)Ljava/lang/Object;", "type", "(Ljava/lang/String;Lkotlin/reflect/KType;)Ljava/lang/Object;", "parseAsJsonOrNull", "serializeToJsonString", "serializeToJsonStringOrNull", "internal_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonSerializationKt {

    @Keep
    @NotNull
    private static final Json json = JsonKt.a(a.f24985a);

    @Keep
    @NotNull
    public static final KSerializer<Object> buildSerializer(@NotNull Object value, @NotNull SerializersModule module) {
        KSerializer<Object> kSerializerB;
        KSerializer<Object> kSerializerB2;
        Intrinsics.h(value, "value");
        Intrinsics.h(module, "module");
        if (value instanceof JsonElement) {
            kSerializerB2 = JsonElement.INSTANCE.serializer();
        } else if (value instanceof List) {
            kSerializerB2 = BuiltinSerializersKt.b(elementSerializer((Collection) value, module));
        } else if (value instanceof Object[]) {
            Object objH = ArraysKt.H((Object[]) value);
            if (objH == null || (kSerializerB2 = buildSerializer(objH, module)) == null) {
                kSerializerB2 = BuiltinSerializersKt.b(StringSerializer.f24821a);
            }
        } else {
            if (value instanceof Set) {
                KSerializer<?> elementSerializer = elementSerializer((Collection) value, module);
                Intrinsics.h(elementSerializer, "elementSerializer");
                kSerializerB = new LinkedHashSetSerializer<>(elementSerializer);
            } else if (value instanceof Map) {
                Map map = (Map) value;
                kSerializerB2 = BuiltinSerializersKt.c(elementSerializer(map.keySet(), module), elementSerializer(map.values(), module));
            } else {
                Class<?> cls = value.getClass();
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                kSerializerB = module.b(reflectionFactory.b(cls), EmptyList.d);
                if (kSerializerB == null) {
                    kSerializerB2 = SerializersKt.b(reflectionFactory.b(value.getClass()));
                }
            }
            kSerializerB2 = kSerializerB;
        }
        Intrinsics.f(kSerializerB2, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return kSerializerB2;
    }

    private static final KSerializer<?> elementSerializer(Collection<?> collection, SerializersModule serializersModule) {
        ArrayList arrayListB = CollectionsKt.B(collection);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add(buildSerializer(it.next(), serializersModule));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (hashSet.add(((KSerializer) next).getB().getB())) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb = new StringBuilder("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((KSerializer) it3.next()).getB().getB());
            }
            sb.append(arrayList3);
            throw new IllegalStateException(sb.toString().toString());
        }
        KSerializer<?> kSerializer = (KSerializer) CollectionsKt.p0(arrayList2);
        if (kSerializer == null) {
            kSerializer = StringSerializer.f24821a;
        }
        if (!kSerializer.getB().b() && (!(collection instanceof Collection) || !collection.isEmpty())) {
            Iterator<T> it4 = collection.iterator();
            while (it4.hasNext()) {
                if (it4.next() == null) {
                    return BuiltinSerializersKt.d(kSerializer);
                }
            }
        }
        return kSerializer;
    }

    @NotNull
    public static final Json getJson() {
        return json;
    }

    @NotNull
    public static final KClass<Object> kclass(@NotNull KType kType) {
        Intrinsics.h(kType, "<this>");
        KClassifier d = kType.getD();
        if (d instanceof KClass) {
            return (KClass) d;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + d).toString());
    }

    @Keep
    @NotNull
    public static final <T> T parseAsJson(@NotNull String str, @NotNull KType type) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(type, "type");
        Json json2 = json;
        KSerializer kSerializerB = json2.b.b(kclass(type), EmptyList.d);
        if (kSerializerB == null) {
            kSerializerB = SerializersKt.c(SerializersModuleKt.f24879a, type);
        }
        T t = (T) json2.b(kSerializerB, str);
        Intrinsics.f(t, "null cannot be cast to non-null type T of me.oriient.internal.infra.serializerJson.JsonSerializationKt.parseAsJson");
        return t;
    }

    @Keep
    @Nullable
    public static final <T> T parseAsJsonOrNull(@NotNull String str, @NotNull KType type) {
        Intrinsics.h(str, "<this>");
        Intrinsics.h(type, "type");
        try {
            return (T) parseAsJson(str, type);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Keep
    @NotNull
    public static final String serializeToJsonString(@NotNull Object obj) {
        Intrinsics.h(obj, "<this>");
        Json json2 = json;
        return json2.c(buildSerializer(obj, json2.b), obj);
    }

    @Keep
    @Nullable
    public static final String serializeToJsonStringOrNull(@NotNull Object obj) {
        Intrinsics.h(obj, "<this>");
        try {
            Json json2 = json;
            return json2.c(buildSerializer(obj, json2.b), obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Keep
    public static final <T> T parseAsJsonOrNull(String str) {
        Intrinsics.h(str, "<this>");
        try {
            Intrinsics.o();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Keep
    public static final <T> T parseAsJson(String str) {
        Intrinsics.h(str, "<this>");
        Intrinsics.o();
        throw null;
    }
}
