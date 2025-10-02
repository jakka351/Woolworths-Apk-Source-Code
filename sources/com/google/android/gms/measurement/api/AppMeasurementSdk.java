package com.google.android.gms.measurement.api;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import java.util.List;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes.dex */
public class AppMeasurementSdk {
    private final zzfb zza;

    @KeepForSdk
    /* loaded from: classes5.dex */
    public static final class ConditionalUserProperty {

        @NonNull
        @KeepForSdk
        public static final String ACTIVE = "active";

        @NonNull
        @KeepForSdk
        public static final String CREATION_TIMESTAMP = "creation_timestamp";

        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_NAME = "expired_event_name";

        @NonNull
        @KeepForSdk
        public static final String EXPIRED_EVENT_PARAMS = "expired_event_params";

        @NonNull
        @KeepForSdk
        public static final String NAME = "name";

        @NonNull
        @KeepForSdk
        public static final String ORIGIN = "origin";

        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_NAME = "timed_out_event_name";

        @NonNull
        @KeepForSdk
        public static final String TIMED_OUT_EVENT_PARAMS = "timed_out_event_params";

        @NonNull
        @KeepForSdk
        public static final String TIME_TO_LIVE = "time_to_live";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_NAME = "triggered_event_name";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_EVENT_PARAMS = "triggered_event_params";

        @NonNull
        @KeepForSdk
        public static final String TRIGGERED_TIMESTAMP = "triggered_timestamp";

        @NonNull
        @KeepForSdk
        public static final String TRIGGER_EVENT_NAME = "trigger_event_name";

        @NonNull
        @KeepForSdk
        public static final String TRIGGER_TIMEOUT = "trigger_timeout";

        @NonNull
        @KeepForSdk
        public static final String VALUE = "value";

        private ConditionalUserProperty() {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* loaded from: classes5.dex */
    public interface EventInterceptor extends zzjp {
        @Override // com.google.android.gms.measurement.internal.zzjp
        @ShowFirstParty
        @KeepForSdk
        @WorkerThread
        void interceptEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j);
    }

    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzjq {
        @Override // com.google.android.gms.measurement.internal.zzjq
        @ShowFirstParty
        @KeepForSdk
        @WorkerThread
        void onEvent(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle, long j);
    }

    public AppMeasurementSdk(zzfb zzfbVar) {
        this.zza = zzfbVar;
    }

    @NonNull
    @RequiresPermission
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context) {
        return zzfb.zza(context, null).zzb();
    }

    @KeepForSdk
    public void beginAdUnitExposure(@NonNull @Size String str) {
        this.zza.zzu(str);
    }

    @KeepForSdk
    public void clearConditionalUserProperty(@NonNull @Size String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.zza.zzm(str, str2, bundle);
    }

    @KeepForSdk
    public void endAdUnitExposure(@NonNull @Size String str) {
        this.zza.zzv(str);
    }

    @KeepForSdk
    public long generateEventId() {
        return this.zza.zzz();
    }

    @Nullable
    @KeepForSdk
    public String getAppIdOrigin() {
        return this.zza.zzI();
    }

    @Nullable
    @KeepForSdk
    public String getAppInstanceId() {
        return this.zza.zzy();
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public List<Bundle> getConditionalUserProperties(@Nullable String str, @Nullable @Size String str2) {
        return this.zza.zzn(str, str2);
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenClass() {
        return this.zza.zzB();
    }

    @Nullable
    @KeepForSdk
    public String getCurrentScreenName() {
        return this.zza.zzA();
    }

    @Nullable
    @KeepForSdk
    public String getGmpAppId() {
        return this.zza.zzx();
    }

    @KeepForSdk
    @WorkerThread
    public int getMaxUserProperties(@NonNull @Size String str) {
        return this.zza.zzF(str);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    public Map<String, Object> getUserProperties(@Nullable String str, @Nullable @Size String str2, boolean z) {
        return this.zza.zzC(str, str2, z);
    }

    @KeepForSdk
    public void logEvent(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        this.zza.zzi(str, str2, bundle);
    }

    @KeepForSdk
    public void logEventNoInterceptor(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle, long j) {
        this.zza.zzj(str, str2, bundle, j);
    }

    @KeepForSdk
    public void performAction(@NonNull Bundle bundle) {
        this.zza.zzE(bundle, false);
    }

    @Nullable
    @KeepForSdk
    public Bundle performActionWithResponse(@NonNull Bundle bundle) {
        return this.zza.zzE(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void registerOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zza.zzf(onEventListener);
    }

    @KeepForSdk
    public void setConditionalUserProperty(@NonNull Bundle bundle) {
        this.zza.zzl(bundle);
    }

    @KeepForSdk
    @Deprecated
    public void setConsent(@NonNull Bundle bundle) {
    }

    @KeepForSdk
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size String str, @Nullable @Size String str2) {
        this.zza.zzp(zzdf.zza(activity), str, str2);
    }

    @ShowFirstParty
    @KeepForSdk
    @WorkerThread
    public void setEventInterceptor(@NonNull EventInterceptor eventInterceptor) {
        this.zza.zzd(eventInterceptor);
    }

    @KeepForSdk
    @Deprecated
    public void setMeasurementEnabled(@Nullable Boolean bool) {
    }

    @KeepForSdk
    public void setUserProperty(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.zza.zzk(str, str2, obj, true);
    }

    @ShowFirstParty
    @KeepForSdk
    public void unregisterOnMeasurementEventListener(@NonNull OnEventListener onEventListener) {
        this.zza.zzg(onEventListener);
    }

    public final void zza(boolean z) {
        this.zza.zzK(z);
    }

    @KeepForSdk
    @Deprecated
    public void setMeasurementEnabled(boolean z) {
    }

    @NonNull
    @Deprecated
    @RequiresPermission
    @KeepForSdk
    public static AppMeasurementSdk getInstance(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Bundle bundle) {
        return zzfb.zza(context, bundle).zzb();
    }
}
