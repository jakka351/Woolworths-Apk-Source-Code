package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes.dex */
class v1<T> implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private String f16744a;
    private MDEngagementType b;
    private e8<T> c;
    private e8<Boolean> d;

    public v1(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.f16744a = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.b = MDEngagementType.fromString(jSONObject.getString("type"));
            }
            if (jSONObject.has("criteria") && !jSONObject.isNull("criteria")) {
                this.c = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("criteria"));
            }
            if (!jSONObject.has("shouldEvaluate") || jSONObject.isNull("shouldEvaluate")) {
                return;
            }
            this.d = ModelFactory.getInstance().getTriggerChildContract(jSONObject.getJSONObject("shouldEvaluate"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public String a() {
        return this.f16744a;
    }

    public e8<T> b() {
        return this.c;
    }

    public MDEngagementType c() {
        return this.b;
    }

    public e8<Boolean> d() {
        return this.d;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"engagementId\":");
            sb.append(l3.c(this.f16744a));
            sb.append(",\"type\":");
            MDEngagementType mDEngagementType = this.b;
            sb.append(l3.c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb.append(",\"criteria\":");
            e8<T> e8Var = this.c;
            sb.append(e8Var != null ? e8Var.toJsonString() : "null");
            sb.append(",\"shouldEvaluate\":");
            e8<Boolean> e8Var2 = this.d;
            sb.append(e8Var2 != null ? e8Var2.toJsonString() : "null");
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
