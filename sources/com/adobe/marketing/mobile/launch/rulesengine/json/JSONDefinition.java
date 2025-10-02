package com.adobe.marketing.mobile.launch.rulesengine.json;

import androidx.camera.core.impl.b;
import com.adobe.marketing.mobile.ExtensionApi;
import com.adobe.marketing.mobile.launch.rulesengine.json.JSONCondition;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class JSONDefinition {

    /* renamed from: a, reason: collision with root package name */
    public final String f13207a;
    public final List b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final Object g;
    public final Long h;
    public final Long i;
    public final String j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/adobe/marketing/mobile/launch/rulesengine/json/JSONDefinition$Companion;", "", "", "DEFINITION_KEY_CONDITIONS", "Ljava/lang/String;", "DEFINITION_KEY_EVENTS", "DEFINITION_KEY_FROM", "DEFINITION_KEY_KEY", "DEFINITION_KEY_LOGIC", "DEFINITION_KEY_MATCHER", "DEFINITION_KEY_SEARCH_TYPE", "DEFINITION_KEY_TO", "DEFINITION_KEY_VALUE", "DEFINITION_KEY_VALUES", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public static JSONDefinition a(JSONObject jSONObject, final ExtensionApi extensionApi) {
            Intrinsics.h(extensionApi, "extensionApi");
            Object objOpt = jSONObject.opt("logic");
            String str = objOpt instanceof String ? (String) objOpt : null;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("conditions");
            List listX = jSONArrayOptJSONArray != null ? SequencesKt.x(SequencesKt.r(CollectionsKt.n(RangesKt.o(0, jSONArrayOptJSONArray.length())), new Function1(new Function1<Object, JSONCondition>() { // from class: com.adobe.marketing.mobile.launch.rulesengine.json.JSONDefinition$Companion$buildConditionList$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object it) throws JSONException {
                    Intrinsics.h(it, "it");
                    JSONCondition jSONConditionA = JSONCondition.Companion.a(it instanceof JSONObject ? (JSONObject) it : null, extensionApi);
                    if (jSONConditionA != null) {
                        return jSONConditionA;
                    }
                    throw new JSONException("Unsupported [rule.condition] JSON format: " + it + ' ');
                }
            }, jSONArrayOptJSONArray) { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
                public final /* synthetic */ Lambda h;
                public final /* synthetic */ JSONArray i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.h = (Lambda) function1;
                    this.i = jSONArrayOptJSONArray;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws JSONException {
                    Object obj2 = this.i.get(((Number) obj).intValue());
                    Intrinsics.g(obj2, "this.get(it)");
                    return this.h.invoke(obj2);
                }
            })) : null;
            Object objOpt2 = jSONObject.opt("key");
            String str2 = objOpt2 instanceof String ? (String) objOpt2 : null;
            Object objOpt3 = jSONObject.opt("matcher");
            String str3 = objOpt3 instanceof String ? (String) objOpt3 : null;
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("values");
            List listX2 = jSONArrayOptJSONArray2 != null ? SequencesKt.x(SequencesKt.r(CollectionsKt.n(RangesKt.o(0, jSONArrayOptJSONArray2.length())), new Function1(JSONDefinition$Companion$buildValueList$1.h, jSONArrayOptJSONArray2) { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
                public final /* synthetic */ Lambda h;
                public final /* synthetic */ JSONArray i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.h = (Lambda) function1;
                    this.i = jSONArrayOptJSONArray2;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws JSONException {
                    Object obj2 = this.i.get(((Number) obj).intValue());
                    Intrinsics.g(obj2, "this.get(it)");
                    return this.h.invoke(obj2);
                }
            })) : null;
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("events");
            List listX3 = jSONArrayOptJSONArray3 != null ? SequencesKt.x(SequencesKt.r(CollectionsKt.n(RangesKt.o(0, jSONArrayOptJSONArray3.length())), new Function1(JSONDefinition$Companion$buildValueMapList$1.h, jSONArrayOptJSONArray3) { // from class: com.adobe.marketing.mobile.internal.util.JSONExtensionsKt$map$1
                public final /* synthetic */ Lambda h;
                public final /* synthetic */ JSONArray i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                    this.h = (Lambda) function1;
                    this.i = jSONArrayOptJSONArray3;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) throws JSONException {
                    Object obj2 = this.i.get(((Number) obj).intValue());
                    Intrinsics.g(obj2, "this.get(it)");
                    return this.h.invoke(obj2);
                }
            })) : null;
            Object objOpt4 = jSONObject.opt("value");
            Object objOpt5 = jSONObject.opt("from");
            Long l = objOpt5 instanceof Long ? (Long) objOpt5 : null;
            Object objOpt6 = jSONObject.opt("to");
            Long l2 = objOpt6 instanceof Long ? (Long) objOpt6 : null;
            Object objOpt7 = jSONObject.opt("searchType");
            return new JSONDefinition(str, listX, str2, str3, listX2, listX3, objOpt4, l, l2, objOpt7 instanceof String ? (String) objOpt7 : null);
        }
    }

    public JSONDefinition(String str, List list, String str2, String str3, List list2, List list3, Object obj, Long l, Long l2, String str4) {
        this.f13207a = str;
        this.b = list;
        this.c = str2;
        this.d = str3;
        this.e = list2;
        this.f = list3;
        this.g = obj;
        this.h = l;
        this.i = l2;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JSONDefinition)) {
            return false;
        }
        JSONDefinition jSONDefinition = (JSONDefinition) obj;
        return Intrinsics.c(this.f13207a, jSONDefinition.f13207a) && Intrinsics.c(this.b, jSONDefinition.b) && Intrinsics.c(this.c, jSONDefinition.c) && Intrinsics.c(this.d, jSONDefinition.d) && Intrinsics.c(this.e, jSONDefinition.e) && Intrinsics.c(this.f, jSONDefinition.f) && Intrinsics.c(this.g, jSONDefinition.g) && Intrinsics.c(this.h, jSONDefinition.h) && Intrinsics.c(this.i, jSONDefinition.i) && Intrinsics.c(this.j, jSONDefinition.j);
    }

    public final int hashCode() {
        String str = this.f13207a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Object obj = this.g;
        int iHashCode7 = (iHashCode6 + (obj == null ? 0 : obj.hashCode())) * 31;
        Long l = this.h;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.i;
        int iHashCode9 = (iHashCode8 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str4 = this.j;
        return iHashCode9 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JSONDefinition(logic=");
        sb.append(this.f13207a);
        sb.append(", conditions=");
        sb.append(this.b);
        sb.append(", key=");
        sb.append(this.c);
        sb.append(", matcher=");
        sb.append(this.d);
        sb.append(", values=");
        sb.append(this.e);
        sb.append(", events=");
        sb.append(this.f);
        sb.append(", value=");
        sb.append(this.g);
        sb.append(", from=");
        sb.append(this.h);
        sb.append(", to=");
        sb.append(this.i);
        sb.append(", searchType=");
        return b.r(sb, this.j, ')');
    }
}
