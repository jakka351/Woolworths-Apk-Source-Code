package com.adobe.marketing.mobile.services.internal.caching;

import YU.a;
import com.adobe.marketing.mobile.internal.util.FileUtils;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.caching.CacheEntry;
import com.adobe.marketing.mobile.services.caching.CacheService;
import com.adobe.marketing.mobile.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import kotlin.io.FilesKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class FileCacheService implements CacheService {

    /* renamed from: a, reason: collision with root package name */
    public final CacheFileManager f13246a = new CacheFileManager();

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.adobe.marketing.mobile.services.caching.CacheResult a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            com.adobe.marketing.mobile.services.internal.caching.CacheFileManager r0 = r8.f13246a
            java.lang.String r1 = r0.b(r9, r10)
            r2 = 0
            if (r1 != 0) goto Lb
        L9:
            r3 = r2
            goto L16
        Lb:
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            boolean r1 = r3.exists()
            if (r1 == 0) goto L9
        L16:
            if (r3 != 0) goto L19
            return r2
        L19:
            boolean r1 = com.adobe.marketing.mobile.services.internal.caching.CacheFileManager.a(r9, r10)
            if (r1 != 0) goto L21
        L1f:
            r1 = r2
            goto L69
        L21:
            java.lang.String r0 = r0.c(r9, r10)
            if (r0 != 0) goto L2b
            com.adobe.marketing.mobile.services.Log.a()
            goto L1f
        L2b:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.lang.String r0 = com.adobe.marketing.mobile.internal.util.FileUtils.b(r1)
            if (r0 != 0) goto L3a
            com.adobe.marketing.mobile.services.Log.a()
            goto L1f
        L3a:
            java.util.HashMap r1 = new java.util.HashMap     // Catch: org.json.JSONException -> L61
            r1.<init>()     // Catch: org.json.JSONException -> L61
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L61
            org.json.JSONTokener r5 = new org.json.JSONTokener     // Catch: org.json.JSONException -> L61
            r5.<init>(r0)     // Catch: org.json.JSONException -> L61
            r4.<init>(r5)     // Catch: org.json.JSONException -> L61
            java.util.Iterator r0 = r4.keys()     // Catch: org.json.JSONException -> L61
        L4d:
            boolean r5 = r0.hasNext()     // Catch: org.json.JSONException -> L61
            if (r5 == 0) goto L69
            java.lang.Object r5 = r0.next()     // Catch: org.json.JSONException -> L61
            java.lang.String r5 = (java.lang.String) r5     // Catch: org.json.JSONException -> L61
            java.lang.String r6 = r4.optString(r5)     // Catch: org.json.JSONException -> L61
            r1.put(r5, r6)     // Catch: org.json.JSONException -> L61
            goto L4d
        L61:
            r0 = move-exception
            r0.getMessage()
            com.adobe.marketing.mobile.services.Log.a()
            goto L1f
        L69:
            if (r1 != 0) goto L72
            com.adobe.marketing.mobile.services.Log.a()
            r8.b(r9, r10)
            return r2
        L72:
            java.lang.String r0 = "expiryInMillis"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L82
            com.adobe.marketing.mobile.services.caching.CacheExpiry r0 = new com.adobe.marketing.mobile.services.caching.CacheExpiry     // Catch: java.lang.NumberFormatException -> L91
            r0.<init>(r2)     // Catch: java.lang.NumberFormatException -> L91
            goto La1
        L82:
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.NumberFormatException -> L91
            long r5 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L91
            r4.<init>(r5)     // Catch: java.lang.NumberFormatException -> L91
            com.adobe.marketing.mobile.services.caching.CacheExpiry r0 = new com.adobe.marketing.mobile.services.caching.CacheExpiry     // Catch: java.lang.NumberFormatException -> L91
            r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L91
            goto La1
        L91:
            com.adobe.marketing.mobile.services.Log.a()
            java.util.Date r0 = new java.util.Date
            r4 = 0
            r0.<init>(r4)
            com.adobe.marketing.mobile.services.caching.CacheExpiry r4 = new com.adobe.marketing.mobile.services.caching.CacheExpiry
            r4.<init>(r0)
            r0 = r4
        La1:
            java.util.Date r0 = r0.f13243a
            if (r0 == 0) goto Lb8
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r0.getTime()
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 < 0) goto Lb8
            com.adobe.marketing.mobile.services.Log.a()
            r8.b(r9, r10)
            return r2
        Lb8:
            com.adobe.marketing.mobile.services.internal.caching.FileCacheResult r9 = new com.adobe.marketing.mobile.services.internal.caching.FileCacheResult
            r9.<init>(r3, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.services.internal.caching.FileCacheService.a(java.lang.String, java.lang.String):com.adobe.marketing.mobile.services.caching.CacheResult");
    }

    public final void b(String str, String str2) {
        if (CacheFileManager.a(str, str2)) {
            CacheFileManager cacheFileManager = this.f13246a;
            String strB = cacheFileManager.b(str, str2);
            File file = null;
            if (strB != null) {
                File file2 = new File(strB);
                if (file2.exists()) {
                    file = file2;
                }
            }
            if (file == null) {
                Log.a();
                return;
            }
            if (!FilesKt.b(file)) {
                Log.a();
                return;
            }
            String strC = cacheFileManager.c(str, str2);
            if (strC != null) {
                Log.a();
                FilesKt.b(new File(strC));
            }
        }
    }

    public final boolean c(String str, String str2, CacheEntry cacheEntry) {
        boolean zC;
        File file = null;
        if (!StringUtils.a(str)) {
            File fileC = ServiceProvider.a().f13238a.c();
            if (fileC != null && fileC.isDirectory() && fileC.canWrite()) {
                File file2 = new File(fileC, a.o(new StringBuilder("aepsdkcache"), File.separator, str));
                if (file2.exists() || file2.mkdirs()) {
                    file = file2;
                } else {
                    Log.a();
                }
            } else {
                Log.a();
            }
        }
        if (file == null) {
            Log.a();
            return false;
        }
        if (!CacheFileManager.a(str, str2)) {
            return false;
        }
        CacheFileManager cacheFileManager = this.f13246a;
        String strB = cacheFileManager.b(str, str2);
        if (strB == null) {
            Log.a();
            return false;
        }
        if (!FileUtils.c(cacheEntry.f13242a, new File(strB))) {
            Log.a();
            return false;
        }
        String strC = cacheFileManager.c(str, str2);
        if (StringUtils.a(strC)) {
            zC = false;
        } else {
            HashMap mapR = androidx.constraintlayout.core.state.a.r("pathToFile", strB);
            HashMap map = cacheEntry.b;
            if (map != null) {
                mapR.putAll(map);
            }
            try {
                zC = FileUtils.c(new ByteArrayInputStream(new JSONObject(mapR).toString().getBytes(StandardCharsets.UTF_8)), new File(strC));
            } catch (Exception unused) {
                Log.a();
            }
        }
        if (zC) {
            return true;
        }
        Log.a();
        FilesKt.b(new File(strB));
        return false;
    }
}
