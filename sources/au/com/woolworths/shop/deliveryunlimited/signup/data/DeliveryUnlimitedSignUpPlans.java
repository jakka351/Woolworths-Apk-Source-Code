package au.com.woolworths.shop.deliveryunlimited.signup.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlans;", "Landroid/os/Parcelable;", "", "title", "", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpPlanType;", "planTypes", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "b", "()Ljava/util/List;", "Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "a", "()Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSignUpFooter;", "shop-delivery-unlimited-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeliveryUnlimitedSignUpPlans implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DeliveryUnlimitedSignUpPlans> CREATOR = new Creator();

    @SerializedName("footer")
    @NotNull
    private final DeliveryUnlimitedSignUpFooter footer;

    @SerializedName("planTypes")
    @NotNull
    private final List<DeliveryUnlimitedSignUpPlanType> planTypes;

    @SerializedName("title")
    @NotNull
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryUnlimitedSignUpPlans> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlans createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(DeliveryUnlimitedSignUpPlanType.CREATOR, parcel, arrayList, iE, 1);
            }
            return new DeliveryUnlimitedSignUpPlans(string, arrayList, DeliveryUnlimitedSignUpFooter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUnlimitedSignUpPlans[] newArray(int i) {
            return new DeliveryUnlimitedSignUpPlans[i];
        }
    }

    public DeliveryUnlimitedSignUpPlans(@NotNull String title, @NotNull List<DeliveryUnlimitedSignUpPlanType> planTypes, @NotNull DeliveryUnlimitedSignUpFooter footer) {
        Intrinsics.h(title, "title");
        Intrinsics.h(planTypes, "planTypes");
        Intrinsics.h(footer, "footer");
        this.title = title;
        this.planTypes = planTypes;
        this.footer = footer;
    }

    /* renamed from: a, reason: from getter */
    public final DeliveryUnlimitedSignUpFooter getFooter() {
        return this.footer;
    }

    /* renamed from: b, reason: from getter */
    public final List getPlanTypes() {
        return this.planTypes;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUnlimitedSignUpPlans)) {
            return false;
        }
        DeliveryUnlimitedSignUpPlans deliveryUnlimitedSignUpPlans = (DeliveryUnlimitedSignUpPlans) obj;
        return Intrinsics.c(this.title, deliveryUnlimitedSignUpPlans.title) && Intrinsics.c(this.planTypes, deliveryUnlimitedSignUpPlans.planTypes) && Intrinsics.c(this.footer, deliveryUnlimitedSignUpPlans.footer);
    }

    public final int hashCode() {
        return this.footer.hashCode() + b.d(this.title.hashCode() * 31, 31, this.planTypes);
    }

    public final String toString() {
        String str = this.title;
        List<DeliveryUnlimitedSignUpPlanType> list = this.planTypes;
        DeliveryUnlimitedSignUpFooter deliveryUnlimitedSignUpFooter = this.footer;
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("DeliveryUnlimitedSignUpPlans(title=", str, ", planTypes=", ", footer=", list);
        sbS.append(deliveryUnlimitedSignUpFooter);
        sbS.append(")");
        return sbS.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.title);
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.planTypes, dest);
        while (itU.hasNext()) {
            ((DeliveryUnlimitedSignUpPlanType) itU.next()).writeToParcel(dest, i);
        }
        this.footer.writeToParcel(dest, i);
    }
}
