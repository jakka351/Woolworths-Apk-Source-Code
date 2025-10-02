package com.tealium.remotecommands;

import com.tealium.remotecommands.RemoteCommand;
import com.tealium.tagmanagementdispatcher.f;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Pattern;
import me.oriient.positioningengine.ondevice.ml.MlModel;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class RemoteCommandRequest {
    public static final Pattern d = Pattern.compile("^tealium://.+", 2);

    /* renamed from: a, reason: collision with root package name */
    public final String f19202a;
    public final JSONObject b;
    public final RemoteCommand.Response c;

    public RemoteCommandRequest(f fVar, String str) throws UnsupportedEncodingException {
        JSONObject jSONObject;
        if (!d.matcher(str).matches()) {
            throw new IllegalArgumentException("Given url must not be null.");
        }
        int iIndexOf = str.indexOf("?request=");
        if (iIndexOf == -1) {
            this.f19202a = str.substring(10).toLowerCase(Locale.ROOT);
            jSONObject = null;
        } else {
            this.f19202a = str.substring(10, iIndexOf).toLowerCase(Locale.ROOT);
            try {
                String strDecode = URLDecoder.decode(str.substring(iIndexOf + 9), "UTF-8");
                jSONObject = strDecode.length() == 0 ? new JSONObject() : new JSONObject(strDecode);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException(e);
            }
        }
        String str2 = this.f19202a;
        if (!((str2 == null || str2.length() == 0) ? false : Pattern.matches("^[\\w-]*$", str2))) {
            throw new IllegalArgumentException("The command id provided by the request is not a valid command id.");
        }
        if (jSONObject == null) {
            this.b = null;
        } else {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(MlModel.MODEL_FILE_SUFFIX);
            strOptString = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("response_id", null) : null;
            this.b = jSONObject.optJSONObject("payload");
        }
        this.c = new RemoteCommand.Response(fVar, this.f19202a, strOptString, this.b);
    }

    public RemoteCommandRequest(String str, JSONObject jSONObject) {
        this.f19202a = str.toLowerCase(Locale.ROOT);
        this.b = jSONObject;
        this.c = new RemoteCommand.Response(null, str, null, jSONObject);
    }
}
