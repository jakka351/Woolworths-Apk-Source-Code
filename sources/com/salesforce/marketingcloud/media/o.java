package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.media.u;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@SuppressLint
/* loaded from: classes6.dex */
public class o {
    static final Handler i = new a(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    final Context f16973a;
    final h b;
    final com.salesforce.marketingcloud.media.c c;
    final r d;
    final Map<ImageView, g> e;
    final Map<Object, com.salesforce.marketingcloud.media.a> f;
    private final List<u> g;
    public ReferenceQueue h;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 2) {
                n nVar = (n) message.obj;
                nVar.f16971a.a(nVar);
            } else {
                if (i != 5) {
                    return;
                }
                e eVar = (e) message.obj;
                eVar.f16962a.a(eVar);
            }
        }
    }

    public enum b {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);


        /* renamed from: a, reason: collision with root package name */
        final int f16974a;

        b(int i) {
            this.f16974a = i;
        }
    }

    public enum c {
        NORMAL,
        HIGH
    }

    public o(Context context, h hVar, com.salesforce.marketingcloud.media.c cVar, r rVar) {
        this.f16973a = context;
        this.b = hVar;
        this.c = cVar;
        this.d = rVar;
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new q(rVar));
        arrayList.add(new i(context));
        this.g = Collections.unmodifiableList(arrayList);
        this.f = new WeakHashMap();
        this.e = new WeakHashMap();
    }

    @NonNull
    public com.salesforce.marketingcloud.media.b a(@NonNull List<String> list) {
        return new com.salesforce.marketingcloud.media.b(this, new ArrayList(list));
    }

    @NonNull
    public t b(@Nullable String str) {
        return new t(this, Uri.parse(str));
    }

    public void a(Object obj) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            com.salesforce.marketingcloud.media.a aVarRemove = this.f.remove(obj);
            if (aVarRemove != null) {
                aVarRemove.a();
                this.b.a(aVarRemove);
            }
            if (obj instanceof ImageView) {
                g gVarRemove = this.e.remove((ImageView) obj);
                if (gVarRemove != null) {
                    gVarRemove.a();
                }
            }
        }
    }

    @VisibleForTesting
    public Bitmap a(String str) {
        return this.c.a(str);
    }

    public void a(e eVar) {
        f fVarB = eVar.b.b();
        if (fVarB != null) {
            if (eVar.b()) {
                fVarB.a(eVar.a());
            } else {
                fVarB.a();
            }
        }
    }

    @VisibleForTesting
    public void a(n nVar) {
        com.salesforce.marketingcloud.media.a aVarC = nVar.c();
        List<com.salesforce.marketingcloud.media.a> listD = nVar.d();
        boolean z = (listD == null || listD.isEmpty()) ? false : true;
        if (aVarC != null || z) {
            Exception excF = nVar.f();
            u.b bVarI = nVar.i();
            if (aVarC != null) {
                a(aVarC, bVarI, excF);
            }
            if (z) {
                int size = listD.size();
                for (int i2 = 0; i2 < size; i2++) {
                    a(listD.get(i2), bVarI, excF);
                }
            }
        }
    }

    @NonNull
    public static o a(Context context, com.salesforce.marketingcloud.storage.j jVar) {
        com.salesforce.marketingcloud.media.c cVar = new com.salesforce.marketingcloud.media.c(context);
        return new o(context, new h(context, new m(), i, cVar), cVar, new r(jVar.k()));
    }

    @VisibleForTesting
    public void a(ImageView imageView, g gVar) {
        if (this.e.containsKey(imageView)) {
            a(imageView);
        }
        this.e.put(imageView, gVar);
    }

    private void a(com.salesforce.marketingcloud.media.a aVar, u.b bVar, Exception exc) {
        if (aVar.g()) {
            return;
        }
        this.f.remove(aVar.f());
        if (bVar != null) {
            aVar.a(bVar);
        } else {
            aVar.a(exc);
        }
    }

    public List<u> a() {
        return this.g;
    }

    public void a(Collection<String> collection) {
        a(collection, (f) null);
    }

    @VisibleForTesting
    public void a(Collection<String> collection, f fVar) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        this.b.a(new d(this, new ArrayList(collection), this.d, fVar));
    }

    @VisibleForTesting
    public void a(com.salesforce.marketingcloud.media.a aVar) {
        Object objF = aVar.f();
        if (objF != null && this.f.get(objF) != aVar) {
            a(objF);
            this.f.put(objF, aVar);
        }
        this.b.b(aVar);
    }
}
