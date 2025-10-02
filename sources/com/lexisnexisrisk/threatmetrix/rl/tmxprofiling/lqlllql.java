package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.lexisnexisrisk.threatmetrix.rl.TMXModuleClassLoader;
import com.lexisnexisrisk.threatmetrix.rl.TMXModuleInitializerInterface;
import com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.TMXScanEndNotifier;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqlllql {
    private static final long p007000700070p00700070 = 1;
    private static final String p00700070p007000700070 = lqlqqll.u00750075u00750075u(lqlllql.class);
    public static final long p0070pp007000700070 = 4;
    private static final String pp0070p007000700070 = "7.6-46 : RL";
    private static final Map<String, Long> ppp0070007000700070;
    private static final long pppp007000700070 = 2;
    private final Map<String, lllllql> p0070p0070007000700070 = new TreeMap();
    private long pp00700070007000700070;

    static {
        HashMap map = new HashMap();
        ppp0070007000700070 = map;
        map.put(lllllql.pp0070p0070p0070, Long.valueOf(p007000700070p00700070));
        map.put(lllllql.p0070pp0070p0070, 2L);
        map.put(lllllql.p00700070p0070p0070, 4L);
    }

    public static <T> ArrayList<T> h006800680068hhh(Iterator<T> it, Class cls) {
        if (it == null) {
            return null;
        }
        ArrayList<T> arrayList = new ArrayList<>();
        while (it.hasNext()) {
            try {
                T next = it.next();
                if (next instanceof TMXModuleMetadataProviderInterface) {
                    String moduleVersion = ((TMXModuleMetadataProviderInterface) next).getModuleVersion();
                    if (hh00680068h0068h("7.6-46 : RL", moduleVersion)) {
                        arrayList.add(next);
                    } else {
                        lqlqqll.uu0075u00750075u(p00700070p007000700070, "module {} version mismatch(expected {}, actual {})", cls.getSimpleName(), "7.6-46 : RL", moduleVersion);
                    }
                }
            } catch (SecurityException e) {
                e = e;
                lqlqqll.uu0075007500750075u(p00700070p007000700070, "Failed to load module ({}): {}", cls.getSimpleName(), e.toString());
            } catch (ServiceConfigurationError e2) {
                e = e2;
                lqlqqll.uu0075007500750075u(p00700070p007000700070, "Failed to load module ({}): {}", cls.getSimpleName(), e.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static TMXProfilingConnectionsInterface h0068h00680068hh() {
        ArrayList arrayListHhh00680068hh = hhh00680068hh(TMXProfilingConnectionsInterface.class);
        if (arrayListHhh00680068hh == null || arrayListHhh00680068hh.isEmpty()) {
            return null;
        }
        return (TMXProfilingConnectionsInterface) arrayListHhh00680068hh.get(0);
    }

    private Map<String, Object> h0068hhhhh(String str, Context context) {
        Boolean boolValueOf;
        String str2;
        HashMap map = new HashMap();
        str.getClass();
        if (str.equals(lllllql.pp0070p0070p0070)) {
            map.put("androidVersion", Integer.valueOf(nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073));
            map.put("isHardwareStrongIDCanSign", Boolean.valueOf(nnlllnn.nlnlnln.o006Foo006F006F006F()));
            map.put("isHardwareStrongIDApi18Available", Boolean.valueOf(nnlllnn.nlnlnln.oo006Fo006F006F006F()));
            boolValueOf = Boolean.valueOf(nnlllnn.nlnlnln.o006F006Fo006F006F006F());
            str2 = "isHardwareStrongIDApi23Available";
        } else {
            if (!str.equals(lllllql.p00700070p0070p0070)) {
                return map;
            }
            map.put("infoLoggingStatus", Boolean.valueOf(lqlqqll.uu00750075u0075u()));
            map.put("nonFatalLoggingStatus", Boolean.valueOf(lqlqqll.u0075u0075u0075u()));
            map.put("androidVersion", Integer.valueOf(nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073));
            boolValueOf = Boolean.valueOf(new nnlllnn.nnnllln(context).f00660066f00660066f());
            str2 = "canCallGetInstalledApplications";
        }
        map.put(str2, boolValueOf);
        return map;
    }

    public static boolean hh00680068h0068h(String str, String str2) {
        int iIndexOf;
        if (llqllqq.ggggggg0067(str) || llqllqq.ggggggg0067(str2) || (iIndexOf = str.indexOf(45)) <= 0) {
            return false;
        }
        return str.regionMatches(0, str2, 0, iIndexOf);
    }

    public static boolean hh0068h0068hh(String str, lllllql lllllqlVar) {
        if (lllllqlVar == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    private static <T> ArrayList<T> hhh00680068hh(final Class cls) {
        try {
            Callable<ArrayList<T>> callable = new Callable<ArrayList<T>>() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllql.2
                @Override // java.util.concurrent.Callable
                public ArrayList<T> call() throws ClassNotFoundException {
                    try {
                        ClassLoader classLoader = cls.getClassLoader();
                        if (classLoader != null) {
                            return lqlllql.h006800680068hhh(ServiceLoader.load(cls, new TMXModuleClassLoader(classLoader)).iterator(), cls);
                        }
                        throw new ClassNotFoundException("Failed to get " + cls.getSimpleName() + " class loader");
                    } catch (ClassNotFoundException e) {
                        e = e;
                        lqlqqll.uu0075u00750075u(lqlllql.p00700070p007000700070, "Failed to configure service loader ({}): {}", cls.getSimpleName(), e.toString());
                        return null;
                    } catch (SecurityException e2) {
                        e = e2;
                        lqlqqll.uu0075u00750075u(lqlllql.p00700070p007000700070, "Failed to configure service loader ({}): {}", cls.getSimpleName(), e.toString());
                        return null;
                    } catch (ServiceConfigurationError e3) {
                        e = e3;
                        lqlqqll.uu0075u00750075u(lqlllql.p00700070p007000700070, "Failed to configure service loader ({}): {}", cls.getSimpleName(), e.toString());
                        return null;
                    }
                }
            };
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            ArrayList<T> arrayList = (ArrayList) executorServiceNewSingleThreadExecutor.submit(callable).get();
            executorServiceNewSingleThreadExecutor.shutdown();
            return arrayList;
        } catch (InterruptedException | NullPointerException | CancellationException | ExecutionException | RejectedExecutionException e) {
            lqlqqll.uu0075007500750075u(p00700070p007000700070, "Failed to load module({}): {}", cls.getSimpleName(), e.toString());
            return null;
        }
    }

    public static lllllql u0075u0075007500750075(String str, Object obj, String str2) {
        str.getClass();
        switch (str) {
            case "MODULE_TYPE_BIOMETRICS":
                return new nlnnlnn(obj, str2);
            case "MODULE_TYPE_AUTHENTICATION":
                return new nnnnlnn(obj, str2);
            case "MODULE_TYPE_DEVICE_SECURITY":
                return new nlnllnl(obj, str2);
            default:
                return null;
        }
    }

    private boolean uuuu007500750075(String str) {
        str.getClass();
        switch (str) {
            case "MODULE_TYPE_BIOMETRICS":
            case "MODULE_TYPE_AUTHENTICATION":
            case "MODULE_TYPE_DEVICE_SECURITY":
                return true;
            default:
                return false;
        }
    }

    public boolean h0068006800680068hh(final nlllnnl nlllnnlVar, final lqllllq lqllllqVar, @Nonnull final jjjxxjj.jjjxxxj jjjxxxjVar, final long j, final int i, @Nullable final TMXScanEndNotifier tMXScanEndNotifier) {
        String str;
        String str2;
        final lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p00700070p0070p0070);
        if (lllllqlVarHhh0068hhh instanceof nlnllnl) {
            final boolean z = jjjxxxjVar == jjjxxjj.jjjxxxj.INIT || jjjxxxjVar == jjjxxjj.jjjxxxj.PROFILE;
            if (!z && (j & 12288) == 0) {
                str = p00700070p007000700070;
                str2 = "Scan option is not enabled";
            } else {
                if (lqllllqVar.gg00670067gggg(z)) {
                    new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlllql.1
                        @Override // java.lang.Runnable
                        public void run() {
                            String str3;
                            StringBuilder sb;
                            try {
                                lqlqqll.uu0075007500750075u(lqlllql.p00700070p007000700070, "scanPackages({}): marking scan as started", jjjxxxjVar.toString());
                                ((nlnllnl) lllllqlVarHhh0068hhh).d0064dd00640064d(nlllnnlVar.ww0077w007700770077, z, j, i);
                                lqlqqll.llqqqll.yy00790079007900790079(lqlllql.p00700070p007000700070, "scanPackages(" + jjjxxxjVar + "): complete");
                                lqllllqVar.j006A006A006Aj006A006A();
                                TMXScanEndNotifier tMXScanEndNotifier2 = tMXScanEndNotifier;
                                if (tMXScanEndNotifier2 != null) {
                                    try {
                                        tMXScanEndNotifier2.complete();
                                    } catch (Throwable th) {
                                        th = th;
                                        str3 = lqlllql.p00700070p007000700070;
                                        sb = new StringBuilder("Unexpected exception occurred when calling EndNotifier ");
                                        sb.append(th.toString());
                                        lqlqqll.uuuu00750075u(str3, sb.toString());
                                    }
                                }
                            } catch (Throwable th2) {
                                try {
                                    lqlqqll.llqqqll.uuu0075uuu(lqlllql.p00700070p007000700070, "Exception is package scan" + th2.toString());
                                    lqlqqll.llqqqll.yy00790079007900790079(lqlllql.p00700070p007000700070, "scanPackages(" + jjjxxxjVar + "): complete");
                                    lqllllqVar.j006A006A006Aj006A006A();
                                    TMXScanEndNotifier tMXScanEndNotifier3 = tMXScanEndNotifier;
                                    if (tMXScanEndNotifier3 != null) {
                                        try {
                                            tMXScanEndNotifier3.complete();
                                        } catch (Throwable th3) {
                                            th = th3;
                                            str3 = lqlllql.p00700070p007000700070;
                                            sb = new StringBuilder("Unexpected exception occurred when calling EndNotifier ");
                                            sb.append(th.toString());
                                            lqlqqll.uuuu00750075u(str3, sb.toString());
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                    }).start();
                    return true;
                }
                str = p00700070p007000700070;
                str2 = "Scan already in progress or cancel requested, aborting";
            }
        } else {
            str = p00700070p007000700070;
            str2 = "Invalid module";
        }
        lqlqqll.llqqqll.yy00790079007900790079(str, str2);
        return false;
    }

    public void h00680068h0068hh(@Nonnull String str, String str2, String str3, @Nonnull Activity activity) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).o006F006Fooo006F(str, str2, str3, activity);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to announce keyboard target text changed: Module is not enabled or is invalid");
        }
    }

    public void h00680068hh0068h(@Nonnull Activity activity, @Nonnull String str) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).o006F006F006Foo006F(activity, str);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to set page name: Module is not enabled or is invalid");
        }
    }

    public long h00680068hhhh() {
        return this.pp00700070007000700070;
    }

    public void h0068h0068h0068h(String str) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(str);
        if (lllllqlVarHhh0068hhh != null && lllllqlVarHhh0068hhh.o006F006Fo006F006Fo() && lllllqlVarHhh0068hhh.uuuuu00750075() && hh0068h0068hh(str, lllllqlVarHhh0068hhh)) {
            lllllqlVarHhh0068hhh.u0075uu0075u0075();
        }
    }

    public Long h0068h0068hhh(String str, int i) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(str);
        if (hh0068h0068hh(str, lllllqlVarHhh0068hhh)) {
            return lllllqlVarHhh0068hhh.u0075u00750075u0075(i);
        }
        return 0L;
    }

    public boolean h0068hh0068hh() {
        Iterator<Map.Entry<String, lllllql>> it = this.p0070p0070007000700070.entrySet().iterator();
        while (it.hasNext()) {
            lllllql value = it.next().getValue();
            if (value != null && value.u00750075uu00750075()) {
                return true;
            }
        }
        return false;
    }

    public void h0068hhh0068h(@Nonnull String str, String str2, @Nonnull Activity activity) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).oo006F006Foo006F(str, str2, activity);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to set current Keyboard target: Module is not enabled or is invalid");
        }
    }

    public void hh006800680068hh(@Nonnull String str, boolean z, @Nonnull Activity activity) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).ooo006Foo006F(str, z, activity);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to register keyboard target: Module is not enabled or is invalid");
        }
    }

    public String hh00680068hhh(String str) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(str);
        if (hh0068h0068hh(str, lllllqlVarHhh0068hhh)) {
            return lllllqlVarHhh0068hhh.uuu00750075u0075();
        }
        return null;
    }

    public void hh0068hh0068h(String str, boolean z) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(str);
        if (lllllqlVarHhh0068hhh != null && lllllqlVarHhh0068hhh.o006F006Fo006F006Fo() && lllllqlVarHhh0068hhh.uuuuu00750075() && hh0068h0068hh(str, lllllqlVarHhh0068hhh)) {
            lllllqlVarHhh0068hhh.u0075u0075u00750075(z);
        }
    }

    public Set<String> hh0068hhhh() {
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, lllllql>> it = this.p0070p0070007000700070.entrySet().iterator();
        while (it.hasNext()) {
            lllllql value = it.next().getValue();
            if (value != null && value.uuuuu00750075()) {
                hashSet.addAll(value.u00750075u0075u0075());
            }
        }
        return hashSet;
    }

    @Nullable
    public Map<String, String> hhh0068h0068h(llqlqqq llqlqqqVar, long j, Map<String, Object> map) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (!nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            return null;
        }
        HashMap map2 = new HashMap(20);
        map2.put("options", Long.valueOf(j));
        map2.put("uiDataDuration", Integer.valueOf(llqlqqqVar.ggg00670067g0067));
        map2.put("uiDataInterval", Integer.valueOf(llqlqqqVar.g0067g00670067g0067));
        map2.put("uiDataPrecisionCount", Integer.valueOf(llqlqqqVar.gg006700670067g0067));
        map2.put("uiDataTransmissionLimit", Integer.valueOf(llqlqqqVar.g0067006700670067g0067));
        map2.put("sensorDuration", Integer.valueOf(llqlqqqVar.ggggg00670067));
        map2.put("sensorInterval", Integer.valueOf(llqlqqqVar.g0067ggg00670067));
        map2.put("sensorPrecisionCount", Integer.valueOf(llqlqqqVar.gg0067gg00670067));
        map2.put("sensorTransmissionSize", Integer.valueOf(llqlqqqVar.g00670067gg00670067));
        map2.put("transmissionFrequency", Integer.valueOf(llqlqqqVar.ggg0067g00670067));
        map2.put("bbShouldSendSensorRawData", Integer.valueOf(llqlqqqVar.g0067g0067g00670067));
        map2.put("bbShouldSendSensorStatsData", Integer.valueOf(llqlqqqVar.gg00670067g00670067));
        map2.put("bbShouldSendUIRawData", Integer.valueOf(llqlqqqVar.g006700670067g00670067));
        map2.put("bbShouldSendUIStatsData", Integer.valueOf(llqlqqqVar.gggg006700670067));
        map2.put("sensorIntervalThreshold", Integer.valueOf(llqlqqqVar.g0067gg006700670067));
        map2.put("includedActivities", llqlqqqVar.ttt0074ttt);
        map2.put("maskedFields", llqlqqqVar.t0074t0074ttt);
        map2.put("isBehavioSecEnabled", Boolean.valueOf(llqlqqqVar.ggg0067gg0067));
        map2.put("shouldUseMaskedMode", Boolean.valueOf(llqlqqqVar.g0067g0067gg0067));
        map2.put("shouldInjectJavascript", Boolean.valueOf(llqlqqqVar.gg00670067gg0067));
        map2.put("webFieldIdentifierAttribute", llqlqqqVar.g006700670067gg0067);
        if (map != null) {
            map2.putAll(map);
        }
        return lllllqlVarHhh0068hhh.uu00750075u00750075(map2);
    }

    public lllllql hhh0068hhh(String str) {
        if (!this.p0070p0070007000700070.containsKey(str)) {
            return null;
        }
        lllllql lllllqlVar = this.p0070p0070007000700070.get(str);
        if (hh0068h0068hh(str, lllllqlVar) && lllllqlVar.uuuuu00750075()) {
            return this.p0070p0070007000700070.get(str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public List<String> hhhh0068hh(Context context) {
        lllllql lllllqlVarU0075u0075007500750075;
        ArrayList arrayListHhh00680068hh = hhh00680068hh(TMXModuleInitializerInterface.class);
        if (arrayListHhh00680068hh == null) {
            lqlqqll.llqqqll.u0075uu0075uu(p00700070p007000700070, "module list is null");
            return null;
        }
        Iterator it = arrayListHhh00680068hh.iterator();
        while (it.hasNext()) {
            TMXModuleInitializerInterface tMXModuleInitializerInterface = (TMXModuleInitializerInterface) it.next();
            lqlqqll.llqqqll.u0075uu0075uu(p00700070p007000700070, "init module " + tMXModuleInitializerInterface);
            Pair<String, Object> pairInitialize = tMXModuleInitializerInterface.initialize();
            if (pairInitialize != null && uuuu007500750075((String) pairInitialize.first) && (lllllqlVarU0075u0075007500750075 = u0075u0075007500750075((String) pairInitialize.first, pairInitialize.second, tMXModuleInitializerInterface.getNativeLibName())) != null && lllllqlVarU0075u0075007500750075.o006F006Fo006F006Fo() && !this.p0070p0070007000700070.containsKey(pairInitialize.first)) {
                this.p0070p0070007000700070.put(pairInitialize.first, lllllqlVarU0075u0075007500750075);
            }
        }
        ArrayList arrayList = new ArrayList();
        this.pp00700070007000700070 = 0L;
        for (Map.Entry<String, lllllql> entry : this.p0070p0070007000700070.entrySet()) {
            lllllql value = entry.getValue();
            if (value != null) {
                if (value.uu0075u0075u0075(context, h0068hhhhh(entry.getKey(), context))) {
                    arrayList.add(value.uu007500750075u0075());
                    Map<String, Long> map = ppp0070007000700070;
                    if (map.containsKey(entry.getKey())) {
                        Long l = map.get(entry.getKey());
                        if (l != null) {
                            this.pp00700070007000700070 |= l.longValue();
                        }
                        entry.getValue().uuu0075u00750075(true);
                        entry.getValue().u0075u0075u00750075(true);
                    }
                } else {
                    entry.getValue().uuu0075u00750075(false);
                    lqlqqll.uu0075u00750075u(p00700070p007000700070, "Failed to configure module({})", value.uu007500750075u0075());
                }
            }
        }
        return arrayList;
    }

    public void hhhhh0068h() {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).o006Fo006Foo006F();
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to send biometrics information: Module is not enabled or is invalid");
        }
    }

    public void u00750075u007500750075(@Nonnull Activity activity) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).o006Foooo006F(activity);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to clear registration: Module is not enabled or is invalid");
        }
    }

    public void u0075uu007500750075() {
        Iterator<Map.Entry<String, lllllql>> it = this.p0070p0070007000700070.entrySet().iterator();
        while (it.hasNext()) {
            lllllql value = it.next().getValue();
            if (value != null && value.uuuuu00750075()) {
                value.u0075uu0075u0075();
            }
        }
    }

    public nnnnlnn uu00750075007500750075() {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.pp0070p0070p0070);
        if (lllllqlVarHhh0068hhh == null || !lllllqlVarHhh0068hhh.uuuuu00750075()) {
            return null;
        }
        return (nnnnlnn) lllllqlVarHhh0068hhh;
    }

    public void uu0075u007500750075(@Nonnull String str, String str2, @Nonnull Activity activity) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p0070pp0070p0070);
        if (nlnnlnn.oo006Fooo006F(lllllqlVarHhh0068hhh)) {
            ((nlnnlnn) lllllqlVarHhh0068hhh).oooooo006F(str, str2, activity);
        } else {
            lqlqqll.uuu007500750075u(p00700070p007000700070, "Failed to unset current Keyboard target: Module is not enabled or is invalid");
        }
    }

    public Map<String, String> uuu0075007500750075(long j) {
        lllllql lllllqlVarHhh0068hhh = hhh0068hhh(lllllql.p00700070p0070p0070);
        if (!hh0068h0068hh(lllllql.p00700070p0070p0070, lllllqlVarHhh0068hhh)) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("options", Long.valueOf(j));
        return lllllqlVarHhh0068hhh.uu00750075u00750075(map);
    }
}
