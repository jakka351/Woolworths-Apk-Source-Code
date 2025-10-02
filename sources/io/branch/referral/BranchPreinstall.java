package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.Defines;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class BranchPreinstall {
    public static void a(JSONObject jSONObject, Branch branch, Context context) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                if (next.equals("apps") && (jSONObject.get(next) instanceof JSONObject) && jSONObject.getJSONObject(next).get(SystemObserver.f(context)) != null) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(next).getJSONObject(SystemObserver.f(context));
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        Defines.PreinstallKey preinstallKey = Defines.PreinstallKey.campaign;
                        if (next2.equals(preinstallKey.a()) && TextUtils.isEmpty(PrefHelper.d(context).c(preinstallKey.a()))) {
                            String string = jSONObject2.get(next2).toString();
                            branch.getClass();
                            String strA = preinstallKey.a();
                            PrefHelper prefHelper = branch.b;
                            prefHelper.getClass();
                            if (strA != null) {
                                try {
                                    prefHelper.d.putOpt(strA, string);
                                } catch (JSONException e) {
                                    BranchLogger.a(e.getMessage());
                                }
                            }
                        } else {
                            Defines.PreinstallKey preinstallKey2 = Defines.PreinstallKey.partner;
                            if (next2.equals(preinstallKey2.a()) && TextUtils.isEmpty(PrefHelper.d(context).c(preinstallKey2.a()))) {
                                String string2 = jSONObject2.get(next2).toString();
                                branch.getClass();
                                String strA2 = preinstallKey2.a();
                                PrefHelper prefHelper2 = branch.b;
                                prefHelper2.getClass();
                                if (strA2 != null) {
                                    try {
                                        prefHelper2.d.putOpt(strA2, string2);
                                    } catch (JSONException e2) {
                                        BranchLogger.a(e2.getMessage());
                                    }
                                }
                            } else {
                                String string3 = jSONObject2.get(next2).toString();
                                JSONObject jSONObject3 = branch.b.c;
                                if (jSONObject3.has(next2) && string3 == null) {
                                    jSONObject3.remove(next2);
                                }
                                try {
                                    jSONObject3.put(next2, string3);
                                } catch (JSONException unused) {
                                }
                            }
                        }
                    }
                }
            } catch (JSONException e3) {
                BranchLogger.a(e3.getMessage());
            }
        }
    }

    public static void b(final Branch branch, final Context context) {
        if (branch != null) {
            final String str = null;
            try {
                str = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, "io.branch.preinstall.apps.path");
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            new Thread(new Runnable() { // from class: io.branch.referral.BranchPreinstall.1
                @Override // java.lang.Runnable
                public final void run() throws IOException {
                    try {
                        StringBuilder sb = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(str)));
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            } else {
                                sb.append(line);
                            }
                        }
                        bufferedReader.close();
                        JSONObject jSONObject = new JSONObject(sb.toString().trim());
                        if (TextUtils.isEmpty(jSONObject.toString())) {
                            throw new FileNotFoundException();
                        }
                        BranchPreinstall.a(jSONObject, branch, context);
                    } catch (FileNotFoundException e) {
                        BranchLogger.a(e.getMessage());
                    } catch (IOException e2) {
                        BranchLogger.a(e2.getMessage());
                    } catch (JSONException e3) {
                        BranchLogger.a(e3.getMessage());
                    }
                }
            }).start();
        }
    }

    public static void c(Context context, HashMap map) {
        Branch branchI = Branch.i();
        PrefHelper prefHelperD = PrefHelper.d(context);
        Defines.PreinstallKey preinstallKey = Defines.PreinstallKey.partner;
        if (TextUtils.isEmpty(prefHelperD.c(preinstallKey.a()))) {
            Defines.PreinstallKey preinstallKey2 = Defines.PreinstallKey.campaign;
            if (TextUtils.isEmpty(prefHelperD.c(preinstallKey2.a()))) {
                if (!TextUtils.isEmpty((CharSequence) map.get("utm_campaign"))) {
                    String str = (String) map.get("utm_campaign");
                    branchI.getClass();
                    String strA = preinstallKey2.a();
                    PrefHelper prefHelper = branchI.b;
                    prefHelper.getClass();
                    if (strA != null) {
                        try {
                            prefHelper.d.putOpt(strA, str);
                        } catch (JSONException e) {
                            BranchLogger.a(e.getMessage());
                        }
                    }
                }
                if (TextUtils.isEmpty((CharSequence) map.get("utm_medium"))) {
                    return;
                }
                String str2 = (String) map.get("utm_medium");
                branchI.getClass();
                String strA2 = preinstallKey.a();
                PrefHelper prefHelper2 = branchI.b;
                prefHelper2.getClass();
                if (strA2 == null) {
                    return;
                }
                try {
                    prefHelper2.d.putOpt(strA2, str2);
                } catch (JSONException e2) {
                    BranchLogger.a(e2.getMessage());
                }
            }
        }
    }
}
