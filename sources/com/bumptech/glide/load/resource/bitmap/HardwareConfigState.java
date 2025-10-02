package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class HardwareConfigState {
    public static final boolean e;
    public static final boolean f;
    public static final File g;
    public static volatile HardwareConfigState h;
    public int b;
    public boolean c = true;
    public final AtomicBoolean d = new AtomicBoolean(false);

    /* renamed from: a, reason: collision with root package name */
    public final int f13915a = 20000;

    static {
        e = Build.VERSION.SDK_INT < 29;
        f = true;
        g = new File("/proc/self/fd");
    }

    public static HardwareConfigState a() {
        if (h == null) {
            synchronized (HardwareConfigState.class) {
                try {
                    if (h == null) {
                        h = new HardwareConfigState();
                    }
                } finally {
                }
            }
        }
        return h;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return 500;
                }
            }
        }
        return this.f13915a;
    }

    public final boolean c(int i, int i2, boolean z, boolean z2) {
        boolean z3;
        if (z) {
            if (f) {
                if (!e || this.d.get()) {
                    if (z2) {
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                            return false;
                        }
                    } else if (i >= 0 && i2 >= 0) {
                        synchronized (this) {
                            try {
                                int i3 = this.b + 1;
                                this.b = i3;
                                if (i3 >= 50) {
                                    this.b = 0;
                                    int length = g.list().length;
                                    long jB = b();
                                    boolean z4 = ((long) length) < jB;
                                    this.c = z4;
                                    if (!z4 && Log.isLoggable("Downsampler", 5)) {
                                        Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jB);
                                    }
                                }
                                z3 = this.c;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (z3) {
                            return true;
                        }
                        if (Log.isLoggable("HardwareConfig", 2)) {
                            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                            return false;
                        }
                    } else if (Log.isLoggable("HardwareConfig", 2)) {
                        Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
                    }
                } else if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed by app state");
                    return false;
                }
            } else if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed by caller");
            return false;
        }
        return false;
    }
}
