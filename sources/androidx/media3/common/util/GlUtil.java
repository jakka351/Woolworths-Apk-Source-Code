package androidx.media3.common.util;

import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public final class GlUtil {

    public static final class GlException extends Exception {
    }

    public static void a(int i, int i2) throws GlException {
        GLES20.glBindTexture(i, i2);
        b();
        GLES20.glTexParameteri(i, 10240, 9729);
        b();
        GLES20.glTexParameteri(i, 10241, 9729);
        b();
        GLES20.glTexParameteri(i, 10242, 33071);
        b();
        GLES20.glTexParameteri(i, 10243, 33071);
        b();
    }

    public static void b() throws GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = android.support.v4.media.session.a.k(iGlGetError, new StringBuilder("error code: 0x"));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString());
        }
    }

    public static void c(String str, boolean z) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static FloatBuffer d(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
