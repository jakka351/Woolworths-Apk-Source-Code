package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import com.lexisnexisrisk.threatmetrix.rl.NativeGathererHelper;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llllqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lllqlql {
    private static final String r00720072r0072rr = lqlqqll.u00750075u00750075u(lllqlql.class);
    private static final String r0072r00720072rr = "Thread interrupt detected, throwing";
    private static final String rrr00720072rr = "Native code:";
    public boolean r0072007200720072rr;
    private boolean r0072rrr0072r;
    private final NativeGathererHelper rr007200720072rr;
    private final Lock rrrrr0072r;

    public static class llqqlql {
        private static final lllqlql rrr0072r0072r = new lllqlql();

        private llqqlql() {
        }
    }

    private lllqlql() {
        this.r0072007200720072rr = false;
        this.rrrrr0072r = new ReentrantLock();
        this.r0072rrr0072r = false;
        this.rr007200720072rr = new NativeGathererHelper();
    }

    @Nullable
    public static llllqql.lqllqql[] h00680068h00680068h() {
        try {
            if (h0068hhhh0068().h00680068h0068h0068()) {
                return (llllqql.lqllqql[]) h0068hhhh0068().hh0068hhh0068().getAddresses(llllqql.lqllqql.class);
            }
            return null;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    public static lllqlql h0068hhhh0068() {
        return llqqlql.rrr0072r0072r;
    }

    public int h00680068006800680068h() {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.getCpuCores();
            }
            return 0;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return 0;
        }
    }

    public void h0068006800680068h0068(int i) {
        try {
            if (this.r0072007200720072rr) {
                this.rr007200720072rr.setInfoLogging(i);
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
    }

    public String h006800680068hh0068(String str) {
        try {
            return this.r0072007200720072rr ? this.rr007200720072rr.getTextSectionHash(str) : "";
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return "";
        }
    }

    public boolean h00680068h0068h0068() {
        return this.r0072007200720072rr;
    }

    @Nullable
    public String h00680068hh00680068(@Nullable String str) {
        try {
            if (!this.r0072007200720072rr || str == null) {
                return null;
            }
            return this.rr007200720072rr.urlEncode(str);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public String[] h00680068hhh0068() throws InterruptedException {
        String[] networkInfo = null;
        try {
            if (this.r0072007200720072rr && nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 < nnlllnn.nnnnnln.nnlnnln.ss00730073007300730073) {
                networkInfo = this.rr007200720072rr.getNetworkInfo();
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        if (!Thread.interrupted()) {
            return networkInfo;
        }
        lqlqqll.uuu007500750075u(r00720072r0072rr, r0072r00720072rr);
        throw new InterruptedException();
    }

    @Nullable
    public String h0068h006800680068h() {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.getBinaryArch();
            }
            return null;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nonnull
    public String h0068h00680068h0068(String str) {
        try {
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        int iJniDetectedDebugStatus = this.r0072007200720072rr ? this.rr007200720072rr.jniDetectedDebugStatus(str) : -1;
        if (-1 == iJniDetectedDebugStatus) {
            return "";
        }
        return String.valueOf(iJniDetectedDebugStatus > 0);
    }

    public int h0068h0068h00680068() {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.waitUntilCancelled();
            }
            return -1;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return -1;
        }
    }

    @Nullable
    public lqqlqlq h0068h0068hh0068() throws InterruptedException {
        int selinuxMode;
        lqqlqlq lqqlqlqVar = null;
        try {
            if (this.r0072007200720072rr && ((selinuxMode = this.rr007200720072rr.getSelinuxMode()) >= 0 || selinuxMode <= 4)) {
                lqqlqlqVar = lqqlqlq.values()[selinuxMode];
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        if (!Thread.interrupted()) {
            return lqqlqlqVar;
        }
        lqlqqll.uuu007500750075u(r00720072r0072rr, r0072r00720072rr);
        throw new InterruptedException();
    }

    @Nullable
    public String[] h0068hh00680068h(@Nullable String[] strArr) throws InterruptedException {
        String[] strArrCheckURLs = null;
        try {
            lqlqqll.uuu007500750075u(r00720072r0072rr, this.r0072007200720072rr ? " available " : "not available ");
            if (this.r0072007200720072rr && strArr != null) {
                strArrCheckURLs = this.rr007200720072rr.checkURLs(strArr);
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        if (!Thread.interrupted()) {
            return strArrCheckURLs;
        }
        lqlqqll.uuu007500750075u(r00720072r0072rr, r0072r00720072rr);
        throw new InterruptedException();
    }

    public boolean h0068hh0068h0068(@Nonnull nlllnnl nlllnnlVar, @Nonnull final String str, boolean z, boolean z2) {
        String strO006F006Foo006F006F = new nnlllnn.nllllnn(nlllnnlVar).o006F006Foo006F006F();
        try {
            if (!hh0068h0068h0068(str, z, z2)) {
                String[] list = new File(strO006F006Foo006F006F).list(new FilenameFilter() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lllqlql.1
                    @Override // java.io.FilenameFilter
                    public boolean accept(File file, @Nonnull String str2) {
                        return str2.contains(str);
                    }
                });
                if (list != null && list.length != 0) {
                    this.r0072rrr0072r = true;
                }
            }
        } catch (SecurityException e) {
            lqlqqll.uuu007500750075u(r00720072r0072rr, "lib directory not available " + e.toString());
        }
        return this.r0072007200720072rr;
    }

    @Nullable
    public String h0068hhh00680068(@Nullable byte[] bArr) {
        try {
            if (!this.r0072007200720072rr || bArr == null) {
                return null;
            }
            return this.rr007200720072rr.sha1HexEncode(bArr);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public String hh0068006800680068h(@Nonnull nlllnnl nlllnnlVar) {
        try {
            if (!this.r0072007200720072rr || nnlllnn.nnnnnln.nlnnnln.ss00730073ss0073 >= nnlllnn.nnnnnln.nnlnnln.ss00730073007300730073) {
                return null;
            }
            return this.rr007200720072rr.getConnections(nlllnnlVar.ww0077w007700770077);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public String hh006800680068h0068(@Nullable String str) {
        try {
            if (!this.r0072007200720072rr || str == null) {
                return null;
            }
            return this.rr007200720072rr.md5(str);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public String hh00680068h00680068(@Nullable String str, @Nullable String str2) {
        try {
            if (this.r0072007200720072rr && llqllqq.g006700670067006700670067g(str2) && llqllqq.g006700670067006700670067g(str)) {
                return this.rr007200720072rr.xor(str, str2);
            }
            return null;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    public long hh00680068hh0068(int i) {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.getTamperCode(i);
            }
            return 0L;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return 0L;
        }
    }

    public void hh0068h00680068h() {
        if (this.r0072007200720072rr) {
            this.rr007200720072rr.finit();
        }
        this.r0072007200720072rr = false;
    }

    public boolean hh0068h0068h0068(String str, boolean z, boolean z2) {
        if (this.r0072007200720072rr) {
            return true;
        }
        try {
            this.rrrrr0072r.lock();
            boolean z3 = this.r0072007200720072rr;
            if (z3) {
                this.rrrrr0072r.unlock();
                return z3;
            }
            try {
                boolean zH006800680068h00680068 = this.rr007200720072rr.h006800680068h00680068(str, z, z2);
                this.r0072007200720072rr = zH006800680068h00680068;
                lqlqqll.uuu007500750075u(r00720072r0072rr, zH006800680068h00680068 ? "lib available " : "lib not available ");
            } catch (NullPointerException e) {
                e = e;
                lqlqqll.uuuu00750075u(r00720072r0072rr, "lib not available " + e.getMessage());
                this.r0072007200720072rr = false;
                this.rrrrr0072r.unlock();
                return this.r0072007200720072rr;
            } catch (SecurityException e2) {
                e = e2;
                lqlqqll.uuuu00750075u(r00720072r0072rr, "lib not available " + e.getMessage());
                this.r0072007200720072rr = false;
                this.rrrrr0072r.unlock();
                return this.r0072007200720072rr;
            } catch (UnsatisfiedLinkError e3) {
                e = e3;
                lqlqqll.uuuu00750075u(r00720072r0072rr, "lib not available " + e.getMessage());
                this.r0072007200720072rr = false;
                this.rrrrr0072r.unlock();
                return this.r0072007200720072rr;
            } catch (Throwable th) {
                lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
                this.r0072007200720072rr = false;
                this.rrrrr0072r.unlock();
                return this.r0072007200720072rr;
            }
            this.rrrrr0072r.unlock();
            return this.r0072007200720072rr;
        } catch (Throwable th2) {
            this.rrrrr0072r.unlock();
            throw th2;
        }
    }

    @Nullable
    public String hh0068hh00680068(@Nullable byte[] bArr) {
        try {
            if (!this.r0072007200720072rr || bArr == null) {
                return null;
            }
            return this.rr007200720072rr.sha256HexEncode(bArr);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nonnull
    public NativeGathererHelper hh0068hhh0068() {
        return this.rr007200720072rr;
    }

    public long hhh006800680068h(String str, boolean z) {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.getAppTime(str, z);
            }
            return 0L;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return 0L;
        }
    }

    public boolean hhh00680068h0068() {
        return this.r0072rrr0072r;
    }

    public String hhh0068h00680068(String str) {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.validatePackage(str);
            }
            return null;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public String hhh0068hh0068(int i) {
        try {
            if (!this.r0072007200720072rr || i <= 0) {
                return null;
            }
            return this.rr007200720072rr.getRandomString(i);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    public int hhhh00680068h() {
        try {
            if (this.r0072007200720072rr) {
                return this.rr007200720072rr.cancel();
            }
            return -1;
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return -1;
        }
    }

    @Nullable
    public String hhhh0068h0068(@Nullable String str, nnlnlll nnlnlllVar) throws InterruptedException {
        String strHashFile = null;
        try {
            if (this.r0072007200720072rr && llqllqq.g006700670067006700670067g(str)) {
                strHashFile = this.rr007200720072rr.hashFile(str, nnlnlllVar.k006B006B006B006B006Bk);
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        if (!Thread.interrupted()) {
            return strHashFile;
        }
        lqlqqll.uuu007500750075u(r00720072r0072rr, r0072r00720072rr);
        throw new InterruptedException();
    }

    @Nullable
    public String hhhhh00680068(@Nonnull byte[] bArr) {
        try {
            if (!this.r0072007200720072rr || bArr == null || bArr.length <= 0) {
                return null;
            }
            return this.rr007200720072rr.sha1Base32Encode(bArr);
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
            return null;
        }
    }

    @Nullable
    public List<String> hhhhhh0068(@Nullable String str) throws InterruptedException {
        String[] fontList;
        List<String> listAsList = null;
        try {
            if (this.r0072007200720072rr && str != null && (fontList = this.rr007200720072rr.getFontList(str)) != null) {
                listAsList = Arrays.asList(fontList);
            }
        } catch (Throwable th) {
            lqlqqll.u0075uu00750075u(r00720072r0072rr, rrr00720072rr, th);
        }
        if (!Thread.interrupted()) {
            return listAsList;
        }
        lqlqqll.uuu007500750075u(r00720072r0072rr, r0072r00720072rr);
        throw new InterruptedException();
    }
}
