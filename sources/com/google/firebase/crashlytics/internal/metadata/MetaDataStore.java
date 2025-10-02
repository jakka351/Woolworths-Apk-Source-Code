package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.salesforce.marketingcloud.storage.db.i;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class MetaDataStore {
    public static final Charset b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final FileStore f15292a;

    /* renamed from: com.google.firebase.crashlytics.internal.metadata.MetaDataStore$1, reason: invalid class name */
    class AnonymousClass1 extends JSONObject {
    }

    public MetaDataStore(FileStore fileStore) {
        this.f15292a = fileStore;
    }

    public static HashMap a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static ArrayList b(String str) throws JSONException {
        JSONArray jSONArray = new JSONObject(str).getJSONArray("rolloutsState");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = jSONArray.getString(i);
            try {
                arrayList.add(RolloutAssignment.a(string));
            } catch (Exception e) {
                Logger.f15258a.f(e, "Failed de-serializing rollouts state. " + string);
            }
        }
        return arrayList;
    }

    public static String e(List list) {
        HashMap map = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            try {
                jSONArray.put(new JSONObject(RolloutAssignment.f15298a.encode(list.get(i))));
            } catch (JSONException e) {
                Logger.f15258a.f(e, "Exception parsing rollout assignment!");
            }
        }
        map.put("rolloutsState", jSONArray);
        return new JSONObject(map).toString();
    }

    public static void f(File file) {
        if (file.exists() && file.delete()) {
            Logger.f15258a.d("Deleted corrupt file: " + file.getAbsolutePath());
        }
    }

    public static void g(File file, String str) {
        if (file.exists() && file.delete()) {
            Logger.f15258a.d("Deleted corrupt file: " + file.getAbsolutePath() + "\nReason: " + str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.Closeable] */
    public final Map c(String str, boolean z) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        FileStore fileStore = this.f15292a;
        File fileB = z ? fileStore.b(str, "internal-keys") : fileStore.b(str, i.a.n);
        if (!fileB.exists() || fileB.length() == 0) {
            g(fileB, YU.a.A("The file has a length of zero for session: ", str));
            return Collections.EMPTY_MAP;
        }
        try {
            try {
                fileInputStream = new FileInputStream(fileB);
            } catch (Exception e2) {
                fileInputStream = null;
                e = e2;
            } catch (Throwable th2) {
                ?? r1 = 0;
                th = th2;
                CommonUtils.b(r1, "Failed to close user metadata file.");
                throw th;
            }
            try {
                HashMap mapA = a(CommonUtils.i(fileInputStream));
                CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                return mapA;
            } catch (Exception e3) {
                e = e3;
                Logger.f15258a.f(e, "Error deserializing user metadata.");
                f(fileB);
                CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                return Collections.EMPTY_MAP;
            }
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.b(r1, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final String d(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileB = this.f15292a.b(str, "user-data");
        boolean zExists = fileB.exists();
        Logger logger = Logger.f15258a;
        FileInputStream fileInputStream2 = null;
        if (!zExists || fileB.length() == 0) {
            logger.b("No userId set for session " + str, null);
            f(fileB);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileB);
        } catch (Exception e) {
            e = e;
            fileInputStream = null;
        } catch (Throwable th) {
            th = th;
            CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
        try {
            try {
                JSONObject jSONObject = new JSONObject(CommonUtils.i(fileInputStream));
                String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                logger.b("Loaded userId " + strOptString + " for session " + str, null);
                CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
                return strOptString;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                CommonUtils.b(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            logger.f(e, "Error deserializing user metadata.");
            f(fileB);
            CommonUtils.b(fileInputStream, "Failed to close user metadata file.");
            return null;
        }
    }

    public final void h(String str, Map map, boolean z) throws Throwable {
        FileStore fileStore = this.f15292a;
        File fileB = z ? fileStore.b(str, "internal-keys") : fileStore.b(str, i.a.n);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                String string = new JSONObject(map).toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2, "Failed to close key/value metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.f15258a.f(e, "Error serializing key/value metadata.");
                    f(fileB);
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter, "Failed to close key/value metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final void i(String str, List list) throws Throwable {
        BufferedWriter bufferedWriter;
        Throwable th;
        Exception e;
        String strE;
        File fileB = this.f15292a.b(str, "rollouts-state");
        if (list.isEmpty()) {
            g(fileB, YU.a.A("Rollout state is empty for session: ", str));
            return;
        }
        try {
            strE = e(list);
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
        } catch (Exception e2) {
            bufferedWriter = null;
            e = e2;
        } catch (Throwable th2) {
            bufferedWriter = null;
            th = th2;
            CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
            throw th;
        }
        try {
            try {
                bufferedWriter.write(strE);
                bufferedWriter.flush();
                CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
            } catch (Throwable th3) {
                th = th3;
                CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Logger.f15258a.f(e, "Error serializing rollouts state.");
            f(fileB);
            CommonUtils.b(bufferedWriter, "Failed to close rollouts state file.");
        }
    }

    public final void j(String str, String str2) throws Throwable {
        File fileB = this.f15292a.b(str, "user-data");
        BufferedWriter bufferedWriter = null;
        try {
            try {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                anonymousClass1.put("userId", str2);
                String string = anonymousClass1.toString();
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileB), b));
                try {
                    bufferedWriter2.write(string);
                    bufferedWriter2.flush();
                    CommonUtils.b(bufferedWriter2, "Failed to close user metadata file.");
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    Logger.f15258a.f(e, "Error serializing user metadata.");
                    CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    CommonUtils.b(bufferedWriter, "Failed to close user metadata file.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
