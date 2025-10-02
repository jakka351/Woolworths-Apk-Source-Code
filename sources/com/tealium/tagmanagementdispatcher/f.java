package com.tealium.tagmanagementdispatcher;

import com.tealium.remotecommands.RemoteCommand;
import kotlin.Unit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements RemoteCommand.ResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f19211a;

    public f(e eVar) {
        this.f19211a = eVar;
    }

    @Override // com.tealium.remotecommands.RemoteCommand.ResponseHandler
    public final void a(RemoteCommand.Response response) {
        Unit unit;
        String str = response.b;
        String str2 = response.c;
        String strM = "";
        if (str2 != null) {
            String str3 = response.f;
            if (str3 != null) {
                int i = response.e;
                String strQuote = JSONObject.quote(str3);
                StringBuilder sbV = YU.a.v("try {\tutag.mobile.remote_api.response[\"", str, "\"][\"", str2, "\"](");
                sbV.append(i);
                sbV.append(", ");
                sbV.append(strQuote);
                sbV.append(");} catch(err) {\tconsole.error(err);};");
                strM = sbV.toString();
                unit = Unit.f24250a;
            } else {
                unit = null;
            }
            if (unit == null) {
                strM = YU.a.m(YU.a.v("try {\tutag.mobile.remote_api.response[\"", str, "\"][\"", str2, "\"]("), response.e, ");} catch(err) {\tconsole.error(err);};");
            }
        }
        if (strM.length() > 0) {
            this.f19211a.c.a(strM);
        }
    }
}
