package com.woolworths.scanlibrary.ui.scanner.additem;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.cart.Coupon;
import com.woolworths.scanlibrary.models.product.Item;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract;", "", "View", "Presenter", "ViewState", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AddItemContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void K0(String str, String str2, boolean z);

        void T0(String str);

        void h0(float f, String str);
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void L2(ViewState viewState);

        void N2();

        void T0(String str);

        void h4(Item item);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "", "MANUAL_BAR_CODE_ENTRY_VIEW", "LOADING_VIEW", "PRODUCT_MANUAL_ADD_CONFIRM_VIEW", "SHELF_LABEL_SCANNED_BLOCKED_VIEW", "CouponItem", "ScannedItemBlocked", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$CouponItem;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$LOADING_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$MANUAL_BAR_CODE_ENTRY_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$PRODUCT_MANUAL_ADD_CONFIRM_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$SHELF_LABEL_SCANNED_BLOCKED_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$ScannedItemBlocked;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$CouponItem;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CouponItem extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f21326a;
            public final Item b;
            public final Coupon c;

            public CouponItem(Coupon coupon, Item item, boolean z) {
                Intrinsics.h(coupon, "coupon");
                this.f21326a = z;
                this.b = item;
                this.c = coupon;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CouponItem)) {
                    return false;
                }
                CouponItem couponItem = (CouponItem) obj;
                return this.f21326a == couponItem.f21326a && Intrinsics.c(this.b, couponItem.b) && Intrinsics.c(this.c, couponItem.c);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f21326a) * 31;
                Item item = this.b;
                return this.c.hashCode() + ((iHashCode + (item == null ? 0 : item.hashCode())) * 31);
            }

            public final String toString() {
                return "CouponItem(isRedeemed=" + this.f21326a + ", cartItem=" + this.b + ", coupon=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$LOADING_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LOADING_VIEW extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final LOADING_VIEW f21327a = new LOADING_VIEW();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$MANUAL_BAR_CODE_ENTRY_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MANUAL_BAR_CODE_ENTRY_VIEW extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final MANUAL_BAR_CODE_ENTRY_VIEW f21328a = new MANUAL_BAR_CODE_ENTRY_VIEW();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$PRODUCT_MANUAL_ADD_CONFIRM_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PRODUCT_MANUAL_ADD_CONFIRM_VIEW extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final PRODUCT_MANUAL_ADD_CONFIRM_VIEW f21329a = new PRODUCT_MANUAL_ADD_CONFIRM_VIEW();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$SHELF_LABEL_SCANNED_BLOCKED_VIEW;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SHELF_LABEL_SCANNED_BLOCKED_VIEW extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final SHELF_LABEL_SCANNED_BLOCKED_VIEW f21330a = new SHELF_LABEL_SCANNED_BLOCKED_VIEW();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState$ScannedItemBlocked;", "Lcom/woolworths/scanlibrary/ui/scanner/additem/AddItemContract$ViewState;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScannedItemBlocked extends ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final int f21331a;
            public final String b;
            public final String c;

            public ScannedItemBlocked(int i, String message, String description) {
                Intrinsics.h(message, "message");
                Intrinsics.h(description, "description");
                this.f21331a = i;
                this.b = message;
                this.c = description;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScannedItemBlocked)) {
                    return false;
                }
                ScannedItemBlocked scannedItemBlocked = (ScannedItemBlocked) obj;
                return this.f21331a == scannedItemBlocked.f21331a && Intrinsics.c(this.b, scannedItemBlocked.b) && Intrinsics.c(this.c, scannedItemBlocked.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + androidx.camera.core.impl.b.c(Integer.hashCode(this.f21331a) * 31, 31, this.b);
            }

            public final String toString() {
                return YU.a.o(androidx.constraintlayout.core.state.a.p("ScannedItemBlocked(drawableId=", this.f21331a, ", message=", this.b, ", description="), this.c, ")");
            }
        }
    }
}
