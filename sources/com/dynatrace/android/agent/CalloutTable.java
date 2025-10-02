package com.dynatrace.android.agent;

import android.support.v4.media.session.a;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class CalloutTable {
    public static final String d;

    /* renamed from: a, reason: collision with root package name */
    public long f14064a;
    public long b;
    public ArrayList c;

    public class CTElement {

        /* renamed from: a, reason: collision with root package name */
        public final String f14065a;
        public long b;

        public CTElement(CustomSegment customSegment, long j) {
            this.f14065a = customSegment.k + customSegment.hashCode();
            this.b = j;
        }
    }

    static {
        boolean z = Global.f14077a;
        d = "dtxCalloutTable";
    }

    public final void a(DTXActionImpl dTXActionImpl) {
        if (dTXActionImpl == null) {
            return;
        }
        if (Global.f14077a) {
            Utility.h(d, String.format("Add segment %s (id=%d pid=%d) currTimeout=%s", dTXActionImpl.k + dTXActionImpl.hashCode(), Long.valueOf(dTXActionImpl.m), Long.valueOf(dTXActionImpl.d), Long.valueOf(this.b)));
        }
        synchronized (this.c) {
            try {
                long j = this.f14064a - this.b;
                for (int i = 0; i < this.c.size(); i++) {
                    if (((CTElement) this.c.get(i)).b >= j) {
                        ((CTElement) this.c.get(i)).b -= j;
                        this.c.add(i, new CTElement(dTXActionImpl, j));
                        return;
                    }
                    j -= ((CTElement) this.c.get(i)).b;
                }
                this.c.add(new CTElement(dTXActionImpl, j));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                if (this.c.size() > 0) {
                    return;
                }
                if (this.b == 0) {
                    this.b = this.f14064a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(long j) {
        synchronized (this.c) {
            try {
                if (j == this.f14064a) {
                    return;
                }
                this.f14064a = j;
                if (this.b > j) {
                    if (this.c.size() > 0) {
                        ((CTElement) this.c.get(0)).b += this.b - j;
                    }
                    this.b = j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.c) {
            this.c.clear();
            this.b = 0L;
        }
    }

    public final void e(CustomSegment customSegment) {
        if (customSegment == null) {
            return;
        }
        String str = customSegment.k + customSegment.hashCode();
        synchronized (this.c) {
            for (int i = 0; i < this.c.size(); i++) {
                try {
                    if (((CTElement) this.c.get(i)).f14065a.equals(str)) {
                        int i2 = i + 1;
                        if (i2 < this.c.size()) {
                            ((CTElement) this.c.get(i2)).b += ((CTElement) this.c.get(i)).b;
                        } else if (this.b == 0) {
                            this.b = ((CTElement) this.c.get(i)).b;
                        }
                        this.c.remove(i);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        String strL = a.l(this.b, ";", new StringBuilder());
        for (int i = 0; i < arrayList.size(); i++) {
            strL = a.l(((CTElement) arrayList.get(i)).b, ";", YU.a.s(strL));
        }
        return strL;
    }
}
