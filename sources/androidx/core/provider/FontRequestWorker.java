package androidx.core.provider;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.collection.LruCache;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.provider.FontsContractCompat;
import androidx.core.provider.RequestExecutor;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
class FontRequestWorker {

    /* renamed from: a, reason: collision with root package name */
    public static final LruCache f2450a = new LruCache(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final SimpleArrayMap d;

    /* renamed from: androidx.core.provider.FontRequestWorker$3, reason: invalid class name */
    class AnonymousClass3 implements Callable<TypefaceResult> {
        public final /* synthetic */ String d;
        public final /* synthetic */ Context e;
        public final /* synthetic */ List f;
        public final /* synthetic */ int g;

        public AnonymousClass3(String str, Context context, List list, int i) {
            this.d = str;
            this.e = context;
            this.f = list;
            this.g = i;
        }

        @Override // java.util.concurrent.Callable
        public final TypefaceResult call() {
            try {
                return FontRequestWorker.b(this.d, this.e, this.f, this.g);
            } catch (Throwable unused) {
                return new TypefaceResult(-3);
            }
        }
    }

    static {
        RequestExecutor.DefaultThreadFactory defaultThreadFactory = new RequestExecutor.DefaultThreadFactory();
        defaultThreadFactory.d = "fonts-androidx";
        defaultThreadFactory.e = 10;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, ModuleDescriptor.MODULE_VERSION, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), defaultThreadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new SimpleArrayMap(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((FontRequest) list.get(i2)).e);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    public static TypefaceResult b(String str, Context context, List list, int i) {
        int i2;
        LruCache lruCache = f2450a;
        Trace.beginSection(androidx.tracing.Trace.f("getFontSync"));
        try {
            Typeface typeface = (Typeface) lruCache.get(str);
            if (typeface != null) {
                return new TypefaceResult(typeface);
            }
            FontsContractCompat.FontFamilyResult fontFamilyResultA = FontProvider.a(context, list);
            List list2 = fontFamilyResultA.b;
            int i3 = fontFamilyResultA.f2452a;
            if (i3 != 0) {
                i2 = i3 != 1 ? -3 : -2;
            } else {
                FontsContractCompat.FontInfo[] fontInfoArr = (FontsContractCompat.FontInfo[]) list2.get(0);
                if (fontInfoArr == null || fontInfoArr.length == 0) {
                    i2 = 1;
                } else {
                    int length = fontInfoArr.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            i2 = 0;
                            break;
                        }
                        int i5 = fontInfoArr[i4].e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
            }
            if (i2 != 0) {
                return new TypefaceResult(i2);
            }
            Typeface typefaceA = (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) ? TypefaceCompat.a(context, (FontsContractCompat.FontInfo[]) list2.get(0), i) : TypefaceCompat.b(context, list2, i);
            if (typefaceA == null) {
                return new TypefaceResult(-3);
            }
            lruCache.put(str, typefaceA);
            return new TypefaceResult(typefaceA);
        } catch (PackageManager.NameNotFoundException unused) {
            return new TypefaceResult(-1);
        } finally {
            Trace.endSection();
        }
    }

    public static final class TypefaceResult {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f2451a;
        public final int b;

        public TypefaceResult(int i) {
            this.f2451a = null;
            this.b = i;
        }

        public TypefaceResult(Typeface typeface) {
            this.f2451a = typeface;
            this.b = 0;
        }
    }
}
