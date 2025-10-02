package androidx.media3.exoplayer.video;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

@UnstableApi
/* loaded from: classes2.dex */
public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements VideoDecoderOutputBufferRenderer {
    public static final /* synthetic */ int e = 0;
    public final Renderer d;

    public static final class Renderer implements GLSurfaceView.Renderer {
        public static final float[] m = {1.164f, 1.164f, 1.164f, BitmapDescriptorFactory.HUE_RED, -0.213f, 2.112f, 1.793f, -0.533f, BitmapDescriptorFactory.HUE_RED};
        public static final String[] n = {"y_tex", "u_tex", "v_tex"};
        public static final FloatBuffer o = GlUtil.d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
        public final VideoDecoderGLSurfaceView d;
        public final int[] e = new int[3];
        public final int[] f = new int[3];
        public final int[] g = new int[3];
        public final int[] h = new int[3];
        public final AtomicReference i = new AtomicReference();
        public GlProgram j;
        public int k;
        public VideoDecoderOutputBuffer l;

        public Renderer(VideoDecoderGLSurfaceView videoDecoderGLSurfaceView) {
            this.d = videoDecoderGLSurfaceView;
            for (int i = 0; i < 3; i++) {
                int[] iArr = this.g;
                this.h[i] = -1;
                iArr[i] = -1;
            }
        }

        public final void a() {
            int[] iArr = this.e;
            try {
                GLES20.glGenTextures(3, iArr, 0);
                for (int i = 0; i < 3; i++) {
                    GlProgram glProgram = this.j;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(glProgram.f2910a, n[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    GlUtil.a(3553, iArr[i]);
                }
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) this.i.getAndSet(null);
            if (videoDecoderOutputBuffer == null && this.l == null) {
                return;
            }
            if (videoDecoderOutputBuffer != null) {
                VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.l;
                if (videoDecoderOutputBuffer2 != null) {
                    videoDecoderOutputBuffer2.getClass();
                    throw null;
                }
                this.l = videoDecoderOutputBuffer;
            }
            this.l.getClass();
            GLES20.glUniformMatrix3fv(this.k, 1, false, m, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
            GLES20.glViewport(0, 0, i, i2);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f;
            try {
                GlProgram glProgram = new GlProgram("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.j = glProgram;
                GLES20.glVertexAttribPointer(glProgram.b("in_pos"), 2, 5126, false, 0, (Buffer) o);
                iArr[0] = this.j.b("in_tc_y");
                iArr[1] = this.j.b("in_tc_u");
                iArr[2] = this.j.b("in_tc_v");
                this.k = GLES20.glGetUniformLocation(this.j.f2910a, "mColorConversion");
                GlUtil.b();
                a();
                GlUtil.b();
            } catch (GlUtil.GlException e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, null);
    }

    @Deprecated
    public VideoDecoderOutputBufferRenderer getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(VideoDecoderOutputBuffer videoDecoderOutputBuffer) {
        Renderer renderer = this.d;
        if (((VideoDecoderOutputBuffer) renderer.i.getAndSet(videoDecoderOutputBuffer)) != null) {
            throw null;
        }
        renderer.d.requestRender();
    }

    public VideoDecoderGLSurfaceView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Renderer renderer = new Renderer(this);
        this.d = renderer;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setRenderMode(0);
    }
}
