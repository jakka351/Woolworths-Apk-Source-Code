package androidx.compose.ui.platform;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    public static final void a(long j) {
        Math.abs(Float.intBitsToFloat((int) (j >> 32)));
        Math.abs(Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final int b(float f) {
        return ((int) (f >= BitmapDescriptorFactory.HUE_RED ? Math.ceil(f) : Math.floor(f))) * (-1);
    }
}
