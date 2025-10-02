package com.tealium.remotecommands;

import com.google.android.gms.identity.intents.AddressConstants;
import com.tealium.tagmanagementdispatcher.f;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class RemoteCommand {

    /* renamed from: a, reason: collision with root package name */
    public final String f19200a;
    public final String b;
    public RemoteCommandContext c;

    public static class Response {

        /* renamed from: a, reason: collision with root package name */
        public final ResponseHandler f19201a;
        public final String b;
        public final String c;
        public final JSONObject d;
        public int e;
        public String f;
        public boolean g;

        public Response(f fVar, String str, String str2, JSONObject jSONObject) {
            if (str == null) {
                throw new IllegalArgumentException("mCommandId must not be null.");
            }
            this.f19201a = fVar;
            this.b = str;
            this.c = str2;
            this.d = jSONObject == null ? new JSONObject() : jSONObject;
            this.e = 200;
            this.f = null;
            this.g = false;
        }

        public final void a() {
            if (this.g) {
                throw new IllegalStateException("Response already sent.");
            }
            this.g = true;
            ResponseHandler responseHandler = this.f19201a;
            if (responseHandler != null) {
                responseHandler.a(this);
            }
        }

        public final void b(String str) {
            if (this.g) {
                throw new IllegalStateException("Response already sent.");
            }
            this.f = str;
        }

        public final void c(int i) {
            if (this.g) {
                throw new IllegalStateException("Response already sent.");
            }
            this.e = i;
        }
    }

    public interface ResponseHandler {
        void a(Response response);
    }

    public RemoteCommand(String str, String str2, int i) {
        if (!(str.length() == 0 ? false : Pattern.matches("^[\\w-]*$", str))) {
            throw new IllegalArgumentException("Invalid remote command name.");
        }
        this.f19200a = str.toLowerCase(Locale.ROOT);
        this.b = str2;
    }

    public final void a(RemoteCommandRequest remoteCommandRequest) {
        Response response = remoteCommandRequest.c;
        try {
            b(response);
        } catch (Throwable th) {
            response.c(AddressConstants.ErrorCodes.ERROR_CODE_NO_APPLICABLE_ADDRESSES);
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            response.b(stringWriter.toString());
            response.a();
        }
    }

    public abstract void b(Response response);

    public void c(RemoteCommandContext remoteCommandContext) {
        this.c = remoteCommandContext;
    }
}
