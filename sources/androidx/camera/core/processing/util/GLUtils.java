package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.support.v4.media.session.a;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.b;
import androidx.camera.core.processing.ShaderProvider;
import androidx.core.util.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestrictTo
/* loaded from: classes2.dex */
public final class GLUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f561a = {12344};
    public static final int[] b = {12445, 13632, 12344};
    public static final String c;
    public static final String d;
    public static final ShaderProvider e;
    public static final ShaderProvider f;
    public static final ShaderProvider g;
    public static final FloatBuffer h;
    public static final FloatBuffer i;
    public static final OutputSurface j;

    /* renamed from: androidx.camera.core.processing.util.GLUtils$1, reason: invalid class name */
    public class AnonymousClass1 implements ShaderProvider {
        @Override // androidx.camera.core.processing.ShaderProvider
        public final String a() {
            Locale locale = Locale.US;
            return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(sTexture, vTextureCoord);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n";
        }
    }

    /* renamed from: androidx.camera.core.processing.util.GLUtils$2, reason: invalid class name */
    public class AnonymousClass2 implements ShaderProvider {
        @Override // androidx.camera.core.processing.ShaderProvider
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(sTexture, vTextureCoord);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}";
        }
    }

    /* renamed from: androidx.camera.core.processing.util.GLUtils$3, reason: invalid class name */
    public class AnonymousClass3 implements ShaderProvider {
        @Override // androidx.camera.core.processing.ShaderProvider
        public final String a() {
            Locale locale = Locale.US;
            return "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT sTexture;\nuniform float uAlphaScale;\nin vec2 vTextureCoord;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(sTexture, vTextureCoord).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}";
        }
    }

    public static class BlankShaderProgram extends Program2D {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class InputFormat {
        public static final InputFormat d;
        public static final InputFormat e;
        public static final InputFormat f;
        public static final /* synthetic */ InputFormat[] g;

        static {
            InputFormat inputFormat = new InputFormat("UNKNOWN", 0);
            d = inputFormat;
            InputFormat inputFormat2 = new InputFormat("DEFAULT", 1);
            e = inputFormat2;
            InputFormat inputFormat3 = new InputFormat("YUV", 2);
            f = inputFormat3;
            g = new InputFormat[]{inputFormat, inputFormat2, inputFormat3};
        }

        public static InputFormat valueOf(String str) {
            return (InputFormat) Enum.valueOf(InputFormat.class, str);
        }

        public static InputFormat[] values() {
            return (InputFormat[]) g.clone();
        }
    }

    public static abstract class Program2D {

        /* renamed from: a, reason: collision with root package name */
        public final int f562a;
        public int b = -1;
        public int c = -1;
        public int d = -1;

        /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public Program2D(java.lang.String r8, java.lang.String r9) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.String r0 = "glAttachShader"
                java.lang.String r1 = "Could not link program: "
                r7.<init>()
                r2 = -1
                r7.b = r2
                r7.c = r2
                r7.d = r2
                r3 = 35633(0x8b31, float:4.9932E-41)
                int r8 = androidx.camera.core.processing.util.GLUtils.k(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L71
                r3 = 35632(0x8b30, float:4.9931E-41)
                int r9 = androidx.camera.core.processing.util.GLUtils.k(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L6b
                int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L65
                java.lang.String r4 = "glCreateProgram"
                androidx.camera.core.processing.util.GLUtils.b(r4)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                androidx.camera.core.processing.util.GLUtils.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                androidx.camera.core.processing.util.GLUtils.b(r0)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0 = 1
                int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r5 = 35714(0x8b82, float:5.0046E-41)
                r6 = 0
                android.opengl.GLES20.glGetProgramiv(r3, r5, r4, r6)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4 = r4[r6]     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                if (r4 != r0) goto L4c
                r7.f562a = r3     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r7.a()
                return
            L48:
                r0 = move-exception
                goto L73
            L4a:
                r0 = move-exception
                goto L73
            L4c:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
                throw r0     // Catch: java.lang.IllegalArgumentException -> L48 java.lang.IllegalStateException -> L4a
            L62:
                r0 = move-exception
            L63:
                r3 = r2
                goto L73
            L65:
                r0 = move-exception
                goto L63
            L67:
                r0 = move-exception
            L68:
                r9 = r2
            L69:
                r3 = r9
                goto L73
            L6b:
                r0 = move-exception
                goto L68
            L6d:
                r0 = move-exception
            L6e:
                r8 = r2
                r9 = r8
                goto L69
            L71:
                r0 = move-exception
                goto L6e
            L73:
                if (r8 == r2) goto L78
                android.opengl.GLES20.glDeleteShader(r8)
            L78:
                if (r9 == r2) goto L7d
                android.opengl.GLES20.glDeleteShader(r9)
            L7d:
                if (r3 == r2) goto L82
                android.opengl.GLES20.glDeleteProgram(r3)
            L82:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.util.GLUtils.Program2D.<init>(java.lang.String, java.lang.String):void");
        }

        public final void a() {
            int i = this.f562a;
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
            this.d = iGlGetAttribLocation;
            GLUtils.e(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uTransMatrix");
            this.b = iGlGetUniformLocation;
            GLUtils.e(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uAlphaScale");
            this.c = iGlGetUniformLocation2;
            GLUtils.e(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glUseProgram(this.f562a);
            GLUtils.b("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.d);
            GLUtils.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) GLUtils.h);
            GLUtils.b("glVertexAttribPointer");
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
            GLUtils.b("glUniformMatrix4fv");
            GLES20.glUniform1f(this.c, 1.0f);
            GLUtils.b("glUniform1f");
        }
    }

    static {
        Locale locale = Locale.US;
        c = "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        d = "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n";
        e = new AnonymousClass1();
        f = new AnonymousClass2();
        g = new AnonymousClass3();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        floatBufferAsFloatBuffer.position(0);
        h = floatBufferAsFloatBuffer;
        float[] fArr = {BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        floatBufferAsFloatBuffer2.put(fArr);
        floatBufferAsFloatBuffer2.position(0);
        i = floatBufferAsFloatBuffer2;
        j = new AutoValue_OutputSurface(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new IllegalStateException(a.k(iEglGetError, YU.a.t(str, ": EGL error: 0x")));
        }
    }

    public static void b(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            throw new IllegalStateException(a.k(iGlGetError, YU.a.t(str, ": GL error 0x")));
        }
    }

    public static void c(Thread thread) {
        Preconditions.f("Method call must be called on the GL thread.", thread == Thread.currentThread());
    }

    public static void d(AtomicBoolean atomicBoolean, boolean z) {
        Preconditions.f(z ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized", z == atomicBoolean.get());
    }

    public static void e(int i2, String str) {
        if (i2 < 0) {
            throw new IllegalStateException(YU.a.h("Unable to locate '", str, "' in program"));
        }
    }

    public static int[] f(String str, DynamicRange dynamicRange) {
        int i2 = dynamicRange.f400a;
        int[] iArr = f561a;
        if (i2 == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return b;
            }
            Logger.e("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static HashMap g(DynamicRange dynamicRange) {
        Object samplerShaderProgram;
        InputFormat inputFormat;
        Map map = Collections.EMPTY_MAP;
        HashMap map2 = new HashMap();
        InputFormat[] inputFormatArrValues = InputFormat.values();
        int length = inputFormatArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            InputFormat inputFormat2 = inputFormatArrValues[i2];
            ShaderProvider shaderProvider = (ShaderProvider) map.get(inputFormat2);
            if (shaderProvider != null) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (inputFormat2 == InputFormat.f || inputFormat2 == (inputFormat = InputFormat.e)) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, inputFormat2);
            } else {
                Preconditions.f("Unhandled input format: " + inputFormat2, inputFormat2 == InputFormat.d);
                if (dynamicRange.a()) {
                    samplerShaderProgram = new BlankShaderProgram("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
                } else {
                    ShaderProvider shaderProvider2 = (ShaderProvider) map.get(inputFormat);
                    samplerShaderProgram = shaderProvider2 != null ? new SamplerShaderProgram(dynamicRange, shaderProvider2) : new SamplerShaderProgram(dynamicRange, inputFormat);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + inputFormat2 + " created: " + samplerShaderProgram);
            map2.put(inputFormat2, samplerShaderProgram);
        }
        return map2;
    }

    public static int h() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        b("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b("glTexParameter");
        return i2;
    }

    public static EGLSurface i(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        a("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static String j() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        strGroup2.getClass();
        return b.o(strGroup, ".", strGroup2);
    }

    public static int k(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        b("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.e("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        StringBuilder sbR = YU.a.r(i2, "Could not compile shader type ", ":");
        sbR.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        throw new IllegalStateException(sbR.toString());
    }

    public static class SamplerShaderProgram extends Program2D {
        public final int e;
        public final int f;
        public final int g;

        /* JADX WARN: Illegal instructions before constructor call */
        public SamplerShaderProgram(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
            String str = dynamicRange.a() ? GLUtils.d : GLUtils.c;
            try {
                String strA = shaderProvider.a();
                if (strA == null || !strA.contains("vTextureCoord") || !strA.contains("sTexture")) {
                    throw new IllegalArgumentException("Invalid fragment shader");
                }
                super(str, strA);
                this.e = -1;
                this.f = -1;
                this.g = -1;
                a();
                int i = this.f562a;
                int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "sTexture");
                this.e = iGlGetUniformLocation;
                GLUtils.e(iGlGetUniformLocation, "sTexture");
                int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aTextureCoord");
                this.g = iGlGetAttribLocation;
                GLUtils.e(iGlGetAttribLocation, "aTextureCoord");
                int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uTexMatrix");
                this.f = iGlGetUniformLocation2;
                GLUtils.e(iGlGetUniformLocation2, "uTexMatrix");
            } catch (Throwable th) {
                if (!(th instanceof IllegalArgumentException)) {
                    throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
                }
                throw th;
            }
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public final void b() {
            super.b();
            GLES20.glUniform1i(this.e, 0);
            GLES20.glEnableVertexAttribArray(this.g);
            GLUtils.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) GLUtils.i);
            GLUtils.b("glVertexAttribPointer");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SamplerShaderProgram(DynamicRange dynamicRange, InputFormat inputFormat) {
            ShaderProvider shaderProvider;
            if (dynamicRange.a()) {
                Preconditions.a("No default sampler shader available for" + inputFormat, inputFormat != InputFormat.d);
                if (inputFormat == InputFormat.f) {
                    shaderProvider = GLUtils.g;
                } else {
                    shaderProvider = GLUtils.f;
                }
            } else {
                shaderProvider = GLUtils.e;
            }
            this(dynamicRange, shaderProvider);
        }
    }
}
