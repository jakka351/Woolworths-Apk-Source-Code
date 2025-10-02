package androidx.compose.ui.platform;

import android.adservices.adselection.AdSelectionFromOutcomesConfig;
import android.adservices.adselection.GetAdSelectionDataOutcome;
import android.adservices.adselection.GetAdSelectionDataRequest;
import android.adservices.adselection.PersistAdSelectionResultRequest;
import android.adservices.adselection.ReportEventRequest;
import android.adservices.adselection.ReportImpressionRequest;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class h {
    public static /* synthetic */ void C() {
    }

    public static /* synthetic */ void D() {
    }

    public static /* bridge */ /* synthetic */ GetAdSelectionDataOutcome b(Object obj) {
        return (GetAdSelectionDataOutcome) obj;
    }

    public static /* synthetic */ PersistAdSelectionResultRequest.Builder c() {
        return new PersistAdSelectionResultRequest.Builder();
    }

    public static /* synthetic */ ReportEventRequest.Builder f() {
        return new ReportEventRequest.Builder(0L, (String) null, (String) null, 0);
    }

    public static /* synthetic */ ReportImpressionRequest i() {
        return new ReportImpressionRequest(0L);
    }

    public static /* synthetic */ void l() {
        new AdSelectionFromOutcomesConfig.Builder();
    }

    public static /* synthetic */ void z() {
        new GetAdSelectionDataRequest.Builder();
    }
}
