package com.woolworths.scanlibrary.ui.stores;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract;", "", "ViewState", "Actions", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AvailableStoreContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions;", "", "AvailableStoreLoadingSuccess", "AvailableStoreLoadingFail", "Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions$AvailableStoreLoadingFail;", "Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions$AvailableStoreLoadingSuccess;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions$AvailableStoreLoadingFail;", "Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AvailableStoreLoadingFail extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final AvailableStoreLoadingFail f21337a = new AvailableStoreLoadingFail();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions$AvailableStoreLoadingSuccess;", "Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AvailableStoreLoadingSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final List f21338a;

            public AvailableStoreLoadingSuccess(List list) {
                this.f21338a = list;
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/stores/AvailableStoreContract$ViewState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21339a;
        public final boolean b;

        public ViewState(boolean z, boolean z2) {
            this.f21339a = z;
            this.b = z2;
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, int i) {
            if ((i & 1) != 0) {
                z = viewState.f21339a;
            }
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            viewState.getClass();
            return new ViewState(z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f21339a == viewState.f21339a && this.b == viewState.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f21339a) * 31);
        }

        public final String toString() {
            return "ViewState(showNoAvailableStores=" + this.f21339a + ", showFetchStoresFailure=" + this.b + ")";
        }
    }
}
