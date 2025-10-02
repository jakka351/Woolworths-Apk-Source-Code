package io.branch.referral;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BranchJsonConfig {
    public static BranchJsonConfig b;

    /* renamed from: a, reason: collision with root package name */
    public JSONObject f23851a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BranchJsonKey {
        public static final BranchJsonKey d;
        public static final BranchJsonKey e;
        public static final BranchJsonKey f;
        public static final BranchJsonKey g;
        public static final BranchJsonKey h;
        public static final BranchJsonKey i;
        public static final /* synthetic */ BranchJsonKey[] j;

        static {
            BranchJsonKey branchJsonKey = new BranchJsonKey("branchKey", 0);
            d = branchJsonKey;
            BranchJsonKey branchJsonKey2 = new BranchJsonKey("testKey", 1);
            e = branchJsonKey2;
            BranchJsonKey branchJsonKey3 = new BranchJsonKey("liveKey", 2);
            f = branchJsonKey3;
            BranchJsonKey branchJsonKey4 = new BranchJsonKey("useTestInstance", 3);
            g = branchJsonKey4;
            BranchJsonKey branchJsonKey5 = new BranchJsonKey("enableLogging", 4);
            h = branchJsonKey5;
            BranchJsonKey branchJsonKey6 = new BranchJsonKey("deferInitForPluginRuntime", 5);
            i = branchJsonKey6;
            j = new BranchJsonKey[]{branchJsonKey, branchJsonKey2, branchJsonKey3, branchJsonKey4, branchJsonKey5, branchJsonKey6, new BranchJsonKey("apiUrl", 6), new BranchJsonKey("fbAppId", 7)};
        }

        public static BranchJsonKey valueOf(String str) {
            return (BranchJsonKey) Enum.valueOf(BranchJsonKey.class, str);
        }

        public static BranchJsonKey[] values() {
            return (BranchJsonKey[]) j.clone();
        }
    }

    public static BranchJsonConfig a(Context context) throws IOException {
        if (b == null) {
            BranchJsonConfig branchJsonConfig = new BranchJsonConfig();
            branchJsonConfig.f23851a = null;
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open("branch.json")));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    branchJsonConfig.f23851a = new JSONObject(sb.toString());
                } catch (IOException e) {
                    Log.e("BranchJsonConfig", "Error loading branch.json: " + e.getMessage());
                } catch (JSONException e2) {
                    Log.e("BranchJsonConfig", "Error parsing branch.json: " + e2.getMessage());
                }
            } catch (FileNotFoundException unused) {
            }
            b = branchJsonConfig;
        }
        return b;
    }

    public final Boolean b() {
        if (!c(BranchJsonKey.g)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.f23851a.getBoolean("useTestInstance"));
        } catch (JSONException e) {
            Log.e("BranchJsonConfig", "Error parsing branch.json: " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    public final boolean c(BranchJsonKey branchJsonKey) {
        JSONObject jSONObject = this.f23851a;
        return jSONObject != null && jSONObject.has(branchJsonKey.toString());
    }
}
