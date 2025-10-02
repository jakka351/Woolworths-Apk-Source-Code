package au.com.woolworths.shop.weblink;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.shop.weblink.adapter.ShopMagicLinksQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Data;", "Data", "MagicLink", "Cooky", "Header", "Companion", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ShopMagicLinksQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f12944a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Cooky;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cooky {

        /* renamed from: a, reason: collision with root package name */
        public final String f12945a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final boolean f;
        public final boolean g;

        public Cooky(String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
            this.f12945a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cooky)) {
                return false;
            }
            Cooky cooky = (Cooky) obj;
            return Intrinsics.c(this.f12945a, cooky.f12945a) && Intrinsics.c(this.b, cooky.b) && Intrinsics.c(this.c, cooky.c) && Intrinsics.c(this.d, cooky.d) && this.e == cooky.e && this.f == cooky.f && this.g == cooky.g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.g) + b.e(b.a(this.e, b.c(b.c(b.c(this.f12945a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Cooky(name=", this.f12945a, ", value=", this.b, ", domain=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", path=", this.d, ", maxAge=");
            sbV.append(this.e);
            sbV.append(", httpOnly=");
            sbV.append(this.f);
            sbV.append(", secure=");
            return a.k(")", sbV, this.g);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final MagicLink f12946a;

        public Data(MagicLink magicLink) {
            this.f12946a = magicLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12946a, ((Data) obj).f12946a);
        }

        public final int hashCode() {
            return this.f12946a.hashCode();
        }

        public final String toString() {
            return "Data(magicLink=" + this.f12946a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$Header;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f12947a;
        public final String b;

        public Header(String str, String str2) {
            this.f12947a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f12947a, header.f12947a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12947a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Header(key=", this.f12947a, ", value=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/weblink/ShopMagicLinksQuery$MagicLink;", "", "web-link_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MagicLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f12948a;
        public final String b;
        public final ArrayList c;
        public final ArrayList d;

        public MagicLink(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
            this.f12948a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MagicLink)) {
                return false;
            }
            MagicLink magicLink = (MagicLink) obj;
            return this.f12948a.equals(magicLink.f12948a) && this.b.equals(magicLink.b) && this.c.equals(magicLink.c) && this.d.equals(magicLink.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(this.f12948a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("MagicLink(title=", this.f12948a, ", url=", this.b, ", cookies=");
            sbV.append(this.c);
            sbV.append(", headers=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public ShopMagicLinksQuery(String linkId) {
        Intrinsics.h(linkId, "linkId");
        this.f12944a = linkId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ShopMagicLinksQuery_ResponseAdapter.Data.f12950a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query shopMagicLinks($linkId: String!) { magicLink(linkId: $linkId) { title url cookies { name value domain path maxAge httpOnly secure } headers { key value } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ShopMagicLinksQuery) && Intrinsics.c(this.f12944a, ((ShopMagicLinksQuery) obj).f12944a);
    }

    public final int hashCode() {
        return this.f12944a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "11c89847ba270c2075d7a1597374d24403c540bec42d90ac2c3258f74db692ca";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "shopMagicLinks";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("linkId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f12944a);
    }

    public final String toString() {
        return a.h("ShopMagicLinksQuery(linkId=", this.f12944a, ")");
    }
}
