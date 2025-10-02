package androidx.camera.core.impl;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes2.dex */
public abstract class SurfaceConfig {

    public enum ConfigSize {
        VGA(0),
        s720p(1),
        PREVIEW(2),
        s1440p(3),
        RECORD(4),
        MAXIMUM(5),
        ULTRA_MAXIMUM(6),
        NOT_SUPPORT(7);

        public final int d;

        ConfigSize(int i) {
            this.d = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConfigType {
        public static final ConfigType d;
        public static final ConfigType e;
        public static final ConfigType f;
        public static final ConfigType g;
        public static final ConfigType h;
        public static final /* synthetic */ ConfigType[] i;

        static {
            ConfigType configType = new ConfigType("PRIV", 0);
            d = configType;
            ConfigType configType2 = new ConfigType("YUV", 1);
            e = configType2;
            ConfigType configType3 = new ConfigType("JPEG", 2);
            f = configType3;
            ConfigType configType4 = new ConfigType("JPEG_R", 3);
            g = configType4;
            ConfigType configType5 = new ConfigType("RAW", 4);
            h = configType5;
            i = new ConfigType[]{configType, configType2, configType3, configType4, configType5};
        }

        public static ConfigType valueOf(String str) {
            return (ConfigType) Enum.valueOf(ConfigType.class, str);
        }

        public static ConfigType[] values() {
            return (ConfigType[]) i.clone();
        }
    }

    public static SurfaceConfig a(ConfigType configType, ConfigSize configSize) {
        return new AutoValue_SurfaceConfig(configType, configSize, 0L);
    }

    public static SurfaceConfig b(ConfigType configType, ConfigSize configSize, long j) {
        return new AutoValue_SurfaceConfig(configType, configSize, j);
    }

    public static ConfigType e(int i) {
        return i == 35 ? ConfigType.e : i == 256 ? ConfigType.f : i == 4101 ? ConfigType.g : i == 32 ? ConfigType.h : ConfigType.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.camera.core.impl.SurfaceConfig g(int r2, int r3, android.util.Size r4, androidx.camera.core.impl.SurfaceSizeDefinition r5) {
        /*
            androidx.camera.core.impl.SurfaceConfig$ConfigType r0 = e(r3)
            int r4 = androidx.camera.core.internal.utils.SizeUtil.a(r4)
            r1 = 1
            if (r2 != r1) goto L3b
            r2 = r5
            androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition r2 = (androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition) r2
            java.util.Map r2 = r2.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r1)
            android.util.Size r2 = (android.util.Size) r2
            int r2 = androidx.camera.core.internal.utils.SizeUtil.a(r2)
            if (r4 > r2) goto L24
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s720p
            goto L97
        L24:
            androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition r5 = (androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition) r5
            java.util.Map r2 = r5.d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            android.util.Size r2 = (android.util.Size) r2
            int r2 = androidx.camera.core.internal.utils.SizeUtil.a(r2)
            if (r4 > r2) goto L95
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.s1440p
            goto L97
        L3b:
            r2 = r5
            androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition r2 = (androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition) r2
            android.util.Size r2 = r2.f470a
            int r2 = androidx.camera.core.internal.utils.SizeUtil.a(r2)
            if (r4 > r2) goto L49
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.VGA
            goto L97
        L49:
            r2 = r5
            androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition r2 = (androidx.camera.core.impl.AutoValue_SurfaceSizeDefinition) r2
            android.util.Size r1 = r2.c
            int r1 = androidx.camera.core.internal.utils.SizeUtil.a(r1)
            if (r4 > r1) goto L57
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.PREVIEW
            goto L97
        L57:
            android.util.Size r1 = r2.e
            int r1 = androidx.camera.core.internal.utils.SizeUtil.a(r1)
            if (r4 > r1) goto L62
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.RECORD
            goto L97
        L62:
            java.util.Map r5 = r5.c()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Object r5 = r5.get(r1)
            android.util.Size r5 = (android.util.Size) r5
            int r5 = androidx.camera.core.internal.utils.SizeUtil.a(r5)
            if (r4 > r5) goto L79
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.MAXIMUM
            goto L97
        L79:
            java.util.Map r2 = r2.g
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r2 = r2.get(r3)
            android.util.Size r2 = (android.util.Size) r2
            if (r2 == 0) goto L95
            int r3 = r2.getWidth()
            int r2 = r2.getHeight()
            int r2 = r2 * r3
            if (r4 > r2) goto L95
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.ULTRA_MAXIMUM
            goto L97
        L95:
            androidx.camera.core.impl.SurfaceConfig$ConfigSize r2 = androidx.camera.core.impl.SurfaceConfig.ConfigSize.NOT_SUPPORT
        L97:
            androidx.camera.core.impl.AutoValue_SurfaceConfig r3 = new androidx.camera.core.impl.AutoValue_SurfaceConfig
            r4 = 0
            r3.<init>(r0, r2, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.SurfaceConfig.g(int, int, android.util.Size, androidx.camera.core.impl.SurfaceSizeDefinition):androidx.camera.core.impl.SurfaceConfig");
    }

    public abstract ConfigSize c();

    public abstract ConfigType d();

    public abstract long f();
}
