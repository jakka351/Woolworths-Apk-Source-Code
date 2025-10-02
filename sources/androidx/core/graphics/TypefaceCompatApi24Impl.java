package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
class TypefaceCompatApi24Impl extends TypefaceCompatBaseImpl {
    public static final Class b;
    public static final Constructor c;
    public static final Method d;
    public static final Method e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        c = constructor;
        b = cls;
        d = method2;
        e = method;
    }

    public static boolean h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface i(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface a(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.f2419a) {
                int i2 = fontFileResourceEntry.f;
                File fileD = TypefaceCompatUtil.d(context);
                if (fileD != null) {
                    try {
                        if (TypefaceCompatUtil.b(fileD, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileD);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && h(objNewInstance, map, fontFileResourceEntry.e, fontFileResourceEntry.b, fontFileResourceEntry.c)) {
                            }
                        }
                    } finally {
                        fileD.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return i(objNewInstance);
        }
        return null;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public final Typeface b(Context context, FontsContractCompat.FontInfo[] fontInfoArr, int i) throws IllegalAccessException, InstantiationException, IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        Object objNewInstance;
        try {
            objNewInstance = c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i2 = 0;
            SimpleArrayMap simpleArrayMap = new SimpleArrayMap(0);
            int length = fontInfoArr.length;
            while (true) {
                if (i2 < length) {
                    FontsContractCompat.FontInfo fontInfo = fontInfoArr[i2];
                    Uri uri = fontInfo.f2453a;
                    ByteBuffer byteBufferE = (ByteBuffer) simpleArrayMap.get(uri);
                    if (byteBufferE == null) {
                        byteBufferE = TypefaceCompatUtil.e(context, uri);
                        simpleArrayMap.put(uri, byteBufferE);
                    }
                    if (byteBufferE == null || !h(objNewInstance, byteBufferE, fontInfo.b, fontInfo.c, fontInfo.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface typefaceI = i(objNewInstance);
                    if (typefaceI != null) {
                        return Typeface.create(typefaceI, i);
                    }
                }
            }
        }
        return null;
    }
}
