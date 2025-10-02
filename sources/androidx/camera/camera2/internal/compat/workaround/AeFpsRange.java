package androidx.camera.camera2.internal.compat.workaround;

import android.util.Range;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.impl.Quirks;

/* loaded from: classes2.dex */
public class AeFpsRange {

    /* renamed from: a, reason: collision with root package name */
    public final Range f348a;

    public AeFpsRange(Quirks quirks) {
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) quirks.b(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            this.f348a = null;
        } else {
            this.f348a = aeFpsRangeLegacyQuirk.f323a;
        }
    }
}
