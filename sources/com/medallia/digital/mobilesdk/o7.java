package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class o7 {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<c0> f16627a = new ArrayList<>();
    private ArrayList<c0> b = new ArrayList<>();
    private ArrayList<g6> c = new ArrayList<>();

    public HashMap<u1.c, List<EvaluationResult>> a(l7 l7Var) {
        HashMap<u1.c, List<EvaluationResult>> map = new HashMap<>();
        a4.b("BG Trigger rules evaluation started");
        ArrayList<v1<Boolean>> arrayListC = l7Var.c();
        u1.d dVar = u1.d.BACKGROUND;
        List<EvaluationResult> listA = a(arrayListC, dVar);
        a4.b("BG Trigger rules evaluation ended");
        if (listA != null && !listA.isEmpty()) {
            map.put(u1.c.TRIGGER_RULES, listA);
        }
        a4.b("BG Next evaluation time started");
        EvaluationResult evaluationResultB = b(l7Var.b(), dVar);
        a4.b("BG Next evaluation time ended");
        if (evaluationResultB != null && evaluationResultB.getNextEvaluationTime() != null && evaluationResultB.getNextEvaluationTime().longValue() > 0) {
            map.put(u1.c.NEXT_EVALUATION, Collections.singletonList(evaluationResultB));
        }
        return map;
    }

    public EvaluationResult b(l7 l7Var) {
        a4.b("FG Pre evaluation checks started");
        boolean zC = c(l7Var);
        a4.b("FG Pre evaluation checks ended");
        if (!zC) {
            a4.b("FG Pre evaluation returned false");
            return new EvaluationResult(null, null, null);
        }
        a4.b("FG Trigger rules evaluation started");
        ArrayList<v1<Boolean>> arrayListF = l7Var.f();
        u1.d dVar = u1.d.FOREGROUND;
        List<EvaluationResult> listA = a(arrayListF, dVar);
        a4.b("FG Trigger rules evaluation ended");
        if (listA != null) {
            return !listA.isEmpty() ? listA.get(0) : new EvaluationResult(null, null, null);
        }
        a4.b("FG Next evaluation time started");
        EvaluationResult evaluationResultB = b(l7Var.d(), dVar);
        a4.b("FG Next evaluation time ended");
        return evaluationResultB != null ? evaluationResultB : new EvaluationResult(null, null, null);
    }

    public boolean c(l7 l7Var) {
        f8<Boolean> f8VarE = l7Var.e();
        if (f8VarE == null) {
            return true;
        }
        Boolean boolA = f8VarE.a(this.b, this.f16627a, this.c);
        if (boolA == null) {
            return false;
        }
        return boolA.booleanValue();
    }

    public List<EvaluationResult> a(ArrayList<v1<Boolean>> arrayList, u1.d dVar) {
        if (arrayList == null || arrayList.isEmpty()) {
            a4.b("Triggers is null or empty");
            return new ArrayList();
        }
        a4.b("Triggers: " + arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<v1<Boolean>> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (u1.d.BACKGROUND.equals(dVar)) {
                    break;
                }
                return null;
            }
            v1<Boolean> next = it.next();
            if (next.b().a(this.b, this.f16627a, this.c).booleanValue()) {
                arrayList2.add(new EvaluationResult(next.a(), null, next.c()));
                if (u1.d.FOREGROUND.equals(dVar)) {
                    break;
                }
            }
        }
        return arrayList2;
    }

    public EvaluationResult b(ArrayList<v1<Long>> arrayList, u1.d dVar) {
        boolean zBooleanValue;
        Long lA;
        if (arrayList == null || arrayList.isEmpty()) {
            return new EvaluationResult(null, null, null);
        }
        Iterator<v1<Long>> it = arrayList.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            v1<Long> next = it.next();
            u1.d dVar2 = u1.d.BACKGROUND;
            if (!dVar2.equals(dVar) || next == null || next.d() == null) {
                zBooleanValue = true;
            } else {
                zBooleanValue = next.d().a(this.b, this.f16627a, this.c).booleanValue();
                a4.b("BE evaluation shouldEvalute: " + zBooleanValue);
            }
            if (zBooleanValue && (lA = next.b().a(this.b, this.f16627a, this.c)) != null) {
                if (u1.d.FOREGROUND.equals(dVar)) {
                    return new EvaluationResult(null, lA, null);
                }
                if (lA.longValue() > 0) {
                    if (jLongValue == 0) {
                        jLongValue = lA.longValue();
                    }
                    if (lA.longValue() < jLongValue) {
                        jLongValue = lA.longValue();
                    }
                }
            }
            if (dVar2.equals(dVar)) {
                return new EvaluationResult(null, Long.valueOf(jLongValue), null);
            }
        }
        return null;
    }

    public void a() {
        t8.g().b(CollectorsInfrastructure.getInstance().timeInForegroundCollector.o());
        t8.g().b(CollectorsInfrastructure.getInstance().timeInCurrentForegroundCollector.o());
        this.f16627a = t8.g().e();
        this.b = t8.g().f();
        this.c = f1.a().c(b0.a.QuarantineRule, new Object[0]);
    }
}
