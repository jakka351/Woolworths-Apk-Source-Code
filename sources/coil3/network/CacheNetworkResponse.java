package coil3.network;

import coil3.annotation.InternalCoilApi;
import coil3.network.NetworkHeaders;
import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okio.RealBufferedSink;
import okio.RealBufferedSource;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/network/CacheNetworkResponse;", "", "coil-network-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@InternalCoilApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CacheNetworkResponse {
    public static NetworkResponse a(RealBufferedSource realBufferedSource) throws NumberFormatException, EOFException {
        int i = Integer.parseInt(realBufferedSource.n1(Long.MAX_VALUE));
        long j = Long.parseLong(realBufferedSource.n1(Long.MAX_VALUE));
        long j2 = Long.parseLong(realBufferedSource.n1(Long.MAX_VALUE));
        NetworkHeaders.Builder builder = new NetworkHeaders.Builder();
        int i2 = Integer.parseInt(realBufferedSource.n1(Long.MAX_VALUE));
        for (int i3 = 0; i3 < i2; i3++) {
            String strN1 = realBufferedSource.n1(Long.MAX_VALUE);
            int iB = StringsKt.B(strN1, ':', 0, 6);
            if (iB == -1) {
                throw new IllegalArgumentException("Unexpected header: ".concat(strN1).toString());
            }
            String strSubstring = strN1.substring(0, iB);
            Intrinsics.g(strSubstring, "substring(...)");
            String string = StringsKt.k0(strSubstring).toString();
            String strSubstring2 = strN1.substring(iB + 1);
            Intrinsics.g(strSubstring2, "substring(...)");
            builder.a(string, strSubstring2);
        }
        return new NetworkResponse(i, j, j2, builder.b(), null, null);
    }

    public static void b(NetworkResponse networkResponse, RealBufferedSink realBufferedSink) {
        realBufferedSink.n0(networkResponse.f13131a);
        realBufferedSink.writeByte(10);
        realBufferedSink.n0(networkResponse.b);
        realBufferedSink.writeByte(10);
        realBufferedSink.n0(networkResponse.c);
        realBufferedSink.writeByte(10);
        Set<Map.Entry> setEntrySet = networkResponse.d.f13128a.entrySet();
        Iterator it = setEntrySet.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((List) ((Map.Entry) it.next()).getValue()).size();
        }
        realBufferedSink.n0(size);
        realBufferedSink.writeByte(10);
        for (Map.Entry entry : setEntrySet) {
            for (String str : (List) entry.getValue()) {
                realBufferedSink.r1((String) entry.getKey());
                realBufferedSink.r1(":");
                realBufferedSink.r1(str);
                realBufferedSink.writeByte(10);
            }
        }
    }
}
