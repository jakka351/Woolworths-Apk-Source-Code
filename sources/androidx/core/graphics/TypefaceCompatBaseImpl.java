package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
@RestrictTo
/* loaded from: classes.dex */
public class TypefaceCompatBaseImpl {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f2435a = new ConcurrentHashMap();

    /* renamed from: androidx.core.graphics.TypefaceCompatBaseImpl$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 implements StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry> {
        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final int a(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).b;
        }

        @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
        public final boolean b(Object obj) {
            return ((FontResourcesParserCompat.FontFileResourceEntry) obj).c;
        }
    }

    /* loaded from: classes2.dex */
    public interface StyleExtractor<T> {
        int a(Object obj);

        boolean b(Object obj);
    }

    public static Object f(Object[] objArr, int i, StyleExtractor styleExtractor) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        Object obj = null;
        int i3 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(styleExtractor.a(obj2) - i2) * 2) + (styleExtractor.b(obj2) == z ? 0 : 1);
            if (obj == null || i3 > iAbs) {
                obj = obj2;
                i3 = iAbs;
            }
        }
        return obj;
    }

    public Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) throws NoSuchFieldException, SecurityException {
        long jLongValue;
        FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry = (FontResourcesParserCompat.FontFileResourceEntry) f(fontFamilyFilesResourceEntry.a(), i, new StyleExtractor<FontResourcesParserCompat.FontFileResourceEntry>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.2
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public final int a(Object obj) {
                return ((FontResourcesParserCompat.FontFileResourceEntry) obj).b;
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public final boolean b(Object obj) {
                return ((FontResourcesParserCompat.FontFileResourceEntry) obj).c;
            }
        });
        if (fontFileResourceEntry == null) {
            return null;
        }
        Typeface typefaceD = TypefaceCompat.d(context, resources, fontFileResourceEntry.b(), fontFileResourceEntry.a(), 0, i);
        if (typefaceD == null) {
            jLongValue = 0;
        } else {
            try {
                Field declaredField = Typeface.class.getDeclaredField("native_instance");
                declaredField.setAccessible(true);
                jLongValue = ((Number) declaredField.get(typefaceD)).longValue();
            } catch (IllegalAccessException e) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            } catch (NoSuchFieldException e2) {
                Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            }
        }
        if (jLongValue != 0) {
            this.f2435a.put(Long.valueOf(jLongValue), fontFamilyFilesResourceEntry);
        }
        return typefaceD;
    }

    public Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fontInfoArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(g(fontInfoArr, i).b());
        } catch (IOException unused) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface typefaceD = d(context, inputStreamOpenInputStream);
            TypefaceCompatUtil.a(inputStreamOpenInputStream);
            return typefaceD;
        } catch (IOException unused2) {
            TypefaceCompatUtil.a(inputStreamOpenInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = inputStreamOpenInputStream;
            TypefaceCompatUtil.a(inputStream);
            throw th;
        }
    }

    public Typeface c(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, InputStream inputStream) {
        File fileD = TypefaceCompatUtil.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.c(inputStream, fileD)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i, String str, int i2) {
        File fileD = TypefaceCompatUtil.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (TypefaceCompatUtil.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public FontsContractCompat.FontInfo g(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        return (FontsContractCompat.FontInfo) f(fontInfoArr, i, new StyleExtractor<FontsContractCompat.FontInfo>() { // from class: androidx.core.graphics.TypefaceCompatBaseImpl.1
            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public final int a(Object obj) {
                return ((FontsContractCompat.FontInfo) obj).c;
            }

            @Override // androidx.core.graphics.TypefaceCompatBaseImpl.StyleExtractor
            public final boolean b(Object obj) {
                return ((FontsContractCompat.FontInfo) obj).d;
            }
        });
    }
}
