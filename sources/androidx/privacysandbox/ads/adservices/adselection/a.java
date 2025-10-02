package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.appsetid.AppSetId;
import android.adservices.appsetid.AppSetIdManager;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.LeaveCustomAudienceRequest;
import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void A() {
        new JoinCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ AppSetId c(Object obj) {
        return (AppSetId) obj;
    }

    public static /* bridge */ /* synthetic */ AppSetIdManager e(Object obj) {
        return (AppSetIdManager) obj;
    }

    public static /* synthetic */ CustomAudience.Builder h() {
        return new CustomAudience.Builder();
    }

    public static /* bridge */ /* synthetic */ CustomAudienceManager j(Object obj) {
        return (CustomAudienceManager) obj;
    }

    public static /* synthetic */ DeletionRequest.Builder k() {
        return new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ MeasurementManager o(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class q() {
        return AppSetIdManager.class;
    }

    public static /* synthetic */ void s() {
    }

    public static /* bridge */ /* synthetic */ Class w() {
        return CustomAudienceManager.class;
    }

    public static /* synthetic */ void x() {
        new LeaveCustomAudienceRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class z() {
        return MeasurementManager.class;
    }
}
