package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/utils/NetworkRequest28;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NetworkRequest28 {
    public static NetworkRequestCompat a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                Logger loggerE = Logger.e();
                String str = NetworkRequestCompat.b;
                loggerE.i(NetworkRequestCompat.b, "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = NetworkRequestCompatKt.f4000a[i2];
            if (!ArraysKt.j(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    Logger loggerE2 = Logger.e();
                    String str2 = NetworkRequestCompat.b;
                    loggerE2.i(NetworkRequestCompat.b, "Ignoring removing default capability '" + i3 + '\'', e2);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        Intrinsics.g(networkRequestBuild, "networkRequest.build()");
        return new NetworkRequestCompat(networkRequestBuild);
    }
}
