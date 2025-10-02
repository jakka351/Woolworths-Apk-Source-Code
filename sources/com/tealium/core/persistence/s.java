package com.tealium.core.persistence;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0000\b\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/persistence/s;", "Lcom/tealium/core/persistence/Deserializer;", "", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
final class s implements Deserializer<Integer[]> {
    @Override // com.tealium.core.persistence.Deserializer
    public final Object a(String value) throws JSONException {
        Intrinsics.h(value, "value");
        JSONArray jSONArray = new JSONArray(value);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof Integer) {
                Object obj2 = jSONArray.get(i);
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                arrayList.add((Integer) obj2);
            } else if (obj instanceof String) {
                arrayList.add(Integer.valueOf(Integer.parseInt(jSONArray.get(i).toString())));
            }
        }
        Object[] array = arrayList.toArray(new Integer[0]);
        if (array != null) {
            return (Integer[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
