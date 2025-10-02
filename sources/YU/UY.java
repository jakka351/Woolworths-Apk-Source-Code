package YU;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.widget.EditText;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class UY {
    public static int h = 9673;
    public static String i = CircleProgressBar.a("_dvcHM\f_M\u0001Gzr\u0004vFRM\u0018SOI]\u0001\u0012");
    public static String j = CircleProgressBar.a("Ull{HGEEE\u0001Oq&AFJ^\u0019LRVI\u0006\u001b");
    public static String k = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001bFTH[\u0016PBVt]");
    public static String l = CircleProgressBar.a("5%TjT\t\u007f_PHNx&");
    public static String m = CircleProgressBar.a("M`g{nAMEEDm~hEEFX");
    public static String n = CircleProgressBar.a("5%kf@L\u0004FQ\b\u001a?");
    public static String o = CircleProgressBar.a("t@ijC]\fhMTNk<\u0004");
    public final Context b;
    public Future e;
    public int f;
    public long g;
    public final ArrayList c = new ArrayList();
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final UU f25a = new UU();

    /* loaded from: classes2.dex */
    public class AG implements Callable {
        public AG() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            int i = UY.h;
            return UY.this.a();
        }
    }

    /* loaded from: classes2.dex */
    public class UU implements Observer {
        public static String g = CircleProgressBar.a("M`g{nAMEEDm~hEEFX");
        public static String h = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001bFTH[\u0016V\\RtNm'X_iev");
        public long d;
        public int e = -1;

        public UU() {
        }

        public final void a() {
            this.d = SystemClock.uptimeMillis();
        }

        @Override // java.util.Observer
        public final void update(Observable observable, Object obj) {
            UY uy = UY.this;
            ArrayList arrayList = uy.c;
            try {
                uy.g++;
                if (obj == null || arrayList.size() >= 50 || uy.d.get() || !(obj instanceof AU)) {
                    return;
                }
                AU au2 = (AU) obj;
                long j = au2.f1a;
                long j2 = j - this.d;
                String str = au2.b;
                int i = au2.c;
                AU au3 = new AU(i, au2.d, str, j2);
                if (this.e != i) {
                    uy.f = 0;
                    this.e = i;
                }
                int i2 = uy.f;
                if (i2 < 9) {
                    uy.f = i2 + 1;
                    arrayList.add(au3);
                }
                this.d = j;
                if (arrayList.size() >= 50) {
                    Future future = uy.e;
                    if (future == null || future.isCancelled() || uy.e.isDone()) {
                        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                        uy.e = executorServiceNewFixedThreadPool.submit(uy.new AG());
                        executorServiceNewFixedThreadPool.shutdown();
                    }
                }
            } catch (Exception e) {
                O.e(g, h, e);
                UB.a(e);
            }
        }
    }

    public UY(Context context) {
        this.b = context;
        d();
    }

    public final Pair a() throws NumberFormatException {
        long j2;
        ArrayList arrayList = this.c;
        String strG = "";
        if (arrayList.size() == 0) {
            return new Pair("", 0L);
        }
        AtomicBoolean atomicBoolean = this.d;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return null;
        }
        Iterator it = arrayList.iterator();
        long jB = 0;
        while (it.hasNext()) {
            AU au2 = (AU) it.next();
            String string = au2.a() + "," + au2.d() + "," + au2.b();
            if (au2.c() != -1) {
                StringBuilder sbT = a.t(string, ",");
                sbT.append(au2.c());
                string = sbT.toString();
            }
            String strG2 = a.g(string, ";");
            strG = a.g(strG, strG2);
            long jLongValue = au2.d().longValue();
            String strA = au2.a();
            String str = M.f12a;
            try {
                j2 = Long.parseLong(strA);
            } catch (NumberFormatException unused) {
                j2 = 0;
            }
            jB += j2 + jLongValue + au2.b();
            Long lValueOf = Long.valueOf((SystemClock.uptimeMillis() - Q.b) - au2.d().longValue());
            O.b.d(3, m, o + arrayList.size() + l + strG2 + n + lValueOf, new Throwable[0]);
            if (h <= 9672) {
                while (true) {
                    int i2 = h;
                    int i3 = i2 + 65;
                    if (i3 == 17) {
                        h = ((i2 ^ 1783) + i2) * 31;
                    } else if (i3 == 82) {
                        while (true) {
                            h = h + i2 + i2;
                        }
                    } else if (i3 == 234) {
                        h = ((i2 + i2) >> 38) % 115;
                        break;
                    }
                }
            }
        }
        atomicBoolean.set(false);
        return new Pair(strG, Long.valueOf(jB));
    }

    public final Pair b() {
        Future future;
        Pair pairA = null;
        try {
            Future future2 = this.e;
            if (future2 != null) {
                try {
                    try {
                        pairA = (Pair) future2.get();
                    } catch (ExecutionException e) {
                        O.e(m, i + e.getMessage(), new Throwable[0]);
                    }
                } catch (InterruptedException e2) {
                    O.e(m, i + e2.getMessage(), new Throwable[0]);
                }
            }
            if (pairA != null) {
                return pairA;
            }
            pairA = a();
            if (pairA != null || (future = this.e) == null) {
                return pairA;
            }
            try {
                return (Pair) future.get();
            } catch (InterruptedException e3) {
                O.e(m, i + e3.getMessage(), new Throwable[0]);
                return pairA;
            } catch (ExecutionException e4) {
                O.e(m, i + e4.getMessage(), new Throwable[0]);
                return pairA;
            }
        } catch (Exception e5) {
            O.e(m, k, e5);
            UB.a(e5);
            return pairA;
        }
    }

    public final void c(EditText editText) {
        O.c(m, j + editText.getId(), new Throwable[0]);
        int id = editText.getId();
        String str = M.f12a;
        int iC = M.c(String.valueOf(id));
        int inputType = editText.getInputType() & 129;
        UU uu = this.f25a;
        Context context = this.b;
        Fh fh = (inputType == 129 || (editText.getInputType() & 18) == 18 || (editText.getInputType() & 145) == 145 || (editText.getInputType() & 225) == 225) ? new Fh(context, iC, true) : new Fh(context, iC, false);
        editText.addTextChangedListener(fh);
        fh.addObserver(uu);
    }

    public final void d() {
        this.f25a.a();
        this.f = 0;
        this.g = 0L;
        this.c.clear();
        Future future = this.e;
        if (future != null) {
            if (!future.isCancelled() && !this.e.isDone()) {
                this.e.cancel(true);
            }
            this.e = null;
        }
    }
}
