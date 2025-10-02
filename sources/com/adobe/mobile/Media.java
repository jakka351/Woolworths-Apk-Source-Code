package com.adobe.mobile;

import java.util.HashMap;

/* loaded from: classes4.dex */
public final class Media {

    /* renamed from: com.adobe.mobile.Media$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (MediaAnalytics.d()) {
                throw null;
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$2, reason: invalid class name */
    final class AnonymousClass2 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                try {
                    MediaItem mediaItemB = mediaAnalyticsD.b(null);
                    if (mediaItemB == null) {
                        return;
                    }
                    synchronized (mediaItemB) {
                        mediaItemB.c();
                    }
                    mediaItemB.f13266a.getClass();
                    if (0.0d > 0.0d) {
                        mediaAnalyticsD.e(mediaItemB, null, true);
                    }
                    mediaAnalyticsD.f13265a.remove(null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                try {
                    MediaItem mediaItemB = mediaAnalyticsD.b(null);
                    if (mediaItemB == null) {
                        return;
                    }
                    synchronized (mediaItemB) {
                        if (mediaItemB.f13266a == null || !mediaItemB.a()) {
                            mediaItemB.c();
                            mediaItemB.b(0.0d, 1);
                            throw null;
                        }
                    }
                    if (mediaItemB.b == null) {
                        HashMap map = new HashMap();
                        map.put("a.media.view", String.valueOf(true));
                        MediaAnalytics.a(mediaItemB, map, true);
                        mediaItemB.d = mediaItemB.f13266a.f13267a;
                        AnalyticsTrackInternal.a("Media", map, StaticMethods.E());
                        mediaItemB.f13266a.h = 0.0d;
                        mediaAnalyticsD.c(mediaItemB);
                    } else if (mediaItemB.f13266a.f13267a == mediaItemB.d || 0.0d <= 0.0d) {
                        mediaAnalyticsD.e(mediaItemB, null, false);
                    } else {
                        mediaAnalyticsD.e(mediaItemB, null, true);
                    }
                    mediaAnalyticsD.c(mediaItemB);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaState mediaState;
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                MediaItem mediaItemB = mediaAnalyticsD.b(null);
                if (mediaItemB != null && mediaItemB.a()) {
                    synchronized (mediaItemB) {
                        mediaItemB.c();
                        mediaState = mediaItemB.b;
                        if (mediaState != null) {
                            mediaItemB.b(0.0d, 5);
                            throw null;
                        }
                    }
                    if (mediaState != null) {
                        mediaAnalyticsD.e(mediaItemB, null, false);
                    }
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                MediaItem mediaItemB = mediaAnalyticsD.b(null);
                if (mediaItemB != null && mediaItemB.a()) {
                    synchronized (mediaItemB) {
                        mediaItemB.c();
                        mediaItemB.b(0.0d, 2);
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$6, reason: invalid class name */
    final class AnonymousClass6 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaState mediaState;
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                MediaItem mediaItemB = mediaAnalyticsD.b(null);
                if (mediaItemB != null && mediaItemB.a()) {
                    synchronized (mediaItemB) {
                        mediaItemB.c();
                        mediaState = mediaItemB.b;
                        if (mediaState != null) {
                            mediaItemB.b(0.0d, 6);
                            throw null;
                        }
                    }
                    if (mediaState != null) {
                        mediaAnalyticsD.e(mediaItemB, null, true);
                    }
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Media$7, reason: invalid class name */
    final class AnonymousClass7 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            MediaAnalytics mediaAnalyticsD = MediaAnalytics.d();
            synchronized (mediaAnalyticsD) {
                MediaItem mediaItemB = mediaAnalyticsD.b(null);
                if (mediaItemB == null) {
                    return;
                }
                if (mediaItemB.f13266a != null) {
                    HashMap map = new HashMap();
                    map.values().removeAll(MediaAnalytics.b);
                    mediaAnalyticsD.e(mediaItemB, map, true);
                }
            }
        }
    }

    public interface MediaCallback<T> {
    }
}
