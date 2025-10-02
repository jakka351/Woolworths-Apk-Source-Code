package au.com.woolworths.product.details.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/product/details/models/RatingsAndReviewsCtaAction;", "Landroid/os/Parcelable;", "type", "Lau/com/woolworths/shop/graphql/type/ActionType;", UrlHandler.ACTION, "", "id", "<init>", "(Lau/com/woolworths/shop/graphql/type/ActionType;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lau/com/woolworths/shop/graphql/type/ActionType;", "getAction", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsCtaAction implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<RatingsAndReviewsCtaAction> CREATOR = new Creator();

    @NotNull
    private final String action;

    @Nullable
    private final String id;

    @NotNull
    private final ActionType type;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RatingsAndReviewsCtaAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsCtaAction createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RatingsAndReviewsCtaAction(ActionType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RatingsAndReviewsCtaAction[] newArray(int i) {
            return new RatingsAndReviewsCtaAction[i];
        }
    }

    public RatingsAndReviewsCtaAction(@NotNull ActionType type, @NotNull String action, @Nullable String str) {
        Intrinsics.h(type, "type");
        Intrinsics.h(action, "action");
        this.type = type;
        this.action = action;
        this.id = str;
    }

    public static /* synthetic */ RatingsAndReviewsCtaAction copy$default(RatingsAndReviewsCtaAction ratingsAndReviewsCtaAction, ActionType actionType, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            actionType = ratingsAndReviewsCtaAction.type;
        }
        if ((i & 2) != 0) {
            str = ratingsAndReviewsCtaAction.action;
        }
        if ((i & 4) != 0) {
            str2 = ratingsAndReviewsCtaAction.id;
        }
        return ratingsAndReviewsCtaAction.copy(actionType, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionType getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final RatingsAndReviewsCtaAction copy(@NotNull ActionType type, @NotNull String action, @Nullable String id) {
        Intrinsics.h(type, "type");
        Intrinsics.h(action, "action");
        return new RatingsAndReviewsCtaAction(type, action, id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingsAndReviewsCtaAction)) {
            return false;
        }
        RatingsAndReviewsCtaAction ratingsAndReviewsCtaAction = (RatingsAndReviewsCtaAction) other;
        return this.type == ratingsAndReviewsCtaAction.type && Intrinsics.c(this.action, ratingsAndReviewsCtaAction.action) && Intrinsics.c(this.id, ratingsAndReviewsCtaAction.id);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final ActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = b.c(this.type.hashCode() * 31, 31, this.action);
        String str = this.id;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        ActionType actionType = this.type;
        String str = this.action;
        return a.o(d.s("RatingsAndReviewsCtaAction(type=", actionType, ", action=", str, ", id="), this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.type.name());
        dest.writeString(this.action);
        dest.writeString(this.id);
    }
}
