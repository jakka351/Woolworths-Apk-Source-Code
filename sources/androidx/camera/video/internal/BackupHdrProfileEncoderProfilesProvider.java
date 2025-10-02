package androidx.camera.video.internal;

import androidx.camera.camera2.internal.compat.workaround.b;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.encoder.VideoEncoderInfoImpl;
import androidx.camera.video.internal.workaround.QualityResolutionModifiedEncoderProfilesProvider;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class BackupHdrProfileEncoderProfilesProvider implements EncoderProfilesProvider {
    public final QualityResolutionModifiedEncoderProfilesProvider b;
    public final HashMap d = new HashMap();
    public final b c = VideoEncoderInfoImpl.c;

    public BackupHdrProfileEncoderProfilesProvider(QualityResolutionModifiedEncoderProfilesProvider qualityResolutionModifiedEncoderProfilesProvider) {
        this.b = qualityResolutionModifiedEncoderProfilesProvider;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final EncoderProfilesProxy a(int i) {
        return c(i);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public final boolean b(int i) {
        return this.b.b(i) && c(i) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.camera.core.impl.EncoderProfilesProxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.EncoderProfilesProxy c(int r23) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.BackupHdrProfileEncoderProfilesProvider.c(int):androidx.camera.core.impl.EncoderProfilesProxy");
    }
}
