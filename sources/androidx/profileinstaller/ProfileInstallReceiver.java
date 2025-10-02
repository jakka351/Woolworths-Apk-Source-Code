package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.ProfileInstaller;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        public ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a(int i, Object obj) {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.b).a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b() {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.b).b();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.b(context, new androidx.arch.core.executor.a(2), new ResultDiagnostics(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        new a(resultDiagnostics, 11, 0, null).run();
                        return;
                    }
                    return;
                }
                ResultDiagnostics resultDiagnostics2 = new ResultDiagnostics();
                try {
                    ProfileInstaller.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    new a(resultDiagnostics2, 10, 0, null).run();
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    new a(resultDiagnostics2, 7, 0, e).run();
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            ResultDiagnostics resultDiagnostics3 = new ResultDiagnostics();
            Process.sendSignal(Process.myPid(), 10);
            resultDiagnostics3.a(12, null);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            ResultDiagnostics resultDiagnostics4 = new ResultDiagnostics();
            if ("DROP_SHADER_CACHE".equals(string2)) {
                BenchmarkOperation.b(context, resultDiagnostics4);
            } else if (!"SAVE_PROFILE".equals(string2)) {
                resultDiagnostics4.a(16, null);
            } else {
                Process.sendSignal(extras.getInt("EXTRA_PID", Process.myPid()), 10);
                resultDiagnostics4.a(12, null);
            }
        }
    }
}
