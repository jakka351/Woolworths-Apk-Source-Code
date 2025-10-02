package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.json.JSONException;

/* loaded from: classes.dex */
class m6 {
    private static final int d = 5;

    /* renamed from: a, reason: collision with root package name */
    protected b f16594a;
    private int b;
    private Queue<List<ResourceContract>> c;

    public class a implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResourceContract f16595a;
        final /* synthetic */ List b;

        public a(ResourceContract resourceContract, List list) {
            this.f16595a = resourceContract;
            this.b = list;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            m6.a(m6.this);
            a4.b(this.f16595a.getRemoteUrl() + " download failed");
            m6.this.f16594a.b(this.f16595a);
            m6.this.a((List<ResourceContract>) this.b);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) throws JSONException {
            m6.a(m6.this);
            if (file != null) {
                a4.b(this.f16595a.getRemoteUrl() + " download complete");
                m6.this.f16594a.a(this.f16595a);
                f1.a().c(this.f16595a);
            } else {
                a4.b(this.f16595a.getRemoteUrl() + " download failed");
                m6.this.f16594a.b(this.f16595a);
            }
            m6.this.a((List<ResourceContract>) this.b);
        }
    }

    public interface b {
        void a(ResourceContract resourceContract);

        void b(ResourceContract resourceContract);
    }

    public m6(List<ResourceContract> list, b bVar) {
        this(list, false, bVar);
    }

    public static /* synthetic */ int a(m6 m6Var) {
        int i = m6Var.b;
        m6Var.b = i - 1;
        return i;
    }

    private Queue<List<ResourceContract>> b(List<ResourceContract> list) {
        LinkedList linkedList = new LinkedList();
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 5;
            linkedList.add(new ArrayList(list.subList(i, Math.min(size, i2))));
            i = i2;
        }
        return linkedList;
    }

    public void c(List<ResourceContract> list) throws JSONException {
        if (list == null) {
            return;
        }
        this.b = list.size();
        for (ResourceContract resourceContract : list) {
            ResourceContract resourceContract2 = (ResourceContract) (resourceContract.getFormId() != null ? f1.a().b(b0.a.Resource, resourceContract.getRemoteUrl(), resourceContract.getFormId()) : f1.a().b(b0.a.Resource, resourceContract.getRemoteUrl()));
            if (resourceContract.equals(resourceContract2)) {
                a4.b(resourceContract2.getRemoteUrl() + " loaded from db");
                this.f16594a.a(resourceContract);
                this.b = this.b + (-1);
                a(list);
            } else {
                a(resourceContract2, resourceContract);
                a(resourceContract, list);
            }
        }
    }

    public m6(List<ResourceContract> list, boolean z, b bVar) throws JSONException {
        this.f16594a = bVar;
        if (list != null) {
            this.c = b(a(list, z));
            a();
        }
    }

    private List<ResourceContract> a(List<ResourceContract> list, boolean z) {
        if (list == null) {
            return null;
        }
        if (z) {
            Iterator<ResourceContract> it = list.iterator();
            while (it.hasNext()) {
                it.next().setGlobal(Boolean.TRUE);
            }
        }
        return list;
    }

    private void a() throws JSONException {
        Queue<List<ResourceContract>> queue = this.c;
        if (queue == null) {
            return;
        }
        c(queue.poll());
    }

    public void a(ResourceContract resourceContract, ResourceContract resourceContract2) throws JSONException {
        Boolean boolB;
        if (resourceContract == null || resourceContract2 == null) {
            return;
        }
        if ((resourceContract.getRemoteUrl().equals(resourceContract2.getRemoteUrl()) && resourceContract.getChecksum().equals(resourceContract2.getChecksum())) || (boolB = g2.b(resourceContract.getLocalUrl())) == null) {
            return;
        }
        AnalyticsBridge.getInstance().reportDeleteStorageEvent(resourceContract.getLocalUrl(), boolB.booleanValue());
    }

    private void a(ResourceContract resourceContract, List<ResourceContract> list) {
        s4.f().a(resourceContract.getRemoteUrl(), resourceContract.getLocalUrl(), new a(resourceContract, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<ResourceContract> list) throws JSONException {
        if (list == null || list.isEmpty() || this.b != 0) {
            return;
        }
        a();
    }
}
