package com.google.gson;

import YU.a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {
    public final ArrayList d = new ArrayList();

    @Override // com.google.gson.JsonElement
    public final long d() {
        return i().d();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonArray) && ((JsonArray) obj).d.equals(this.d);
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public final String g() {
        return i().g();
    }

    public final void h(JsonElement jsonElement) {
        this.d.add(jsonElement);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final JsonElement i() {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        if (size == 1) {
            return (JsonElement) arrayList.get(0);
        }
        throw new IllegalStateException(a.d(size, "Array must have size 1, but has size "));
    }

    @Override // java.lang.Iterable
    public final Iterator<JsonElement> iterator() {
        return this.d.iterator();
    }
}
