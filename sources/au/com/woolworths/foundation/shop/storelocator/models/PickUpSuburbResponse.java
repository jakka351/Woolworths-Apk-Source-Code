package au.com.woolworths.foundation.shop.storelocator.models;

import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/foundation/shop/storelocator/models/PickUpSuburbResponse;", "", "", "Lau/com/woolworths/foundation/shop/storelocator/models/PickUpSuburbApiModel;", "suburbs", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PickUpSuburbResponse {

    @SerializedName("suburbs")
    @NotNull
    private final List<PickUpSuburbApiModel> suburbs;

    public PickUpSuburbResponse(@NotNull List<PickUpSuburbApiModel> suburbs) {
        Intrinsics.h(suburbs, "suburbs");
        this.suburbs = suburbs;
    }

    /* renamed from: a, reason: from getter */
    public final List getSuburbs() {
        return this.suburbs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PickUpSuburbResponse) && Intrinsics.c(this.suburbs, ((PickUpSuburbResponse) obj).suburbs);
    }

    public final int hashCode() {
        return this.suburbs.hashCode();
    }

    public final String toString() {
        return a.l("PickUpSuburbResponse(suburbs=", ")", this.suburbs);
    }
}
