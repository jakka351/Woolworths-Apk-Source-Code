package YU;

import android.os.SystemClock;
import android.util.Pair;
import android.view.MotionEvent;
import com.cyberfend.cyfsecurity.CircleProgressBar;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class Ui implements Observer {
    public static final Locale n = Locale.US;
    public int e;
    public int f;
    public Future j;
    public long l;
    public final DecimalFormat m;
    public long d = 0;
    public long g = 0;
    public String h = "";
    public final ArrayList i = new ArrayList();
    public final AtomicBoolean k = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public class Uh implements Callable {
        public Uh() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            Locale locale = Ui.n;
            return Ui.this.a();
        }
    }

    public Ui() {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getNumberInstance(n);
        this.m = decimalFormat;
        decimalFormat.applyPattern("#");
    }

    /* JADX WARN: Finally extract failed */
    public final Pair a() {
        String str;
        long j;
        long j2;
        String str2 = "MjjlEdMECFEm";
        DecimalFormat decimalFormat = this.m;
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return new Pair("", 0L);
        }
        AtomicBoolean atomicBoolean = this.k;
        if (!atomicBoolean.compareAndSet(false, true)) {
            return null;
        }
        try {
            try {
                long jUptimeMillis = SystemClock.uptimeMillis();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Av av = (Av) it.next();
                    StringBuilder sb = new StringBuilder();
                    int i = av.f4a;
                    float f = av.c;
                    float f2 = av.d;
                    long j3 = jUptimeMillis;
                    long j4 = av.f;
                    sb.append(i);
                    sb.append(",");
                    sb.append(j4);
                    sb.append(",");
                    double d = f2;
                    sb.append(decimalFormat.format(d));
                    sb.append(",");
                    double d2 = f;
                    sb.append(decimalFormat.format(d2));
                    sb.append(",");
                    sb.append(av.b);
                    sb.append(CircleProgressBar.a("543"));
                    sb.append(av.e);
                    sb.append(CircleProgressBar.a("5(.4"));
                    String string = sb.toString();
                    StringBuilder sb2 = new StringBuilder();
                    str = str2;
                    try {
                        sb2.append(this.h);
                        sb2.append(string);
                        this.h = sb2.toString();
                        long j5 = this.l;
                        long j6 = j4 + av.f4a;
                        String str3 = decimalFormat.format(d);
                        String str4 = M.f12a;
                        try {
                            j = Long.parseLong(str3);
                        } catch (NumberFormatException unused) {
                            j = 0;
                        }
                        long j7 = j6 + j;
                        try {
                            j2 = Long.parseLong(decimalFormat.format(d2));
                        } catch (NumberFormatException unused2) {
                            j2 = 0;
                        }
                        this.l = j7 + j2 + j5;
                        jUptimeMillis = j3;
                        str2 = str;
                    } catch (Exception e) {
                        e = e;
                        O.e(CircleProgressBar.a(str), CircleProgressBar.a("\\}|j]]EDL\u0001Iq&CGW^PVP\u000eISNQY\u0010J@PZGi"), e);
                        UB.a(e);
                        atomicBoolean.set(false);
                        return new Pair("", 0L);
                    }
                }
                str = str2;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                O.c(CircleProgressBar.a(str), CircleProgressBar.a("MjjlE\ti]GOT?EKWM^\u0003\u0018") + arrayList.size() + CircleProgressBar.a("9-r`[L\u0016\u000b") + this.e + CircleProgressBar.a("5%j\u007fIF[E\u0018\u0001") + this.f + ")", new Throwable[0]);
                String strA = CircleProgressBar.a(str);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(CircleProgressBar.a("MjjlE\t\u007foa@L|+pKNO\u0003\u0018"));
                sb3.append(jUptimeMillis2 - jUptimeMillis);
                sb3.append(CircleProgressBar.a("tv"));
                O.c(strA, sb3.toString(), new Throwable[0]);
                Pair pair = new Pair(this.h, Long.valueOf(this.l));
                atomicBoolean.set(false);
                return pair;
            } catch (Throwable th) {
                atomicBoolean.set(false);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            str = str2;
        }
    }

    public final void b() {
        this.e = 0;
        this.f = 0;
        this.g = 0L;
        this.h = "";
        this.l = 0L;
        this.d = SystemClock.uptimeMillis();
        this.i.clear();
        Future future = this.j;
        if (future != null) {
            if (!future.isCancelled() && !this.j.isDone()) {
                this.j.cancel(true);
            }
            this.j = null;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        char c;
        Future future;
        int i;
        int i2;
        if (obj == null) {
            return;
        }
        int i3 = 1;
        try {
            if (this.k.get()) {
                return;
            }
            this.g++;
            UX ux = (UX) obj;
            int i4 = ux.c;
            MotionEvent motionEvent = ux.f24a;
            int pointerCount = motionEvent.getPointerCount();
            if (i4 != 1 || this.e >= 50) {
                if (i4 == 1) {
                    return;
                }
                if (this.f >= 50) {
                    return;
                }
            }
            ArrayList arrayList = this.i;
            if (i4 == 1) {
                int i5 = 0;
                while (i5 < pointerCount) {
                    try {
                        if (this.e < 50) {
                            i = i3;
                            c = 0;
                            try {
                                i2 = i5;
                                arrayList.add(new Av(ux.b, motionEvent.getEventTime() - this.d, pointerCount, motionEvent.getY(i5), motionEvent.getX(i5), motionEvent.getToolType(i5)));
                                this.e++;
                            } catch (Exception e) {
                                e = e;
                                String strA = CircleProgressBar.a("MjjlEdMECFEm");
                                String strA2 = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001bF^EL^\u0015QE\u007fG|");
                                Throwable[] thArr = new Throwable[1];
                                thArr[c] = e;
                                O.e(strA, strA2, thArr);
                                UB.a(e);
                                return;
                            }
                        } else {
                            i = i3;
                            i2 = i5;
                        }
                        i5 = i2 + 1;
                        i3 = i;
                    } catch (Exception e2) {
                        e = e2;
                        c = 0;
                        String strA3 = CircleProgressBar.a("MjjlEdMECFEm");
                        String strA22 = CircleProgressBar.a("\\}|j]]EDL\u0001Iq&TPLI\\KDGS[\u001bF^EL^\u0015QE\u007fG|");
                        Throwable[] thArr2 = new Throwable[1];
                        thArr2[c] = e;
                        O.e(strA3, strA22, thArr2);
                        UB.a(e);
                        return;
                    }
                }
            }
            c = 0;
            if (i4 != i3) {
                arrayList.add(new Av(ux.b, motionEvent.getEventTime() - this.d, pointerCount, motionEvent.getY(), motionEvent.getX(), motionEvent.getToolType(motionEvent.getActionIndex())));
                this.f++;
            }
            if (this.e >= 50 && this.f >= 50 && ((future = this.j) == null || future.isCancelled() || this.j.isDone())) {
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1);
                this.j = executorServiceNewFixedThreadPool.submit(new Uh());
                executorServiceNewFixedThreadPool.shutdown();
            }
            this.d = motionEvent.getEventTime();
        } catch (Exception e3) {
            e = e3;
        }
    }
}
