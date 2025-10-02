package com.google.firebase.installations.local;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.local.AutoValue_PersistedInstallationEntry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class PersistedInstallation {

    /* renamed from: a, reason: collision with root package name */
    public File f15621a;
    public final FirebaseApp b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RegistrationStatus {
        public static final RegistrationStatus d;
        public static final RegistrationStatus e;
        public static final RegistrationStatus f;
        public static final RegistrationStatus g;
        public static final RegistrationStatus h;
        public static final /* synthetic */ RegistrationStatus[] i;

        static {
            RegistrationStatus registrationStatus = new RegistrationStatus("ATTEMPT_MIGRATION", 0);
            d = registrationStatus;
            RegistrationStatus registrationStatus2 = new RegistrationStatus("NOT_GENERATED", 1);
            e = registrationStatus2;
            RegistrationStatus registrationStatus3 = new RegistrationStatus("UNREGISTERED", 2);
            f = registrationStatus3;
            RegistrationStatus registrationStatus4 = new RegistrationStatus("REGISTERED", 3);
            g = registrationStatus4;
            RegistrationStatus registrationStatus5 = new RegistrationStatus("REGISTER_ERROR", 4);
            h = registrationStatus5;
            i = new RegistrationStatus[]{registrationStatus, registrationStatus2, registrationStatus3, registrationStatus4, registrationStatus5};
        }

        public static RegistrationStatus valueOf(String str) {
            return (RegistrationStatus) Enum.valueOf(RegistrationStatus.class, str);
        }

        public static RegistrationStatus[] values() {
            return (RegistrationStatus[]) i.clone();
        }
    }

    public PersistedInstallation(FirebaseApp firebaseApp) {
        this.b = firebaseApp;
    }

    public final File a() {
        if (this.f15621a == null) {
            synchronized (this) {
                try {
                    if (this.f15621a == null) {
                        FirebaseApp firebaseApp = this.b;
                        firebaseApp.a();
                        this.f15621a = new File(firebaseApp.f15169a.getFilesDir(), "PersistedInstallation." + this.b.f() + ".json");
                    }
                } finally {
                }
            }
        }
        return this.f15621a;
    }

    public final void b(PersistedInstallationEntry persistedInstallationEntry) throws JSONException, IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", persistedInstallationEntry.c());
            jSONObject.put("Status", persistedInstallationEntry.f().ordinal());
            jSONObject.put("AuthToken", persistedInstallationEntry.a());
            jSONObject.put("RefreshToken", persistedInstallationEntry.e());
            jSONObject.put("TokenCreationEpochInSecs", persistedInstallationEntry.g());
            jSONObject.put("ExpiresInSecs", persistedInstallationEntry.b());
            jSONObject.put("FisError", persistedInstallationEntry.d());
            FirebaseApp firebaseApp = this.b;
            firebaseApp.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.f15169a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final PersistedInstallationEntry c() throws IOException {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int i = fileInputStream.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = PersistedInstallationEntry.f15622a;
        AutoValue_PersistedInstallationEntry.Builder builder = new AutoValue_PersistedInstallationEntry.Builder();
        builder.g(0L);
        builder.b = RegistrationStatus.d;
        builder.c(0L);
        builder.f15619a = strOptString;
        builder.f(RegistrationStatus.values()[iOptInt]);
        builder.c = strOptString2;
        builder.d = strOptString3;
        builder.g(jOptLong);
        builder.c(jOptLong2);
        builder.g = strOptString4;
        return builder.a();
    }
}
