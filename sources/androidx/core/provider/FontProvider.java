package androidx.core.provider;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.collection.LruCache;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
class FontProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f2446a = new LruCache(2);
    public static final a b = new a();

    public interface ContentQueryWrapper {
    }

    public static class ContentQueryWrapperApi16Impl implements ContentQueryWrapper {
    }

    @RequiresApi
    public static class ContentQueryWrapperApi24Impl implements ContentQueryWrapper {

        /* renamed from: a, reason: collision with root package name */
        public final ContentProviderClient f2447a;

        public ContentQueryWrapperApi24Impl(Context context, Uri uri) {
            this.f2447a = context.getContentResolver().acquireUnstableContentProviderClient(uri);
        }
    }

    public static class ProviderCacheKey {

        /* renamed from: a, reason: collision with root package name */
        public String f2448a;
        public String b;
        public List c;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProviderCacheKey)) {
                return false;
            }
            ProviderCacheKey providerCacheKey = (ProviderCacheKey) obj;
            return Objects.equals(this.f2448a, providerCacheKey.f2448a) && Objects.equals(this.b, providerCacheKey.b) && Objects.equals(this.c, providerCacheKey.c);
        }

        public final int hashCode() {
            return Objects.hash(this.f2448a, this.b, this.c);
        }
    }

    public static FontsContractCompat.FontFamilyResult a(Context context, List list) {
        Trace.beginSection(androidx.tracing.Trace.f("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                FontRequest fontRequest = (FontRequest) list.get(i);
                ProviderInfo providerInfoB = b(context.getPackageManager(), fontRequest, context.getResources());
                if (providerInfoB == null) {
                    return new FontsContractCompat.FontFamilyResult();
                }
                arrayList.add(c(context, fontRequest, providerInfoB.authority));
            }
            return new FontsContractCompat.FontFamilyResult(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, FontRequest fontRequest, Resources resources) {
        a aVar = b;
        LruCache lruCache = f2446a;
        Trace.beginSection(androidx.tracing.Trace.f("FontProvider.getProvider"));
        try {
            List listB = fontRequest.d;
            String str = fontRequest.f2449a;
            String str2 = fontRequest.b;
            if (listB == null) {
                listB = FontResourcesParserCompat.b(resources, 0);
            }
            ProviderCacheKey providerCacheKey = new ProviderCacheKey();
            providerCacheKey.f2448a = str;
            providerCacheKey.b = str2;
            providerCacheKey.c = listB;
            ProviderInfo providerInfo = (ProviderInfo) lruCache.get(providerCacheKey);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, aVar);
            for (int i = 0; i < listB.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listB.get(i));
                Collections.sort(arrayList2, aVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    lruCache.put(providerCacheKey, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static FontsContractCompat.FontInfo[] c(Context context, FontRequest fontRequest, String str) {
        Trace.beginSection(androidx.tracing.Trace.f("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClient = new ContentQueryWrapperApi24Impl(context, uriBuild).f2447a;
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(androidx.tracing.Trace.f("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {fontRequest.c};
                    if (contentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new FontsContractCompat.FontInfo(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClient != null) {
                        contentProviderClient.close();
                    }
                    return (FontsContractCompat.FontInfo[]) arrayList.toArray(new FontsContractCompat.FontInfo[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClient != null) {
                    contentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
