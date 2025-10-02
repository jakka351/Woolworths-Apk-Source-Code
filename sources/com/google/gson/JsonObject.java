package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import com.salesforce.marketingcloud.storage.db.i;
import java.util.Set;

/* loaded from: classes6.dex */
public final class JsonObject extends JsonElement {
    public final LinkedTreeMap d = new LinkedTreeMap(false);

    public final Set entrySet() {
        return this.d.entrySet();
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof JsonObject) && ((JsonObject) obj).d.equals(this.d);
        }
        return true;
    }

    public final void h(String str, JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.d;
        }
        this.d.put(str, jsonElement);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final JsonElement i(String str) {
        return (JsonElement) this.d.get(str);
    }

    public final JsonArray j() {
        return (JsonArray) this.d.get(i.a.n);
    }

    public final boolean k() {
        return this.d.containsKey("email_verified");
    }

    public final JsonElement l(String str) {
        return (JsonElement) this.d.remove(str);
    }
}
