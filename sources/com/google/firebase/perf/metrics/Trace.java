package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.perf.FirebasePerformanceAttributable;
import com.google.firebase.perf.application.AppStateMonitor;
import com.google.firebase.perf.application.AppStateUpdateHandler;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.validator.PerfMetricValidator;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionAwareObject;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class Trace extends AppStateUpdateHandler implements Parcelable, FirebasePerformanceAttributable, SessionAwareObject {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;
    public static final AndroidLogger p = AndroidLogger.e();
    public final WeakReference d;
    public final Trace e;
    public final GaugeManager f;
    public final String g;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap i;
    public final List j;
    public final ArrayList k;
    public final TransportManager l;
    public final Clock m;
    public Timer n;
    public Timer o;

    /* renamed from: com.google.firebase.perf.metrics.Trace$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.Trace$2, reason: invalid class name */
    public class AnonymousClass2 implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(Parcel parcel) {
            return new Trace(parcel, true);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new AnonymousClass1();
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor) {
        this(str, transportManager, clock, appStateMonitor, GaugeManager.getInstance());
    }

    @Override // com.google.firebase.perf.session.SessionAwareObject
    public final void a(PerfSession perfSession) {
        if (perfSession == null) {
            p.g("Unable to add new SessionId to the Trace. Continuing without it.");
        } else {
            if (this.n == null || c()) {
                return;
            }
            this.j.add(perfSession);
        }
    }

    public final void b(String str, String str2) {
        if (c()) {
            Locale locale = Locale.ENGLISH;
            throw new IllegalArgumentException(YU.a.h("Trace '", this.g, "' has been stopped"));
        }
        ConcurrentHashMap concurrentHashMap = this.i;
        if (concurrentHashMap.containsKey(str) || concurrentHashMap.size() < 5) {
            PerfMetricValidator.c(str, str2);
        } else {
            Locale locale2 = Locale.ENGLISH;
            throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
        }
    }

    public final boolean c() {
        return this.o != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.n != null) && !c()) {
                p.h("Trace '%s' is started but not stopped when it is destructed!", this.g);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.i.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.i);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.h.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.e.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String strD = PerfMetricValidator.d(str);
        AndroidLogger androidLogger = p;
        if (strD != null) {
            androidLogger.d("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strD);
            return;
        }
        Timer timer = this.n;
        String str2 = this.g;
        if (timer == null) {
            androidLogger.h("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            androidLogger.h("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.h;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.e;
        atomicLong.addAndGet(j);
        androidLogger.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        boolean z;
        AndroidLogger androidLogger = p;
        try {
            str = str.trim();
            str2 = str2.trim();
            b(str, str2);
            androidLogger.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.g);
            z = true;
        } catch (Exception e) {
            androidLogger.d("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z = false;
        }
        if (z) {
            this.i.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String strD = PerfMetricValidator.d(str);
        AndroidLogger androidLogger = p;
        if (strD != null) {
            androidLogger.d("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strD);
            return;
        }
        Timer timer = this.n;
        String str2 = this.g;
        if (timer == null) {
            androidLogger.h("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (c()) {
            androidLogger.h("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.h;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.e.set(j);
        androidLogger.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (c()) {
            p.c("Can't remove a attribute from a Trace that's stopped.");
        } else {
            this.i.remove(str);
        }
    }

    @Keep
    public void start() {
        String str;
        boolean zQ = ConfigResolver.e().q();
        AndroidLogger androidLogger = p;
        if (!zQ) {
            androidLogger.a("Trace feature is disabled.");
            return;
        }
        Pattern pattern = PerfMetricValidator.f15706a;
        String str2 = this.g;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            Locale locale = Locale.US;
            str = "Trace name must not exceed 100 characters";
        } else if (str2.startsWith("_")) {
            Constants.TraceNames[] traceNamesArrValues = Constants.TraceNames.values();
            int length = traceNamesArrValues.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (traceNamesArrValues[i].d.equals(str2)) {
                        break;
                    } else {
                        i++;
                    }
                } else if (str2.startsWith("_st_")) {
                    break;
                } else {
                    str = "Trace name must not start with '_'";
                }
            }
            str = null;
        } else {
            str = null;
        }
        if (str != null) {
            androidLogger.d("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.n != null) {
            androidLogger.d("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.m.getClass();
        this.n = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.d);
        a(perfSession);
        if (perfSession.f) {
            this.f.collectGaugeMetricOnce(perfSession.e);
        }
    }

    @Keep
    public void stop() {
        Timer timer = this.n;
        String str = this.g;
        AndroidLogger androidLogger = p;
        if (timer == null) {
            androidLogger.d("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (c()) {
            androidLogger.d("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.d);
        unregisterForAppState();
        this.m.getClass();
        Timer timer2 = new Timer();
        this.o = timer2;
        if (this.e == null) {
            ArrayList arrayList = this.k;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) YU.a.c(1, arrayList);
                if (trace.o == null) {
                    trace.o = timer2;
                }
            }
            if (str.isEmpty()) {
                androidLogger.c("Trace name is empty, no log is sent to server");
                return;
            }
            this.l.c(new TraceMetricBuilder(this).a(), getAppState());
            if (SessionManager.getInstance().perfSession().f) {
                this.f.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().e);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.e, 0);
        parcel.writeString(this.g);
        parcel.writeList(this.k);
        parcel.writeMap(this.h);
        parcel.writeParcelable(this.n, 0);
        parcel.writeParcelable(this.o, 0);
        synchronized (this.j) {
            parcel.writeList(this.j);
        }
    }

    public Trace(String str, TransportManager transportManager, Clock clock, AppStateMonitor appStateMonitor, GaugeManager gaugeManager) {
        super(appStateMonitor);
        this.d = new WeakReference(this);
        this.e = null;
        this.g = str.trim();
        this.k = new ArrayList();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
        this.m = clock;
        this.l = transportManager;
        this.j = Collections.synchronizedList(new ArrayList());
        this.f = gaugeManager;
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : AppStateMonitor.a());
        this.d = new WeakReference(this);
        this.e = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.g = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.h = concurrentHashMap;
        this.i = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.n = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.o = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.j = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.l = null;
            this.m = null;
            this.f = null;
        } else {
            this.l = TransportManager.v;
            this.m = new Clock();
            this.f = GaugeManager.getInstance();
        }
    }
}
