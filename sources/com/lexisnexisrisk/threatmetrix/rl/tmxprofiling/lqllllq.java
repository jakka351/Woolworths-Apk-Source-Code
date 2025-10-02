package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class lqllllq {
    private static final String a006100610061aa0061 = lqlqqll.u00750075u00750075u(lqllllq.class);
    private final ReentrantReadWriteLock aa00610061aa0061 = new ReentrantReadWriteLock();
    private volatile boolean aaaa0061a0061 = false;
    private volatile boolean a0061aa0061a0061 = false;
    private volatile boolean aa0061a0061a0061 = false;
    private volatile boolean a00610061a0061a0061 = false;
    private volatile boolean aaa00610061a0061 = false;
    private volatile boolean a0061a00610061a0061 = false;

    @Nullable
    private CountDownLatch aa006100610061a0061 = null;

    @Nullable
    private CountDownLatch a0061006100610061a0061 = null;

    private CountDownLatch jjjj006A006A006A(boolean z) {
        this.aa00610061aa0061.readLock().lock();
        try {
            if (!this.aaa00610061a0061 || this.a0061006100610061a0061 == null || (z && !this.a0061a00610061a0061)) {
                this.aa00610061aa0061.readLock().unlock();
                return null;
            }
            CountDownLatch countDownLatch = this.a0061006100610061a0061;
            this.aa00610061aa0061.readLock().unlock();
            return countDownLatch;
        } catch (Throwable th) {
            this.aa00610061aa0061.readLock().unlock();
            throw th;
        }
    }

    public boolean g006700670067gggg(int i) throws InterruptedException {
        CountDownLatch countDownLatch;
        boolean zAwait;
        this.aa00610061aa0061.readLock().lock();
        try {
            boolean z = false;
            if (!this.aaaa0061a0061 || (countDownLatch = this.aa006100610061a0061) == null) {
                lqlqqll.uuu007500750075u(a006100610061aa0061, "init not in progress, nothing to wait for");
            } else {
                this.aa00610061aa0061.readLock().unlock();
                String str = a006100610061aa0061;
                lqlqqll.uuu007500750075u(str, "Waiting for init to complete");
                try {
                    zAwait = countDownLatch.await(i, TimeUnit.MILLISECONDS);
                    if (!zAwait) {
                        try {
                            lqlqqll.uuuu00750075u(str, "Timed out waiting for init to complete");
                        } catch (InterruptedException e) {
                            e = e;
                            lqlqqll.u0075uu00750075u(a006100610061aa0061, "Waiting for init to complete interrupted", e);
                            this.aa00610061aa0061.readLock().lock();
                            if (this.aaaa0061a0061) {
                                z = true;
                            }
                            return z;
                        }
                    }
                } catch (InterruptedException e2) {
                    e = e2;
                    zAwait = false;
                }
                this.aa00610061aa0061.readLock().lock();
                try {
                    if (this.aaaa0061a0061 && zAwait) {
                        z = true;
                    }
                } finally {
                }
            }
            return z;
        } finally {
        }
    }

    public boolean g00670067ggggg() {
        lqlqqll.uuu007500750075u(a006100610061aa0061, "Attempting to cancel scanPackages");
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (this.a00610061a0061a0061) {
                this.aa00610061aa0061.writeLock().unlock();
                return false;
            }
            this.a00610061a0061a0061 = true;
            return this.aaa00610061a0061;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean g0067g0067gggg() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (this.a0061aa0061a0061) {
                return false;
            }
            this.a0061aa0061a0061 = true;
            this.aa0061a0061a0061 = false;
            return true;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public void g0067gggggg() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            this.aaaa0061a0061 = false;
            this.a0061aa0061a0061 = false;
            this.aaa00610061a0061 = false;
            this.a0061a00610061a0061 = false;
            this.a00610061a0061a0061 = false;
            this.aa0061a0061a0061 = false;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean gg00670067gggg(boolean z) {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (!this.aaa00610061a0061) {
                if (!this.a00610061a0061a0061) {
                    this.aaa00610061a0061 = true;
                    this.a0061006100610061a0061 = new CountDownLatch(1);
                    this.a0061a00610061a0061 = z;
                    return true;
                }
                lqlqqll.uuu007500750075u(a006100610061aa0061, "startScanning: aborted, marked as cancelled");
                this.a00610061a0061a0061 = false;
            }
            return false;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean gg0067ggggg() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (this.aa0061a0061a0061) {
                this.aa00610061aa0061.writeLock().unlock();
                return false;
            }
            this.aa0061a0061a0061 = true;
            return true;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean ggg0067gggg() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (this.aaaa0061a0061) {
                this.aa00610061aa0061.writeLock().unlock();
                return false;
            }
            this.aaaa0061a0061 = true;
            this.aa006100610061a0061 = new CountDownLatch(1);
            return true;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean gggg0067ggg(boolean z, @Nullable Long l) throws InterruptedException {
        CountDownLatch countDownLatchJjjj006A006A006A = jjjj006A006A006A(z);
        if (countDownLatchJjjj006A006A006A == null) {
            return true;
        }
        lqlqqll.uuu007500750075u(a006100610061aa0061, "waitForScan: Waiting for scan to complete");
        try {
            if (l != null) {
                return countDownLatchJjjj006A006A006A.await(l.longValue(), TimeUnit.MILLISECONDS);
            }
            countDownLatchJjjj006A006A006A.await();
            return true;
        } catch (InterruptedException unused) {
            lqlqqll.uuu007500750075u(a006100610061aa0061, "waitForScan was interrupted");
            return false;
        }
    }

    public void j006A006A006Aj006A006A() {
        CountDownLatch countDownLatch;
        this.aa00610061aa0061.readLock().lock();
        try {
            if (this.aaa00610061a0061) {
                this.aaa00610061a0061 = false;
                this.a00610061a0061a0061 = false;
                this.a0061a00610061a0061 = false;
                countDownLatch = this.a0061006100610061a0061;
            } else {
                countDownLatch = null;
            }
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public boolean j006A006Aj006A006A006A() {
        this.aa00610061aa0061.readLock().lock();
        try {
            CountDownLatch countDownLatch = this.aaaa0061a0061 ? this.aa006100610061a0061 : null;
            return countDownLatch != null && countDownLatch.getCount() > 0;
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public boolean j006A006Ajj006A006A() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (!this.aa0061a0061a0061) {
                return false;
            }
            this.aa0061a0061a0061 = false;
            this.aa00610061aa0061.writeLock().unlock();
            return true;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    public boolean j006Aj006A006A006A006A() {
        this.aa00610061aa0061.readLock().lock();
        try {
            return this.a0061aa0061a0061;
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public void j006Aj006Aj006A006A(boolean z) {
        this.aa00610061aa0061.readLock().lock();
        try {
            this.aaaa0061a0061 = z;
            CountDownLatch countDownLatch = this.aa006100610061a0061;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public boolean j006Ajj006A006A006A() {
        this.aa00610061aa0061.readLock().lock();
        try {
            return this.aa0061a0061a0061;
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public boolean jj006A006A006A006A006A(boolean z) {
        CountDownLatch countDownLatchJjjj006A006A006A = jjjj006A006A006A(z);
        return countDownLatchJjjj006A006A006A != null && countDownLatchJjjj006A006A006A.getCount() > 0;
    }

    public void jj006A006Aj006A006A() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            this.a0061aa0061a0061 = false;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean jj006Aj006A006A006A() {
        /*
            r4 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r4.aa00610061aa0061
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.util.concurrent.CountDownLatch r0 = r4.aa006100610061a0061     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r4.aaaa0061a0061     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            if (r0 == 0) goto L1f
            long r0 = r0.getCount()     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1f
            r0 = 1
            goto L20
        L1d:
            r0 = move-exception
            goto L2a
        L1f:
            r0 = 0
        L20:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.aa00610061aa0061
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            return r0
        L2a:
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r4.aa00610061aa0061
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r1.readLock()
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqllllq.jj006Aj006A006A006A():boolean");
    }

    public boolean jjj006A006A006A006A() {
        this.aa00610061aa0061.readLock().lock();
        try {
            return this.aaaa0061a0061;
        } finally {
            this.aa00610061aa0061.readLock().unlock();
        }
    }

    public boolean jjj006Aj006A006A() {
        this.aa00610061aa0061.writeLock().lock();
        try {
            if (!this.a00610061a0061a0061) {
                return false;
            }
            this.a00610061a0061a0061 = false;
            this.aa00610061aa0061.writeLock().unlock();
            return true;
        } finally {
            this.aa00610061aa0061.writeLock().unlock();
        }
    }
}
