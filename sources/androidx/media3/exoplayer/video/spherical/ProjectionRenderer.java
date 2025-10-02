package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.exoplayer.video.spherical.Projection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
final class ProjectionRenderer {
    public static final float[] i = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};
    public static final float[] j = {1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, 1.0f};
    public static final float[] k = {0.5f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f3214a;
    public MeshData b;
    public GlProgram c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;

    public static class MeshData {

        /* renamed from: a, reason: collision with root package name */
        public final int f3215a;
        public final FloatBuffer b;
        public final FloatBuffer c;
        public final int d;

        public MeshData(Projection.SubMesh subMesh) {
            float[] fArr = subMesh.c;
            this.f3215a = fArr.length / 3;
            this.b = GlUtil.d(fArr);
            this.c = GlUtil.d(subMesh.d);
            int i = subMesh.b;
            if (i == 1) {
                this.d = 5;
            } else if (i != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public static boolean b(Projection projection) {
        Projection.Mesh mesh = projection.f3211a;
        Projection.Mesh mesh2 = projection.b;
        Projection.SubMesh[] subMeshArr = mesh.f3212a;
        if (subMeshArr.length == 1 && subMeshArr[0].f3213a == 0) {
            Projection.SubMesh[] subMeshArr2 = mesh2.f3212a;
            if (subMeshArr2.length == 1 && subMeshArr2[0].f3213a == 0) {
                return true;
            }
        }
        return false;
    }

    public final void a() {
        try {
            GlProgram glProgram = new GlProgram("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.c = glProgram;
            this.d = GLES20.glGetUniformLocation(glProgram.f2910a, "uMvpMatrix");
            this.e = GLES20.glGetUniformLocation(this.c.f2910a, "uTexMatrix");
            this.f = this.c.b("aPosition");
            this.g = this.c.b("aTexCoords");
            this.h = GLES20.glGetUniformLocation(this.c.f2910a, "uTexture");
        } catch (GlUtil.GlException e) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e);
        }
    }
}
