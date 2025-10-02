package androidx.camera.video.internal.workaround;

import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class QualityResolutionModifiedEncoderProfilesProvider implements EncoderProfilesProvider {
    public final EncoderProfilesProvider b;
    public final Quirks c;
    public final HashMap d = new HashMap();

    public QualityResolutionModifiedEncoderProfilesProvider(EncoderProfilesProvider encoderProfilesProvider, Quirks quirks) {
        this.b = encoderProfilesProvider;
        this.c = quirks;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        return c(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return this.b.b(i) && c(i) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
    
        r4 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.EncoderProfilesProxy c(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.util.HashMap r3 = r0.d
            boolean r2 = r3.containsKey(r2)
            if (r2 == 0) goto L1b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            androidx.camera.core.impl.EncoderProfilesProxy r1 = (androidx.camera.core.impl.EncoderProfilesProxy) r1
            return r1
        L1b:
            androidx.camera.core.impl.EncoderProfilesProvider r2 = r0.b
            boolean r4 = r2.b(r1)
            r5 = 0
            if (r4 == 0) goto Ld1
            androidx.camera.core.impl.EncoderProfilesProxy r2 = r2.a(r1)
            java.util.Objects.requireNonNull(r2)
            androidx.camera.core.impl.Quirks r4 = r0.c
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r6 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r4 = r4.c(r6)
            java.util.Iterator r4 = r4.iterator()
        L37:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L4e
            java.lang.Object r6 = r4.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r6 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r6
            if (r6 == 0) goto L37
            r4 = 4
            if (r1 == r4) goto L64
            r4 = 5
            if (r1 == r4) goto L5a
            r4 = 6
            if (r1 == r4) goto L50
        L4e:
            r4 = r5
            goto L6d
        L50:
            android.util.Size r4 = new android.util.Size
            r6 = 1440(0x5a0, float:2.018E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r4.<init>(r6, r7)
            goto L6d
        L5a:
            android.util.Size r4 = new android.util.Size
            r6 = 960(0x3c0, float:1.345E-42)
            r7 = 720(0x2d0, float:1.009E-42)
            r4.<init>(r6, r7)
            goto L6d
        L64:
            android.util.Size r4 = new android.util.Size
            r6 = 640(0x280, float:8.97E-43)
            r7 = 480(0x1e0, float:6.73E-43)
            r4.<init>(r6, r7)
        L6d:
            if (r4 != 0) goto L71
            r5 = r2
            goto Ld1
        L71:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r7 = r2.d()
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lba
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r8 = (androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy) r8
            int r9 = r8.e()
            java.lang.String r10 = r8.i()
            int r11 = r8.c()
            int r12 = r8.f()
            int r13 = r4.getWidth()
            int r14 = r4.getHeight()
            int r15 = r8.j()
            int r16 = r8.b()
            int r17 = r8.d()
            int r18 = r8.g()
            androidx.camera.core.impl.EncoderProfilesProxy$VideoProfileProxy r8 = androidx.camera.core.impl.EncoderProfilesProxy.VideoProfileProxy.a(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r6.add(r8)
            goto L7e
        Lba:
            boolean r4 = r6.isEmpty()
            if (r4 == 0) goto Lc1
            goto Ld1
        Lc1:
            int r4 = r2.c()
            int r5 = r2.a()
            java.util.List r2 = r2.b()
            androidx.camera.core.impl.EncoderProfilesProxy$ImmutableEncoderProfilesProxy r5 = androidx.camera.core.impl.EncoderProfilesProxy.ImmutableEncoderProfilesProxy.e(r4, r5, r2, r6)
        Ld1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.put(r1, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider.c(int):androidx.camera.core.impl.EncoderProfilesProxy");
    }
}
