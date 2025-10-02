package com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingconnections.kuukkkk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public final class TMXProfilingConnections implements TMXProfilingConnectionsInterface, TMXModuleMetadataProviderInterface {
    private static final String hh00680068006800680068 = kuukkkk.cc0063ccc0063(TMXProfilingConnections.class);
    public static int m006D006Dmmmm = 1;
    public static int m006Dmmmmm = 30;
    public static int mm006Dmmmm = 0;
    public static int mmm006Dmmm = 2;
    public static String r0072rrrrr;

    @Nonnull
    private final List<kukkukk> rr0072rrrr = new ArrayList(2);

    @Nullable
    private byte[][] r0072r0072rrr = null;

    @Nullable
    private byte[][] rr00720072rrr = null;
    private final ExecutorService r007200720072rrr = Executors.newCachedThreadPool();
    private volatile int r00720072rrrr = ModuleDescriptor.MODULE_VERSION;
    private volatile int rrr0072rrr = 0;

    public class kukkukk extends FutureTask<Void> {
        public kukkukk(Runnable runnable, Void r3) {
            super(runnable, r3);
        }

        @Override // java.util.concurrent.FutureTask, java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            super.run();
            synchronized (TMXProfilingConnections.this.rr0072rrrr) {
                TMXProfilingConnections.this.rr0072rrrr.remove(this);
            }
        }
    }

    static {
        int i = m006Dmmmmm;
        if (((m006D006Dmmmm + i) * i) % mmm006Dmmm != 0) {
            m006Dmmmmm = m006Dm006Dmmm();
            mm006Dmmmm = 85;
        }
        r0072rrrrr = null;
    }

    public static void hsfpdm01(String str) {
        if (kkuukkk.ccc0063c00630063(str)) {
            kuukkkk.kkkukkk.c0063cc0063cc(hh00680068006800680068, kukuukk.kkk006B006B006Bk("=b\u0012\u00057s\u0017YXb5f]8Fv\u0002N=\u000fe*\\\">er", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535322)), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535187)), (char) (kkkkuku.kkkk006Bk006B() ^ 797363562)));
            return;
        }
        String str2 = hh00680068006800680068;
        StringBuilder sb = new StringBuilder();
        if ((m006Dm006Dmmm() * (m006Dm006Dmmm() + m006D006Dmmmm)) % mmm006Dmmm != mm006Dmmmm) {
            m006Dmmmmm = m006Dm006Dmmm();
            mm006Dmmmm = 40;
        }
        sb.append(kukuukk.kkk006B006B006Bk("v\b\u0016\u0015\t\r\u0005<\u0002\u000b9|\u0007\u0004v}\u00022\u0006\u007f/", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121561), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121594), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233339))));
        sb.append(str);
        kuukkkk.kkkukkk.c0063cc0063cc(str2, sb.toString());
        r0072rrrrr = str;
    }

    private static void k006Bk006B006Bkk(@Nullable List<String> list) throws IllegalArgumentException {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (str == null || !kkuukkk.c006300630063c00630063(str) || 64 != str.length()) {
                    kuukkkk.c0063cccc0063(hh00680068006800680068, kukuukk.kk006Bk006B006Bk("h\r\u0014}\b\u0004}8z{\b\t|xzsp\u0003r;[\u007fktpiPi|\"gi.&#/,-#',V12S\" \u001d)N\u0001tl\\^^G\b\u0018\nC\u0004\u0005\u0004EORB@", (char) (kkkkuku.kkkk006Bk006B() ^ 797363568), (char) (kkuukku.kk006Bkkk006B() ^ (-1182535348))), str);
                    if ((m006Dm006Dmmm() * (m006Dm006Dmmm() + m006D006Dmmmm)) % mmm006Dmmm != mm006Dmmmm) {
                        m006Dmmmmm = 0;
                        mm006Dmmmm = m006Dm006Dmmm();
                    }
                    throw new IllegalArgumentException(kukuukk.kk006Bk006B006Bk("\u0004\u001e%'\u001f\u001dW+%T\u001d!\u001b%iNv\u001b\"\f\u0016\u0012\fF\t\n\u0016\u0017\u000b\u0007\t\u0002~\u0011\u0001I\n\u000ey\u0003~w^w\u000b0bVN>@@)phym2", (char) (kkuukku.kk006Bkkk006B() ^ (-1182535190)), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121615)));
                }
            }
        }
    }

    public static int m006D006D006Dmmm() {
        return 0;
    }

    public static int m006Dm006Dmmm() {
        return 26;
    }

    public static int mm006D006Dmmm() {
        return 1;
    }

    public static int mmmm006Dmm() {
        return 2;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    public void cancelProfiling() {
        synchronized (this.rr0072rrrr) {
            try {
                Iterator<kukkukk> it = this.rr0072rrrr.iterator();
                while (it.hasNext()) {
                    it.next().cancel(true);
                }
                this.rr0072rrrr.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    public void closeSocket(String str, int i) {
        kukukkk.c0063006300630063c0063().closeSocket(str, i);
        int i2 = m006Dmmmmm;
        if (((m006D006Dmmmm + i2) * i2) % mmm006Dmmm != 0) {
            m006Dmmmmm = 41;
            mm006Dmmmm = m006Dm006Dmmm();
        }
    }

    @Nonnull
    public TMXProfilingConnections disableNonfatalLogs() {
        int i = m006Dmmmmm;
        if (((m006D006Dmmmm + i) * i) % mmm006Dmmm != 0) {
            m006Dmmmmm = 96;
            mm006Dmmmm = 69;
        }
        kuukkkk.cccc0063c0063(true);
        return this;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXModuleMetadataProviderInterface
    public String getModuleVersion() {
        char cK006Bk006Bkk006B = (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233241));
        char cK006Bk006Bkk006B2 = (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233338));
        if ((m006Dm006Dmmm() * (m006Dm006Dmmm() + m006D006Dmmmm)) % mmm006Dmmm != mm006Dmmmm) {
            m006Dmmmmm = 19;
            mm006Dmmmm = m006Dm006Dmmm();
        }
        return kukuukk.kk006Bk006B006Bk("\u0018iA\u0016\u00138L\u0004\u001b?=", cK006Bk006Bkk006B, cK006Bk006Bkk006B2);
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    public void httpRequest(@Nonnull TMXProfilingConnectionsInterface.HttpMethod httpMethod, @Nonnull String str, Map<String, String> map, byte[] bArr, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        kuuukkk kuuukkkVar = new kuuukkk(this.r0072r0072rrr, this.rr00720072rrr, this.r00720072rrrr);
        if (((mm006D006Dmmm() + m006Dmmmmm) * m006Dmmmmm) % mmm006Dmmm != mm006Dmmmm) {
            m006Dmmmmm = 79;
            mm006Dmmmm = m006Dm006Dmmm();
        }
        k006B006Bk006Bkk(new kkukkkk(kuuukkkVar, httpMethod, str, map, bArr, this.rrr0072rrr, tMXCallback));
    }

    public void k006B006Bk006Bkk(Runnable runnable) {
        kukkukk kukkukkVar = new kukkukk(runnable, null);
        synchronized (this.rr0072rrrr) {
            this.rr0072rrrr.add(kukkukkVar);
        }
        this.r007200720072rrr.execute(kukkukkVar);
    }

    public List<kukkukk> kkk006B006Bkk() {
        int i = 4;
        while (true) {
            try {
                i /= 0;
            } catch (Exception unused) {
                return this.rr0072rrrr;
            }
        }
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    public void resolveHostByName(String str) {
        k006B006Bk006Bkk(new kukkkkk(str));
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    public void sendSocketRequest(@Nonnull String str, int i, @Nonnull byte[] bArr, boolean z, TMXProfilingConnectionsInterface.TMXCallback tMXCallback) {
        kukukkk kukukkkVarC0063006300630063c0063 = kukukkk.c0063006300630063c0063();
        int i2 = m006Dmmmmm;
        if (((mm006D006Dmmm() + i2) * i2) % mmm006Dmmm != 0) {
            m006Dmmmmm = m006Dm006Dmmm();
            mm006Dmmmm = m006Dm006Dmmm();
        }
        kukukkkVarC0063006300630063c0063.sendSocketRequest(str, i, bArr, z, tMXCallback);
    }

    @Nonnull
    public TMXProfilingConnections setCertificateHashes(String str) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        int i = m006Dmmmmm;
        if (((mm006D006Dmmm() + i) * i) % mmm006Dmmm != 0) {
            m006Dmmmmm = 91;
            mm006Dmmmm = m006Dm006Dmmm();
        }
        arrayList.add(str);
        k006Bk006B006Bkk(arrayList);
        this.r0072r0072rrr = kkuukkk.cc00630063c00630063(arrayList);
        return this;
    }

    public TMXProfilingConnections setConnectionTimeout(int i, TimeUnit timeUnit) {
        this.r00720072rrrr = (int) timeUnit.toMillis(i);
        if (this.r00720072rrrr < 1) {
            int i2 = m006Dmmmmm;
            if (((m006D006Dmmmm + i2) * i2) % mmm006Dmmm != mm006Dmmmm) {
                m006Dmmmmm = 81;
                mm006Dmmmm = 82;
            }
            this.r00720072rrrr = 1;
        }
        return this;
    }

    public TMXProfilingConnections setRetryTimes(int i) {
        int i2 = m006Dmmmmm;
        if (((m006D006Dmmmm + i2) * i2) % mmm006Dmmm != 0) {
            m006Dmmmmm = 86;
            mm006Dmmmm = m006Dm006Dmmm();
        }
        if (i <= 0) {
            i = 0;
        }
        this.rrr0072rrr = i;
        return this;
    }

    @Nonnull
    public TMXProfilingConnections setSubjectPublicKeyInfoHashes(String str) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        int i = m006Dmmmmm;
        if (((m006D006Dmmmm + i) * i) % mmmm006Dmm() != mm006Dmmmm) {
            m006Dmmmmm = m006Dm006Dmmm();
            mm006Dmmmm = m006Dm006Dmmm();
        }
        k006Bk006B006Bkk(arrayList);
        this.rr00720072rrr = kkuukkk.cc00630063c00630063(arrayList);
        return this;
    }

    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface
    @Deprecated
    public void socketRequest(String str, int i, String str2) {
    }

    @Nonnull
    public TMXProfilingConnections setCertificateHashes(@Nullable List<String> list) throws IllegalArgumentException {
        k006Bk006B006Bkk(list);
        int i = m006Dmmmmm;
        if (((m006D006Dmmmm + i) * i) % mmm006Dmmm != mm006Dmmmm) {
            m006Dmmmmm = 75;
            mm006Dmmmm = 6;
        }
        kuukkkk.kkkukkk.c0063cc0063cc(hh00680068006800680068, kukuukk.kkk006B006B006Bk("5\rw3DFLYuj\u0007\u007fA\u001f\u001dN0Ab8<7\tb)\u0014k7", (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121564), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121641), (char) (kuuukku.k006Bk006Bkk006B() ^ (-910233343))) + list);
        this.r0072r0072rrr = kkuukkk.cc00630063c00630063(list);
        return this;
    }

    public TMXProfilingConnections setSubjectPublicKeyInfoHashes(List<String> list) throws IllegalArgumentException {
        k006Bk006B006Bkk(list);
        kuukkkk.kkkukkk.c0063cc0063cc(hh00680068006800680068, kukuukk.kk006Bk006B006Bk(">\u0018\u0011HS\u00197H\u001c5SD\u000f\u001d{\u0018m\n4E/)\u000e\t('i", (char) (kkkkuku.kkkk006Bk006B() ^ 797363490), (char) (kukukku.k006B006B006B006B006Bk() ^ 1285121612)) + list);
        if ((m006Dm006Dmmm() * (m006Dm006Dmmm() + m006D006Dmmmm)) % mmm006Dmmm != m006D006D006Dmmm()) {
            m006Dmmmmm = m006Dm006Dmmm();
            mm006Dmmmm = m006Dm006Dmmm();
        }
        this.rr00720072rrr = kkuukkk.cc00630063c00630063(list);
        return this;
    }
}
