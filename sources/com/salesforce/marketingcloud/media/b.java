package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.media.s;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint
/* loaded from: classes6.dex */
public class b implements f {
    private static final String g = com.salesforce.marketingcloud.g.a("BatchRequestHandler");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f16957a;
    private final o b;
    private final List<String> c;
    private a d;
    private boolean e;
    private boolean f;

    public interface a {
        void a(boolean z);
    }

    public b(o oVar, List<String> list) {
        this.b = oVar;
        this.c = list;
        this.f16957a = new AtomicInteger(list.size());
    }

    private void c() {
        a aVar;
        if (this.f16957a.decrementAndGet() > 0 || (aVar = this.d) == null || this.e) {
            return;
        }
        aVar.a(!this.f);
    }

    public void a(a aVar) {
        this.d = aVar;
        if (this.f16957a.get() == 0) {
            if (aVar != null) {
                aVar.a(true);
            }
        } else {
            Iterator<String> it = this.c.iterator();
            while (it.hasNext()) {
                this.b.b(it.next()).a(s.b.NO_MEMORY_CACHE, s.b.NO_MEMORY_STORE).a(this);
            }
        }
    }

    public void b() {
        this.e = true;
    }

    @Override // com.salesforce.marketingcloud.media.f
    public void a(Exception exc) {
        if (exc instanceof k) {
            com.salesforce.marketingcloud.g.b(g, exc, "Failed to pre-fetch image, but will be ignored since the url cannot be handled.", new Object[0]);
        } else {
            this.f = true;
            com.salesforce.marketingcloud.g.b(g, exc, "Failed to pre-fetch image.", new Object[0]);
        }
        c();
    }

    @Override // com.salesforce.marketingcloud.media.f
    public void a() {
        c();
    }
}
