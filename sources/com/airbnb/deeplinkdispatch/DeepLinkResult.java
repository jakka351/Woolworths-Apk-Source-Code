package com.airbnb.deeplinkdispatch;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.airbnb.deeplinkdispatch.BaseDeepLinkDelegate;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/deeplinkdispatch/DeepLinkResult;", "", "deeplinkdispatch_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeepLinkResult {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13292a;
    public final String b;
    public final String c;
    public final Throwable d;
    public final DeepLinkMatchResult e;
    public final DeepLinkMethodResult f;
    public final Map g;
    public final DeepLinkHandlerResult h;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.util.Map] */
    public DeepLinkResult(boolean z, String str, String str2, BaseDeepLinkDelegate.DeeplLinkMethodError deeplLinkMethodError, DeepLinkMatchResult deepLinkMatchResult, DeepLinkMethodResult deepLinkMethodResult, LinkedHashMap linkedHashMap, DeepLinkHandlerResult deepLinkHandlerResult, int i) {
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? "" : str2;
        deeplLinkMethodError = (i & 8) != 0 ? null : deeplLinkMethodError;
        deepLinkMatchResult = (i & 16) != 0 ? null : deepLinkMatchResult;
        deepLinkMethodResult = (i & 32) != 0 ? new DeepLinkMethodResult(null, null) : deepLinkMethodResult;
        LinkedHashMap linkedHashMap2 = (i & 64) != 0 ? EmptyMap.d : linkedHashMap;
        deepLinkHandlerResult = (i & 128) != 0 ? null : deepLinkHandlerResult;
        this.f13292a = z;
        this.b = str;
        this.c = str2;
        this.d = deeplLinkMethodError;
        this.e = deepLinkMatchResult;
        this.f = deepLinkMethodResult;
        this.g = linkedHashMap2;
        this.h = deepLinkHandlerResult;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeepLinkResult)) {
            return false;
        }
        DeepLinkResult deepLinkResult = (DeepLinkResult) obj;
        return this.f13292a == deepLinkResult.f13292a && Intrinsics.c(this.b, deepLinkResult.b) && Intrinsics.c(this.c, deepLinkResult.c) && Intrinsics.c(this.d, deepLinkResult.d) && Intrinsics.c(this.e, deepLinkResult.e) && Intrinsics.c(this.f, deepLinkResult.f) && Intrinsics.c(this.g, deepLinkResult.g) && Intrinsics.c(this.h, deepLinkResult.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    public final int hashCode() {
        boolean z = this.f13292a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.b;
        int iC = b.c((i + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Throwable th = this.d;
        int iHashCode = (iC + (th == null ? 0 : th.hashCode())) * 31;
        DeepLinkMatchResult deepLinkMatchResult = this.e;
        int iD = d.d(this.g, (this.f.hashCode() + ((iHashCode + (deepLinkMatchResult == null ? 0 : deepLinkMatchResult.hashCode())) * 31)) * 31, 31);
        DeepLinkHandlerResult deepLinkHandlerResult = this.h;
        return iD + (deepLinkHandlerResult != null ? deepLinkHandlerResult.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkResult{successful=");
        sb.append(this.f13292a);
        sb.append(", uriString=");
        sb.append(this.b);
        sb.append(", error='");
        return a.o(sb, this.c, "'}");
    }
}
