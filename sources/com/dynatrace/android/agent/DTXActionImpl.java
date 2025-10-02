package com.dynatrace.android.agent;

import YU.a;
import com.apollographql.apollo.exception.ApolloException;
import com.dynatrace.android.agent.crash.JavaStacktraceProcessor;
import com.dynatrace.android.agent.crash.StacktraceData;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class DTXActionImpl extends CustomSegment implements DTXAction {
    public static final String u;
    public static final ConcurrentHashMap v;
    public int p;
    public final Vector q;
    public final DTXActionImpl r;
    public final boolean s;
    public final int t;

    static {
        boolean z = Global.f14077a;
        u = "dtxDTXActionImpl";
        v = new ConcurrentHashMap();
    }

    public DTXActionImpl(String str, EventType eventType, long j, Session session, int i, boolean z, DTXActionImpl dTXActionImpl) {
        super(str, 5, eventType, j, session, i, z);
        this.p = -1;
        this.q = new Vector();
        this.t = 0;
        this.r = dTXActionImpl;
        this.s = z;
        boolean z2 = Global.f14077a;
        String str2 = u;
        if (z2) {
            Utility.h(str2, "New action " + str);
        }
        String str3 = this.k;
        if (str3 == null || str3.isEmpty()) {
            if (Global.f14077a) {
                Utility.h(str2, "The action name is null or empty hence this action will be deactivated");
            }
            this.f = false;
            this.e = true;
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public void a() {
        q(true);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void b(String str) {
        m(str, new String[0], 4);
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void c(String str, ApolloException apolloException) {
        if (str != null && p()) {
            RumEventDispatcher rumEventDispatcher = Core.s;
            if (rumEventDispatcher != null && this.h.k) {
                rumEventDispatcher.b();
            }
            AdkSettings.l.f.getClass();
            StacktraceData stacktraceDataA = new JavaStacktraceProcessor(apolloException, Integer.MAX_VALUE).a();
            m(str, new String[]{stacktraceDataA.a(), stacktraceDataA.b(), stacktraceDataA.c(), stacktraceDataA.d().a()}, 10);
        }
    }

    @Override // com.dynatrace.android.agent.DTXAction
    public final void d(String str, String str2) {
        m(str, new String[]{str2}, 8);
    }

    @Override // com.dynatrace.android.agent.CustomSegment
    public StringBuilder f() {
        StringBuilder sbS = a.s("et=");
        sbS.append(this.j.d);
        sbS.append("&na=");
        sbS.append(Utility.f(this.k));
        sbS.append("&it=");
        sbS.append(Thread.currentThread().getId());
        sbS.append("&ca=");
        sbS.append(this.m);
        sbS.append("&pa=");
        sbS.append(this.d);
        sbS.append("&s0=");
        sbS.append(this.g);
        sbS.append("&t0=");
        sbS.append(this.b);
        sbS.append("&s1=");
        sbS.append(this.p);
        sbS.append("&t1=");
        sbS.append(this.c - this.b);
        sbS.append("&fw=");
        sbS.append(this.s ? "1" : "0");
        return sbS;
    }

    public final void l(CustomSegment customSegment) {
        if (customSegment.f) {
            this.q.add(customSegment);
            s(customSegment);
        }
    }

    public final void m(String str, String[] strArr, int i) {
        CustomSegment customSegmentA;
        if (p() && (customSegmentA = Core.a(str, i, this.m, null, this.h, this.i, strArr)) != null) {
            l(customSegmentA);
        }
    }

    public final Vector n() {
        Vector vector;
        synchronized (this.q) {
            vector = new Vector(this.q);
        }
        return vector;
    }

    public WebReqTag o() {
        Session session = this.h;
        if (p() && session.i.a(EventType.p)) {
            return new WebReqTag(this.m, this.i, session);
        }
        return null;
    }

    public boolean p() {
        if (this.e) {
            return false;
        }
        if (this.t < 10) {
            return Dynatrace.a();
        }
        if (Global.f14077a) {
            Utility.l(u, "Maximum depth of actions reached (10). Discarding creation of '" + this.k + "'");
        }
        return false;
    }

    public void q(boolean z) {
        DTXActionImpl dTXActionImpl;
        if (this.e) {
            if (Global.f14077a) {
                Utility.h(u, "Action " + this.k + " is already closed");
                return;
            }
            return;
        }
        if (Global.f14077a) {
            Utility.h(u, "Action " + this.k + " closing ... saving=" + z);
        }
        ((Vector) ActionThreadLocal.b.get()).remove(this);
        ActionThreadLocal.a();
        boolean zP = p();
        if (zP) {
            this.c = this.h.d();
            String str = u;
            Vector vector = AdkSettings.l.f != null ? null : (Vector) v.remove(Long.valueOf(Thread.currentThread().getId()));
            if (vector != null) {
                Iterator it = vector.iterator();
                while (it.hasNext()) {
                    CustomSegment customSegment = (CustomSegment) it.next();
                    long j = customSegment.b;
                    long j2 = customSegment.m;
                    if (j > this.b && j < this.c) {
                        if (Global.f14077a) {
                            Utility.h(str, this.k + " adopting " + customSegment.k + " tagId=" + j2);
                        }
                        customSegment.d = this.m;
                        l(customSegment);
                    } else if (Global.f14077a) {
                        Utility.h(str, this.k + " not adopting " + customSegment.k + " tagId=" + j2);
                    }
                }
            }
            r(z);
            this.p = Utility.b.getAndIncrement();
            if (z) {
                dTXActionImpl = this;
                Core.a(this.k, 2, this.d, dTXActionImpl, this.h, this.i, new String[0]);
            } else {
                dTXActionImpl = this;
                j();
                Core.j.e(this);
            }
        } else {
            dTXActionImpl = this;
            r(false);
            j();
            Core.j.e(this);
        }
        DTXActionImpl dTXActionImpl2 = dTXActionImpl.r;
        if (dTXActionImpl2 != null && (dTXActionImpl2 instanceof DTXAutoAction)) {
            DTXAutoAction dTXAutoAction = (DTXAutoAction) dTXActionImpl2;
            if (dTXAutoAction.n().contains(this)) {
                if (Global.f14077a) {
                    Utility.h(DTXAutoAction.F, a.j("onUA: child ", dTXActionImpl.k, " of ", dTXAutoAction.k, " done"));
                }
                dTXAutoAction.y();
                dTXAutoAction.y--;
            }
        }
        if (Global.f14077a) {
            String str2 = u;
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Action ", dTXActionImpl.k, " closed: shouldSave=", " rc=", z);
            sbQ.append(zP);
            Utility.h(str2, sbQ.toString());
            if (zP) {
                return;
            }
            Utility.l(str2, String.format("Discard %s tagId=%d capture state=%b", dTXActionImpl.k, Long.valueOf(dTXActionImpl.m), Boolean.valueOf(zP)));
        }
    }

    public final void r(boolean z) {
        Vector vector = this.q;
        if (vector == null) {
            return;
        }
        synchronized (vector) {
            try {
                for (int size = this.q.size() - 1; size >= 0; size--) {
                    CustomSegment customSegment = (CustomSegment) this.q.get(size);
                    if (customSegment.i() == 5) {
                        ((DTXActionImpl) customSegment).q(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void s(CustomSegment customSegment) {
    }
}
