package com.woolworths.scanlibrary.ui.scanner;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.base.mvp.MvpPresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract;", "", "View", "Presenter", "ViewState", "Action", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ScannerContract {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Action;", "", "OpenSettings", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Action$OpenSettings;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Action$OpenSettings;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Action;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenSettings implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenSettings f21322a = new OpenSettings();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Presenter;", "Lcom/woolworths/scanlibrary/base/mvp/MvpPresenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Presenter extends MvpPresenter {
        long E0();

        boolean F0();

        boolean G0();

        List c();

        boolean f1();

        int l();

        BigDecimal p();
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$View;", "Lcom/woolworths/scanlibrary/base/mvp/MvpView;", "Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$Presenter;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface View extends MvpView<Presenter> {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$ViewState;", "", "Companion", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState c = new ViewState(0, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f21323a;
        public final int b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/scanner/ScannerContract$ViewState$Companion;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(int i, int i2) {
            this.f21323a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f21323a == viewState.f21323a && this.b == viewState.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f21323a) * 31);
        }

        public final String toString() {
            return androidx.camera.core.impl.b.j(this.f21323a, this.b, "ViewState(numItems=", ", storeId=", ")");
        }
    }
}
