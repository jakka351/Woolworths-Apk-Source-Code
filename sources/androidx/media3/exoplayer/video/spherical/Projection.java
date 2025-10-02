package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.Assertions;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
final class Projection {

    /* renamed from: a, reason: collision with root package name */
    public final Mesh f3211a;
    public final Mesh b;
    public final int c;
    public final boolean d;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class Mesh {

        /* renamed from: a, reason: collision with root package name */
        public final SubMesh[] f3212a;

        public Mesh(SubMesh... subMeshArr) {
            this.f3212a = subMeshArr;
        }
    }

    public static final class SubMesh {

        /* renamed from: a, reason: collision with root package name */
        public final int f3213a;
        public final int b;
        public final float[] c;
        public final float[] d;

        public SubMesh(int i, int i2, float[] fArr, float[] fArr2) {
            this.f3213a = i;
            Assertions.b(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.c = fArr;
            this.d = fArr2;
            this.b = i2;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.f3211a = mesh;
        this.b = mesh2;
        this.c = i;
        this.d = mesh == mesh2;
    }
}
