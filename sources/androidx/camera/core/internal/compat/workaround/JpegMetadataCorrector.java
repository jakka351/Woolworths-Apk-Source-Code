package androidx.camera.core.internal.compat.workaround;

import androidx.camera.core.impl.Quirks;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;

/* loaded from: classes2.dex */
public class JpegMetadataCorrector {

    /* renamed from: a, reason: collision with root package name */
    public final IncorrectJpegMetadataQuirk f540a;

    public JpegMetadataCorrector(Quirks quirks) {
        this.f540a = (IncorrectJpegMetadataQuirk) quirks.b(IncorrectJpegMetadataQuirk.class);
    }
}
