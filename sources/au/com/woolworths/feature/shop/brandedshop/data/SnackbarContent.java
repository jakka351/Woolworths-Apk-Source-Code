package au.com.woolworths.feature.shop.brandedshop.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent;", "Landroid/os/Parcelable;", "AddToListSuccess", "AddToCartError", "Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent$AddToCartError;", "Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent$AddToListSuccess;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SnackbarContent implements Parcelable {

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent$AddToCartError;", "Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartError extends SnackbarContent {

        @NotNull
        public static final Parcelable.Creator<AddToCartError> CREATOR = new Creator();
        public final ProductBottomSheetErrorCause d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddToCartError> {
            @Override // android.os.Parcelable.Creator
            public final AddToCartError createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new AddToCartError(ProductBottomSheetErrorCause.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddToCartError[] newArray(int i) {
                return new AddToCartError[i];
            }
        }

        public AddToCartError(ProductBottomSheetErrorCause error) {
            Intrinsics.h(error, "error");
            this.d = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddToCartError) && this.d == ((AddToCartError) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "AddToCartError(error=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d.name());
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent$AddToListSuccess;", "Lau/com/woolworths/feature/shop/brandedshop/data/SnackbarContent;", "brandedshop_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToListSuccess extends SnackbarContent {

        @NotNull
        public static final Parcelable.Creator<AddToListSuccess> CREATOR = new Creator();
        public final ListChangeEvent.AddToListSuccessEvent d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddToListSuccess> {
            @Override // android.os.Parcelable.Creator
            public final AddToListSuccess createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new AddToListSuccess((ListChangeEvent.AddToListSuccessEvent) parcel.readParcelable(AddToListSuccess.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final AddToListSuccess[] newArray(int i) {
                return new AddToListSuccess[i];
            }
        }

        public AddToListSuccess(ListChangeEvent.AddToListSuccessEvent event) {
            Intrinsics.h(event, "event");
            this.d = event;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddToListSuccess) && Intrinsics.c(this.d, ((AddToListSuccess) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "AddToListSuccess(event=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeParcelable(this.d, i);
        }
    }
}
