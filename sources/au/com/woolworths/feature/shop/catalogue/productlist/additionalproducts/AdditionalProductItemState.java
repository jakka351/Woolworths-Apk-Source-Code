package au.com.woolworths.feature.shop.catalogue.productlist.additionalproducts;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState;", "Lau/com/woolworths/feature/shop/catalogue/productlist/CatalogueProductListContract$BaseItemState;", "Buttons", "CartButton", "ListButton", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalProductItemState implements CatalogueProductListContract.BaseItemState {

    /* renamed from: a, reason: collision with root package name */
    public final AdditionalItemInfo f6929a;
    public final ProductCard b;
    public final Buttons c;
    public final boolean d;
    public final CatalogueProductListContract.ItemStateType e = CatalogueProductListContract.ItemStateType.f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState$Buttons;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Buttons {

        /* renamed from: a, reason: collision with root package name */
        public final ListButton f6930a;
        public final CartButton b;

        public Buttons(ListButton listButton, CartButton cartButton) {
            this.f6930a = listButton;
            this.b = cartButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Buttons)) {
                return false;
            }
            Buttons buttons = (Buttons) obj;
            return Intrinsics.c(this.f6930a, buttons.f6930a) && Intrinsics.c(this.b, buttons.b);
        }

        public final int hashCode() {
            ListButton listButton = this.f6930a;
            int iHashCode = (listButton == null ? 0 : listButton.f6932a.hashCode()) * 31;
            CartButton cartButton = this.b;
            return iHashCode + (cartButton != null ? cartButton.hashCode() : 0);
        }

        public final String toString() {
            return "Buttons(listButton=" + this.f6930a + ", cartButton=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState$CartButton;", "", "State", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartButton {

        /* renamed from: a, reason: collision with root package name */
        public final State f6931a;
        public final String b;
        public final String c;
        public final String d;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState$CartButton$State;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class State {
            public static final State d;
            public static final State e;
            public static final State f;
            public static final State g;
            public static final State h;
            public static final State i;
            public static final State j;
            public static final /* synthetic */ State[] k;
            public static final /* synthetic */ EnumEntries l;

            static {
                State state = new State("IN_STOCK", 0);
                d = state;
                State state2 = new State("UNAVAILABLE", 1);
                e = state2;
                State state3 = new State("DISABLED", 2);
                f = state3;
                State state4 = new State("ADD", 3);
                g = state4;
                State state5 = new State("UPDATE", 4);
                h = state5;
                State state6 = new State("SEE_IN_STORE", 5);
                i = state6;
                State state7 = new State("CHECK_STOCK", 6);
                j = state7;
                State[] stateArr = {state, state2, state3, state4, state5, state6, state7};
                k = stateArr;
                l = EnumEntriesKt.a(stateArr);
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) k.clone();
            }
        }

        public CartButton(State state, String str, String str2, String str3, int i) {
            str = (i & 2) != 0 ? null : str;
            str2 = (i & 4) != 0 ? null : str2;
            str3 = (i & 8) != 0 ? null : str3;
            this.f6931a = state;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartButton)) {
                return false;
            }
            CartButton cartButton = (CartButton) obj;
            return this.f6931a == cartButton.f6931a && Intrinsics.c(this.b, cartButton.b) && Intrinsics.c(this.c, cartButton.c) && Intrinsics.c(this.d, cartButton.d);
        }

        public final int hashCode() {
            int iHashCode = this.f6931a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CartButton(state=");
            sb.append(this.f6931a);
            sb.append(", label=");
            sb.append(this.b);
            sb.append(", updateLabel=");
            return a.l(sb, this.c, ", updateQuantity=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState$ListButton;", "", "State", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListButton {

        /* renamed from: a, reason: collision with root package name */
        public final State f6932a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/additionalproducts/AdditionalProductItemState$ListButton$State;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class State {
            public static final State d;
            public static final State e;
            public static final /* synthetic */ State[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                State state = new State("ONLINE", 0);
                d = state;
                State state2 = new State("IN_STORE", 1);
                e = state2;
                State[] stateArr = {state, state2};
                f = stateArr;
                g = EnumEntriesKt.a(stateArr);
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f.clone();
            }
        }

        public ListButton(State state) {
            this.f6932a = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListButton) && this.f6932a == ((ListButton) obj).f6932a;
        }

        public final int hashCode() {
            return this.f6932a.hashCode();
        }

        public final String toString() {
            return "ListButton(state=" + this.f6932a + ")";
        }
    }

    static {
        int i = ProductCard.$stable;
    }

    public AdditionalProductItemState(AdditionalItemInfo additionalItemInfo, ProductCard productCard, Buttons buttons, boolean z) {
        this.f6929a = additionalItemInfo;
        this.b = productCard;
        this.c = buttons;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalProductItemState)) {
            return false;
        }
        AdditionalProductItemState additionalProductItemState = (AdditionalProductItemState) obj;
        return Intrinsics.c(this.f6929a, additionalProductItemState.f6929a) && Intrinsics.c(this.b, additionalProductItemState.b) && Intrinsics.c(this.c, additionalProductItemState.c) && this.d == additionalProductItemState.d;
    }

    @Override // au.com.woolworths.feature.shop.catalogue.productlist.CatalogueProductListContract.BaseItemState
    /* renamed from: getItemType, reason: from getter */
    public final CatalogueProductListContract.ItemStateType getE() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.f6929a.hashCode() * 31;
        ProductCard productCard = this.b;
        int iHashCode2 = (iHashCode + (productCard == null ? 0 : productCard.hashCode())) * 31;
        Buttons buttons = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (buttons != null ? buttons.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AdditionalProductItemState(additionalItemInfo=" + this.f6929a + ", productCard=" + this.b + ", buttons=" + this.c + ", isInStoreMode=" + this.d + ")";
    }
}
