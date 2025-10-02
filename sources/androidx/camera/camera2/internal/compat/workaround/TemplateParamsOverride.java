package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.internal.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import androidx.camera.core.impl.Quirks;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TemplateParamsOverride {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f366a;
    public final boolean b;

    public TemplateParamsOverride(Quirks quirks) {
        boolean z;
        Iterator it = quirks.c(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z = true;
                break;
            }
        }
        this.f366a = z;
        this.b = quirks.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }
}
