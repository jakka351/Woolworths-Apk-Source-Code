package com.bumptech.glide.load.engine.bitmap_recycle;

import YU.a;
import android.graphics.Bitmap;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

@RequiresApi
/* loaded from: classes.dex */
public class SizeConfigStrategy implements LruPoolStrategy {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;
    public static final Bitmap.Config[] f;
    public static final Bitmap.Config[] g;
    public static final Bitmap.Config[] h;

    /* renamed from: a, reason: collision with root package name */
    public final KeyPool f13824a = new KeyPool();
    public final GroupedLinkedMap b = new GroupedLinkedMap();
    public final HashMap c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.SizeConfigStrategy$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13825a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f13825a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13825a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13825a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13825a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    public static final class Key implements Poolable {

        /* renamed from: a, reason: collision with root package name */
        public final KeyPool f13826a;
        public int b;
        public Bitmap.Config c;

        public Key(KeyPool keyPool) {
            this.f13826a = keyPool;
        }

        @Override // com.bumptech.glide.load.engine.bitmap_recycle.Poolable
        public final void a() {
            this.f13826a.c(this);
        }

        public final void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof Key) {
                Key key = (Key) obj;
                if (this.b == key.b && Util.b(this.c, key.c)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public final String toString() {
            return SizeConfigStrategy.c(this.b, this.c);
        }
    }

    @VisibleForTesting
    public static class KeyPool extends BaseKeyPool<Key> {
        @Override // com.bumptech.glide.load.engine.bitmap_recycle.BaseKeyPool
        public final Poolable a() {
            return new Key(this);
        }
    }

    static {
        Bitmap.Config[] configArr = (Bitmap.Config[]) Arrays.copyOf(new Bitmap.Config[]{Bitmap.Config.ARGB_8888, null}, 3);
        configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        d = configArr;
        e = configArr;
        f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String c(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapD.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapD.remove(num);
                return;
            } else {
                navigableMapD.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(Util.c(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int iD = Util.d(config) * i * i2;
        KeyPool keyPool = this.f13824a;
        Key key = (Key) keyPool.b();
        key.b(iD, config);
        if (Bitmap.Config.RGBA_F16.equals(config)) {
            configArr = e;
        } else {
            int i3 = AnonymousClass1.f13825a[config.ordinal()];
            configArr = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? new Bitmap.Config[]{config} : h : g : f : d;
        }
        int length = configArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer num = (Integer) d(config2).ceilingKey(Integer.valueOf(iD));
            if (num == null || num.intValue() > iD * 8) {
                i4++;
            } else if (num.intValue() != iD || (config2 != null ? !config2.equals(config) : config != null)) {
                keyPool.c(key);
                int iIntValue = num.intValue();
                key = (Key) keyPool.b();
                key.b(iIntValue, config2);
            }
        }
        Bitmap bitmap = (Bitmap) this.b.a(key);
        if (bitmap != null) {
            a(Integer.valueOf(key.b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public final NavigableMap d(Bitmap.Config config) {
        HashMap map = this.c;
        NavigableMap navigableMap = (NavigableMap) map.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(config, treeMap);
        return treeMap;
    }

    public final String e(int i, int i2, Bitmap.Config config) {
        return c(Util.d(config) * i * i2, config);
    }

    public final void f(Bitmap bitmap) {
        int iC = Util.c(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        Key key = (Key) this.f13824a.b();
        key.b(iC, config);
        this.b.b(key, bitmap);
        NavigableMap navigableMapD = d(bitmap.getConfig());
        Integer num = (Integer) navigableMapD.get(Integer.valueOf(key.b));
        navigableMapD.put(Integer.valueOf(key.b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public final String toString() {
        StringBuilder sbS = a.s("SizeConfigStrategy{groupedMap=");
        sbS.append(this.b);
        sbS.append(", sortedSizes=(");
        HashMap map = this.c;
        for (Map.Entry entry : map.entrySet()) {
            sbS.append(entry.getKey());
            sbS.append('[');
            sbS.append(entry.getValue());
            sbS.append("], ");
        }
        if (!map.isEmpty()) {
            sbS.replace(sbS.length() - 2, sbS.length(), "");
        }
        sbS.append(")}");
        return sbS.toString();
    }
}
