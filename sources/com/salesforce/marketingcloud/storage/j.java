package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.storage.c;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.Locale;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class j extends b {
    private static final String B = "mcsdk_cache_%s";
    private static final String C = "ETStorage.version";
    private static final int D = 1;
    private d A;
    private final c o;
    private final SharedPreferences p;
    private final com.salesforce.marketingcloud.storage.db.l q;
    private final f r;
    private com.salesforce.marketingcloud.storage.db.a s;
    private com.salesforce.marketingcloud.storage.db.i t;
    private com.salesforce.marketingcloud.storage.db.j u;
    private com.salesforce.marketingcloud.storage.db.k v;
    private com.salesforce.marketingcloud.storage.db.h w;
    private com.salesforce.marketingcloud.storage.db.g x;
    private com.salesforce.marketingcloud.storage.db.f y;
    private com.salesforce.marketingcloud.storage.db.m z;

    public j(@NonNull Context context, com.salesforce.marketingcloud.util.c cVar, @NonNull String str, @NonNull String str2, @NonNull com.salesforce.marketingcloud.internal.l lVar) {
        super(context, cVar, str, str2);
        com.salesforce.marketingcloud.storage.db.l lVar2 = new com.salesforce.marketingcloud.storage.db.l(context, cVar, this.h);
        this.q = lVar2;
        lVar2.getWritableDatabase();
        c.a aVar = new c.a(context, cVar, this.h);
        this.o = aVar;
        SharedPreferences sharedPreferences = context.getSharedPreferences(b.a(this.h), 0);
        this.p = sharedPreferences;
        this.r = new f(context, sharedPreferences, str, lVar);
        if (lVar2.a()) {
            aVar.a();
            sharedPreferences.edit().clear().apply();
        }
    }

    private void d(com.salesforce.marketingcloud.util.c cVar) throws Exception {
        this.p.edit().putString("create_date", cVar.a(String.valueOf(System.currentTimeMillis()))).apply();
    }

    private void l() throws Exception {
        File fileK = k();
        if (fileK.exists() && fileK.isDirectory()) {
            com.salesforce.marketingcloud.util.g.a(fileK);
        }
        w();
        this.q.b();
    }

    private void w() throws Exception {
        c().a();
        f().edit().clear().apply();
        d(this.j);
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public void a(Context context, int i, int i2) {
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public com.salesforce.marketingcloud.util.c b() {
        return this.j;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public c c() {
        return this.o;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public SQLiteOpenHelper e() {
        return this.q;
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public SharedPreferences f() {
        return this.p;
    }

    public File k() {
        File cacheDir = this.i.getCacheDir();
        Locale locale = Locale.ENGLISH;
        return new File(cacheDir, YU.a.A("mcsdk_cache_", this.h));
    }

    public a m() {
        if (this.s == null) {
            this.s = new com.salesforce.marketingcloud.storage.db.a(this.q.getWritableDatabase());
        }
        return this.s;
    }

    public d n() {
        if (this.A == null) {
            this.A = new com.salesforce.marketingcloud.storage.db.e(this.q.getWritableDatabase());
        }
        return this.A;
    }

    public f o() {
        return this.r;
    }

    public g p() {
        if (this.y == null) {
            this.y = new com.salesforce.marketingcloud.storage.db.f(this.q.getWritableDatabase());
        }
        return this.y;
    }

    public h q() {
        if (this.x == null) {
            this.x = new com.salesforce.marketingcloud.storage.db.g(this.q.getWritableDatabase());
        }
        return this.x;
    }

    public i r() {
        if (this.w == null) {
            this.w = new com.salesforce.marketingcloud.storage.db.h(this.q.getWritableDatabase());
        }
        return this.w;
    }

    public k s() {
        if (this.t == null) {
            this.t = new com.salesforce.marketingcloud.storage.db.i(this.q.getWritableDatabase());
        }
        return this.t;
    }

    public l t() {
        if (this.u == null) {
            this.u = new com.salesforce.marketingcloud.storage.db.j(this.q.getWritableDatabase());
        }
        return this.u;
    }

    public m u() {
        if (this.v == null) {
            this.v = new com.salesforce.marketingcloud.storage.db.k(this.q.getWritableDatabase());
        }
        return this.v;
    }

    public n v() {
        if (this.z == null) {
            this.z = new com.salesforce.marketingcloud.storage.db.m(this.q.getWritableDatabase());
        }
        return this.z;
    }

    public final void x() {
        this.q.close();
    }

    @Override // com.salesforce.marketingcloud.storage.e
    public final Context a() {
        return this.i;
    }

    public final void a(InitializationStatus.a aVar) {
        if (!a(this.p)) {
            boolean zContains = this.p.contains("create_date");
            aVar.a(zContains);
            if (zContains) {
                try {
                    l();
                } catch (Exception e) {
                    aVar.a(e);
                    aVar.f(true);
                    com.salesforce.marketingcloud.g.b(e.c, e, "Failed to recover from encryption change.", new Object[0]);
                    return;
                }
            }
        }
        try {
            try {
                this.q.c();
            } catch (com.salesforce.marketingcloud.storage.exceptions.a unused) {
                w();
            } catch (IllegalStateException e2) {
                aVar.a(e2);
                aVar.f(true);
                com.salesforce.marketingcloud.g.b(e.c, e2, "Could not create the necessary database table(s).", new Object[0]);
                return;
            }
            int i = this.p.getInt(C, -1);
            if (i == 0 || i == 1) {
                return;
            }
            Context context = this.i;
            if (1 < i) {
                a(context, i, 1);
            } else {
                b(context, i, 1);
            }
            this.p.edit().putInt(C, 1).apply();
        } catch (Exception e3) {
            aVar.a(e3);
            aVar.f(true);
            com.salesforce.marketingcloud.g.b(e.c, e3, "Failed to recover from data reset.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.storage.b
    public boolean a(SharedPreferences sharedPreferences) {
        String string = sharedPreferences.getString("create_date", null);
        if (string != null) {
            try {
                this.j.b(string);
                return true;
            } catch (UnsupportedEncodingException | GeneralSecurityException e) {
                com.salesforce.marketingcloud.g.b(e.c, e, "Failed to verify existing encryption key", new Object[0]);
            }
        }
        return false;
    }
}
