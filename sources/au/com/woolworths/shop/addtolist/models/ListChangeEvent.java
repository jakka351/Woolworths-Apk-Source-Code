package au.com.woolworths.shop.addtolist.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/ListChangeEvent;", "", "AddToListSuccessEvent", "RemoveFromListSuccessEvent", "Lau/com/woolworths/shop/addtolist/models/ListChangeEvent$AddToListSuccessEvent;", "Lau/com/woolworths/shop/addtolist/models/ListChangeEvent$RemoveFromListSuccessEvent;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ListChangeEvent {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/ListChangeEvent$RemoveFromListSuccessEvent;", "Lau/com/woolworths/shop/addtolist/models/ListChangeEvent;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveFromListSuccessEvent extends ListChangeEvent {
        public final ProductListItem d;

        public RemoveFromListSuccessEvent(ProductListItem removedListItem) {
            Intrinsics.h(removedListItem, "removedListItem");
            this.d = removedListItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RemoveFromListSuccessEvent) && Intrinsics.c(this.d, ((RemoveFromListSuccessEvent) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "RemoveFromListSuccessEvent(removedListItem=" + this.d + ")";
        }
    }

    @Parcelize
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/addtolist/models/ListChangeEvent$AddToListSuccessEvent;", "Lau/com/woolworths/shop/addtolist/models/ListChangeEvent;", "Landroid/os/Parcelable;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToListSuccessEvent extends ListChangeEvent implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AddToListSuccessEvent> CREATOR = new Creator();
        public final String d;
        public final String e;
        public final String f;
        public final boolean g;
        public final List h;
        public final BoostResult i;
        public final boolean j;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddToListSuccessEvent> {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable.Creator
            public final AddToListSuccessEvent createFromParcel(Parcel parcel) {
                int i;
                Intrinsics.h(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z = true;
                if (parcel.readInt() != 0) {
                    i = 1;
                } else {
                    i = 1;
                    z = false;
                }
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = a.a(AddToListSuccessEvent.class, parcel, arrayList, iA, i);
                }
                return new AddToListSuccessEvent(string, string2, string3, z, arrayList, parcel.readInt() == 0 ? null : BoostResult.valueOf(parcel.readString()), parcel.readInt() != 0 ? i : 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AddToListSuccessEvent[] newArray(int i) {
                return new AddToListSuccessEvent[i];
            }
        }

        public AddToListSuccessEvent(String shoppingListId, String shoppingListName, String str, boolean z, List list, BoostResult boostResult, boolean z2) {
            Intrinsics.h(shoppingListId, "shoppingListId");
            Intrinsics.h(shoppingListName, "shoppingListName");
            this.d = shoppingListId;
            this.e = shoppingListName;
            this.f = str;
            this.g = z;
            this.h = list;
            this.i = boostResult;
            this.j = z2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddToListSuccessEvent)) {
                return false;
            }
            AddToListSuccessEvent addToListSuccessEvent = (AddToListSuccessEvent) obj;
            return Intrinsics.c(this.d, addToListSuccessEvent.d) && Intrinsics.c(this.e, addToListSuccessEvent.e) && Intrinsics.c(this.f, addToListSuccessEvent.f) && this.g == addToListSuccessEvent.g && Intrinsics.c(this.h, addToListSuccessEvent.h) && this.i == addToListSuccessEvent.i && this.j == addToListSuccessEvent.j;
        }

        public final int hashCode() {
            int iC = b.c(this.d.hashCode() * 31, 31, this.e);
            String str = this.f;
            int iD = b.d(b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
            BoostResult boostResult = this.i;
            return Boolean.hashCode(this.j) + ((iD + (boostResult != null ? boostResult.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("AddToListSuccessEvent(shoppingListId=", this.d, ", shoppingListName=", this.e, ", quantityLabel=");
            d.A(this.f, ", alreadyExists=", ", productsAdded=", sbV, this.g);
            sbV.append(this.h);
            sbV.append(", boostResult=");
            sbV.append(this.i);
            sbV.append(", hasVarieties=");
            return YU.a.k(")", sbV, this.j);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
            dest.writeString(this.e);
            dest.writeString(this.f);
            dest.writeInt(this.g ? 1 : 0);
            Iterator itU = a.u(this.h, dest);
            while (itU.hasNext()) {
                dest.writeParcelable((Parcelable) itU.next(), i);
            }
            BoostResult boostResult = this.i;
            if (boostResult == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(boostResult.name());
            }
            dest.writeInt(this.j ? 1 : 0);
        }

        public /* synthetic */ AddToListSuccessEvent(String str, String str2, String str3, boolean z, List list, BoostResult boostResult, boolean z2, int i) {
            this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, list, (i & 32) != 0 ? null : boostResult, (i & 64) != 0 ? false : z2);
        }
    }
}
