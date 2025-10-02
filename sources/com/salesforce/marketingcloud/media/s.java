package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.ColorInt;
import androidx.annotation.Px;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.media.o;

@SuppressLint
/* loaded from: classes6.dex */
public class s {
    static final char m = '\n';

    /* renamed from: a, reason: collision with root package name */
    public final Uri f16978a;
    public final String b = a();
    public final o.c c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final float i;
    public final float j;
    public final int k;
    public long l;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        Uri f16979a;
        o.c b;
        int c;
        int d;
        int e;
        boolean f;
        boolean g;
        float h;
        float i;
        int j;

        public a(Uri uri) {
            this.f16979a = uri;
        }

        public s a() {
            if (this.b == null) {
                this.b = o.c.NORMAL;
            }
            return new s(this);
        }

        public a b() {
            this.f = true;
            return this;
        }

        public a c() {
            this.g = true;
            return this;
        }

        public boolean d() {
            return this.b != null;
        }

        public a a(float f, float f2, @ColorInt int i) {
            this.h = f;
            this.i = f2;
            this.j = i;
            return this;
        }

        public a a(@Px int i, @Px int i2) {
            this.d = i;
            this.e = i2;
            return this;
        }

        public a a(o.c cVar) {
            this.b = cVar;
            return this;
        }

        public a a(b bVar, b... bVarArr) {
            if (bVar != null) {
                this.c = bVar.f16980a | this.c;
                if (bVarArr != null) {
                    for (b bVar2 : bVarArr) {
                        this.c = bVar2.f16980a | this.c;
                    }
                }
            }
            return this;
        }
    }

    public enum b {
        NO_MEMORY_CACHE(1),
        NO_MEMORY_STORE(2),
        NO_DISK_STORE(4);


        /* renamed from: a, reason: collision with root package name */
        int f16980a;

        b(int i) {
            this.f16980a = i;
        }

        public static boolean b(int i) {
            return (i & NO_MEMORY_STORE.f16980a) == 0;
        }

        public static boolean c(int i) {
            return (i & NO_DISK_STORE.f16980a) == 0;
        }

        public static boolean a(int i) {
            return (i & NO_MEMORY_CACHE.f16980a) == 0;
        }

        public int b() {
            return this.f16980a;
        }
    }

    public s(a aVar) {
        this.f16978a = aVar.f16979a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
    }

    private String a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16978a.toString());
        sb.append(m);
        if (d()) {
            sb.append("resize:");
            sb.append(this.e);
            sb.append('x');
            sb.append(this.f);
            sb.append(m);
        }
        if (this.g) {
            sb.append("centerCrop\n");
        }
        if (this.h) {
            sb.append("centerInside\n");
        }
        if (c()) {
            sb.append("radius:");
            sb.append(this.i);
            sb.append(",border:");
            sb.append(this.j);
            sb.append(",color:");
            sb.append(this.k);
        }
        return sb.toString();
    }

    public String b() {
        return String.valueOf(this.f16978a.getPath());
    }

    public boolean c() {
        return (this.i == BitmapDescriptorFactory.HUE_RED && this.j == BitmapDescriptorFactory.HUE_RED) ? false : true;
    }

    public boolean d() {
        return (this.e == 0 && this.f == 0) ? false : true;
    }

    public boolean e() {
        return d() || c();
    }
}
