package com.woolworths.feature.shop.contentpage.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/HostedIconFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HostedIconFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f19768a;

    public HostedIconFields(String str) {
        this.f19768a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HostedIconFields) && Intrinsics.c(this.f19768a, ((HostedIconFields) obj).f19768a);
    }

    public final int hashCode() {
        return this.f19768a.hashCode();
    }

    public final String toString() {
        return a.h("HostedIconFields(url=", this.f19768a, ")");
    }
}
