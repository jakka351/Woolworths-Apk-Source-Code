package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzhhk extends IOException {
    public zzhhk() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzhhk(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbT = androidx.camera.core.impl.b.t(j, "Pos: ", ", limit: ");
        sbT.append(j2);
        sbT.append(", len: ");
        sbT.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbT.toString()), th);
    }

    public zzhhk(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
