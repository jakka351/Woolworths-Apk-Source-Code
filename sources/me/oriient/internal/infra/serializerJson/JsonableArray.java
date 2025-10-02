package me.oriient.internal.infra.serializerJson;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\n¨\u0006\r"}, d2 = {"Lme/oriient/internal/infra/serializerJson/JsonableArray;", "Lme/oriient/internal/infra/serializerJson/Jsonable;", "Ljava/io/Serializable;", "", "raw", "<init>", "(Ljava/util/List;)V", "Lkotlinx/serialization/json/JsonElement;", "toJsonElement", "()Lkotlinx/serialization/json/JsonElement;", "Ljava/util/List;", "Companion", "me/oriient/internal/infra/serializerJson/b", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JsonableArray implements Jsonable, Serializable {

    @NotNull
    public static final b Companion = new b();
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<Jsonable> raw;

    /* JADX WARN: Multi-variable type inference failed */
    public JsonableArray(@NotNull List<? extends Jsonable> raw) {
        Intrinsics.h(raw, "raw");
        this.raw = raw;
    }

    @Override // me.oriient.internal.infra.serializerJson.Jsonable
    @NotNull
    public JsonElement toJsonElement() {
        List<Jsonable> list = this.raw;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Jsonable) it.next()).toJsonElement());
        }
        return new JsonArray(arrayList);
    }
}
