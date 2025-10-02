package io.branch.coroutines;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.BranchLogger;
import java.io.IOException;
import java.net.URLDecoder;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.SupervisorKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"Branch-SDK_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InstallReferrersKt {
    public static final void a(Context context, Continuation continuation) {
        SupervisorKt.c(new InstallReferrersKt$fetchLatestInstallReferrer$2(context, null), continuation);
    }

    public static final InstallReferrerResult b(Context context, String str) throws IOException {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse(str), new String[]{"install_referrer", "is_ct", "actual_timestamp"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToFirst()) {
                BranchLogger.a("getMetaInstallReferrerDetails - cursor is empty or null for provider " + str);
                cursorQuery.close();
                return null;
            }
            int columnIndex = cursorQuery.getColumnIndex("actual_timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("is_ct");
            int columnIndex3 = cursorQuery.getColumnIndex("install_referrer");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                boolean z = cursorQuery.getInt(columnIndex2) == 1;
                String string = cursorQuery.getString(columnIndex3);
                try {
                    String strDecode = URLDecoder.decode(string, "UTF-8");
                    Intrinsics.g(strDecode, "decode(installReferrerString, \"UTF-8\")");
                    String strZ = StringsKt.Z(strDecode, "utm_content=", "");
                    if (strZ.length() == 0) {
                        BranchLogger.f("getMetaInstallReferrerDetails - utm_content is empty for provider " + str);
                        cursorQuery.close();
                        return null;
                    }
                    StringBuilder sb = new StringBuilder("getMetaInstallReferrerDetails - Got Meta Install Referrer as ");
                    sb.append(z ? "click-through" : "view-through");
                    sb.append(" from provider ");
                    sb.append(str);
                    sb.append(": ");
                    sb.append(string);
                    String message = sb.toString();
                    Intrinsics.h(message, "message");
                    if (BranchLogger.f23853a && message.length() > 0) {
                        Log.i("BranchSDK", message);
                    }
                    try {
                        InstallReferrerResult installReferrerResult = new InstallReferrerResult("Meta", string, new JSONObject(strZ).getLong("t"), z, j);
                        cursorQuery.close();
                        return installReferrerResult;
                    } catch (JSONException e) {
                        BranchLogger.f("getMetaInstallReferrerDetails - JSONException in queryProvider: " + e);
                        cursorQuery.close();
                        return null;
                    }
                } catch (IllegalArgumentException e2) {
                    BranchLogger.f("getMetaInstallReferrerDetails - Error decoding URL: " + e2);
                    cursorQuery.close();
                    return null;
                }
            }
            BranchLogger.f("getMetaInstallReferrerDetails - Required column not found in cursor for provider " + str);
            cursorQuery.close();
            return null;
        } finally {
        }
    }
}
