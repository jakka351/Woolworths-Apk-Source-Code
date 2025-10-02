package com.woolworths.scanlibrary.ui.entry;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract;", "", "ViewState", "Actions", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface SngEntryContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "", "Close", "ShowTutorial", "ShowAddRewardSetup", "OpenSng", "ShowNearestStore", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$Close;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$OpenSng;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowAddRewardSetup;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowNearestStore;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowTutorial;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$Close;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Close extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Close f21245a = new Close();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$OpenSng;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenSng extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenSng f21246a = new OpenSng();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowAddRewardSetup;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowAddRewardSetup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowAddRewardSetup f21247a = new ShowAddRewardSetup();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowNearestStore;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowNearestStore extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowNearestStore f21248a = new ShowNearestStore();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions$ShowTutorial;", "Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$Actions;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowTutorial extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowTutorial f21249a = new ShowTutorial();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/SngEntryContract$ViewState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21250a;
        public final boolean b;
        public final FetchSngErrorState c;

        public ViewState(boolean z, boolean z2, FetchSngErrorState fetchSngErrorState) {
            this.f21250a = z;
            this.b = z2;
            this.c = fetchSngErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f21250a == viewState.f21250a && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            int iE = b.e(Boolean.hashCode(this.f21250a) * 31, 31, this.b);
            FetchSngErrorState fetchSngErrorState = this.c;
            return iE + (fetchSngErrorState == null ? 0 : fetchSngErrorState.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(isLoading=", ", showWelcome=", ", errorState=", this.f21250a, this.b);
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
