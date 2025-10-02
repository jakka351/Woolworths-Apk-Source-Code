package com.medallia.digital.mobilesdk;

import androidx.annotation.NonNull;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONException;

/* loaded from: classes.dex */
class s2 {

    /* renamed from: a, reason: collision with root package name */
    protected Queue<j2> f16693a = new LinkedList();
    protected Queue<j2> b = new LinkedList();
    protected n2 c;
    private boolean d;

    public class a implements n2 {
        public a() {
        }

        @Override // com.medallia.digital.mobilesdk.n2
        public void a(j2 j2Var) throws JSONException {
            s2.this.b(j2Var != null ? j2Var.getFormId() : null);
            n2 n2Var = s2.this.c;
            if (n2Var != null) {
                n2Var.a(j2Var);
            }
            s2 s2Var = s2.this;
            s2Var.a(s2Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        Queue<j2> queue;
        if (!this.b.isEmpty() && ((this.b.element().getFormId() != null && this.b.element().getFormId().equals(str)) || this.f16693a.isEmpty())) {
            queue = this.b;
        } else if (this.f16693a.isEmpty()) {
            return;
        } else {
            queue = this.f16693a;
        }
        queue.remove();
    }

    public j2 a() {
        Queue<j2> queue;
        if (!this.b.isEmpty()) {
            queue = this.b;
        } else {
            if (this.f16693a.isEmpty()) {
                return null;
            }
            queue = this.f16693a;
        }
        return queue.element();
    }

    public boolean b() {
        return this.d;
    }

    private List<j2> a(Map<String, List<j2>> map, String str) {
        List<j2> list = map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        map.put(str, arrayList);
        return arrayList;
    }

    public boolean b(j2 j2Var) throws JSONException {
        if (j2Var == null || b() || !this.f16693a.contains(j2Var)) {
            return false;
        }
        j2 j2VarElement = this.f16693a.element();
        if (j2VarElement == null || j2VarElement.getFormId().equals(j2Var.getFormId())) {
            return true;
        }
        this.f16693a.remove(j2Var);
        this.b.add(j2Var);
        a4.b("Promoting form " + j2Var.getFormId());
        if (!this.f16693a.isEmpty()) {
            return true;
        }
        a(a());
        return true;
    }

    public void a(j2 j2Var) throws JSONException {
        if (j2Var != null) {
            new l2(j2Var, new a()).a();
            return;
        }
        a4.b("LoadForms - finished updating forms");
        AnalyticsBridge.getInstance().setFormResourcesReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
    }

    private void a(String str) throws JSONException {
        Boolean boolB = g2.b(str);
        if (boolB != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(str, boolB.booleanValue());
        }
    }

    public void a(HashMap<String, p7> map) throws JSONException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (p7 p7Var : map.values()) {
            a4.b("Deleted unused Template: " + p7Var.a());
            f1.a().a(p7Var);
            a(p7Var.a());
        }
    }

    public void a(HashMap<String, p7> map, j2 j2Var) {
        p7 p7Var;
        if (map == null || j2Var == null || j2Var.h() == null || (p7Var = map.get(j2Var.h())) == null || p7Var.b() == null || !p7Var.b().equals(j2Var.h())) {
            return;
        }
        map.remove(p7Var.b());
    }

    private void a(LinkedHashMap<String, j2> linkedHashMap) throws JSONException {
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.FormData, new Object[0]);
        if (arrayListC != null) {
            Iterator<? extends b0> it = arrayListC.iterator();
            while (it.hasNext()) {
                j2 j2Var = (j2) it.next();
                if (linkedHashMap.get(j2Var.getFormId()) == null) {
                    f1.a().a(j2Var);
                    a4.b("Cleaned unused forms");
                    List<ResourceContract> listF = j2Var.f();
                    if (listF != null) {
                        for (ResourceContract resourceContract : listF) {
                            f1.a().a(resourceContract);
                            a(resourceContract.getLocalUrl());
                            a4.b("Cleaned non global resources");
                        }
                    }
                }
            }
        }
    }

    public void a(LinkedHashMap<String, j2> linkedHashMap, n2 n2Var) throws JSONException {
        if (linkedHashMap == null) {
            return;
        }
        this.c = n2Var;
        ArrayList<? extends b0> arrayListC = f1.a().c(b0.a.Template, new Object[0]);
        HashMap<String, p7> map = new HashMap<>();
        Iterator<? extends b0> it = arrayListC.iterator();
        while (it.hasNext()) {
            p7 p7Var = (p7) it.next();
            map.put(p7Var.b(), p7Var);
        }
        a(linkedHashMap);
        this.f16693a = new LinkedList();
        for (Map.Entry<String, j2> entry : linkedHashMap.entrySet()) {
            a(map, entry.getValue());
            this.f16693a.add(entry.getValue());
        }
        a(map);
        if (this.f16693a != null) {
            if (b()) {
                a(this.f16693a);
            } else {
                a(a());
            }
        }
    }

    private void a(List<j2> list, String str, j2.a aVar) {
        for (j2 j2Var : list) {
            j2Var.c(str);
            j2Var.a(aVar);
            f1.a().c(j2Var);
            n2 n2Var = this.c;
            if (n2Var != null) {
                n2Var.a(j2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, int i, Map map2, j2 j2Var) throws JSONException {
        n2 n2Var = this.c;
        if (n2Var != null) {
            n2Var.a(j2Var);
        }
        List<j2> list = (List) map.get(j2Var.h());
        if (list != null) {
            a(list, j2Var.g(), j2Var.c());
        }
        if (i == map2.size() - 1) {
            a4.b("LoadForms - finished updating forms");
            AnalyticsBridge.getInstance().setFormResourcesReady(true);
            AnalyticsBridge.getInstance().reportResourcesSizeEvent();
        }
    }

    private void a(@NonNull Queue<j2> queue) throws JSONException {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        for (j2 j2Var : queue) {
            if (map.containsKey(j2Var.h())) {
                a(map2, j2Var.h()).add(j2Var);
            } else {
                map.put(j2Var.h(), j2Var);
            }
        }
        Iterator it = map.values().iterator();
        final int i = 0;
        while (it.hasNext()) {
            new l2((j2) it.next(), new n2() { // from class: com.medallia.digital.mobilesdk.e9
                @Override // com.medallia.digital.mobilesdk.n2
                public final void a(j2 j2Var2) throws JSONException {
                    this.f16453a.a(map2, i, map, j2Var2);
                }
            }).a();
            i++;
        }
    }

    public void a(boolean z) {
        this.d = z;
    }
}
