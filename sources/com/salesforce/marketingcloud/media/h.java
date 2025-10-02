package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.media.s;
import com.salesforce.marketingcloud.media.u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

@SuppressLint
@VisibleForTesting
/* loaded from: classes6.dex */
public class h {
    static final int h = 1;
    static final int i = 2;
    static final int j = 3;
    static final int k = 4;
    static final int l = 5;
    static final int m = 6;
    private static final String n = com.salesforce.marketingcloud.g.a("Dispatcher");

    /* renamed from: a, reason: collision with root package name */
    final Map<String, n> f16964a;
    final b b;
    final Context c;
    final ExecutorService d;
    final Handler e;
    final Handler f;
    final c g;

    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final h f16965a;

        public a(Looper looper, h hVar) {
            super(looper);
            this.f16965a = hVar;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    this.f16965a.d((com.salesforce.marketingcloud.media.a) message.obj);
                    break;
                case 2:
                    this.f16965a.d((n) message.obj);
                    break;
                case 3:
                    this.f16965a.e((n) message.obj);
                    break;
                case 4:
                    this.f16965a.b((d) message.obj);
                    break;
                case 5:
                    this.f16965a.b((e) message.obj);
                    break;
                case 6:
                    this.f16965a.c((com.salesforce.marketingcloud.media.a) message.obj);
                    break;
            }
        }
    }

    public static class b extends HandlerThread {
        public b() {
            super("mcsdk_image_thread", 10);
        }
    }

    public h(Context context, ExecutorService executorService, Handler handler, c cVar) {
        b bVar = new b();
        this.b = bVar;
        bVar.start();
        this.c = context;
        this.d = executorService;
        this.f16964a = new LinkedHashMap();
        this.e = new a(bVar.getLooper(), this);
        this.f = handler;
        this.g = cVar;
    }

    private void a(n nVar) {
        if (nVar.j()) {
            return;
        }
        u.b bVarI = nVar.i();
        if (bVarI != null && bVarI.d()) {
            bVarI.a().prepareToDraw();
        }
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(2, nVar));
    }

    public void b(n nVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(2, nVar));
    }

    public void c(n nVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(3, nVar));
    }

    public void d(n nVar) {
        if (s.b.b(nVar.f.d)) {
            u.b bVar = nVar.i;
            if (bVar.d()) {
                this.g.a(nVar.h(), bVar.a());
            }
        }
        this.f16964a.remove(nVar.h());
        a(nVar);
    }

    public void e(n nVar) {
        this.f16964a.remove(nVar.h());
        a(nVar);
    }

    public void a(d dVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(4, dVar));
    }

    public void b(com.salesforce.marketingcloud.media.a aVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(1, aVar));
    }

    public void c(com.salesforce.marketingcloud.media.a aVar) {
        String strC = aVar.c();
        n nVar = this.f16964a.get(strC);
        if (nVar != null) {
            nVar.b(aVar);
            if (nVar.a()) {
                this.f16964a.remove(strC);
            }
        }
    }

    public void d(com.salesforce.marketingcloud.media.a aVar) {
        n nVar = this.f16964a.get(aVar.c());
        if (nVar != null) {
            nVar.a(aVar);
        } else {
            if (this.d.isShutdown()) {
                com.salesforce.marketingcloud.g.a(n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
                return;
            }
            n nVarA = n.a(aVar.b(), this, this.g, aVar);
            nVarA.j = this.d.submit(nVarA);
            this.f16964a.put(aVar.c(), nVarA);
        }
    }

    public void a(com.salesforce.marketingcloud.media.a aVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(6, aVar));
    }

    public void b(d dVar) {
        if (this.d.isShutdown()) {
            com.salesforce.marketingcloud.g.a(n, "ExecutorService is shutdown.  Ignoring request.", new Object[0]);
        } else {
            this.d.submit(new e(this, dVar));
        }
    }

    public void a(e eVar) {
        Handler handler = this.e;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }

    public void b(e eVar) {
        Handler handler = this.f;
        handler.sendMessage(handler.obtainMessage(5, eVar));
    }
}
