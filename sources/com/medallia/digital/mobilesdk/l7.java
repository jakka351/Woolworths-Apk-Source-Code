package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
class l7 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    private f8<Boolean> f16586a;
    private ArrayList<v1<Boolean>> b;
    private ArrayList<v1<Long>> c;
    private ArrayList<v1<Boolean>> d;
    private ArrayList<v1<Long>> e;
    private HashMap<String, Long> f;

    public l7(JSONObject jSONObject) {
        try {
            if (jSONObject.has("preEvaluation") && !jSONObject.isNull("preEvaluation")) {
                this.f16586a = new f8<>(jSONObject.getJSONObject("preEvaluation"));
            }
            if (jSONObject.has("triggerRules") && !jSONObject.isNull("triggerRules")) {
                this.b = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("triggerRules"));
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.c = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("nextEvaluationTime"));
            }
            if (jSONObject.has("backgroundTriggerRules") && !jSONObject.isNull("backgroundTriggerRules")) {
                this.d = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("backgroundTriggerRules"));
            }
            if (jSONObject.has("backgroundNextEvaluationTime") && !jSONObject.isNull("backgroundNextEvaluationTime")) {
                this.e = ModelFactory.getInstance().getContractArray(v1.class.getName(), jSONObject.getJSONArray("backgroundNextEvaluationTime"));
            }
            if (!jSONObject.has("backgroundDelay") || jSONObject.isNull("backgroundDelay")) {
                return;
            }
            this.f = ModelFactory.getInstance().getStringLongMap(jSONObject.getJSONObject("backgroundDelay"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public HashMap<String, Long> a() {
        return this.f;
    }

    public ArrayList<v1<Long>> b() {
        return this.e;
    }

    public ArrayList<v1<Boolean>> c() {
        return this.d;
    }

    public ArrayList<v1<Long>> d() {
        return this.c;
    }

    public f8<Boolean> e() {
        return this.f16586a;
    }

    public ArrayList<v1<Boolean>> f() {
        return this.b;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String jsonString = "null";
            StringBuilder sb = new StringBuilder("{\"preEvaluation\":");
            f8<Boolean> f8Var = this.f16586a;
            if (f8Var != null) {
                jsonString = f8Var.toJsonString();
            }
            sb.append(jsonString);
            sb.append(",\"triggerRules\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.b));
            sb.append(",\"nextEvaluationTime\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.c));
            sb.append(",\"backgroundTriggerRules\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.d));
            sb.append(",\"backgroundNextEvaluationTime\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.e));
            sb.append(",\"backgroundNextEvaluationTime\":");
            sb.append(ModelFactory.getInstance().getStringLongMapAsJsonString(this.f));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
