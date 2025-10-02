package com.lexisnexisrisk.threatmetrix.rl.tmxprofiling;

import android.app.admin.DevicePolicyManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.SparseIntArray;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.jjxjxjx;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqll;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/* loaded from: classes6.dex */
public class nnlllnn {
    private static final String s0073s00730073ss = "User refuse granting permission ";
    private static final String ss007300730073ss = "getInstance";
    private static final String sss00730073ss = lqlqqll.u00750075u00750075u(nnlllnn.class);

    public static class nllllln {
        private nllllln() {
        }

        public static void f0066006600660066f0066(String str, String str2, @Nonnull SharedPreferences.Editor editor) {
            if (nlllnln.b00620062b0062b0062) {
                editor.putString(str, str2);
            }
        }

        public static long f006600660066ff0066(@Nonnull SharedPreferences sharedPreferences, String str, long j) {
            return (nlllnln.bb00620062bb0062 && nlllnln.bb0062b0062b0062) ? sharedPreferences.getLong(str, j) : j;
        }

        public static boolean f00660066f0066f0066() {
            return nlllnln.bb00620062bb0062 && nlllnln.b006200620062bb0062;
        }

        public static boolean f00660066fff0066(@Nonnull SharedPreferences sharedPreferences, @Nonnull String str) {
            if (nlllnln.bb00620062bb0062 && nlllnln.b0062006200620062b0062) {
                return sharedPreferences.contains(str);
            }
            return false;
        }

        public static void f0066f00660066f0066(String str, int i, @Nonnull SharedPreferences.Editor editor) {
            if (nlllnln.b0062b00620062b0062) {
                editor.putInt(str, i);
            }
        }

        public static int f0066f0066ff0066(@Nonnull SharedPreferences sharedPreferences, String str, int i) {
            return (nlllnln.bb00620062bb0062 && nlllnln.b0062bb0062b0062) ? sharedPreferences.getInt(str, i) : i;
        }

        @Nullable
        public static String f0066ff0066f0066(@Nonnull SharedPreferences sharedPreferences, @Nonnull String str, @Nullable String str2) {
            return (nlllnln.bb00620062bb0062 && nlllnln.bbbb0062b0062) ? sharedPreferences.getString(str, str2) : str2;
        }

        public static void ff006600660066f0066(String str, long j, @Nonnull SharedPreferences.Editor editor) {
            if (nlllnln.bbb00620062b0062) {
                editor.putLong(str, j);
            }
        }

        public static int ff00660066ff0066(@Nonnull nlllnnl nlllnnlVar, @Nonnull String str, String str2, int i) {
            return (nlllnln.bb00620062bb0062 && nlllnln.b0062bb0062b0062) ? nlllnnlVar.ww0077w007700770077.getSharedPreferences(str, 0).getInt(str2, i) : i;
        }

        @Nullable
        public static String ff0066f0066f0066(@Nonnull nlllnnl nlllnnlVar, @Nonnull String str, @Nonnull String str2, @Nullable String str3) {
            return (nlllnln.bb00620062bb0062 && nlllnln.bbbb0062b0062) ? nlllnnlVar.ww0077w007700770077.getSharedPreferences(str, 0).getString(str2, str3) : str3;
        }

        public static boolean fff00660066f0066() {
            return nlllnln.bbbb0062b0062 && nlllnln.b00620062b0062b0062;
        }

        @Nullable
        public static SharedPreferences.Editor fff0066ff0066(@Nonnull SharedPreferences sharedPreferences) {
            if (nlllnln.bb00620062bb0062 && nlllnln.b006200620062bb0062 && nlllnln.bb006200620062b0062) {
                return sharedPreferences.edit();
            }
            return null;
        }

        public static long ffff0066f0066(@Nonnull nlllnnl nlllnnlVar, @Nonnull String str, String str2, long j) {
            return (nlllnln.bb00620062bb0062 && nlllnln.bb0062b0062b0062) ? nlllnnlVar.ww0077w007700770077.getSharedPreferences(str, 0).getLong(str2, j) : j;
        }

        public static void fffff00660066(@Nonnull nlllnnl nlllnnlVar, @Nonnull String str, @Nonnull String str2, @Nonnull String str3) {
            SharedPreferences.Editor editorEdit;
            if (nlllnln.bb00620062bb0062 && nlllnln.b006200620062bb0062 && nlllnln.bb006200620062b0062 && nlllnln.b00620062b0062b0062 && (editorEdit = nlllnnlVar.ww0077w007700770077.getSharedPreferences(str, 0).edit()) != null) {
                editorEdit.putString(str2, str3);
                editorEdit.apply();
            }
        }
    }

    public static class nllllnn {

        @Nullable
        private ApplicationInfo s0073007300730073ss;

        public nllllnn(@Nonnull nlllnnl nlllnnlVar) {
            this.s0073007300730073ss = null;
            if (nnllnln.b0062b0062b0062b && nnllnln.bb00620062b0062b) {
                this.s0073007300730073ss = nlllnnlVar.ww0077w007700770077.getApplicationInfo();
            }
        }

        public String o006F006Foo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            return applicationInfo != null ? applicationInfo.nativeLibraryDir : "";
        }

        public String o006Fo006Fo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            return applicationInfo != null ? applicationInfo.sourceDir : "";
        }

        public String o006Fooo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            return applicationInfo != null ? applicationInfo.dataDir : "";
        }

        public int oo006F006Fo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            if (applicationInfo != null) {
                return applicationInfo.uid;
            }
            return -1;
        }

        public int oo006Foo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            if (applicationInfo != null) {
                return applicationInfo.flags;
            }
            return 0;
        }

        public String ooo006Fo006F006F() {
            ApplicationInfo applicationInfo = this.s0073007300730073ss;
            return applicationInfo != null ? applicationInfo.packageName : "";
        }
    }

    public static class nlllnln {
        private static final String b00620062006200620062b = "getLong";
        private static final boolean b0062006200620062b0062;
        private static final boolean b006200620062bb0062;
        private static final boolean b00620062b0062b0062;
        private static final String b00620062bbb0062 = "putString";
        private static final boolean b0062b00620062b0062;
        private static final String b0062b0062bb0062 = "contains";
        private static final boolean b0062bb0062b0062;
        private static final String b0062bbbb0062 = "putInt";
        private static final String bb0062006200620062b = "getInt";
        private static final boolean bb006200620062b0062;
        private static final boolean bb00620062bb0062;
        private static final boolean bb0062b0062b0062;
        private static final String bb0062bbb0062 = "putLong";
        private static final boolean bbb00620062b0062;
        private static final String bbb0062bb0062 = "apply";
        private static final boolean bbbb0062b0062;
        private static final String bbbbbb0062 = "getString";

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SHARED_PREFERENCES);
            bb00620062bb0062 = clsWww00770077007700770077 != null;
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SHARED_PREFERENCES_EDITOR);
            b006200620062bb0062 = clsWww007700770077007700772 != null;
            Class cls = Integer.TYPE;
            b0062bb0062b0062 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, bb0062006200620062b, String.class, cls) != null;
            Class cls2 = Long.TYPE;
            bb0062b0062b0062 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, b00620062006200620062b, String.class, cls2) != null;
            bbbb0062b0062 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, bbbbbb0062, String.class, String.class) != null;
            b0062006200620062b0062 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, b0062b0062bb0062, String.class) != null;
            b0062b00620062b0062 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, b0062bbbb0062, String.class, cls) != null;
            bbb00620062b0062 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, bb0062bbb0062, String.class, cls2) != null;
            b00620062b0062b0062 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, b00620062bbb0062, String.class, String.class) != null;
            bb006200620062b0062 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, bbb0062bb0062, new Class[0]) != null;
        }

        private nlllnln() {
        }
    }

    public static class nllnlln {

        @Nullable
        private PackageInfo bb0062b006200620062;

        public nllnlln(@Nonnull Context context, String str, int i) throws Throwable {
            this.bb0062b006200620062 = null;
            if (nnllnln.bb0062b00620062b && nnllnln.b0062bb00620062b) {
                try {
                    try {
                        this.bb0062b006200620062 = ((PackageManager) Class.forName(jxxjjxx.sss0073ss0073s("m{r\u0002\u007fzvAw\u0005\u0005\f}\b\u000fI_\r\r\u0014\u0006\u001a\u0017", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354529), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950968), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950882))).getMethod(jxxjjxx.sss0073ss0073s("\u0012\u0011!}\u0010\u0013\u001c\u0013\u001a\u0019\u0002\u0017%\u0019 \u001f-", (char) (jjxxxjx.s00730073ss0073ss() ^ 783951040), (char) (jxjxxjx.s0073sss0073ss() ^ 513829341), (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701655))), null).invoke(context, null)).getPackageInfo(str, i);
                    } catch (PackageManager.NameNotFoundException e) {
                        lqlqqll.llqqqll.uu00750075uuu(nnlllnn.sss00730073ss, "Invalid package name. {} {}", str, e.toString());
                    } catch (SecurityException e2) {
                        lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e2.toString());
                        nlnnlnl.d00640064dd0064d(e2);
                    } catch (Exception e3) {
                        lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e3.toString());
                    }
                } catch (InvocationTargetException e4) {
                    throw e4.getCause();
                }
            }
        }

        public int f0066ff00660066f() {
            PackageInfo packageInfo;
            if (!nnllnln.bbb006200620062b || (packageInfo = this.bb0062b006200620062) == null) {
                return -1;
            }
            return packageInfo.versionCode;
        }

        @Nullable
        public String ff0066f00660066f() {
            PackageInfo packageInfo;
            if (!nnllnln.b0062b006200620062b || (packageInfo = this.bb0062b006200620062) == null) {
                return null;
            }
            return packageInfo.versionName;
        }
    }

    public static class nllnnln {
        private static final String b006200620062bbb = "getStorageEncryptionStatus";

        @Nonnull
        private static final SparseIntArray b0062bb0062bb;
        public static final boolean bbbb0062bb;

        public static class nnnlnln {
            public static final int b0062006200620062bb = 32;
            public static final int b00620062b0062bb = 2;
            public static final int b0062b00620062bb = 8;
            public static final int bb006200620062bb = 16;
            public static final int bb0062b0062bb = 1;
            public static final int bbb00620062bb = 4;
            public static final int bbbbb0062b = 64;

            private nnnlnln() {
            }
        }

        static {
            SparseIntArray sparseIntArray = new SparseIntArray(6);
            b0062bb0062bb = sparseIntArray;
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.DEVICE_POLICY_MANAGER);
            bbbb0062bb = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, b006200620062bbb, new Class[0]) != null;
            Object objS00730073sssss = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_UNSUPPORTED", null);
            if (objS00730073sssss != null) {
                sparseIntArray.put(((Integer) objS00730073sssss).intValue(), 1);
            }
            Object objS00730073sssss2 = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_INACTIVE", null);
            if (objS00730073sssss2 != null) {
                sparseIntArray.put(((Integer) objS00730073sssss2).intValue(), 2);
            }
            Object objS00730073sssss3 = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_ACTIVATING", null);
            if (objS00730073sssss3 != null) {
                sparseIntArray.put(((Integer) objS00730073sssss3).intValue(), 4);
            }
            Object objS00730073sssss4 = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_ACTIVE", null);
            if (objS00730073sssss4 != null) {
                sparseIntArray.put(((Integer) objS00730073sssss4).intValue(), 8);
            }
            Object objS00730073sssss5 = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_ACTIVE_DEFAULT_KEY", null);
            if (objS00730073sssss5 != null) {
                sparseIntArray.put(((Integer) objS00730073sssss5).intValue(), 32);
            }
            Object objS00730073sssss6 = jjxjxjx.s00730073sssss(clsWww00770077007700770077, "ENCRYPTION_STATUS_ACTIVE_PER_USER", null);
            if (objS00730073sssss6 != null) {
                sparseIntArray.put(((Integer) objS00730073sssss6).intValue(), 64);
            }
        }

        private nllnnln() {
        }

        public static int oooo006F006F006F(Context context) {
            if (!bbbb0062bb) {
                return 16;
            }
            try {
                Object systemService = context.getSystemService("device_policy");
                if (!(systemService instanceof DevicePolicyManager)) {
                    return 16;
                }
                int i = b0062bb0062bb.get(((DevicePolicyManager) systemService).getStorageEncryptionStatus());
                if (i != 0) {
                    return i;
                }
                return 16;
            } catch (SecurityException e) {
                lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e.toString());
                nlnnlnl.d00640064dd0064d(e);
                return 16;
            } catch (Exception e2) {
                lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e2.toString());
                return 16;
            }
        }
    }

    public static class nlnllln {
        private static final String b0062b0062006200620062 = "isScreenOn";
        private static final boolean bb00620062006200620062;
        private static final String bbb0062006200620062 = "isInteractive";
        private static final boolean w0077wwwww;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.POWER_MANAGER);
            bb00620062006200620062 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, bbb0062006200620062, new Class[0]) != null;
            w0077wwwww = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, b0062b0062006200620062, new Class[0]) != null;
        }

        private nlnllln() {
        }

        public static boolean f00660066006600660066f() {
            return w0077wwwww;
        }

        public static boolean ff0066006600660066f() {
            return bb00620062006200620062;
        }
    }

    public static class nlnlnln {
        private static final boolean b00620062bb0062b;
        private static final boolean b0062bbb0062b;
        private static final boolean bb0062bb0062b;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CERTIFICATE);
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_PAIR);
            Class clsWww007700770077007700773 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY);
            Class clsWww007700770077007700774 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_STORE);
            Class clsWww007700770077007700775 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.LOAD_STORE_PARAM);
            Class clsWww007700770077007700776 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PROTECTION_PARAM);
            Class clsWww007700770077007700777 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_ENTRY);
            Class clsWww007700770077007700778 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PRIVATE_KEY_ENTRY);
            Class clsWww007700770077007700779 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PRIVATE_KEY);
            Class clsWww0077007700770077007710 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_PAIR_GENERATOR);
            Class clsWww0077007700770077007711 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.ALG_PARAMETER_SPEC);
            Class clsWww0077007700770077007712 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_CHAIN);
            Class clsWww0077007700770077007713 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SIGNATURE);
            Class clsWww0077007700770077007714 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_PROPERTIES);
            Class clsWww0077007700770077007715 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_PAIR_GEN_SPEC);
            Class clsWww0077007700770077007716 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_PAIR_GEN_SPEC_BUILDER);
            Class clsWww0077007700770077007717 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.X_500_PRINCIPAL);
            Class clsWww0077007700770077007718 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_GEN_PARAM_SPEC);
            Class clsWww0077007700770077007719 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_GEN_PARAM_SPEC_BUILDER);
            Class clsWww0077007700770077007720 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_FACTORY);
            Class clsWww0077007700770077007721 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.KEY_INFO);
            boolean z = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, nnlllnn.ss007300730073ss, String.class) != null;
            boolean z2 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "load", clsWww007700770077007700775) != null;
            boolean z3 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "getEntry", String.class, clsWww007700770077007700776) != null;
            boolean z4 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "getCertificate", String.class) != null;
            boolean z5 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "getCreationDate", String.class) != null;
            boolean z6 = jjxjxjx.ss00730073ssss(clsWww007700770077007700778, "getPrivateKey", new Class[0]) != null;
            boolean z7 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "getAlgorithm", new Class[0]) != null;
            boolean z8 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getPrivate", new Class[0]) != null;
            boolean z9 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getPublic", new Class[0]) != null;
            boolean z10 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getPublicKey", new Class[0]) != null;
            boolean z11 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007710, "generateKeyPair", new Class[0]) != null;
            boolean z12 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007710, nnlllnn.ss007300730073ss, String.class, String.class) != null;
            boolean z13 = z10;
            boolean z14 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007710, "initialize", clsWww0077007700770077007711) != null;
            boolean z15 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007713, nnlllnn.ss007300730073ss, String.class) != null;
            boolean z16 = z14;
            boolean z17 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007713, "initSign", clsWww007700770077007700779) != null;
            boolean z18 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007713, "update", byte[].class) != null;
            boolean z19 = z9;
            boolean z20 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007713, "sign", new Class[0]) != null;
            boolean z21 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007712, "isKeyAlgorithmSupported", String.class) != null;
            boolean z22 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setAlias", String.class) != null;
            boolean z23 = z20;
            boolean z24 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setSubject", clsWww0077007700770077007717) != null;
            boolean z25 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setSerialNumber", BigInteger.class) != null;
            boolean z26 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setStartDate", Date.class) != null;
            boolean z27 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setEndDate", Date.class) != null;
            boolean z28 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007716, "setKeyType", String.class) != null;
            boolean z29 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007712, "isBoundKeyAlgorithm", String.class) != null;
            boolean z30 = z28;
            boolean z31 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007719, "setDigests", String[].class) != null;
            boolean z32 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007719, "setSignaturePaddings", String[].class) != null;
            boolean z33 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007720, nnlllnn.ss007300730073ss, String.class, String.class) != null;
            boolean z34 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007720, "getKeySpec", clsWww007700770077007700773, Class.class) != null;
            boolean z35 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007721, "isInsideSecureHardware", new Class[0]) != null;
            boolean z36 = z31;
            boolean z37 = jjxjxjx.ss00730073ssss(clsWww0077007700770077007721, "getOrigin", new Class[0]) != null;
            boolean z38 = jjxjxjx.ww007700770077007700770077(clsWww0077007700770077007714, "PURPOSE_SIGN") != null;
            boolean z39 = jjxjxjx.ww007700770077007700770077(clsWww0077007700770077007714, "PURPOSE_ENCRYPT") != null;
            boolean z40 = z37;
            boolean z41 = jjxjxjx.ww007700770077007700770077(clsWww0077007700770077007714, "DIGEST_SHA256") != null;
            boolean z42 = jjxjxjx.ww007700770077007700770077(clsWww0077007700770077007714, "SIGNATURE_PADDING_RSA_PKCS1") != null;
            boolean z43 = jjxjxjx.ww007700770077007700770077(clsWww0077007700770077007714, "ORIGIN_GENERATED") != null;
            boolean z44 = clsWww007700770077007700777 != null && clsWww007700770077007700778 != null && clsWww007700770077007700779 != null && z && z2 && z3 && z6 && z4 && z5 && z7 && z8 && z19 && z13 && z11 && z12 && z16 && z21;
            b00620062bb0062b = z15 && z17 && z18 && z23;
            b0062bbb0062b = z44 && clsWww0077007700770077007715 != null && z22 && z24 && z25 && z26 && z27 && z30 && z29;
            bb0062bb0062b = nnnnnln.nlnnnln.ss00730073ss0073 >= 23 && z44 && clsWww0077007700770077007718 != null && z36 && z32 && z33 && z34 && z35 && z40 && z38 && z39 && z41 && z42 && z43;
        }

        private nlnlnln() {
        }

        public static boolean o006F006Fo006F006F006F() {
            return bb0062bb0062b;
        }

        public static boolean o006Foo006F006F006F() {
            return b00620062bb0062b;
        }

        public static boolean oo006Fo006F006F006F() {
            return b0062bbb0062b;
        }

        public static boolean ooo006F006F006F006F() {
            return b0062bbb0062b || bb0062bb0062b;
        }
    }

    public static class nlnnlln {
        private static final boolean b006200620062b00620062;
        private static final boolean b00620062bb00620062;
        private static final boolean b0062b0062b00620062;
        private static final boolean bb00620062b00620062;
        private static final boolean bb0062bb00620062;
        private static final boolean bbb0062b00620062;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CONNECTIVITY_MANAGER);
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.NETWORK_INFO);
            Class clsWww007700770077007700773 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.WIFI_INFO);
            Class clsWww007700770077007700774 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.WIFI_MANAGER);
            Class clsWww007700770077007700775 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.STATE);
            boolean z = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getActiveNetworkInfo", new Class[0]) != null;
            boolean z2 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getState", new Class[0]) != null;
            boolean z3 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getType", new Class[0]) != null;
            boolean z4 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getExtraInfo", new Class[0]) != null;
            boolean z5 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "getBSSID", new Class[0]) != null;
            boolean z6 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "getSSID", new Class[0]) != null;
            boolean z7 = jjxjxjx.ss00730073ssss(clsWww007700770077007700773, "getRssi", new Class[0]) != null;
            boolean z8 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "getConnectionInfo", new Class[0]) != null;
            boolean z9 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "isConnectedOrConnecting", new Class[0]) != null;
            boolean z10 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "CONNECTIVITY_ACTION") != null;
            boolean z11 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TYPE_MOBILE") != null;
            boolean z12 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TYPE_WIFI") != null;
            boolean z13 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TYPE_BLUETOOTH") != null;
            boolean z14 = z9;
            boolean z15 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TYPE_ETHERNET") != null;
            boolean z16 = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700774, "NETWORK_STATE_CHANGED_ACTION") != null;
            boolean z17 = z15;
            boolean z18 = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700775, "CONNECTED") != null;
            bb0062bb00620062 = z && z14;
            boolean z19 = z18;
            boolean z20 = jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "getScanResults", new Class[0]) != null;
            bb00620062b00620062 = z20;
            b006200620062b00620062 = z20 && jjxjxjx.ss00730073ssss(clsWww007700770077007700774, "startScan", new Class[0]) != null;
            b00620062bb00620062 = z10 && z19 && z2 && z4 && z3 && z11 && z12 && z17 && z13;
            bbb0062b00620062 = z16 && z19 && z5 && z6 && z7 && z2 && z4;
            b0062b0062b00620062 = z8 && z5 && z6 && z7;
        }

        private nlnnlln() {
        }

        public static boolean f006600660066f0066f() {
            return bb0062bb00620062;
        }

        public static boolean f00660066ff0066f() {
            return bbb0062b00620062;
        }

        public static boolean f0066f0066f0066f() {
            return b006200620062b00620062;
        }

        public static boolean ff00660066f0066f() {
            return bb00620062b00620062;
        }

        public static boolean ff0066ff0066f() {
            return b00620062bb00620062;
        }

        public static boolean fff0066f0066f() {
            return b0062b0062b00620062;
        }
    }

    public static class nlnnnnl {
        private static final boolean w00770077w00770077w;
        private static final boolean w0077w007700770077w;
        private static final String w0077ww00770077w = "elapsedRealtime";
        private static final String ww0077w00770077w = "elapsedRealtimeNanos";
        private static final boolean www007700770077w;
        private static final String wwww00770077w = "uptimeMillis";

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SYSTEM_CLOCK);
            w00770077w00770077w = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, wwww00770077w, new Class[0]) != null;
            www007700770077w = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, w0077ww00770077w, new Class[0]) != null;
            w0077w007700770077w = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, ww0077w00770077w, new Class[0]) != null;
        }

        private nlnnnnl() {
        }

        public static long f00660066ff00660066() {
            if (w00770077w00770077w) {
                return SystemClock.uptimeMillis();
            }
            return 0L;
        }

        public static long f0066fff00660066() throws Throwable {
            if (!www007700770077w) {
                return 0L;
            }
            try {
                return ((Long) Class.forName(jxxjjxx.sss0073ss0073s("/;0=92,t58q\u0016;44$+\u007f(*\u001d$", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701632)), (char) (jxjxxjx.s0073sss0073ss() ^ 513829214), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950884))).getMethod(jxxjjxx.ss0073sss0073s("NTHVXIG4FAKRFI@", (char) (jxxxxjx.sss0073s0073ss() ^ 1457354616), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950883)), null).invoke(null, null)).longValue();
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        }

        public static boolean ff0066ff00660066() {
            return w0077w007700770077w;
        }
    }

    public static class nnlllln {
        private static final boolean w0077007700770077ww;
        public static final String w007700770077www = "android_id";
        public static final String w00770077w0077ww = "bluetooth_name";
        private static final boolean w00770077ww0077w;
        private static final String w00770077wwww = "ANDROID_ID";
        private static final boolean w0077w00770077ww;
        private static final boolean w0077w0077w0077w;
        private static final String w0077w0077www = "ADB_ENABLED";
        public static final String w0077ww0077ww = "adb_enabled";
        private static final boolean w0077www0077w;
        private static final boolean ww007700770077ww;
        private static final String ww00770077www = "DEVELOPMENT_SETTINGS_ENABLED";
        public static final String ww0077w0077ww = "device_name";
        private static final boolean ww0077ww0077w;
        private static final String ww0077wwww = "getString";
        public static final String www00770077ww = "development_settings_enabled";
        private static final boolean www0077w0077w;
        private static final String www0077www = "ALLOW_MOCK_LOCATION";
        public static final String wwww0077ww = "mock_location";
        private static final boolean wwwww0077w;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SETTING_SECURE);
            w0077w00770077ww = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, ww0077wwww, ContentResolver.class, String.class) != null;
            ww007700770077ww = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, w00770077wwww) != null;
            w0077007700770077ww = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, www0077www) != null;
            wwwww0077w = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, w0077w0077www) != null;
            w0077www0077w = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, ww00770077www) != null;
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SETTING_GLOBAL);
            ww0077ww0077w = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, ww0077wwww, ContentResolver.class, String.class) != null;
            w00770077ww0077w = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700772, w0077w0077www) != null;
            www0077w0077w = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700772, ww00770077www) != null;
            w0077w0077w0077w = jjxjxjx.ss00730073ssss(jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SETTING_SYSTEM), ww0077wwww, ContentResolver.class, String.class) != null;
        }

        private nnlllln() {
        }

        @Nullable
        public static String f0066ffff0066(@Nullable ContentResolver contentResolver, String str) {
            if (contentResolver != null && !llqllqq.ggggggg0067(str) && ww0077ww0077w) {
                try {
                    if (w0077ww0077ww.equals(str) && w00770077ww0077w) {
                        return Settings.Global.getString(contentResolver, w0077ww0077ww);
                    }
                    if (www00770077ww.equals(str) && www0077w0077w) {
                        return Settings.Global.getString(contentResolver, www00770077ww);
                    }
                } catch (SecurityException e) {
                    lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e);
                    nlnnlnl.d00640064dd0064d(e);
                } catch (Exception e2) {
                    lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, e2.toString());
                }
            }
            return null;
        }

        @Nullable
        public static String ff0066fff0066(@Nullable ContentResolver contentResolver, String str) {
            if (contentResolver != null && !llqllqq.ggggggg0067(str) && w0077w00770077ww) {
                try {
                    String string = Settings.Secure.getString(contentResolver, str);
                    if (string != null) {
                        return string;
                    }
                    if (w007700770077www.equals(str) && ww007700770077ww) {
                        return Settings.Secure.getString(contentResolver, w007700770077www);
                    }
                    if (wwww0077ww.equals(str) && w0077007700770077ww) {
                        return Settings.Secure.getString(contentResolver, wwww0077ww);
                    }
                    if (w0077ww0077ww.equals(str) && wwwww0077w) {
                        return Settings.Secure.getString(contentResolver, w0077ww0077ww);
                    }
                    if (www00770077ww.equals(str) && w0077www0077w) {
                        return Settings.Secure.getString(contentResolver, www00770077ww);
                    }
                } catch (SecurityException e) {
                    lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e.toString());
                    nlnnlnl.d00640064dd0064d(e);
                } catch (Exception e2) {
                    lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e2.toString());
                }
            }
            return null;
        }

        public static String ffffff0066(@Nullable ContentResolver contentResolver) {
            if (contentResolver != null && (ww0077ww0077w || w0077w00770077ww || w0077w0077w0077w)) {
                try {
                    String string = Settings.System.getString(contentResolver, ww0077w0077ww);
                    if (string != null) {
                        return string;
                    }
                } catch (RuntimeException e) {
                    lqlqqll.llqqqll.u0075uuuuu(nnlllnn.sss00730073ss, "Exception in accessing settings for device name {}", e.toString());
                }
                try {
                    String string2 = Settings.Secure.getString(contentResolver, w00770077w0077ww);
                    if (string2 != null) {
                        return string2;
                    }
                } catch (RuntimeException e2) {
                    lqlqqll.llqqqll.u0075uuuuu(nnlllnn.sss00730073ss, "Exception in accessing settings for bluetooth name {}", e2.toString());
                }
                try {
                    String string3 = Settings.Global.getString(contentResolver, ww0077w0077ww);
                    if (string3 != null) {
                        return string3;
                    }
                } catch (RuntimeException e3) {
                    lqlqqll.llqqqll.u0075uuuuu(nnlllnn.sss00730073ss, "Exception in accessing settings for device name {}", e3.toString());
                }
            }
            return null;
        }
    }

    public static class nnllnln {
        public static final int b006200620062b0062b;
        private static final boolean b00620062b00620062b;
        private static final boolean b0062b006200620062b;
        private static final boolean b0062b0062b0062b;
        private static final boolean b0062bb00620062b;
        private static final boolean bb00620062b0062b;
        private static final boolean bb0062b00620062b;
        private static final boolean bbb006200620062b;
        private static final String bbb0062b0062b = "checkPermission";
        public static final int bbbb00620062b;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PACKAGE_MANAGER);
            b0062bb00620062b = clsWww00770077007700770077 != null;
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PACKAGE_INFO);
            bb0062b00620062b = clsWww007700770077007700772 != null;
            b00620062b00620062b = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, bbb0062b0062b, String.class, String.class) != null;
            bbb006200620062b = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700772, "versionCode") != null;
            b0062b006200620062b = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700772, "versionName") != null;
            b0062b0062b0062b = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.APPLICATION_INFO) != null;
            bb00620062b0062b = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.PACKAGE_ITEM_INFO) != null;
            b006200620062b0062b = 1;
            bbbb00620062b = 128;
        }

        private nnllnln() {
        }
    }

    public static class nnlnlln {
        private static final String bbbb006200620062 = "stat";

        @Nullable
        public static final Method b0062bb006200620062 = jjxjxjx.ss00730073ssss(jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.SYSTEM_OS), bbbb006200620062, String.class);

        private nnlnlln() {
        }

        public static long ffff00660066f(String str) {
            Object objS0073ss0073sss;
            Method method = b0062bb006200620062;
            if (method == null || (objS0073ss0073sss = jjxjxjx.s0073ss0073sss(null, method, str)) == null) {
                return 0L;
            }
            Field field = nnnnnnl.ww00770077w0077w;
            Object objSsss0073sss = field != null ? jjxjxjx.ssss0073sss(objS0073ss0073sss, field) : objSsss0073sss;
            Field field2 = nnnnnnl.w007700770077w0077w;
            objSsss0073sss = field2 != null ? jjxjxjx.ssss0073sss(objS0073ss0073sss, field2) : 0;
            long jLongValue = objSsss0073sss instanceof Long ? ((Long) objSsss0073sss).longValue() : 0L;
            if (objSsss0073sss instanceof Long) {
                Long l = (Long) objSsss0073sss;
                if (l.longValue() < jLongValue) {
                    return l.longValue();
                }
            }
            return jLongValue;
        }
    }

    public static class nnlnnnl {

        @Nullable
        private static final Class<?> w00770077007700770077w;
        private static final boolean w007700770077ww0077;

        @Nullable
        private static final Class<?> w00770077www0077;
        private static final boolean w0077w0077ww0077;

        @Nullable
        private static final Class<?> w0077wwww0077;

        @Nullable
        private static final Class<?> ww0077007700770077w;
        private static final boolean ww00770077ww0077;

        @Nullable
        private static final Class<?> ww0077www0077;
        private static final boolean www0077ww0077;
        private static final boolean wwww0077w0077;

        @Nullable
        private static final Class<?> wwwwww0077;

        static {
            Class<?> clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.TELEPHONY_MANAGER);
            ww0077007700770077w = clsWww00770077007700770077;
            www0077ww0077 = fff0066f00660066(jjxjxjx.jxxjxjx.CELL_INFO_CDMA, jjxjxjx.jxxjxjx.CELL_IDENTITY_CDMA);
            w0077w0077ww0077 = fff0066f00660066(jjxjxjx.jxxjxjx.CELL_INFO_GSM, jjxjxjx.jxxjxjx.CELL_IDENTITY_GSM);
            ww00770077ww0077 = fff0066f00660066(jjxjxjx.jxxjxjx.CELL_INFO_LTE, jjxjxjx.jxxjxjx.CELL_IDENTITY_LTE);
            w007700770077ww0077 = fff0066f00660066(jjxjxjx.jxxjxjx.CELL_INFO_WCDMA, jjxjxjx.jxxjxjx.CELL_IDENTITY_WCDMA);
            w00770077007700770077w = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CELL_INFO);
            wwwwww0077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CELL_SIGNAL_STRENGTH);
            w0077wwww0077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.NEIGHBOR_CELL_INFO);
            ww0077www0077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CDMA_CELL_LOCATION);
            w00770077www0077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.GSM_CELL_LOCATION);
            boolean z = false;
            if (jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CELL_LOCATION) != null && jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getCellLocation", new Class[0]) != null) {
                z = true;
            }
            wwww0077w0077 = z;
        }

        private nnlnnnl() {
        }

        public static boolean f006600660066f00660066() {
            return ww00770077ww0077;
        }

        public static boolean f00660066f006600660066() {
            Class<?> cls = ww0077007700770077w;
            return (cls == null || jjxjxjx.ss00730073ssss(cls, "getDataState", new Class[0]) == null || jjxjxjx.ww007700770077007700770077(cls, "DATA_CONNECTED") == null || jjxjxjx.ww007700770077007700770077(cls, "DATA_CONNECTING") == null || jjxjxjx.ww007700770077007700770077(cls, "DATA_SUSPENDED") == null) ? false : true;
        }

        public static boolean f0066f0066006600660066() {
            Class<?> cls = ww0077007700770077w;
            return (cls == null || jjxjxjx.ss00730073ssss(cls, "getNetworkOperator", new Class[0]) == null || jjxjxjx.ss00730073ssss(cls, "getNetworkCountryIso", new Class[0]) == null || jjxjxjx.w0077w00770077007700770077(cls, "getNetworkOperatorName", new Class[0]) == null) ? false : true;
        }

        public static boolean f0066f0066f00660066() {
            return www0077ww0077;
        }

        public static boolean f0066ff006600660066() {
            if (wwww0077w0077) {
                Class<?> cls = ww0077www0077;
                if (jjxjxjx.ss00730073ssss(cls, "getSystemId", new Class[0]) != null && jjxjxjx.ss00730073ssss(cls, "getBaseStationId", new Class[0]) != null && jjxjxjx.ss00730073ssss(cls, "getBaseStationLatitude", new Class[0]) != null && jjxjxjx.ss00730073ssss(cls, "getBaseStationLongitude", new Class[0]) != null) {
                    return true;
                }
            }
            return false;
        }

        public static boolean ff00660066006600660066() {
            Class<?> cls;
            Class<?> cls2 = ww0077007700770077w;
            return (cls2 == null || wwwwww0077 == null || (cls = w00770077007700770077w) == null || jjxjxjx.ss00730073ssss(cls, "isRegistered", new Class[0]) == null || jjxjxjx.ss00730073ssss(cls2, "getAllCellInfo", new Class[0]) == null) ? false : true;
        }

        public static boolean ff00660066f00660066() {
            return w0077w0077ww0077;
        }

        public static boolean ff0066f006600660066() {
            if (wwww0077w0077) {
                Class<?> cls = w00770077www0077;
                if (jjxjxjx.ss00730073ssss(cls, "getCid", new Class[0]) != null && jjxjxjx.ss00730073ssss(cls, "getLac", new Class[0]) != null && jjxjxjx.ss00730073ssss(cls, "getPsc", new Class[0]) != null) {
                    return true;
                }
            }
            return false;
        }

        public static boolean fff0066006600660066() {
            Class<?> cls = w0077wwww0077;
            return (cls == null || jjxjxjx.ss00730073ssss(cls, "getCid", new Class[0]) == null || jjxjxjx.ss00730073ssss(cls, "getRssi", new Class[0]) == null) ? false : true;
        }

        private static boolean fff0066f00660066(@Nonnull jjxjxjx.jxxjxjx jxxjxjxVar, @Nonnull jjxjxjx.jxxjxjx jxxjxjxVar2) {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jxxjxjxVar);
            return (jjxjxjx.www00770077007700770077(jxxjxjxVar2) == null || jjxjxjx.w0077w00770077007700770077(clsWww00770077007700770077, "getCellSignalStrength", new Class[0]) == null || jjxjxjx.w0077w00770077007700770077(clsWww00770077007700770077, "getCellIdentity", new Class[0]) == null) ? false : true;
        }

        public static boolean ffff006600660066() {
            return w007700770077ww0077;
        }
    }

    public static class nnnllln {

        @Nullable
        private PackageManager b00620062b006200620062;

        public nnnllln(@Nonnull Context context) throws Throwable {
            this.b00620062b006200620062 = null;
            if (nnllnln.b0062bb00620062b) {
                try {
                    try {
                        this.b00620062b006200620062 = (PackageManager) Class.forName(jxxjjxx.ss0073sss0073s("YeZgc\\V\u001fcnlqain'+VTYI[V", (char) (jjxxxjx.s00730073ss0073ss() ^ 783950928), (char) (jxjxxjx.s0073sss0073ss() ^ 513829277))).getMethod(jxxjjxx.ss0073sss0073s("NKY4DELAFC*=I;@=I", (char) (jjjxxjx.s0073s00730073sss() ^ (-1787701594)), (char) (jjxxxjx.s00730073ss0073ss() ^ 783950895)), null).invoke(context, null);
                    } catch (InvocationTargetException e) {
                        throw e.getCause();
                    }
                } catch (SecurityException e2) {
                    lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e2.toString());
                    nlnnlnl.d00640064dd0064d(e2);
                } catch (Exception e3) {
                    lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e3.toString());
                }
            }
        }

        public boolean f00660066f00660066f() {
            return nnllnln.b0062bb00620062b && nnllnln.b0062b0062b0062b && this.b00620062b006200620062 != null;
        }

        public boolean f0066f006600660066f(String str, int i) throws PackageManager.NameNotFoundException {
            PackageManager packageManager;
            if (!nnllnln.b0062bb00620062b || !nnllnln.bb0062b00620062b || (packageManager = this.b00620062b006200620062) == null) {
                return false;
            }
            try {
                packageManager.getPackageInfo(str, i);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                lqlqqll.llqqqll.uu00750075uuu(nnlllnn.sss00730073ss, "Invalid package name. {} {}", str, e);
                return false;
            } catch (SecurityException e2) {
                lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e2.toString());
                nlnnlnl.d00640064dd0064d(e2);
                return false;
            } catch (Exception e3) {
                lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e3.toString());
                return false;
            }
        }

        public boolean fff006600660066f(String str, String str2) {
            PackageManager packageManager;
            boolean z = false;
            if (nnllnln.b00620062b00620062b && (packageManager = this.b00620062b006200620062) != null) {
                try {
                    if (packageManager.checkPermission(str, str2) == 0) {
                        z = true;
                    }
                } catch (SecurityException e) {
                    lqlqqll.llqqqll.yy00790079007900790079(nnlllnn.sss00730073ss, nnlllnn.s0073s00730073ss + e.toString());
                    nlnnlnl.d00640064dd0064d(e);
                } catch (Exception e2) {
                    lqlqqll.uuu007500750075u(nnlllnn.sss00730073ss, e2.toString());
                }
            }
            if (!z) {
                nlnnlnl.d0064d0064d0064d(str);
            }
            return z;
        }
    }

    public static class nnnnlln {
        private static final boolean b0062bbb00620062;
        private static final boolean bbbbb00620062;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.CRITERIA);
            Class clsWww007700770077007700772 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.LOCATION);
            Class clsWww007700770077007700773 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.LOCATION_PROVIDER);
            Class clsWww007700770077007700774 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.LOCATION_LISTENER);
            Class cls = Integer.TYPE;
            boolean z = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setAccuracy", cls) != null;
            Class cls2 = Boolean.TYPE;
            boolean z2 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setAltitudeRequired", cls2) != null;
            boolean z3 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setBearingAccuracy", cls) != null;
            boolean z4 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setCostAllowed", cls2) != null;
            boolean z5 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setSpeedAccuracy", cls) != null;
            boolean z6 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setSpeedRequired", cls2) != null;
            boolean z7 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setVerticalAccuracy", cls) != null;
            boolean z8 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "setPowerRequirement", cls) != null;
            boolean z9 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getTime", new Class[0]) != null;
            boolean z10 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getProvider", new Class[0]) != null;
            boolean z11 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getAccuracy", new Class[0]) != null;
            boolean z12 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getLatitude", new Class[0]) != null;
            boolean z13 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getLongitude", new Class[0]) != null;
            boolean z14 = jjxjxjx.ss00730073ssss(clsWww007700770077007700772, "getAltitude", new Class[0]) != null;
            boolean z15 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "NO_REQUIREMENT") != null;
            boolean z16 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "POWER_LOW") != null;
            boolean z17 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "ACCURACY_LOW") != null;
            boolean z18 = z14;
            boolean z19 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "ACCURACY_COARSE") != null;
            boolean z20 = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700773, "AVAILABLE") != null;
            boolean z21 = z19;
            boolean z22 = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700773, "TEMPORARILY_UNAVAILABLE") != null;
            boolean z23 = jjxjxjx.ww007700770077007700770077(clsWww007700770077007700773, "OUT_OF_SERVICE") != null;
            bbbbb00620062 = z && z2 && z3 && z4 && z5 && z6 && z7 && z8 && z15 && z16 && z17 && z21;
            b0062bbb00620062 = clsWww007700770077007700774 != null && z9 && z10 && z12 && z13 && z18 && z11 && z20 && z22 && z23;
        }

        private nnnnlln() {
        }

        public static boolean f0066fff0066f() {
            return b0062bbb00620062;
        }

        public static boolean fffff0066f() {
            return bbbbb00620062;
        }
    }

    public static class nnnnnln {

        @Nullable
        public static final String s00730073007300730073s;

        @Nullable
        public static final String s007300730073s0073s;

        @Nullable
        public static final String s00730073s00730073s;

        @Nullable
        public static final String s00730073ss0073s;

        @Nullable
        private static final Class<?> s00730073sss0073;

        @Nullable
        public static final String s0073s007300730073s;

        @Nullable
        public static final String s0073s0073s0073s;

        @Nullable
        public static final String s0073ss00730073s;

        @Nullable
        public static final String s0073sss0073s;

        @Nullable
        public static final Method s0073ssss0073;

        @Nullable
        public static final String ss0073007300730073s;

        @Nullable
        public static final String ss00730073s0073s;

        @Nullable
        public static final String ss0073s00730073s;

        @Nullable
        public static final String ss0073ss0073s;

        @Nullable
        public static final Field ss0073sss0073;

        @Nullable
        public static final String sss007300730073s;

        @Nullable
        public static final String sss0073s0073s;

        @Nullable
        public static final String ssss00730073s;
        public static final long sssss0073s;

        @Nullable
        public static final String[] ssssss0073;

        public static class nlnnnln {
            public static final String s007300730073ss0073;

            @Nullable
            public static final String s0073s0073ss0073;
            public static final int ss00730073ss0073;

            @Nullable
            public static final String sss0073ss0073;
            public static final Field ssss0073s0073;

            static {
                Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.VERSION);
                sss0073ss0073 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "RELEASE") != null ? Build.VERSION.RELEASE : null;
                ss00730073ss0073 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "SDK_INT") != null ? Build.VERSION.SDK_INT : -1;
                s0073s0073ss0073 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "CODENAME") != null ? Build.VERSION.CODENAME : null;
                Field fieldWw007700770077007700770077 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "SECURITY_PATCH");
                ssss0073s0073 = fieldWw007700770077007700770077;
                s007300730073ss0073 = fieldWw007700770077007700770077 != null ? (String) jjxjxjx.ssss0073sss(null, fieldWw007700770077007700770077) : null;
            }

            private nlnnnln() {
            }
        }

        public static class nnlnnln {
            public static final int b00620062bbbb;
            public static final int b0062b0062bbb;
            public static final int b0062bbbbb;

            @Nullable
            private static final Class<?> bb00620062bbb;
            public static final int bb0062bbbb;
            public static final int bbb0062bbb;
            public static final int s0073007300730073s0073;
            public static final int s007300730073s00730073;
            public static final int s00730073s007300730073;
            public static final int s00730073s0073s0073;
            public static final int s00730073ss00730073;
            public static final int s0073s0073007300730073;
            public static final int s0073s00730073s0073;
            public static final int s0073s0073s00730073;
            public static final int s0073ss007300730073;
            public static final int s0073ss0073s0073;
            public static final int s0073sss00730073;
            public static final int ss00730073007300730073;
            public static final int ss007300730073s0073;
            public static final int ss00730073s00730073;
            public static final int ss0073s007300730073;
            public static final int ss0073s0073s0073;
            public static final int ss0073ss00730073;
            public static final int sss0073007300730073;
            public static final int sss00730073s0073;
            public static final int sss0073s00730073;
            public static final int ssss007300730073;
            public static final int sssss00730073;

            static {
                Class<?> clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.VERSION_CODES);
                bb00620062bbb = clsWww00770077007700770077;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "FROYO");
                s0073ss0073s0073 = 8;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "GINGERBREAD");
                ss0073s0073s0073 = 9;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "GINGERBREAD_MR1");
                s00730073s0073s0073 = 10;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "HONEYCOMB");
                sss00730073s0073 = 11;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "HONEYCOMB_MR1");
                s0073s00730073s0073 = 12;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "HONEYCOMB_MR2");
                ss007300730073s0073 = 13;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "ICE_CREAM_SANDWICH");
                s0073007300730073s0073 = 14;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "ICE_CREAM_SANDWICH_MR1");
                sssss00730073 = 15;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "JELLY_BEAN");
                s0073sss00730073 = 16;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "JELLY_BEAN_MR1");
                ss0073ss00730073 = 17;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "JELLY_BEAN_MR2");
                s00730073ss00730073 = 18;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "KITKAT");
                sss0073s00730073 = 19;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "KITKAT_WATCH");
                s0073s0073s00730073 = 20;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "LOLLIPOP");
                ss00730073s00730073 = 21;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "LOLLIPOP_MR1");
                s007300730073s00730073 = 22;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "M");
                ssss007300730073 = 23;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "N");
                s0073ss007300730073 = 24;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "N_MR1");
                ss0073s007300730073 = 25;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "O");
                s00730073s007300730073 = 26;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "O_MR1");
                sss0073007300730073 = 27;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "P");
                s0073s0073007300730073 = 28;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "Q");
                ss00730073007300730073 = 29;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "R");
                b0062bbbbb = 30;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "S");
                bb0062bbbb = 31;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "S_V2");
                b00620062bbbb = 32;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TIRAMISU");
                bbb0062bbb = 33;
                jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "UPSIDE_DOWN_CAKE");
                b0062b0062bbb = 34;
            }

            private nnlnnln() {
            }
        }

        static {
            Class<?> clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.BUILD);
            s00730073sss0073 = clsWww00770077007700770077;
            s0073ssss0073 = jjxjxjx.ss00730073ssss(clsWww00770077007700770077, "getSerial", new Class[0]);
            Field fieldWw007700770077007700770077 = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "SUPPORTED_ABIS");
            ss0073sss0073 = fieldWw007700770077007700770077;
            sssss0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TIME") != null ? Build.TIME : Long.MAX_VALUE;
            s0073sss0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, CredentialProviderBaseController.TYPE_TAG) != null ? Build.TYPE : null;
            ss0073ss0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "TAGS") != null ? Build.TAGS : null;
            s00730073ss0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "HOST") != null ? Build.HOST : null;
            sss0073s0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "BRAND") != null ? Build.BRAND : null;
            s0073s0073s0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "USER") != null ? Build.USER : null;
            ss00730073s0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "ID") != null ? Build.ID : null;
            s007300730073s0073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "SERIAL") != null ? Build.SERIAL : null;
            ssss00730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "DEVICE") != null ? Build.DEVICE : null;
            s0073ss00730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "MODEL") != null ? Build.MODEL : null;
            ss0073s00730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "DISPLAY") != null ? Build.DISPLAY : null;
            s00730073s00730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "PRODUCT") != null ? Build.PRODUCT : null;
            sss007300730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "MANUFACTURER") != null ? Build.MANUFACTURER : null;
            s0073s007300730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "BOARD") != null ? Build.BOARD : null;
            ss0073007300730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "CPU_ABI") != null ? Build.CPU_ABI : null;
            s00730073007300730073s = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "CPU_ABI2") != null ? Build.CPU_ABI2 : null;
            ssssss0073 = fieldWw007700770077007700770077 != null ? (String[]) jjxjxjx.ssss0073sss(null, fieldWw007700770077007700770077) : null;
        }

        private nnnnnln() {
        }

        public static String o006F006F006Fo006F006F() {
            Object objS0073ss0073sss;
            Method method = s0073ssss0073;
            if (method == null || (objS0073ss0073sss = jjxjxjx.s0073ss0073sss(null, method, new Object[0])) == null) {
                return null;
            }
            return (String) objS0073ss0073sss;
        }
    }

    public static class nnnnnnl {
        public static final Field w007700770077w0077w;
        public static final Field ww00770077w0077w;

        static {
            Class clsWww00770077007700770077 = jjxjxjx.www00770077007700770077(jjxjxjx.jxxjxjx.STRUCT_STAT);
            ww00770077w0077w = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "st_ctime");
            w007700770077w0077w = jjxjxjx.ww007700770077007700770077(clsWww00770077007700770077, "st_mtime");
        }

        private nnnnnnl() {
        }
    }

    private nnlllnn() {
    }
}
