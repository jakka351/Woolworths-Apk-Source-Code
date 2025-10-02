package com.woolworths.scanlibrary.ui.home.itemview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.home.itemview.views.ItemView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract;", "", "View", "Presenter", "ItemViewEvent", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ItemContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent;", "", "RemoveItemEvent", "RemoveItemSuccessEvent", "SetLoadingIndicatorEvent", "UpdateQuantitySuccessEvent", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$RemoveItemEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$RemoveItemSuccessEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$UpdateQuantitySuccessEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ItemViewEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$RemoveItemEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemoveItemEvent extends ItemViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21268a;

            public RemoveItemEvent(String lineNo) {
                Intrinsics.h(lineNo, "lineNo");
                this.f21268a = lineNo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveItemEvent) && Intrinsics.c(this.f21268a, ((RemoveItemEvent) obj).f21268a);
            }

            public final int hashCode() {
                return this.f21268a.hashCode();
            }

            public final String toString() {
                return YU.a.h("RemoveItemEvent(lineNo=", this.f21268a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$RemoveItemSuccessEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemoveItemSuccessEvent extends ItemViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f21269a;

            public RemoveItemSuccessEvent(String lineNo) {
                Intrinsics.h(lineNo, "lineNo");
                this.f21269a = lineNo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveItemSuccessEvent) && Intrinsics.c(this.f21269a, ((RemoveItemSuccessEvent) obj).f21269a);
            }

            public final int hashCode() {
                return this.f21269a.hashCode();
            }

            public final String toString() {
                return YU.a.h("RemoveItemSuccessEvent(lineNo=", this.f21269a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$SetLoadingIndicatorEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SetLoadingIndicatorEvent extends ItemViewEvent {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SetLoadingIndicatorEvent);
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "SetLoadingIndicatorEvent(show=false)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent$UpdateQuantitySuccessEvent;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$ItemViewEvent;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateQuantitySuccessEvent extends ItemViewEvent {

            /* renamed from: a, reason: collision with root package name */
            public final Item f21270a;

            public UpdateQuantitySuccessEvent(Item cartItem) {
                Intrinsics.h(cartItem, "cartItem");
                this.f21270a = cartItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateQuantitySuccessEvent) && Intrinsics.c(this.f21270a, ((UpdateQuantitySuccessEvent) obj).f21270a);
            }

            public final int hashCode() {
                return this.f21270a.hashCode();
            }

            public final String toString() {
                return "UpdateQuantitySuccessEvent(cartItem=" + this.f21270a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        MutableLiveData T();

        void Z();

        void d(Item item);

        void e();

        void g(Item item);

        ItemView h(String str);

        List j();

        void o0();

        void q0();

        int u0();

        boolean y();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/home/itemview/ItemContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
        void H();

        void c(Item item);

        void d(String str);
    }
}
