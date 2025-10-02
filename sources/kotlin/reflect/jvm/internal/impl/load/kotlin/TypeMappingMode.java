package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes7.dex */
public final class TypeMappingMode {
    public static final TypeMappingMode k = new TypeMappingMode(false, false, false, false, false, new TypeMappingMode(false, false, false, false, false, null, false, null, null, 1023), false, null, null, 988);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f24477a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final TypeMappingMode f;
    public final boolean g;
    public final TypeMappingMode h;
    public final TypeMappingMode i;
    public final boolean j;

    public static final class Companion {
    }

    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public TypeMappingMode(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TypeMappingMode typeMappingMode, boolean z6, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        z3 = (i & 4) != 0 ? false : z3;
        z4 = (i & 8) != 0 ? false : z4;
        z5 = (i & 16) != 0 ? false : z5;
        typeMappingMode = (i & 32) != 0 ? null : typeMappingMode;
        z6 = (i & 64) != 0 ? true : z6;
        typeMappingMode2 = (i & 128) != 0 ? typeMappingMode : typeMappingMode2;
        typeMappingMode3 = (i & 256) != 0 ? typeMappingMode : typeMappingMode3;
        boolean z7 = (i & 512) == 0;
        this.f24477a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = typeMappingMode;
        this.g = z6;
        this.h = typeMappingMode2;
        this.i = typeMappingMode3;
        this.j = z7;
    }
}
