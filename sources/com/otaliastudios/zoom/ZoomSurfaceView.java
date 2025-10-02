package com.otaliastudios.zoom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import com.otaliastudios.opengl.core.EglConfigChooser;
import com.otaliastudios.opengl.core.EglContextFactory;
import com.otaliastudios.opengl.draw.GlRect;
import com.otaliastudios.opengl.extensions.MatrixKt;
import com.otaliastudios.opengl.program.GlFlatProgram;
import com.otaliastudios.opengl.program.GlProgram;
import com.otaliastudios.opengl.program.GlTextureProgram;
import com.otaliastudios.opengl.texture.GlTexture;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.internal.matrix.MatrixController;
import com.otaliastudios.zoom.internal.movement.PanManager;
import com.otaliastudios.zoom.internal.movement.ZoomManager;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RequiresApi
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002efB\u001d\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0019J\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b \u0010\u0019J\u0018\u0010\"\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b%\u0010#J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b&\u0010\u0019J\u0018\u0010)\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b,\u0010\u0019J\u0018\u0010.\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b.\u0010\u0019J\u0018\u0010/\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b/\u0010\u0019J\u0018\u00101\u001a\u00020\u00132\u0006\u0010(\u001a\u000200H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b3\u0010\u0019J\u0018\u00104\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b4\u0010\u0019J\u0018\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b6\u0010\u0015J\u0018\u00107\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b7\u0010\u0019J\u0018\u00108\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b8\u0010\u0019J\u0018\u00109\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b9\u0010\u0019J\u0017\u0010;\u001a\u00020\u00132\u0006\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010\u0015R\u0017\u0010A\u001a\u00020<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R(\u0010H\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR.\u0010P\u001a\u0004\u0018\u00010I2\b\u0010C\u001a\u0004\u0018\u00010I8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u0012\u0004\bN\u0010O\u001a\u0004\bL\u0010MR\u0014\u0010R\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010\u0010R\u0014\u0010T\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010\u0010R\u0014\u0010V\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010\u0010R\u0014\u0010X\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bW\u0010\u0010R\u0014\u0010Z\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010\u0010R\u0014\u0010\\\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010\u0010R\u0014\u0010`\u001a\u00020]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/otaliastudios/zoom/ZoomSurfaceView;", "Landroid/opengl/GLSurfaceView;", "Lcom/otaliastudios/zoom/ZoomApi;", "Landroid/opengl/GLSurfaceView$Renderer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "getMaxZoomType", "()I", "getMinZoomType", "", "getMaxZoom", "()F", "getMinZoom", "alignment", "", "setAlignment", "(I)V", "", "allow", "setAllowFlingInOverscroll", "(Z)V", "", "duration", "setAnimationDuration", "(J)V", "enabled", "setFlingEnabled", "setHorizontalPanEnabled", "maxZoom", "setMaxZoom", "(F)V", "minZoom", "setMinZoom", "setOneFingerScrollEnabled", "Lcom/otaliastudios/zoom/OverPanRangeProvider;", "provider", "setOverPanRange", "(Lcom/otaliastudios/zoom/OverPanRangeProvider;)V", "overPinchable", "setOverPinchable", "overScroll", "setOverScrollHorizontal", "setOverScrollVertical", "Lcom/otaliastudios/zoom/OverZoomRangeProvider;", "setOverZoomRange", "(Lcom/otaliastudios/zoom/OverZoomRangeProvider;)V", "setScrollEnabled", "setThreeFingersScrollEnabled", "transformation", "setTransformation", "setTwoFingersScrollEnabled", "setVerticalPanEnabled", "setZoomEnabled", "color", "setBackgroundColor", "Lcom/otaliastudios/zoom/ZoomEngine;", "d", "Lcom/otaliastudios/zoom/ZoomEngine;", "getEngine", "()Lcom/otaliastudios/zoom/ZoomEngine;", "engine", "Landroid/view/Surface;", "<set-?>", "f", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "surface", "Landroid/graphics/SurfaceTexture;", "g", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "getSurfaceTexture$annotations", "()V", "surfaceTexture", "getPanX", "panX", "getPanY", "panY", "getRealZoom", "realZoom", "getScaledPanX", "scaledPanX", "getScaledPanY", "scaledPanY", "getZoom", "zoom", "Lcom/otaliastudios/zoom/AbsolutePoint;", "getPan", "()Lcom/otaliastudios/zoom/AbsolutePoint;", "pan", "Lcom/otaliastudios/zoom/ScaledPoint;", "getScaledPan", "()Lcom/otaliastudios/zoom/ScaledPoint;", "scaledPan", "Callback", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public class ZoomSurfaceView extends GLSurfaceView implements ZoomApi, GLSurfaceView.Renderer {
    public static final ZoomLogger n = new ZoomLogger("ZoomSurfaceView");

    /* renamed from: d, reason: from kotlin metadata */
    public final ZoomEngine engine;
    public final ArrayList e;

    /* renamed from: f, reason: from kotlin metadata */
    public Surface surface;

    /* renamed from: g, reason: from kotlin metadata */
    public SurfaceTexture surfaceTexture;
    public final GlRect h;
    public final GlRect i;
    public GlTextureProgram j;
    public GlFlatProgram k;
    public int l;
    public boolean m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/zoom/ZoomSurfaceView$Callback;", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface Callback {
        void a();

        void b();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\f0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/otaliastudios/zoom/ZoomSurfaceView$Companion;", "", "", "EGLOO_DRAWABLE_FULL_SIZE", "I", "", "EGLOO_DRAWABLE_TOPLEFT_X", "F", "EGLOO_DRAWABLE_TOPLEFT_Y", "Lcom/otaliastudios/zoom/ZoomLogger;", "LOG", "Lcom/otaliastudios/zoom/ZoomLogger;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ZoomSurfaceView(@NotNull Context context) {
        this(context, null);
        Intrinsics.h(context, "context");
    }

    public static /* synthetic */ void getSurfaceTexture$annotations() {
    }

    @NotNull
    public final ZoomEngine getEngine() {
        return this.engine;
    }

    public float getMaxZoom() {
        return this.engine.k.f;
    }

    public int getMaxZoomType() {
        return this.engine.k.g;
    }

    public float getMinZoom() {
        return this.engine.k.d;
    }

    public int getMinZoomType() {
        return this.engine.k.e;
    }

    @NotNull
    public AbsolutePoint getPan() {
        return this.engine.e();
    }

    public float getPanX() {
        return this.engine.l.d();
    }

    public float getPanY() {
        return this.engine.l.e();
    }

    public float getRealZoom() {
        return this.engine.l.g();
    }

    @NotNull
    public ScaledPoint getScaledPan() {
        return this.engine.f();
    }

    public float getScaledPanX() {
        return this.engine.l.e.left;
    }

    public float getScaledPanY() {
        return this.engine.l.e.top;
    }

    @Nullable
    public final Surface getSurface() {
        return this.surface;
    }

    @Nullable
    public final SurfaceTexture getSurfaceTexture() {
        return this.surfaceTexture;
    }

    public float getZoom() {
        return this.engine.g();
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        post(new a(this, 0));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl) {
        GlTextureProgram glTextureProgram;
        Intrinsics.h(gl, "gl");
        SurfaceTexture surfaceTexture = this.surfaceTexture;
        if (surfaceTexture == null || (glTextureProgram = this.j) == null) {
            return;
        }
        float[] textureTransformMatrix = glTextureProgram.d;
        GlFlatProgram glFlatProgram = this.k;
        if (glFlatProgram == null) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(textureTransformMatrix);
        StringBuilder sb = new StringBuilder("onDrawFrame: zoom:");
        ZoomEngine zoomEngine = this.engine;
        MatrixController matrixController = zoomEngine.l;
        MatrixController matrixController2 = zoomEngine.l;
        sb.append(matrixController.g());
        sb.append(" panX:");
        sb.append(matrixController2.d());
        sb.append(" panY:");
        sb.append(matrixController2.e());
        String string = sb.toString();
        ZoomLogger zoomLogger = n;
        zoomLogger.a(string);
        float f = 2;
        float fD = (zoomEngine.d() * f) / matrixController2.j;
        float fC = (zoomEngine.c() * f) / matrixController2.k;
        float panX = (getPanX() / zoomEngine.d()) * fD;
        float panY = (getPanY() / zoomEngine.c()) * (-fC);
        float realZoom = getRealZoom();
        float realZoom2 = getRealZoom();
        zoomLogger.a("onDrawFrame: translX:" + panX + " translY:" + panY + " scaleX:" + realZoom + " scaleY:" + realZoom2);
        GlRect glRect = this.h;
        float[] fArr = glRect.f16799a;
        Intrinsics.h(fArr, "<this>");
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
        Matrix.setIdentityM(fArr, 0);
        MatrixKt.a(fArr, panX, panY);
        MatrixKt.a(fArr, (-1.0f) - panX, 1.0f - panY);
        if (fArr.length != 16) {
            throw new RuntimeException("Need a 16 values matrix.");
        }
        Matrix.scaleM(fArr, 0, realZoom, realZoom2, 1.0f);
        MatrixKt.a(fArr, panX + 1.0f, panY - 1.0f);
        float[] modelMatrix = glRect.f16799a;
        Intrinsics.h(modelMatrix, "modelMatrix");
        Intrinsics.h(textureTransformMatrix, "textureTransformMatrix");
        if (this.m) {
            GlProgram.a(glFlatProgram, this.i);
        } else {
            gl.glClear(16384);
        }
        GlProgram.a(glTextureProgram, glRect);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        ZoomEngine zoomEngine = this.engine;
        MatrixController matrixController = zoomEngine.l;
        boolean z = (matrixController.j == measuredWidth && matrixController.k == measuredHeight) ? false : true;
        if (z) {
            zoomEngine.k(measuredWidth, measuredHeight, true);
        }
        if (zoomEngine.d() != measuredWidth || zoomEngine.c() != measuredHeight) {
            zoomEngine.l(measuredWidth, measuredHeight, true);
        }
        if (z) {
            float fD = zoomEngine.d();
            RectF rectF = new RectF(-1.0f, 1.0f, ((fD * r6) / r1.j) - 1.0f, 1.0f - ((zoomEngine.c() * 2) / zoomEngine.l.k));
            GlRect glRect = this.h;
            glRect.getClass();
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.right;
            float f4 = rectF.bottom;
            FloatBuffer floatBuffer = glRect.d;
            floatBuffer.clear();
            floatBuffer.put(f);
            floatBuffer.put(f4);
            floatBuffer.put(f3);
            floatBuffer.put(f4);
            floatBuffer.put(f);
            floatBuffer.put(f2);
            floatBuffer.put(f3);
            floatBuffer.put(f2);
            floatBuffer.flip();
            glRect.b++;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl, int i, int i2) {
        Intrinsics.h(gl, "gl");
        gl.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        n.getClass();
        GlFlatProgram glFlatProgram = new GlFlatProgram();
        this.k = glFlatProgram;
        glFlatProgram.e(this.l);
        GlTextureProgram glTextureProgram = new GlTextureProgram();
        this.j = glTextureProgram;
        glTextureProgram.m = new GlTexture();
        GlTextureProgram glTextureProgram2 = this.j;
        Intrinsics.e(glTextureProgram2);
        GlTexture glTexture = glTextureProgram2.m;
        Intrinsics.e(glTexture);
        SurfaceTexture surfaceTexture = new SurfaceTexture(glTexture.f16807a);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: com.otaliastudios.zoom.b
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                ZoomLogger zoomLogger = ZoomSurfaceView.n;
                ZoomSurfaceView this$0 = this.d;
                Intrinsics.h(this$0, "this$0");
                this$0.requestRender();
            }
        });
        this.surfaceTexture = surfaceTexture;
        post(new a(this, 1));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        return super.onTouchEvent(ev) | this.engine.h(ev);
    }

    public void setAlignment(int alignment) {
        this.engine.j.g = alignment;
    }

    public void setAllowFlingInOverscroll(boolean allow) {
        this.engine.m.p = allow;
    }

    public void setAnimationDuration(long duration) {
        this.engine.l.n = duration;
    }

    @Override // android.view.View
    public void setBackgroundColor(int color) {
        this.m = Color.alpha(color) > 0;
        this.l = color;
        GlFlatProgram glFlatProgram = this.k;
        if (glFlatProgram != null) {
            Intrinsics.e(glFlatProgram);
            glFlatProgram.e(color);
        }
    }

    public void setFlingEnabled(boolean enabled) {
        this.engine.m.k = enabled;
    }

    public void setHorizontalPanEnabled(boolean enabled) {
        this.engine.j.e = enabled;
    }

    public void setMaxZoom(float maxZoom) {
        this.engine.m(maxZoom, 0);
    }

    public void setMinZoom(float minZoom) {
        this.engine.n(minZoom, 0);
    }

    public void setOneFingerScrollEnabled(boolean enabled) {
        this.engine.m.m = enabled;
    }

    public void setOverPanRange(@NotNull OverPanRangeProvider provider) {
        Intrinsics.h(provider, "provider");
        PanManager panManager = this.engine.j;
        panManager.getClass();
        panManager.h = provider;
    }

    public void setOverPinchable(boolean overPinchable) {
        this.engine.k.j = overPinchable;
    }

    public void setOverScrollHorizontal(boolean overScroll) {
        this.engine.j.c = overScroll;
    }

    public void setOverScrollVertical(boolean overScroll) {
        this.engine.j.d = overScroll;
    }

    public void setOverZoomRange(@NotNull OverZoomRangeProvider provider) {
        Intrinsics.h(provider, "provider");
        ZoomManager zoomManager = this.engine.k;
        zoomManager.getClass();
        zoomManager.h = provider;
    }

    public void setScrollEnabled(boolean enabled) {
        this.engine.m.l = enabled;
    }

    public void setThreeFingersScrollEnabled(boolean enabled) {
        this.engine.m.o = enabled;
    }

    public void setTransformation(int transformation) {
        ZoomEngine zoomEngine = this.engine;
        zoomEngine.d = transformation;
        zoomEngine.e = 0;
    }

    public void setTwoFingersScrollEnabled(boolean enabled) {
        this.engine.m.n = enabled;
    }

    public void setVerticalPanEnabled(boolean enabled) {
        this.engine.j.f = enabled;
    }

    public void setZoomEnabled(boolean enabled) {
        this.engine.k.i = enabled;
    }

    @JvmOverloads
    public ZoomSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        Intrinsics.h(context, "context");
        ZoomEngine zoomEngine = new ZoomEngine(context);
        super(context, attributeSet);
        this.engine = zoomEngine;
        this.e = new ArrayList();
        this.h = new GlRect();
        this.i = new GlRect();
        this.l = Color.rgb(25, 25, 25);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.f16811a, 0, 0);
        Intrinsics.g(typedArrayObtainStyledAttributes, "context.theme.obtainStyledAttributes(attrs, R.styleable.ZoomEngine, 0, 0)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(12, false);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(13, false);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(5, true);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(19, true);
        boolean z5 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        boolean z6 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        boolean z7 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        boolean z8 = typedArrayObtainStyledAttributes.getBoolean(14, true);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(10, true);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(18, true);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(15, true);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(1, true);
        float f = typedArrayObtainStyledAttributes.getFloat(8, 1.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(6, 2.5f);
        int integer = typedArrayObtainStyledAttributes.getInteger(9, 0);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(7, 0);
        int integer3 = typedArrayObtainStyledAttributes.getInteger(16, 0);
        int i = typedArrayObtainStyledAttributes.getInt(17, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(0, 51);
        long j = typedArrayObtainStyledAttributes.getInt(2, 280);
        typedArrayObtainStyledAttributes.recycle();
        zoomEngine.j(this);
        zoomEngine.b(new ZoomEngine.Listener() { // from class: com.otaliastudios.zoom.ZoomSurfaceView.1
            @Override // com.otaliastudios.zoom.ZoomEngine.Listener
            public final void a(ZoomEngine zoomEngine2, android.graphics.Matrix matrix) {
                ZoomSurfaceView.this.requestRender();
            }

            @Override // com.otaliastudios.zoom.ZoomEngine.Listener
            public final void b(ZoomEngine zoomEngine2) {
            }
        });
        setOverScrollHorizontal(z);
        setOverScrollVertical(z2);
        zoomEngine.d = integer3;
        zoomEngine.e = i;
        setAlignment(i2);
        setHorizontalPanEnabled(z3);
        setVerticalPanEnabled(z4);
        setOverPinchable(z5);
        setZoomEnabled(z6);
        setFlingEnabled(z7);
        setScrollEnabled(z8);
        setOneFingerScrollEnabled(z9);
        setTwoFingersScrollEnabled(z10);
        setThreeFingersScrollEnabled(z11);
        setAllowFlingInOverscroll(z12);
        setAnimationDuration(j);
        zoomEngine.n(f, integer);
        zoomEngine.m(f2, integer2);
        setEGLContextFactory(EglContextFactory.f16796a);
        setEGLConfigChooser(EglConfigChooser.f16795a);
        setRenderer(this);
        setRenderMode(0);
    }
}
