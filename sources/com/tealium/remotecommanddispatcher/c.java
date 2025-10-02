package com.tealium.remotecommanddispatcher;

import com.tealium.core.JsonUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/remotecommanddispatcher/c;", "", "a", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes6.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19196a;
    public final Map b;
    public final Map c;
    public final Map d;
    public final b e;
    public final String f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/remotecommanddispatcher/c$a;", "", "remotecommanddispatcher_release"}, k = 1, mv = {1, 6, 0})
    public static final class a {
        public static c a(JSONObject jSONObject) throws JSONException {
            b bVar;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            LinkedHashMap linkedHashMap3;
            String string;
            String string2;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MlModel.MODEL_FILE_SUFFIX);
            String string3 = null;
            if (jSONObjectOptJSONObject != null) {
                if (jSONObjectOptJSONObject.has("keys_equality_delimiter")) {
                    string = jSONObjectOptJSONObject.getString("keys_equality_delimiter");
                    jSONObjectOptJSONObject.remove("keys_equality_delimiter");
                } else {
                    string = null;
                }
                if (jSONObjectOptJSONObject.has("keys_separation_delimiter")) {
                    string2 = jSONObjectOptJSONObject.getString("keys_separation_delimiter");
                    jSONObjectOptJSONObject.remove("keys_separation_delimiter");
                } else {
                    string2 = null;
                }
                if (string == null) {
                    string = ":";
                }
                if (string2 == null) {
                    string2 = ",";
                }
                bVar = new b(string, string2);
            } else {
                bVar = null;
            }
            LinkedHashMap linkedHashMapB = jSONObjectOptJSONObject != null ? JsonUtils.Companion.b(jSONObjectOptJSONObject) : null;
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("mappings");
            if (jSONObjectOptJSONObject2 != null) {
                Set<Map.Entry> setEntrySet = JsonUtils.Companion.b(jSONObjectOptJSONObject2).entrySet();
                int iH = MapsKt.h(CollectionsKt.s(setEntrySet, 10));
                if (iH < 16) {
                    iH = 16;
                }
                linkedHashMap = new LinkedHashMap(iH);
                for (Map.Entry entry : setEntrySet) {
                    linkedHashMap.put(entry.getKey(), (String) entry.getValue());
                }
            } else {
                linkedHashMap = null;
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("commands");
            if (jSONObjectOptJSONObject3 != null) {
                Set<Map.Entry> setEntrySet2 = JsonUtils.Companion.b(jSONObjectOptJSONObject3).entrySet();
                int iH2 = MapsKt.h(CollectionsKt.s(setEntrySet2, 10));
                if (iH2 < 16) {
                    iH2 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iH2);
                for (Map.Entry entry2 : setEntrySet2) {
                    linkedHashMap4.put(entry2.getKey(), (String) entry2.getValue());
                }
                linkedHashMap2 = linkedHashMap4;
            } else {
                linkedHashMap2 = null;
            }
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("statics");
            if (jSONObjectOptJSONObject4 != null) {
                Set<Map.Entry> setEntrySet3 = JsonUtils.Companion.b(jSONObjectOptJSONObject4).entrySet();
                int iH3 = MapsKt.h(CollectionsKt.s(setEntrySet3, 10));
                linkedHashMap3 = new LinkedHashMap(iH3 >= 16 ? iH3 : 16);
                for (Map.Entry entry3 : setEntrySet3) {
                    linkedHashMap3.put(entry3.getKey(), JsonUtils.Companion.b((JSONObject) entry3.getValue()));
                }
            } else {
                linkedHashMap3 = null;
            }
            try {
                string3 = jSONObject.getString("etag");
            } catch (JSONException unused) {
            }
            String str = string3;
            if (bVar == null) {
                bVar = new b(":", ",");
            }
            return new c(linkedHashMapB, linkedHashMap, linkedHashMap2, linkedHashMap3, bVar, str);
        }

        public static JSONObject b(c cVar) throws JSONException {
            b bVar = cVar.e;
            String str = bVar.b;
            String str2 = bVar.f19195a;
            JSONObject jSONObject = new JSONObject();
            Map map = cVar.f19196a;
            if (map != null) {
                LinkedHashMap linkedHashMapS = MapsKt.s(map);
                if (!str2.equals(":")) {
                    linkedHashMapS.put("keys_equality_delimiter", str2);
                }
                if (!str.equals(",")) {
                    linkedHashMapS.put("keys_separation_delimiter", str);
                }
                jSONObject.put(MlModel.MODEL_FILE_SUFFIX, JsonUtils.Companion.a(MapsKt.q(linkedHashMapS)));
            }
            Map map2 = cVar.b;
            if (map2 != null) {
                jSONObject.put("mappings", JsonUtils.Companion.a(map2));
            }
            Map map3 = cVar.c;
            if (map3 != null) {
                jSONObject.put("commands", JsonUtils.Companion.a(map3));
            }
            Map map4 = cVar.d;
            if (map4 != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : map4.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), JsonUtils.Companion.a((Map) entry.getValue()));
                }
                jSONObject.put("statics", jSONObject2);
            }
            String str3 = cVar.f;
            if (str3 != null) {
                jSONObject.put("etag", str3);
            }
            return jSONObject;
        }
    }

    public c(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, b bVar, String str) {
        this.f19196a = linkedHashMap;
        this.b = linkedHashMap2;
        this.c = linkedHashMap3;
        this.d = linkedHashMap4;
        this.e = bVar;
        this.f = str;
    }

    /* renamed from: a, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    /* renamed from: b, reason: from getter */
    public final Map getF19196a() {
        return this.f19196a;
    }

    /* renamed from: c, reason: from getter */
    public final b getE() {
        return this.e;
    }

    /* renamed from: d, reason: from getter */
    public final Map getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final Map getD() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.c(this.f19196a, cVar.f19196a) && Intrinsics.c(this.b, cVar.b) && Intrinsics.c(this.c, cVar.c) && Intrinsics.c(this.d, cVar.d) && Intrinsics.c(this.e, cVar.e) && Intrinsics.c(this.f, cVar.f);
    }

    public final int hashCode() {
        Map map = this.f19196a;
        int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
        Map map2 = this.b;
        int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map map3 = this.c;
        int iHashCode3 = (iHashCode2 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map map4 = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (map4 == null ? 0 : map4.hashCode())) * 31)) * 31;
        String str = this.f;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteCommandConfig(apiConfig=" + this.f19196a + ", mappings=" + this.b + ", apiCommands=" + this.c + ", statics=" + this.d + ", delimiters=" + this.e + ", etag=" + this.f + ")";
    }
}
