package com.adobe.mobile;

import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
final class MediaItem {
    public static final Object e = null;

    /* renamed from: a, reason: collision with root package name */
    public MediaState f13266a;
    public MediaState b;
    public boolean c;
    public int d;

    public static class MonitorThread extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws InterruptedException {
            ExecutorService executorService;
            while (true) {
                try {
                    Thread.sleep(0L);
                    synchronized (StaticMethods.J) {
                        try {
                            if (StaticMethods.I == null) {
                                StaticMethods.I = Executors.newSingleThreadExecutor();
                            }
                            executorService = StaticMethods.I;
                        } finally {
                        }
                    }
                    executorService.execute(new Runnable() { // from class: com.adobe.mobile.MediaItem.MonitorThread.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw null;
                        }
                    });
                } catch (InterruptedException e) {
                    StaticMethods.K("Media - Background Thread Interrupted : %s", e.getMessage());
                    return;
                }
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final void b(double d, int i) {
        MediaState mediaState;
        MediaState mediaState2 = this.f13266a;
        mediaState2.f = i == 6;
        if (d < 0.0d && (mediaState = this.b) != null) {
            d = (mediaState2.g - mediaState.g) + mediaState.c;
        }
        mediaState2.c = d;
        double d2 = mediaState2.b;
        if (d2 > 0.0d) {
            if (d >= d2) {
                d = d2;
            }
            mediaState2.c = d;
        }
        if (mediaState2.c < 0.0d) {
            mediaState2.c = 0.0d;
        }
        if (d2 != -1.0d) {
            double d3 = (mediaState2.c / d2) * 100.0d;
            mediaState2.d = d3;
            if (d3 >= 100.0d) {
                d3 = 100.0d;
            }
            mediaState2.d = d3;
        }
        if (d2 == -1.0d) {
            mediaState2.e = false;
        } else if (mediaState2.d >= 100.0d) {
            mediaState2.e = true;
        }
        throw null;
    }

    public final void c() {
        this.b = this.f13266a;
        MediaState mediaState = new MediaState();
        Date date = new Date();
        mediaState.e = false;
        mediaState.f = false;
        mediaState.b = 0.0d;
        mediaState.g = StaticMethods.E();
        mediaState.f13267a = 0;
        date.setTime((long) 0.0d);
        this.f13266a = mediaState;
    }
}
