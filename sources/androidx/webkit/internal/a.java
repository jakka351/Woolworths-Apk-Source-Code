package androidx.webkit.internal;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.Preference;
import androidx.work.impl.utils.IdGenerator;
import com.adobe.marketing.mobile.internal.eventhub.EventHub;
import java.net.URLEncoder;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty0;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                return new JavaScriptReplyProxyImpl((JsReplyProxyBoundaryInterface) obj);
            case 1:
                WebViewRenderProcessImpl webViewRenderProcessImpl = new WebViewRenderProcessImpl();
                webViewRenderProcessImpl.f3863a = (WebViewRendererBoundaryInterface) obj;
                return webViewRenderProcessImpl;
            case 2:
                WorkDatabase workDatabase = ((IdGenerator) obj).f3998a;
                Long lB = workDatabase.u().b("next_alarm_manager_id");
                int iLongValue = lB != null ? (int) lB.longValue() : 0;
                workDatabase.u().a(new Preference("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
            case 3:
                return (Boolean) ((KProperty0) obj).invoke();
            case 4:
                return URLEncoder.encode((String) obj, "utf-8");
            default:
                EventHub this$0 = (EventHub) obj;
                EventHub eventHub = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                return this$0.l;
        }
    }
}
