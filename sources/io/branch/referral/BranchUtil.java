package io.branch.referral;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.medallia.digital.mobilesdk.q2;
import io.branch.referral.BranchJsonConfig;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarFile;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BranchUtil {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f23857a = false;
    public static Boolean b;

    /* loaded from: classes7.dex */
    public static class JsonReader {
    }

    public static boolean a(Context context) {
        if (!f23857a && b == null) {
            BranchJsonConfig branchJsonConfigA = BranchJsonConfig.a(context);
            if (branchJsonConfigA.c(BranchJsonConfig.BranchJsonKey.g)) {
                Boolean boolB = branchJsonConfigA.b();
                f23857a = boolB != null ? boolB.booleanValue() : false;
            } else {
                boolean z = f23857a;
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                    Bundle bundle = applicationInfo.metaData;
                    if (bundle == null || !bundle.containsKey("io.branch.sdk.TestMode")) {
                        Resources resources = context.getResources();
                        z = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                    } else {
                        z = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                    }
                } catch (Exception unused) {
                }
                f23857a = z;
            }
            b = Boolean.valueOf(f23857a);
        }
        return f23857a;
    }

    public static String b(int i, Context context) {
        if (i == -1) {
            return null;
        }
        try {
            return context.getResources().getString(i);
        } catch (Exception e) {
            BranchLogger.a(e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.jar.JarFile] */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static JSONObject c(Context context) throws Throwable {
        InputStream inputStream;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        ?? jarFile = memoryInfo.lowMemory;
        JSONObject jSONObjectC = null;
        jSONObjectC = null;
        jSONObjectC = null;
        inputStream = null;
        InputStream inputStream2 = null;
        jSONObjectC = null;
        try {
            try {
            } catch (IOException e) {
                BranchLogger.a(e.getMessage());
            }
            if (jarFile == 0) {
                try {
                    jarFile = new JarFile(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).publicSourceDir);
                    try {
                        inputStream = jarFile.getInputStream(jarFile.getEntry("AndroidManifest.xml"));
                    } catch (Exception e2) {
                        e = e2;
                        inputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException e3) {
                                BranchLogger.a(e3.getMessage());
                                throw th;
                            }
                        }
                        if (jarFile != 0) {
                            jarFile.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e = e4;
                    jarFile = 0;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    jarFile = 0;
                }
                try {
                    byte[] bArr = new byte[inputStream.available()];
                    inputStream.read(bArr);
                    jSONObjectC = ApkParser.c(context, bArr);
                    inputStream.close();
                } catch (Exception e5) {
                    e = e5;
                    BranchLogger.a(e.getMessage());
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (jarFile != 0) {
                        jarFile.close();
                    }
                    return jSONObjectC;
                }
                jarFile.close();
            }
            return jSONObjectC;
        } catch (Throwable th3) {
            th = th3;
            inputStream2 = inputStream;
        }
    }

    public static boolean d(Context context) {
        Boolean boolValueOf;
        BranchJsonConfig branchJsonConfigA = BranchJsonConfig.a(context);
        if (branchJsonConfigA.f23851a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (branchJsonConfigA.c(BranchJsonConfig.BranchJsonKey.i)) {
            try {
                boolValueOf = Boolean.valueOf(branchJsonConfigA.f23851a.getBoolean("deferInitForPluginRuntime"));
            } catch (JSONException e) {
                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
                boolValueOf = Boolean.FALSE;
            }
        } else {
            boolValueOf = null;
        }
        return bool.equals(boolValueOf);
    }

    public static boolean e(Context context) throws IOException {
        Boolean boolValueOf;
        BranchJsonConfig branchJsonConfigA = BranchJsonConfig.a(context);
        if (branchJsonConfigA.f23851a == null) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (branchJsonConfigA.c(BranchJsonConfig.BranchJsonKey.h)) {
            try {
                boolValueOf = Boolean.valueOf(branchJsonConfigA.f23851a.getBoolean("enableLogging"));
            } catch (JSONException e) {
                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
                boolValueOf = Boolean.FALSE;
            }
        } else {
            boolValueOf = null;
        }
        return bool.equals(boolValueOf);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x008f -> B:64:0x00a2). Please report as a decompilation issue!!! */
    public static String f(Context context) {
        BranchJsonConfig branchJsonConfigA = BranchJsonConfig.a(context);
        JSONObject jSONObject = branchJsonConfigA.f23851a;
        String string = null;
        if (jSONObject != null) {
            BranchJsonConfig.BranchJsonKey branchJsonKey = BranchJsonConfig.BranchJsonKey.d;
            boolean zC = branchJsonConfigA.c(branchJsonKey);
            BranchJsonConfig.BranchJsonKey branchJsonKey2 = BranchJsonConfig.BranchJsonKey.f;
            if (zC || (branchJsonConfigA.c(branchJsonKey2) && branchJsonConfigA.c(BranchJsonConfig.BranchJsonKey.e) && branchJsonConfigA.c(BranchJsonConfig.BranchJsonKey.g))) {
                try {
                    if (branchJsonConfigA.c(branchJsonKey)) {
                        string = jSONObject.getString("branchKey");
                    } else if (branchJsonConfigA.b().booleanValue()) {
                        if (jSONObject != null) {
                            try {
                                if (jSONObject.has("testKey")) {
                                    string = jSONObject.getString("testKey");
                                }
                            } catch (JSONException e) {
                                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
                            }
                        }
                    } else if (branchJsonConfigA.c(branchJsonKey2)) {
                        try {
                            string = jSONObject.getString("liveKey");
                        } catch (JSONException e2) {
                            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e2.getMessage());
                        }
                    }
                } catch (JSONException e3) {
                    Log.e("BranchJsonConfig", "Error parsing branch.json: " + e3.getMessage());
                }
            }
        }
        if (string != null) {
            return string;
        }
        String str = f23857a ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (string = bundle.getString(str)) == null && f23857a) {
                string = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            }
        } catch (PackageManager.NameNotFoundException e4) {
            BranchLogger.a(e4.getMessage());
        }
        if (string != null) {
            return string;
        }
        Resources resources = context.getResources();
        return resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
    }

    public static void g(Context context) {
        JSONObject jSONObject = BranchJsonConfig.a(context).f23851a;
        String string = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("apiUrl")) {
                    string = jSONObject.getString("apiUrl");
                }
            } catch (JSONException e) {
                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (TextUtils.isEmpty(string)) {
            BranchLogger.f("setAPIUrl: URL cannot be empty or null");
            return;
        }
        if (!string.endsWith(q2.c)) {
            string = string.concat(q2.c);
        }
        PrefHelper.g = string;
        BranchLogger.e("setAPIUrl: Branch API URL was set to " + string);
    }

    public static void h(Context context) {
        JSONObject jSONObject = BranchJsonConfig.a(context).f23851a;
        String string = null;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("fbAppId")) {
                    string = jSONObject.getString("fbAppId");
                }
            } catch (JSONException e) {
                Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
            }
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        if (TextUtils.isEmpty(string)) {
            BranchLogger.f("setFBAppID: fbAppID cannot be empty or null");
            return;
        }
        PrefHelper.h = string;
        BranchLogger.e("setFBAppID to " + string);
    }
}
