package au.com.woolworths.android.onesite.network;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/network/ComponentTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lau/com/woolworths/android/onesite/network/Component;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComponentTypeAdapter implements JsonDeserializer<Component<?>> {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4563a;

    public ComponentTypeAdapter(Map types) {
        Intrinsics.h(types, "types");
        this.f4563a = types;
    }

    @Override // com.google.gson.JsonDeserializer
    public final Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement == null || (jsonElement instanceof JsonNull)) {
            return null;
        }
        JsonObject jsonObjectB = jsonElement.b();
        String strG = jsonObjectB.i("type").g();
        KClass kClass = (KClass) this.f4563a.get(strG);
        if (kClass != null) {
            Object objA = jsonDeserializationContext != null ? jsonDeserializationContext.a(jsonObjectB.i("data"), JvmClassMappingKt.b(kClass)) : null;
            Intrinsics.e(strG);
            return new Component(strG, objA);
        }
        return null;
    }
}
