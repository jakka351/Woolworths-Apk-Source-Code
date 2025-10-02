package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import YU.a;
import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.lexisnexisrisk.threatmetrix.rl.TMXConfig;
import com.lexisnexisrisk.threatmetrix.rl.TMXEndNotifier;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingHandle;
import com.lexisnexisrisk.threatmetrix.rl.TMXProfilingOptions;
import com.lexisnexisrisk.threatmetrix.rl.TMXScanEndNotifier;
import com.lexisnexisrisk.threatmetrix.rl.TMXStatusCode;
import com.lexisnexisrisk.threatmetrix.rl.TMXStrongAuth;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjj;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofilingmodule.BuildConfig;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public abstract class jjjxxjj {
    private static final boolean v00760076vv0076v;
    public static final lqlllql v0076v0076v0076v;
    private static final String v0076vvv0076v;
    public static final String version = "7.6-46 : RL";
    private static final String vv0076vv0076v = "hsfpdm01";
    private static final int vvv0076v0076v = 3478;
    public final nlnllll v007600760076v0076v;
    public final llqqllq vv00760076v0076v;

    @Nullable
    private final jjjjxxj vvvv00760076v;

    @Nullable
    private final lqlqqqq v0076vv00760076v = new lqlqqqq();

    @Nullable
    private volatile Thread vv0076v00760076v = null;

    @Nullable
    private volatile Thread v00760076v00760076v = null;
    private volatile long vvv007600760076v = 0;
    private volatile int v0076v007600760076v = 0;
    private volatile boolean vv0076007600760076v = false;

    @Nullable
    private volatile lllqqql v00760076007600760076v = null;
    private int vvvvvv0076 = 30000;
    private volatile boolean v0076vvvv0076 = false;
    private volatile int vv0076vvv0076 = ModuleDescriptor.MODULE_VERSION;

    @Nullable
    public lllqqlq v00760076vvv0076 = null;

    @Nullable
    public jjxjxjj vvv0076vv0076 = null;
    public final lqllllq v0076v0076vv0076 = new lqllllq();

    @Nullable
    public nlllnnl vv00760076vv0076 = null;

    @Nullable
    public volatile TMXProfilingConnectionsInterface v007600760076vv0076 = null;
    public volatile int vvvv0076v0076 = TMXConfig.tttttt0074;
    public volatile boolean v0076vv0076v0076 = true;
    public final AtomicLong vv0076v0076v0076 = new AtomicLong(0);

    public interface jjjjxxj {
        boolean bindToGooglePlayService(@Nonnull nlllnnl nlllnnlVar);

        String getAdvertisingId(int i);
    }

    public enum jjjxxxj {
        PROFILE,
        SCAN_PACKAGES,
        INIT;

        public static jjjxxxj valueOf(String str) {
            return (jjjxxxj) nlnnnnn.ooo006F006Foo(jjjxxxj.class, str);
        }
    }

    public final class jjxjxxj extends Thread {

        @Nonnull
        public final Runnable m_runnable;

        public jjxjxxj(@Nonnull Runnable runnable) {
            this.m_runnable = runnable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.m_runnable.run();
        }
    }

    public static class jjxxjxj extends jxxjxxj {

        @Nonnull
        public CountDownLatch i00690069ii0069i;

        @Nonnull
        public String i0069i0069i0069i;

        @Nonnull
        public String ii00690069i0069i;

        @Nonnull
        public llqlqqq iii0069i0069i;

        public jjxxjxj(@Nonnull String str, @Nonnull CountDownLatch countDownLatch, @Nonnull llqlqqq llqlqqqVar, @Nonnull String str2, @Nonnull String str3) {
            super(str);
            this.i00690069ii0069i = countDownLatch;
            this.iii0069i0069i = llqlqqqVar;
            this.i0069i0069i0069i = str2;
            this.ii00690069i0069i = str3;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.jxxjxxj, com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) throws Throwable {
            String str;
            String str2;
            if (super.onComplete(tMXHttpResponseCode, inputStream)) {
                if (inputStream == null) {
                    str = jjjxxjj.v0076vvv0076v;
                    str2 = "Configure request succeeded but stream is null";
                } else {
                    try {
                        this.iii0069i0069i.gg00670067gg00670067(inputStream, this.i0069i0069i0069i, this.ii00690069i0069i);
                        this.i00690069ii0069i.countDown();
                        return true;
                    } catch (InterruptedIOException unused) {
                        str = jjjxxjj.v0076vvv0076v;
                        str2 = "Failed to read the input stream";
                    }
                }
                lqlqqll.uu0075uuu0075(str, str2);
            }
            this.i00690069ii0069i.countDown();
            return false;
        }
    }

    public static class jjxxxxj extends Exception {
        public final TMXStatusCode i00690069iii0069;

        public jjxxxxj(TMXStatusCode tMXStatusCode) {
            this.i00690069iii0069 = tMXStatusCode;
        }
    }

    public final class jxjjxxj implements Runnable {
        private boolean ii0069i00690069i = false;

        public jxjjxxj() {
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                lqqlqql.j006A006A006A006Ajj(jjjxxjj.this.vv00760076vv0076.ww0077w007700770077);
                jjjjxxj jjjjxxjVar = jjjxxjj.this.vvvv00760076v;
                String advertisingId = (jjjjxxjVar == null || !jjjxxjj.this.vv0076007600760076v || (jjjxxjj.this.vv0076v0076v0076.get() & llqqqql.cc0063cc00630063) == 0) ? null : jjjjxxjVar.getAdvertisingId(jjjxxjj.this.vvvv0076v0076 / 10);
                if (jjjxxjj.this.v0076v0076vv0076.j006Ajj006A006A006A() || Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                jjjxxjj jjjxxjjVar = jjjxxjj.this;
                jjjxxjjVar.vvv0076vv0076.ww00770077w00770077w(advertisingId, jjjxxjjVar.v0076v0076vv0076);
            } catch (InterruptedException unused) {
                this.ii0069i00690069i = true;
            }
        }

        public boolean ww0077w007700770077w() {
            return this.ii0069i00690069i;
        }
    }

    public class jxjxjxj extends jxxjxxj {
        public CountDownLatch i0069iii0069i;

        public jxjxjxj(@Nonnull String str, @Nonnull CountDownLatch countDownLatch) {
            super(str);
            this.i0069iii0069i = countDownLatch;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.jxxjxxj, com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) {
            if (!super.onComplete(tMXHttpResponseCode, inputStream)) {
                lqlqqll.uu0075uuu0075(jjjxxjj.v0076vvv0076v, "profiling will be incomplete");
                this.i0069iii0069i.countDown();
                return false;
            }
            lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "profile request complete");
            jjjxxjj.this.vvv007600760076v = System.currentTimeMillis();
            this.i0069iii0069i.countDown();
            return true;
        }
    }

    public class jxjxxxj implements TMXProfilingHandle {
        private final AtomicInteger i0069iiii0069 = new AtomicInteger(0);
        private final String iiiiii0069;

        public jxjxxxj(String str) {
            this.iiiiii0069 = str;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingHandle
        public void cancel() {
            jjjxxjj.this.w00770077w0077ww0077();
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingHandle
        public String getSessionID() {
            return this.iiiiii0069;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingHandle
        public void sendBehavioSecData() {
            if (this.i0069iiii0069.compareAndSet(0, 1)) {
                jjjxxjj.this.w0077w0077w0077w0077();
            }
        }
    }

    public static class jxxjxxj implements TMXProfilingConnectionsInterface.TMXCallback {

        @Nonnull
        public final String i0069i006900690069i;

        @Nonnull
        public TMXProfilingConnectionsInterface.TMXHttpResponseCode ii0069006900690069i = new TMXProfilingConnectionsInterface.TMXHttpResponseCode(-2);

        public jxxjxxj(@Nonnull String str) {
            this.i0069i006900690069i = str;
        }

        @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
        public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, InputStream inputStream) {
            this.ii0069006900690069i = tMXHttpResponseCode;
            if (tMXHttpResponseCode.succeeded()) {
                return true;
            }
            lqlqqll.uuu0075uu0075(jjjxxjj.v0076vvv0076v, "Failed to request {} with http response {}", this.i0069i006900690069i, tMXHttpResponseCode.toString());
            return false;
        }

        @Nonnull
        public TMXStatusCode w00770077w007700770077w() {
            int httpResponseCode = this.ii0069006900690069i.getHttpResponseCode();
            if (httpResponseCode == 200) {
                return TMXStatusCode.TMX_OK;
            }
            switch (httpResponseCode) {
                case -15:
                    return TMXStatusCode.TMX_CRLError;
                case -14:
                    return TMXStatusCode.TMX_CertStoreError;
                case -13:
                    return TMXStatusCode.TMX_CertPathValidatorError;
                case -12:
                    return TMXStatusCode.TMX_CertPathBuilderError;
                case -11:
                    return TMXStatusCode.TMX_CertificateParsingError;
                case -10:
                    return TMXStatusCode.TMX_CertificateNotYetValid;
                case -9:
                    return TMXStatusCode.TMX_CertificateExpired;
                case -8:
                    return TMXStatusCode.TMX_CertificateEncodingError;
                case -7:
                    return TMXStatusCode.TMX_CertificateError;
                case -6:
                    return TMXStatusCode.TMX_Certificate_Mismatch;
                case -5:
                    return TMXStatusCode.TMX_HostVerification_Error;
                case -4:
                    return TMXStatusCode.TMX_NetworkTimeout_Error;
                case -3:
                    return TMXStatusCode.TMX_HostNotFound_Error;
                case -2:
                    return TMXStatusCode.TMX_NotYet;
                default:
                    return TMXStatusCode.TMX_Connection_Error;
            }
        }
    }

    public final class jxxxjxj implements Runnable {
        public final TMXProfilingHandle.Result i006900690069i0069i;
        public final TMXEndNotifier iiii00690069i;

        public jxxxjxj(TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier) {
            this.i006900690069i0069i = result;
            this.iiii00690069i = tMXEndNotifier;
        }

        @Override // java.lang.Runnable
        public void run() {
            TMXEndNotifier tMXEndNotifier = this.iiii00690069i;
            if (tMXEndNotifier != null) {
                try {
                    tMXEndNotifier.complete(this.i006900690069i0069i);
                } catch (Throwable th) {
                    lqlqqll.uuuu00750075u(jjjxxjj.v0076vvv0076v, "Unexpected exception occurred when calling EndNotifier " + th);
                }
            }
        }
    }

    static {
        String strU00750075u00750075u = lqlqqll.u00750075u00750075u(jjjxxjj.class);
        v0076vvv0076v = strU00750075u00750075u;
        v0076v0076v0076v = new lqlllql();
        String property = System.getProperty("java.vm.version");
        boolean z = property != null && property.equals("2.0.0");
        v00760076vv0076v = z;
        if (z) {
            lqlqqll.uuu007500750075u(strU00750075u00750075u, "Broken join() detected, activating fallback routine");
        }
    }

    public jjjxxjj(@Nullable jjjjxxj jjjjxxjVar) {
        lqlllql lqlllqlVar = v0076v0076v0076v;
        this.vv00760076v0076v = new llqqllq(lqlllqlVar);
        this.v007600760076v0076v = new nlnllll(lqlllqlVar);
        this.vvvv00760076v = jjjjxxjVar;
    }

    private nllnlll w0077007700770077ww0077(@Nonnull String str, boolean z, @Nonnull TMXProfilingOptions tMXProfilingOptions, llqlqqq llqlqqqVar) throws Throwable {
        long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
        waitForInfoCollectionAndUpdateDefaultOptions(llqlqqqVar);
        this.v0076v0076vv0076.gggg0067ggg(true, z ? Long.valueOf(this.vvvv0076v0076 - llqlllq.g0067gg0067ggg().g0067g00670067ggg()) : null);
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("spf", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
        nllnlll nllnlllVar = new nllnlll();
        if (tMXProfilingOptions.wwwwww0077w() != null) {
            int i = 0;
            for (String str2 : tMXProfilingOptions.wwwwww0077w()) {
                StringBuilder sb = new StringBuilder("aca");
                int i2 = i + 1;
                sb.append(i);
                nllnlllVar.ddddd00640064(sb.toString(), str2, false);
                if (i2 >= 5) {
                    break;
                }
                i = i2;
            }
        }
        lqlqqqq lqlqqqqVar = this.v0076vv00760076v;
        long jF0066fff006600662 = nnlllnn.nlnnnnl.f0066fff00660066();
        nllnlll nllnlllVarW0077ww007700770077w = this.vvv0076vv0076.w0077ww007700770077w(llqlqqqVar, this.v00760076vvv0076.m006D006Dmm006Dm, str, lqlqqqqVar.getLocation(), nllnlllVar, v0076v0076v0076v, true);
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("rbf", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff006600662));
        return nllnlllVarW0077ww007700770077w;
    }

    private TMXStatusCode w007700770077w0077w0077(String str, nllnlll nllnlllVar) throws InterruptedException, jjxxxxj {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        lllqqlq lllqqlqVar = this.v00760076vvv0076;
        String strG00670067ggg0067g = lllqqlqVar.g00670067ggg0067g(lllqqlqVar.mm006Dmm006Dm, str, "clear.png");
        jxjxjxj jxjxjxjVar = new jxjxjxj(strG00670067ggg0067g, countDownLatch);
        byte[] bArrD006400640064d00640064 = nllnlllVar.d006400640064d00640064();
        this.v007600760076vv0076.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, strG00670067ggg0067g, lllqqlq.gggggg0067g(this.vvv0076vv0076, null, bArrD006400640064d00640064 == null ? 0 : bArrD006400640064d00640064.length), bArrD006400640064d00640064, jxjxjxjVar);
        if (!countDownLatch.await(this.vvvv0076v0076, TimeUnit.MILLISECONDS)) {
            throw new jjxxxxj(TMXStatusCode.TMX_NetworkTimeout_Error);
        }
        TMXStatusCode tMXStatusCodeW00770077w007700770077w = jxjxjxjVar.w00770077w007700770077w();
        TMXStatusCode tMXStatusCode = TMXStatusCode.TMX_OK;
        if (tMXStatusCodeW00770077w007700770077w == tMXStatusCode) {
            return tMXStatusCode;
        }
        throw new jjxxxxj(TMXStatusCode.TMX_PartialProfile);
    }

    private boolean w00770077w00770077w0077(@Nonnull llqlqqq llqlqqqVar) throws Throwable {
        if (!this.v00760076007600760076v.jjj006Ajj006A(llqlqqqVar.gggg0067g0067, llqlqqqVar.g0067gg0067g0067, "7.6-46 : RL", llqlqqqVar.gg0067g0067g0067)) {
            return false;
        }
        long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
        this.v00760076007600760076v.j006A006Ajjj006A(lllqqql.cc006300630063cc, "7.6-46 : RL");
        this.v00760076007600760076v.jj006Ajjj006A(lllqqql.c00630063c0063cc, llqlqqqVar.gggg0067g0067);
        this.v00760076007600760076v.jj006Ajjj006A(lllqqql.ccc00630063cc, llqlqqqVar.g0067gg0067g0067);
        this.v00760076007600760076v.j006Ajjjj006A(lllqqql.c0063c00630063cc, llqlqqqVar.gg0067g0067g0067);
        jjxxjjj.ww0077ww00770077w().w0077www00770077w("pso", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
        return true;
    }

    private boolean w00770077ww0077w0077() {
        nlllnnl nlllnnlVar = this.vv00760076vv0076;
        boolean z = nlllnnlVar == null || lqlllll.y007900790079y00790079(nlllnnlVar);
        return this.vvv007600760076v == 0 ? z : z || this.v0076vv0076v0076;
    }

    public static long w0077w007700770077w0077(long j, long j2, String str) {
        if (j >= 0 && (j2 == 0 || j <= j2)) {
            return j;
        }
        lqlqqll.uu0075u00750075u(v0076vvv0076v, "Invalid value for {}, {}", str, String.valueOf(j));
        throw new IllegalArgumentException(a.h("Invalid value for {", str, "}"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0077w00770077ww0077(@Nonnull String str, @Nullable String str2, @Nullable String str3, @Nonnull String str4, @Nonnull String str5, @Nonnull TMXStrongAuth.AuthMethod authMethod, boolean z, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier, boolean z2) {
        TMXStatusCode tMXStatusCode;
        TMXStrongAuth.AuthParamResult authParamResultO006F006F006F006F006Fo;
        TMXStatusCode tMXStatusCode2 = null;
        try {
            try {
                if (!this.v0076v0076vv0076.jjj006A006A006A006A()) {
                    lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: init() is not called");
                    ww0077w0077ww0077(str, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                    return;
                }
                if (!this.v0076v0076vv0076.g006700670067gggg(this.vvvv0076v0076)) {
                    lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: Timeout while waiting for init to finish");
                    ww0077w0077ww0077(str, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                    return;
                }
                lqlllql lqlllqlVar = v0076v0076v0076v;
                nnnnlnn nnnnlnnVarUu00750075007500750075 = lqlllqlVar.uu00750075007500750075();
                if ((this.vv0076v0076v0076.get() & llqqqql.cc00630063c00630063) != 0 && nnnnlnnVarUu00750075007500750075 != null) {
                    nlllnnl nlllnnlVar = this.vv00760076vv0076;
                    if (nlllnnlVar == null) {
                        ww0077w0077ww0077(str, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                        return;
                    }
                    new jjxjxxj(new jxjjxxj()).start();
                    llqlqqq llqlqqqVarWwwww0077w0077 = wwwww0077w0077(str);
                    String str6 = llqlqqqVarWwwww0077w0077.ggg0067006700670067;
                    if (!llqlqqqVarWwwww0077w0077.g00670067ggg0067) {
                        lqlqqll.uuuu00750075u(v0076vvv0076v, "StrongAuth Failed: Authentication module is not enabled, please contact ThreatMetrix support.");
                        ww0077w0077ww0077(str, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                        return;
                    }
                    waitForInfoCollectionAndUpdateDefaultOptions(llqlqqqVarWwwww0077w0077);
                    String str7 = str3 == null ? "" : str3;
                    byte[] bArrGg0067g006700670067g = llqllqq.gg0067g006700670067g(llqlqqqVarWwwww0077w0077.g00670067g006700670067);
                    if (z2) {
                        authParamResultO006F006F006F006F006Fo = nnnnlnnVarUu00750075007500750075.oo006F006F006F006Fo(nlllnnlVar.ww0077w007700770077, str7, str4, str5, bArrGg0067g006700670067g, strongAuthCallback);
                    } else {
                        boolean zIsAvailable = lllqlqq.isAvailable(nlllnnlVar.ww0077w007700770077);
                        authParamResultO006F006F006F006F006Fo = nnnnlnnVarUu00750075007500750075.o006F006F006F006F006Fo(nlllnnlVar.ww0077w007700770077, authMethod, str7, str4, str5, bArrGg0067g006700670067g, strongAuthCallback, zIsAvailable, zIsAvailable ? lllqlqq.g0067ggg0067g : null, zIsAvailable ? lllqlqq.gg006700670067gg : 0L);
                    }
                    TMXStrongAuth.AuthParamResult authParamResult = authParamResultO006F006F006F006F006Fo;
                    nllnlll nllnlllVar = new nllnlll();
                    if (llqllqq.g006700670067006700670067g(str2)) {
                        nllnlllVar.dd006400640064d0064("sarq", str2);
                    }
                    if (authParamResult == null) {
                        lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: ");
                        ww0077w0077ww0077(str, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                        return;
                    }
                    if (z) {
                        TMXStatusCode tMXStatusCode3 = authParamResult.qq0071q00710071q.q0071q007100710071q;
                        if (tMXStatusCode3 != TMXStatusCode.TMX_OK) {
                            try {
                                lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: " + tMXStatusCode3);
                                ww0077w0077ww0077(str, tMXStatusCode3, tMXEndNotifier);
                                return;
                            } catch (jjxxxxj e) {
                                e = e;
                                tMXStatusCode2 = tMXStatusCode3;
                                tMXStatusCode = e.i00690069iii0069;
                                ww0077w0077ww0077(str, tMXStatusCode, tMXEndNotifier);
                                return;
                            } catch (IllegalArgumentException unused) {
                                tMXStatusCode2 = tMXStatusCode3;
                                tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Unsupported;
                                ww0077w0077ww0077(str, tMXStatusCode, tMXEndNotifier);
                                return;
                            } catch (InterruptedException e2) {
                                e = e2;
                                tMXStatusCode2 = tMXStatusCode3;
                                lqlqqll.u0075u007500750075u(v0076vvv0076v, "StrongAuth request interrupted: ", e);
                                tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Cancelled;
                                ww0077w0077ww0077(str, tMXStatusCode, tMXEndNotifier);
                                return;
                            } catch (Throwable th) {
                                th = th;
                                tMXStatusCode2 = tMXStatusCode3;
                                lqlqqll.u0075u007500750075u(v0076vvv0076v, "StrongAuth request failed", th);
                                tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Failed;
                                ww0077w0077ww0077(str, tMXStatusCode, tMXEndNotifier);
                                return;
                            }
                        }
                    } else {
                        nllnlllVar.put("sa_st", authParamResult.qq0071q00710071q.qqq007100710071q);
                    }
                    String str8 = authParamResult.q00710071q00710071q;
                    if (str8 != null) {
                        nllnlllVar.d0064006400640064d0064(z2 ? "sa_pk" : "sa_sig", str8, Integer.valueOf(str8.length() + 1));
                        lqlqqll.llqqqll.yy00790079007900790079(v0076vvv0076v, "Generated registration credential is:" + authParamResult.q00710071q00710071q);
                    }
                    nllnlll nllnlllVarW0077ww007700770077w = this.vvv0076vv0076.w0077ww007700770077w(llqlqqqVarWwwww0077w0077, this.v00760076vvv0076.m006D006Dmm006Dm, str, null, nllnlllVar, lqlllqlVar, false);
                    ww00770077w0077w0077(llqlqqqVarWwwww0077w0077, str);
                    TMXStatusCode tMXStatusCodeW007700770077w0077w0077 = w007700770077w0077w0077(str6, nllnlllVarW0077ww007700770077w);
                    if (tMXStatusCodeW007700770077w0077w0077 == TMXStatusCode.TMX_OK) {
                        tMXStatusCodeW007700770077w0077w0077 = authParamResult.qq0071q00710071q.q0071q007100710071q;
                    }
                    lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth request complete");
                    return;
                }
                lqlqqll.uuuu00750075u(v0076vvv0076v, "StrongAuth Failed: TMXAuthentication is disabled or module is not valid. Please make sure the correct version of TMXAuthentication module is included in the app.");
                ww0077w0077ww0077(str, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
            } catch (jjxxxxj e3) {
                e = e3;
            } catch (IllegalArgumentException unused2) {
            } catch (InterruptedException e4) {
                e = e4;
            } catch (Throwable th2) {
                th = th2;
            }
        } finally {
            ww0077w0077ww0077(str, tMXStatusCode2, tMXEndNotifier);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0077ww00770077w0077(long j, long j2) {
        this.vv0076v0076v0076.set(((~j) & this.vvv0076vv0076.q00710071q007100710071) | j2);
    }

    private TMXProfilingHandle w0077ww0077ww0077(TMXProfilingHandle.Result result, @Nullable TMXEndNotifier tMXEndNotifier, @Nonnull TMXProfilingHandle tMXProfilingHandle) {
        if (tMXEndNotifier != null) {
            new Thread(new jxxxjxj(result, tMXEndNotifier)).start();
        }
        return tMXProfilingHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0077www0077w0077(@Nonnull nlllnnl nlllnnlVar) {
        jjjjxxj jjjjxxjVar = this.vvvv00760076v;
        try {
            if ((this.vv0076v0076v0076.get() & llqqqql.cc0063cc00630063) == 0 || jjjjxxjVar == null) {
                return;
            }
            this.vv0076007600760076v = jjjjxxjVar.bindToGooglePlayService(nlllnnlVar);
        } catch (SecurityException e) {
            lqlqqll.uu0075007500750075u(v0076vvv0076v, "bind error - continue", e.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean ww0077007700770077w0077(@javax.annotation.Nonnull java.lang.Thread r7, boolean r8, int r9) throws java.lang.InterruptedException {
        /*
            java.lang.String r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.v0076vvv0076v
            java.lang.String r1 = "wift"
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.uuu007500750075u(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "waiting for thread to complete - "
            r1.<init>(r2)
            long r2 = r7.getId()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.llqqqll.yy00790079007900790079(r0, r1)
            boolean r0 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.v00760076vv0076v
            r1 = 0
            if (r0 == 0) goto L2e
            int r0 = r9 / 100
            r2 = 100
            if (r0 >= r2) goto L2b
            r3 = r1
            r0 = r2
            r2 = r3
            goto L30
        L2b:
            r2 = r1
            r3 = r2
            goto L30
        L2e:
            r0 = r9
            goto L2b
        L30:
            long r4 = (long) r0
            r6 = 1
            r7.join(r4)     // Catch: java.lang.InterruptedException -> L36
            goto L41
        L36:
            r3 = move-exception
            if (r8 == 0) goto L40
            java.lang.String r4 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.v0076vvv0076v
            java.lang.String r5 = "thread join"
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.u0075u007500750075u(r4, r5, r3)
        L40:
            r3 = r6
        L41:
            int r2 = r2 + r0
            boolean r4 = r7.isAlive()
            if (r4 == 0) goto L4c
            if (r2 >= r9) goto L4c
            if (r3 == 0) goto L30
        L4c:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L78
            if (r3 != 0) goto L77
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            java.lang.StackTraceElement[] r9 = r7.getStackTrace()
            r8.setStackTrace(r9)
            java.lang.String r9 = com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.v0076vvv0076v
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "join() timeout expired, but thread is still alive (!). Stack trace of TID "
            r0.<init>(r2)
            long r2 = r7.getId()
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll.u00750075uuu0075(r9, r7, r8)
        L77:
            return r1
        L78:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.ww0077007700770077w0077(java.lang.Thread, boolean, int):boolean");
    }

    private TMXProfilingHandle ww007700770077ww0077(@Nonnull TMXProfilingHandle.Result result, TMXEndNotifier tMXEndNotifier, @Nonnull TMXProfilingHandle tMXProfilingHandle) {
        this.v0076v0076vv0076.jj006A006Aj006A006A();
        return w0077ww0077ww0077(result, tMXEndNotifier, tMXProfilingHandle);
    }

    private void ww00770077w0077w0077(@Nonnull final llqlqqq llqlqqqVar, final String str) {
        new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.7
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                jjjxxjj jjjxxjjVar = jjjxxjj.this;
                if (jjjxxjjVar.v00760076vvv0076 == null) {
                    return;
                }
                if ((jjjxxjjVar.vv0076v0076v0076.get() & 64) != 0 && llqllqq.g006700670067006700670067g(llqlqqqVar.gg00670067006700670067)) {
                    long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
                    jxxxxxj jxxxxxjVar = new jxxxxxj();
                    TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface = jjjxxjj.this.v007600760076vv0076;
                    llqlqqq llqlqqqVar2 = llqlqqqVar;
                    jxxxxxjVar.doTurnConnection(tMXProfilingConnectionsInterface, llqlqqqVar2.gg00670067006700670067, jjjxxjj.vvv0076v0076v, jjjxxjj.this.v00760076vvv0076.m006D006Dmm006Dm, str, llqlqqqVar2.g00670067g006700670067);
                    jjxxjjj.ww0077ww00770077w().w0077www00770077w("ssr", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
                }
                if ((jjjxxjj.this.vv0076v0076v0076.get() & llqqqql.c00630063c0063c0063) != 0) {
                    long jF0066fff006600662 = nnlllnn.nlnnnnl.f0066fff00660066();
                    if (!llqlqqqVar.t00740074tttt.isEmpty()) {
                        Iterator<String> it = llqlqqqVar.t00740074tttt.iterator();
                        while (it.hasNext()) {
                            jjjxxjj.this.v007600760076vv0076.resolveHostByName(jjjxxjj.this.v00760076vvv0076.g00670067006700670067gg(str, llqlqqqVar.g00670067g006700670067, it.next()));
                        }
                    }
                    jjxxjjj.ww0077ww00770077w().w0077www00770077w("sdr", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff006600662));
                }
                if ((jjjxxjj.this.vv0076v0076v0076.get() & llqqqql.aaaaa0061a) == 0 || !llqllqq.g006700670067006700670067g(llqlqqqVar.g0067g0067006700670067)) {
                    return;
                }
                nllnlll nllnlllVar = new nllnlll();
                nllnlllVar.dd006400640064d0064("org_id", jjjxxjj.this.v00760076vvv0076.m006D006Dmm006Dm);
                nllnlllVar.dd006400640064d0064("session_id", str);
                nllnlllVar.dd006400640064d0064("nonce", llqlqqqVar.g00670067g006700670067);
                nllnlllVar.dd006400640064d0064("i", "1");
                byte[] bArrD006400640064d00640064 = nllnlllVar.d006400640064d00640064();
                Map<String, String> mapGggggg0067g = lllqqlq.gggggg0067g(jjjxxjj.this.vvv0076vv0076, null, bArrD006400640064d00640064 == null ? 0 : bArrD006400640064d00640064.length);
                lllqqlq lllqqlqVar = jjjxxjj.this.v00760076vvv0076;
                llqlqqq llqlqqqVar3 = llqlqqqVar;
                jjjxxjj.this.v007600760076vv0076.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, lllqqlqVar.g00670067ggg0067g(llqlqqqVar3.g0067g0067006700670067, llqlqqqVar3.ggg0067006700670067, "clear.png"), mapGggggg0067g, bArrD006400640064d00640064, new TMXProfilingConnectionsInterface.TMXCallback() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.7.1
                    @Override // com.lexisnexisrisk.threatmetrix.rl.TMXProfilingConnectionsInterface.TMXCallback
                    public boolean onComplete(TMXProfilingConnectionsInterface.TMXHttpResponseCode tMXHttpResponseCode, @Nullable InputStream inputStream) {
                        if (tMXHttpResponseCode.succeeded()) {
                            return true;
                        }
                        lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "secondary post request failed: " + tMXHttpResponseCode);
                        return true;
                    }
                });
            }
        }).start();
    }

    private void ww0077w00770077w0077(llqlqqq llqlqqqVar, TMXProfilingOptions tMXProfilingOptions, String str) throws InterruptedException {
        lqlllql lqlllqlVar = v0076v0076v0076v;
        lqlllqlVar.h0068h0068h0068h(lllllql.p0070pp0070p0070);
        lqlllqlVar.hh0068hh0068h(lllllql.p0070pp0070p0070, !tMXProfilingOptions.wwww0077w0077w());
        if (tMXProfilingOptions.wwww0077w0077w()) {
            return;
        }
        int iW00770077007700770077ww = tMXProfilingOptions.w00770077007700770077ww();
        if (iW00770077007700770077ww != Integer.MAX_VALUE) {
            llqlqqqVar.ggggg00670067 = Math.min(llqlqqqVar.ggggg00670067, iW00770077007700770077ww);
            llqlqqqVar.ggg00670067g0067 = Math.min(llqlqqqVar.ggg00670067g0067, iW00770077007700770077ww);
        }
        Set<String> setW00770077www0077w = tMXProfilingOptions.w00770077www0077w();
        if (llqlqqqVar.ttt0074ttt.isEmpty() && setW00770077www0077w != null && !setW00770077www0077w.isEmpty()) {
            llqlqqqVar.ttt0074ttt.addAll(setW00770077www0077w);
        }
        Set<String> setW0077w0077ww0077w = tMXProfilingOptions.w0077w0077ww0077w();
        if (llqlqqqVar.t0074t0074ttt.isEmpty() && setW0077w0077ww0077w != null && !setW0077w0077ww0077w.isEmpty()) {
            llqlqqqVar.t0074t0074ttt.addAll(setW0077w0077ww0077w);
        }
        boolean zWww0077ww0077w = tMXProfilingOptions.www0077ww0077w();
        if (!llqlqqqVar.gg00670067gg0067 && zWww0077ww0077w) {
            llqlqqqVar.gg00670067gg0067 = zWww0077ww0077w;
        }
        String strW007700770077ww0077w = tMXProfilingOptions.w007700770077ww0077w();
        if (!llqlqqqVar.g006700670067gg0067.equals("id") && strW007700770077ww0077w != null) {
            llqlqqqVar.g006700670067gg0067 = strW007700770077ww0077w;
        }
        HashMap map = new HashMap(5);
        TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface = this.v007600760076vv0076;
        HashMap map2 = new HashMap(3);
        map2.put("org_id", this.v00760076vvv0076.m006D006Dmm006Dm);
        map2.put("session_id", str);
        map2.put("nonce", llqlqqqVar.g00670067g006700670067);
        map.put("connectionInstance", tMXProfilingConnectionsInterface);
        map.put("requestFixedPayload", map2);
        map.put("requestHeader", lllqqlq.gggggg0067g(this.vvv0076vv0076, null, 0));
        lllqqlq lllqqlqVar = this.v00760076vvv0076;
        map.put("requestUrl", lllqqlqVar.g00670067ggg0067g(lllqqlqVar.mm006Dmm006Dm, llqlqqqVar.ggg0067006700670067, "clear3.png"));
        Activity activityWw00770077ww0077w = tMXProfilingOptions.ww00770077ww0077w();
        if (activityWw00770077ww0077w != null) {
            map.put("runningActivity", activityWw00770077ww0077w);
        }
        lqlllqlVar.hhh0068h0068h(llqlqqqVar, this.vv0076v0076v0076.get(), map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TMXStatusCode ww0077w0077ww0077(final String str, final TMXStatusCode tMXStatusCode, @Nullable final TMXEndNotifier tMXEndNotifier) {
        if (tMXEndNotifier != null) {
            new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        tMXEndNotifier.complete(new TMXProfilingHandle.Result(str, tMXStatusCode));
                    } catch (Throwable th) {
                        lqlqqll.uuuu00750075u(jjjxxjj.v0076vvv0076v, "Unexpected exception occurred when calling StepUpNotifier " + th);
                    }
                }
            }).start();
        }
        return tMXStatusCode;
    }

    private boolean ww0077ww0077w0077() {
        if (this.vvv007600760076v != 0 && this.v0076v007600760076v != 0) {
            if (TimeUnit.MILLISECONDS.convert(this.v0076v007600760076v, TimeUnit.MINUTES) + this.vvv007600760076v > System.currentTimeMillis()) {
                return true;
            }
        }
        return false;
    }

    public static int www007700770077w0077(int i, int i2, String str) {
        return (int) w0077w007700770077w0077(i, i2, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void www00770077ww0077(@Nonnull String str, @Nonnull TMXProfilingOptions tMXProfilingOptions, @Nonnull TMXEndNotifier tMXEndNotifier, @Nonnull jxjxxxj jxjxxxjVar) {
        TMXStatusCode tMXStatusCode;
        TMXProfilingHandle.Result result;
        boolean zH0068006800680068hh;
        TMXStatusCode tMXStatusCode2 = TMXStatusCode.TMX_NotYet;
        try {
            try {
                try {
                    String str2 = v0076vvv0076v;
                    lqlqqll.uuu007500750075u(str2, "continuing profile request ".concat(this.v0076v0076vv0076.jjj006A006A006A006A() ? "inited already" : " needs init"));
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A() || Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    nlnnlnl.dddd00640064d();
                    if (!this.v0076v0076vv0076.jj006Aj006A006A006A() || this.v0076vvvv0076) {
                        lqlqqll.uuuu00750075u(str2, "scanPackages(profile): aborted! not inited or disabled");
                        zH0068006800680068hh = false;
                    } else {
                        zH0068006800680068hh = v0076v0076v0076v.h0068006800680068hh(this.vv00760076vv0076, this.v0076v0076vv0076, jjjxxxj.PROFILE, 0L, this.vv0076vvv0076, null);
                    }
                    jjxjxxj jjxjxxjVar = new jjxjxxj(new jxjjxxj());
                    this.v00760076v00760076v = jjxjxxjVar;
                    jjxjxxjVar.start();
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A() || Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    long jF0066fff00660066 = nnlllnn.nlnnnnl.f0066fff00660066();
                    llqlqqq llqlqqqVarWwwww0077w0077 = wwwww0077w0077(str);
                    jjxxjjj.ww0077ww00770077w().w0077www00770077w("ptx", Long.valueOf(nnlllnn.nlnnnnl.f0066fff00660066() - jF0066fff00660066));
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A() || Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    ww0077w00770077w0077(llqlqqqVarWwwww0077w0077, tMXProfilingOptions, str);
                    String str3 = llqlqqqVarWwwww0077w0077.ggg0067006700670067;
                    ww00770077w0077w0077(llqlqqqVarWwwww0077w0077, str);
                    nllnlll nllnlllVarW0077007700770077ww0077 = w0077007700770077ww0077(str, zH0068006800680068hh, tMXProfilingOptions, llqlqqqVarWwwww0077w0077);
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A() || Thread.currentThread().isInterrupted()) {
                        throw new InterruptedException();
                    }
                    if (this.v00760076007600760076v != null) {
                        this.v00760076007600760076v.jjjjjj006A();
                    }
                    TMXStatusCode tMXStatusCodeW007700770077w0077w0077 = w007700770077w0077w0077(str3, nllnlllVarW0077007700770077ww0077);
                    jjxxjjj.w0077w0077w00770077w();
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                        tMXStatusCodeW007700770077w0077w0077 = TMXStatusCode.TMX_Interrupted_Error;
                        Thread.interrupted();
                    }
                    this.v00760076v00760076v = null;
                    ww007700770077ww0077(new TMXProfilingHandle.Result(str, tMXStatusCodeW007700770077w0077w0077), tMXEndNotifier, jxjxxxjVar);
                    llqlllq.g0067gg0067ggg().ggggg0067gg(str, tMXStatusCodeW007700770077w0077w0077);
                } catch (jjxxxxj e) {
                    tMXStatusCode = e.i00690069iii0069;
                    jjxxjjj.w0077w0077w00770077w();
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                        tMXStatusCode = TMXStatusCode.TMX_Interrupted_Error;
                        Thread.interrupted();
                    }
                    this.v00760076v00760076v = null;
                    result = new TMXProfilingHandle.Result(str, tMXStatusCode);
                    ww007700770077ww0077(result, tMXEndNotifier, jxjxxxjVar);
                    llqlllq.g0067gg0067ggg().ggggg0067gg(str, tMXStatusCode);
                } catch (InterruptedException e2) {
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                        lqlqqll.uuu007500750075u(v0076vvv0076v, "profile request interrupted due to cancel");
                    } else {
                        lqlqqll.u0075u007500750075u(v0076vvv0076v, "profile request interrupted", e2);
                        TMXStatusCode tMXStatusCode3 = TMXStatusCode.TMX_Internal_Error;
                    }
                    tMXStatusCode = TMXStatusCode.TMX_Interrupted_Error;
                    jjxxjjj.w0077w0077w00770077w();
                    if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                        Thread.interrupted();
                    }
                    this.v00760076v00760076v = null;
                    result = new TMXProfilingHandle.Result(str, tMXStatusCode);
                    ww007700770077ww0077(result, tMXEndNotifier, jxjxxxjVar);
                    llqlllq.g0067gg0067ggg().ggggg0067gg(str, tMXStatusCode);
                }
            } catch (Throwable th) {
                TMXStatusCode tMXStatusCode4 = TMXStatusCode.TMX_Internal_Error;
                lqlqqll.u00750075uuu0075(v0076vvv0076v, "profile request failed", th);
                jjxxjjj.w0077w0077w00770077w();
                if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                    tMXStatusCode4 = TMXStatusCode.TMX_Interrupted_Error;
                    Thread.interrupted();
                }
                this.v00760076v00760076v = null;
                ww007700770077ww0077(new TMXProfilingHandle.Result(str, tMXStatusCode4), tMXEndNotifier, jxjxxxjVar);
                llqlllq.g0067gg0067ggg().ggggg0067gg(str, tMXStatusCode4);
            }
        } catch (Throwable th2) {
            jjxxjjj.w0077w0077w00770077w();
            if (this.v0076v0076vv0076.j006Ajj006A006A006A()) {
                tMXStatusCode2 = TMXStatusCode.TMX_Interrupted_Error;
                Thread.interrupted();
            }
            this.v00760076v00760076v = null;
            ww007700770077ww0077(new TMXProfilingHandle.Result(str, tMXStatusCode2), tMXEndNotifier, jxjxxxjVar);
            llqlllq.g0067gg0067ggg().ggggg0067gg(str, tMXStatusCode2);
            throw th2;
        }
    }

    private llqlqqq wwwww0077w0077(@Nonnull String str) throws InterruptedException, jjxxxxj {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        llqlqqq llqlqqqVar = new llqlqqq();
        byte[] bArrD006400640064d00640064 = this.v00760076vvv0076.g0067gggg0067g(str, this.vvv0076vv0076.qq00710071007100710071).d006400640064d00640064();
        Map<String, String> mapGggggg0067g = lllqqlq.gggggg0067g(this.vvv0076vv0076, null, bArrD006400640064d00640064 == null ? 0 : bArrD006400640064d00640064.length);
        jjxxjxj jjxxjxjVar = new jjxxjxj(this.v00760076vvv0076.gg0067ggg0067g(), countDownLatch, llqlqqqVar, this.v00760076vvv0076.m006D006Dmm006Dm, str);
        this.v007600760076vv0076.httpRequest(TMXProfilingConnectionsInterface.HttpMethod.POST, this.v00760076vvv0076.gg0067ggg0067g(), mapGggggg0067g, bArrD006400640064d00640064, jjxxjxjVar);
        if (!countDownLatch.await(this.vvvv0076v0076, TimeUnit.MILLISECONDS)) {
            throw new jjxxxxj(TMXStatusCode.TMX_NetworkTimeout_Error);
        }
        if (jjxxjxjVar.w00770077w007700770077w() != TMXStatusCode.TMX_OK) {
            throw new jjxxxxj(jjxxjxjVar.w00770077w007700770077w());
        }
        if (llqlqqqVar.ggg0067gg00670067()) {
            return llqlqqqVar;
        }
        throw new jjxxxxj(TMXStatusCode.TMX_ConfigurationError);
    }

    public void deregisterUser(@Nonnull final String str, @Nullable final TMXEndNotifier tMXEndNotifier) {
        if (llqllqq.ggg0067006700670067g(str)) {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "De-registration Failed: Invalid parameter is passed to deregister method");
            ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        }
        if (this.v0076v0076vv0076.jjj006A006A006A006A()) {
            new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.4
                @Override // java.lang.Runnable
                public void run() {
                    TMXStatusCode tMXStatusCode;
                    TMXStatusCode tMXStatusCode2;
                    try {
                        try {
                            jjjxxjj jjjxxjjVar = jjjxxjj.this;
                            if (jjjxxjjVar.v0076v0076vv0076.g006700670067gggg(jjjxxjjVar.vvvv0076v0076)) {
                                nnnnlnn nnnnlnnVarUu00750075007500750075 = jjjxxjj.v0076v0076v0076v.uu00750075007500750075();
                                if ((jjjxxjj.this.vv0076v0076v0076.get() & llqqqql.cc00630063c00630063) == 0 || nnnnlnnVarUu00750075007500750075 == null) {
                                    lqlqqll.uuuu00750075u(jjjxxjj.v0076vvv0076v, "StrongAuth Failed: TMXAuthentication module is not valid. Please make sure the correct version of TMXAuthentication module is included in the app.");
                                } else {
                                    TMXStrongAuth.AuthParamResult authParamResultOo006Fo006F006Fo = nnnnlnnVarUu00750075007500750075.oo006Fo006F006Fo(str);
                                    if (authParamResultOo006Fo006F006Fo == null) {
                                        lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "StrongAuth Failed");
                                    } else {
                                        tMXStatusCode2 = authParamResultOo006Fo006F006Fo.qq0071q00710071q.q0071q007100710071q;
                                    }
                                }
                                tMXStatusCode2 = TMXStatusCode.TMX_StrongAuth_Failed;
                            } else {
                                lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "StrongAuth Failed: Timeout while waiting for init to finish");
                                tMXStatusCode2 = TMXStatusCode.TMX_Internal_Error;
                            }
                            jjjxxjj.this.ww0077w0077ww0077(null, tMXStatusCode2, tMXEndNotifier);
                        } catch (IllegalArgumentException unused) {
                            tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Unsupported;
                            jjjxxjj.this.ww0077w0077ww0077(null, tMXStatusCode, tMXEndNotifier);
                        } catch (Throwable th) {
                            lqlqqll.u0075u007500750075u(jjjxxjj.v0076vvv0076v, "StrongAuth request failed", th);
                            tMXStatusCode = TMXStatusCode.TMX_StrongAuth_Failed;
                            jjjxxjj.this.ww0077w0077ww0077(null, tMXStatusCode, tMXEndNotifier);
                        }
                    } catch (Throwable th2) {
                        jjjxxjj.this.ww0077w0077ww0077(null, null, tMXEndNotifier);
                        throw th2;
                    }
                }
            }).start();
        } else {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: init() is not called");
            ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        }
    }

    public void getUserContextRegisteredStatus(@Nonnull String str, @Nullable TMXEndNotifier tMXEndNotifier) {
        if (llqllqq.ggg0067006700670067g(str)) {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "User Context Registration status: Invalid parameter is passed to getUserContextRegisteredStatus method");
            ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
            return;
        }
        try {
            if (!this.v0076v0076vv0076.jjj006A006A006A006A()) {
                lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: init() is not called");
                ww0077w0077ww0077(null, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            if (!this.v0076v0076vv0076.g006700670067gggg(this.vvvv0076v0076)) {
                lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed: Timeout while waiting for init to finish");
                ww0077w0077ww0077(null, TMXStatusCode.TMX_Internal_Error, tMXEndNotifier);
                return;
            }
            nnnnlnn nnnnlnnVarUu00750075007500750075 = v0076v0076v0076v.uu00750075007500750075();
            if ((this.vv0076v0076v0076.get() & llqqqql.cc00630063c00630063) != 0 && nnnnlnnVarUu00750075007500750075 != null) {
                TMXStrongAuth.AuthParamResult authParamResultO006Fo006F006F006Fo = nnnnlnnVarUu00750075007500750075.o006Fo006F006F006Fo(str);
                if (authParamResultO006Fo006F006F006Fo != null) {
                    ww0077w0077ww0077(null, authParamResultO006Fo006F006F006Fo.qq0071q00710071q.q0071q007100710071q, tMXEndNotifier);
                    return;
                } else {
                    lqlqqll.uuu007500750075u(v0076vvv0076v, "StrongAuth Failed");
                    ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
                    return;
                }
            }
            lqlqqll.uuuu00750075u(v0076vvv0076v, "StrongAuth Failed: TMXAuthentication module is not valid. Please make sure the correct version of TMXAuthentication module is included in the app.");
            ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        } catch (Throwable th) {
            ww0077w0077ww0077(null, null, tMXEndNotifier);
            throw th;
        }
    }

    public void init(@Nonnull final TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException {
        final nlllnnl nlllnnlVarWwww0077www = tMXConfig.wwww0077www();
        if (nlllnnlVarWwww0077www == null) {
            throw new IllegalArgumentException("Failed to init: Invalid Context");
        }
        if (!this.v0076v0076vv0076.ggg0067gggg()) {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "Already init'd");
            return;
        }
        if (lqlqqll.u0075u0075u0075u() && (tMXConfig.w0077www0077ww() & llqqqql.c0063c0063006300630063) == 0) {
            lqlqqll.u0075uuuu0075(true);
        }
        nlnnlnl.dddd00640064d();
        try {
            this.v0076vvvv0076 = tMXConfig.w00770077w0077www();
            this.vv0076vvv0076 = www007700770077w0077(tMXConfig.w00770077ww0077ww(), 0, "package scan timeout");
            this.vvvvvv0076 = www007700770077w0077(tMXConfig.ww007700770077www(), 0, "init package scan timeout");
            ww0077w00770077ww(tMXConfig);
            if (!lllqqlq.gg0067006700670067gg(tMXConfig.ww0077ww0077ww())) {
                this.v0076v0076vv0076.j006Aj006Aj006A006A(false);
                throw new IllegalArgumentException("Failed to init: Invalid format for org id");
            }
            if (lllqqlq.ggg0067gg0067g(tMXConfig.www00770077www())) {
                this.v0076v0076vv0076.j006Aj006Aj006A006A(false);
                throw new IllegalArgumentException("Failed to init: Invalid format for fingerprint server");
            }
            this.v00760076vvv0076 = new lllqqlq(tMXConfig.www00770077www(), tMXConfig.ww0077ww0077ww(), tMXConfig.w007700770077wwww());
            this.vvvv0076v0076 = www007700770077w0077(tMXConfig.www0077w0077ww(), Integer.MAX_VALUE, "profileTimeout");
            if (this.vvvv0076v0076 == 0) {
                this.vvvv0076v0076 = TMXConfig.tttttt0074;
            }
            this.v007600760076vv0076 = tMXConfig.w0077w0077w0077ww();
            if (this.v007600760076vv0076 == null) {
                String str = v0076vvv0076v;
                lqlqqll.llqqqll.u0075uu0075uu(str, "No profilingConnections instance being passed in by setProfilingConnections, try initialising one if connection module is available.");
                this.v007600760076vv0076 = lqlllql.h0068h00680068hh();
                if (this.v007600760076vv0076 == null) {
                    this.v0076v0076vv0076.j006Aj006Aj006A006A(false);
                    lqlqqll.uuuu00750075u(str, "Failed to instantiate http client");
                    throw new IllegalStateException("Failed to init: failed to instantiate http client");
                }
            }
            Method methodW0077w00770077007700770077 = jjxjxjx.w0077w00770077007700770077(this.v007600760076vv0076.getClass(), vv0076vv0076v, String.class);
            if (methodW0077w00770077007700770077 != null) {
                jjxjxjx.s0073ss0073sss(null, methodW0077w00770077007700770077, this.v00760076vvv0076.mm006Dmm006Dm);
            }
            lqlqqll.uuu007500750075u(v0076vvv0076v, "Starting init()");
            this.v0076vv0076v0076 = true;
            this.vv00760076vv0076 = nlllnnlVarWwww0077www;
            this.v00760076007600760076v = new lllqqql(this.vv00760076vv0076, tMXConfig.ww0077ww0077ww());
            this.vv0076v0076v0076.set(tMXConfig.w0077www0077ww());
            final long jH00680068hhhh = v0076v0076v0076v.h00680068hhhh();
            new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "Doing slow init stuff");
                        jjjxxjj.this.v0076vv00760076v.config(tMXConfig);
                        lllqlql.h0068hhhh0068().h0068hh0068h0068(nlllnnlVarWwww0077www, BuildConfig.JNI_FILENAME, lqlqqll.uu00750075u0075u(), lqlqqll.u0075u0075u0075u());
                        lqlqqll.uu0075uuu0075(jjjxxjj.v0076vvv0076v, "Native libs: ".concat(lllqlql.h0068hhhh0068().h00680068h0068h0068() ? "available" : "unavailable"));
                        jjjxxjj.this.v00760076007600760076v.jj006A006A006A006Aj();
                        nlllnnl nlllnnlVarWwww0077www2 = tMXConfig.wwww0077www();
                        long jW0077www0077ww = tMXConfig.w0077www0077ww();
                        jjjxxjj jjjxxjjVar = jjjxxjj.this;
                        jjjxxjj.this.vvv0076vv0076 = new jjxjxjj(nlllnnlVarWwww0077www2, jW0077www0077ww, jjjxxjjVar.vv0076v0076v0076, jH00680068hhhh, jjjxxjjVar.v00760076007600760076v);
                        lqlqqll.llqqqll.yy00790079007900790079(jjjxxjj.v0076vvv0076v, "applying saved options (" + jjjxxjj.this.v00760076007600760076v.jj006Aj006A006Aj(lllqqql.c00630063c0063cc) + " / " + jjjxxjj.this.v00760076007600760076v.jj006Aj006A006Aj(lllqqql.ccc00630063cc) + ") to " + jjjxxjj.this.vv0076v0076v0076.get());
                        jjjxxjj jjjxxjjVar2 = jjjxxjj.this;
                        jjjxxjjVar2.w0077ww00770077w0077(jjjxxjjVar2.v00760076007600760076v.jj006Aj006A006Aj(lllqqql.ccc00630063cc), jjjxxjj.this.v00760076007600760076v.jj006Aj006A006Aj(lllqqql.c00630063c0063cc));
                        lqlqqll.llqqqll.u0075uuuuu(jjjxxjj.v0076vvv0076v, "Got quiet period from saved preferences {}", Integer.valueOf(jjjxxjj.this.v00760076007600760076v.j006Ajj006A006Aj(lllqqql.c0063c00630063cc)));
                        jjjxxjj jjjxxjjVar3 = jjjxxjj.this;
                        jjjxxjjVar3.v0076v007600760076v = jjjxxjjVar3.v00760076007600760076v.j006Ajj006A006Aj(lllqqql.c0063c00630063cc);
                        if ((jjjxxjj.this.vv0076v0076v0076.get() & llqqqql.c0063c0063c00630063) == 0) {
                            jjjxxjj.this.w0077ww00770077ww(nlllnnlVarWwww0077www);
                        }
                        jjjxxjj.this.w0077www0077w0077(nlllnnlVarWwww0077www);
                        llqllqq.ggg0067ggg0067(null);
                        if (!tMXConfig.w0077ww0077www()) {
                            lqlllql lqlllqlVar = jjjxxjj.v0076v0076v0076v;
                            nlllnnl nlllnnlVarWwww0077www3 = tMXConfig.wwww0077www();
                            jjjxxjj jjjxxjjVar4 = jjjxxjj.this;
                            lqlllqlVar.h0068006800680068hh(nlllnnlVarWwww0077www3, jjjxxjjVar4.v0076v0076vv0076, jjjxxxj.INIT, 0L, jjjxxjjVar4.vvvvvv0076, null);
                        }
                        jjjxxjj.this.vv00760076v0076v.finishInit();
                        jjjxxjj.this.v007600760076v0076v.finishInit();
                        jjjxxjj.this.v0076v0076vv0076.j006Aj006Aj006A006A(true);
                        lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "init completed successfully");
                    } catch (Throwable th) {
                        jjjxxjj.this.v0076v0076vv0076.j006Aj006Aj006A006A(false);
                        lqlqqll.uuu007500750075u(jjjxxjj.v0076vvv0076v, "Exception in init" + th.toString());
                    }
                }
            }).start();
        } catch (RuntimeException e) {
            this.v0076v0076vv0076.j006Aj006Aj006A006A(false);
            throw e;
        }
    }

    public void pauseLocationServices(boolean z) {
        lqlqqqq lqlqqqqVar = this.v0076vv00760076v;
        if (lqlqqqqVar != null) {
            if (z) {
                lqlqqqqVar.pause();
            } else {
                lqlqqqqVar.resume();
            }
        }
    }

    @Nullable
    public String processStrongAuthMessage(@Nonnull TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        String strGg00670067ggg0067 = llqllqq.gg00670067ggg0067();
        String str = strongAuthConfiguration.q0071q0071qq0071;
        String str2 = strongAuthConfiguration.qqq0071qq0071;
        return wwww00770077w0077(strGg00670067ggg0067, str, strongAuthConfiguration.qqqq0071q0071, strongAuthConfiguration.q007100710071qq0071, strongAuthConfiguration.qq00710071qq0071, strongAuthConfiguration.q0071qq0071q0071, str2, strongAuthCallback, tMXEndNotifier);
    }

    public TMXProfilingHandle profile(@Nonnull TMXEndNotifier tMXEndNotifier) {
        return profile(new TMXProfilingOptions(), tMXEndNotifier);
    }

    @Nullable
    public String registerUser(@Nonnull String str, @Nullable String str2, @Nonnull String str3, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        return www0077w0077w0077(llqllqq.gg00670067ggg0067(), str, str2, str3, strongAuthCallback, tMXEndNotifier);
    }

    public boolean scanPackages() {
        return scanPackages(0, TimeUnit.SECONDS, null);
    }

    public synchronized void w00770077w0077ww0077() {
        String str = v0076vvv0076v;
        lqlqqll.uuu007500750075u(str, "cancel()");
        if (this.v0076v0076vv0076.jjj006A006A006A006A()) {
            v0076v0076v0076v.u0075uu007500750075();
            if (this.v0076v0076vv0076.j006Aj006A006A006A006A()) {
                if (!this.v0076v0076vv0076.gg0067ggggg()) {
                    lqlqqll.uu0075uuu0075(str, "Cancel already happened");
                    return;
                }
                if (this.v0076v0076vv0076.j006Aj006A006A006A006A()) {
                    lqlqqll.uuu007500750075u(str, "cancelling any outstanding JNI calls");
                    lllqlql.h0068hhhh0068().hhhh00680068h();
                    TMXProfilingConnectionsInterface tMXProfilingConnectionsInterface = this.v007600760076vv0076;
                    if (tMXProfilingConnectionsInterface != null) {
                        lqlqqll.uuu007500750075u(str, "cancelling active profiling request");
                        tMXProfilingConnectionsInterface.cancelProfiling();
                    }
                    Thread thread = this.vv0076v00760076v;
                    if (thread != null) {
                        lqlqqll.uuu007500750075u(str, "sending interrupt to profile thread TID: " + thread.getId());
                        thread.interrupt();
                    }
                    Thread thread2 = this.v00760076v00760076v;
                    if (thread2 != null) {
                        thread2.interrupt();
                    }
                    if (thread != null && thread.isAlive()) {
                        lqlqqll.uuu007500750075u(str, "waiting for profile thread to complete");
                        ww0077007700770077w0077(thread, false, this.vvvv0076v0076);
                    }
                    lqlqqll.uuu007500750075u(str, "Waiting for any outstanding JNI calls");
                    lllqlql.h0068hhhh0068().h0068h0068h00680068();
                }
                this.v0076v0076vv0076.j006A006Ajj006A006A();
            }
            if (this.v0076v0076vv0076.g00670067ggggg()) {
                lqlqqll.llqqqll.u0075uu0075uu(str, "Waiting for package scan");
                this.v0076v0076vv0076.gggg0067ggg(false, null);
            }
            this.v0076v0076vv0076.jjj006Aj006A006A();
            lqlqqll.uuu007500750075u(str, "Cancelled");
        }
    }

    public void w0077w0077w0077w0077() {
        if (this.v0076v0076vv0076.jjj006A006A006A006A()) {
            v0076v0076v0076v.hhhhh0068h();
        } else {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "Failed to send biometrics information: init() is not called.");
        }
    }

    public abstract void w0077ww00770077ww(nlllnnl nlllnnlVar);

    public void waitForInfoCollectionAndUpdateDefaultOptions(llqlqqq llqlqqqVar) throws InterruptedException, jjxxxxj {
        jjxjxxj jjxjxxjVar = (jjxjxxj) this.v00760076v00760076v;
        if (jjxjxxjVar != null) {
            jjxjxxjVar.join(this.vvvv0076v0076);
            if (jjxjxxjVar.getState() != Thread.State.TERMINATED) {
                lqlqqll.uuuu00750075u(v0076vvv0076v, "ScanData hasn't completed before the timeout expired, aborting");
                jjxjxxjVar.interrupt();
                throw new jjxxxxj(TMXStatusCode.TMX_ProfileTimeout_Error);
            }
            if (((jxjjxxj) jjxjxxjVar.m_runnable).ww0077w007700770077w()) {
                throw new InterruptedException();
            }
        }
        if (w00770077w00770077w0077(llqlqqqVar)) {
            w0077ww00770077w0077(llqlqqqVar.g0067gg0067g0067 & llqqqql.a0061aaaa0061, llqqqql.a0061aaaa0061 & llqlqqqVar.gggg0067g0067);
        }
        this.v0076v007600760076v = llqlqqqVar.gg0067g0067g0067;
    }

    public abstract void ww0077w00770077ww(@Nonnull TMXConfig tMXConfig) throws IllegalStateException, IllegalArgumentException;

    @Nullable
    public String www0077w0077w0077(@Nonnull final String str, @Nonnull final String str2, @Nullable final String str3, @Nonnull final String str4, @Nonnull final TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable final TMXEndNotifier tMXEndNotifier) {
        if (!llqllqq.ggg0067006700670067g(str2) && !llqllqq.ggggggg0067(str4) && !llqllqq.ggggggg0067(str)) {
            new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.3
                @Override // java.lang.Runnable
                public void run() {
                    jjjxxjj.this.w0077w00770077ww0077(str, null, str3, str4, str2, TMXStrongAuth.AuthMethod.TMX_USER_PRESENCE, true, strongAuthCallback, tMXEndNotifier, true);
                }
            }).start();
            return str;
        }
        lqlqqll.uuu007500750075u(v0076vvv0076v, "Registration Failed: Invalid parameter is passed to register method");
        ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    public String wwww00770077w0077(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, @Nonnull final String str4, @Nullable final String str5, @Nullable String str6, @Nullable String str7, @Nonnull final TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable final TMXEndNotifier tMXEndNotifier) {
        if (llqllqq.ggggggg0067(str7) || llqllqq.ggggggg0067(str5) || llqllqq.ggggggg0067(str4) || llqllqq.ggggggg0067(str2) || llqllqq.ggggggg0067(str)) {
            lqlqqll.uuu007500750075u(v0076vvv0076v, "Stepup Failed: Invalid parameter");
        } else {
            String str8 = llqllqq.ggggggg0067(str6) ? TMXStrongAuth.AuthMethod.TMX_USER_PRESENCE.methodName : str6;
            if (TMXStrongAuth.qq00710071q0071q.equals(str7)) {
                final TMXStrongAuth.AuthMethod authMethodW0077ww0077w0077w = TMXStrongAuth.AuthMethod.w0077ww0077w0077w(str8);
                new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.5
                    @Override // java.lang.Runnable
                    public void run() {
                        jjjxxjj.this.w0077w00770077ww0077(str, str2, str3, str4, str5, authMethodW0077ww0077w0077w, false, strongAuthCallback, tMXEndNotifier, false);
                    }
                }).start();
                return str;
            }
            lqlqqll.uuu007500750075u(v0076vvv0076v, "Stepup Failed: auth_action is invalid, can't proceed");
        }
        ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    @Nullable
    public String processStrongAuthMessage(@Nonnull Object obj, @Nonnull TMXStrongAuth.StrongAuthCallback strongAuthCallback, @Nullable TMXEndNotifier tMXEndNotifier) {
        String str;
        String str2;
        if (obj instanceof Bundle) {
            Bundle bundle = (Bundle) obj;
            TMXStrongAuth.StrongAuthConfiguration strongAuthConfiguration = new TMXStrongAuth.StrongAuthConfiguration();
            strongAuthConfiguration.setAuthMethod(bundle.getString(TMXStrongAuth.AUTH_METHOD));
            strongAuthConfiguration.setAuthAction(bundle.getString(TMXStrongAuth.AUTH_ACTION));
            strongAuthConfiguration.setAuthContext(bundle.getString(TMXStrongAuth.AUTH_CONTEXT));
            strongAuthConfiguration.setAuthRequestId(bundle.getString(TMXStrongAuth.AUTH_REQUEST_ID));
            strongAuthConfiguration.setAuthPrompt(bundle.getString(TMXStrongAuth.AUTH_PROMPT));
            strongAuthConfiguration.setAuthTitle(bundle.getString("title"));
            return processStrongAuthMessage(strongAuthConfiguration, strongAuthCallback, tMXEndNotifier);
        }
        Method methodSs00730073ssss = jjxjxjx.ss00730073ssss(obj.getClass(), "getData", new Class[0]);
        if (methodSs00730073ssss == null) {
            str = v0076vvv0076v;
            str2 = "Stepup Failed: Message parameter does not have \"getData\" method";
        } else {
            Object objS0073ss0073sss = jjxjxjx.s0073ss0073sss(obj, methodSs00730073ssss, new Object[0]);
            if (objS0073ss0073sss instanceof Map) {
                Map map = (Map) objS0073ss0073sss;
                String strGg00670067ggg0067 = llqllqq.gg00670067ggg0067();
                String str3 = (String) map.get(TMXStrongAuth.AUTH_REQUEST_ID);
                String str4 = (String) map.get(TMXStrongAuth.AUTH_ACTION);
                String str5 = (String) map.get(TMXStrongAuth.AUTH_CONTEXT);
                return wwww00770077w0077(strGg00670067ggg0067, str3, (String) map.get("title"), (String) map.get(TMXStrongAuth.AUTH_PROMPT), str5, (String) map.get(TMXStrongAuth.AUTH_METHOD), str4, strongAuthCallback, tMXEndNotifier);
            }
            str = v0076vvv0076v;
            str2 = "Stepup Failed: \"getData\" returns wrong type";
        }
        lqlqqll.uuu007500750075u(str, str2);
        ww0077w0077ww0077(null, TMXStatusCode.TMX_StrongAuth_Failed, tMXEndNotifier);
        return null;
    }

    public TMXProfilingHandle profile(@Nonnull final TMXProfilingOptions tMXProfilingOptions, @Nonnull final TMXEndNotifier tMXEndNotifier) {
        llqlllq.g0067gg0067ggg().g0067ggg0067gg();
        if (!this.v0076v0076vv0076.jjj006A006A006A006A()) {
            return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Internal_Error), tMXEndNotifier, new jxjxxxj(null));
        }
        if (this.v0076v0076vv0076.g006700670067gggg(this.vvvv0076v0076) && this.v0076v0076vv0076.g0067g0067gggg()) {
            if ((this.vv0076v0076v0076.get() & llqqqql.c0063c0063c00630063) == 0 && !w00770077ww0077w0077()) {
                this.v0076v0076vv0076.jj006A006Aj006A006A();
                return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Blocked), tMXEndNotifier, new jxjxxxj(null));
            }
            if (ww0077ww0077w0077()) {
                this.v0076v0076vv0076.jj006A006Aj006A006A();
                return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_In_Quiet_Period), tMXEndNotifier, new jxjxxxj(null));
            }
            if (tMXEndNotifier == null) {
                this.v0076v0076vv0076.jj006A006Aj006A006A();
                return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_EndNotifier_NotFound), null, new jxjxxxj(null));
            }
            final String strG006700670067ggg0067 = llqllqq.g006700670067006700670067g(tMXProfilingOptions.ww0077www0077w()) ? llqllqq.g006700670067ggg0067(tMXProfilingOptions.ww0077www0077w()) : llqllqq.gg00670067ggg0067();
            if (llqllqq.ggggggg0067(strG006700670067ggg0067)) {
                this.v0076v0076vv0076.jj006A006Aj006A006A();
                lqlqqll.uuuu00750075u(v0076vvv0076v, "Failed to start profiling: Invalid session id");
                return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_Internal_Error), tMXEndNotifier, new jxjxxxj(null));
            }
            lqlqqll.uu00750075u0075u();
            String str = v0076vvv0076v;
            lqlqqll.uuu007500750075u(str, "starting profile request using - 7.6-46 : RL options " + this.vv0076v0076v0076.get() + " profileTimeout " + this.vvvv0076v0076 + "ms java.vm.version " + System.getProperty("java.vm.version"));
            final jxjxxxj jxjxxxjVar = new jxjxxxj(strG006700670067ggg0067);
            this.v007600760076vv0076.cancelProfiling();
            jjxjxjj.GenericLocation genericLocationW0077wwww0077w = tMXProfilingOptions.w0077wwww0077w();
            if (genericLocationW0077wwww0077w != null) {
                lqlqqll.llqqqll.yy00790079007900790079(str, "Location is manual using that location");
                this.v0076vv00760076v.setLocation(genericLocationW0077wwww0077w);
            } else if (this.v0076vv00760076v.w00770077wwwww() && !this.v0076vv00760076v.ww0077wwwww()) {
                lqlqqll.llqqqll.yy00790079007900790079(str, "Host application requested for location but last time it was not registered successfully, trying again now");
                this.v0076vv00760076v.w0077w0077wwww();
            }
            this.vv0076v00760076v = new Thread(new Runnable() { // from class: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjjxxjj.2
                @Override // java.lang.Runnable
                public void run() {
                    jjjxxjj.this.www00770077ww0077(strG006700670067ggg0067, tMXProfilingOptions, tMXEndNotifier, jxjxxxjVar);
                }
            });
            this.vv0076v00760076v.start();
            return jxjxxxjVar;
        }
        return w0077ww0077ww0077(new TMXProfilingHandle.Result(null, TMXStatusCode.TMX_NotYet), tMXEndNotifier, new jxjxxxj(null));
    }

    public boolean scanPackages(int i, @Nonnull TimeUnit timeUnit, @Nullable TMXScanEndNotifier tMXScanEndNotifier) {
        int millis = (int) timeUnit.toMillis(i);
        if (millis == 0 && i != 0) {
            millis = 1;
        }
        int i2 = millis;
        if (this.v0076v0076vv0076.jj006Aj006A006A006A()) {
            return v0076v0076v0076v.h0068006800680068hh(this.vv00760076vv0076, this.v0076v0076vv0076, jjjxxxj.SCAN_PACKAGES, this.vv0076v0076v0076.get(), i2, tMXScanEndNotifier);
        }
        lqlqqll.uuuu00750075u(v0076vvv0076v, "scanPackages(scanPackages): aborted! init method is not called");
        return false;
    }

    public TMXProfilingHandle profile(@Nonnull String str, @Nonnull TMXEndNotifier tMXEndNotifier) {
        return profile(new TMXProfilingOptions().setSessionID(str), tMXEndNotifier);
    }

    public boolean scanPackages(TMXScanEndNotifier tMXScanEndNotifier) {
        return scanPackages(0, TimeUnit.SECONDS, tMXScanEndNotifier);
    }
}
