package kotlin.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InstantKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24683a = {1, 10, 100, 1000, ModuleDescriptor.MODULE_VERSION, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final void a(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }
}
