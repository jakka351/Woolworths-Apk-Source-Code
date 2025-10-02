package com.airbnb.deeplinkdispatch;

import com.airbnb.deeplinkdispatch.base.MatchIndex;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/BaseRegistry;", "", "deeplinkdispatch-base"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BaseRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final List f13288a;
    public final MatchIndex b;

    public BaseRegistry(byte[] bArr, String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            byte[] bytes = str.getBytes(Charsets.f24671a);
            Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
            arrayList.add(bytes);
        }
        this.f13288a = CollectionsKt.G0(arrayList);
        this.b = new MatchIndex(bArr);
    }
}
