package androidx.camera.camera2.internal.compat.workaround;

import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class UseTorchAsFlash {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f369a;

    public UseTorchAsFlash(Quirks quirks) {
        this.f369a = quirks.a(UseTorchAsFlashQuirk.class);
    }
}
