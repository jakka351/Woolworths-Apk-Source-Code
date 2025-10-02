package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.annotation.RestrictTo;
import androidx.collection.LruCache;
import androidx.compose.ui.input.pointer.a;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.provider.FontsContractCompat;
import java.util.List;

/* loaded from: classes.dex */
public class TypefaceCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final TypefaceCompatBaseImpl f2433a;
    public static final LruCache b;

    @RestrictTo
    /* loaded from: classes2.dex */
    public static class ResourcesCallbackAdapter extends FontsContractCompat.FontRequestCallback {

        /* renamed from: a, reason: collision with root package name */
        public final ResourcesCompat.FontCallback f2434a;

        public ResourcesCallbackAdapter(ResourcesCompat.FontCallback fontCallback) {
            this.f2434a = fontCallback;
        }
    }

    static {
        Trace.beginSection(androidx.tracing.Trace.f("TypefaceCompat static init"));
        if (Build.VERSION.SDK_INT >= 29) {
            f2433a = new TypefaceCompatApi29Impl();
        } else {
            f2433a = new TypefaceCompatApi28Impl();
        }
        b = new LruCache(16);
        Trace.endSection();
    }

    public static Typeface a(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        Trace.beginSection(androidx.tracing.Trace.f("TypefaceCompat.createFromFontInfo"));
        try {
            return f2433a.b(context, fontInfoArr, i);
        } finally {
            Trace.endSection();
        }
    }

    public static Typeface b(Context context, List list, int i) {
        Trace.beginSection(androidx.tracing.Trace.f("TypefaceCompat.createFromFontInfoWithFallback"));
        try {
            return f2433a.c(context, list, i);
        } finally {
            Trace.endSection();
        }
    }

    public static Typeface c(Context context, FontResourcesParserCompat.FamilyResourceEntry familyResourceEntry, Resources resources, int i, String str, int i2, int i3, ResourcesCompat.FontCallback fontCallback, boolean z) {
        Typeface typefaceA;
        if (familyResourceEntry instanceof FontResourcesParserCompat.ProviderResourceEntry) {
            FontResourcesParserCompat.ProviderResourceEntry providerResourceEntry = (FontResourcesParserCompat.ProviderResourceEntry) familyResourceEntry;
            String strD = providerResourceEntry.d();
            Typeface typeface = null;
            if (strD != null && !strD.isEmpty()) {
                Typeface typefaceCreate = Typeface.create(strD, 0);
                Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                    typeface = typefaceCreate;
                }
            }
            if (typeface != null) {
                if (fontCallback != null) {
                    fontCallback.b(typeface);
                }
                return typeface;
            }
            typefaceA = FontsContractCompat.b(context, providerResourceEntry.a() != null ? a.q(providerResourceEntry.c(), providerResourceEntry.a()) : a.p(providerResourceEntry.c()), i3, !z ? fontCallback != null : providerResourceEntry.b() != 0, z ? providerResourceEntry.e() : -1, ResourcesCompat.FontCallback.c(), new ResourcesCallbackAdapter(fontCallback));
        } else {
            typefaceA = f2433a.a(context, (FontResourcesParserCompat.FontFamilyFilesResourceEntry) familyResourceEntry, resources, i3);
            if (fontCallback != null) {
                if (typefaceA != null) {
                    fontCallback.b(typefaceA);
                } else {
                    fontCallback.a(-3);
                }
            }
        }
        if (typefaceA != null) {
            b.put(e(resources, i, str, i2, i3), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2, int i3) {
        Typeface typefaceE = f2433a.e(context, resources, i, str, i3);
        if (typefaceE != null) {
            b.put(e(resources, i, str, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    public static String e(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
