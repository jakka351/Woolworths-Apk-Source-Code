package com.adobe.mobile;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
final class MediaAnalytics {
    public static final List b = Arrays.asList(null, "");
    public static MediaAnalytics c = null;
    public static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13265a = new HashMap();

    public static void a(MediaItem mediaItem, HashMap map, boolean z) {
        map.put("&&pe", z ? "m_s" : "m_i");
        map.put("&&pev3", "video");
        map.put("a.contentType", "video");
        map.put("a.media.name", null);
        map.put("a.media.playerName", null);
        map.put("a.media.length", Integer.toString((int) 0.0d));
    }

    public static MediaAnalytics d() {
        MediaAnalytics mediaAnalytics;
        synchronized (d) {
            try {
                if (c == null) {
                    c = new MediaAnalytics();
                }
                mediaAnalytics = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaAnalytics;
    }

    public final MediaItem b(String str) {
        HashMap map;
        String strReplace = (str == null || str.trim().length() == 0) ? null : str.replace("\n", "").replace("\r", "").replace("--**--", "");
        if (strReplace == null || strReplace.trim().length() == 0 || (map = this.f13265a) == null || map.size() == 0) {
            return null;
        }
        return (MediaItem) map.get(strReplace);
    }

    public final void c(MediaItem mediaItem) {
        if (mediaItem.f13266a.d >= 100.0d) {
            this.f13265a.remove(null);
        }
    }

    public final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public final void e(MediaItem mediaItem, HashMap map, boolean z) {
        HashMap map2 = map != null ? new HashMap(map) : new HashMap();
        a(mediaItem, map2, false);
        MediaState mediaState = mediaItem.f13266a;
        mediaItem.d = mediaState.f13267a;
        if (mediaItem.b == null) {
            map2.put("&&pe", "m_s");
            map2.put("a.media.view", Boolean.TRUE);
            AnalyticsTrackInternal.a("Media", map2, StaticMethods.E());
            mediaItem.f13266a.h = 0.0d;
            return;
        }
        if (mediaState.e) {
            if (!mediaItem.c) {
                map2.put("a.media.complete", String.valueOf(true));
                mediaItem.c = true;
                z = true;
            }
            c(mediaItem);
        }
        if (mediaItem.f13266a.f) {
            map2.put("a.media.clicked", String.valueOf(true));
        }
        mediaItem.f13266a.getClass();
        mediaItem.b.getClass();
        mediaItem.f13266a.getClass();
        mediaItem.b.getClass();
        if (z) {
            double d2 = mediaItem.f13266a.h;
            if (d2 > 0.0d) {
                map2.put("a.media.timePlayed", Integer.toString((int) d2));
            }
            AnalyticsTrackInternal.a("Media", map2, StaticMethods.E());
            mediaItem.f13266a.h = 0.0d;
        }
    }
}
