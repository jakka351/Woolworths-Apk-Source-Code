package com.lexisnexisrisk.threatmetrix.rl.tmxdsh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.lexisnexisrisk.threatmetrix.rl.DSHNativeGathererHelper;
import com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vvvmvmv;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class vmmmvmv {
    public static int x00780078007800780078x = 1;
    public static int xx0078007800780078x = 85;
    public static int xx0078xxx0078 = 0;
    public static int xxxxxx0078 = 2;
    private static final String ggg0067ggg = vvvmmvm.n006E006En006Enn("(h 6e\u001a://1JG", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587860)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587849)));
    private static final String g0067g0067ggg = vvvmmvm.n006En006E006Enn(".}5$M\f4;,o\f\u0016C\u0002j*BDp}\u001aUS\u007flo\u0011b\u0002I2wV\u0017=", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587802)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843103)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843030)));
    private static final String g00670067gggg = vvvmvmv.hhhh0068hh(vmmmvmv.class);
    private final DSHNativeGathererHelper gg00670067ggg = new DSHNativeGathererHelper();
    private final Lock g006700670067ggg = new ReentrantLock();

    @Nullable
    private String[] gggg0067gg = null;
    private long g0067gg0067gg = 0;
    private boolean gg0067g0067gg = false;
    private int g00670067g0067gg = 0;
    public boolean ggg00670067gg = false;
    public boolean g0067g00670067gg = false;

    public static class vmvvmmv {
        private static final vmmmvmv ggggg0067g = new vmmmvmv();

        static {
            try {
                throw null;
            } catch (Exception unused) {
            }
        }

        private vmvvmmv() {
        }

        public static /* synthetic */ vmmmvmv h0068h00680068hh() {
            while (true) {
                try {
                    int[] iArr = new int[-1];
                } catch (Exception unused) {
                    return ggggg0067g;
                }
            }
        }
    }

    public static vmmmvmv hhhh00680068h() {
        int i = xx0078007800780078x;
        if (((x00780078007800780078x + i) * i) % xxxxxx0078 != 0) {
            xx0078007800780078x = 14;
            x00780078007800780078x = x0078xxxx0078();
        }
        return vmvvmmv.h0068h00680068hh();
    }

    @Nullable
    private String[] hhhhh0068h(@Nonnull Context context, boolean z) throws Throwable {
        if (this.gggg0067gg != null && TimeUnit.SECONDS.convert(System.nanoTime() - this.g0067gg0067gg, TimeUnit.NANOSECONDS) < 60) {
            return this.gggg0067gg;
        }
        vvvmvmv.vmvmvmv.d(g00670067gggg, vvvmmvm.n006En006E006Enn("Km[mpflf qcwl%lpvm*q{\u007f.p\u0001|", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496125)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496230)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843026))));
        this.g0067gg0067gg = System.nanoTime();
        vvvmmvm.n006En006E006Enn("\u0006S5yO\u001egS\\l4", (char) (vmmmvvm.hh0068h006800680068() ^ 263258612), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843145)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843031)));
        vvvmmvm.n006En006E006Enn("'lsnpbk.psky1fvw", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496082)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588016)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843026)));
        ArrayList arrayList = new ArrayList();
        if (z) {
            try {
                PackageManager packageManager = (PackageManager) Class.forName(vvvmmvm.n006En006E006Enn("L \\\u001dk\u000f\u0006b8|\u0016i Pc+%E62TTP", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843260)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496099)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258533))).getMethod(vvvmmvm.n006E006En006Enn("}|\tesv{r\u0006\u0005i~\t|\u007f~x", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496225)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587845))), null).invoke(context, null);
                if (packageManager != null) {
                    try {
                        for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(0)) {
                            if (!applicationInfo.sourceDir.startsWith(vvvmmvm.n006E006En006Enn("{AHCE7@\u00036FG", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843264)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587843)))) && !applicationInfo.sourceDir.startsWith(vvvmmvm.n006E006En006Enn("1v}xzlu8z}u\u0004;p\u0001\u0002", (char) (vmmmvvm.hh0068h006800680068() ^ 263258529), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496242))))) {
                                arrayList.add(applicationInfo.sourceDir);
                            }
                        }
                    } catch (SecurityException e) {
                        vvvmvmv.vmvmvmv.d(g00670067gggg, vvvmmvm.n006E006En006Enn("HeZf\u0017h^^pmb\u001cfpbnWKSK\u0007VNZXS`_X]_\u0010NO", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843236)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587845))), e.toString());
                        vvmvvmv.hh0068hhhh(e);
                    } catch (Exception e2) {
                        vvvmvmv.i(g00670067gggg, e2.toString());
                    }
                }
            } catch (InvocationTargetException e3) {
                throw e3.getCause();
            }
        }
        int i = xx0078007800780078x;
        if (((x00780078007800780078x + i) * i) % xxx0078xx0078() != 0) {
            xx0078007800780078x = 81;
            xx0078xxx0078 = x0078xxxx0078();
        }
        arrayList.add(vvvmmvm.n006En006E006Enn("p4922\")i\u001b)(", (char) (vmmmvvm.hh0068h006800680068() ^ 263258597), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496143)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587847))));
        arrayList.add(vvvmmvm.n006En006E006Enn("@\u0006\r\b\n{\u0005G\n\r\u0005\u0013J\u007f\u0010\u0011", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588013)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496150)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587842))));
        vvvmvmv.vmvmvmv.d(g00670067gggg, vvvmmvm.n006E006En006Enn("|/VtqE$y]\u0005\u000f@\u001bS|)FV:l\u0015", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587956)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258536)) + arrayList.size());
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.gggg0067gg = strArr;
        return strArr;
    }

    public static int x0078007800780078x0078() {
        return 0;
    }

    public static int x00780078xxx0078() {
        return 1;
    }

    public static int x0078xxxx0078() {
        return 32;
    }

    public static int xxx0078xx0078() {
        return 2;
    }

    public int h00680068006800680068h() {
        try {
            if (this.ggg00670067gg) {
                return this.gg00670067ggg.waitUntilCancelled();
            }
            return -1;
        } catch (Throwable th) {
            vvvmvmv.vmvmvmv.e(g00670067gggg, vvvmmvm.n006En006E006Enn("?Sg]k[\u0017;h^`6", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843149)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496168)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496248))), th);
            return -1;
        }
    }

    @Nullable
    public String[] h0068006800680068hh(@Nullable String[] strArr) throws InterruptedException {
        String[] strArrCheckPackageURLs = null;
        try {
            if (this.ggg00670067gg && strArr != null) {
                strArrCheckPackageURLs = this.gg00670067ggg.checkPackageURLs(strArr);
            }
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006E006En006Enn("o\u0004\u0018\u000e\u001c\fGk\u0019\u000f\u0011f", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587793)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848))), th);
        }
        if (!Thread.interrupted()) {
            return strArrCheckPackageURLs;
        }
        vvvmvmv.i(g00670067gggg, vvvmmvm.n006En006E006Enn("lz~\u001c\u0012\u000ft8'gRI\u0004|e 9s3(\u0017KJ1Z\u001c\n\tvz\"$@?2", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496017)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587980)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587843))));
        throw new InterruptedException();
    }

    public void h006800680068h0068h() {
        if (this.ggg00670067gg) {
            this.gg00670067ggg.finit();
        }
        this.ggg00670067gg = false;
        this.gg0067g0067gg = false;
        int i = xx0078007800780078x;
        if (((x00780078007800780078x + i) * i) % xxxxxx0078 != xx0078xxx0078) {
            xx0078007800780078x = x0078xxxx0078();
            xx0078xxx0078 = x0078xxxx0078();
        }
    }

    public boolean h00680068h00680068h(String str, String str2, boolean z, boolean z2) {
        if (this.ggg00670067gg) {
            return true;
        }
        try {
            this.g006700670067ggg.lock();
            boolean z3 = this.ggg00670067gg;
            if (z3) {
                this.g006700670067ggg.unlock();
                return z3;
            }
            try {
                try {
                    boolean zHhhhhh0068 = this.gg00670067ggg.hhhhhh0068(str, str2, z, z2);
                    this.ggg00670067gg = zHhhhhh0068;
                    vvvmvmv.i(g00670067gggg, zHhhhhh0068 ? vvvmmvm.n006E006En006Enn("\u0018\u0016\fJ\u0011'\u000f\u0018\u0010\u0006\u0004\u000f\rH", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496093)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843031))) : vvvmmvm.n006E006En006Enn("SOK\bQQY\u0004PdRYWKOX\\\u0016", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496020)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587845))));
                } catch (UnsatisfiedLinkError e) {
                    vvvmvmv.e(g00670067gggg, vvvmmvm.n006En006E006Enn("\u007f}w6\u0006\b\u000e:|\u0013~\b\f\u0002\u0004\u000f\tD", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587987)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587967)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587844))) + e.getMessage());
                    this.ggg00670067gg = false;
                    if (((x00780078xxx0078() + xx0078007800780078x) * xx0078007800780078x) % xxx0078xx0078() != xx0078xxx0078) {
                        xx0078007800780078x = 55;
                        xx0078xxx0078 = 87;
                    }
                }
            } catch (Throwable th) {
                vvvmvmv.e(g00670067gggg, vvvmmvm.n006En006E006Enn("j\u0014=\t$i:snyQ<", (char) (vmmmvvm.hh0068h006800680068() ^ 263258556), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588014)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587848))), th);
                this.ggg00670067gg = false;
            }
            this.g006700670067ggg.unlock();
            return this.ggg00670067gg;
        } catch (Throwable th2) {
            this.g006700670067ggg.unlock();
            throw th2;
        }
    }

    public void h00680068hh0068h(@Nonnull Context context, int i, int i2, boolean z) throws InterruptedException {
        try {
            if (this.ggg00670067gg) {
                String[] strArrHhhhh0068h = (this.gg0067g0067gg && (i & 16) == 0) ? null : hhhhh0068h(context, z);
                if (!this.gg0067g0067gg) {
                    this.gg00670067ggg.initPackageManager();
                    this.gg0067g0067gg = true;
                    int i3 = 5;
                    while (true) {
                        try {
                            i3 /= 0;
                        } catch (Exception unused) {
                            xx0078007800780078x = x0078xxxx0078();
                            try {
                                throw null;
                            } catch (Exception unused2) {
                                xx0078007800780078x = 51;
                                while (true) {
                                    try {
                                        int[] iArr = new int[-1];
                                    } catch (Exception unused3) {
                                        xx0078007800780078x = 12;
                                    }
                                }
                            }
                        }
                    }
                }
                this.gg00670067ggg.findPackages(strArrHhhhh0068h, i2, i);
            }
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006En006E006Enn("?Sg]k[\u0017;h^`6", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588030)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587917)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258531)), th);
        }
        if (Thread.interrupted()) {
            vvvmvmv.i(g00670067gggg, vvvmmvm.n006E006En006Enn("\u0018+4&!#]&*/\u001f+*,&)S\u0017\u0017%\u0015\u0012\"\u0012\u0010VI\u001d\u0010\u0019\u0015\u001c\r\u0011\t", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496102)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496244))));
            throw new InterruptedException();
        }
    }

    public boolean h0068h006800680068h() {
        if (this.ggg00670067gg) {
            return false;
        }
        boolean z = this.g0067g00670067gg;
        if (((x00780078xxx0078() + xx0078007800780078x) * xx0078007800780078x) % xxxxxx0078 != x0078007800780078x0078()) {
            xx0078007800780078x = x0078xxxx0078();
            xx0078xxx0078 = 10;
        }
        return z;
    }

    @Nullable
    public String[] h0068h0068h0068h(short[] sArr) {
        int i = xx0078007800780078x;
        if (((x00780078007800780078x + i) * i) % xxxxxx0078 != xx0078xxx0078) {
            xx0078007800780078x = x0078xxxx0078();
            xx0078xxx0078 = x0078xxxx0078();
        }
        try {
            if (this.ggg00670067gg) {
                return this.gg00670067ggg.findPermissions(sArr);
            }
            return null;
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006E006En006Enn("0BTHTB{\u001eI==\u0011", (char) (vvmmvvm.hhhh006800680068() ^ (-1058496253)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258533)), th);
            return null;
        }
    }

    public long h0068hh00680068h(int i) {
        try {
            if (this.ggg00670067gg) {
                return this.gg00670067ggg.getTamperCode(i);
            }
            return 0L;
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006E006En006Enn("\u0014&8,8&_\u0002-!!t", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843049)), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843028))), th);
            return 0L;
        }
    }

    @Nullable
    public vvvmmmv[] h0068hhh0068h(Context context) throws InterruptedException {
        vvvmmmv[] vvvmmmvVarArr = null;
        try {
            if (this.ggg00670067gg) {
                vvvmmmvVarArr = (vvvmmmv[]) this.gg00670067ggg.findAllProcs(context, vvvmmmv.class, this.g00670067g0067gg);
            }
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006E006En006Enn("&:NDRB}\"OEG\u001d", (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843024)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258530)), th);
            int i = xx0078007800780078x;
            if (((x00780078007800780078x + i) * i) % xxxxxx0078 != 0) {
                xx0078007800780078x = x0078xxxx0078();
                xx0078xxx0078 = 33;
            }
        }
        if (!Thread.interrupted()) {
            return vvvmmmvVarArr;
        }
        vvvmvmv.i(g00670067gggg, vvvmmvm.n006En006E006Enn("~\u0014\u001f\u0013\u0010\u0014P\u001b!(\u001a()-).Z \"2$#5''od:/:8A4:4", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036588019)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496256)), (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587844))));
        throw new InterruptedException();
    }

    public void hh0068006800680068h(int i) {
        int i2 = 3;
        while (true) {
            try {
                i2 /= 0;
            } catch (Exception unused) {
                xx0078007800780078x = 59;
                this.g00670067g0067gg = i;
                return;
            }
        }
    }

    public int hh006800680068hh() {
        try {
            if (this.ggg00670067gg) {
                return this.gg00670067ggg.cancel();
            }
            return -1;
        } catch (Throwable th) {
            String str = g00670067gggg;
            String strN006E006En006Enn = vvvmmvm.n006E006En006Enn("\u0014&8,8&_\u0002-!!t", (char) (vmmmvvm.hh0068h006800680068() ^ 263258568), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843032)));
            int i = xx0078007800780078x;
            if (((x00780078007800780078x + i) * i) % xxxxxx0078 != xx0078xxx0078) {
                xx0078007800780078x = 50;
                xx0078xxx0078 = x0078xxxx0078();
            }
            vvvmvmv.vmvmvmv.e(str, strN006E006En006Enn, th);
            return -1;
        }
    }

    @Nullable
    public vvvmmmv[] hh00680068h0068h(@Nonnull Context context) throws InterruptedException {
        vvvmmmv[] vvvmmmvVarArr = null;
        try {
            if (this.ggg00670067gg) {
                vvvmmmvVarArr = (vvvmmmv[]) this.gg00670067ggg.findRunningProcs(context, vvvmmmv.class, this.g00670067g0067gg);
            }
        } catch (Throwable th) {
            String str = g00670067gggg;
            int iHh0068h006800680068 = vmmmvvm.hh0068h006800680068() ^ 263258434;
            int i = xx0078007800780078x;
            if (((x00780078007800780078x + i) * i) % xxx0078xx0078() != xx0078xxx0078) {
                xx0078007800780078x = 76;
                xx0078xxx0078 = 77;
            }
            vvvmvmv.e(str, vvvmmvm.n006E006En006Enn("#5G;G5n\u0011<00\u0004", (char) iHh0068h006800680068, (char) (vvmmvvm.hhhh006800680068() ^ (-1058496244))), th);
        }
        if (!Thread.interrupted()) {
            return vvvmmmvVarArr;
        }
        vvvmvmv.i(g00670067gggg, vvvmmvm.n006E006En006Enn("r\u0006\u000f\u0001{}8\u0001\u0005\ny\u0006\u0005\u0007\u0001\u0004.qq\u007fol|lj1$wjsovgkc", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587810)), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496248))));
        throw new InterruptedException();
    }

    public boolean hh0068h00680068h(@Nonnull Context context, @Nonnull final String str, boolean z, boolean z2) {
        String absolutePath = context.getFilesDir().getAbsolutePath();
        String str2 = context.getApplicationInfo().nativeLibraryDir;
        if (!h00680068h00680068h(absolutePath, str, z, z2)) {
            String[] list = new File(str2).list(new FilenameFilter() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxdsh.vmmmvmv.1
                public static int x00780078xx00780078 = 1;
                public static int xx0078xx00780078 = 14;
                public static int xxx0078x00780078 = 2;

                public static int x0078x0078x00780078() {
                    return 99;
                }

                @Override // java.io.FilenameFilter
                public boolean accept(File file, @Nonnull String str3) {
                    int i = xx0078xx00780078;
                    if (((x00780078xx00780078 + i) * i) % xxx0078x00780078 != 0) {
                        xx0078xx00780078 = 25;
                        x00780078xx00780078 = x0078x0078x00780078();
                    }
                    return str3.contains(str);
                }
            });
            if (list != null && list.length != 0) {
                this.g0067g00670067gg = true;
            }
        }
        boolean z3 = this.ggg00670067gg;
        int i = xx0078007800780078x;
        if (((x00780078007800780078x + i) * i) % xxxxxx0078 != 0) {
            xx0078007800780078x = x0078xxxx0078();
            xx0078xxx0078 = 7;
        }
        return z3;
    }

    @Nullable
    public vvvmmmv[] hh0068hh0068h(Context context) throws InterruptedException {
        vvvmmmv[] vvvmmmvVarArr = null;
        try {
            if (this.ggg00670067gg) {
                if ((x0078xxxx0078() * (x0078xxxx0078() + x00780078007800780078x)) % xxxxxx0078 != xx0078xxx0078) {
                    xx0078007800780078x = 71;
                    xx0078xxx0078 = x0078xxxx0078();
                }
                vvvmmmvVarArr = (vvvmmmv[]) this.gg00670067ggg.findInstalledProcs(context, vvvmmmv.class, this.g00670067g0067gg);
            }
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006En006E006Enn("\u001d\u001f$\u000b\u0002c\u0010%;\u001f\u0016X", (char) (vmvmvvm.hhh0068h00680068() ^ (-2036587918)), (char) (vmmmvvm.hh0068h006800680068() ^ 263258577), (char) (vmmmvvm.hh0068h006800680068() ^ 263258535)), th);
        }
        if (!Thread.interrupted()) {
            return vvvmmmvVarArr;
        }
        vvvmvmv.i(g00670067gggg, vvvmmvm.n006E006En006Enn("\u000e!*\u001c\u0017\u0019S\u001c %\u0015! \"\u001c\u001fI\r\r\u001b\u000b\b\u0018\b\u0006L?\u0013\u0006\u000f\u000b\u0012\u0003\u0007~", (char) (vmmmvvm.hh0068h006800680068() ^ 263258598), (char) (vvmmvvm.hhhh006800680068() ^ (-1058496248))));
        throw new InterruptedException();
    }

    public boolean hhh006800680068h() {
        return this.ggg00670067gg;
    }

    @Nullable
    public short[] hhh0068h0068h(String[] strArr) {
        try {
            if (!this.ggg00670067gg) {
                return null;
            }
            int i = xx0078007800780078x;
            if (((x00780078007800780078x + i) * i) % xxx0078xx0078() != 0) {
                xx0078007800780078x = 57;
                xx0078xxx0078 = x0078xxxx0078();
            }
            return this.gg00670067ggg.findPermissions(strArr);
        } catch (Throwable th) {
            vvvmvmv.e(g00670067gggg, vvvmmvm.n006E006En006Enn("\u000enE!\u007fC\u0010UD\u001c\u0015M", (char) (vmmmvvm.hh0068h006800680068() ^ 263258431), (char) (vvvvmvm.h00680068h006800680068() ^ (-1872843035))), th);
            return null;
        }
    }
}
