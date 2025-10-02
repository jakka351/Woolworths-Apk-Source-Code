package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
class f8<T> extends e8<T> implements x0 {
    private u1.f h;
    private ArrayList<e8<T>> i;

    public f8(JSONObject jSONObject) {
        try {
            if (jSONObject.has("conjunction") && !jSONObject.isNull("conjunction")) {
                this.h = u1.f.a(jSONObject.getString("conjunction"));
            }
            if (!jSONObject.has("childrenCriteria") || jSONObject.isNull("childrenCriteria")) {
                return;
            }
            this.i = ModelFactory.getInstance().getTriggerChildesContract(jSONObject.getJSONArray("childrenCriteria"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }

    private T c(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        long jMin;
        Iterator<e8<T>> it = this.i.iterator();
        Long lValueOf = null;
        while (it.hasNext()) {
            T tA = it.next().a(arrayList, arrayList2, arrayList3);
            if (tA != null) {
                Long l = (Long) tA;
                long jLongValue = l.longValue();
                if (lValueOf == null) {
                    lValueOf = l;
                }
                u1.f fVar = this.h;
                if (fVar == u1.f.MIN) {
                    jMin = Math.min(lValueOf.longValue(), jLongValue);
                } else if (fVar == u1.f.MAX) {
                    jMin = Math.max(lValueOf.longValue(), jLongValue);
                }
                lValueOf = Long.valueOf(jMin);
            }
        }
        if (lValueOf == null) {
            return null;
        }
        return (T) a(lValueOf, Long.class);
    }

    @Override // com.medallia.digital.mobilesdk.e8
    public T a(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        u1.f fVar;
        super.a(arrayList, arrayList2, arrayList3);
        if (this.i == null || (fVar = this.h) == null) {
            return null;
        }
        if (fVar == u1.f.OR || fVar == u1.f.AND) {
            return b(arrayList, arrayList2, arrayList3);
        }
        if (fVar == u1.f.MIN || fVar == u1.f.MAX) {
            return c(arrayList, arrayList2, arrayList3);
        }
        return null;
    }

    public u1.f b() {
        return this.h;
    }

    @Override // com.medallia.digital.mobilesdk.e8, com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"conjunction\":");
            u1.f fVar = this.h;
            sb.append(l3.c(fVar != null ? fVar.toString() : null));
            sb.append(",\"childrenCriteria\":");
            sb.append(ModelFactory.getInstance().getContractsAsJsonString(this.i));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    private T b(ArrayList<c0> arrayList, ArrayList<c0> arrayList2, ArrayList<g6> arrayList3) {
        Boolean bool;
        if (this.i.isEmpty()) {
            bool = Boolean.TRUE;
        } else {
            Iterator<e8<T>> it = this.i.iterator();
            while (true) {
                if (it.hasNext()) {
                    boolean zBooleanValue = ((Boolean) it.next().a(arrayList, arrayList2, arrayList3)).booleanValue();
                    u1.f fVar = this.h;
                    if (fVar != u1.f.OR) {
                        if (fVar == u1.f.AND && !zBooleanValue) {
                            break;
                        }
                    } else if (zBooleanValue) {
                        break;
                    }
                } else {
                    u1.f fVar2 = this.h;
                    if (fVar2 != u1.f.OR) {
                        if (fVar2 != u1.f.AND) {
                            return null;
                        }
                    }
                }
            }
            bool = Boolean.FALSE;
        }
        return (T) a(bool, Boolean.class);
    }

    public ArrayList<e8<T>> a() {
        return this.i;
    }
}
