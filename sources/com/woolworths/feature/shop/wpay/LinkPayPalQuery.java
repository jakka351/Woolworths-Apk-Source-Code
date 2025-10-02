package com.woolworths.feature.shop.wpay;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.wpay.adapter.LinkPayPalQuery_ResponseAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$Data;", "Data", "LinkPayPal", "Companion", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkPayPalQuery implements Query<Data> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final LinkPayPal f20365a;

        public Data(LinkPayPal linkPayPal) {
            this.f20365a = linkPayPal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20365a, ((Data) obj).f20365a);
        }

        public final int hashCode() {
            return this.f20365a.hashCode();
        }

        public final String toString() {
            return "Data(linkPayPal=" + this.f20365a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/wpay/LinkPayPalQuery$LinkPayPal;", "", "wpay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkPayPal {

        /* renamed from: a, reason: collision with root package name */
        public final String f20366a;
        public final String b;
        public final String c;

        public LinkPayPal(String str, String str2, String str3) {
            this.f20366a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkPayPal)) {
                return false;
            }
            LinkPayPal linkPayPal = (LinkPayPal) obj;
            return Intrinsics.c(this.f20366a, linkPayPal.f20366a) && Intrinsics.c(this.b, linkPayPal.b) && Intrinsics.c(this.c, linkPayPal.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20366a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("LinkPayPal(id=", this.f20366a, ", url=", this.b, ", redirectUrl="), this.c, ")");
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(LinkPayPalQuery_ResponseAdapter.Data.f20423a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query LinkPayPal { linkPayPal { id url redirectUrl } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == LinkPayPalQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(LinkPayPalQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2e5e8cd48b7ccb433aefbeab1df913454a829dd5434a58751cda00af3949da71";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "LinkPayPal";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
