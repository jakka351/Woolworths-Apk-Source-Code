package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.parser.LottieCompositionMoshiParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import com.medallia.digital.mobilesdk.q2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okio.Okio;
import okio.RealBufferedSource;
import okio.RealBufferedSource$inputStream$1;

/* loaded from: classes4.dex */
public class LottieCompositionFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13343a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static LottieTask a(final String str, Callable callable, Runnable runnable) {
        LottieComposition lottieCompositionA = str == null ? null : LottieCompositionCache.b.a(str);
        LottieTask lottieTask = lottieCompositionA != null ? new LottieTask(lottieCompositionA) : null;
        HashMap map = f13343a;
        if (str != null && map.containsKey(str)) {
            lottieTask = (LottieTask) map.get(str);
        }
        if (lottieTask != null) {
            if (runnable != null) {
                runnable.run();
            }
            return lottieTask;
        }
        LottieTask lottieTask2 = new LottieTask(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            lottieTask2.b(new LottieListener() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = LottieCompositionFactory.f13343a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                LottieCompositionFactory.j(true);
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = LottieCompositionFactory.f13343a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                LottieCompositionFactory.j(true);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            lottieTask2.a(new LottieListener() { // from class: com.airbnb.lottie.j
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = LottieCompositionFactory.f13343a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                LottieCompositionFactory.j(true);
                                break;
                            }
                            break;
                        default:
                            HashMap map3 = LottieCompositionFactory.f13343a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                LottieCompositionFactory.j(true);
                                break;
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, lottieTask2);
                if (map.size() == 1) {
                    j(false);
                }
            }
        }
        return lottieTask2;
    }

    public static LottieResult b(Context context, String str, String str2) {
        LottieComposition lottieCompositionA = str2 == null ? null : LottieCompositionCache.b.a(str2);
        if (lottieCompositionA != null) {
            return new LottieResult(lottieCompositionA);
        }
        try {
            RealBufferedSource realBufferedSourceC = Okio.c(Okio.h(context.getAssets().open(str)));
            return i(realBufferedSourceC, c).booleanValue() ? g(context, new ZipInputStream(new RealBufferedSource$inputStream$1(realBufferedSourceC)), str2) : i(realBufferedSourceC, d).booleanValue() ? c(new GZIPInputStream(new RealBufferedSource$inputStream$1(realBufferedSourceC)), str2) : d(JsonReader.e(realBufferedSourceC), str2, true);
        } catch (IOException e) {
            return new LottieResult(e);
        }
    }

    public static LottieResult c(InputStream inputStream, String str) {
        return d(JsonReader.e(Okio.c(Okio.h(inputStream))), str, true);
    }

    public static LottieResult d(JsonReader jsonReader, String str, boolean z) throws IOException {
        LottieComposition lottieCompositionA;
        try {
            if (str == null) {
                lottieCompositionA = null;
            } else {
                try {
                    lottieCompositionA = LottieCompositionCache.b.a(str);
                } catch (Exception e) {
                    LottieResult lottieResult = new LottieResult(e);
                    if (z) {
                        Utils.b(jsonReader);
                    }
                    return lottieResult;
                }
            }
            if (lottieCompositionA != null) {
                LottieResult lottieResult2 = new LottieResult(lottieCompositionA);
                if (z) {
                    Utils.b(jsonReader);
                }
                return lottieResult2;
            }
            LottieComposition lottieCompositionA2 = LottieCompositionMoshiParser.a(jsonReader);
            if (str != null) {
                LottieCompositionCache.b.f13394a.put(str, lottieCompositionA2);
            }
            LottieResult lottieResult3 = new LottieResult(lottieCompositionA2);
            if (z) {
                Utils.b(jsonReader);
            }
            return lottieResult3;
        } catch (Throwable th) {
            if (z) {
                Utils.b(jsonReader);
            }
            throw th;
        }
    }

    public static LottieTask e(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return a(str, new Callable() { // from class: com.airbnb.lottie.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = LottieCompositionFactory.f13343a;
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return LottieCompositionFactory.f(context2, i, str);
            }
        }, null);
    }

    public static LottieResult f(Context context, int i, String str) {
        LottieComposition lottieCompositionA = str == null ? null : LottieCompositionCache.b.a(str);
        if (lottieCompositionA != null) {
            return new LottieResult(lottieCompositionA);
        }
        try {
            RealBufferedSource realBufferedSourceC = Okio.c(Okio.h(context.getResources().openRawResource(i)));
            if (i(realBufferedSourceC, c).booleanValue()) {
                return g(context, new ZipInputStream(new RealBufferedSource$inputStream$1(realBufferedSourceC)), str);
            }
            if (!i(realBufferedSourceC, d).booleanValue()) {
                return d(JsonReader.e(realBufferedSourceC), str, true);
            }
            try {
                return c(new GZIPInputStream(new RealBufferedSource$inputStream$1(realBufferedSourceC)), str);
            } catch (IOException e) {
                return new LottieResult(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new LottieResult(e2);
        }
    }

    public static LottieResult g(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        try {
            return h(context, zipInputStream, str);
        } finally {
            Utils.b(zipInputStream);
        }
    }

    public static LottieResult h(Context context, ZipInputStream zipInputStream, String str) throws IOException {
        LottieComposition lottieCompositionA;
        LottieImageAsset lottieImageAsset;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            lottieCompositionA = null;
        } else {
            try {
                lottieCompositionA = LottieCompositionCache.b.a(str);
            } catch (IOException e) {
                return new LottieResult(e);
            }
        }
        if (lottieCompositionA != null) {
            return new LottieResult(lottieCompositionA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        LottieComposition lottieComposition = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                lottieComposition = d(JsonReader.e(Okio.c(Okio.h(zipInputStream))), null, false).f13347a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(q2.c);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(q2.c);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new LottieResult(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStream2.write(bArr, 0, i);
                            }
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            fileOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    Logger.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    Logger.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (lottieComposition == null) {
            return new LottieResult(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) lottieComposition.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    lottieImageAsset = null;
                    break;
                }
                lottieImageAsset = (LottieImageAsset) it.next();
                if (lottieImageAsset.d.equals(str4)) {
                    break;
                }
            }
            if (lottieImageAsset != null) {
                lottieImageAsset.f = Utils.d((Bitmap) entry.getValue(), lottieImageAsset.f13345a, lottieImageAsset.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (Font font : lottieComposition.f.values()) {
                if (font.f13391a.equals(entry2.getKey())) {
                    font.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                Logger.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) lottieComposition.c()).entrySet().iterator();
            while (it2.hasNext()) {
                LottieImageAsset lottieImageAsset2 = (LottieImageAsset) ((Map.Entry) it2.next()).getValue();
                if (lottieImageAsset2 == null) {
                    return null;
                }
                String str5 = lottieImageAsset2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        lottieImageAsset2.f = Utils.d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), lottieImageAsset2.f13345a, lottieImageAsset2.b);
                    } catch (IllegalArgumentException e2) {
                        Logger.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            LottieCompositionCache.b.f13394a.put(str, lottieComposition);
        }
        return new LottieResult(lottieComposition);
    }

    public static Boolean i(RealBufferedSource realBufferedSource, byte[] bArr) {
        try {
            RealBufferedSource realBufferedSourceB = realBufferedSource.b();
            for (byte b2 : bArr) {
                if (realBufferedSourceB.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            realBufferedSourceB.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            Logger.f13477a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j(boolean z) {
        ArrayList arrayList = new ArrayList(b);
        for (int i = 0; i < arrayList.size(); i++) {
            ((LottieTaskIdleListener) arrayList.get(i)).a();
        }
    }

    public static String k(int i, Context context) {
        return YU.a.n(new StringBuilder("rawRes"), (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", i);
    }
}
