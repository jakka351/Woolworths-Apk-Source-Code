package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class NetworkRequestCompatKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4000a = {13, 15, 14};

    public static final int[] a(NetworkRequest networkRequest) {
        Intrinsics.h(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            int[] capabilities = networkRequest.getCapabilities();
            Intrinsics.g(capabilities, "request.capabilities");
            return capabilities;
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasCapability(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    public static final int[] b(NetworkRequest networkRequest) {
        Intrinsics.h(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            int[] transportTypes = networkRequest.getTransportTypes();
            Intrinsics.g(transportTypes, "request.transportTypes");
            return transportTypes;
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            if (networkRequest.hasTransport(i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return CollectionsKt.F0(arrayList);
    }
}
