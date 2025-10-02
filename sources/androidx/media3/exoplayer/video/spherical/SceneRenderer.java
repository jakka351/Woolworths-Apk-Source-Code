package androidx.media3.exoplayer.video.spherical;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import androidx.media3.common.Format;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.Projection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class SceneRenderer implements VideoFrameMetadataListener, CameraMotionListener {
    public int l;
    public SurfaceTexture m;
    public byte[] p;
    public final AtomicBoolean d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean(true);
    public final ProjectionRenderer f = new ProjectionRenderer();
    public final FrameRotationQueue g = new FrameRotationQueue();
    public final TimedValueQueue h = new TimedValueQueue();
    public final TimedValueQueue i = new TimedValueQueue();
    public final float[] j = new float[16];
    public final float[] k = new float[16];
    public volatile int n = 0;
    public int o = -1;

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void a(float[] fArr, long j) {
        this.g.c.a(j, fArr);
    }

    public final SurfaceTexture b() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            GlUtil.b();
            this.f.a();
            GlUtil.b();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.b();
            int i = iArr[0];
            GlUtil.a(36197, i);
            this.l = i;
        } catch (GlUtil.GlException e) {
            Log.d("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.l);
        this.m = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: androidx.media3.exoplayer.video.spherical.a
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.d.d.set(true);
            }
        });
        return this.m;
    }

    @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
    public final void c() {
        this.h.b();
        FrameRotationQueue frameRotationQueue = this.g;
        frameRotationQueue.c.b();
        frameRotationQueue.d = false;
        this.e.set(true);
    }

    @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
    public final void d(long j, long j2, Format format, MediaFormat mediaFormat) {
        int i;
        ArrayList arrayListA;
        int iG;
        this.h.a(j2, Long.valueOf(j));
        byte[] bArr = format.z;
        int i2 = format.A;
        byte[] bArr2 = this.p;
        int i3 = this.o;
        this.p = bArr;
        if (i2 == -1) {
            i2 = this.n;
        }
        this.o = i2;
        if (i3 == i2 && Arrays.equals(bArr2, this.p)) {
            return;
        }
        byte[] bArr3 = this.p;
        Projection projection = null;
        if (bArr3 != null) {
            int i4 = this.o;
            ParsableByteArray parsableByteArray = new ParsableByteArray(bArr3);
            try {
                parsableByteArray.H(4);
                iG = parsableByteArray.g();
                parsableByteArray.G(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iG == 1886547818) {
                parsableByteArray.H(8);
                int i5 = parsableByteArray.b;
                int i6 = parsableByteArray.c;
                while (i5 < i6) {
                    int iG2 = parsableByteArray.g() + i5;
                    if (iG2 > i5 && iG2 <= i6) {
                        int iG3 = parsableByteArray.g();
                        if (iG3 != 2037673328 && iG3 != 1836279920) {
                            parsableByteArray.G(iG2);
                            i5 = iG2;
                        }
                        parsableByteArray.F(iG2);
                        arrayListA = ProjectionDecoder.a(parsableByteArray);
                        break;
                    }
                    break;
                }
                arrayListA = null;
            } else {
                arrayListA = ProjectionDecoder.a(parsableByteArray);
            }
            if (arrayListA != null) {
                int size = arrayListA.size();
                if (size == 1) {
                    Projection.Mesh mesh = (Projection.Mesh) arrayListA.get(0);
                    projection = new Projection(mesh, mesh, i4);
                } else if (size == 2) {
                    projection = new Projection((Projection.Mesh) arrayListA.get(0), (Projection.Mesh) arrayListA.get(1), i4);
                }
            }
        }
        if (projection == null || !ProjectionRenderer.b(projection)) {
            int i7 = this.o;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f = radians / 36;
            float f2 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 36; i8 < i11; i11 = 36) {
                float f3 = radians / 2.0f;
                float f4 = (i8 * f) - f3;
                int i12 = i8 + 1;
                float f5 = (i12 * f) - f3;
                int i13 = 0;
                while (i13 < 73) {
                    int i14 = i12;
                    float f6 = f5;
                    float f7 = radians;
                    int i15 = i9;
                    int i16 = i10;
                    int i17 = 0;
                    int i18 = 2;
                    while (i17 < i18) {
                        float f8 = i17 == 0 ? f4 : f6;
                        float f9 = radians2;
                        float f10 = i13 * f2;
                        float f11 = f4;
                        float f12 = f;
                        double d = 50.0f;
                        double d2 = (f10 + 3.1415927f) - (f9 / 2.0f);
                        double d3 = f8;
                        fArr[i15] = -((float) (Math.cos(d3) * Math.sin(d2) * d));
                        fArr[i15 + 1] = (float) (Math.sin(d3) * d);
                        int i19 = i15 + 3;
                        fArr[i15 + 2] = (float) (Math.cos(d3) * Math.cos(d2) * d);
                        fArr2[i16] = f10 / f9;
                        int i20 = i16 + 2;
                        fArr2[i16 + 1] = ((i8 + i17) * f12) / f7;
                        if ((i13 == 0 && i17 == 0) || (i13 == 72 && i17 == 1)) {
                            System.arraycopy(fArr, i15, fArr, i19, 3);
                            i15 += 6;
                            i = 2;
                            System.arraycopy(fArr2, i16, fArr2, i20, 2);
                            i16 += 4;
                        } else {
                            i = 2;
                            i15 = i19;
                            i16 = i20;
                        }
                        i17++;
                        i18 = i;
                        radians2 = f9;
                        f4 = f11;
                        f = f12;
                    }
                    i13++;
                    i9 = i15;
                    i10 = i16;
                    i12 = i14;
                    f5 = f6;
                    radians = f7;
                    radians2 = radians2;
                    f = f;
                }
                i8 = i12;
            }
            Projection.Mesh mesh2 = new Projection.Mesh(new Projection.SubMesh(0, 1, fArr, fArr2));
            projection = new Projection(mesh2, mesh2, i7);
        }
        this.i.a(j2, projection);
    }
}
