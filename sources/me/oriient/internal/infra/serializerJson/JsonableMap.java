package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B+\u0012\"\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0005¢\u0006\u0004\b\f\u0010\rR0\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/infra/serializerJson/JsonableMap;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Ljava/io/Serializable;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "raw", "<init>", "(Ljava/util/HashMap;)V", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "toHashMap", "()Ljava/util/HashMap;", "Ljava/util/HashMap;", "Companion", "me/oriient/internal/infra/serializerJson/d", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonableMap implements Jsonable, Serializable {

    @NotNull
    public static final d Companion = new d();
    private static final long serialVersionUID = 1;

    @NotNull
    private final HashMap<String, Jsonable> raw;

    public JsonableMap(@NotNull HashMap<String, Jsonable> raw) {
        Intrinsics.h(raw, "raw");
        this.raw = raw;
    }

    @NotNull
    public final HashMap<String, Jsonable> toHashMap() {
        return this.raw;
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        HashMap<String, Jsonable> map = this.raw;
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.h(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((Jsonable) entry.getValue()).toJsonElement());
        }
        return new JsonObject(linkedHashMap);
    }
}
