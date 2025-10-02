package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.GoogleApiManager;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.zag;

/* loaded from: classes5.dex */
public final class GooglePlayServicesUtil extends GooglePlayServicesUtilLight {

    @NonNull
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";

    @NonNull
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    @NonNull
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    private GooglePlayServicesUtil() {
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i, @NonNull Activity activity, int i2) {
        return getErrorDialog(i, activity, i2, null);
    }

    @NonNull
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, @NonNull Context context, int i2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @NonNull
    @Deprecated
    public static String getErrorString(int i) {
        return GooglePlayServicesUtilLight.getErrorString(i);
    }

    @NonNull
    public static Context getRemoteContext(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteContext(context);
    }

    @NonNull
    public static Resources getRemoteResource(@NonNull Context context) {
        return GooglePlayServicesUtilLight.getRemoteResource(context);
    }

    @HideFirstParty
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return GooglePlayServicesUtilLight.isUserRecoverableError(i);
    }

    public static boolean isUsingBackgroundThreadExecutorForBindService() {
        return GoogleApiManager.zat();
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, int i2) {
        return showErrorDialogFragment(i, activity, i2, null);
    }

    @Deprecated
    public static void showErrorNotification(int i, @NonNull Context context) throws Resources.NotFoundException {
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(context, i) || GooglePlayServicesUtilLight.isPlayStorePossiblyUpdating(context, i)) {
            googleApiAvailability.zah(context);
        } else {
            googleApiAvailability.showErrorNotification(context, i);
        }
    }

    public static boolean useBackgroundThreadExecutorForBindService() {
        return GoogleApiManager.zas();
    }

    public static void useBackgroundThreadForConnectionCallback() {
        GmsClientSupervisor.setUseHandlerThreadForCallbacks();
    }

    @Nullable
    @Deprecated
    public static Dialog getErrorDialog(int i, @NonNull Activity activity, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        return GoogleApiAvailability.getInstance().getErrorDialog(activity, i, i2, onCancelListener);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(@NonNull Context context, int i) {
        return GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(context, i);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i, activity, null, i2, onCancelListener);
    }

    public static boolean showErrorDialogFragment(int i, @NonNull Activity activity, @Nullable Fragment fragment2, int i2, @Nullable DialogInterface.OnCancelListener onCancelListener) {
        if (true == GooglePlayServicesUtilLight.isPlayServicesPossiblyUpdating(activity, i)) {
            i = 18;
        }
        int i3 = i;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        if (fragment2 == null) {
            return googleApiAvailability.showErrorDialogFragment(activity, i3, i2, onCancelListener);
        }
        Dialog dialogZaa = googleApiAvailability.zaa(activity, i3, zag.zac(fragment2, GoogleApiAvailability.getInstance().getErrorResolutionIntent(activity, i3, "d"), i2), onCancelListener, null);
        if (dialogZaa == null) {
            return false;
        }
        googleApiAvailability.zag(activity, dialogZaa, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }
}
