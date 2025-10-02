package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

@UnstableApi
/* loaded from: classes2.dex */
public final class MediaLibraryInfo {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f2865a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        if (f2865a.add(str)) {
            b += ", " + str;
        }
    }
}
