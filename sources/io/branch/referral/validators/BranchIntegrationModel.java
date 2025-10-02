package io.branch.referral.validators;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.branch.referral.BranchAsyncTask;
import io.branch.referral.BranchLogger;
import io.branch.referral.BranchUtil;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class BranchIntegrationModel {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f23874a = new ArrayList();

    public class getDeepLinkSchemeTasks extends BranchAsyncTask<Context, Void, JSONObject> {
        @Override // android.os.AsyncTask
        public final Object doInBackground(Object[] objArr) {
            return BranchUtil.c(((Context[]) objArr)[0]);
        }
    }

    public BranchIntegrationModel(Context context) throws PackageManager.NameNotFoundException {
        JSONObject jSONObject;
        context.getPackageName();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                bundle.getString("io.branch.sdk.BranchKey");
                applicationInfo.metaData.getString("io.branch.sdk.BranchKey.test");
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        try {
            jSONObject = (JSONObject) new getDeepLinkSchemeTasks().a(context).get(2500L, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            BranchLogger.a(e2.getMessage());
            jSONObject = null;
        }
        if (jSONObject != null) {
            jSONObject.optJSONObject("uri_scheme");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("app_links");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    this.f23874a.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        }
    }
}
