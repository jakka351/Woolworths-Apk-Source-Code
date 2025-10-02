package com.woolworths.scanlibrary.ui.productInfo.details;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract;", "", "View", "Presenter", "ProductInfoViewEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ProductInfoContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        void d(Item item);

        void e();

        void g(Item item);

        ProductInformationView h(String str);

        MutableLiveData n0();
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent;", "", "RemoveItemSuccessEvent", "UpdateQuantitySuccessEvent", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent$RemoveItemSuccessEvent;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent$UpdateQuantitySuccessEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ProductInfoViewEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent$RemoveItemSuccessEvent;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemoveItemSuccessEvent extends ProductInfoViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21292a;

            public RemoveItemSuccessEvent(String lineNo) {
                Intrinsics.h(lineNo, "lineNo");
                this.f21292a = lineNo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveItemSuccessEvent) && Intrinsics.c(this.f21292a, ((RemoveItemSuccessEvent) obj).f21292a);
            }

            public final int hashCode() {
                return this.f21292a.hashCode();
            }

            public final String toString() {
                return a.h("RemoveItemSuccessEvent(lineNo=", this.f21292a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent$UpdateQuantitySuccessEvent;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$ProductInfoViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateQuantitySuccessEvent extends ProductInfoViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final Item f21293a;

            public UpdateQuantitySuccessEvent(Item cartItem) {
                Intrinsics.h(cartItem, "cartItem");
                this.f21293a = cartItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateQuantitySuccessEvent) && Intrinsics.c(this.f21293a, ((UpdateQuantitySuccessEvent) obj).f21293a);
            }

            public final int hashCode() {
                return this.f21293a.hashCode();
            }

            public final String toString() {
                return "UpdateQuantitySuccessEvent(cartItem=" + this.f21293a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/ProductInfoContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void c(Item item);

        void d(String str);
    }
}
