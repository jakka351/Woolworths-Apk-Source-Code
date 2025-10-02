package com.adobe.marketing.mobile.internal.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class JSONExtensionsKt {
    public static final ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        IntProgressionIterator it = RangesKt.o(0, jSONArray.length()).iterator();
        while (it.f) {
            Object obj = jSONArray.get(it.nextInt());
            if (obj instanceof JSONObject) {
                arrayList.add(c((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(b((JSONArray) obj));
            } else if (Intrinsics.c(obj, JSONObject.NULL)) {
                arrayList.add(null);
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ LinkedHashMap c(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.g(itKeys, "this.keys()");
        Sequence sequenceB = SequencesKt.b(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((ConstrainedOnceSequence) sequenceB).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object objB = jSONObject.get((String) next);
            if (objB instanceof JSONObject) {
                objB = c((JSONObject) objB);
            } else if (objB instanceof JSONArray) {
                objB = b((JSONArray) objB);
            } else if (Intrinsics.c(objB, JSONObject.NULL)) {
                objB = null;
            }
            linkedHashMap.put(next, objB);
        }
        return linkedHashMap;
    }
}
