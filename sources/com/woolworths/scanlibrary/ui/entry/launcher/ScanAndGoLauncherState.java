package com.woolworths.scanlibrary.ui.entry.launcher;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.ui.entry.launcher.errors.FetchSngErrorState;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/entry/launcher/ScanAndGoLauncherState;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ScanAndGoLauncherState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21255a;
    public final FetchSngErrorState b;

    public ScanAndGoLauncherState(boolean z, FetchSngErrorState fetchSngErrorState) {
        this.f21255a = z;
        this.b = fetchSngErrorState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScanAndGoLauncherState)) {
            return false;
        }
        ScanAndGoLauncherState scanAndGoLauncherState = (ScanAndGoLauncherState) obj;
        return this.f21255a == scanAndGoLauncherState.f21255a && this.b == scanAndGoLauncherState.b;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f21255a) * 31;
        FetchSngErrorState fetchSngErrorState = this.b;
        return iHashCode + (fetchSngErrorState == null ? 0 : fetchSngErrorState.hashCode());
    }

    public final String toString() {
        return "ScanAndGoLauncherState(isLoading=" + this.f21255a + ", errorState=" + this.b + ")";
    }
}
