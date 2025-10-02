package com.braintreepayments.api;

import android.text.TextUtils;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration;", "", "Companion", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GraphQLConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final String f13724a;
    public final HashSet b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/braintreepayments/api/GraphQLConfiguration$Companion;", "", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
    }

    public GraphQLConfiguration(JSONObject jSONObject) {
        String strA = Json.a(jSONObject, "url", "");
        Intrinsics.g(strA, "optString(json, GraphQLConstants.Keys.URL, \"\")");
        JSONArray jSONArrayOptJSONArray = jSONObject != null ? jSONObject.optJSONArray("features") : null;
        HashSet hashSet = new HashSet();
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                String strOptString = jSONArrayOptJSONArray.optString(i, "");
                Intrinsics.g(strOptString, "array.optString(i, \"\")");
                hashSet.add(strOptString);
            }
        }
        this.f13724a = strA;
        this.b = hashSet;
        TextUtils.isEmpty(strA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GraphQLConfiguration)) {
            return false;
        }
        GraphQLConfiguration graphQLConfiguration = (GraphQLConfiguration) obj;
        return Intrinsics.c(this.f13724a, graphQLConfiguration.f13724a) && Intrinsics.c(this.b, graphQLConfiguration.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13724a.hashCode() * 31);
    }

    public final String toString() {
        return "GraphQLConfiguration(url=" + this.f13724a + ", features=" + this.b + ')';
    }
}
