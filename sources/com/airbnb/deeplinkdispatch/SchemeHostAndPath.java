package com.airbnb.deeplinkdispatch;

import com.medallia.digital.mobilesdk.q2;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/SchemeHostAndPath;", "", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SchemeHostAndPath {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13297a;

    public SchemeHostAndPath(DeepLinkUri deepLinkUri) {
        Charset charset = Charsets.f24671a;
        byte[] bytes = "r".getBytes(charset);
        Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        UrlElement urlElement = new UrlElement((byte) 1, bytes);
        String str = deepLinkUri.f13293a;
        Intrinsics.g(str, "uri.scheme()");
        byte[] bytes2 = str.getBytes(charset);
        Intrinsics.g(bytes2, "this as java.lang.String).getBytes(charset)");
        UrlElement urlElement2 = new UrlElement((byte) 2, bytes2);
        String str2 = deepLinkUri.b;
        String strA = DeepLinkUri.a(str2, 0, str2.length(), "^`{}|\\", true, true);
        Intrinsics.g(strA, "uri.encodedHost()");
        byte[] bytes3 = strA.getBytes(charset);
        Intrinsics.g(bytes3, "this as java.lang.String).getBytes(charset)");
        List listR = CollectionsKt.R(urlElement, urlElement2, new UrlElement((byte) 4, bytes3));
        String str3 = deepLinkUri.e;
        int iIndexOf = str3.indexOf(47, str.length() + 3);
        int iD = DeepLinkUri.d(iIndexOf, str3.length(), str3, "?#");
        ArrayList arrayList = new ArrayList();
        while (iIndexOf < iD) {
            int i = iIndexOf + 1;
            int iD2 = DeepLinkUri.d(i, iD, str3, q2.c);
            arrayList.add(str3.substring(i, iD2));
            iIndexOf = iD2;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String pathSegment = (String) it.next();
            Intrinsics.g(pathSegment, "pathSegment");
            byte[] bytes4 = pathSegment.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes4, "this as java.lang.String).getBytes(charset)");
            arrayList2.add(new UrlElement((byte) 8, bytes4));
        }
        this.f13297a = CollectionsKt.c0(arrayList2, listR);
    }
}
