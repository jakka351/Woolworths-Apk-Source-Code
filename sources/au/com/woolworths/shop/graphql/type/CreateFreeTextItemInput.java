package au.com.woolworths.shop.graphql.type;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import com.apollographql.apollo.api.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/CreateFreeTextItemInput;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateFreeTextItemInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f11297a;
    public final boolean b;
    public final Optional.Present c;

    public CreateFreeTextItemInput(String text, boolean z, Optional.Present present) {
        Intrinsics.h(text, "text");
        this.f11297a = text;
        this.b = z;
        this.c = present;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateFreeTextItemInput)) {
            return false;
        }
        CreateFreeTextItemInput createFreeTextItemInput = (CreateFreeTextItemInput) obj;
        return Intrinsics.c(this.f11297a, createFreeTextItemInput.f11297a) && this.b == createFreeTextItemInput.b && this.c.equals(createFreeTextItemInput.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.e(this.f11297a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = a.q("CreateFreeTextItemInput(text=", this.f11297a, ", checked=", ", referenceId=", this.b);
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
