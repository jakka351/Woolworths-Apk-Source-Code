package com.google.androidbrowserhelper.trusted.splashscreens;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.ImageView;
import androidx.browser.customtabs.CustomTabsSession;
import androidx.browser.trusted.TrustedWebActivityIntentBuilder;
import androidx.camera.core.processing.f;
import androidx.camera.core.processing.g;
import androidx.core.content.FileProvider;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.androidbrowserhelper.trusted.LauncherActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes6.dex */
public class SplashImageTransferTask {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14790a;
    public final Bitmap b;
    public final String c;
    public final CustomTabsSession d;
    public final String e;
    public f f;
    public final AsyncTask g = new AsyncTask<Void, Void, Boolean>() { // from class: com.google.androidbrowserhelper.trusted.splashscreens.SplashImageTransferTask.1
        public final boolean a(File file) {
            SplashImageTransferTask splashImageTransferTask = SplashImageTransferTask.this;
            Context context = splashImageTransferTask.f14790a;
            String str = splashImageTransferTask.c;
            String str2 = splashImageTransferTask.e;
            CustomTabsSession customTabsSession = splashImageTransferTask.d;
            Uri uriD = FileProvider.d(context, str, file);
            context.grantUriPermission(str2, uriD, 1);
            customTabsSession.getClass();
            Bundle bundle = new Bundle();
            PendingIntent pendingIntent = customTabsSession.e;
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            try {
                return customTabsSession.b.k(1, uriD, bundle, customTabsSession.c);
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // android.os.AsyncTask
        public final Boolean doInBackground(Void[] voidArr) throws IOException {
            Boolean boolValueOf;
            if (isCancelled()) {
                return Boolean.FALSE;
            }
            SplashImageTransferTask splashImageTransferTask = SplashImageTransferTask.this;
            Context context = splashImageTransferTask.f14790a;
            Context context2 = splashImageTransferTask.f14790a;
            File file = new File(context.getFilesDir(), "twa_splash");
            if (!file.exists() && !file.mkdir()) {
                Log.w("SplashImageTransferTask", "Failed to create a directory for storing a splash image");
                return Boolean.FALSE;
            }
            File file2 = new File(file, "splash_image.png");
            SharedPreferences sharedPreferences = context2.getSharedPreferences("splashImagePrefs", 0);
            try {
                long j = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).lastUpdateTime;
                if (file2.exists() && j == sharedPreferences.getLong("lastUpdateTime", 0L)) {
                    return Boolean.valueOf(a(file2));
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        if (isCancelled()) {
                            boolValueOf = Boolean.FALSE;
                        } else {
                            splashImageTransferTask.b.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                            fileOutputStream.flush();
                            sharedPreferences.edit().putLong("lastUpdateTime", j).commit();
                            boolValueOf = isCancelled() ? Boolean.FALSE : Boolean.valueOf(a(file2));
                        }
                        fileOutputStream.close();
                        return boolValueOf;
                    } finally {
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Boolean bool) throws ExecutionException, InterruptedException {
            Boolean bool2 = bool;
            SplashImageTransferTask splashImageTransferTask = SplashImageTransferTask.this;
            if (splashImageTransferTask.f == null || isCancelled()) {
                return;
            }
            f fVar = splashImageTransferTask.f;
            boolean zBooleanValue = bool2.booleanValue();
            PwaWrapperSplashScreenStrategy pwaWrapperSplashScreenStrategy = (PwaWrapperSplashScreenStrategy) fVar.g;
            TrustedWebActivityIntentBuilder trustedWebActivityIntentBuilder = (TrustedWebActivityIntentBuilder) fVar.e;
            g gVar = (g) fVar.f;
            SystemBarColorPredictor systemBarColorPredictor = PwaWrapperSplashScreenStrategy.l;
            if (!zBooleanValue) {
                Log.w("SplashScreenStrategy", "Failed to transfer splash image.");
                gVar.run();
                return;
            }
            Bundle bundleG = c.g("androidx.browser.trusted.KEY_SPLASH_SCREEN_VERSION", "androidx.browser.trusted.category.TrustedWebActivitySplashScreensV1");
            bundleG.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_FADE_OUT_DURATION", pwaWrapperSplashScreenStrategy.e);
            bundleG.putInt("androidx.browser.trusted.trusted.KEY_SPLASH_SCREEN_BACKGROUND_COLOR", pwaWrapperSplashScreenStrategy.c);
            bundleG.putInt("androidx.browser.trusted.KEY_SPLASH_SCREEN_SCALE_TYPE", ImageView.ScaleType.CENTER.ordinal());
            trustedWebActivityIntentBuilder.d = bundleG;
            a aVar = new a(pwaWrapperSplashScreenStrategy, gVar);
            if (pwaWrapperSplashScreenStrategy.j) {
                aVar.run();
            } else {
                pwaWrapperSplashScreenStrategy.k = aVar;
            }
        }
    };

    public interface Callback {
    }

    public SplashImageTransferTask(LauncherActivity launcherActivity, Bitmap bitmap, String str, CustomTabsSession customTabsSession, String str2) {
        this.f14790a = launcherActivity.getApplicationContext();
        this.b = bitmap;
        this.c = str;
        this.d = customTabsSession;
        this.e = str2;
    }
}
