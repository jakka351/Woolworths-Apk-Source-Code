package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes.dex */
class g8<T> extends e8<T> implements x0 {
    private h8 h;
    private h8 i;
    private u1.e j;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16503a;

        static {
            int[] iArr = new int[u1.k.values().length];
            f16503a = iArr;
            try {
                iArr[u1.k.INTEGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16503a[u1.k.DOUBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public g8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("right") && !jSONObject.isNull("right")) {
                this.h = new h8(jSONObject.getJSONObject("right"));
            }
            if (jSONObject.has("left") && !jSONObject.isNull("left")) {
                this.i = new h8(jSONObject.getJSONObject("left"));
            }
            if (!jSONObject.has("condition") || jSONObject.isNull("condition")) {
                return;
            }
            this.j = u1.e.a(jSONObject.getString("condition"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    public u1.e a() {
        return this.j;
    }

    public h8 b() {
        return this.i;
    }

    public h8 c() {
        return this.h;
    }

    @Override // com.medallia.digital.mobilesdk.e8, com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            String jsonString = "null";
            StringBuilder sb = new StringBuilder("{\"right\":");
            h8 h8Var = this.h;
            sb.append(h8Var == null ? "null" : h8Var.toJsonString());
            sb.append(",\"left\":");
            h8 h8Var2 = this.i;
            if (h8Var2 != null) {
                jsonString = h8Var2.toJsonString();
            }
            sb.append(jsonString);
            sb.append(",\"condition\":");
            u1.e eVar = this.j;
            sb.append(l3.c(eVar != null ? eVar.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    private String c(String str, u1.k kVar) {
        int i;
        return (str == null && kVar != null && ((i = a.f16503a[kVar.ordinal()]) == 1 || i == 2)) ? "0" : str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.medallia.digital.mobilesdk.e8
    public T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) throws NumberFormatException {
        Class<K> cls;
        super.a(arrayList, arrayList2, arrayList3);
        a4.b("TREV2 leftValue: " + this.i.c() + " rightValue: " + this.h.c() + " left.getType(): " + this.i.b() + " condition: " + this.j);
        String strC = c(a(this.i.c(), this.i.b()), this.i.b());
        String strC2 = c(a(this.h.c(), this.h.b()), this.h.b());
        String strA = a(this.i.a(), strC, this.i.b());
        String strA2 = a(this.h.a(), strC2, this.h.b());
        Object objA = a(strA, strA2, this.i.b(), this.j);
        StringBuilder sbV = YU.a.v("TREV2 leftValue: ", strA, " rightValue: ", strA2, " left.getType(): ");
        sbV.append(this.i.b());
        sbV.append(" condition: ");
        sbV.append(this.j);
        a4.b(sbV.toString());
        a4.b(androidx.camera.core.impl.b.m(objA, "TREV2 result: "));
        if (objA == null) {
            return null;
        }
        if (objA instanceof Long) {
            cls = Long.class;
        } else {
            if (!(objA instanceof Boolean)) {
                return null;
            }
            cls = Boolean.class;
        }
        return (T) a(objA, cls);
    }
}
